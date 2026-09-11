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
    public final int f15002a;
    public boolean f15003b;
    public Object f15004c;
    public final Object d;

    public h(Object obj, Object obj2, boolean z10, int i10) {
        this.f15002a = i10;
        this.d = obj;
        this.f15004c = obj2;
        this.f15003b = z10;
    }

    @Override
    public final void run() {
        switch (this.f15002a) {
            case 0:
                o oVar = (o) this.d;
                ArrayList arrayList = (ArrayList) this.f15004c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    oVar.T(iVar.f45796a, iVar, this.f15003b);
                }
                arrayList.clear();
                oVar.f45809u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f20148e == this) {
                    actionBarLayout.f20148e = null;
                    ((n2) this.f15004c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f15003b);
                    return;
                }
                return;
            default:
                try {
                    ((yc.i) this.d).f49961a.bind(new InetSocketAddress(61578));
                    this.f15003b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f49961a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar2 = (yc.i) this.d;
                            iVar2.f49963c.C(new yc.a(iVar2, inputStream, accept));
                        } catch (IOException e7) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e7);
                        }
                    } while (!((yc.i) this.d).f49961a.isClosed());
                    return;
                } catch (IOException e10) {
                    this.f15004c = e10;
                    return;
                }
        }
    }

    public h(yc.i iVar) {
        this.f15002a = 2;
        this.d = iVar;
        this.f15003b = false;
    }
}
