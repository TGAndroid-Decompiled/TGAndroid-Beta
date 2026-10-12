package ad;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import ki.n;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m2;
public final class k implements Runnable {
    public final int f530a;
    public boolean f531b;
    public Object f532c;
    public final Object d;

    public k(Object obj, Object obj2, boolean z10, int i10) {
        this.f530a = i10;
        this.d = obj;
        this.f532c = obj2;
        this.f531b = z10;
    }

    @Override
    public final void run() {
        switch (this.f530a) {
            case 0:
                try {
                    ((l) this.d).f533a.bind(new InetSocketAddress(61578));
                    this.f531b = true;
                    do {
                        try {
                            Socket accept = ((l) this.d).f533a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            l lVar = (l) this.d;
                            lVar.f535c.C(new a(lVar, inputStream, accept));
                        } catch (IOException e) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((l) this.d).f533a.isClosed());
                    return;
                } catch (IOException e7) {
                    this.f532c = e7;
                    return;
                }
            case 1:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f532c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.j jVar = (s4.j) obj;
                    nVar.T(jVar.f44898a, jVar, this.f531b);
                }
                arrayList.clear();
                nVar.f44907u.remove(arrayList);
                return;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((m2) this.f532c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f531b);
                    return;
                }
                return;
        }
    }

    public k(l lVar) {
        this.f530a = 0;
        this.d = lVar;
        this.f531b = false;
    }
}
