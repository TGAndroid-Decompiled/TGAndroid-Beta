package defpackage;
public final class c33 {
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;

    public final c33 clone() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        return obj;
    }

    public final void b(boolean z, float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.f = f4;
        this.g = f3;
        this.i = i;
        while (true) {
            int i2 = this.i;
            if (i2 >= 0) {
                break;
            }
            this.i = i2 + 360;
        }
        while (true) {
            int i3 = this.i;
            if (i3 >= 360) {
                this.i = i3 - 360;
            } else {
                this.j = f7;
                this.k = f8;
                this.d = f9;
                this.e = f10;
                this.l = f5;
                this.m = f6;
                this.h = z2;
                return;
            }
        }
    }
}
