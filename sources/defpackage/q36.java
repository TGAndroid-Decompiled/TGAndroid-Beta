package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class q36 extends it3 {
    public boolean F;
    public final s36 G;

    public q36(s36 s36Var, Context context, String str, wjb wjbVar) {
        super(context, str, false, false, -1, wjbVar);
        this.G = s36Var;
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
            if (parseLong > this.G.getMessagesController().k4.z2.f()) {
                this.F = true;
                parseLong = this.G.getMessagesController().k4.z2.f();
                setText(Long.toString(parseLong));
                this.F = false;
            }
            s36 s36Var = this.G;
            TextView textView = s36Var.s;
            if (s36Var.getConnectionsManager().isTestBackend()) {
                i = 2131745959;
            } else {
                i = 2131745962;
            }
            ci0 h = ci0.h();
            i2 = ((d) this.G).currentAccount;
            textView.setText(k96.a0(null, null, i, h.e((long) ((parseLong / 1000.0d) * na7.q1(i2).k4.s3.i), "USD")));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
