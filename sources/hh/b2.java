package hh;

import android.app.Dialog;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tk0;

public final class b2 implements Utilities.Callback2 {

    public final int f8989a;

    public final Dialog f8990b;

    public final Object f8991c;
    public final Serializable d;

    public final Object f8992e;

    public b2(Dialog dialog, Object obj, Serializable serializable, Object obj2, int i10) {
        this.f8989a = i10;
        this.f8990b = dialog;
        this.f8991c = obj;
        this.d = serializable;
        this.f8992e = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f8989a;
        Object obj3 = this.f8992e;
        Serializable serializable = this.d;
        Object obj4 = this.f8991c;
        Dialog dialog = this.f8990b;
        switch (i10) {
            case 0:
                i5.c0((i5) dialog, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                ((org.telegram.ui.ActionBar.b2) dialog).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.e3 e3Var2 = tk0.f42959a;
                    if (e3Var2 != null) {
                        e3Var2.dismiss();
                        tk0.f42959a = null;
                    }
                    tk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), R.raw.error).j();
                } else {
                    tk0.f42959a = e3Var;
                    e3Var.show();
                }
                break;
        }
    }
}
