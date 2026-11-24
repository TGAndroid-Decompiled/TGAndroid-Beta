package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class q3d extends by4 {
    public static final yn m = new yn("Auth.Api.Identity.SignIn.API", new op5((byte) 8), new Object());
    public final String l;

    public q3d(Context context, k4d k4dVar) {
        super(context, m, k4dVar, ay4.c);
        this.l = s3d.a();
    }

    public static fha f(Intent intent) {
        yo9 a;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            yo9 yo9Var = null;
            if (byteArrayExtra == null) {
                a = null;
            } else {
                a = kte.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<fha> creator2 = fha.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        yo9Var = kte.a(byteArrayExtra2, creator2);
                    }
                    fha fhaVar = (fha) yo9Var;
                    if (fhaVar != null) {
                        return fhaVar;
                    }
                    throw new zn(status);
                }
                throw new zn(status2);
            }
            throw new zn(Status.r);
        }
        throw new zn(status);
    }
}
