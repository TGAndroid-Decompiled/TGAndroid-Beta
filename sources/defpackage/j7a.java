package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j7a implements View.OnLongClickListener {
    public final TLRPC.TL_authorization a;
    public final p7a b;

    public j7a(p7a p7aVar, TLRPC.TL_authorization tL_authorization) {
        this.b = p7aVar;
        this.a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        this.b.D0(this.a.country);
        return true;
    }
}
