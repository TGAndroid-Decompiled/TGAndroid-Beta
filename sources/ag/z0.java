package ag;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.r5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
import org.telegram.ui.zc;
public final class z0 implements q20 {
    public final int f816a;

    public z0(int i10) {
        this.f816a = i10;
    }

    @Override
    public final void a(Object obj) {
        jj messageObject;
        jj messageObject2;
        switch (this.f816a) {
            case 0:
                View view = (View) obj;
                if (view instanceof y2) {
                    ((y2) view).f809c.invalidate();
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof y2) {
                    ((y2) view2).d.a(false, true);
                    return;
                }
                return;
            case 2:
                ((View) obj).invalidate();
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
            case 4:
                String str = (String) obj;
                r5 r5Var = qz.I;
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                return;
            case 6:
                Boolean bool2 = (Boolean) obj;
                int i10 = org.telegram.ui.ActionBar.g3.f20338r;
                return;
            case 7:
                ArrayList arrayList = (ArrayList) obj;
                int i11 = ma.f22318n;
                return;
            case 8:
                zc.e1((View) obj);
                return;
            case 9:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view3).getMessageObject()) != null) {
                    messageObject.K1 = true;
                    messageObject.H = true;
                    return;
                }
                return;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = ((org.telegram.ui.Cells.q1) view4).getMessageObject()) != null) {
                    messageObject2.K1 = true;
                    return;
                }
                return;
            case 11:
                View view5 = (View) obj;
                if (view5 instanceof org.telegram.ui.ActionBar.s2) {
                    ((org.telegram.ui.ActionBar.s2) view5).getTextView().invalidate();
                    return;
                } else {
                    view5.invalidate();
                    return;
                }
            case 12:
                View view6 = (View) obj;
                if (view6 instanceof j5) {
                    j5 j5Var = (j5) view6;
                    j5Var.f22085b.invalidate();
                    j5Var.f22086c.invalidate();
                    return;
                } else if (view6 instanceof y2) {
                    ((y2) view6).f809c.invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 13:
                View view7 = (View) obj;
                if (view7 instanceof d8) {
                    ((d8) view7).a(true);
                    return;
                }
                return;
            case 14:
                View view8 = (View) obj;
                if (view8 instanceof d8) {
                    ((d8) view8).c(true);
                    return;
                }
                return;
            case 15:
                ((Boolean) obj).getClass();
                return;
            case 16:
                Integer num = (Integer) obj;
                return;
            case 17:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.z4(l4.longValue()));
                        return;
                    }
                    return;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(12));
                return;
            case 18:
                Boolean bool3 = (Boolean) obj;
                RectF rectF = ProfileActivity.R6;
                return;
            case 19:
                HashSet hashSet = (HashSet) obj;
                String str2 = cd.D0().B.f19498f;
                hashSet.addAll(e01.c0());
                SharedPreferences.Editor edit = vp.d1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str2)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                e01.f36880s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        vp.r1(i12).f18910t7.g();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 20:
                View view9 = (View) obj;
                view9.setScaleX(1.0f);
                view9.setScaleY(1.0f);
                return;
            case 21:
                String str3 = (String) obj;
                ArrayList arrayList2 = org.telegram.ui.Wallet.u2.f35268a;
                return;
            case 22:
                ((org.telegram.ui.Wallet.s2) obj).a();
                return;
            case 23:
                ((org.telegram.ui.Wallet.s2) obj).b();
                return;
            case 24:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view10).setChecked(false);
                    return;
                }
                return;
            case 25:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view11).setChecked(false);
                    return;
                }
                return;
            case 26:
                View view12 = (View) obj;
                view12.setAlpha(1.0f);
                view12.setTranslationX(0.0f);
                view12.setTranslationY(0.0f);
                return;
            case 27:
                ((View) obj).setTranslationY(0.0f);
                return;
            default:
                ((th.l) ((View) obj)).invalidate();
                return;
        }
    }

    public z0(zc zcVar) {
        this.f816a = 8;
    }
}
