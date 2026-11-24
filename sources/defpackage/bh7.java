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
public final class bh7 implements xk0, ql5, WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback, ee, ke3, gka, hka, pu7, ln5, hp7, mm0, qq7 {
    public final byte a;

    public bh7(byte b) {
        this.a = b;
    }

    public static NotificationChannel g(Object obj) {
        return (NotificationChannel) obj;
    }

    public static Font i(Object obj) {
        return (Font) obj;
    }

    public static void j(Object obj) {
        throw new AssertionError(obj);
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        return wzc.b;
    }

    @Override
    public final Typeface a() {
        switch (this.a) {
            case 16:
                return gm.n1("fonts/rmedium.ttf");
            case 17:
                return gm.n1("fonts/rmediumitalic.ttf");
            case 18:
                return Typeface.create("serif", 1);
            case 19:
                return gm.n1("fonts/rcondensedbold.ttf");
            case 20:
                return gm.n1("fonts/rmono.ttf");
            default:
                return gm.n1("fonts/mw_bold.ttf");
        }
    }

    @Override
    public final Object b(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        p09 y;
        if (z && !z2 && (y = imageReceiver.y()) != null) {
            y.start();
        }
    }

    @Override
    public final String c(int i) {
        if (i == 0) {
            return jb6.M0(2131753764, null);
        }
        if (i == 1) {
            return jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(1, "Minutes", new Object[0]));
        }
        if (i == 2) {
            return jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(5, "Minutes", new Object[0]));
        }
        if (i == 3) {
            return jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(1, "Hours", new Object[0]));
        }
        if (i == 4) {
            return jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(5, "Hours", new Object[0]));
        }
        return "";
    }

    @Override
    public final void d(Object obj, float f) {
        gt7 gt7Var = (gt7) obj;
        switch (this.a) {
            case 10:
                gt7Var.f = f;
                if (!gt7Var.E || gt7Var.G) {
                    gt7Var.c.setStrokeWidth(gm.R1(gt7Var.w, gt7Var.x, f));
                    gt7Var.f();
                }
                gt7Var.invalidate();
                return;
            case 11:
            default:
                gt7Var.s = f;
                gt7Var.f();
                return;
            case 12:
                gt7Var.n = f;
                if (!gt7Var.E || gt7Var.G) {
                    gt7Var.f();
                }
                gt7Var.invalidate();
                return;
        }
    }

    @Override
    public final boolean e(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77 && i3 == 76 && i4 == 76) {
                if (i5 == 84 || i == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final float get(Object obj) {
        gt7 gt7Var = (gt7) obj;
        switch (this.a) {
            case 9:
                return gt7Var.f;
            case 10:
            default:
                return gt7Var.s;
            case 11:
                return gt7Var.n;
        }
    }

    @Override
    public final int o(ylb ylbVar, boolean z) {
        Bitmap bitmap = vx8.a;
        return (((int) kt6.d(ned.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.e(audioSamples);
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 6:
                heVar.dismiss();
                return;
            case 7:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new goc());
                    return;
                }
                return;
            case 27:
                heVar.dismiss();
                return;
            case 28:
                heVar.dismiss();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                return;
        }
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void f(nv8 nv8Var) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
