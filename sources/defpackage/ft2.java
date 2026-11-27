package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.ConnectionsManager;
public final class ft2 implements OnSuccessListener, OnFailureListener {
    public final int a;
    public final long b;
    public final int c;
    public final String d;

    public ft2(int i, long j, String str, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
    }

    @Override
    public final void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.a, this.b, this.c, this.d, exc);
    }

    @Override
    public final void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.a, this.b, this.c, this.d, (IntegrityTokenResponse) obj);
    }
}
