package gh;

import android.app.Dialog;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.tk0;
public final class b2 implements Utilities.Callback2 {
    public final int f7831a;
    public final Dialog f7832b;
    public final Object f7833c;
    public final Serializable d;
    public final Object f7834e;

    public b2(Dialog dialog, Object obj, Serializable serializable, Object obj2, int i9) {
        this.f7831a = i9;
        this.f7832b = dialog;
        this.f7833c = obj;
        this.d = serializable;
        this.f7834e = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i9 = this.f7831a;
        Object obj3 = this.f7834e;
        Serializable serializable = this.d;
        Object obj4 = this.f7833c;
        Dialog dialog = this.f7832b;
        switch (i9) {
            case 0:
                k5.b0((k5) dialog, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.c2) dialog).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    tk0.f43026a = f3Var;
                    f3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var2 = tk0.f43026a;
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    tk0.f43026a = null;
                }
                oc a2 = tk0.a();
                int i10 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var));
                }
                a2.M(string, replaceSingleLinkBold, i10).j();
                return;
        }
    }
}
