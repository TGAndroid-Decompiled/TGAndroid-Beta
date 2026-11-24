package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j5a implements View.OnLongClickListener {
    public final TLRPC.TL_authorization a;
    public final n5a b;

    public j5a(n5a n5aVar, TLRPC.TL_authorization tL_authorization) {
        this.b = n5aVar;
        this.a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        this.b.D0(this.a.country);
        return true;
    }
}
