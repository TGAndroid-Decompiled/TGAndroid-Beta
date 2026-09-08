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
public final class d implements w3.b {
    public int f2479a;
    public int f2480b;
    public final Object f2481c;

    public d(Context context) {
        this.f2480b = 0;
        this.f2481c = context;
    }

    @Override
    public int a() {
        return this.f2479a;
    }

    @Override
    public int b() {
        return this.f2480b;
    }

    @Override
    public int c() {
        int i10 = this.f2479a;
        if (i10 == -1) {
            return ((v) this.f2481c).B();
        }
        return i10;
    }

    public int d() {
        return ((((byte[]) this.f2481c).length - this.f2479a) * 8) - this.f2480b;
    }

    public int e(int i10) {
        byte[] bArr = (byte[]) this.f2481c;
        if (i10 >= 1 && i10 <= 32 && i10 <= d()) {
            int i11 = this.f2480b;
            int i12 = 0;
            if (i11 > 0) {
                int i13 = 8 - i11;
                int min = Math.min(i10, i13);
                int i14 = i13 - min;
                int i15 = this.f2479a;
                int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
                i10 -= min;
                int i17 = this.f2480b + min;
                this.f2480b = i17;
                if (i17 == 8) {
                    this.f2480b = 0;
                    this.f2479a = i15 + 1;
                }
                i12 = i16;
            }
            if (i10 > 0) {
                while (i10 >= 8) {
                    int i18 = i12 << 8;
                    int i19 = this.f2479a;
                    this.f2479a = i19 + 1;
                    i10 -= 8;
                    i12 = i18 | (bArr[i19] & 255);
                }
                if (i10 > 0) {
                    int i20 = 8 - i10;
                    int i21 = ((bArr[this.f2479a] & ((255 >> i20) << i20)) >> i20) | (i12 << i10);
                    this.f2480b += i10;
                    return i21;
                }
            }
            return i12;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public synchronized int f() {
        PackageInfo packageInfo;
        if (this.f2479a == 0) {
            try {
                packageInfo = w6.b.a((Context) this.f2481c).d(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("Metadata", "Failed to find package ".concat(e7.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f2479a = packageInfo.versionCode;
            }
        }
        return this.f2479a;
    }

    public synchronized int g() {
        int i10 = this.f2480b;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f2481c;
        PackageManager packageManager = context.getPackageManager();
        if (w6.b.a(context).f14849a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!u6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f2480b = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.f2480b = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == u6.b.d()) {
            i11 = 2;
        }
        this.f2480b = i11;
        return i11;
    }

    public d(byte[] bArr) {
        this.f2481c = bArr;
    }

    public d(int i10, int i11, SparseArray sparseArray) {
        this.f2479a = i10;
        this.f2480b = i11;
        this.f2481c = sparseArray;
    }

    public d(f2.e eVar, s sVar) {
        v vVar = eVar.f9205c;
        this.f2481c = vVar;
        vVar.J(12);
        int B = vVar.B();
        if ("audio/raw".equals(sVar.f2397r)) {
            int t10 = d0.t(sVar.L) * sVar.J;
            if (B == 0 || B % t10 != 0) {
                e2.a.n("BoxParsers", "Audio sample size mismatch. stsd sample size: " + t10 + ", stsz sample size: " + B);
                B = t10;
            }
        }
        this.f2479a = B == 0 ? -1 : B;
        this.f2480b = vVar.B();
    }
}
