package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rk3 implements zk3, e39 {
    public final bl3 a;

    public rk3(bl3 bl3Var) {
        this.a = bl3Var;
    }

    @Override
    public final void a(vf6 vf6Var, ArrayList arrayList) {
        bl3 bl3Var = this.a;
        int i = bl3Var.t0;
        bl3Var.u0 = arrayList;
        bl3Var.y0 = vf6Var;
        for (int i2 = 0; i2 < bl3Var.u0.size(); i2++) {
            al3 al3Var = (al3) bl3Var.u0.get(i2);
            TLObject tLObject = al3Var.a;
            if (tLObject instanceof TLRPC.User) {
                na7.q1(i).a4((TLRPC.User) al3Var.a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                na7.q1(i).T3((TLRPC.Chat) al3Var.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                na7.q1(i).X3((TLRPC.EncryptedChat) al3Var.a, true);
            }
        }
        bl3Var.G(null);
        bl3Var.f();
    }

    @Override
    public final boolean d(int i, View view) {
        TLRPC.User V1;
        ji3 ji3Var = this.a.V;
        if (ji3Var != null) {
            Long l = (Long) view.getTag();
            long longValue = l.longValue();
            cj3 cj3Var = ji3Var.a;
            if (cj3Var.getParentActivity() != null && (V1 = cj3Var.getMessagesController().V1(l)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cj3Var.getParentActivity());
                String M0 = k96.M0(2131752222, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = gl.S2(k96.a0("ChatHintsDeleteAlert", null, 2131752223, qu2.m(0, V1.first_name, V1.last_name)));
                alertDialog$Builder.j(k96.M0(2131744618, null), new rz1(ji3Var, longValue, (byte) 2));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                cj3Var.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, cj3Var.getResourceProvider());
                }
            }
        }
        return true;
    }
}
