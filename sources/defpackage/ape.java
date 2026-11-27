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
public final class ape extends d05 {
    public final ExecutorService F;
    public final ma4 G;
    public final ma4 H;
    public final ma4 I;
    public final ma4 J;
    public final ma4 K;
    public final ma4 L;
    public final ma4 M;
    public final ma4 N;
    public final ma4 O;
    public final ma4 P;
    public final kqe Q;

    public ape(k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(14, k05Var, l05Var, oxbVar, context, looper);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        kqe a = kqe.a(context);
        this.G = new ma4((byte) 1);
        this.H = new ma4((byte) 1);
        this.I = new ma4((byte) 1);
        this.J = new ma4((byte) 1);
        this.K = new ma4((byte) 1);
        this.L = new ma4((byte) 1);
        this.M = new ma4((byte) 1);
        this.N = new ma4((byte) 1);
        this.O = new ma4((byte) 1);
        this.P = new ma4((byte) 1);
        xve.h(unconfigurableExecutorService);
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
    public final void a(fg0 fg0Var) {
        int i;
        igd igdVar = this.k;
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
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, vrd.a);
                    xve.i(fg0Var, "Connection progress callbacks cannot be null.");
                    this.o = fg0Var;
                    igdVar.sendMessage(igdVar.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                xve.i(fg0Var, "Connection progress callbacks cannot be null.");
                this.o = fg0Var;
                igdVar.sendMessage(igdVar.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.a(fg0Var);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof b4e) {
            return (b4e) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.wearable.internal.IWearableService", (byte) 9);
    }

    @Override
    public final a94[] f() {
        return hjd.a;
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
            this.G.a(iBinder);
            this.H.a(iBinder);
            this.I.a(iBinder);
            this.K.a(iBinder);
            this.L.a(iBinder);
            this.M.a(iBinder);
            this.N.a(iBinder);
            this.O.a(iBinder);
            this.P.a(iBinder);
            this.J.a(iBinder);
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
