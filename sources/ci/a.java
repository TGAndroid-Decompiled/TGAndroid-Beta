package ci;

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
import xh.t;
public final class a implements Runnable {
    public final int f4694a;
    public final Context f4695b;

    public a(Context context, int i10) {
        this.f4694a = i10;
        this.f4695b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f4694a) {
            case 0:
                new t(this.f4695b).show();
                return;
            case 1:
                nf.f.s(this.f4695b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new a(this.f4695b, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new a(this.f4695b, 4));
                return;
            case 4:
                r4.d.s(this.f4695b, new a3.b(2), r4.d.f41243a, false);
                return;
            case 5:
                new t(this.f4695b).show();
                return;
            case 6:
                nf.f.s(this.f4695b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                new t(this.f4695b).show();
                return;
            case 8:
                nf.f.s(this.f4695b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 9:
                nf.f.s(this.f4695b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 10:
                nf.f.s(this.f4695b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 11:
                nf.f.s(this.f4695b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            default:
                nf.f.s(this.f4695b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
        }
    }

    public a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f4694a = 2;
        this.f4695b = context;
    }
}
