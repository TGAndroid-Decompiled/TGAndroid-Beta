package cg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.a31;

public final class h implements Utilities.Callback {

    public final int f2690a;

    public h(int i10) {
        this.f2690a = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2690a) {
            case 0:
                break;
            case 1:
                HashMap map = m3.G;
                break;
            case 2:
                int i10 = k3.f23607r;
                break;
            case 3:
                int i11 = oa.f24826f;
                break;
            case 4:
                ((Boolean) obj).getClass();
                break;
            case 5:
                break;
            default:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(a31.Y());
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    editorEdit.remove("translate_button_restricted_languages");
                } else {
                    editorEdit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                editorEdit.putInt("translate_button_restricted_languages_version", 2).apply();
                a31.f36361s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        MessagesController.getInstance(i12).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                break;
        }
    }
}
