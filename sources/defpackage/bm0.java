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
public final class bm0 implements p8c {
    public final byte a;

    public bm0(nh1 nh1Var) {
        this.a = (byte) 3;
    }

    @Override
    public final void a(Object obj) {
        k27 messageObject;
        k27 messageObject2;
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
                nh1.e1((View) obj);
                return;
            case 4:
                View view2 = (View) obj;
                if ((view2 instanceof gb2) && (messageObject = ((gb2) view2).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    return;
                }
                return;
            case 5:
                View view3 = (View) obj;
                if ((view3 instanceof gb2) && (messageObject2 = ((gb2) view3).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    return;
                }
                return;
            case 6:
                View view4 = (View) obj;
                if (view4 instanceof jx8) {
                    ((jx8) view4).c.invalidate();
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
                ((uf3) ((View) obj)).invalidate();
                return;
            case 10:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                return;
            case 11:
                View view6 = (View) obj;
                if (view6 instanceof zw0) {
                    ((zw0) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 12:
                ((View) obj).invalidate();
                return;
            case 13:
                ((i35) obj).a();
                return;
            case 14:
                ((i35) obj).b();
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
                if (view8 instanceof yy6) {
                    yy6 yy6Var = (yy6) view8;
                    yy6Var.b.invalidate();
                    yy6Var.c.invalidate();
                    return;
                } else if (view8 instanceof jx8) {
                    ((jx8) view8).c.invalidate();
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
                        S.presentFragment(ProfileActivity.P2(l.longValue()));
                        return;
                    }
                    return;
                }
                gl.c3(new am6((byte) 5));
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
                RectF rectF = ProfileActivity.Z6;
                return;
            case 23:
                View view9 = (View) obj;
                if (view9 instanceof jx8) {
                    ((jx8) view9).d.a(false, true);
                    return;
                }
                return;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str = k96.D0().B.f;
                hashSet.addAll(qa9.b0());
                SharedPreferences.Editor edit = na7.c1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                qa9.s = false;
                for (int i2 = 0; i2 < 4; i2++) {
                    try {
                        na7.q1(i2).i4.f();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 25:
                kk7 e = kk7.e();
                if (((Boolean) obj).booleanValue()) {
                    i = 98;
                } else {
                    i = 99;
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
                if (view11 instanceof xya) {
                    ((xya) view11).a(true);
                    return;
                }
                return;
            default:
                View view12 = (View) obj;
                if (view12 instanceof xya) {
                    ((xya) view12).c(true);
                    return;
                }
                return;
        }
    }

    public bm0(byte b) {
        this.a = b;
    }
}
