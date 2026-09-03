package j3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
public final class d {
    public final AudioManager f9019a;
    public final c f9020b;
    public c0 f9021c;
    public l3.d d;
    public int f9022e;
    public int f9023f;
    public float f9024g = 1.0f;
    public AudioFocusRequest h;

    public d(Context context, Handler handler, c0 c0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f9019a = audioManager;
        this.f9021c = c0Var;
        this.f9020b = new c(this, handler);
        this.f9022e = 0;
    }

    public final void a() {
        if (this.f9022e == 0) {
            return;
        }
        int i10 = h5.d0.f7237a;
        AudioManager audioManager = this.f9019a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f9020b);
        }
        c(0);
    }

    public final void b(l3.d r7) {
        throw new UnsupportedOperationException("Method not decompiled: j3.d.b(l3.d):void");
    }

    public final void c(int i10) {
        float f10;
        if (this.f9022e != i10) {
            this.f9022e = i10;
            if (i10 == 3) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f9024g != f10) {
                this.f9024g = f10;
                c0 c0Var = this.f9021c;
                if (c0Var != null) {
                    f0 f0Var = c0Var.f9000a;
                    f0Var.V(1, 2, Float.valueOf(f0Var.Y * f0Var.f9136z.f9024g));
                }
            }
        }
    }

    public final int d(int i10, boolean z4) {
        int i11;
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        boolean z10;
        if (i10 != 1 && this.f9023f == 1) {
            if (z4) {
                if (this.f9022e != 1) {
                    int i12 = h5.d0.f7237a;
                    AudioManager audioManager = this.f9019a;
                    c cVar = this.f9020b;
                    if (i12 >= 26) {
                        AudioFocusRequest audioFocusRequest = this.h;
                        if (audioFocusRequest == null) {
                            if (audioFocusRequest == null) {
                                builder = new AudioFocusRequest.Builder(this.f9023f);
                            } else {
                                builder = new AudioFocusRequest.Builder(this.h);
                            }
                            l3.d dVar = this.d;
                            if (dVar != null && dVar.f11494a == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            dVar.getClass();
                            this.h = builder.setAudioAttributes((AudioAttributes) dVar.a().f16617b).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(cVar).build();
                        }
                        requestAudioFocus = audioManager.requestAudioFocus(this.h);
                    } else {
                        l3.d dVar2 = this.d;
                        dVar2.getClass();
                        int i13 = dVar2.f11496c;
                        if (i13 != 13) {
                            switch (i13) {
                                case 2:
                                    i11 = 0;
                                    break;
                                case 3:
                                    i11 = 8;
                                    break;
                                case 4:
                                    i11 = 4;
                                    break;
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                    i11 = 5;
                                    break;
                                case 6:
                                    i11 = 2;
                                    break;
                                default:
                                    i11 = 3;
                                    break;
                            }
                        } else {
                            i11 = 1;
                        }
                        requestAudioFocus = audioManager.requestAudioFocus(cVar, i11, this.f9023f);
                    }
                    if (requestAudioFocus == 1) {
                        c(1);
                        return 1;
                    }
                    c(0);
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        a();
        if (!z4) {
            return -1;
        }
        return 1;
    }
}
