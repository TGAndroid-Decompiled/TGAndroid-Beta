package di;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a31;
import org.telegram.ui.bd;
import org.telegram.ui.w90;
public final class e implements Utilities.Callback {
    public final int f8506a;

    public e(int i10) {
        this.f8506a = i10;
    }

    @Override
    public final void run(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f8506a) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            case 1:
                ((View) obj).setTranslationY(0.0f);
                return;
            case 2:
                ((q) ((View) obj)).invalidate();
                return;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof jg.y1) {
                    ((jg.y1) view2).f15902c.invalidate();
                    return;
                }
                return;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof jg.y1) {
                    ((jg.y1) view3).d.a(false, true);
                    return;
                }
                return;
            case 5:
                ((View) obj).invalidate();
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = org.telegram.ui.ActionBar.s3.K;
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                int i10 = org.telegram.ui.ActionBar.q3.f22983r;
                return;
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                int i11 = xa.f25730n;
                return;
            case 9:
                bd.b1((View) obj);
                return;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view4).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    messageObject.reactionsChanged = true;
                    return;
                }
                return;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = ((org.telegram.ui.Cells.s1) view5).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    return;
                }
                return;
            case 12:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.c3) {
                    ((org.telegram.ui.ActionBar.c3) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 13:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.l5) {
                    org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view7;
                    l5Var.f24384b.invalidate();
                    l5Var.f24385c.invalidate();
                    return;
                } else if (view7 instanceof jg.y1) {
                    ((jg.y1) view7).f15902c.invalidate();
                    return;
                } else {
                    view7.invalidate();
                    return;
                }
            case 14:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.i8) {
                    ((org.telegram.ui.Cells.i8) view8).a(true);
                    return;
                }
                return;
            case 15:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.i8) {
                    ((org.telegram.ui.Cells.i8) view9).c(true);
                    return;
                }
                return;
            case 16:
                ((Boolean) obj).getClass();
                return;
            case 17:
                Integer num = (Integer) obj;
                return;
            case 18:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.t4(l4.longValue()));
                        return;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new w90(5));
                return;
            case 19:
                Boolean bool3 = (Boolean) obj;
                int i12 = ProfileActivity.R6;
                return;
            case 20:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(a31.Z());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                a31.f37671s = false;
                for (int i13 = 0; i13 < 4; i13++) {
                    try {
                        MessagesController.getInstance(i13).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 21:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                return;
            case 22:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view11).setChecked(false);
                    return;
                }
                return;
            case 23:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view12).setChecked(false);
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }

    public e(bd bdVar) {
        this.f8506a = 9;
    }
}
