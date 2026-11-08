package b9;

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
import m.q3;
public final class y0 extends q6.h {
    public final ExecutorService F;
    public final cb.c G;
    public final cb.c H;
    public final cb.c I;
    public final cb.c J;
    public final cb.c K;
    public final cb.c L;
    public final cb.c M;
    public final cb.c N;
    public final cb.c O;
    public final cb.c P;
    public final z0 Q;

    public y0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, q3 q3Var) {
        super(context, looper, 14, q3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        z0 a10 = z0.a(context);
        this.G = new cb.c(10);
        this.H = new cb.c(10);
        this.I = new cb.c(10);
        this.J = new cb.c(10);
        this.K = new cb.c(10);
        this.L = new cb.c(10);
        this.M = new cb.c(10);
        this.N = new cb.c(10);
        this.O = new cb.c(10);
        this.P = new cb.c(10);
        q6.m.g(unconfigurableExecutorService);
        this.F = unconfigurableExecutorService;
        this.Q = a10;
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
    public final boolean c() {
        if (!this.Q.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return 8600000;
    }

    @Override
    public final void h(q6.b bVar) {
        int i7;
        q6.c0 c0Var = this.f53845k;
        AtomicInteger atomicInteger = this.C;
        Context context = this.h;
        if (!c()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i7 = bundle.getInt("com.google.android.wearable.api.version", 0);
                } else {
                    i7 = 0;
                }
                if (i7 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i7);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i8.b.f15399a);
                    q6.m.h(bVar, "Connection progress callbacks cannot be null.");
                    this.f53849o = bVar;
                    c0Var.sendMessage(c0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                q6.m.h(bVar, "Connection progress callbacks cannot be null.");
                this.f53849o = bVar;
                c0Var.sendMessage(c0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.h(bVar);
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof f0) {
            return (f0) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 6);
    }

    @Override
    public final n6.c[] k() {
        return a9.c.f755b;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override
    public final String q() {
        if (this.Q.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }

    @Override
    public final void w(int i7, IBinder iBinder, Bundle bundle, int i10) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i7);
        }
        if (i7 == 0) {
            this.G.E(iBinder);
            this.H.E(iBinder);
            this.I.E(iBinder);
            this.K.E(iBinder);
            this.L.E(iBinder);
            this.M.E(iBinder);
            this.N.E(iBinder);
            this.O.E(iBinder);
            this.P.E(iBinder);
            this.J.E(iBinder);
            i7 = 0;
        }
        super.w(i7, iBinder, bundle, i10);
    }

    @Override
    public final boolean x() {
        return true;
    }
}
