package d4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import d2.v;
import g2.n0;
import g2.y;
import java.lang.reflect.Array;
import java.util.List;
public final class d implements y3.c {
    public final int f8537a;
    public int f8538b;
    public int f8539c;
    public final Object d;

    public d(Context context) {
        this.f8537a = 2;
        this.f8539c = 0;
        this.d = context;
    }

    @Override
    public int a() {
        return this.f8538b;
    }

    @Override
    public int b() {
        return this.f8539c;
    }

    @Override
    public int c() {
        int i3 = this.f8538b;
        if (i3 == -1) {
            return ((y) this.d).E();
        }
        return i3;
    }

    public int d() {
        return ((((byte[]) this.d).length - this.f8538b) * 8) - this.f8539c;
    }

    public byte e(int i3, int i10) {
        return ((byte[][]) this.d)[i10][i3];
    }

    public int f(int i3) {
        byte[] bArr = (byte[]) this.d;
        if (i3 >= 1 && i3 <= 32 && i3 <= d()) {
            int i10 = this.f8539c;
            int i11 = 0;
            if (i10 > 0) {
                int i12 = 8 - i10;
                int min = Math.min(i3, i12);
                int i13 = i12 - min;
                int i14 = this.f8538b;
                int i15 = (((255 >> (8 - min)) << i13) & bArr[i14]) >> i13;
                i3 -= min;
                int i16 = this.f8539c + min;
                this.f8539c = i16;
                if (i16 == 8) {
                    this.f8539c = 0;
                    this.f8538b = i14 + 1;
                }
                i11 = i15;
            }
            if (i3 > 0) {
                while (i3 >= 8) {
                    int i17 = i11 << 8;
                    int i18 = this.f8538b;
                    this.f8538b = i18 + 1;
                    i3 -= 8;
                    i11 = i17 | (bArr[i18] & 255);
                }
                if (i3 > 0) {
                    int i19 = 8 - i3;
                    int i20 = ((bArr[this.f8538b] & ((255 >> i19) << i19)) >> i19) | (i11 << i3);
                    this.f8539c += i3;
                    return i20;
                }
            }
            return i11;
        }
        throw new IllegalArgumentException(String.valueOf(i3));
    }

    public void g(int i3, int i10, int i11) {
        ((byte[][]) this.d)[i10][i3] = (byte) i11;
    }

    public synchronized int h() {
        int i3 = this.f8539c;
        if (i3 != 0) {
            return i3;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (y6.b.a(context).f1741a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!w6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f8539c = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f8539c = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == w6.b.d()) {
            i10 = 2;
        }
        this.f8539c = i10;
        return i10;
    }

    public synchronized int i() {
        PackageInfo packageInfo;
        if (this.f8538b == 0) {
            try {
                packageInfo = y6.b.a((Context) this.d).d(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f8538b = packageInfo.versionCode;
            }
        }
        return this.f8538b;
    }

    public String toString() {
        switch (this.f8537a) {
            case 1:
                int i3 = this.f8538b;
                int i10 = this.f8539c;
                StringBuilder sb2 = new StringBuilder((i3 * 2 * i10) + 2);
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr = ((byte[][]) this.d)[i11];
                    for (int i12 = 0; i12 < i3; i12++) {
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

    public d(int i3, int i10) {
        this.f8537a = 1;
        this.d = (byte[][]) Array.newInstance(Byte.TYPE, i10, i3);
        this.f8538b = i3;
        this.f8539c = i10;
    }

    public d(byte[] bArr) {
        this.f8537a = 4;
        this.d = bArr;
    }

    public d(int i3, int i10, SparseArray sparseArray) {
        this.f8537a = 0;
        this.f8538b = i3;
        this.f8539c = i10;
        this.d = sparseArray;
    }

    public d(h2.d dVar, v vVar) {
        this.f8537a = 3;
        y yVar = dVar.f14106c;
        this.d = yVar;
        yVar.N(12);
        int E = yVar.E();
        if ("audio/raw".equals(vVar.f8489s)) {
            int u10 = n0.u(vVar.M) * vVar.K;
            if (E % u10 != 0) {
                g2.a.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + E);
                E = u10;
            }
        }
        this.f8538b = E == 0 ? -1 : E;
        this.f8539c = yVar.E();
    }
}
