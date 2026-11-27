package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class cu7 extends ucb {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(ey7 ey7Var, byte[] bArr) {
        if (ey7Var.a() < bArr.length) {
            return false;
        }
        int i = ey7Var.b;
        byte[] bArr2 = new byte[bArr.length];
        ey7Var.k(0, bArr.length, bArr2);
        ey7Var.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(ey7 ey7Var) {
        byte[] bArr = ey7Var.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (this.i * zue.b(b2, b)) / 1000000;
    }

    @Override
    public final boolean c(ey7 ey7Var, long j, k7b k7bVar) {
        if (e(ey7Var, o)) {
            byte[] copyOf = Arrays.copyOf(ey7Var.a, ey7Var.c);
            int i = copyOf[9] & 255;
            ArrayList a = zue.a(copyOf);
            if (((ko4) k7bVar.b) == null) {
                jo4 jo4Var = new jo4();
                jo4Var.r = dg7.n("audio/ogg");
                jo4Var.s = dg7.n("audio/opus");
                jo4Var.M = i;
                jo4Var.O = 48000;
                jo4Var.v = a;
                k7bVar.b = new ko4(jo4Var);
                return true;
            }
        } else {
            boolean e = e(ey7Var, p);
            ko4 ko4Var = (ko4) k7bVar.b;
            if (e) {
                ko4Var.getClass();
                if (!this.n) {
                    this.n = true;
                    ey7Var.O(8);
                    uf7 a2 = moc.a(po5.r((String[]) s2f.b(ey7Var, false, false).b));
                    if (a2 != null) {
                        jo4 a3 = ((ko4) k7bVar.b).a();
                        a3.l = a2.b(((ko4) k7bVar.b).m);
                        k7bVar.b = new ko4(a3);
                        return true;
                    }
                }
            } else {
                ko4Var.getClass();
                return false;
            }
        }
        return true;
    }

    @Override
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
