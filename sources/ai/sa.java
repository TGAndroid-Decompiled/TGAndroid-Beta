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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sa implements Runnable {
    public final int f2169a;
    public final Context f2170b;

    public sa(Context context, int i10) {
        this.f2169a = i10;
        this.f2170b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f2169a) {
            case 0:
                pf.d.r(this.f2170b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 1:
                new o0(this.f2170b).show();
                return;
            case 2:
                pf.d.r(this.f2170b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 3:
                pf.d.r(this.f2170b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 4:
                pf.d.r(this.f2170b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 5:
                pf.d.r(this.f2170b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            case 6:
                pf.d.r(this.f2170b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
            case 7:
                new o0(this.f2170b).show();
                return;
            case 8:
                pf.d.r(this.f2170b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
            case 9:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.g.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new sa(this.f2170b, 10), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 10:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new sa(this.f2170b, 11));
                return;
            case 11:
                r4.d.s(this.f2170b, new a3.b(2), r4.d.f45417a, false);
                return;
            default:
                new o0(this.f2170b).show();
                return;
        }
    }

    public sa(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f2169a = 9;
        this.f2170b = context;
    }
}
