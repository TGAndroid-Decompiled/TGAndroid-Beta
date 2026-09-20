package m4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Components.v9;
import org.telegram.ui.ed0;
import org.telegram.ui.gd0;
import org.telegram.ui.hd0;
import org.telegram.ui.jd0;
import org.telegram.ui.kd0;
import org.telegram.ui.tv;
import w7.y5;
public final class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final float f14755a;
    public final Object f14756b;

    public g0(Object obj, float f7) {
        this.f14756b = obj;
        this.f14755a = f7;
    }

    @Override
    public void f(r rVar) {
        ((k0) this.f14756b).f14806g.f14687t.a(this.f14755a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        kd0 kd0Var = (kd0) this.f14756b;
        ArrayList arrayList = kd0Var.f35103g0;
        if (iMarker.getTag() instanceof jd0) {
            kd0Var.X.setVisibility(4);
            if (!kd0Var.C0) {
                ImageView imageView = kd0Var.f35093a;
                int i14 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(kd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                kd0Var.f35093a.setTag(Integer.valueOf(i14));
                kd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                ed0 ed0Var = (ed0) arrayList.get(i15);
                if (ed0Var != null && ed0Var.e == iMarker) {
                    kd0Var.f35105i0 = ed0Var.f33311a;
                    if (kd0Var.f35106j0) {
                        kd0Var.f35106j0 = false;
                        kd0Var.C0();
                    }
                    kd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ed0Var.e.getPosition(), this.f14755a));
                } else {
                    i15++;
                }
            }
            hd0 hd0Var = kd0Var.f35123x;
            kd0 kd0Var2 = hd0Var.f34172b;
            HashMap hashMap = hd0Var.f34171a;
            jd0 jd0Var = (jd0) iMarker.getTag();
            if (jd0Var != null && kd0Var2.f35110n0 != jd0Var) {
                kd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = kd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        hd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    kd0Var2.m0 = null;
                }
                kd0Var2.f35110n0 = jd0Var;
                kd0Var2.m0 = iMarker;
                Context context = hd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                hd0Var.addView(frameLayout, y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                kd0Var2.f35111o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                kd0Var2.f35111o0.getBackground().setColorFilter(new PorterDuffColorFilter(kd0Var2.getThemedColor(j6.f19165h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(kd0Var2.f35111o0, y5.c(71.0f, -2));
                kd0Var2.f35111o0.setAlpha(0.0f);
                kd0Var2.f35111o0.setOnClickListener(new tv(17, hd0Var, jd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(kd0Var2.getThemedColor(j6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = kd0Var2.f35111o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView h = org.telegram.ui.Cells.c1.h(frameLayout3, textView, y5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(kd0Var2.getThemedColor(j6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                h.setGravity(i12);
                FrameLayout frameLayout4 = kd0Var2.f35111o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(h, y5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(jd0Var.f34897c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(j6.K(AndroidUtilities.dp(36.0f), v4.a(jd0Var.f34895a)));
                frameLayout.addView(frameLayout5, y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                v9 v9Var = new v9(context);
                v9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), jd0Var.f34897c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(v9Var, y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gd0(hd0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                kd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
