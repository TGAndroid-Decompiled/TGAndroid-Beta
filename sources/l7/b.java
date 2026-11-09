package l7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
public final class b extends j {
    public static final com.google.android.gms.common.api.e f18197m = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a9.e(9), new Object());
    public final String f18198l;

    public b(Context context, a6.h hVar) {
        super(context, f18197m, hVar, com.google.android.gms.common.api.i.f6540c);
        this.f18198l = e.a();
    }

    public final a6.g f(Intent intent) {
        r6.b a10;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            r6.b bVar = null;
            if (byteArrayExtra == null) {
                a10 = null;
            } else {
                a10 = yb.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a10;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<a6.g> creator2 = a6.g.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        bVar = yb.a(byteArrayExtra2, creator2);
                    }
                    a6.g gVar = (a6.g) bVar;
                    if (gVar != null) {
                        return gVar;
                    }
                    throw new com.google.android.gms.common.api.f(status);
                }
                throw new com.google.android.gms.common.api.f(status2);
            }
            throw new com.google.android.gms.common.api.f(Status.f6526r);
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
