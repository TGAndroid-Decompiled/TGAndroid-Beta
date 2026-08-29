package ic;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o2;
import uh.m;
public final class k implements Runnable {
    public final int f8866a;
    public boolean f8867b;
    public Object f8868c;
    public final Object d;

    public k(Object obj, Object obj2, boolean z10, int i10) {
        this.f8866a = i10;
        this.d = obj;
        this.f8868c = obj2;
        this.f8867b = z10;
    }

    @Override
    public final void run() {
        switch (this.f8866a) {
            case 0:
                try {
                    ((l) this.d).f8869a.bind(new InetSocketAddress(61578));
                    this.f8867b = true;
                    do {
                        try {
                            Socket accept = ((l) this.d).f8869a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            l lVar = (l) this.d;
                            lVar.f8871c.C(new a(lVar, inputStream, accept));
                        } catch (IOException e10) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((l) this.d).f8869a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f8868c = e11;
                    return;
                }
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f22667e == this) {
                    actionBarLayout.f22667e = null;
                    ((o2) this.f8868c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f8867b);
                    return;
                }
                return;
            default:
                m mVar = (m) this.d;
                ArrayList arrayList = (ArrayList) this.f8868c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2.k kVar = (f2.k) obj;
                    mVar.T(kVar.f6379a, kVar, this.f8867b);
                }
                arrayList.clear();
                mVar.f6410u.remove(arrayList);
                return;
        }
    }

    public k(l lVar) {
        this.f8866a = 0;
        this.d = lVar;
        this.f8867b = false;
    }
}
