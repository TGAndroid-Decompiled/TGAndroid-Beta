package i2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import v7.v6;
public final class e {
    public final d9.i f10639a;
    public final Handler f10640b;
    public o0 f10641c;
    public b2.e d;
    public int f10642f;
    public c2.c h;
    public float f10643g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, o0 o0Var) {
        this.f10639a = v6.a(new d(context, 0));
        this.f10641c = o0Var;
        this.f10640b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            c2.d.a((AudioManager) this.f10639a.get(), this.h);
        }
    }

    public final void b(int i10) {
        o0 o0Var = this.f10641c;
        if (o0Var != null) {
            e2.z zVar = o0Var.f10819n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7936a = zVar.f7938a.obtainMessage(33, i10, 0);
            b10.b();
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
            if (this.f10643g != f7) {
                this.f10643g = f7;
                o0 o0Var = this.f10641c;
                if (o0Var != null) {
                    o0Var.f10819n.e(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        c2.a aVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f10642f) == 1) {
            if (z10) {
                if (this.e != 2) {
                    c2.c cVar = this.h;
                    if (cVar == null) {
                        if (cVar == null) {
                            ?? obj = new Object();
                            obj.f3653c = b2.e.h;
                            obj.f3652b = i11;
                            aVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f3652b = cVar.f3656a;
                            obj2.f3653c = cVar.d;
                            obj2.f3651a = cVar.e;
                            aVar = obj2;
                        }
                        b2.e eVar = this.d;
                        if (eVar != null && eVar.f2963a == 1) {
                            z11 = true;
                        }
                        eVar.getClass();
                        aVar.f3653c = eVar;
                        aVar.f3651a = z11;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i12) {
                                b2.e eVar2;
                                e eVar3 = e.this;
                                eVar3.getClass();
                                if (i12 != -3 && i12 != -2) {
                                    if (i12 != -1) {
                                        if (i12 != 1) {
                                            e2.m(i12, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        eVar3.c(2);
                                        eVar3.b(1);
                                        return;
                                    }
                                    eVar3.b(-1);
                                    eVar3.a();
                                    eVar3.c(1);
                                } else if (i12 != -2 && ((eVar2 = eVar3.d) == null || eVar2.f2963a != 1)) {
                                    eVar3.c(4);
                                } else {
                                    eVar3.b(0);
                                    eVar3.c(3);
                                }
                            }
                        };
                        Handler handler = this.f10640b;
                        handler.getClass();
                        this.h = new c2.c(aVar.f3652b, onAudioFocusChangeListener, handler, (b2.e) aVar.f3653c, aVar.f3651a);
                    }
                    if (c2.d.h((AudioManager) this.f10639a.get(), this.h) == 1) {
                        c(2);
                        return 1;
                    }
                    c(1);
                    return -1;
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
