package ei;

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
import zh.t;
public final class a implements Runnable {
    public final int f8785a;
    public final Context f8786b;

    public a(Context context, int i10) {
        this.f8785a = i10;
        this.f8786b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f8785a) {
            case 0:
                new t(this.f8786b).show();
                return;
            case 1:
                pf.d.r(this.f8786b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.g.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new a(this.f8786b, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new a(this.f8786b, 4));
                return;
            case 4:
                r4.d.s(this.f8786b, new a3.b(2), r4.d.f43663a, false);
                return;
            case 5:
                new t(this.f8786b).show();
                return;
            case 6:
                pf.d.r(this.f8786b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                new t(this.f8786b).show();
                return;
            case 8:
                pf.d.r(this.f8786b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 9:
                pf.d.r(this.f8786b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 10:
                pf.d.r(this.f8786b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 11:
                pf.d.r(this.f8786b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            default:
                pf.d.r(this.f8786b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
        }
    }

    public a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f8785a = 2;
        this.f8786b = context;
    }
}
