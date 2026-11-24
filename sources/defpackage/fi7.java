package defpackage;

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.voiceengine.WebRtcAudioRecord;
public final class fi7 implements WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback, ed, yc3, eia, fia, os7, ll5, dn7, ml0, no7 {
    public final byte a;

    public fi7(byte b) {
        this.a = b;
    }

    public static NotificationChannel d(Object obj) {
        return (NotificationChannel) obj;
    }

    public static Font f(Object obj) {
        return (Font) obj;
    }

    public static void g(Object obj) {
        throw new AssertionError(obj);
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        oy8 y;
        if (z && !z2 && (y = imageReceiver.y()) != null) {
            y.start();
        }
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        return vxc.b;
    }

    @Override
    public final Typeface a() {
        switch (this.a) {
            case 14:
                return gl.n1("fonts/rmedium.ttf");
            case 15:
                return gl.n1("fonts/rmediumitalic.ttf");
            case 16:
                return Typeface.create("serif", 1);
            case 17:
                return gl.n1("fonts/rcondensedbold.ttf");
            case 18:
                return gl.n1("fonts/rmono.ttf");
            default:
                return gl.n1("fonts/mw_bold.ttf");
        }
    }

    @Override
    public final void b(Object obj, float f) {
        er7 er7Var = (er7) obj;
        switch (this.a) {
            case 8:
                er7Var.f = f;
                if (!er7Var.E || er7Var.G) {
                    er7Var.c.setStrokeWidth(gl.R1(er7Var.w, er7Var.x, f));
                    er7Var.f();
                }
                er7Var.invalidate();
                return;
            case 9:
            default:
                er7Var.s = f;
                er7Var.f();
                return;
            case 10:
                er7Var.n = f;
                if (!er7Var.E || er7Var.G) {
                    er7Var.f();
                }
                er7Var.invalidate();
                return;
        }
    }

    @Override
    public final String c(int i) {
        if (i == 0) {
            return k96.M0(2131753796, null);
        }
        if (i == 1) {
            return k96.a0("AutoLockInTime", null, 2131753795, k96.G(1, "Minutes", new Object[0]));
        }
        if (i == 2) {
            return k96.a0("AutoLockInTime", null, 2131753795, k96.G(5, "Minutes", new Object[0]));
        }
        if (i == 3) {
            return k96.a0("AutoLockInTime", null, 2131753795, k96.G(1, "Hours", new Object[0]));
        }
        if (i == 4) {
            return k96.a0("AutoLockInTime", null, 2131753795, k96.G(5, "Hours", new Object[0]));
        }
        return "";
    }

    @Override
    public final float get(Object obj) {
        er7 er7Var = (er7) obj;
        switch (this.a) {
            case 7:
                return er7Var.f;
            case 8:
            default:
                return er7Var.s;
            case 9:
                return er7Var.n;
        }
    }

    @Override
    public final int k(wjb wjbVar, boolean z) {
        Bitmap bitmap = uv8.a;
        return (((int) ls6.d(lcd.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.e(audioSamples);
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 4:
                hdVar.dismiss();
                return;
            case 5:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new hmc());
                    return;
                }
                return;
            case 25:
                hdVar.dismiss();
                return;
            case 26:
                hdVar.dismiss();
                return;
            case 27:
                Drawable[] drawableArr = PhotoViewer.d9;
                return;
            case 28:
                hdVar.dismiss();
                return;
            default:
                hdVar.dismiss();
                return;
        }
    }

    @Override
    public final void h(mt8 mt8Var) {
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
