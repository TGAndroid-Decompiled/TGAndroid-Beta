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
    public final int f20080a;
    public boolean f20081b;
    public Object f20082c;
    public final Object d;

    public g(Object obj, Object obj2, boolean z9, int i7) {
        this.f20080a = i7;
        this.d = obj;
        this.f20082c = obj2;
        this.f20081b = z9;
    }

    @Override
    public final void run() {
        switch (this.f20080a) {
            case 0:
                l lVar = (l) this.d;
                ArrayList arrayList = (ArrayList) this.f20082c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.j jVar = (v4.j) obj;
                    lVar.T(jVar.f57101a, jVar, this.f20081b);
                }
                arrayList.clear();
                lVar.f57114u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f27245e == this) {
                    actionBarLayout.f27245e = null;
                    ((f2) this.f20082c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f20081b);
                    return;
                }
                return;
            default:
                try {
                    ((yc.i) this.d).f59396a.bind(new InetSocketAddress(61578));
                    this.f20081b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f59396a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.f59398c.D(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).f59396a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f20082c = e11;
                    return;
                }
        }
    }

    public g(yc.i iVar) {
        this.f20080a = 2;
        this.d = iVar;
        this.f20081b = false;
    }
}
