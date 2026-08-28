package of;

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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.dy;
import org.telegram.ui.ox;
public final class v implements d0, ok0 {
    public final f0 f19522a;

    public v(f0 f0Var) {
        this.f19522a = f0Var;
    }

    @Override
    public boolean a(int i9, View view) {
        TLRPC.User user;
        ox oxVar = this.f19522a.Q;
        if (oxVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            dy dyVar = oxVar.f41259a;
            if (dyVar.getParentActivity() != null && (user = dyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new d3.e(oxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                dyVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(dyVar.getThemedColor(f6.f23230q7));
                }
            }
        }
        return true;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        f0 f0Var = this.f19522a;
        int i9 = f0Var.f19303o0;
        f0Var.f19304p0 = arrayList;
        f0Var.f19310t0 = hVar;
        for (int i10 = 0; i10 < f0Var.f19304p0.size(); i10++) {
            e0 e0Var = (e0) f0Var.f19304p0.get(i10);
            TLObject tLObject = e0Var.f19279a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i9).putUser((TLRPC.User) e0Var.f19279a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i9).putChat((TLRPC.Chat) e0Var.f19279a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i9).putEncryptedChat((TLRPC.EncryptedChat) e0Var.f19279a, true);
            }
        }
        f0Var.G(null);
        f0Var.l();
    }
}
