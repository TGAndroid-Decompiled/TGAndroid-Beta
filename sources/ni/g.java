package ni;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
public final class g implements Runnable {
    public final int f20425a;
    public boolean f20426b;
    public Object f20427c;
    public final Object d;

    public g(Object obj, Object obj2, boolean z10, int i3) {
        this.f20425a = i3;
        this.d = obj;
        this.f20427c = obj2;
        this.f20426b = z10;
    }

    @Override
    public final void run() {
        switch (this.f20425a) {
            case 0:
                l lVar = (l) this.d;
                ArrayList arrayList = (ArrayList) this.f20427c;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    u4.j jVar = (u4.j) obj;
                    lVar.T(jVar.f55590a, jVar, this.f20426b);
                }
                arrayList.clear();
                lVar.f55603u.remove(arrayList);
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f27287e == this) {
                    actionBarLayout.f27287e = null;
                    ((d2) this.f20427c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f20426b);
                    return;
                }
                return;
            default:
                try {
                    ((vc.i) this.d).f56553a.bind(new InetSocketAddress(61578));
                    this.f20426b = true;
                    do {
                        try {
                            Socket accept = ((vc.i) this.d).f56553a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            vc.i iVar = (vc.i) this.d;
                            iVar.f56555c.D(new vc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            vc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((vc.i) this.d).f56553a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f20427c = e11;
                    return;
                }
        }
    }

    public g(vc.i iVar) {
        this.f20425a = 2;
        this.d = iVar;
        this.f20426b = false;
    }
}
