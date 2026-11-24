package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
public final class c00 {
    public final qbb a;
    public final Handler b;
    public i64 c;
    public nz d;
    public byte f;
    public f00 h;
    public float g = 1.0f;
    public byte e = 0;

    public c00(Context context, Looper looper, i64 i64Var) {
        this.a = vue.a(new a00(context, (byte) 0));
        this.c = i64Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b != 1 && b != 0 && this.h != null) {
            i00.a((AudioManager) this.a.get(), this.h);
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
                i64 i64Var = this.c;
                if (i64Var != null) {
                    i64Var.h.h(34);
                }
            }
        }
    }

    public final int c(int i, boolean z) {
        byte b;
        d00 d00Var;
        boolean z2;
        if (i != 1 && (b = this.f) == 1) {
            byte b2 = this.e;
            if (z) {
                if (b2 != 2) {
                    f00 f00Var = this.h;
                    if (f00Var == null) {
                        if (f00Var == null) {
                            ?? obj = new Object();
                            nz nzVar = nz.i;
                            obj.a = b;
                            d00Var = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.a = f00Var.a;
                            d00Var = obj2;
                        }
                        nz nzVar2 = this.d;
                        if (nzVar2 != null && nzVar2.a == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        nzVar2.getClass();
                        this.h = new f00(d00Var.a, new zz(this, (byte) 0), this.b, nzVar2, z2, true);
                    }
                    int i2 = i00.i((AudioManager) this.a.get(), this.h);
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
