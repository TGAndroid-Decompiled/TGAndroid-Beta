package ji;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m2;
public final class g implements Runnable {
    public final int f14232a;
    public boolean f14233b;
    public Object f14234c;
    public final Object d;

    public g(Object obj, Object obj2, boolean z10, int i10) {
        this.f14232a = i10;
        this.d = obj;
        this.f14234c = obj2;
        this.f14233b = z10;
    }

    @Override
    public final void run() {
        switch (this.f14232a) {
            case 0:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f14234c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    nVar.T(iVar.f47798a, iVar, this.f14233b);
                }
                arrayList.clear();
                nVar.f47814u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f20318e == this) {
                    actionBarLayout.f20318e = null;
                    ((m2) this.f14234c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f14233b);
                    return;
                }
                return;
            default:
                try {
                    ((zc.i) this.d).f54443a.bind(new InetSocketAddress(61578));
                    this.f14233b = true;
                    do {
                        try {
                            Socket accept = ((zc.i) this.d).f54443a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            zc.i iVar2 = (zc.i) this.d;
                            iVar2.f54445c.C(new zc.a(iVar2, inputStream, accept));
                        } catch (IOException e7) {
                            zc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e7);
                        }
                    } while (!((zc.i) this.d).f54443a.isClosed());
                    return;
                } catch (IOException e10) {
                    this.f14234c = e10;
                    return;
                }
        }
    }

    public g(zc.i iVar) {
        this.f14232a = 2;
        this.d = iVar;
        this.f14233b = false;
    }
}
