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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ra implements Runnable {
    public final int f5364a;
    public final Context f5365b;

    public ra(Context context, int i10) {
        this.f5364a = i10;
        this.f5365b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f5364a) {
            case 0:
                qf.d.r(this.f5365b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 1:
                new q0(this.f5365b).show();
                return;
            case 2:
                qf.d.r(this.f5365b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 3:
                qf.d.r(this.f5365b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 4:
                qf.d.r(this.f5365b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 5:
                qf.d.r(this.f5365b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            case 6:
                qf.d.r(this.f5365b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
            case 7:
                new q0(this.f5365b).show();
                return;
            case 8:
                qf.d.r(this.f5365b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
            case 9:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new ra(this.f5365b, 10), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 10:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ra(this.f5365b, 11));
                return;
            case 11:
                r4.d.s(this.f5365b, new a3.b(2), r4.d.f47319a, false);
                return;
            default:
                new q0(this.f5365b).show();
                return;
        }
    }

    public ra(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f5364a = 9;
        this.f5365b = context;
    }
}
