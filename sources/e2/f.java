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
import lh.f0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.tb0;
public final class f implements Runnable {
    public final int f5073a;
    public final Context f5074b;

    public f(Context context, int i10) {
        this.f5073a = i10;
        this.f5074b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f5073a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = h.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new f(this.f5074b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f5074b, 2));
                return;
            case 2:
                e.s(this.f5074b, new tb0(1), e.f5066a, false);
                return;
            case 3:
                new f0(this.f5074b).show();
                return;
            case 4:
                ze.d.s(this.f5074b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 5:
                new f0(this.f5074b).show();
                return;
            case 6:
                ze.d.s(this.f5074b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                ze.d.s(this.f5074b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                ze.d.s(this.f5074b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 9:
                ze.d.s(this.f5074b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            case 10:
                ze.d.s(this.f5074b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
            case 11:
                new f0(this.f5074b).show();
                return;
            default:
                ze.d.s(this.f5074b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
        }
    }

    public f(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f5073a = 0;
        this.f5074b = context;
    }
}
