package h3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

public final class d {

    public final AudioManager f7798a;

    public final c f7799b;

    public h0 f7800c;
    public j3.e d;

    public int f7801e;

    public int f7802f;

    public float f7803g = 1.0f;
    public AudioFocusRequest h;

    public d(Context context, Handler handler, h0 h0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f7798a = audioManager;
        this.f7800c = h0Var;
        this.f7799b = new c(this, handler);
        this.f7801e = 0;
    }

    public final void a() {
        if (this.f7801e == 0) {
            return;
        }
        int i10 = d5.g0.f4795a;
        AudioManager audioManager = this.f7798a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f7799b);
        }
        c(0);
    }

    public final void b(j3.e eVar) {
        int i10;
        if (d5.g0.a(this.d, eVar)) {
            return;
        }
        this.d = eVar;
        if (eVar != null) {
            int i11 = eVar.f12323c;
            i10 = 3;
            switch (i11) {
                case 0:
                    d5.a.K("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                    i10 = 1;
                    break;
                case 1:
                case 14:
                    i10 = 1;
                    break;
                case 2:
                case 4:
                    i10 = 2;
                    break;
                case 3:
                    i10 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    break;
                case 11:
                    if (eVar.f12321a == 1) {
                        i10 = 2;
                    }
                    break;
                case 15:
                default:
                    com.google.android.recaptcha.internal.a.s(i11, "Unidentified audio usage: ", "AudioFocusManager");
                    i10 = 0;
                    break;
                case 16:
                    if (d5.g0.f4795a < 19) {
                        i10 = 2;
                    } else {
                        i10 = 4;
                    }
                    break;
            }
        } else {
            i10 = 0;
        }
        this.f7802f = i10;
        d5.a.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 == 1 || i10 == 0);
    }

    public final void c(int i10) {
        if (this.f7801e == i10) {
            return;
        }
        this.f7801e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f7803g == f10) {
            return;
        }
        this.f7803g = f10;
        h0 h0Var = this.f7800c;
        if (h0Var != null) {
            k0 k0Var = h0Var.f7870a;
            k0Var.c0(1, 2, Float.valueOf(k0Var.f7961a0 * k0Var.A.f7803g));
        }
    }

    public final int d(int i10, boolean z10) {
        int iRequestAudioFocus;
        if (i10 == 1 || this.f7802f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f7801e != 1) {
                int i11 = d5.g0.f4795a;
                AudioManager audioManager = this.f7798a;
                c cVar = this.f7799b;
                if (i11 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.h;
                    if (audioFocusRequest == null) {
                        AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f7802f) : new AudioFocusRequest.Builder(this.h);
                        j3.e eVar = this.d;
                        boolean z11 = eVar != null && eVar.f12321a == 1;
                        eVar.getClass();
                        this.h = builder.setAudioAttributes((AudioAttributes) eVar.a().f181b).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(cVar).build();
                    }
                    iRequestAudioFocus = audioManager.requestAudioFocus(this.h);
                } else {
                    j3.e eVar2 = this.d;
                    eVar2.getClass();
                    iRequestAudioFocus = audioManager.requestAudioFocus(cVar, d5.g0.y(eVar2.f12323c), this.f7802f);
                }
                if (iRequestAudioFocus == 1) {
                    c(1);
                    return 1;
                }
                c(0);
                return -1;
            }
        }
    }
}
