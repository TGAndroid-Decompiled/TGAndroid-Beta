package fi;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.zy;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.gu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.qc;
import org.telegram.ui.ry0;
public final class e implements w10 {
    public final int f11871a;

    public e(int i7) {
        this.f11871a = i7;
    }

    @Override
    public final void a(Object obj) {
        fj messageObject;
        fj messageObject2;
        switch (this.f11871a) {
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
                ((p) ((View) obj)).invalidate();
                return;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof kg.s1) {
                    ((kg.s1) view2).f18567c.invalidate();
                    return;
                }
                return;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof kg.s1) {
                    ((kg.s1) view3).d.a(false, true);
                    return;
                }
                return;
            case 5:
                String str = (String) obj;
                org.telegram.messenger.q5 q5Var = zy.J;
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                int i7 = org.telegram.ui.ActionBar.d3.f28925r;
                return;
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                int i10 = pa.f31341n;
                return;
            case 9:
                qc.f1((View) obj);
                return;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.r1) && (messageObject = ((org.telegram.ui.Cells.r1) view4).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    return;
                }
                return;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.r1) && (messageObject2 = ((org.telegram.ui.Cells.r1) view5).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    return;
                }
                return;
            case 12:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                gu guVar = gu.S1;
                return;
            case 13:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.p2) {
                    ((org.telegram.ui.ActionBar.p2) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 14:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.g5) {
                    org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view7;
                    g5Var.f30755b.invalidate();
                    g5Var.f30756c.invalidate();
                    return;
                } else if (view7 instanceof kg.s1) {
                    ((kg.s1) view7).f18567c.invalidate();
                    return;
                } else {
                    view7.invalidate();
                    return;
                }
            case 15:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.z7) {
                    ((org.telegram.ui.Cells.z7) view8).a(true);
                    return;
                }
                return;
            case 16:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.z7) {
                    ((org.telegram.ui.Cells.z7) view9).c(true);
                    return;
                }
                return;
            case 17:
                View view10 = (View) obj;
                if (view10 instanceof d11) {
                    ((d11) view10).a(true);
                    return;
                }
                return;
            case 18:
                ((Boolean) obj).getClass();
                return;
            case 19:
                Integer num = (Integer) obj;
                return;
            case 20:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.D4(l10.longValue()));
                        return;
                    }
                    return;
                }
                org.telegram.messenger.g0.g3(new cd0(2));
                return;
            case 21:
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                    return;
                }
                return;
            case 22:
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                return;
            case 23:
                Boolean bool3 = (Boolean) obj;
                RectF rectF = ProfileActivity.Z6;
                return;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str2 = gd.E0().B.f23447f;
                hashSet.addAll(ry0.d0());
                SharedPreferences.Editor edit = mp.g1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str2)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                ry0.f51915s = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    try {
                        mp.u1(i11).f25882v7.g();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 25:
                View view11 = (View) obj;
                view11.setScaleX(1.0f);
                view11.setScaleY(1.0f);
                return;
            case 26:
                ((org.telegram.ui.Wallet.y2) obj).a();
                return;
            case 27:
                ((org.telegram.ui.Wallet.y2) obj).b();
                return;
            case 28:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view12).setChecked(false);
                    return;
                }
                return;
            default:
                View view13 = (View) obj;
                if (view13 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view13).setChecked(false);
                    return;
                }
                return;
        }
    }

    public e(qc qcVar) {
        this.f11871a = 9;
    }
}
