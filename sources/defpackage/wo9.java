package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class wo9 implements Runnable {
    public final byte a;
    public final pp9 b;

    public wo9(pp9 pp9Var, byte b) {
        this.a = b;
        this.b = pp9Var;
    }

    @Override
    public final void run() {
        String str;
        Bitmap bitmap;
        byte b = this.a;
        pp9 pp9Var = this.b;
        switch (b) {
            case 0:
                pp9Var.e();
                return;
            case 1:
                LaunchActivity launchActivity = pp9Var.a;
                Typeface typeface = gm.a;
                if (Settings.canDrawOverlays(launchActivity) && !tp9.d()) {
                    tp9.f(launchActivity);
                    return;
                }
                return;
            case 2:
                TextView textView = pp9Var.x;
                if (!pp9Var.u0 && !pp9Var.J0) {
                    if (sd2.w(14, pp9Var.d)) {
                        textView.setText(gm.S2(jb6.M0(2131747897, null)));
                    } else {
                        TLRPC.Chat chat = pp9Var.d;
                        if (chat != null) {
                            str = chat.title;
                        } else {
                            str = "";
                        }
                        textView.setText(jb6.a0(null, null, 2131747896, str));
                    }
                    pp9Var.w.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    wi8.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
            case 3:
                if (!pp9Var.J0) {
                    gm.d3(pp9Var.N0, 2000L);
                    if (pp9Var.u0 && !pp9Var.T && !pp9Var.I0 && pp9Var.s0 && e86.e(512) && (bitmap = pp9Var.n.getBitmap(4, 4)) != null) {
                        int b2 = pp9.b(0, bitmap);
                        int b3 = pp9.b(2, bitmap);
                        bitmap.recycle();
                        int i = pp9Var.z0;
                        int i2 = pp9Var.A0;
                        if (i != b2 || i2 != b3) {
                            if (i == 0) {
                                i = b2 & 16777215;
                            }
                            pp9Var.B0 = i;
                            if (i2 == 0) {
                                i2 = b3 & 16777215;
                            }
                            pp9Var.C0 = i2;
                            pp9Var.D0 = b2;
                            pp9Var.E0 = b3;
                            pp9Var.F0 = SystemClock.uptimeMillis();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                pp9Var.q();
                return;
            case 5:
                pp9Var.dismiss();
                return;
            case 6:
                pp9Var.a0 = false;
                pp9Var.k(!pp9Var.n0, true);
                return;
            case 7:
                if (pp9Var.K.I) {
                    pp9Var.j();
                    return;
                } else {
                    pp9Var.k(false, true);
                    return;
                }
            default:
                pp9 pp9Var2 = pp9.Q0;
                pp9Var.u();
                return;
        }
    }
}
