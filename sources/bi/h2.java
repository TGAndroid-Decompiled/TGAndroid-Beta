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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.x20;
public final class h2 implements Runnable {
    public final int f3634a;
    public final Context f3635b;

    public h2(Context context, int i7) {
        this.f3634a = i7;
        this.f3635b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        int i7 = this.f3634a;
        Context context = this.f3635b;
        switch (i7) {
            case 0:
                new x20(context).show();
                return;
            case 1:
                new x20(context).show();
                return;
            case 2:
                vf.c.t(context, gd.N0(2131744725, null));
                return;
            case 3:
                vf.c.t(context, gd.N0(2131744725, null));
                return;
            case 4:
                vf.c.t(context, gd.N0(2131747540, null));
                return;
            case 5:
                vf.c.t(context, gd.N0(2131744778, null));
                return;
            case 6:
                vf.c.t(context, gd.N0(2131744725, null));
                return;
            case 7:
                vf.c.t(context, gd.N0(2131744803, null));
                return;
            case 8:
                new x20(context).show();
                return;
            case 9:
                vf.c.t(context, gd.N0(2131752494, null));
                return;
            case 10:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = u4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new h2(context, 11), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 11:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h2(context, 12));
                return;
            default:
                u4.d.s(context, new d3.b(3), u4.d.f58526a, false);
                return;
        }
    }

    public h2(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f3634a = 10;
        this.f3635b = context;
    }
}
