package b4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import b2.s;
import e2.d0;
import e2.v;
import java.util.List;
public final class d implements w3.c {
    public int f3376a;
    public int f3377b;
    public final Object f3378c;

    public d(Context context) {
        this.f3377b = 0;
        this.f3378c = context;
    }

    @Override
    public int a() {
        return this.f3376a;
    }

    @Override
    public int b() {
        return this.f3377b;
    }

    @Override
    public int c() {
        int i10 = this.f3376a;
        if (i10 == -1) {
            return ((v) this.f3378c).B();
        }
        return i10;
    }

    public int d() {
        return ((((byte[]) this.f3378c).length - this.f3376a) * 8) - this.f3377b;
    }

    public int e(int i10) {
        byte[] bArr = (byte[]) this.f3378c;
        if (i10 >= 1 && i10 <= 32 && i10 <= d()) {
            int i11 = this.f3377b;
            int i12 = 0;
            if (i11 > 0) {
                int i13 = 8 - i11;
                int min = Math.min(i10, i13);
                int i14 = i13 - min;
                int i15 = this.f3376a;
                int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
                i10 -= min;
                int i17 = this.f3377b + min;
                this.f3377b = i17;
                if (i17 == 8) {
                    this.f3377b = 0;
                    this.f3376a = i15 + 1;
                }
                i12 = i16;
            }
            if (i10 > 0) {
                while (i10 >= 8) {
                    int i18 = i12 << 8;
                    int i19 = this.f3376a;
                    this.f3376a = i19 + 1;
                    i10 -= 8;
                    i12 = i18 | (bArr[i19] & 255);
                }
                if (i10 > 0) {
                    int i20 = 8 - i10;
                    int i21 = ((bArr[this.f3376a] & ((255 >> i20) << i20)) >> i20) | (i12 << i10);
                    this.f3377b += i10;
                    return i21;
                }
            }
            return i12;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public synchronized int f() {
        PackageInfo packageInfo;
        if (this.f3376a == 0) {
            try {
                packageInfo = w6.b.a((Context) this.f3378c).e(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f3376a = packageInfo.versionCode;
            }
        }
        return this.f3376a;
    }

    public synchronized int g() {
        int i10 = this.f3377b;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f3378c;
        PackageManager packageManager = context.getPackageManager();
        if (w6.b.a(context).f13503a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!u6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f3377b = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.f3377b = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == u6.b.d()) {
            i11 = 2;
        }
        this.f3377b = i11;
        return i11;
    }

    public d(byte[] bArr) {
        this.f3378c = bArr;
    }

    public d(int i10, int i11, SparseArray sparseArray) {
        this.f3376a = i10;
        this.f3377b = i11;
        this.f3378c = sparseArray;
    }

    public d(f2.d dVar, s sVar) {
        v vVar = dVar.f8784c;
        this.f3378c = vVar;
        vVar.J(12);
        int B = vVar.B();
        if ("audio/raw".equals(sVar.f3301r)) {
            int t10 = d0.t(sVar.L) * sVar.J;
            if (B == 0 || B % t10 != 0) {
                e2.a.n("BoxParsers", "Audio sample size mismatch. stsd sample size: " + t10 + ", stsz sample size: " + B);
                B = t10;
            }
        }
        this.f3376a = B == 0 ? -1 : B;
        this.f3377b = vVar.B();
    }
}
