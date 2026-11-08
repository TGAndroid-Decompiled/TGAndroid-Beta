package bi;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.m20;
public final class pa implements Runnable {
    public final int f4540a;
    public final Context f4541b;

    public pa(Context context, int i7) {
        this.f4540a = i7;
        this.f4541b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        int i7 = this.f4540a;
        Context context = this.f4541b;
        switch (i7) {
            case 0:
                new m20(context).show();
                return;
            case 1:
                vf.c.t(context, org.telegram.messenger.id.M0(2131744969, null));
                return;
            case 2:
                vf.c.t(context, org.telegram.messenger.id.M0(2131744969, null));
                return;
            case 3:
                vf.c.t(context, org.telegram.messenger.id.M0(2131747735, null));
                return;
            case 4:
                vf.c.t(context, org.telegram.messenger.id.M0(2131745022, null));
                return;
            case 5:
                vf.c.t(context, org.telegram.messenger.id.M0(2131744969, null));
                return;
            case 6:
                vf.c.t(context, org.telegram.messenger.id.M0(2131745047, null));
                return;
            case 7:
                new m20(context).show();
                return;
            case 8:
                vf.c.t(context, org.telegram.messenger.id.M0(2131752506, null));
                return;
            case 9:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = u4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new pa(context, 10), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 10:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new pa(context, 11));
                return;
            case 11:
                u4.d.s(context, new d3.b(3), u4.d.f56322a, false);
                return;
            default:
                new m20(context).show();
                return;
        }
    }

    public pa(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f4540a = 9;
        this.f4541b = context;
    }
}
