package ji;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o2;
public final class g implements Runnable {
    public final int f13059a;
    public boolean f13060b;
    public Object f13061c;
    public final Object d;

    public g(Object obj, Object obj2, boolean z10, int i10) {
        this.f13059a = i10;
        this.d = obj;
        this.f13061c = obj2;
        this.f13060b = z10;
    }

    @Override
    public final void run() {
        switch (this.f13059a) {
            case 0:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f13061c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    nVar.T(iVar.f43056a, iVar, this.f13060b);
                }
                arrayList.clear();
                nVar.f43068u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((o2) this.f13061c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f13060b);
                    return;
                }
                return;
            default:
                try {
                    ((yc.i) this.d).f47021a.bind(new InetSocketAddress(61578));
                    this.f13060b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f47021a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar2 = (yc.i) this.d;
                            iVar2.f47023c.C(new yc.a(iVar2, inputStream, accept));
                        } catch (IOException e) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((yc.i) this.d).f47021a.isClosed());
                    return;
                } catch (IOException e7) {
                    this.f13061c = e7;
                    return;
                }
        }
    }

    public g(yc.i iVar) {
        this.f13059a = 2;
        this.d = iVar;
        this.f13060b = false;
    }
}
