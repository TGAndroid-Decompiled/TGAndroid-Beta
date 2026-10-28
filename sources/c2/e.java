package c2;

import a8.ac;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.h0;
import e2.i0;
import i2.s0;
public final class e {
    public final e9.t f5935a;
    public final Handler f5936b;
    public s0 f5937c;
    public b2.f d;
    public int f5938f;
    public h h;
    public float f5939g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, s0 s0Var) {
        this.f5935a = ac.a(new d(context, 0));
        this.f5937c = s0Var;
        this.f5936b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            j.a((AudioManager) this.f5935a.get(), this.h);
        }
    }

    public final void b(int i10) {
        s0 s0Var = this.f5937c;
        if (s0Var != null) {
            i0 i0Var = s0Var.f13743n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.f9667a = i0Var.f9671a.obtainMessage(33, i10, 0);
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
            if (this.f5939g != f7) {
                this.f5939g = f7;
                s0 s0Var = this.f5937c;
                if (s0Var != null) {
                    s0Var.f13743n.f(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        f fVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f5938f) == 1) {
            if (z10) {
                if (this.e != 2) {
                    h hVar = this.h;
                    if (hVar == null) {
                        if (hVar == null) {
                            ?? obj = new Object();
                            obj.f5941b = b2.f.f3180i;
                            obj.f5940a = i11;
                            fVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f5940a = hVar.f5945a;
                            obj2.f5941b = hVar.d;
                            obj2.f5942c = hVar.e;
                            fVar = obj2;
                        }
                        b2.f fVar2 = this.d;
                        if (fVar2 != null && fVar2.f3188a == 1) {
                            z11 = true;
                        }
                        fVar2.getClass();
                        fVar.f5941b = fVar2;
                        fVar.f5942c = z11;
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
                                            a1.g.z(i12, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        eVar.c(2);
                                        eVar.b(1);
                                        return;
                                    }
                                    eVar.b(-1);
                                    eVar.a();
                                    eVar.c(1);
                                } else if (i12 != -2 && ((fVar3 = eVar.d) == null || fVar3.f3188a != 1)) {
                                    eVar.c(4);
                                } else {
                                    eVar.b(0);
                                    eVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f5936b;
                        handler.getClass();
                        this.h = new h(fVar.f5940a, onAudioFocusChangeListener, handler, fVar.f5941b, fVar.f5942c, fVar.d);
                    }
                    int h = j.h((AudioManager) this.f5935a.get(), this.h);
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
