package jh;

import android.app.Dialog;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
import org.telegram.ui.pk0;
public final class z1 implements Utilities.Callback2 {
    public final int f13152a;
    public final Dialog f13153b;
    public final Object f13154c;
    public final Serializable d;
    public final Object f13155e;

    public z1(Dialog dialog, Object obj, Serializable serializable, Object obj2, int i10) {
        this.f13152a = i10;
        this.f13153b = dialog;
        this.f13154c = obj;
        this.d = serializable;
        this.f13155e = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f13152a;
        Object obj3 = this.f13155e;
        Serializable serializable = this.d;
        Object obj4 = this.f13154c;
        Dialog dialog = this.f13153b;
        switch (i10) {
            case 0:
                h5.c0((h5) dialog, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.c2) dialog).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    pk0.f41429a = f3Var;
                    f3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var2 = pk0.f41429a;
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    pk0.f41429a = null;
                }
                tc a2 = pk0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
        }
    }
}
