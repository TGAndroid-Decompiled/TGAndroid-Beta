package hc;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
import sh.m;

public final class k implements Runnable {

    public final int f8902a;

    public boolean f8903b;

    public Object f8904c;
    public final Object d;

    public k(Object obj, Object obj2, boolean z10, int i10) {
        this.f8902a = i10;
        this.d = obj;
        this.f8904c = obj2;
        this.f8903b = z10;
    }

    @Override
    public final void run() {
        switch (this.f8902a) {
            case 0:
                try {
                    ((l) this.d).f8905a.bind(new InetSocketAddress(61578));
                    this.f8903b = true;
                    do {
                        try {
                            Socket socketAccept = ((l) this.d).f8905a.accept();
                            socketAccept.setSoTimeout(5000);
                            InputStream inputStream = socketAccept.getInputStream();
                            l lVar = (l) this.d;
                            lVar.f8907c.H(new a(lVar, inputStream, socketAccept));
                        } catch (IOException e9) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e9);
                        }
                    } while (!((l) this.d).f8905a.isClosed());
                } catch (IOException e10) {
                    this.f8904c = e10;
                    return;
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f22655e == this) {
                    actionBarLayout.f22655e = null;
                    ((n2) this.f8904c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f8903b);
                    break;
                }
                break;
            default:
                m mVar = (m) this.d;
                ArrayList arrayList = (ArrayList) this.f8904c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2.k kVar = (f2.k) obj;
                    mVar.T(kVar.f5716a, kVar, this.f8903b);
                }
                arrayList.clear();
                mVar.f5743u.remove(arrayList);
                break;
        }
    }

    public k(l lVar) {
        this.f8902a = 0;
        this.d = lVar;
        this.f8903b = false;
    }
}
