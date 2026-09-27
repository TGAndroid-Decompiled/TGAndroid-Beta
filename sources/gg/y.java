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
import org.telegram.ui.Components.ol0;
import org.telegram.ui.dy;
import org.telegram.ui.ty;
public final class y implements g0, ol0 {
    public final i0 f9973a;

    public y(i0 i0Var) {
        this.f9973a = i0Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        i0 i0Var = this.f9973a;
        int i10 = i0Var.f9771s0;
        i0Var.f9772t0 = arrayList;
        i0Var.f9778x0 = iVar;
        for (int i11 = 0; i11 < i0Var.f9772t0.size(); i11++) {
            h0 h0Var = (h0) i0Var.f9772t0.get(i11);
            TLObject tLObject = h0Var.f9741a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) h0Var.f9741a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) h0Var.f9741a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f9741a, true);
            }
        }
        i0Var.G(null);
        i0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        dy dyVar = this.f9973a.U;
        if (dyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ty tyVar = dyVar.f33063a;
            if (tyVar.getParentActivity() != null && (user = tyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.R = string;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(dyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                tyVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(tyVar.getThemedColor(i6.f19297q7));
                }
            }
        }
        return true;
    }
}
