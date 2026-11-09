package cc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import e2.u;
import h2.m0;
import h2.x;
import java.lang.reflect.Array;
import java.util.List;
public final class c implements z3.b {
    public final int f6045a;
    public int f6046b;
    public int f6047c;
    public final Object d;

    public c(Context context) {
        this.f6045a = 3;
        this.f6047c = 0;
        this.d = context;
    }

    @Override
    public int a() {
        return this.f6046b;
    }

    @Override
    public int b() {
        return this.f6047c;
    }

    @Override
    public int c() {
        int i7 = this.f6046b;
        if (i7 == -1) {
            return ((x) this.d).E();
        }
        return i7;
    }

    public int d() {
        return ((((byte[]) this.d).length - this.f6046b) * 8) - this.f6047c;
    }

    public byte e(int i7, int i10) {
        return ((byte[][]) this.d)[i10][i7];
    }

    public int f(int i7) {
        byte[] bArr = (byte[]) this.d;
        if (i7 >= 1 && i7 <= 32 && i7 <= d()) {
            int i10 = this.f6047c;
            int i11 = 0;
            if (i10 > 0) {
                int i12 = 8 - i10;
                int min = Math.min(i7, i12);
                int i13 = i12 - min;
                int i14 = this.f6046b;
                int i15 = (((255 >> (8 - min)) << i13) & bArr[i14]) >> i13;
                i7 -= min;
                int i16 = this.f6047c + min;
                this.f6047c = i16;
                if (i16 == 8) {
                    this.f6047c = 0;
                    this.f6046b = i14 + 1;
                }
                i11 = i15;
            }
            if (i7 > 0) {
                while (i7 >= 8) {
                    int i17 = i11 << 8;
                    int i18 = this.f6046b;
                    this.f6046b = i18 + 1;
                    i7 -= 8;
                    i11 = i17 | (bArr[i18] & 255);
                }
                if (i7 > 0) {
                    int i19 = 8 - i7;
                    int i20 = ((bArr[this.f6046b] & ((255 >> i19) << i19)) >> i19) | (i11 << i7);
                    this.f6047c += i7;
                    return i20;
                }
            }
            return i11;
        }
        throw new IllegalArgumentException(String.valueOf(i7));
    }

    public void g(int i7, int i10, int i11) {
        ((byte[][]) this.d)[i10][i7] = (byte) i11;
    }

    public synchronized int h() {
        int i7 = this.f6047c;
        if (i7 != 0) {
            return i7;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (z6.b.a(context).f2020a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!x6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f6047c = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f6047c = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == x6.b.d()) {
            i10 = 2;
        }
        this.f6047c = i10;
        return i10;
    }

    public synchronized int i() {
        PackageInfo packageInfo;
        if (this.f6046b == 0) {
            try {
                packageInfo = z6.b.a((Context) this.d).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f6046b = packageInfo.versionCode;
            }
        }
        return this.f6046b;
    }

    public String toString() {
        switch (this.f6045a) {
            case 2:
                int i7 = this.f6046b;
                int i10 = this.f6047c;
                StringBuilder sb2 = new StringBuilder((i7 * 2 * i10) + 2);
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr = ((byte[][]) this.d)[i11];
                    for (int i12 = 0; i12 < i7; i12++) {
                        byte b10 = bArr[i12];
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

    public c(int i7, int i10) {
        this.f6045a = 2;
        this.d = (byte[][]) Array.newInstance(Byte.TYPE, i10, i7);
        this.f6046b = i7;
        this.f6047c = i10;
    }

    public c(byte[] bArr) {
        this.f6045a = 0;
        this.d = bArr;
    }

    public c(int i7, int i10, SparseArray sparseArray) {
        this.f6045a = 1;
        this.f6046b = i7;
        this.f6047c = i10;
        this.d = sparseArray;
    }

    public c(i2.d dVar, u uVar) {
        this.f6045a = 4;
        x xVar = dVar.f15153c;
        this.d = xVar;
        xVar.N(12);
        int E = xVar.E();
        if ("audio/raw".equals(uVar.f10615s)) {
            int u10 = m0.u(uVar.M) * uVar.K;
            if (E % u10 != 0) {
                h2.a.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + E);
                E = u10;
            }
        }
        this.f6046b = E == 0 ? -1 : E;
        this.f6047c = xVar.E();
    }
}
