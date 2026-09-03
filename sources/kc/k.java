package kc;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p2;
import xh.n;
public final class k implements Runnable {
    public final int f11086a;
    public boolean f11087b;
    public Object f11088c;
    public final Object d;

    public k(Object obj, Object obj2, boolean z4, int i10) {
        this.f11086a = i10;
        this.d = obj;
        this.f11088c = obj2;
        this.f11087b = z4;
    }

    @Override
    public final void run() {
        switch (this.f11086a) {
            case 0:
                try {
                    ((l) this.d).f11089a.bind(new InetSocketAddress(61578));
                    this.f11087b = true;
                    do {
                        try {
                            Socket accept = ((l) this.d).f11089a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            l lVar = (l) this.d;
                            lVar.f11091c.B(new a(lVar, inputStream, accept));
                        } catch (IOException e6) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e6);
                        }
                    } while (!((l) this.d).f11089a.isClosed());
                    return;
                } catch (IOException e10) {
                    this.f11088c = e10;
                    return;
                }
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f21121e == this) {
                    actionBarLayout.f21121e = null;
                    ((p2) this.f11088c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f11087b);
                    return;
                }
                return;
            default:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f11088c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2.k kVar = (f2.k) obj;
                    nVar.T(kVar.f5839a, kVar, this.f11087b);
                }
                arrayList.clear();
                nVar.f5858u.remove(arrayList);
                return;
        }
    }

    public k(l lVar) {
        this.f11086a = 0;
        this.d = lVar;
        this.f11087b = false;
    }
}
