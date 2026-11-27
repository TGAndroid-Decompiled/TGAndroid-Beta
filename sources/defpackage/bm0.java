package defpackage;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class bm0 implements pcc {
    public final byte a;

    public bm0(wh1 wh1Var) {
        this.a = (byte) 3;
    }

    @Override
    public final void a(Object obj) {
        r47 messageObject;
        r47 messageObject2;
        int i;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof cb) {
                    ((cb) view).setChecked(false);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                return;
            case 3:
                wh1.f1((View) obj);
                return;
            case 4:
                View view2 = (View) obj;
                if ((view2 instanceof wb2) && (messageObject = ((wb2) view2).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    return;
                }
                return;
            case 5:
                View view3 = (View) obj;
                if ((view3 instanceof wb2) && (messageObject2 = ((wb2) view3).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    return;
                }
                return;
            case 6:
                View view4 = (View) obj;
                if (view4 instanceof w09) {
                    ((w09) view4).c.invalidate();
                    return;
                }
                return;
            case 7:
                View view5 = (View) obj;
                view5.setAlpha(1.0f);
                view5.setTranslationX(0.0f);
                view5.setTranslationY(0.0f);
                return;
            case 8:
                ((View) obj).setTranslationY(0.0f);
                return;
            case 9:
                ((og3) ((View) obj)).invalidate();
                return;
            case 10:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                return;
            case 11:
                View view6 = (View) obj;
                if (view6 instanceof hx0) {
                    ((hx0) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 12:
                ((View) obj).invalidate();
                return;
            case 13:
                ((m55) obj).a();
                return;
            case 14:
                ((m55) obj).b();
                return;
            case 15:
                ((Boolean) obj).getClass();
                return;
            case 16:
                View view7 = (View) obj;
                if (view7 instanceof cb) {
                    ((cb) view7).setChecked(false);
                    return;
                }
                return;
            case 17:
                Integer num = (Integer) obj;
                return;
            case 18:
                View view8 = (View) obj;
                if (view8 instanceof f17) {
                    f17 f17Var = (f17) view8;
                    f17Var.b.invalidate();
                    f17Var.c.invalidate();
                    return;
                } else if (view8 instanceof w09) {
                    ((w09) view8).c.invalidate();
                    return;
                } else {
                    view8.invalidate();
                    return;
                }
            case 19:
                Long l = (Long) obj;
                if (l != null && l.longValue() != Long.MAX_VALUE) {
                    e S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(ProfileActivity.Q2(l.longValue()));
                        return;
                    }
                    return;
                }
                hl.c3(new pg6((byte) 7));
                return;
            case 20:
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                return;
            case 21:
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                    return;
                }
                return;
            case 22:
                Boolean bool2 = (Boolean) obj;
                RectF rectF = ProfileActivity.Z6;
                return;
            case 23:
                View view9 = (View) obj;
                if (view9 instanceof w09) {
                    ((w09) view9).d.a(false, true);
                    return;
                }
                return;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str = ob6.D0().B.f;
                hashSet.addAll(ee9.b0());
                SharedPreferences.Editor edit = uc7.e1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                ee9.s = false;
                for (int i2 = 0; i2 < 4; i2++) {
                    try {
                        uc7.s1(i2).j4.f();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 25:
                jn7 e = jn7.e();
                if (((Boolean) obj).booleanValue()) {
                    i = 99;
                } else {
                    i = 100;
                }
                e.k(i, 4);
                return;
            case 26:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                return;
            case 27:
                String str2 = (String) obj;
                return;
            case 28:
                View view11 = (View) obj;
                if (view11 instanceof x2b) {
                    ((x2b) view11).a(true);
                    return;
                }
                return;
            default:
                View view12 = (View) obj;
                if (view12 instanceof x2b) {
                    ((x2b) view12).c(true);
                    return;
                }
                return;
        }
    }

    public bm0(byte b) {
        this.a = b;
    }
}
