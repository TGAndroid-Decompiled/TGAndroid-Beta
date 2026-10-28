package b4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import e2.n0;
import e2.x;
import java.util.List;
public final class d implements w3.b {
    public int f3619a;
    public int f3620b;
    public final Object f3621c;

    public d(Context context) {
        this.f3620b = 0;
        this.f3621c = context;
    }

    @Override
    public int a() {
        return this.f3619a;
    }

    @Override
    public int b() {
        return this.f3620b;
    }

    @Override
    public int c() {
        int i10 = this.f3619a;
        if (i10 == -1) {
            return ((x) this.f3621c).E();
        }
        return i10;
    }

    public int d() {
        return ((((byte[]) this.f3621c).length - this.f3619a) * 8) - this.f3620b;
    }

    public int e(int i10) {
        byte[] bArr = (byte[]) this.f3621c;
        if (i10 >= 1 && i10 <= 32 && i10 <= d()) {
            int i11 = this.f3620b;
            int i12 = 0;
            if (i11 > 0) {
                int i13 = 8 - i11;
                int min = Math.min(i10, i13);
                int i14 = i13 - min;
                int i15 = this.f3619a;
                int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
                i10 -= min;
                int i17 = this.f3620b + min;
                this.f3620b = i17;
                if (i17 == 8) {
                    this.f3620b = 0;
                    this.f3619a = i15 + 1;
                }
                i12 = i16;
            }
            if (i10 > 0) {
                while (i10 >= 8) {
                    int i18 = i12 << 8;
                    int i19 = this.f3619a;
                    this.f3619a = i19 + 1;
                    i10 -= 8;
                    i12 = i18 | (bArr[i19] & 255);
                }
                if (i10 > 0) {
                    int i20 = 8 - i10;
                    int i21 = ((bArr[this.f3619a] & ((255 >> i20) << i20)) >> i20) | (i12 << i10);
                    this.f3620b += i10;
                    return i21;
                }
            }
            return i12;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public synchronized int f() {
        PackageInfo packageInfo;
        if (this.f3619a == 0) {
            try {
                packageInfo = x6.b.a((Context) this.f3621c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f3619a = packageInfo.versionCode;
            }
        }
        return this.f3619a;
    }

    public synchronized int g() {
        int i10 = this.f3620b;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f3621c;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) x6.b.a(context).f48753a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!v6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f3620b = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.f3620b = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == v6.b.d()) {
            i11 = 2;
        }
        this.f3620b = i11;
        return i11;
    }

    public d(byte[] bArr) {
        this.f3621c = bArr;
    }

    public d(int i10, int i11, SparseArray sparseArray) {
        this.f3619a = i10;
        this.f3620b = i11;
        this.f3621c = sparseArray;
    }

    public d(f2.e eVar, b2.x xVar) {
        x xVar2 = eVar.f10060c;
        this.f3621c = xVar2;
        xVar2.N(12);
        int E = xVar2.E();
        if ("audio/raw".equals(xVar.f3586s)) {
            int u10 = n0.u(xVar.M) * xVar.K;
            if (E % u10 != 0) {
                e2.a.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + E);
                E = u10;
            }
        }
        this.f3619a = E == 0 ? -1 : E;
        this.f3620b = xVar2.E();
    }
}
