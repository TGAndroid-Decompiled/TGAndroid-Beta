package e2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jh.f0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ib0;
public final class e implements Runnable {
    public final int f5787a;
    public final Context f5788b;

    public e(Context context, int i10) {
        this.f5787a = i10;
        this.f5788b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f5787a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = g.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new e(this.f5788b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f5788b, 2));
                return;
            case 2:
                d.s(this.f5788b, new ib0(1), d.f5779a, false);
                return;
            case 3:
                new f0(this.f5788b).show();
                return;
            case 4:
                ye.d.s(this.f5788b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 5:
                new f0(this.f5788b).show();
                return;
            case 6:
                ye.d.s(this.f5788b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                ye.d.s(this.f5788b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                ye.d.s(this.f5788b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 9:
                ye.d.s(this.f5788b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            case 10:
                ye.d.s(this.f5788b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
            case 11:
                new f0(this.f5788b).show();
                return;
            default:
                ye.d.s(this.f5788b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
        }
    }

    public e(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f5787a = 0;
        this.f5788b = context;
    }
}
