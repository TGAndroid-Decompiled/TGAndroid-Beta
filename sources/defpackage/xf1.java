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
public final class xf1 implements Runnable {
    public final byte a;
    public final Context b;

    public xf1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
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
                m01.u(context, ob6.M0(2131752481, null));
                return;
            case 1:
                aob.J(context, false);
                return;
            case 2:
                new xd5(context).show();
                return;
            case 3:
                ra5.k(context);
                return;
            case 4:
                m01.u(context, ob6.M0(2131744623, null));
                return;
            case 5:
                Activity W = hl.W(context);
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
                    handler = ou8.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new xf1(context, (byte) 7), new Random().nextInt(1000) + 5000);
                return;
            case 7:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new xf1(context, (byte) 8));
                return;
            case 8:
                tgd.b(context, new ic((byte) 1), tgd.a, false);
                return;
            case 9:
                m01.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 10:
                m01.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 11:
                m01.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 12:
                m01.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 13:
                m01.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 14:
                m01.u(context, "https://promote.telegram.org/guidelines");
                return;
            case 15:
                new xd5(context).show();
                return;
            case 16:
                m01.u(context, ob6.M0(2131744623, null));
                return;
            case 17:
                m01.u(context, ob6.M0(2131744623, null));
                return;
            case 18:
                m01.u(context, ob6.M0(2131747461, null));
                return;
            case 19:
                m01.u(context, ob6.M0(2131744676, null));
                return;
            case 20:
                m01.u(context, ob6.M0(2131744623, null));
                return;
            case 21:
                m01.u(context, ob6.M0(2131744701, null));
                return;
            case 22:
                Activity W2 = hl.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, l46.m1(10)));
                    return;
                }
                return;
            case 23:
                Activity W3 = hl.W(context);
                if (W3 instanceof LaunchActivity) {
                    ((LaunchActivity) W3).t0(new PremiumPreviewFragment(0, l46.m1(9)));
                    return;
                }
                return;
            case 24:
                new xd5(context).show();
                return;
            case 25:
                m01.w(context, ob6.M0(2131743849, null), false);
                return;
            case 26:
                m01.w(context, ob6.M0(2131743849, null), false);
                return;
            case 27:
                new wqc(context.getApplicationContext(), 2131232835, 46, new kc((byte) 10));
                return;
            case 28:
                m01.u(context, ob6.M0(2131742574, null));
                return;
            default:
                z.d(context);
                return;
        }
    }

    public xf1(Context context, byte b) {
        this.a = b;
        this.b = context;
    }
}
