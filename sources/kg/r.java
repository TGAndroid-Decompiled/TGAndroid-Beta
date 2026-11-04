package kg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.ew;
import org.telegram.ui.uw;
public final class r implements c0, hj0 {
    public final e0 f17162a;

    public r(e0 e0Var) {
        this.f17162a = e0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        e0 e0Var = this.f17162a;
        int i3 = e0Var.f16980t0;
        e0Var.f16981u0 = arrayList;
        e0Var.f16988y0 = hVar;
        for (int i10 = 0; i10 < e0Var.f16981u0.size(); i10++) {
            d0 d0Var = (d0) e0Var.f16981u0.get(i10);
            TLObject tLObject = d0Var.f16946a;
            if (tLObject instanceof TLRPC.User) {
                hp.s1(i3).X3((TLRPC.User) d0Var.f16946a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                hp.s1(i3).Q3((TLRPC.Chat) d0Var.f16946a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                hp.s1(i3).U3((TLRPC.EncryptedChat) d0Var.f16946a, true);
            }
        }
        e0Var.G(null);
        e0Var.f();
    }

    @Override
    public boolean f(int i3, View view) {
        TLRPC.User a22;
        ew ewVar = this.f17162a.V;
        if (ewVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            uw uwVar = ewVar.f45056a;
            if (uwVar.getParentActivity() != null && (a22 = uwVar.getMessagesController().a2(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uwVar.getParentActivity());
                String M0 = bd.M0(2131752234, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.X2(bd.a0("ChatHintsDeleteAlert", null, 2131752235, g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(bd.M0(2131744865, null), new ei.c1(ewVar, longValue, 9));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                uwVar.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    r6.V(textView, k6.f28122q7, uwVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
