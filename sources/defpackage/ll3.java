package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ll3 implements rl3, t69 {
    public final tl3 a;

    public ll3(tl3 tl3Var) {
        this.a = tl3Var;
    }

    @Override
    public final void a(zh6 zh6Var, ArrayList arrayList) {
        tl3 tl3Var = this.a;
        int i = tl3Var.t0;
        tl3Var.u0 = arrayList;
        tl3Var.y0 = zh6Var;
        for (int i2 = 0; i2 < tl3Var.u0.size(); i2++) {
            sl3 sl3Var = (sl3) tl3Var.u0.get(i2);
            TLObject tLObject = sl3Var.a;
            if (tLObject instanceof TLRPC.User) {
                uc7.s1(i).i4((TLRPC.User) sl3Var.a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                uc7.s1(i).a4((TLRPC.Chat) sl3Var.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                uc7.s1(i).f4((TLRPC.EncryptedChat) sl3Var.a, true);
            }
        }
        tl3Var.G(null);
        tl3Var.f();
    }

    @Override
    public final boolean e(int i, View view) {
        TLRPC.User X1;
        dj3 dj3Var = this.a.V;
        if (dj3Var != null) {
            Long l = (Long) view.getTag();
            long longValue = l.longValue();
            uj3 uj3Var = dj3Var.a;
            if (uj3Var.getParentActivity() != null && (X1 = uj3Var.getMessagesController().X1(l)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uj3Var.getParentActivity());
                String M0 = ob6.M0(2131752199, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = hl.S2(ob6.a0("ChatHintsDeleteAlert", null, 2131752200, lv2.m(0, X1.first_name, X1.last_name)));
                alertDialog$Builder.j(ob6.M0(2131744512, null), new i02(dj3Var, longValue, (byte) 2));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                uj3Var.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, uj3Var.getResourceProvider());
                }
            }
        }
        return true;
    }
}
