package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class vm9 implements Runnable {
    public final byte a;
    public final on9 b;

    public vm9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override
    public final void run() {
        String str;
        Bitmap bitmap;
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.e();
                return;
            case 1:
                LaunchActivity launchActivity = on9Var.a;
                Typeface typeface = gl.a;
                if (Settings.canDrawOverlays(launchActivity) && !sn9.c()) {
                    sn9.d(launchActivity);
                    return;
                }
                return;
            case 2:
                TextView textView = on9Var.x;
                if (!on9Var.u0 && !on9Var.J0) {
                    if (hc2.w(14, on9Var.d)) {
                        textView.setText(gl.T2(k96.M0(2131747971, null)));
                    } else {
                        TLRPC.Chat chat = on9Var.d;
                        if (chat != null) {
                            str = chat.title;
                        } else {
                            str = "";
                        }
                        textView.setText(k96.a0(null, null, 2131747970, str));
                    }
                    on9Var.w.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    ug8.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
            case 3:
                if (!on9Var.J0) {
                    gl.e3(on9Var.N0, 2000L);
                    if (on9Var.u0 && !on9Var.T && !on9Var.I0 && on9Var.s0 && e66.e(512) && (bitmap = on9Var.n.getBitmap(4, 4)) != null) {
                        int b2 = on9.b(0, bitmap);
                        int b3 = on9.b(2, bitmap);
                        bitmap.recycle();
                        int i = on9Var.z0;
                        int i2 = on9Var.A0;
                        if (i != b2 || i2 != b3) {
                            if (i == 0) {
                                i = b2 & 16777215;
                            }
                            on9Var.B0 = i;
                            if (i2 == 0) {
                                i2 = b3 & 16777215;
                            }
                            on9Var.C0 = i2;
                            on9Var.D0 = b2;
                            on9Var.E0 = b3;
                            on9Var.F0 = SystemClock.uptimeMillis();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                on9Var.q();
                return;
            case 5:
                on9Var.dismiss();
                return;
            case 6:
                on9Var.a0 = false;
                on9Var.k(!on9Var.n0, true);
                return;
            case 7:
                if (on9Var.K.I) {
                    on9Var.j();
                    return;
                } else {
                    on9Var.k(false, true);
                    return;
                }
            default:
                on9 on9Var2 = on9.Q0;
                on9Var.u();
                return;
        }
    }
}
