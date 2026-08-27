package j8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

public final class i0 extends com.google.android.gms.common.api.internal.e {

    public final int f12789q = 0;

    public final byte[] f12790r;

    public final String f12791s;

    public final Object f12792t;

    public i0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(x7.c.f49373a, mVar);
        this.f12790r = bArr;
        this.f12791s = str;
        this.f12792t = new m7.e(this);
    }

    @Override
    public final void a(com.google.android.gms.common.api.q qVar) {
        switch (this.f12789q) {
            case 0:
                a(qVar);
                break;
            default:
                a(qVar);
                break;
        }
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        switch (this.f12789q) {
            case 0:
                return new j0(status, -1);
            default:
                return new m7.d(status, null);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String str;
        int i10 = this.f12789q;
        String str2 = this.f12791s;
        byte[] bArr = this.f12790r;
        Object obj = this.f12792t;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) ((z0) cVar).u();
                y0 y0Var = new y0();
                y0Var.f12857b = this;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(h0Var.f2457c);
                int i11 = q7.a.f46172a;
                parcelObtain.writeStrongBinder(y0Var);
                parcelObtain.writeString(str2);
                parcelObtain.writeString((String) obj);
                parcelObtain.writeByteArray(bArr);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    h0Var.f2456b.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            default:
                m7.a aVar = (m7.a) cVar;
                m7.e eVar = (m7.e) obj;
                if (TextUtils.isEmpty(str2)) {
                    Context context = aVar.Q;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        str2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || (str = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY")) == null) ? "" : str;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                m7.c cVar2 = (m7.c) aVar.u();
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i12 = m7.b.f17874a;
                if (eVar == null) {
                    parcelObtain3.writeStrongBinder(null);
                } else {
                    parcelObtain3.writeStrongBinder(eVar);
                }
                parcelObtain3.writeByteArray(bArr);
                parcelObtain3.writeString(str2);
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    cVar2.f17875a.transact(7, parcelObtain3, parcelObtain4, 0);
                    parcelObtain4.readException();
                    return;
                } finally {
                    parcelObtain3.recycle();
                    parcelObtain4.recycle();
                }
        }
    }

    public i0(com.google.android.gms.common.api.internal.t0 t0Var, String str, String str2, byte[] bArr) {
        super(i8.j.f10955a, t0Var);
        this.f12791s = str;
        this.f12792t = str2;
        this.f12790r = bArr;
    }
}
