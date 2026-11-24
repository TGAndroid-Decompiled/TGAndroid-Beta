package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i7a implements View.OnClickListener {
    public final TLRPC.TL_authorization a;
    public final p7a b;

    public i7a(p7a p7aVar, TLRPC.TL_authorization tL_authorization) {
        this.b = p7aVar;
        this.a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        this.b.D0(this.a.country);
    }
}
