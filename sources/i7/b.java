package i7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import w7.f0;
public final class b extends j {
    public static final com.google.android.gms.common.api.e f11881l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a8.d(6), new Object());
    public final String f11882k;

    public b(Context context, x5.i iVar) {
        super(context, f11881l, iVar, com.google.android.gms.common.api.i.f4958c);
        this.f11882k = e.a();
    }

    public final x5.g f(Intent intent) {
        o6.b a2;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            o6.b bVar = null;
            if (byteArrayExtra == null) {
                a2 = null;
            } else {
                a2 = f0.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a2;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<x5.g> creator2 = x5.g.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        bVar = f0.a(byteArrayExtra2, creator2);
                    }
                    x5.g gVar = (x5.g) bVar;
                    if (gVar != null) {
                        return gVar;
                    }
                    throw new com.google.android.gms.common.api.f(status);
                }
                throw new com.google.android.gms.common.api.f(status2);
            }
            throw new com.google.android.gms.common.api.f(Status.f4945r);
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
