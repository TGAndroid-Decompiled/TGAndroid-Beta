package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class is2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final int c;
    public final int d;

    public is2(boolean z, int i, int i2) {
        this.a = (byte) 1;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                ConnectionsManager.h(this.c, this.d, z);
                return;
            case 1:
                ConnectionsManager.o(this.c, this.d, this.b);
                return;
            default:
                boolean z2 = this.b;
                ConnectionsManager.n(this.c, this.d, z2);
                return;
        }
    }

    public is2(int i, boolean z, int i2, byte b) {
        this.a = b;
        this.c = i;
        this.b = z;
        this.d = i2;
    }
}
