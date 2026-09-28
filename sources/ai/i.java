package ai;

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
import org.telegram.ui.Components.th;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.w31;
public final class i implements Utilities.Callback {
    public final int f973a;

    public i(int i10) {
        this.f973a = i10;
    }

    @Override
    public final void run(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f973a) {
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
                ((a0) ((View) obj)).invalidate();
                return;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof hg.y1) {
                    ((hg.y1) view2).f10467c.invalidate();
                    return;
                }
                return;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof hg.y1) {
                    ((hg.y1) view3).d.a(false, true);
                    return;
                }
                return;
            case 5:
                ((View) obj).invalidate();
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                int i10 = org.telegram.ui.ActionBar.k3.f19584r;
                return;
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                int i11 = org.telegram.ui.Cells.wa.f21823f;
                return;
            case 9:
                ad.Y0((View) obj);
                return;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) view4).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    messageObject.reactionsChanged = true;
                    return;
                }
                return;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.u1) && (messageObject2 = ((org.telegram.ui.Cells.u1) view5).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    return;
                }
                return;
            case 12:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.x2) {
                    ((org.telegram.ui.ActionBar.x2) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 13:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.h5) {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view7;
                    h5Var.f20394b.invalidate();
                    h5Var.f20395c.invalidate();
                    return;
                } else if (view7 instanceof hg.y1) {
                    ((hg.y1) view7).f10467c.invalidate();
                    return;
                } else {
                    view7.invalidate();
                    return;
                }
            case 14:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view8).a(true);
                    return;
                }
                return;
            case 15:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view9).c(true);
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
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l4.longValue()));
                        return;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new th(27));
                return;
            case 19:
                Boolean bool3 = (Boolean) obj;
                return;
            case 20:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(w31.Y());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                w31.f38884s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        MessagesController.getInstance(i12).getTranslateController().checkRestrictedLanguagesUpdate();
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
                if (view11 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view11).setChecked(false);
                    return;
                }
                return;
            case 23:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view12).setChecked(false);
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }

    public i(ad adVar) {
        this.f973a = 9;
    }
}
