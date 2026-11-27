package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
public final class q6 implements Runnable {
    public final byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public q6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = z;
    }

    @Override
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((e) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.b);
                    return;
                }
                return;
            case 1:
                bb2 bb2Var = (bb2) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    yb3 yb3Var = (yb3) obj;
                    bb2Var.S(yb3Var.a, yb3Var, this.b);
                }
                arrayList.clear();
                bb2Var.u.remove(arrayList);
                return;
            default:
                try {
                    ((ok7) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((ok7) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            ok7 ok7Var = (ok7) this.d;
                            ok7Var.c.u(new hk7(ok7Var, inputStream, accept));
                        } catch (IOException e) {
                            ok7.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((ok7) this.d).a.isClosed());
                    return;
                } catch (IOException e2) {
                    this.c = e2;
                    return;
                }
        }
    }

    public q6(ok7 ok7Var) {
        this.a = (byte) 2;
        this.d = ok7Var;
        this.b = false;
    }
}
