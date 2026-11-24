package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public final class p6 implements Runnable {
    public final byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public p6(Object obj, Object obj2, boolean z, byte b) {
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
                    ((d) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.b);
                    return;
                }
                return;
            case 1:
                la2 la2Var = (la2) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    fb3 fb3Var = (fb3) obj;
                    la2Var.S(fb3Var.a, fb3Var, this.b);
                }
                arrayList.clear();
                la2Var.u.remove(arrayList);
                return;
            default:
                try {
                    ((ei7) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((ei7) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            ei7 ei7Var = (ei7) this.d;
                            ei7Var.c.u(new xh7(ei7Var, inputStream, accept));
                        } catch (IOException e) {
                            ei7.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((ei7) this.d).a.isClosed());
                    return;
                } catch (IOException e2) {
                    this.c = e2;
                    return;
                }
        }
    }

    public p6(ei7 ei7Var) {
        this.a = (byte) 2;
        this.d = ei7Var;
        this.b = false;
    }
}
