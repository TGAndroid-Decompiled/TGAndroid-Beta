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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.dy;
import org.telegram.ui.ry;
public final class y implements g0, cl0 {
    public final i0 f9968a;

    public y(i0 i0Var) {
        this.f9968a = i0Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        i0 i0Var = this.f9968a;
        int i10 = i0Var.f9766s0;
        i0Var.f9767t0 = arrayList;
        i0Var.f9773x0 = iVar;
        for (int i11 = 0; i11 < i0Var.f9767t0.size(); i11++) {
            h0 h0Var = (h0) i0Var.f9767t0.get(i11);
            TLObject tLObject = h0Var.f9736a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) h0Var.f9736a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) h0Var.f9736a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f9736a, true);
            }
        }
        i0Var.G(null);
        i0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        dy dyVar = this.f9968a.U;
        if (dyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ry ryVar = dyVar.f32739a;
            if (ryVar.getParentActivity() != null && (user = ryVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(dyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ryVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(ryVar.getThemedColor(h6.f19026q7));
                }
            }
        }
        return true;
    }
}
