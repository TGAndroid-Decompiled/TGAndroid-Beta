package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
public final class oy3 {
    public byte a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;

    public oy3(pm3 pm3Var, int i, int i2, int i3, String str) {
        this.f = pm3Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final int a(int i) {
        bg7 bg7Var = (bg7) ((bg7) this.e).a.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a != 2) {
            if (bg7Var == null) {
                c();
            } else {
                this.a = (byte) 2;
                this.e = bg7Var;
                this.c = 1;
                i2 = i3;
            }
        } else {
            if (bg7Var != null) {
                this.e = bg7Var;
                this.c++;
            } else if (i == 65038) {
                c();
            } else if (i != 65039) {
                bg7 bg7Var2 = (bg7) this.e;
                if (bg7Var2.b != null) {
                    i3 = 3;
                    if (this.c == 1) {
                        if (d()) {
                            this.f = (bg7) this.e;
                            c();
                        } else {
                            c();
                        }
                    } else {
                        this.f = bg7Var2;
                        c();
                    }
                } else {
                    c();
                }
            }
            i2 = i3;
        }
        this.b = i;
        return i2;
    }

    public final VolumeProvider b() {
        oy3 oy3Var;
        if (((VolumeProvider) this.e) == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                oy3Var = this;
                oy3Var.e = new goc(oy3Var, this.a, this.b, this.c, (String) this.d);
            } else {
                oy3Var = this;
                oy3Var.e = new hoc(oy3Var, oy3Var.a, oy3Var.b, oy3Var.c);
            }
        } else {
            oy3Var = this;
        }
        return (VolumeProvider) oy3Var.e;
    }

    public final void c() {
        this.a = (byte) 1;
        this.e = (bg7) this.d;
        this.c = 0;
    }

    public final boolean d() {
        yf7 b = ((bg7) this.e).b.b();
        int a = b.a(6);
        if ((a != 0 && b.b.get(a + b.a) != 0) || this.b == 65039) {
            return true;
        }
        return false;
    }

    public oy3(bg7 bg7Var) {
        this.a = (byte) 1;
        this.d = bg7Var;
        this.e = bg7Var;
    }
}
