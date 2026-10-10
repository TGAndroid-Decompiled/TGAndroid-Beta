package gg;

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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.fy;
import org.telegram.ui.ty;
public final class w implements f0, hm0 {
    public final h0 f10845a;

    public w(h0 h0Var) {
        this.f10845a = h0Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        h0 h0Var = this.f10845a;
        int i10 = h0Var.f10638s0;
        h0Var.f10639t0 = arrayList;
        h0Var.f10645x0 = iVar;
        for (int i11 = 0; i11 < h0Var.f10639t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.f10639t0.get(i11);
            TLObject tLObject = g0Var.f10609a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.f10609a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.f10609a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f10609a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        fy fyVar = this.f10845a.U;
        if (fyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ty tyVar = fyVar.f37761a;
            if (tyVar.getParentActivity() != null && (user = tyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(fyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                tyVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(tyVar.getThemedColor(i6.f21041q7));
                }
            }
        }
        return true;
    }
}
