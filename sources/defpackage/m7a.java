package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class m7a implements View.OnClickListener {
    public final yz1 a;
    public final TLRPC.TL_authorization b;
    public final p7a c;

    public m7a(p7a p7aVar, yz1 yz1Var, TLRPC.TL_authorization tL_authorization) {
        this.c = p7aVar;
        this.a = yz1Var;
        this.b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        Switch r3 = (Switch) this.a.f;
        r3.c(!r3.h, true);
        this.b.encrypted_requests_disabled = !r3.h;
        this.c.E0();
    }
}
