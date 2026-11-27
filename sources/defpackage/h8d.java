package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class h8d extends h05 {
    public static final zn m = new zn("Auth.Api.Identity.SignIn.API", new rr5((byte) 8), new Object());
    public final String l;

    public h8d(Context context, b9d b9dVar) {
        super(context, m, b9dVar, g05.c);
        this.l = j8d.a();
    }

    public static yka f(Intent intent) {
        qs9 a;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            qs9 qs9Var = null;
            if (byteArrayExtra == null) {
                a = null;
            } else {
                a = dye.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<yka> creator2 = yka.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        qs9Var = dye.a(byteArrayExtra2, creator2);
                    }
                    yka ykaVar = (yka) qs9Var;
                    if (ykaVar != null) {
                        return ykaVar;
                    }
                    throw new ao(status);
                }
                throw new ao(status2);
            }
            throw new ao(Status.r);
        }
        throw new ao(status);
    }
}
