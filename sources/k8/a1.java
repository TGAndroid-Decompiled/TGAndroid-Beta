package k8;

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
import m.s3;
public final class a1 extends z5.g {
    public final ExecutorService Q;
    public final i0 R;
    public final i0 S;
    public final i0 T;
    public final i0 U;
    public final i0 V;
    public final i0 W;
    public final i0 X;
    public final i0 Y;
    public final i0 Z;
    public final i0 f13467a0;
    public final b1 f13468b0;

    public a1(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, s3 s3Var) {
        super(context, looper, 14, s3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        b1 a2 = b1.a(context);
        this.R = new i0(0);
        this.S = new i0(0);
        this.T = new i0(0);
        this.U = new i0(0);
        this.V = new i0(0);
        this.W = new i0(0);
        this.X = new i0(0);
        this.Y = new i0(0);
        this.Z = new i0(0);
        this.f13467a0 = new i0(0);
        z5.l.h(unconfigurableExecutorService);
        this.Q = unconfigurableExecutorService;
        this.f13468b0 = a2;
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
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.R.c(iBinder);
            this.S.c(iBinder);
            this.T.c(iBinder);
            this.V.c(iBinder);
            this.W.c(iBinder);
            this.X.c(iBinder);
            this.Y.c(iBinder);
            this.Z.c(iBinder);
            this.f13467a0.c(iBinder);
            this.U.c(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final void d(z5.b bVar) {
        int i10;
        z5.a0 a0Var = this.v;
        AtomicInteger atomicInteger = this.N;
        Context context = this.f50618n;
        if (!j()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i10 = bundle.getInt("com.google.android.wearable.api.version", 0);
                } else {
                    i10 = 0;
                }
                if (i10 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i10);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, r7.b.f47084a);
                    z5.l.i(bVar, "Connection progress callbacks cannot be null.");
                    this.A = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                z5.l.i(bVar, "Connection progress callbacks cannot be null.");
                this.A = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.d(bVar);
    }

    @Override
    public final boolean j() {
        if (!this.f13468b0.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final int k() {
        return 8600000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof h0) {
            return (h0) queryLocalInterface;
        }
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 8);
    }

    @Override
    public final w5.c[] r() {
        return j8.j.f11283b;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override
    public final String x() {
        if (this.f13468b0.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
}
