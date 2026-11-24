package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class l5a implements View.OnClickListener {
    public final ly1 a;
    public final TLRPC.TL_authorization b;
    public final n5a c;

    public l5a(n5a n5aVar, ly1 ly1Var, TLRPC.TL_authorization tL_authorization) {
        this.c = n5aVar;
        this.a = ly1Var;
        this.b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        Switch r3 = (Switch) this.a.f;
        r3.c(!r3.h, true);
        this.b.call_requests_disabled = !r3.h;
        this.c.E0();
    }
}
