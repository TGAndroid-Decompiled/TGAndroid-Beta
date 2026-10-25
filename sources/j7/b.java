package j7;

import a8.hf;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
public final class b extends j {
    public static final com.google.android.gms.common.api.e f15533l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new b8.d(6), new Object());
    public final String f15534k;

    public b(Context context, y5.h hVar) {
        super(context, f15533l, hVar, com.google.android.gms.common.api.i.f6478c);
        this.f15534k = e.a();
    }

    public final y5.g f(Intent intent) {
        p6.b a2;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            p6.b bVar = null;
            if (byteArrayExtra == null) {
                a2 = null;
            } else {
                a2 = hf.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a2;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<y5.g> creator2 = y5.g.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        bVar = hf.a(byteArrayExtra2, creator2);
                    }
                    y5.g gVar = (y5.g) bVar;
                    if (gVar != null) {
                        return gVar;
                    }
                    throw new com.google.android.gms.common.api.f(status);
                }
                throw new com.google.android.gms.common.api.f(status2);
            }
            throw new com.google.android.gms.common.api.f(Status.f6465r);
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
