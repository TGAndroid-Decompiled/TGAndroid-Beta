package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a9a implements View.OnClickListener {
    public final TLRPC.TL_authorization a;
    public final f9a b;

    public a9a(f9a f9aVar, TLRPC.TL_authorization tL_authorization) {
        this.b = f9aVar;
        this.a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        this.b.E0(this.a.ip);
    }
}
