package gc;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o2;
import rh.m;
public final class j implements Runnable {
    public final int f7730a;
    public boolean f7731b;
    public Object f7732c;
    public final Object d;

    public j(Object obj, Object obj2, boolean z10, int i9) {
        this.f7730a = i9;
        this.d = obj;
        this.f7732c = obj2;
        this.f7731b = z10;
    }

    @Override
    public final void run() {
        switch (this.f7730a) {
            case 0:
                try {
                    ((k) this.d).f7733a.bind(new InetSocketAddress(61578));
                    this.f7731b = true;
                    do {
                        try {
                            Socket accept = ((k) this.d).f7733a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            k kVar = (k) this.d;
                            kVar.f7735c.G(new a(kVar, inputStream, accept));
                        } catch (IOException e10) {
                            k.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((k) this.d).f7733a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f7732c = e11;
                    return;
                }
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f22655e == this) {
                    actionBarLayout.f22655e = null;
                    ((o2) this.f7732c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f7731b);
                    return;
                }
                return;
            default:
                m mVar = (m) this.d;
                ArrayList arrayList = (ArrayList) this.f7732c;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    f2.m mVar2 = (f2.m) obj;
                    mVar.T(mVar2.f5428a, mVar2, this.f7731b);
                }
                arrayList.clear();
                mVar.f5455u.remove(arrayList);
                return;
        }
    }

    public j(k kVar) {
        this.f7730a = 0;
        this.d = kVar;
        this.f7731b = false;
    }
}
