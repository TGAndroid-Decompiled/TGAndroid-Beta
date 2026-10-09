package di;

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
import yh.s;
public final class a implements Runnable {
    public final int f8370a;
    public final Context f8371b;

    public a(Context context, int i10) {
        this.f8370a = i10;
        this.f8371b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f8370a) {
            case 0:
                new s(this.f8371b).show();
                return;
            case 1:
                of.f.s(this.f8371b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new a(this.f8371b, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new a(this.f8371b, 4));
                return;
            case 4:
                r4.d.s(this.f8371b, new a3.b(2), r4.d.f46961a, false);
                return;
            case 5:
                new s(this.f8371b).show();
                return;
            case 6:
                of.f.s(this.f8371b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                new s(this.f8371b).show();
                return;
            case 8:
                of.f.s(this.f8371b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 9:
                of.f.s(this.f8371b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 10:
                of.f.s(this.f8371b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 11:
                of.f.s(this.f8371b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            default:
                of.f.s(this.f8371b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
        }
    }

    public a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f8370a = 2;
        this.f8371b = context;
    }
}
