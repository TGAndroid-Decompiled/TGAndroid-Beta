package f2;

import a8.ka;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import g9.u;
import h2.h0;
import h2.i0;
import l2.r0;
public final class d {
    public final u f10893a;
    public final Handler f10894b;
    public r0 f10895c;
    public e2.e d;
    public int f10897f;
    public g h;
    public float f10898g = 1.0f;
    public int f10896e = 0;

    public d(Context context, Looper looper, r0 r0Var) {
        this.f10893a = ka.a(new c(context, 0));
        this.f10895c = r0Var;
        this.f10894b = new Handler(looper);
    }

    public final void a() {
        int i7 = this.f10896e;
        if (i7 != 1 && i7 != 0 && this.h != null) {
            i.a((AudioManager) this.f10893a.get(), this.h);
        }
    }

    public final void b(int i7) {
        r0 r0Var = this.f10895c;
        if (r0Var != null) {
            i0 i0Var = r0Var.f18018n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.f14092a = i0Var.f14096a.obtainMessage(33, i7, 0);
            c10.b();
        }
    }

    public final void c(int i7) {
        float f10;
        if (this.f10896e != i7) {
            this.f10896e = i7;
            if (i7 == 4) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f10898g != f10) {
                this.f10898g = f10;
                r0 r0Var = this.f10895c;
                if (r0Var != null) {
                    r0Var.f18018n.f(34);
                }
            }
        }
    }

    public final int d(int i7, boolean z9) {
        int i10;
        e eVar;
        boolean z10 = false;
        if (i7 != 1 && (i10 = this.f10897f) == 1) {
            if (z9) {
                if (this.f10896e != 2) {
                    g gVar = this.h;
                    if (gVar == null) {
                        if (gVar == null) {
                            ?? obj = new Object();
                            obj.f10900b = e2.e.f10215i;
                            obj.f10899a = i10;
                            eVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f10899a = gVar.f10904a;
                            obj2.f10900b = gVar.d;
                            obj2.f10901c = gVar.f10907e;
                            eVar = obj2;
                        }
                        e2.e eVar2 = this.d;
                        if (eVar2 != null && eVar2.f10223a == 1) {
                            z10 = true;
                        }
                        eVar2.getClass();
                        eVar.f10900b = eVar2;
                        eVar.f10901c = z10;
                        eVar.d = true;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i11) {
                                e2.e eVar3;
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
                                } else if (i11 != -2 && ((eVar3 = dVar.d) == null || eVar3.f10223a != 1)) {
                                    dVar.c(4);
                                } else {
                                    dVar.b(0);
                                    dVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f10894b;
                        handler.getClass();
                        this.h = new g(eVar.f10899a, onAudioFocusChangeListener, handler, eVar.f10900b, eVar.f10901c, eVar.d);
                    }
                    int e10 = i.e((AudioManager) this.f10893a.get(), this.h);
                    if (e10 != 1 && e10 != 2) {
                        c(1);
                        return -1;
                    }
                    c(2);
                    return 1;
                }
            } else {
                int i11 = this.f10896e;
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
