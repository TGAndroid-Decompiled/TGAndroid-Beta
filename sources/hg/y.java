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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.gy;
import org.telegram.ui.uy;
public final class y implements g0, bl0 {
    public final i0 f11319a;

    public y(i0 i0Var) {
        this.f11319a = i0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        TLRPC.User user;
        gy gyVar = this.f11319a.U;
        if (gyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            uy uyVar = gyVar.f36810a;
            if (uyVar.getParentActivity() != null && (user = uyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new bi.p1(gyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                uyVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(uyVar.getThemedColor(j6.f20898q7));
                }
            }
        }
        return true;
    }

    @Override
    public void b(a0.i iVar, ArrayList arrayList) {
        i0 i0Var = this.f11319a;
        int i10 = i0Var.f11093s0;
        i0Var.f11094t0 = arrayList;
        i0Var.f11100x0 = iVar;
        for (int i11 = 0; i11 < i0Var.f11094t0.size(); i11++) {
            h0 h0Var = (h0) i0Var.f11094t0.get(i11);
            TLObject tLObject = h0Var.f11062a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) h0Var.f11062a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) h0Var.f11062a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f11062a, true);
            }
        }
        i0Var.G(null);
        i0Var.l();
    }
}
