package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class q56 extends su3 {
    public boolean F;
    public final s56 G;

    public q56(s56 s56Var, Context context, String str, ylb ylbVar) {
        super(context, str, false, false, -1, ylbVar);
        this.G = s56Var;
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
            if (parseLong > this.G.getMessagesController().l4.z2.f()) {
                this.F = true;
                parseLong = this.G.getMessagesController().l4.z2.f();
                setText(Long.toString(parseLong));
                this.F = false;
            }
            s56 s56Var = this.G;
            TextView textView = s56Var.s;
            if (s56Var.getConnectionsManager().isTestBackend()) {
                i = 2131745885;
            } else {
                i = 2131745888;
            }
            cj0 h = cj0.h();
            i2 = ((d) this.G).currentAccount;
            textView.setText(jb6.a0(null, null, i, h.e((long) ((parseLong / 1000.0d) * oc7.r1(i2).l4.s3.i), "USD")));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
