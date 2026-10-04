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
public final class b implements Runnable {
    public final int f8360a;
    public final Context f8361b;

    public b(Context context, int i10) {
        this.f8360a = i10;
        this.f8361b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        switch (this.f8360a) {
            case 0:
                new s(this.f8361b).show();
                return;
            case 1:
                nf.f.s(this.f8361b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new b(this.f8361b, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new b(this.f8361b, 4));
                return;
            case 4:
                r4.d.s(this.f8361b, new a3.b(2), r4.d.f45804a, false);
                return;
            case 5:
                new s(this.f8361b).show();
                return;
            case 6:
                nf.f.s(this.f8361b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                new s(this.f8361b).show();
                return;
            case 8:
                nf.f.s(this.f8361b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 9:
                nf.f.s(this.f8361b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 10:
                nf.f.s(this.f8361b, LocaleController.getString(R.string.PaidContentInfoLink));
                return;
            case 11:
                nf.f.s(this.f8361b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                return;
            default:
                nf.f.s(this.f8361b, LocaleController.getString(R.string.StarsReactionTermsLink));
                return;
        }
    }

    public b(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f8360a = 2;
        this.f8361b = context;
    }
}
