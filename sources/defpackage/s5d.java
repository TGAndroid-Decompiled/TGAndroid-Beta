package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class s5d extends c05 {
    public static final zo m = new zo("Auth.Api.Identity.SignIn.API", new or5((byte) 8), new Object());
    public final String l;

    public s5d(Context context, m6d m6dVar) {
        super(context, m, m6dVar, b05.c);
        this.l = u5d.a();
    }

    public static hja f(Intent intent) {
        zq9 a;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            zq9 zq9Var = null;
            if (byteArrayExtra == null) {
                a = null;
            } else {
                a = nve.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<hja> creator2 = hja.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        zq9Var = nve.a(byteArrayExtra2, creator2);
                    }
                    hja hjaVar = (hja) zq9Var;
                    if (hjaVar != null) {
                        return hjaVar;
                    }
                    throw new ap(status);
                }
                throw new ap(status2);
            }
            throw new ap(Status.r);
        }
        throw new ap(status);
    }
}
