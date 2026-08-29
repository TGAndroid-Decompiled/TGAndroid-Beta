package j3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
public final class d {
    public final AudioManager f10406a;
    public final c f10407b;
    public h0 f10408c;
    public l3.e d;
    public int f10409e;
    public int f10410f;
    public float f10411g = 1.0f;
    public AudioFocusRequest h;

    public d(Context context, Handler handler, h0 h0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f10406a = audioManager;
        this.f10408c = h0Var;
        this.f10407b = new c(this, handler);
        this.f10409e = 0;
    }

    public final void a() {
        if (this.f10409e == 0) {
            return;
        }
        int i10 = f5.d0.f6579a;
        AudioManager audioManager = this.f10406a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f10407b);
        }
        c(0);
    }

    public final void b(l3.e r7) {
        throw new UnsupportedOperationException("Method not decompiled: j3.d.b(l3.e):void");
    }

    public final void c(int i10) {
        float f9;
        if (this.f10409e != i10) {
            this.f10409e = i10;
            if (i10 == 3) {
                f9 = 0.2f;
            } else {
                f9 = 1.0f;
            }
            if (this.f10411g != f9) {
                this.f10411g = f9;
                h0 h0Var = this.f10408c;
                if (h0Var != null) {
                    k0 k0Var = h0Var.f10477a;
                    k0Var.c0(1, 2, Float.valueOf(k0Var.f10568a0 * k0Var.A.f10411g));
                }
            }
        }
    }

    public final int d(int i10, boolean z10) {
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        boolean z11;
        if (i10 != 1 && this.f10410f == 1) {
            if (z10) {
                if (this.f10409e != 1) {
                    int i11 = f5.d0.f6579a;
                    AudioManager audioManager = this.f10406a;
                    c cVar = this.f10407b;
                    if (i11 >= 26) {
                        AudioFocusRequest audioFocusRequest = this.h;
                        if (audioFocusRequest == null) {
                            if (audioFocusRequest == null) {
                                builder = new AudioFocusRequest.Builder(this.f10410f);
                            } else {
                                builder = new AudioFocusRequest.Builder(this.h);
                            }
                            l3.e eVar = this.d;
                            if (eVar != null && eVar.f14077a == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            eVar.getClass();
                            this.h = builder.setAudioAttributes((AudioAttributes) eVar.a().f7981b).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(cVar).build();
                        }
                        requestAudioFocus = audioManager.requestAudioFocus(this.h);
                    } else {
                        l3.e eVar2 = this.d;
                        eVar2.getClass();
                        requestAudioFocus = audioManager.requestAudioFocus(cVar, f5.d0.y(eVar2.f14079c), this.f10410f);
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
        if (!z10) {
            return -1;
        }
        return 1;
    }
}
