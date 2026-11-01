package b4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import e2.l0;
import e2.x;
import java.lang.reflect.Array;
import java.util.List;
public final class d implements w3.b {
    public final int f2457a;
    public int f2458b;
    public int f2459c;
    public final Object d;

    public d(Context context) {
        this.f2457a = 2;
        this.f2459c = 0;
        this.d = context;
    }

    @Override
    public int a() {
        return this.f2458b;
    }

    @Override
    public int b() {
        return this.f2459c;
    }

    @Override
    public int c() {
        int i10 = this.f2458b;
        if (i10 == -1) {
            return ((x) this.d).E();
        }
        return i10;
    }

    public int d() {
        return ((((byte[]) this.d).length - this.f2458b) * 8) - this.f2459c;
    }

    public byte e(int i10, int i11) {
        return ((byte[][]) this.d)[i11][i10];
    }

    public int f(int i10) {
        byte[] bArr = (byte[]) this.d;
        if (i10 >= 1 && i10 <= 32 && i10 <= d()) {
            int i11 = this.f2459c;
            int i12 = 0;
            if (i11 > 0) {
                int i13 = 8 - i11;
                int min = Math.min(i10, i13);
                int i14 = i13 - min;
                int i15 = this.f2458b;
                int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
                i10 -= min;
                int i17 = this.f2459c + min;
                this.f2459c = i17;
                if (i17 == 8) {
                    this.f2459c = 0;
                    this.f2458b = i15 + 1;
                }
                i12 = i16;
            }
            if (i10 > 0) {
                while (i10 >= 8) {
                    int i18 = i12 << 8;
                    int i19 = this.f2458b;
                    this.f2458b = i19 + 1;
                    i10 -= 8;
                    i12 = i18 | (bArr[i19] & 255);
                }
                if (i10 > 0) {
                    int i20 = 8 - i10;
                    int i21 = ((bArr[this.f2458b] & ((255 >> i20) << i20)) >> i20) | (i12 << i10);
                    this.f2459c += i10;
                    return i21;
                }
            }
            return i12;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public void g(int i10, int i11, int i12) {
        ((byte[][]) this.d)[i11][i10] = (byte) i12;
    }

    public synchronized int h() {
        PackageInfo packageInfo;
        if (this.f2458b == 0) {
            try {
                packageInfo = w6.b.a((Context) this.d).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f2458b = packageInfo.versionCode;
            }
        }
        return this.f2458b;
    }

    public synchronized int i() {
        int i10 = this.f2459c;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (w6.b.a(context).f1116a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!u6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f2459c = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.f2459c = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == u6.b.d()) {
            i11 = 2;
        }
        this.f2459c = i11;
        return i11;
    }

    public String toString() {
        switch (this.f2457a) {
            case 1:
                int i10 = this.f2458b;
                int i11 = this.f2459c;
                StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
                for (int i12 = 0; i12 < i11; i12++) {
                    byte[] bArr = ((byte[][]) this.d)[i12];
                    for (int i13 = 0; i13 < i10; i13++) {
                        byte b10 = bArr[i13];
                        if (b10 != 0) {
                            if (b10 != 1) {
                                sb2.append("  ");
                            } else {
                                sb2.append(" 1");
                            }
                        } else {
                            sb2.append(" 0");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public d(int i10, int i11) {
        this.f2457a = 1;
        this.d = (byte[][]) Array.newInstance(Byte.TYPE, i11, i10);
        this.f2458b = i10;
        this.f2459c = i11;
    }

    public d(byte[] bArr) {
        this.f2457a = 4;
        this.d = bArr;
    }

    public d(int i10, int i11, SparseArray sparseArray) {
        this.f2457a = 0;
        this.f2458b = i10;
        this.f2459c = i11;
        this.d = sparseArray;
    }

    public d(f2.e eVar, b2.x xVar) {
        this.f2457a = 3;
        x xVar2 = eVar.f6734c;
        this.d = xVar2;
        xVar2.N(12);
        int E = xVar2.E();
        if ("audio/raw".equals(xVar.f2423s)) {
            int u10 = l0.u(xVar.M) * xVar.K;
            if (E % u10 != 0) {
                e2.a.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + E);
                E = u10;
            }
        }
        this.f2458b = E == 0 ? -1 : E;
        this.f2459c = xVar2.E();
    }
}
