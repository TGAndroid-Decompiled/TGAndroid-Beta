package f2;

import a8.bb;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import h2.h0;
import h2.i0;
import l2.o0;
public final class e {
    public final g9.t f11031a;
    public final Handler f11032b;
    public o0 f11033c;
    public e2.e d;
    public int f11035f;
    public h h;
    public float f11036g = 1.0f;
    public int f11034e = 0;

    public e(Context context, Looper looper, o0 o0Var) {
        this.f11031a = bb.a(new d(context, 0));
        this.f11033c = o0Var;
        this.f11032b = new Handler(looper);
    }

    public final void a() {
        int i7 = this.f11034e;
        if (i7 != 1 && i7 != 0 && this.h != null) {
            i.a((AudioManager) this.f11031a.get(), this.h);
        }
    }

    public final void b(int i7) {
        o0 o0Var = this.f11033c;
        if (o0Var != null) {
            i0 i0Var = o0Var.f19505n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.f13767a = i0Var.f13771a.obtainMessage(33, i7, 0);
            c10.b();
        }
    }

    public final void c(int i7) {
        float f10;
        if (this.f11034e != i7) {
            this.f11034e = i7;
            if (i7 == 4) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f11036g != f10) {
                this.f11036g = f10;
                o0 o0Var = this.f11033c;
                if (o0Var != null) {
                    o0Var.f19505n.f(34);
                }
            }
        }
    }

    public final int d(int i7, boolean z10) {
        int i10;
        f fVar;
        boolean z11 = false;
        if (i7 != 1 && (i10 = this.f11035f) == 1) {
            if (z10) {
                if (this.f11034e != 2) {
                    h hVar = this.h;
                    if (hVar == null) {
                        if (hVar == null) {
                            ?? obj = new Object();
                            obj.f11038b = e2.e.f10369i;
                            obj.f11037a = i10;
                            fVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f11037a = hVar.f11042a;
                            obj2.f11038b = hVar.d;
                            obj2.f11039c = hVar.f11045e;
                            fVar = obj2;
                        }
                        e2.e eVar = this.d;
                        if (eVar != null && eVar.f10377a == 1) {
                            z11 = true;
                        }
                        eVar.getClass();
                        fVar.f11038b = eVar;
                        fVar.f11039c = z11;
                        fVar.d = true;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i11) {
                                e2.e eVar2;
                                e eVar3 = e.this;
                                eVar3.getClass();
                                if (i11 != -3 && i11 != -2) {
                                    if (i11 != -1) {
                                        if (i11 != 1) {
                                            e2.o(i11, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        eVar3.c(2);
                                        eVar3.b(1);
                                        return;
                                    }
                                    eVar3.b(-1);
                                    eVar3.a();
                                    eVar3.c(1);
                                } else if (i11 != -2 && ((eVar2 = eVar3.d) == null || eVar2.f10377a != 1)) {
                                    eVar3.c(4);
                                } else {
                                    eVar3.b(0);
                                    eVar3.c(3);
                                }
                            }
                        };
                        Handler handler = this.f11032b;
                        handler.getClass();
                        this.h = new h(fVar.f11037a, onAudioFocusChangeListener, handler, fVar.f11038b, fVar.f11039c, fVar.d);
                    }
                    int e10 = i.e((AudioManager) this.f11031a.get(), this.h);
                    if (e10 != 1 && e10 != 2) {
                        c(1);
                        return -1;
                    }
                    c(2);
                    return 1;
                }
            } else {
                int i11 = this.f11034e;
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
