package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
public final class tx3 {
    public byte a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;

    public tx3(xl3 xl3Var, int i, int i2, int i3, String str) {
        this.f = xl3Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final int a(int i) {
        rd7 rd7Var = (rd7) ((rd7) this.e).a.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a != 2) {
            if (rd7Var == null) {
                c();
            } else {
                this.a = (byte) 2;
                this.e = rd7Var;
                this.c = 1;
                i2 = i3;
            }
        } else {
            if (rd7Var != null) {
                this.e = rd7Var;
                this.c++;
            } else if (i == 65038) {
                c();
            } else if (i != 65039) {
                rd7 rd7Var2 = (rd7) this.e;
                if (rd7Var2.b != null) {
                    i3 = 3;
                    if (this.c == 1) {
                        if (d()) {
                            this.f = (rd7) this.e;
                            c();
                        } else {
                            c();
                        }
                    } else {
                        this.f = rd7Var2;
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
        tx3 tx3Var;
        if (((VolumeProvider) this.e) == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                tx3Var = this;
                tx3Var.e = new tjc(tx3Var, this.a, this.b, this.c, (String) this.d);
            } else {
                tx3Var = this;
                tx3Var.e = new ujc(tx3Var, tx3Var.a, tx3Var.b, tx3Var.c);
            }
        } else {
            tx3Var = this;
        }
        return (VolumeProvider) tx3Var.e;
    }

    public final void c() {
        this.a = (byte) 1;
        this.e = (rd7) this.d;
        this.c = 0;
    }

    public final boolean d() {
        od7 b = ((rd7) this.e).b.b();
        int a = b.a(6);
        if ((a != 0 && b.b.get(a + b.a) != 0) || this.b == 65039) {
            return true;
        }
        return false;
    }

    public tx3(rd7 rd7Var) {
        this.a = (byte) 1;
        this.d = rd7Var;
        this.e = rd7Var;
    }
}
