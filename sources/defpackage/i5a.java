package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i5a implements View.OnClickListener {
    public final TLRPC.TL_authorization a;
    public final n5a b;

    public i5a(n5a n5aVar, TLRPC.TL_authorization tL_authorization) {
        this.b = n5aVar;
        this.a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        this.b.D0(this.a.ip);
    }
}
