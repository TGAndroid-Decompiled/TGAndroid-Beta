package fg;

import android.view.View;
import android.widget.TextView;
import bi.za;
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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.iy;
import org.telegram.ui.wy;
public final class x implements f0, ll0 {
    public final h0 f8253a;

    public x(h0 h0Var) {
        this.f8253a = h0Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        h0 h0Var = this.f8253a;
        int i10 = h0Var.f8050s0;
        h0Var.f8051t0 = arrayList;
        h0Var.f8057x0 = iVar;
        for (int i11 = 0; i11 < h0Var.f8051t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.f8051t0.get(i11);
            TLObject tLObject = g0Var.f8020a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.f8020a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.f8020a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f8020a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        iy iyVar = this.f8253a.U;
        if (iyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            wy wyVar = iyVar.f33812a;
            if (wyVar.getParentActivity() != null && (user = wyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new za(iyVar, longValue, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(wyVar.getThemedColor(j6.f18162q7));
                }
            }
        }
        return true;
    }
}
