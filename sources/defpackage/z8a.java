package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z8a implements View.OnLongClickListener {
    public final TLRPC.TL_authorization a;
    public final f9a b;

    public z8a(f9a f9aVar, TLRPC.TL_authorization tL_authorization) {
        this.b = f9aVar;
        this.a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        this.b.E0(this.a.country);
        return true;
    }
}
