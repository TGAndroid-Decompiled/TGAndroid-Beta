package defpackage;

import org.telegram.messenger.Utilities;
public final class eg3 {
    public long a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public Integer g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public float l;
    public boolean m;
    public int n;
    public boolean o = false;
    public long p;
    public final hg3 q;

    public eg3(hg3 hg3Var) {
        this.q = hg3Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg3.a():boolean");
    }

    public final void b() {
        boolean z = this.o;
        hg3 hg3Var = this.q;
        if (!z) {
            Integer num = this.g;
            if (num != null && hg3Var.g3 != null) {
                float f = this.l;
                if (f != 1.0f) {
                    this.l = f + 0.08f;
                    hg3Var.invalidate();
                    this.l = Utilities.i(this.l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f2 = this.l;
                if (f2 != 0.0f) {
                    this.l = f2 - 0.08f;
                    hg3Var.invalidate();
                }
            }
            this.l = Utilities.i(this.l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.p > 100) {
            this.o = false;
        }
        hg3Var.invalidate();
    }
}
