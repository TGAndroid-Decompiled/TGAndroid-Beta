package bd;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import mi.m;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.r2;
public final class j implements Runnable {
    public final int f3885a;
    public boolean f3886b;
    public Object f3887c;
    public final Object d;

    public j(Object obj, Object obj2, boolean z10, int i10) {
        this.f3885a = i10;
        this.d = obj;
        this.f3887c = obj2;
        this.f3886b = z10;
    }

    @Override
    public final void run() {
        switch (this.f3885a) {
            case 0:
                try {
                    ((k) this.d).f3888a.bind(new InetSocketAddress(61578));
                    this.f3886b = true;
                    do {
                        try {
                            Socket accept = ((k) this.d).f3888a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            k kVar = (k) this.d;
                            kVar.f3890c.y(new a(kVar, inputStream, accept));
                        } catch (IOException e) {
                            k.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((k) this.d).f3888a.isClosed());
                    return;
                } catch (IOException e10) {
                    this.f3887c = e10;
                    return;
                }
            case 1:
                m mVar = (m) this.d;
                ArrayList arrayList = (ArrayList) this.f3887c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.k kVar2 = (s4.k) obj;
                    mVar.T(kVar2.f47778a, kVar2, this.f3886b);
                }
                arrayList.clear();
                mVar.f47790u.remove(arrayList);
                return;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((r2) this.f3887c).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.f3886b);
                    return;
                }
                return;
        }
    }

    public j(k kVar) {
        this.f3885a = 0;
        this.d = kVar;
        this.f3886b = false;
    }
}
