package bg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.b31;
public final class k implements Utilities.Callback {
    public final int f1852a;

    public k(int i9) {
        this.f1852a = i9;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1852a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = m3.G;
                return;
            case 2:
                Boolean bool2 = (Boolean) obj;
                int i9 = k3.f23606r;
                return;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                int i10 = sa.f25296f;
                return;
            case 4:
                ((Boolean) obj).getClass();
                return;
            case 5:
                Integer num = (Integer) obj;
                return;
            default:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(b31.X());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                b31.f36617s = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    try {
                        MessagesController.getInstance(i11).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                return;
        }
    }
}
