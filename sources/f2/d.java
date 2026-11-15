package f2;

import a8.la;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import g9.t;
import h2.h0;
import h2.i0;
import l2.o0;
public final class d {
    public final t f10709a;
    public final Handler f10710b;
    public o0 f10711c;
    public e2.e d;
    public int f10713f;
    public g h;
    public float f10714g = 1.0f;
    public int f10712e = 0;

    public d(Context context, Looper looper, o0 o0Var) {
        this.f10709a = la.a(new c(context, 0));
        this.f10711c = o0Var;
        this.f10710b = new Handler(looper);
    }

    public final void a() {
        int i7 = this.f10712e;
        if (i7 != 1 && i7 != 0 && this.h != null) {
            h.a((AudioManager) this.f10709a.get(), this.h);
        }
    }

    public final void b(int i7) {
        o0 o0Var = this.f10711c;
        if (o0Var != null) {
            i0 i0Var = o0Var.f19138n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.f13452a = i0Var.f13456a.obtainMessage(33, i7, 0);
            c10.b();
        }
    }

    public final void c(int i7) {
        float f10;
        if (this.f10712e != i7) {
            this.f10712e = i7;
            if (i7 == 4) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f10714g != f10) {
                this.f10714g = f10;
                o0 o0Var = this.f10711c;
                if (o0Var != null) {
                    o0Var.f19138n.f(34);
                }
            }
        }
    }

    public final int d(int i7, boolean z10) {
        int i10;
        e eVar;
        boolean z11 = false;
        if (i7 != 1 && (i10 = this.f10713f) == 1) {
            if (z10) {
                if (this.f10712e != 2) {
                    g gVar = this.h;
                    if (gVar == null) {
                        if (gVar == null) {
                            ?? obj = new Object();
                            obj.f10716b = e2.e.f10051i;
                            obj.f10715a = i10;
                            eVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f10715a = gVar.f10720a;
                            obj2.f10716b = gVar.d;
                            obj2.f10717c = gVar.f10723e;
                            eVar = obj2;
                        }
                        e2.e eVar2 = this.d;
                        if (eVar2 != null && eVar2.f10059a == 1) {
                            z11 = true;
                        }
                        eVar2.getClass();
                        eVar.f10716b = eVar2;
                        eVar.f10717c = z11;
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
                                            e2.o(i11, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        dVar.c(2);
                                        dVar.b(1);
                                        return;
                                    }
                                    dVar.b(-1);
                                    dVar.a();
                                    dVar.c(1);
                                } else if (i11 != -2 && ((eVar3 = dVar.d) == null || eVar3.f10059a != 1)) {
                                    dVar.c(4);
                                } else {
                                    dVar.b(0);
                                    dVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f10710b;
                        handler.getClass();
                        this.h = new g(eVar.f10715a, onAudioFocusChangeListener, handler, eVar.f10716b, eVar.f10717c, eVar.d);
                    }
                    int e10 = h.e((AudioManager) this.f10709a.get(), this.h);
                    if (e10 != 1 && e10 != 2) {
                        c(1);
                        return -1;
                    }
                    c(2);
                    return 1;
                }
            } else {
                int i11 = this.f10712e;
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
