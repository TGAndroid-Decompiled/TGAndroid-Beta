package b8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import y8.f0;
import y8.g0;
import y8.w0;
public final class e extends com.google.android.gms.common.api.internal.e {
    public final int f2508q = 1;
    public final String f2509r;
    public final byte[] f2510s;
    public final Object f2511t;

    public e(m mVar, byte[] bArr, String str) {
        super(m8.c.f13024a, mVar);
        this.f2510s = bArr;
        this.f2509r = str;
        this.f2511t = new g(this);
    }

    @Override
    public final void a(q qVar) {
        switch (this.f2508q) {
            case 0:
                a(qVar);
                return;
            default:
                a(qVar);
                return;
        }
    }

    @Override
    public final q d(Status status) {
        switch (this.f2508q) {
            case 0:
                return new f(status, null);
            default:
                return new g0(status, -1);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = this.f2508q;
        byte[] bArr = this.f2510s;
        Object obj = this.f2511t;
        String str = this.f2509r;
        switch (i10) {
            case 0:
                a aVar = (a) cVar;
                g gVar = (g) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = aVar.U;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                            String str2 = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    str = "";
                }
                d dVar = (d) aVar.v();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = c.f2506a;
                if (gVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(gVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    dVar.f2507a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                f0 f0Var = (f0) ((w0) cVar).v();
                ?? aVar2 = new y8.a();
                aVar2.f54289b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(f0Var.f318c);
                int i12 = f8.a.f6961a;
                obtain.writeStrongBinder(aVar2);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    f0Var.f317b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public e(u0 u0Var, String str, String str2, byte[] bArr) {
        super(x8.c.f53426a, u0Var);
        this.f2509r = str;
        this.f2511t = str2;
        this.f2510s = bArr;
    }
}
