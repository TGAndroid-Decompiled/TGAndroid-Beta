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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.a30;
public final class a implements Runnable {
    public final int f1111a;
    public final Context f1112b;

    public a(Context context, int i7) {
        this.f1111a = i7;
        this.f1112b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        int i7 = this.f1111a;
        Context context = this.f1112b;
        switch (i7) {
            case 0:
                d.a(context);
                return;
            case 1:
                new a30(context).show();
                return;
            case 2:
                new a30(context).show();
                return;
            case 3:
                vf.c.t(context, gd.N0(2131744725, null));
                return;
            case 4:
                vf.c.t(context, gd.N0(2131744725, null));
                return;
            case 5:
                vf.c.t(context, gd.N0(2131747540, null));
                return;
            case 6:
                vf.c.t(context, gd.N0(2131744778, null));
                return;
            case 7:
                vf.c.t(context, gd.N0(2131744725, null));
                return;
            case 8:
                vf.c.t(context, gd.N0(2131744803, null));
                return;
            case 9:
                new a30(context).show();
                return;
            case 10:
                vf.c.t(context, gd.N0(2131752494, null));
                return;
            case 11:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = u4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new a(context, 12), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 12:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new a(context, 13));
                return;
            default:
                u4.d.s(context, new d3.b(3), u4.d.f58442a, false);
                return;
        }
    }

    public a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f1111a = 11;
        this.f1112b = context;
    }
}
