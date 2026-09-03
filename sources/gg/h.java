package gg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.t31;
public final class h implements Utilities.Callback {
    public final int f6643a;

    public h(int i10) {
        this.f6643a = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6643a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = n3.H;
                return;
            case 2:
                Boolean bool2 = (Boolean) obj;
                int i10 = l3.f20396r;
                return;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                int i11 = ra.f21894f;
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
                hashSet.addAll(t31.Y());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                t31.f38374s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        MessagesController.getInstance(i12).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                return;
        }
    }
}
