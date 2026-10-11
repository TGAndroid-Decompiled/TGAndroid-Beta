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
import org.telegram.ui.Components.hm0;
import org.telegram.ui.ey;
import org.telegram.ui.sy;
public final class w implements f0, hm0 {
    public final h0 f10844a;

    public w(h0 h0Var) {
        this.f10844a = h0Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        h0 h0Var = this.f10844a;
        int i10 = h0Var.f10637s0;
        h0Var.f10638t0 = arrayList;
        h0Var.f10644x0 = iVar;
        for (int i11 = 0; i11 < h0Var.f10638t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.f10638t0.get(i11);
            TLObject tLObject = g0Var.f10608a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.f10608a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.f10608a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f10608a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        ey eyVar = this.f10844a.U;
        if (eyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            sy syVar = eyVar.f37512a;
            if (syVar.getParentActivity() != null && (user = syVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(syVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(eyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                syVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(syVar.getThemedColor(h6.f21062q7));
                }
            }
        }
        return true;
    }
}
