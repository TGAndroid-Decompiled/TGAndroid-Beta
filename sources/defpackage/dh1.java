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
public final class dh1 implements Runnable {
    public final byte a;
    public final Context b;

    public dh1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
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
                l11.u(context, jb6.M0(2131752453, null));
                return;
            case 1:
                cmb.J(context, false);
                return;
            case 2:
                new ud5(context).show();
                return;
            case 3:
                oa5.k(context);
                return;
            case 4:
                l11.u(context, jb6.M0(2131744655, null));
                return;
            case 5:
                Activity W = gm.W(context);
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
                    handler = ht8.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new dh1(context, (byte) 7), new Random().nextInt(1000) + 5000);
                return;
            case 7:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new dh1(context, (byte) 8));
                return;
            case 8:
                ced.b(context, new kc((byte) 1), ced.a, false);
                return;
            case 9:
                l11.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 10:
                l11.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 11:
                l11.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 12:
                l11.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 13:
                l11.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 14:
                l11.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 15:
                new ud5(context).show();
                return;
            case 16:
                l11.u(context, jb6.M0(2131744655, null));
                return;
            case 17:
                l11.u(context, jb6.M0(2131744655, null));
                return;
            case 18:
                l11.u(context, jb6.M0(2131747467, null));
                return;
            case 19:
                l11.u(context, jb6.M0(2131744708, null));
                return;
            case 20:
                l11.u(context, jb6.M0(2131744655, null));
                return;
            case 21:
                l11.u(context, jb6.M0(2131744733, null));
                return;
            case 22:
                Activity W2 = gm.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, i46.l1(10)));
                    return;
                }
                return;
            case 23:
                Activity W3 = gm.W(context);
                if (W3 instanceof LaunchActivity) {
                    ((LaunchActivity) W3).t0(new PremiumPreviewFragment(0, i46.l1(9)));
                    return;
                }
                return;
            case 24:
                new ud5(context).show();
                return;
            case 25:
                l11.w(context, jb6.M0(2131743881, null), false);
                return;
            case 26:
                l11.w(context, jb6.M0(2131743881, null), false);
                return;
            case 27:
                new ioc(context.getApplicationContext(), 2131232829, 46, new jd((byte) 10));
                return;
            case 28:
                l11.u(context, jb6.M0(2131742606, null));
                return;
            default:
                z.d(context);
                return;
        }
    }

    public dh1(Context context, byte b) {
        this.a = b;
        this.b = context;
    }
}
