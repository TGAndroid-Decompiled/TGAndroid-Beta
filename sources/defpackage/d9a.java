package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class d9a implements View.OnClickListener {
    public final cz1 a;
    public final TLRPC.TL_authorization b;
    public final f9a c;

    public d9a(f9a f9aVar, cz1 cz1Var, TLRPC.TL_authorization tL_authorization) {
        this.c = f9aVar;
        this.a = cz1Var;
        this.b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        Switch r3 = (Switch) this.a.f;
        r3.c(!r3.h, true);
        this.b.call_requests_disabled = !r3.h;
        this.c.F0();
    }
}
