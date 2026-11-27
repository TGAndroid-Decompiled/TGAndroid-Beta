package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ac7 {
    public static int q = 10;
    public int a;
    public String b;
    public int d;
    public volatile int e;
    public int f;
    public int g;
    public int m;
    public boolean n;
    public final int o;
    public boolean p;
    public ArrayList c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public final LongSparseIntArray j = new LongSparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public ac7() {
        int i = q;
        q = i + 1;
        this.o = i;
    }

    public final boolean a(k5 k5Var, long j) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(k5Var.a).R.f(j);
        if (dialog == null) {
            return false;
        }
        return b(k5Var, j, dialog, false);
    }

    public final boolean b(defpackage.k5 r10, long r11, org.telegram.tgnet.TLRPC.Dialog r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac7.b(k5, long, org.telegram.tgnet.TLRPC$Dialog, boolean):boolean");
    }

    public final boolean c() {
        int i = this.g;
        int i2 = uc7.s5;
        if ((i & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (c()) {
            int i = this.g;
            int i2 = uc7.s5;
            if ((i & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
