package ji;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
public final class g implements Runnable {
    public final int f13067a;
    public boolean f13068b;
    public Object f13069c;
    public final Object d;

    public g(Object obj, Object obj2, boolean z10, int i10) {
        this.f13067a = i10;
        this.d = obj;
        this.f13069c = obj2;
        this.f13068b = z10;
    }

    @Override
    public final void run() {
        switch (this.f13067a) {
            case 0:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f13069c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    nVar.T(iVar.f42980a, iVar, this.f13068b);
                }
                arrayList.clear();
                nVar.f42992u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((n2) this.f13069c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f13068b);
                    return;
                }
                return;
            default:
                try {
                    ((yc.i) this.d).f46952a.bind(new InetSocketAddress(61578));
                    this.f13068b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f46952a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar2 = (yc.i) this.d;
                            iVar2.f46954c.C(new yc.a(iVar2, inputStream, accept));
                        } catch (IOException e) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((yc.i) this.d).f46952a.isClosed());
                    return;
                } catch (IOException e7) {
                    this.f13069c = e7;
                    return;
                }
        }
    }

    public g(yc.i iVar) {
        this.f13067a = 2;
        this.d = iVar;
        this.f13068b = false;
    }
}
