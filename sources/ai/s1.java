package ai;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.i20;
public final class s1 implements Runnable {
    public final int f965a;
    public final Context f966b;

    public s1(Context context, int i3) {
        this.f965a = i3;
        this.f966b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        int i3 = this.f965a;
        Context context = this.f966b;
        switch (i3) {
            case 0:
                new i20(context).show();
                return;
            case 1:
                new i20(context).show();
                return;
            case 2:
                sf.c.t(context, bd.M0(2131744976, null));
                return;
            case 3:
                sf.c.t(context, bd.M0(2131744976, null));
                return;
            case 4:
                sf.c.t(context, bd.M0(2131747742, null));
                return;
            case 5:
                sf.c.t(context, bd.M0(2131745029, null));
                return;
            case 6:
                sf.c.t(context, bd.M0(2131744976, null));
                return;
            case 7:
                sf.c.t(context, bd.M0(2131745054, null));
                return;
            case 8:
                new i20(context).show();
                return;
            case 9:
                sf.c.t(context, bd.M0(2131752506, null));
                return;
            case 10:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = t4.g.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new s1(context, 11), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 11:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new s1(context, 12));
                return;
            default:
                t4.e.s(context, new c3.b(3), t4.e.f54915a, false);
                return;
        }
    }

    public s1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f965a = 10;
        this.f966b = context;
    }
}
