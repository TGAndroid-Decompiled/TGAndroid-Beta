package defpackage;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class bn0 implements qac {
    public final byte a;

    public bn0(vi1 vi1Var) {
        this.a = (byte) 3;
    }

    @Override
    public final void a(Object obj) {
        k47 messageObject;
        k47 messageObject2;
        int i;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof bb) {
                    ((bb) view).setChecked(false);
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
                vi1.f1((View) obj);
                return;
            case 4:
                View view2 = (View) obj;
                if ((view2 instanceof rc2) && (messageObject = ((rc2) view2).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    return;
                }
                return;
            case 5:
                View view3 = (View) obj;
                if ((view3 instanceof rc2) && (messageObject2 = ((rc2) view3).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    return;
                }
                return;
            case 6:
                View view4 = (View) obj;
                if (view4 instanceof kz8) {
                    ((kz8) view4).c.invalidate();
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
                ((hh3) ((View) obj)).invalidate();
                return;
            case 10:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                return;
            case 11:
                View view6 = (View) obj;
                if (view6 instanceof gy0) {
                    ((gy0) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 12:
                ((View) obj).invalidate();
                return;
            case 13:
                ((i55) obj).a();
                return;
            case 14:
                ((i55) obj).b();
                return;
            case 15:
                ((Boolean) obj).getClass();
                return;
            case 16:
                View view7 = (View) obj;
                if (view7 instanceof bb) {
                    ((bb) view7).setChecked(false);
                    return;
                }
                return;
            case 17:
                Integer num = (Integer) obj;
                return;
            case 18:
                View view8 = (View) obj;
                if (view8 instanceof y07) {
                    y07 y07Var = (y07) view8;
                    y07Var.b.invalidate();
                    y07Var.c.invalidate();
                    return;
                } else if (view8 instanceof kz8) {
                    ((kz8) view8).c.invalidate();
                    return;
                } else {
                    view8.invalidate();
                    return;
                }
            case 19:
                Long l = (Long) obj;
                if (l != null && l.longValue() != Long.MAX_VALUE) {
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(ProfileActivity.S2(l.longValue()));
                        return;
                    }
                    return;
                }
                gm.c3(new bo6((byte) 5));
                return;
            case 20:
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                    return;
                }
                return;
            case 21:
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                return;
            case 22:
                Boolean bool2 = (Boolean) obj;
                RectF rectF = ProfileActivity.e7;
                return;
            case 23:
                View view9 = (View) obj;
                if (view9 instanceof kz8) {
                    ((kz8) view9).d.a(false, true);
                    return;
                }
                return;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str = jb6.D0().B.f;
                hashSet.addAll(qc9.c0());
                SharedPreferences.Editor edit = oc7.d1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                qc9.s = false;
                for (int i2 = 0; i2 < 4; i2++) {
                    try {
                        oc7.r1(i2).i4.f();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 25:
                nm7 e = nm7.e();
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
                if (view11 instanceof y0b) {
                    ((y0b) view11).a(true);
                    return;
                }
                return;
            default:
                View view12 = (View) obj;
                if (view12 instanceof y0b) {
                    ((y0b) view12).c(true);
                    return;
                }
                return;
        }
    }

    public bn0(byte b) {
        this.a = b;
    }
}
