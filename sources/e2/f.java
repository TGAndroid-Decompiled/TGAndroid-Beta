package e2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import gh.g0;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.gb0;
public final class f implements Runnable {
    public final int f4817a;
    public final Context f4818b;

    public f(Context context, int i9) {
        this.f4817a = i9;
        this.f4818b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f4817a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = h.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new f(this.f4818b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f4818b, 2));
                return;
            case 2:
                e.s(this.f4818b, new gb0(1), e.f4809a, false);
                return;
            case 3:
                new g0(this.f4818b).show();
                return;
            case 4:
                ve.e.s(this.f4818b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 5:
                new g0(this.f4818b).show();
                return;
            case 6:
                ve.e.s(this.f4818b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                ve.e.s(this.f4818b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                ve.e.s(this.f4818b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 9:
                ve.e.s(this.f4818b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            case 10:
                ve.e.s(this.f4818b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
            case 11:
                new g0(this.f4818b).show();
                return;
            default:
                ve.e.s(this.f4818b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
        }
    }

    public f(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f4817a = 0;
        this.f4818b = context;
    }
}
