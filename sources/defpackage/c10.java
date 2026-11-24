package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
public final class c10 {
    public final sdb a;
    public final Handler b;
    public r74 c;
    public o00 d;
    public byte f;
    public f10 h;
    public float g = 1.0f;
    public byte e = 0;

    public c10(Context context, Looper looper, r74 r74Var) {
        this.a = xwe.a(new a10(context, (byte) 0));
        this.c = r74Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b != 1 && b != 0 && this.h != null) {
            i10.a((AudioManager) this.a.get(), this.h);
        }
    }

    public final void b(int i) {
        float f;
        if (this.e != i) {
            this.e = i;
            if (i == 4) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.g != f) {
                this.g = f;
                r74 r74Var = this.c;
                if (r74Var != null) {
                    r74Var.h.h(34);
                }
            }
        }
    }

    public final int c(int i, boolean z) {
        byte b;
        d10 d10Var;
        boolean z2;
        if (i != 1 && (b = this.f) == 1) {
            byte b2 = this.e;
            if (z) {
                if (b2 != 2) {
                    f10 f10Var = this.h;
                    if (f10Var == null) {
                        if (f10Var == null) {
                            ?? obj = new Object();
                            o00 o00Var = o00.i;
                            obj.a = b;
                            d10Var = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.a = f10Var.a;
                            d10Var = obj2;
                        }
                        o00 o00Var2 = this.d;
                        if (o00Var2 != null && o00Var2.a == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o00Var2.getClass();
                        this.h = new f10(d10Var.a, new z00(this, (byte) 0), this.b, o00Var2, z2, true);
                    }
                    int i2 = i10.i((AudioManager) this.a.get(), this.h);
                    if (i2 != 1 && i2 != 2) {
                        b(1);
                        return -1;
                    }
                    b(2);
                    return 1;
                }
            } else if (b2 == 1) {
                return -1;
            } else {
                if (b2 == 3) {
                    return 0;
                }
            }
            return 1;
        }
        a();
        b(0);
        return 1;
    }
}
