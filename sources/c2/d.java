package c2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.h0;
import e2.i0;
import i2.s0;
import v7.v6;
public final class d {
    public final d9.t f3529a;
    public final Handler f3530b;
    public s0 f3531c;
    public b2.f d;
    public int f3532f;
    public g h;
    public float f3533g = 1.0f;
    public int e = 0;

    public d(Context context, Looper looper, s0 s0Var) {
        this.f3529a = v6.a(new c(context, 0));
        this.f3531c = s0Var;
        this.f3530b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            h.a((AudioManager) this.f3529a.get(), this.h);
        }
    }

    public final void b(int i10) {
        s0 s0Var = this.f3531c;
        if (s0Var != null) {
            i0 i0Var = s0Var.f8063n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.f6147a = i0Var.f6151a.obtainMessage(33, i10, 0);
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
            if (this.f3533g != f7) {
                this.f3533g = f7;
                s0 s0Var = this.f3531c;
                if (s0Var != null) {
                    s0Var.f8063n.f(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        e eVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f3532f) == 1) {
            if (z10) {
                if (this.e != 2) {
                    g gVar = this.h;
                    if (gVar == null) {
                        if (gVar == null) {
                            ?? obj = new Object();
                            obj.f3535b = b2.f.f2027i;
                            obj.f3534a = i11;
                            eVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f3534a = gVar.f3539a;
                            obj2.f3535b = gVar.d;
                            obj2.f3536c = gVar.e;
                            eVar = obj2;
                        }
                        b2.f fVar = this.d;
                        if (fVar != null && fVar.f2035a == 1) {
                            z11 = true;
                        }
                        fVar.getClass();
                        eVar.f3535b = fVar;
                        eVar.f3536c = z11;
                        eVar.d = true;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i12) {
                                b2.f fVar2;
                                d dVar = d.this;
                                dVar.getClass();
                                if (i12 != -3 && i12 != -2) {
                                    if (i12 != -1) {
                                        if (i12 != 1) {
                                            a1.g.w(i12, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        dVar.c(2);
                                        dVar.b(1);
                                        return;
                                    }
                                    dVar.b(-1);
                                    dVar.a();
                                    dVar.c(1);
                                } else if (i12 != -2 && ((fVar2 = dVar.d) == null || fVar2.f2035a != 1)) {
                                    dVar.c(4);
                                } else {
                                    dVar.b(0);
                                    dVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f3530b;
                        handler.getClass();
                        this.h = new g(eVar.f3534a, onAudioFocusChangeListener, handler, eVar.f3535b, eVar.f3536c, eVar.d);
                    }
                    int h = h.h((AudioManager) this.f3529a.get(), this.h);
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
