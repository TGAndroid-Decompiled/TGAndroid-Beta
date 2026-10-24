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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.ey;
import org.telegram.ui.px;
public final class w implements f0, bm0 {
    public final h0 f12113a;

    public w(h0 h0Var) {
        this.f12113a = h0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.f12113a;
        int i10 = h0Var.f11921s0;
        h0Var.f11922t0 = arrayList;
        h0Var.f11928x0 = hVar;
        for (int i11 = 0; i11 < h0Var.f11922t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.f11922t0.get(i11);
            TLObject tLObject = g0Var.f11893a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.f11893a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.f11893a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f11893a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        px pxVar = this.f12113a.U;
        if (pxVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ey eyVar = pxVar.f40644a;
            if (eyVar.getParentActivity() != null && (user = eyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ci.d1(pxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                eyVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    r6.W(textView, k6.f21422q7, eyVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
