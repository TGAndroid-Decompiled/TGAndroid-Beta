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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ey;
import org.telegram.ui.px;
public final class w implements f0, yl0 {
    public final h0 f12086a;

    public w(h0 h0Var) {
        this.f12086a = h0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        TLRPC.User user;
        px pxVar = this.f12086a.U;
        if (pxVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ey eyVar = pxVar.f40259a;
            if (eyVar.getParentActivity() != null && (user = eyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ci.d1(pxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                eyVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(eyVar.getThemedColor(h6.f21231q7));
                }
            }
        }
        return true;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f12086a;
        int i10 = h0Var.f11897s0;
        h0Var.f11898t0 = arrayList;
        h0Var.f11904x0 = hVar;
        for (int i11 = 0; i11 < h0Var.f11898t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.f11898t0.get(i11);
            TLObject tLObject = g0Var.f11869a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.f11869a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.f11869a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f11869a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }
}
