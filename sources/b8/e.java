package b8;

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
import x8.j;
import y8.h0;
import y8.i0;
import y8.y0;
public final class e extends com.google.android.gms.common.api.internal.e {
    public final int f4220q = 1;
    public final String f4221r;
    public final byte[] f4222s;
    public final Object f4223t;

    public e(m mVar, byte[] bArr, String str) {
        super(m8.c.f16801a, mVar);
        this.f4222s = bArr;
        this.f4221r = str;
        this.f4223t = new g(this);
    }

    @Override
    public final void a(q qVar) {
        switch (this.f4220q) {
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
        switch (this.f4220q) {
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
        int i10 = this.f4220q;
        byte[] bArr = this.f4222s;
        Object obj = this.f4223t;
        String str = this.f4221r;
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
                int i11 = c.f4218a;
                if (gVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(gVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    dVar.f4219a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                h0 h0Var = (h0) ((y0) cVar).u();
                ?? aVar2 = new y8.a();
                aVar2.f50065b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(h0Var.f319c);
                int i12 = f8.a.f10505a;
                obtain.writeStrongBinder(aVar2);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    h0Var.f318b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public e(s0 s0Var, String str, String str2, byte[] bArr) {
        super(j.f49648a, s0Var);
        this.f4221r = str;
        this.f4223t = str2;
        this.f4222s = bArr;
    }
}
