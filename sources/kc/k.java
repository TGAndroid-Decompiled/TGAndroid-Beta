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
public final class k implements Runnable {
    public final int f10317a;
    public boolean f10318b;
    public Object f10319c;
    public final Object d;

    public k(Object obj, Object obj2, boolean z4, int i10) {
        this.f10317a = i10;
        this.d = obj;
        this.f10319c = obj2;
        this.f10318b = z4;
    }

    @Override
    public final void run() {
        switch (this.f10317a) {
            case 0:
                try {
                    ((l) this.d).f10320a.bind(new InetSocketAddress(61578));
                    this.f10318b = true;
                    do {
                        try {
                            Socket accept = ((l) this.d).f10320a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            l lVar = (l) this.d;
                            lVar.f10322c.B(new a(lVar, inputStream, accept));
                        } catch (IOException e) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((l) this.d).f10320a.isClosed());
                    return;
                } catch (IOException e6) {
                    this.f10319c = e6;
                    return;
                }
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((p2) this.f10319c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f10318b);
                    return;
                }
                return;
            default:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f10319c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2.k kVar = (f2.k) obj;
                    nVar.T(kVar.f5766a, kVar, this.f10318b);
                }
                arrayList.clear();
                nVar.f5779u.remove(arrayList);
                return;
        }
    }

    public k(l lVar) {
        this.f10317a = 0;
        this.d = lVar;
        this.f10318b = false;
    }
}
