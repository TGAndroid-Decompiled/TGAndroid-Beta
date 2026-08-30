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
import org.telegram.ui.rb0;
public final class f implements Runnable {
    public final int f5067a;
    public final Context f5068b;

    public f(Context context, int i10) {
        this.f5067a = i10;
        this.f5068b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f5067a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = h.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new f(this.f5068b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f5068b, 2));
                return;
            case 2:
                e.s(this.f5068b, new rb0(1), e.f5060a, false);
                return;
            case 3:
                new f0(this.f5068b).show();
                return;
            case 4:
                af.g.s(this.f5068b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 5:
                new f0(this.f5068b).show();
                return;
            case 6:
                af.g.s(this.f5068b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                af.g.s(this.f5068b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 8:
                af.g.s(this.f5068b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 9:
                af.g.s(this.f5068b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            case 10:
                af.g.s(this.f5068b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
            case 11:
                new f0(this.f5068b).show();
                return;
            default:
                af.g.s(this.f5068b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
        }
    }

    public f(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f5067a = 0;
        this.f5068b = context;
    }
}
