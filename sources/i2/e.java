package i2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import v7.v6;
public final class e {
    public final d9.j f11632a;
    public final Handler f11633b;
    public p0 f11634c;
    public b2.e d;
    public int f11636f;
    public c2.c h;
    public float f11637g = 1.0f;
    public int f11635e = 0;

    public e(Context context, Looper looper, p0 p0Var) {
        this.f11632a = v6.a(new d(context, 0));
        this.f11634c = p0Var;
        this.f11633b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.f11635e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            c2.d.a((AudioManager) this.f11632a.get(), this.h);
        }
    }

    public final void b(int i10) {
        p0 p0Var = this.f11634c;
        if (p0Var != null) {
            e2.z zVar = p0Var.f11853n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8591a = zVar.f8593a.obtainMessage(33, i10, 0);
            b10.b();
        }
    }

    public final void c(int i10) {
        float f7;
        if (this.f11635e != i10) {
            this.f11635e = i10;
            if (i10 == 4) {
                f7 = 0.2f;
            } else {
                f7 = 1.0f;
            }
            if (this.f11637g != f7) {
                this.f11637g = f7;
                p0 p0Var = this.f11634c;
                if (p0Var != null) {
                    p0Var.f11853n.e(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        c2.a aVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f11636f) == 1) {
            if (z10) {
                if (this.f11635e != 2) {
                    c2.c cVar = this.h;
                    if (cVar == null) {
                        if (cVar == null) {
                            ?? obj = new Object();
                            obj.f3995c = b2.e.h;
                            obj.f3994b = i11;
                            aVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f3994b = cVar.f3998a;
                            obj2.f3995c = cVar.d;
                            obj2.f3993a = cVar.f4001e;
                            aVar = obj2;
                        }
                        b2.e eVar = this.d;
                        if (eVar != null && eVar.f3277a == 1) {
                            z11 = true;
                        }
                        eVar.getClass();
                        aVar.f3995c = eVar;
                        aVar.f3993a = z11;
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
                                } else if (i12 != -2 && ((eVar2 = eVar3.d) == null || eVar2.f3277a != 1)) {
                                    eVar3.c(4);
                                } else {
                                    eVar3.b(0);
                                    eVar3.c(3);
                                }
                            }
                        };
                        Handler handler = this.f11633b;
                        handler.getClass();
                        this.h = new c2.c(aVar.f3994b, onAudioFocusChangeListener, handler, (b2.e) aVar.f3995c, aVar.f3993a);
                    }
                    if (c2.d.h((AudioManager) this.f11632a.get(), this.h) == 1) {
                        c(2);
                        return 1;
                    }
                    c(1);
                    return -1;
                }
            } else {
                int i12 = this.f11635e;
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
