package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;
public final class t56 extends zt3 {
    public boolean F;
    public final v56 G;

    public t56(v56 v56Var, Context context, String str, vnb vnbVar) {
        super(context, str, false, false, -1, vnbVar);
        this.G = v56Var;
    }

    @Override
    public final void b(Editable editable) {
        int i;
        int i2;
        if (this.F) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            this.G.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > this.G.getMessagesController().l4.H2.f()) {
                this.F = true;
                parseLong = this.G.getMessagesController().l4.H2.f();
                setText(Long.toString(parseLong));
                this.F = false;
            }
            v56 v56Var = this.G;
            TextView textView = v56Var.s;
            if (v56Var.getConnectionsManager().isTestBackend()) {
                i = 2131745879;
            } else {
                i = 2131745882;
            }
            di0 h = di0.h();
            i2 = ((e) this.G).currentAccount;
            textView.setText(ob6.a0(null, null, i, h.e((long) ((parseLong / 1000.0d) * uc7.s1(i2).l4.A3.i), "USD")));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
