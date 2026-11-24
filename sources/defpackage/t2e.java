package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class t2e extends jh0 {
    public final byte q = 0;
    public final byte[] r;
    public final String s;
    public final Object t;

    public t2e(z3d z3dVar, byte[] bArr, String str) {
        super(br9.a, z3dVar);
        this.r = bArr;
        this.s = str;
        this.t = new gbf(this);
    }

    @Override
    public final void a(uc9 uc9Var) {
        switch (this.q) {
            case 0:
                a(uc9Var);
                return;
            default:
                a(uc9Var);
                return;
        }
    }

    @Override
    public final uc9 d(Status status) {
        switch (this.q) {
            case 0:
                return new p4e(status, -1);
            default:
                return new k9f(status, null);
        }
    }

    @Override
    public final void n(zz4 zz4Var) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.q;
        String str = this.s;
        byte[] bArr = this.r;
        Object obj = this.t;
        switch (b) {
            case 0:
                o1e o1eVar = (o1e) ((lme) zz4Var).k();
                ?? y6dVar = new y6d();
                y6dVar.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(o1eVar.c);
                int i = cjd.a;
                obtain.writeStrongBinder(y6dVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    o1eVar.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                p8d p8dVar = (p8d) zz4Var;
                gbf gbfVar = (gbf) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = p8dVar.F;
                    str = "";
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
                }
                iee ieeVar = (iee) p8dVar.k();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i2 = ajd.a;
                if (gbfVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(gbfVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    ieeVar.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public t2e(z3d z3dVar, String str, String str2, byte[] bArr) {
        super(duc.a, z3dVar);
        this.s = str;
        this.t = str2;
        this.r = bArr;
    }
}
