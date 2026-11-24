package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.utils.twidget.z;
public final class vf1 implements Runnable {
    public final byte a;
    public final Context b;

    public vf1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = (byte) 6;
        this.b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                d01.t(context, k96.M0(2131752494, null));
                return;
            case 1:
                bkb.J(context, false);
                return;
            case 2:
                new wb5(context).show();
                return;
            case 3:
                o85.k(context);
                return;
            case 4:
                d01.t(context, k96.M0(2131744729, null));
                return;
            case 5:
                Activity W = gl.W(context);
                if (W == null) {
                    W = LaunchActivity.H1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    return;
                }
                return;
            case 6:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = er8.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new vf1(context, (byte) 7), new Random().nextInt(1000) + 5000);
                return;
            case 7:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new vf1(context, (byte) 8));
                return;
            case 8:
                acd.b(context, new hc((byte) 1), acd.a, false);
                return;
            case 9:
                d01.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 10:
                d01.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 11:
                d01.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 12:
                d01.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 13:
                d01.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 14:
                d01.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 15:
                new wb5(context).show();
                return;
            case 16:
                d01.t(context, k96.M0(2131744729, null));
                return;
            case 17:
                d01.t(context, k96.M0(2131744729, null));
                return;
            case 18:
                d01.t(context, k96.M0(2131747541, null));
                return;
            case 19:
                d01.t(context, k96.M0(2131744782, null));
                return;
            case 20:
                d01.t(context, k96.M0(2131744729, null));
                return;
            case 21:
                d01.t(context, k96.M0(2131744807, null));
                return;
            case 22:
                Activity W2 = gl.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, h26.l1(10)));
                    return;
                }
                return;
            case 23:
                Activity W3 = gl.W(context);
                if (W3 instanceof LaunchActivity) {
                    ((LaunchActivity) W3).t0(new PremiumPreviewFragment(0, h26.l1(9)));
                    return;
                }
                return;
            case 24:
                new wb5(context).show();
                return;
            case 25:
                d01.v(context, k96.M0(2131743955, null), false);
                return;
            case 26:
                d01.v(context, k96.M0(2131743955, null), false);
                return;
            case 27:
                new jmc(context.getApplicationContext(), 2131232816, 46, new jc((byte) 10));
                return;
            case 28:
                d01.t(context, k96.M0(2131742680, null));
                return;
            default:
                z.d(context);
                return;
        }
    }

    public vf1(Context context, byte b) {
        this.a = b;
        this.b = context;
    }
}
