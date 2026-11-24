package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
public final class lme extends zz4 {
    public final ExecutorService F;
    public final eod G;
    public final eod H;
    public final eod I;
    public final eod J;
    public final eod K;
    public final eod L;
    public final eod M;
    public final eod N;
    public final eod O;
    public final eod P;
    public final vne Q;

    public lme(f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(14, f05Var, g05Var, ovbVar, context, looper);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        vne a = vne.a(context);
        this.G = new eod((byte) 1);
        this.H = new eod((byte) 1);
        this.I = new eod((byte) 1);
        this.J = new eod((byte) 1);
        this.K = new eod((byte) 1);
        this.L = new eod((byte) 1);
        this.M = new eod((byte) 1);
        this.N = new eod((byte) 1);
        this.O = new eod((byte) 1);
        this.P = new eod((byte) 1);
        ite.h(unconfigurableExecutorService);
        this.F = unconfigurableExecutorService;
        this.Q = a;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    @Override
    public final void a(fh0 fh0Var) {
        int i;
        rdd rddVar = this.k;
        AtomicInteger atomicInteger = this.C;
        Context context = this.h;
        if (!v()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                } else {
                    i = 0;
                }
                if (i < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, hpd.a);
                    ite.i(fh0Var, "Connection progress callbacks cannot be null.");
                    this.o = fh0Var;
                    rddVar.sendMessage(rddVar.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                ite.i(fh0Var, "Connection progress callbacks cannot be null.");
                this.o = fh0Var;
                rddVar.sendMessage(rddVar.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.a(fh0Var);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof o1e) {
            return (o1e) queryLocalInterface;
        }
        return new f1d(iBinder, "com.google.android.gms.wearable.internal.IWearableService", (byte) 9);
    }

    @Override
    public final o94[] f() {
        return rgd.a;
    }

    @Override
    public final int i() {
        return 8600000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override
    public final String o() {
        if (this.Q.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }

    @Override
    public final void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.G.d(iBinder);
            this.H.d(iBinder);
            this.I.d(iBinder);
            this.K.d(iBinder);
            this.L.d(iBinder);
            this.M.d(iBinder);
            this.N.d(iBinder);
            this.O.d(iBinder);
            this.P.d(iBinder);
            this.J.d(iBinder);
            i = 0;
        }
        super.u(i, iBinder, bundle, i2);
    }

    @Override
    public final boolean v() {
        if (!this.Q.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean x() {
        return true;
    }
}
