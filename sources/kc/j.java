package kc;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p2;
import wh.n;
public final class j implements Runnable {
    public final int f10296a;
    public boolean f10297b;
    public Object f10298c;
    public final Object d;

    public j(Object obj, Object obj2, boolean z4, int i10) {
        this.f10296a = i10;
        this.d = obj;
        this.f10298c = obj2;
        this.f10297b = z4;
    }

    @Override
    public final void run() {
        switch (this.f10296a) {
            case 0:
                try {
                    ((k) this.d).f10299a.bind(new InetSocketAddress(61578));
                    this.f10297b = true;
                    do {
                        try {
                            Socket accept = ((k) this.d).f10299a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            k kVar = (k) this.d;
                            kVar.f10301c.w(new a(kVar, inputStream, accept));
                        } catch (IOException e) {
                            k.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((k) this.d).f10299a.isClosed());
                    return;
                } catch (IOException e6) {
                    this.f10298c = e6;
                    return;
                }
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((p2) this.f10298c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f10297b);
                    return;
                }
                return;
            default:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f10298c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2.k kVar2 = (f2.k) obj;
                    nVar.T(kVar2.f5755a, kVar2, this.f10297b);
                }
                arrayList.clear();
                nVar.f5768u.remove(arrayList);
                return;
        }
    }

    public j(k kVar) {
        this.f10296a = 0;
        this.d = kVar;
        this.f10297b = false;
    }
}
