package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
public final class d00 {
    public final mfb a;
    public final Handler b;
    public c74 c;
    public oz d;
    public byte f;
    public g00 h;
    public float g = 1.0f;
    public byte e = 0;

    public d00(Context context, Looper looper, c74 c74Var) {
        this.a = nze.a(new b00(context, (byte) 0));
        this.c = c74Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b != 1 && b != 0 && this.h != null) {
            j00.a((AudioManager) this.a.get(), this.h);
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
                c74 c74Var = this.c;
                if (c74Var != null) {
                    c74Var.h.h(34);
                }
            }
        }
    }

    public final int c(int i, boolean z) {
        byte b;
        e00 e00Var;
        boolean z2;
        if (i != 1 && (b = this.f) == 1) {
            byte b2 = this.e;
            if (z) {
                if (b2 != 2) {
                    g00 g00Var = this.h;
                    if (g00Var == null) {
                        if (g00Var == null) {
                            ?? obj = new Object();
                            oz ozVar = oz.i;
                            obj.a = b;
                            e00Var = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.a = g00Var.a;
                            e00Var = obj2;
                        }
                        oz ozVar2 = this.d;
                        if (ozVar2 != null && ozVar2.a == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ozVar2.getClass();
                        this.h = new g00(e00Var.a, new a00(this, (byte) 0), this.b, ozVar2, z2, true);
                    }
                    int i2 = j00.i((AudioManager) this.a.get(), this.h);
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
