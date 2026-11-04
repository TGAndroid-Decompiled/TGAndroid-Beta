package ei;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;
public final class o3 implements Runnable {
    public final int f10686a;
    public final r9 f10687b;

    public o3(r9 r9Var, int i3) {
        this.f10686a = i3;
        this.f10687b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f10686a) {
            case 0:
                this.f10687b.d0();
                return;
            case 1:
                r9 r9Var = this.f10687b;
                r9Var.f10917d0 = true;
                r9Var.A(true);
                return;
            case 2:
                r9 r9Var2 = this.f10687b;
                if (r9Var2.G != null) {
                    f9 f9Var = r9Var2.f10957w;
                    if (f9Var != null) {
                        w.f11144c = true;
                        f9Var.setLayerType(2, null);
                    }
                    r9Var2.G.addListener(new z8(r9Var2, 0));
                    r9Var2.G.setDuration(320L);
                    r9Var2.G.setInterpolator(xq.h);
                    r9Var2.G.start();
                    return;
                }
                return;
            case 3:
                r9 r9Var3 = this.f10687b;
                r9Var3.f10958w0 = null;
                r9Var3.d0();
                return;
            case 4:
                this.f10687b.Z(true);
                return;
            case 5:
                r9 r9Var4 = this.f10687b;
                r9Var4.e0();
                o9 o9Var = r9Var4.f10951t0;
                ImageReceiver imageReceiver = o9Var.f10727b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = o9Var.f10728c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f10687b.z();
                return;
        }
    }
}
