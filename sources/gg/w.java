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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.hy;
import org.telegram.ui.vy;
public final class w implements f0, mm0 {
    public final h0 f10843a;

    public w(h0 h0Var) {
        this.f10843a = h0Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        h0 h0Var = this.f10843a;
        int i10 = h0Var.f10636s0;
        h0Var.f10637t0 = arrayList;
        h0Var.f10643x0 = iVar;
        for (int i11 = 0; i11 < h0Var.f10637t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.f10637t0.get(i11);
            TLObject tLObject = g0Var.f10607a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.f10607a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.f10607a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f10607a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        hy hyVar = this.f10843a.U;
        if (hyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            vy vyVar = hyVar.f38559a;
            if (vyVar.getParentActivity() != null && (user = vyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(hyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                vyVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(vyVar.getThemedColor(h6.f20799q7));
                }
            }
        }
        return true;
    }
}
