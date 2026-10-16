package hg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.ky;
import org.telegram.ui.yy;
public final class w implements f0, cm0 {
    public final h0 f10779a;

    public w(h0 h0Var) {
        this.f10779a = h0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        TLRPC.User user;
        ky kyVar = this.f10779a.U;
        if (kyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            yy yyVar = kyVar.f37546a;
            if (yyVar.getParentActivity() != null && (user = yyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new bi.p1(kyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                yyVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(yyVar.getThemedColor(g6.f19839q7));
                }
            }
        }
        return true;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f10779a;
        int i10 = h0Var.f10590s0;
        h0Var.f10591t0 = arrayList;
        h0Var.f10597x0 = hVar;
        for (int i11 = 0; i11 < h0Var.f10591t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.f10591t0.get(i11);
            TLObject tLObject = g0Var.f10562a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.f10562a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.f10562a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f10562a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }
}
