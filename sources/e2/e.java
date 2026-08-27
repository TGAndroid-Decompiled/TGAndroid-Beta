package e2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import hh.g0;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.kb0;

public final class e implements Runnable {

    public final int f5174a;

    public final Context f5175b;

    public e(Context context, int i10) {
        this.f5174a = i10;
        this.f5175b = context;
    }

    @Override
    public final void run() {
        switch (this.f5174a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e(this.f5175b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f5175b, 2));
                break;
            case 2:
                d.s(this.f5175b, new kb0(1), d.f5166a, false);
                break;
            case 3:
                new g0(this.f5175b).show();
                break;
            case 4:
                we.e.s(this.f5175b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 5:
                new g0(this.f5175b).show();
                break;
            case 6:
                we.e.s(this.f5175b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                we.e.s(this.f5175b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                we.e.s(this.f5175b, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 9:
                we.e.s(this.f5175b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            case 10:
                we.e.s(this.f5175b, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
            case 11:
                new g0(this.f5175b).show();
                break;
            default:
                we.e.s(this.f5175b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
        }
    }

    public e(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f5174a = 0;
        this.f5175b = context;
    }
}
