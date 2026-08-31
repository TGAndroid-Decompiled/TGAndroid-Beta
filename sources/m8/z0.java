package m8;

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
import m.r3;
public final class z0 extends b6.g {
    public final ExecutorService R;
    public final bb.c S;
    public final bb.c T;
    public final bb.c U;
    public final bb.c V;
    public final bb.c W;
    public final bb.c X;
    public final bb.c Y;
    public final bb.c Z;
    public final bb.c f13599a0;
    public final bb.c f13600b0;
    public final a1 f13601c0;

    public z0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, r3 r3Var) {
        super(context, looper, 14, r3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        a1 a2 = a1.a(context);
        this.S = new bb.c();
        this.T = new bb.c();
        this.U = new bb.c();
        this.V = new bb.c();
        this.W = new bb.c();
        this.X = new bb.c();
        this.Y = new bb.c();
        this.Z = new bb.c();
        this.f13599a0 = new bb.c();
        this.f13600b0 = new bb.c();
        b6.m.h(unconfigurableExecutorService);
        this.R = unconfigurableExecutorService;
        this.f13601c0 = a2;
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
            this.S.a(iBinder);
            this.T.a(iBinder);
            this.U.a(iBinder);
            this.W.a(iBinder);
            this.X.a(iBinder);
            this.Y.a(iBinder);
            this.Z.a(iBinder);
            this.f13599a0.a(iBinder);
            this.f13600b0.a(iBinder);
            this.V.a(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final boolean j() {
        if (!this.f13601c0.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final int k() {
        return 8600000;
    }

    @Override
    public final void n(b6.b bVar) {
        int i10;
        b6.b0 b0Var = this.v;
        AtomicInteger atomicInteger = this.O;
        Context context = this.f1718n;
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
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, t7.b.f48027a);
                    b6.m.i(bVar, "Connection progress callbacks cannot be null.");
                    this.B = bVar;
                    b0Var.sendMessage(b0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                b6.m.i(bVar, "Connection progress callbacks cannot be null.");
                this.B = bVar;
                b0Var.sendMessage(b0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.n(bVar);
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
        return new a7.a(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 9);
    }

    @Override
    public final y5.c[] r() {
        return l8.j.f12127b;
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
        if (this.f13601c0.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
}
