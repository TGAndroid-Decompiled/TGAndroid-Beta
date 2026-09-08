package b8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import x8.j;
import y8.h0;
import y8.i0;
import y8.y0;
public final class e extends com.google.android.gms.common.api.internal.e {
    public final int f2536q = 1;
    public final String f2537r;
    public final byte[] f2538s;
    public final Object f2539t;

    public e(m mVar, byte[] bArr, String str) {
        super(m8.c.f16162a, mVar);
        this.f2538s = bArr;
        this.f2537r = str;
        this.f2539t = new g(this);
    }

    @Override
    public final void a(q qVar) {
        switch (this.f2536q) {
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
        switch (this.f2536q) {
            case 0:
                return new f(status, null);
            default:
                return new i0(status, -1);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = this.f2536q;
        byte[] bArr = this.f2538s;
        Object obj = this.f2539t;
        String str = this.f2537r;
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
                int i11 = c.f2534a;
                if (gVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(gVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    dVar.f2535a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                h0 h0Var = (h0) ((y0) cVar).u();
                ?? aVar2 = new y8.a();
                aVar2.f49695b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(h0Var.f337c);
                int i12 = f8.a.f9441a;
                obtain.writeStrongBinder(aVar2);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    h0Var.f336b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public e(t0 t0Var, String str, String str2, byte[] bArr) {
        super(j.f49312a, t0Var);
        this.f2537r = str;
        this.f2539t = str2;
        this.f2538s = bArr;
    }
}
