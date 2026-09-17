package i2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import v7.v6;
public final class e {
    public final d9.j f11507a;
    public final Handler f11508b;
    public o0 f11509c;
    public b2.e d;
    public int f11511f;
    public c2.c h;
    public float f11512g = 1.0f;
    public int f11510e = 0;

    public e(Context context, Looper looper, o0 o0Var) {
        this.f11507a = v6.a(new d(context, 0));
        this.f11509c = o0Var;
        this.f11508b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.f11510e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            c2.d.a((AudioManager) this.f11507a.get(), this.h);
        }
    }

    public final void b(int i10) {
        o0 o0Var = this.f11509c;
        if (o0Var != null) {
            e2.z zVar = o0Var.f11701n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8824a = zVar.f8826a.obtainMessage(33, i10, 0);
            b10.b();
        }
    }

    public final void c(int i10) {
        float f7;
        if (this.f11510e != i10) {
            this.f11510e = i10;
            if (i10 == 4) {
                f7 = 0.2f;
            } else {
                f7 = 1.0f;
            }
            if (this.f11512g != f7) {
                this.f11512g = f7;
                o0 o0Var = this.f11509c;
                if (o0Var != null) {
                    o0Var.f11701n.e(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        c2.a aVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f11511f) == 1) {
            if (z10) {
                if (this.f11510e != 2) {
                    c2.c cVar = this.h;
                    if (cVar == null) {
                        if (cVar == null) {
                            ?? obj = new Object();
                            obj.f4167c = b2.e.h;
                            obj.f4166b = i11;
                            aVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f4166b = cVar.f4170a;
                            obj2.f4167c = cVar.d;
                            obj2.f4165a = cVar.f4173e;
                            aVar = obj2;
                        }
                        b2.e eVar = this.d;
                        if (eVar != null && eVar.f2031a == 1) {
                            z11 = true;
                        }
                        eVar.getClass();
                        aVar.f4167c = eVar;
                        aVar.f4165a = z11;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i12) {
                                b2.e eVar2;
                                e eVar3 = e.this;
                                eVar3.getClass();
                                if (i12 != -3 && i12 != -2) {
                                    if (i12 != -1) {
                                        if (i12 != 1) {
                                            e2.n(i12, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        eVar3.c(2);
                                        eVar3.b(1);
                                        return;
                                    }
                                    eVar3.b(-1);
                                    eVar3.a();
                                    eVar3.c(1);
                                } else if (i12 != -2 && ((eVar2 = eVar3.d) == null || eVar2.f2031a != 1)) {
                                    eVar3.c(4);
                                } else {
                                    eVar3.b(0);
                                    eVar3.c(3);
                                }
                            }
                        };
                        Handler handler = this.f11508b;
                        handler.getClass();
                        this.h = new c2.c(aVar.f4166b, onAudioFocusChangeListener, handler, (b2.e) aVar.f4167c, aVar.f4165a);
                    }
                    if (c2.d.h((AudioManager) this.f11507a.get(), this.h) == 1) {
                        c(2);
                        return 1;
                    }
                    c(1);
                    return -1;
                }
            } else {
                int i12 = this.f11510e;
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
