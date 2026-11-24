package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class uk0 implements gm6, vx3, s1d {
    public final Context a;

    public uk0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                return;
            case 2:
            default:
                context.getClass();
                this.a = context;
                return;
            case 3:
                this.a = context.getApplicationContext();
                return;
        }
    }

    public static int f(defpackage.go4 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk0.f(go4):int");
    }

    @Override
    public final Object a() {
        return this.a;
    }

    @Override
    public final hm6 b(eq eqVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || ((context = this.a) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = wf7.h(((go4) eqVar.c).t);
            ncd.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(hac.K(h)));
            ry ryVar = new ry(new qy(h, (byte) 0), new qy(h, (byte) 1));
            ryVar.b = true;
            return ryVar.b(eqVar);
        }
        return new kg7((byte) 27).b(eqVar);
    }

    @Override
    public final void c(bhe bheVar) {
        ds2 ds2Var = new ds2("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), ds2Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new pz2(this, bheVar, threadPoolExecutor, (byte) 19));
    }

    public final Object d(Context context, m23 m23Var, ky7 ky7Var) {
        vb1 vb1Var = new vb1(1, fne.a(ky7Var));
        vb1Var.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        vb1Var.u(new z23(cancellationSignal, (byte) 0));
        nl9 nl9Var = new nl9(vb1Var, (byte) 23);
        kc kcVar = new kc((byte) 1);
        context.getClass();
        d33 a = dk0.a(new dk0(this.a, (byte) 1), m23Var);
        if (a == null) {
            nl9Var.A(new n13("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            nl9Var.A(new n13("createCredential is not supported on this device", (byte) 3));
        } else {
            a.onCreateCredential(context, m23Var, cancellationSignal, kcVar, nl9Var);
        }
        return vb1Var.q();
    }

    public final void e(Context context, xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        executor.getClass();
        d33 a = dk0.a(new dk0(context, (byte) 1), xu4Var);
        if (a == null) {
            a33Var.A(new uu4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else {
            a.onGetCredential(context, xu4Var, cancellationSignal, executor, a33Var);
        }
    }

    public uk0(Context context, int i) {
        this.a = context;
    }
}
