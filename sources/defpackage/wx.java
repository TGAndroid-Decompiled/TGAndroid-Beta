package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class wx implements aka {
    public final byte a = 2;
    public final long b;
    public final int c;
    public final byte d;

    public wx(int i, long j, int i2) {
        this.c = i;
        this.b = j;
        this.d = i2;
    }

    public final boolean a(int i, int i2) {
        byte b = this.d;
        if (b != 1) {
            if ((b == 2 || b == 3) && ConnectionsManager.getInstance(i).getCurrentTime() >= this.b) {
                return false;
            }
        } else if (this.c >= i2) {
            return false;
        }
        return true;
    }

    public final int b() {
        byte b = this.d;
        if (b != 2) {
            if (b != 3) {
                return 14;
            }
            return 16;
        }
        return 15;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(g8c.f0(this.c));
                sb.append(", size=");
                sb.append(this.b);
                sb.append(", minHeaderSize=");
                return de9.l(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    public wx(long j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public wx(int i, int i2, long j) {
        this.d = i;
        this.b = j;
        this.c = i2;
    }
}
