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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.cy;
import org.telegram.ui.qy;
public final class y implements g0, ml0 {
    public final i0 f9967a;

    public y(i0 i0Var) {
        this.f9967a = i0Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        i0 i0Var = this.f9967a;
        int i10 = i0Var.f9765s0;
        i0Var.f9766t0 = arrayList;
        i0Var.f9772x0 = iVar;
        for (int i11 = 0; i11 < i0Var.f9766t0.size(); i11++) {
            h0 h0Var = (h0) i0Var.f9766t0.get(i11);
            TLObject tLObject = h0Var.f9735a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) h0Var.f9735a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) h0Var.f9735a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f9735a, true);
            }
        }
        i0Var.G(null);
        i0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        cy cyVar = this.f9967a.U;
        if (cyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            qy qyVar = cyVar.f32801a;
            if (qyVar.getParentActivity() != null && (user = qyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(cyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qyVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(qyVar.getThemedColor(h6.f19284q7));
                }
            }
        }
        return true;
    }
}
