package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class lq9 implements Runnable {
    public final byte a;
    public final er9 b;

    public lq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override
    public final void run() {
        String str;
        Bitmap bitmap;
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.e();
                return;
            case 1:
                LaunchActivity launchActivity = er9Var.a;
                Typeface typeface = hl.a;
                if (Settings.canDrawOverlays(launchActivity) && !ir9.d()) {
                    ir9.e(launchActivity);
                    return;
                }
                return;
            case 2:
                TextView textView = er9Var.x;
                if (!er9Var.u0 && !er9Var.J0) {
                    if (xc2.w(14, er9Var.d)) {
                        textView.setText(hl.S2(ob6.M0(2131747894, null)));
                    } else {
                        TLRPC.Chat chat = er9Var.d;
                        if (chat != null) {
                            str = chat.title;
                        } else {
                            str = "";
                        }
                        textView.setText(ob6.a0(null, null, 2131747893, str));
                    }
                    er9Var.w.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    ik8.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
            case 3:
                if (!er9Var.J0) {
                    hl.d3(er9Var.N0, 2000L);
                    if (er9Var.u0 && !er9Var.T && !er9Var.I0 && er9Var.s0 && i86.e(512) && (bitmap = er9Var.n.getBitmap(4, 4)) != null) {
                        int b2 = er9.b(0, bitmap);
                        int b3 = er9.b(2, bitmap);
                        bitmap.recycle();
                        int i = er9Var.z0;
                        int i2 = er9Var.A0;
                        if (i != b2 || i2 != b3) {
                            if (i == 0) {
                                i = b2 & 16777215;
                            }
                            er9Var.B0 = i;
                            if (i2 == 0) {
                                i2 = b3 & 16777215;
                            }
                            er9Var.C0 = i2;
                            er9Var.D0 = b2;
                            er9Var.E0 = b3;
                            er9Var.F0 = SystemClock.uptimeMillis();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                er9Var.q();
                return;
            case 5:
                er9Var.dismiss();
                return;
            case 6:
                er9Var.a0 = false;
                er9Var.k(!er9Var.n0, true);
                return;
            case 7:
                if (er9Var.K.I) {
                    er9Var.j();
                    return;
                } else {
                    er9Var.k(false, true);
                    return;
                }
            default:
                er9 er9Var2 = er9.Q0;
                er9Var.u();
                return;
        }
    }
}
