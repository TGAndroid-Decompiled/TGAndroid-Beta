package h3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
public final class d {
    public final AudioManager f9367a;
    public final c f9368b;
    public h0 f9369c;
    public j3.e d;
    public int f9370e;
    public int f9371f;
    public float f9372g = 1.0f;
    public AudioFocusRequest h;

    public d(Context context, Handler handler, h0 h0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f9367a = audioManager;
        this.f9369c = h0Var;
        this.f9368b = new c(this, handler);
        this.f9370e = 0;
    }

    public final void a() {
        if (this.f9370e == 0) {
            return;
        }
        int i9 = d5.f0.f4349a;
        AudioManager audioManager = this.f9367a;
        if (i9 >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f9368b);
        }
        c(0);
    }

    public final void b(j3.e r7) {
        throw new UnsupportedOperationException("Method not decompiled: h3.d.b(j3.e):void");
    }

    public final void c(int i9) {
        float f10;
        if (this.f9370e != i9) {
            this.f9370e = i9;
            if (i9 == 3) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f9372g != f10) {
                this.f9372g = f10;
                h0 h0Var = this.f9369c;
                if (h0Var != null) {
                    k0 k0Var = h0Var.f9440a;
                    k0Var.c0(1, 2, Float.valueOf(k0Var.f9531a0 * k0Var.A.f9372g));
                }
            }
        }
    }

    public final int d(int i9, boolean z10) {
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        boolean z11;
        if (i9 != 1 && this.f9371f == 1) {
            if (z10) {
                if (this.f9370e != 1) {
                    int i10 = d5.f0.f4349a;
                    AudioManager audioManager = this.f9367a;
                    c cVar = this.f9368b;
                    if (i10 >= 26) {
                        AudioFocusRequest audioFocusRequest = this.h;
                        if (audioFocusRequest == null) {
                            if (audioFocusRequest == null) {
                                builder = new AudioFocusRequest.Builder(this.f9371f);
                            } else {
                                builder = new AudioFocusRequest.Builder(this.h);
                            }
                            j3.e eVar = this.d;
                            if (eVar != null && eVar.f13225a == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            eVar.getClass();
                            this.h = builder.setAudioAttributes((AudioAttributes) eVar.a().f281b).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(cVar).build();
                        }
                        requestAudioFocus = audioManager.requestAudioFocus(this.h);
                    } else {
                        j3.e eVar2 = this.d;
                        eVar2.getClass();
                        requestAudioFocus = audioManager.requestAudioFocus(cVar, d5.f0.y(eVar2.f13227c), this.f9371f);
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
