package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class vj0 implements im6, fx3 {
    public final Context a;

    public vj0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                return;
            case 2:
                this.a = context;
                return;
            case 3:
                this.a = context.getApplicationContext();
                return;
            default:
                context.getClass();
                this.a = context;
                return;
        }
    }

    public static int e(defpackage.ko4 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj0.e(ko4):int");
    }

    @Override
    public final jm6 a(fp fpVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || ((context = this.a) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = dg7.h(((ko4) fpVar.c).t);
            efd.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(gcc.K(h)));
            rx rxVar = new rx(new qx(h, (byte) 0), new qx(h, (byte) 1));
            rxVar.b = true;
            return rxVar.a(fpVar);
        }
        return new rg7((byte) 27).a(fpVar);
    }

    @Override
    public final void b(rje rjeVar) {
        lr2 lr2Var = new lr2("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), lr2Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new cv2(this, rjeVar, threadPoolExecutor, (byte) 21));
    }

    public final Object c(Context context, t13 t13Var, pz7 pz7Var) {
        va1 va1Var = new va1(1, xpe.a(pz7Var));
        va1Var.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        va1Var.u(new g23(cancellationSignal, (byte) 0));
        zm9 zm9Var = new zm9(va1Var, (byte) 23);
        ic icVar = new ic((byte) 1);
        context.getClass();
        k23 b = ej0.b(new ej0(this.a, (byte) 1), t13Var);
        if (b == null) {
            zm9Var.B(new v03("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            zm9Var.B(new v03("createCredential is not supported on this device", (byte) 3));
        } else {
            b.onCreateCredential(context, t13Var, cancellationSignal, icVar, zm9Var);
        }
        return va1Var.q();
    }

    public final void d(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        executor.getClass();
        k23 b = ej0.b(new ej0(context, (byte) 1), av4Var);
        if (b == null) {
            h23Var.B(new xu4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else {
            b.onGetCredential(context, av4Var, cancellationSignal, executor, h23Var);
        }
    }
}
