package c2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.h0;
import e2.i0;
import i2.q0;
import v7.w6;
public final class e {
    public final d9.u f4499a;
    public final Handler f4500b;
    public q0 f4501c;
    public b2.f d;
    public int f4502f;
    public h h;
    public float f4503g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, q0 q0Var) {
        this.f4499a = w6.a(new d(context, 0));
        this.f4501c = q0Var;
        this.f4500b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            i.a((AudioManager) this.f4499a.get(), this.h);
        }
    }

    public final void b(int i10) {
        q0 q0Var = this.f4501c;
        if (q0Var != null) {
            i0 i0Var = q0Var.f12557n;
            i0Var.getClass();
            h0 c10 = i0.c();
            c10.f8236a = i0Var.f8240a.obtainMessage(33, i10, 0);
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
            if (this.f4503g != f7) {
                this.f4503g = f7;
                q0 q0Var = this.f4501c;
                if (q0Var != null) {
                    q0Var.f12557n.f(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        f fVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f4502f) == 1) {
            if (z10) {
                if (this.e != 2) {
                    h hVar = this.h;
                    if (hVar == null) {
                        if (hVar == null) {
                            ?? obj = new Object();
                            obj.f4505b = b2.f.f3741i;
                            obj.f4504a = i11;
                            fVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f4504a = hVar.f4509a;
                            obj2.f4505b = hVar.d;
                            obj2.f4506c = hVar.e;
                            fVar = obj2;
                        }
                        b2.f fVar2 = this.d;
                        if (fVar2 != null && fVar2.f3749a == 1) {
                            z11 = true;
                        }
                        fVar2.getClass();
                        fVar.f4505b = fVar2;
                        fVar.f4506c = z11;
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
                                } else if (i12 != -2 && ((fVar3 = eVar.d) == null || fVar3.f3749a != 1)) {
                                    eVar.c(4);
                                } else {
                                    eVar.b(0);
                                    eVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f4500b;
                        handler.getClass();
                        this.h = new h(fVar.f4504a, onAudioFocusChangeListener, handler, fVar.f4505b, fVar.f4506c, fVar.d);
                    }
                    int h = i.h((AudioManager) this.f4499a.get(), this.h);
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
