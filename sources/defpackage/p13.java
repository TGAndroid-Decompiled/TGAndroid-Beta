package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class p13 implements dk6, kw3 {
    public final Context a;

    public p13(Context context, byte b) {
        switch (b) {
            case 2:
                this.a = context.getApplicationContext();
                return;
            default:
                context.getClass();
                this.a = context;
                return;
        }
    }

    @Override
    public final ek6 a(ep epVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || ((context = this.a) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = ud7.h(((fm4) epVar.c).t);
            lad.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(g8c.K(h)));
            qx qxVar = new qx(new px(h, (byte) 0), new px(h, (byte) 1));
            qxVar.b = true;
            return qxVar.a(epVar);
        }
        return new ie7((byte) 27).a(epVar);
    }

    @Override
    public final void b(afe afeVar) {
        sq2 sq2Var = new sq2("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), sq2Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new mg3(this, afeVar, threadPoolExecutor, (byte) 17));
    }

    public final Object c(Context context, a13 a13Var, hw7 hw7Var) {
        na1 na1Var = new na1(1, dle.a(hw7Var));
        na1Var.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        na1Var.u(new n13(cancellationSignal, (byte) 0));
        i4d i4dVar = new i4d(na1Var);
        hc hcVar = new hc((byte) 1);
        context.getClass();
        s13 b = uj0.b(new uj0(this.a, (byte) 1), a13Var);
        if (b == null) {
            i4dVar.M(new c03("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            i4dVar.M(new c03("createCredential is not supported on this device", (byte) 3));
        } else {
            b.onCreateCredential(context, a13Var, cancellationSignal, hcVar, i4dVar);
        }
        return na1Var.q();
    }

    public final void d(Context context, ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        executor.getClass();
        s13 b = uj0.b(new uj0(context, (byte) 1), ws4Var);
        if (b == null) {
            o13Var.M(new ts4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else {
            b.onGetCredential(context, ws4Var, cancellationSignal, executor, o13Var);
        }
    }

    public final PackageInfo e(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public p13(Context context, char c) {
        this.a = context;
    }
}
