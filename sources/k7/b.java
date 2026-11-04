package k7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
public final class b extends j {
    public static final com.google.android.gms.common.api.e f16899m = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a6.b(7), new Object());
    public final String f16900l;

    public b(Context context, z5.h hVar) {
        super(context, f16899m, hVar, com.google.android.gms.common.api.i.f6594c);
        this.f16900l = e.a();
    }

    public final z5.g f(Intent intent) {
        q6.b a10;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            q6.b bVar = null;
            if (byteArrayExtra == null) {
                a10 = null;
            } else {
                a10 = k8.c.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a10;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<z5.g> creator2 = z5.g.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        bVar = k8.c.a(byteArrayExtra2, creator2);
                    }
                    z5.g gVar = (z5.g) bVar;
                    if (gVar != null) {
                        return gVar;
                    }
                    throw new com.google.android.gms.common.api.f(status);
                }
                throw new com.google.android.gms.common.api.f(status2);
            }
            throw new com.google.android.gms.common.api.f(Status.f6580r);
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
