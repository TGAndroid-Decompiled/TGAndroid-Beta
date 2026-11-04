package e2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import b8.bc;
import g2.i0;
import g2.j0;
import k2.r0;
public final class d {
    public final f9.t f9332a;
    public final Handler f9333b;
    public r0 f9334c;
    public d2.f d;
    public int f9336f;
    public g h;
    public float f9337g = 1.0f;
    public int f9335e = 0;

    public d(Context context, Looper looper, r0 r0Var) {
        this.f9332a = bc.a(new c(context, 0));
        this.f9334c = r0Var;
        this.f9333b = new Handler(looper);
    }

    public final void a() {
        int i3 = this.f9335e;
        if (i3 != 1 && i3 != 0 && this.h != null) {
            h.a((AudioManager) this.f9332a.get(), this.h);
        }
    }

    public final void b(int i3) {
        r0 r0Var = this.f9334c;
        if (r0Var != null) {
            j0 j0Var = r0Var.f16705n;
            j0Var.getClass();
            i0 c2 = j0.c();
            c2.f11853a = j0Var.f11857a.obtainMessage(33, i3, 0);
            c2.b();
        }
    }

    public final void c(int i3) {
        float f10;
        if (this.f9335e != i3) {
            this.f9335e = i3;
            if (i3 == 4) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f9337g != f10) {
                this.f9337g = f10;
                r0 r0Var = this.f9334c;
                if (r0Var != null) {
                    r0Var.f16705n.f(34);
                }
            }
        }
    }

    public final int d(int i3, boolean z10) {
        int i10;
        e eVar;
        boolean z11 = false;
        if (i3 != 1 && (i10 = this.f9336f) == 1) {
            if (z10) {
                if (this.f9335e != 2) {
                    g gVar = this.h;
                    if (gVar == null) {
                        if (gVar == null) {
                            ?? obj = new Object();
                            obj.f9339b = d2.f.f8079i;
                            obj.f9338a = i10;
                            eVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f9338a = gVar.f9343a;
                            obj2.f9339b = gVar.d;
                            obj2.f9340c = gVar.f9346e;
                            eVar = obj2;
                        }
                        d2.f fVar = this.d;
                        if (fVar != null && fVar.f8087a == 1) {
                            z11 = true;
                        }
                        fVar.getClass();
                        eVar.f9339b = fVar;
                        eVar.f9340c = z11;
                        eVar.d = true;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i11) {
                                d2.f fVar2;
                                d dVar = d.this;
                                dVar.getClass();
                                if (i11 != -3 && i11 != -2) {
                                    if (i11 != -1) {
                                        if (i11 != 1) {
                                            com.google.android.recaptcha.internal.a.o(i11, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        dVar.c(2);
                                        dVar.b(1);
                                        return;
                                    }
                                    dVar.b(-1);
                                    dVar.a();
                                    dVar.c(1);
                                } else if (i11 != -2 && ((fVar2 = dVar.d) == null || fVar2.f8087a != 1)) {
                                    dVar.c(4);
                                } else {
                                    dVar.b(0);
                                    dVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f9333b;
                        handler.getClass();
                        this.h = new g(eVar.f9338a, onAudioFocusChangeListener, handler, eVar.f9339b, eVar.f9340c, eVar.d);
                    }
                    int f10 = h.f((AudioManager) this.f9332a.get(), this.h);
                    if (f10 != 1 && f10 != 2) {
                        c(1);
                        return -1;
                    }
                    c(2);
                    return 1;
                }
            } else {
                int i11 = this.f9335e;
                if (i11 == 1) {
                    return -1;
                }
                if (i11 == 3) {
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
