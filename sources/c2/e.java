package c2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.h0;
import e2.i0;
import i2.r0;
import v7.w6;
public final class e {
    public final d9.u f4495a;
    public final Handler f4496b;
    public r0 f4497c;
    public b2.f d;
    public int f4498f;
    public h h;
    public float f4499g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, r0 r0Var) {
        this.f4495a = w6.a(new d(context, 0));
        this.f4497c = r0Var;
        this.f4496b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            i.a((AudioManager) this.f4495a.get(), this.h);
        }
    }

    public final void b(int i10) {
        r0 r0Var = this.f4497c;
        if (r0Var != null) {
            i0 i0Var = r0Var.f12558n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.f8233a = i0Var.f8237a.obtainMessage(33, i10, 0);
            c10.b();
        }
    }

    public final void c(int i10) {
        float f7;
        if (this.e != i10) {
            this.e = i10;
            if (i10 == 4) {
                f7 = 0.2f;
            } else {
                f7 = 1.0f;
            }
            if (this.f4499g != f7) {
                this.f4499g = f7;
                r0 r0Var = this.f4497c;
                if (r0Var != null) {
                    r0Var.f12558n.f(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        f fVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f4498f) == 1) {
            if (z10) {
                if (this.e != 2) {
                    h hVar = this.h;
                    if (hVar == null) {
                        if (hVar == null) {
                            ?? obj = new Object();
                            obj.f4501b = b2.f.f3737i;
                            obj.f4500a = i11;
                            fVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f4500a = hVar.f4505a;
                            obj2.f4501b = hVar.d;
                            obj2.f4502c = hVar.e;
                            fVar = obj2;
                        }
                        b2.f fVar2 = this.d;
                        if (fVar2 != null && fVar2.f3745a == 1) {
                            z11 = true;
                        }
                        fVar2.getClass();
                        fVar.f4501b = fVar2;
                        fVar.f4502c = z11;
                        fVar.d = true;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i12) {
                                b2.f fVar3;
                                e eVar = e.this;
                                eVar.getClass();
                                if (i12 != -3 && i12 != -2) {
                                    if (i12 != -1) {
                                        if (i12 != 1) {
                                            a1.g.x(i12, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        eVar.c(2);
                                        eVar.b(1);
                                        return;
                                    }
                                    eVar.b(-1);
                                    eVar.a();
                                    eVar.c(1);
                                } else if (i12 != -2 && ((fVar3 = eVar.d) == null || fVar3.f3745a != 1)) {
                                    eVar.c(4);
                                } else {
                                    eVar.b(0);
                                    eVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f4496b;
                        handler.getClass();
                        this.h = new h(fVar.f4500a, onAudioFocusChangeListener, handler, fVar.f4501b, fVar.f4502c, fVar.d);
                    }
                    int h = i.h((AudioManager) this.f4495a.get(), this.h);
                    if (h != 1 && h != 2) {
                        c(1);
                        return -1;
                    }
                    c(2);
                    return 1;
                }
            } else {
                int i12 = this.e;
                if (i12 == 1) {
                    return -1;
                }
                if (i12 == 3) {
                    return 0;
                }
            }
            return 1;
        }
        a();
        c(0);
        return 1;
    }
}
