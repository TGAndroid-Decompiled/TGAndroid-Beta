package ci;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
public final class h implements Runnable {
    public final int f4213a;
    public boolean f4214b;
    public Object f4215c;
    public final Object d;

    public h(Object obj, Object obj2, boolean z10, int i10) {
        this.f4213a = i10;
        this.d = obj;
        this.f4215c = obj2;
        this.f4214b = z10;
    }

    @Override
    public final void run() {
        switch (this.f4213a) {
            case 0:
                o oVar = (o) this.d;
                ArrayList arrayList = (ArrayList) this.f4215c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    oVar.T(iVar.f47942a, iVar, this.f4214b);
                }
                arrayList.clear();
                oVar.f47951u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((k2) this.f4215c).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.f4214b);
                    return;
                }
                return;
            default:
                try {
                    ((sc.j) this.d).f48175a.bind(new InetSocketAddress(61578));
                    this.f4214b = true;
                    do {
                        try {
                            Socket accept = ((sc.j) this.d).f48175a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            sc.j jVar = (sc.j) this.d;
                            jVar.f48177c.D(new sc.a(jVar, inputStream, accept));
                        } catch (IOException e) {
                            sc.j.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((sc.j) this.d).f48175a.isClosed());
                    return;
                } catch (IOException e7) {
                    this.f4215c = e7;
                    return;
                }
        }
    }

    public h(sc.j jVar) {
        this.f4213a = 2;
        this.d = jVar;
        this.f4214b = false;
    }
}
