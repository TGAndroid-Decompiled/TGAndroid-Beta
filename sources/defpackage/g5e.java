package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class g5e extends jg0 {
    public final byte q = 0;
    public final byte[] r;
    public final String s;
    public final Object t;

    public g5e(o6d o6dVar, byte[] bArr, String str) {
        super(ss9.a, o6dVar);
        this.r = bArr;
        this.s = str;
        this.t = new vdf(this);
    }

    @Override
    public final void a(ie9 ie9Var) {
        switch (this.q) {
            case 0:
                a(ie9Var);
                return;
            default:
                a(ie9Var);
                return;
        }
    }

    @Override
    public final ie9 d(Status status) {
        switch (this.q) {
            case 0:
                return new c7e(status, -1);
            default:
                return new zbf(status, null);
        }
    }

    @Override
    public final void n(d05 d05Var) {
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
                b4e b4eVar = (b4e) ((ape) d05Var).k();
                ?? p9dVar = new p9d();
                p9dVar.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(b4eVar.c);
                int i = sld.a;
                obtain.writeStrongBinder(p9dVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    b4eVar.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                gbd gbdVar = (gbd) d05Var;
                vdf vdfVar = (vdf) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = gbdVar.F;
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
                xge xgeVar = (xge) gbdVar.k();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i2 = qld.a;
                if (vdfVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(vdfVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    xgeVar.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public g5e(o6d o6dVar, String str, String str2, byte[] bArr) {
        super(qwc.a, o6dVar);
        this.s = str;
        this.t = str2;
        this.r = bArr;
    }
}
