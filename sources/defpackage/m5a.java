package defpackage;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.SessionsActivity;
public final class m5a implements View.OnClickListener {
    public final d7a a;
    public final TLRPC.TL_authorization b;
    public final SessionsActivity c;
    public final n5a d;

    public m5a(n5a n5aVar, d7a d7aVar, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = n5aVar;
        this.a = d7aVar;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.m1.getParentActivity());
        String M0 = k96.M0(2131743963, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = M0;
        hdVar.S = k96.M0(2131754070, null);
        alertDialog$Builder.j(k96.M0(2131743968, null), new io9(this, this.a, this.b, (byte) 3));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        this.c.showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }
}
