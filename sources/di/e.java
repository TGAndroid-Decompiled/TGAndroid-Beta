package di;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.vt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rc;
import org.telegram.ui.uy0;
public final class e implements c20 {
    public final int f8944a;

    public e(int i7) {
        this.f8944a = i7;
    }

    @Override
    public final void a(Object obj) {
        ij messageObject;
        ij messageObject2;
        switch (this.f8944a) {
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
                if (view2 instanceof kg.p1) {
                    ((kg.p1) view2).f17482c.invalidate();
                    return;
                }
                return;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof kg.p1) {
                    ((kg.p1) view3).d.a(false, true);
                    return;
                }
                return;
            case 5:
                String str = (String) obj;
                org.telegram.messenger.p5 p5Var = gz.I;
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = org.telegram.ui.ActionBar.e3.K;
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                int i7 = org.telegram.ui.ActionBar.c3.f27362r;
                return;
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                int i10 = ma.f29594n;
                return;
            case 9:
                rc.f1((View) obj);
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
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                vt vtVar = vt.R1;
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
                if (view7 instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view7;
                    f5Var.f29134b.invalidate();
                    f5Var.f29135c.invalidate();
                    return;
                } else if (view7 instanceof kg.p1) {
                    ((kg.p1) view7).f17482c.invalidate();
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
                ((Boolean) obj).getClass();
                return;
            case 18:
                Integer num = (Integer) obj;
                return;
            case 19:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.D4(l10.longValue()));
                        return;
                    }
                    return;
                }
                org.telegram.messenger.g0.h3(new us(26));
                return;
            case 20:
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                    return;
                }
                return;
            case 21:
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                return;
            case 22:
                Boolean bool3 = (Boolean) obj;
                RectF rectF = ProfileActivity.V6;
                return;
            case 23:
                HashSet hashSet = (HashSet) obj;
                String str2 = id.E0().B.f22404f;
                hashSet.addAll(uy0.d0());
                SharedPreferences.Editor edit = qp.e1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str2)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                uy0.f50586s = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    try {
                        qp.s1(i11).f24900s7.g();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 24:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                return;
            case 25:
                String str3 = (String) obj;
                ArrayList arrayList2 = org.telegram.ui.Wallet.t2.f43180a;
                return;
            case 26:
                ((org.telegram.ui.Wallet.r2) obj).a();
                return;
            case 27:
                ((org.telegram.ui.Wallet.r2) obj).b();
                return;
            case 28:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view11).setChecked(false);
                    return;
                }
                return;
            default:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view12).setChecked(false);
                    return;
                }
                return;
        }
    }

    public e(rc rcVar) {
        this.f8944a = 9;
    }
}
