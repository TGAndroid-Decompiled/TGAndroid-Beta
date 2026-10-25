package c8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import y8.j;
import z8.i0;
import z8.j0;
import z8.z0;
public final class e extends com.google.android.gms.common.api.internal.e {
    public final int f6159q = 1;
    public final String f6160r;
    public final byte[] f6161s;
    public final Object f6162t;

    public e(m mVar, byte[] bArr, String str) {
        super(n8.c.f18734a, mVar);
        this.f6161s = bArr;
        this.f6160r = str;
        this.f6162t = new g(this);
    }

    @Override
    public final void a(q qVar) {
        switch (this.f6159q) {
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
        switch (this.f6159q) {
            case 0:
                return new f(status, null);
            default:
                return new j0(status, -1);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = this.f6159q;
        byte[] bArr = this.f6161s;
        Object obj = this.f6162t;
        String str = this.f6160r;
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
                d dVar = (d) aVar.u();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = c.f6157a;
                if (gVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(gVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    dVar.f6158a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                i0 i0Var = (i0) ((z0) cVar).u();
                ?? bVar = new z8.b();
                bVar.f52797b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(i0Var.f344c);
                int i12 = g8.a.f12396a;
                obtain.writeStrongBinder(bVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    i0Var.f343b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public e(s0 s0Var, String str, String str2, byte[] bArr) {
        super(j.f52396a, s0Var);
        this.f6160r = str;
        this.f6162t = str2;
        this.f6161s = bArr;
    }
}
