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
    public final int f14196a;
    public boolean f14197b;
    public Object f14198c;
    public final Object d;

    public g(Object obj, Object obj2, boolean z10, int i10) {
        this.f14196a = i10;
        this.d = obj;
        this.f14198c = obj2;
        this.f14197b = z10;
    }

    @Override
    public final void run() {
        switch (this.f14196a) {
            case 0:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.f14198c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    nVar.T(iVar.f46582a, iVar, this.f14197b);
                }
                arrayList.clear();
                nVar.f46595u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f20318e == this) {
                    actionBarLayout.f20318e = null;
                    ((n2) this.f14198c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f14197b);
                    return;
                }
                return;
            default:
                try {
                    ((yc.i) this.d).f50843a.bind(new InetSocketAddress(61578));
                    this.f14197b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f50843a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar2 = (yc.i) this.d;
                            iVar2.f50845c.x(new yc.a(iVar2, inputStream, accept));
                        } catch (IOException e7) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e7);
                        }
                    } while (!((yc.i) this.d).f50843a.isClosed());
                    return;
                } catch (IOException e10) {
                    this.f14198c = e10;
                    return;
                }
        }
    }

    public g(yc.i iVar) {
        this.f14196a = 2;
        this.d = iVar;
        this.f14197b = false;
    }
}
