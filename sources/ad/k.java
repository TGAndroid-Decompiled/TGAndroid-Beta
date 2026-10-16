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
    public final int f534a;
    public boolean f535b;
    public Object f536c;
    public final Object d;

    public k(Object obj, Object obj2, boolean z10, int i10) {
        this.f534a = i10;
        this.d = obj;
        this.f536c = obj2;
        this.f535b = z10;
    }

    @Override
    public final void run() {
        switch (this.f534a) {
            case 0:
                try {
                    ((l) this.d).f537a.bind(new InetSocketAddress(61578));
                    this.f535b = true;
                    do {
                        try {
                            Socket accept = ((l) this.d).f537a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            l lVar = (l) this.d;
                            lVar.f539c.C(new a(lVar, inputStream, accept));
                        } catch (IOException e) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((l) this.d).f537a.isClosed());
                    return;
                } catch (IOException e7) {
                    this.f536c = e7;
                    return;
                }
            case 1:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f536c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.j jVar = (s4.j) obj;
                    nVar.T(jVar.f44898a, jVar, this.f535b);
                }
                arrayList.clear();
                nVar.f44907u.remove(arrayList);
                return;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((m2) this.f536c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f535b);
                    return;
                }
                return;
        }
    }

    public k(l lVar) {
        this.f534a = 0;
        this.d = lVar;
        this.f535b = false;
    }
}
