package ei;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.go;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gy0;
import org.telegram.ui.pc;
public final class e implements u10 {
    public final int f10213a;

    public e(int i3) {
        this.f10213a = i3;
    }

    @Override
    public final void a(Object obj) {
        zi messageObject;
        zi messageObject2;
        switch (this.f10213a) {
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
                if (view2 instanceof lg.q1) {
                    ((lg.q1) view2).f18416c.invalidate();
                    return;
                }
                return;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof lg.q1) {
                    ((lg.q1) view3).d.a(false, true);
                    return;
                }
                return;
            case 5:
                String str = (String) obj;
                org.telegram.messenger.p5 p5Var = yy.J;
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                int i3 = org.telegram.ui.ActionBar.z2.f28884r;
                return;
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                int i10 = ma.f29636n;
                return;
            case 9:
                pc.f1((View) obj);
                return;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view4).getMessageObject()) != null) {
                    messageObject.K1 = true;
                    return;
                }
                return;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = ((org.telegram.ui.Cells.q1) view5).getMessageObject()) != null) {
                    messageObject2.K1 = true;
                    messageObject2.H = true;
                    return;
                }
                return;
            case 12:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.m2) {
                    ((org.telegram.ui.ActionBar.m2) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 13:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view7;
                    f5Var.f29175b.invalidate();
                    f5Var.f29176c.invalidate();
                    return;
                } else if (view7 instanceof lg.q1) {
                    ((lg.q1) view7).f18416c.invalidate();
                    return;
                } else {
                    view7.invalidate();
                    return;
                }
            case 14:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.y7) {
                    ((org.telegram.ui.Cells.y7) view8).a(true);
                    return;
                }
                return;
            case 15:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.y7) {
                    ((org.telegram.ui.Cells.y7) view9).c(true);
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
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.A4(l10.longValue()));
                        return;
                    }
                    return;
                }
                org.telegram.messenger.g0.h3(new go(25));
                return;
            case 19:
                Boolean bool3 = (Boolean) obj;
                RectF rectF = ProfileActivity.T6;
                return;
            case 20:
                HashSet hashSet = (HashSet) obj;
                String str2 = bd.E0().B.f26565f;
                hashSet.addAll(gy0.d0());
                SharedPreferences.Editor edit = hp.e1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str2)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                gy0.f45729s = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    try {
                        hp.s1(i11).f23120s7.g();
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
                String str3 = (String) obj;
                ArrayList arrayList2 = org.telegram.ui.Wallet.t2.f43197a;
                return;
            case 23:
                ((org.telegram.ui.Wallet.r2) obj).a();
                return;
            case 24:
                ((org.telegram.ui.Wallet.r2) obj).b();
                return;
            case 25:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view11).setChecked(false);
                    return;
                }
                return;
            case 26:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view12).setChecked(false);
                    return;
                }
                return;
            case 27:
                ((View) obj).invalidate();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }

    public e(pc pcVar) {
        this.f10213a = 9;
    }
}
