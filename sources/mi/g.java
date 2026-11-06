package mi;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
public final class g implements Runnable {
    public final int f20072a;
    public boolean f20073b;
    public Object f20074c;
    public final Object d;

    public g(Object obj, Object obj2, boolean z9, int i7) {
        this.f20072a = i7;
        this.d = obj;
        this.f20074c = obj2;
        this.f20073b = z9;
    }

    @Override
    public final void run() {
        switch (this.f20072a) {
            case 0:
                l lVar = (l) this.d;
                ArrayList arrayList = (ArrayList) this.f20074c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.j jVar = (v4.j) obj;
                    lVar.T(jVar.f57001a, jVar, this.f20073b);
                }
                arrayList.clear();
                lVar.f57014u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f27237e == this) {
                    actionBarLayout.f27237e = null;
                    ((f2) this.f20074c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f20073b);
                    return;
                }
                return;
            default:
                try {
                    ((yc.i) this.d).f59294a.bind(new InetSocketAddress(61578));
                    this.f20073b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f59294a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.f59296c.D(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).f59294a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f20074c = e11;
                    return;
                }
        }
    }

    public g(yc.i iVar) {
        this.f20072a = 2;
        this.d = iVar;
        this.f20073b = false;
    }
}
