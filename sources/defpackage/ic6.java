package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ic6 implements OnSuccessListener {
    public final byte a = 0;
    public final mf6 b;
    public final String c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f;

    public ic6(mf6 mf6Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z) {
        this.b = mf6Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                this.b.s1(this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                return;
            default:
                this.b.t1(this.c, this.d, this.e, this.f, (bp9) obj);
                return;
        }
    }

    public ic6(mf6 mf6Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z) {
        this.b = mf6Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z;
    }
}
