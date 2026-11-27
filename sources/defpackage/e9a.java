package defpackage;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.SessionsActivity;
public final class e9a implements View.OnClickListener {
    public final uaa a;
    public final TLRPC.TL_authorization b;
    public final SessionsActivity c;
    public final f9a d;

    public e9a(f9a f9aVar, uaa uaaVar, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = f9aVar;
        this.a = uaaVar;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.m1.getParentActivity());
        String M0 = ob6.M0(2131743857, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131754066, null);
        alertDialog$Builder.j(ob6.M0(2131743862, null), new o48(this, this.a, this.b, (byte) 12));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        this.c.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }
}
