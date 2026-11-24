package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
public final class dz3 {
    public byte a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;

    public dz3(in3 in3Var, int i, int i2, int i3, String str) {
        this.f = in3Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final int a(int i) {
        tf7 tf7Var = (tf7) ((tf7) this.e).a.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a != 2) {
            if (tf7Var == null) {
                c();
            } else {
                this.a = (byte) 2;
                this.e = tf7Var;
                this.c = 1;
                i2 = i3;
            }
        } else {
            if (tf7Var != null) {
                this.e = tf7Var;
                this.c++;
            } else if (i == 65038) {
                c();
            } else if (i != 65039) {
                tf7 tf7Var2 = (tf7) this.e;
                if (tf7Var2.b != null) {
                    i3 = 3;
                    if (this.c == 1) {
                        if (d()) {
                            this.f = (tf7) this.e;
                            c();
                        } else {
                            c();
                        }
                    } else {
                        this.f = tf7Var2;
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
        dz3 dz3Var;
        if (((VolumeProvider) this.e) == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                dz3Var = this;
                dz3Var.e = new tlc(dz3Var, this.a, this.b, this.c, (String) this.d);
            } else {
                dz3Var = this;
                dz3Var.e = new ulc(dz3Var, dz3Var.a, dz3Var.b, dz3Var.c);
            }
        } else {
            dz3Var = this;
        }
        return (VolumeProvider) dz3Var.e;
    }

    public final void c() {
        this.a = (byte) 1;
        this.e = (tf7) this.d;
        this.c = 0;
    }

    public final boolean d() {
        qf7 b = ((tf7) this.e).b.b();
        int a = b.a(6);
        if ((a != 0 && b.b.get(a + b.a) != 0) || this.b == 65039) {
            return true;
        }
        return false;
    }

    public dz3(tf7 tf7Var) {
        this.a = (byte) 1;
        this.d = tf7Var;
        this.e = tf7Var;
    }
}
