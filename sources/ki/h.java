package ki;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
public final class h implements Runnable {
    public final int f15028a;
    public boolean f15029b;
    public Object f15030c;
    public final Object d;

    public h(Object obj, Object obj2, boolean z10, int i10) {
        this.f15028a = i10;
        this.d = obj;
        this.f15030c = obj2;
        this.f15029b = z10;
    }

    @Override
    public final void run() {
        switch (this.f15028a) {
            case 0:
                o oVar = (o) this.d;
                ArrayList arrayList = (ArrayList) this.f15030c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    oVar.T(iVar.f45824a, iVar, this.f15029b);
                }
                arrayList.clear();
                oVar.f45837u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f20175e == this) {
                    actionBarLayout.f20175e = null;
                    ((n2) this.f15030c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f15029b);
                    return;
                }
                return;
            default:
                try {
                    ((yc.i) this.d).f49990a.bind(new InetSocketAddress(61578));
                    this.f15029b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f49990a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar2 = (yc.i) this.d;
                            iVar2.f49992c.C(new yc.a(iVar2, inputStream, accept));
                        } catch (IOException e7) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e7);
                        }
                    } while (!((yc.i) this.d).f49990a.isClosed());
                    return;
                } catch (IOException e10) {
                    this.f15030c = e10;
                    return;
                }
        }
    }

    public h(yc.i iVar) {
        this.f15028a = 2;
        this.d = iVar;
        this.f15029b = false;
    }
}
