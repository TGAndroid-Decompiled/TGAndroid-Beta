package i2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.vision.e2;
import v7.v6;
public final class e {
    public final d9.i f10125a;
    public final Handler f10126b;
    public n0 f10127c;
    public b2.e d;
    public int f10128f;
    public c2.c h;
    public float f10129g = 1.0f;
    public int e = 0;

    public e(Context context, Looper looper, n0 n0Var) {
        this.f10125a = v6.a(new d(context, 0));
        this.f10127c = n0Var;
        this.f10126b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.e;
        if (i10 != 1 && i10 != 0 && this.h != null) {
            c2.d.a((AudioManager) this.f10125a.get(), this.h);
        }
    }

    public final void b(int i10) {
        n0 n0Var = this.f10127c;
        if (n0Var != null) {
            e2.z zVar = n0Var.f10298n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7241a = zVar.f7243a.obtainMessage(33, i10, 0);
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
            if (this.f10129g != f7) {
                this.f10129g = f7;
                n0 n0Var = this.f10127c;
                if (n0Var != null) {
                    n0Var.f10298n.e(34);
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        c2.a aVar;
        boolean z11 = false;
        if (i10 != 1 && (i11 = this.f10128f) == 1) {
            if (z10) {
                if (this.e != 2) {
                    c2.c cVar = this.h;
                    if (cVar == null) {
                        if (cVar == null) {
                            ?? obj = new Object();
                            obj.f4072c = b2.e.h;
                            obj.f4071b = i11;
                            aVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f4071b = cVar.f4075a;
                            obj2.f4072c = cVar.d;
                            obj2.f4070a = cVar.e;
                            aVar = obj2;
                        }
                        b2.e eVar = this.d;
                        if (eVar != null && eVar.f1661a == 1) {
                            z11 = true;
                        }
                        eVar.getClass();
                        aVar.f4072c = eVar;
                        aVar.f4070a = z11;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                            @Override
                            public final void onAudioFocusChange(int i12) {
                                b2.e eVar2;
                                e eVar3 = e.this;
                                eVar3.getClass();
                                if (i12 != -3 && i12 != -2) {
                                    if (i12 != -1) {
                                        if (i12 != 1) {
                                            e2.l(i12, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        }
                                        eVar3.c(2);
                                        eVar3.b(1);
                                        return;
                                    }
                                    eVar3.b(-1);
                                    eVar3.a();
                                    eVar3.c(1);
                                } else if (i12 != -2 && ((eVar2 = eVar3.d) == null || eVar2.f1661a != 1)) {
                                    eVar3.c(4);
                                } else {
                                    eVar3.b(0);
                                    eVar3.c(3);
                                }
                            }
                        };
                        Handler handler = this.f10126b;
                        handler.getClass();
                        this.h = new c2.c(aVar.f4071b, onAudioFocusChangeListener, handler, (b2.e) aVar.f4072c, aVar.f4070a);
                    }
                    if (c2.d.h((AudioManager) this.f10125a.get(), this.h) == 1) {
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
