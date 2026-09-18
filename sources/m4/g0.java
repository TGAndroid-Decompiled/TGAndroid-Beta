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
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.w9;
import org.telegram.ui.dd0;
import org.telegram.ui.fd0;
import org.telegram.ui.gd0;
import org.telegram.ui.id0;
import org.telegram.ui.jd0;
import org.telegram.ui.tv;
import w7.y5;
public final class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final float f14719a;
    public final Object f14720b;

    public g0(Object obj, float f7) {
        this.f14720b = obj;
        this.f14719a = f7;
    }

    @Override
    public void g(r rVar) {
        ((k0) this.f14720b).f14770g.f14651t.a(this.f14719a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        jd0 jd0Var = (jd0) this.f14720b;
        ArrayList arrayList = jd0Var.f34821g0;
        if (iMarker.getTag() instanceof id0) {
            jd0Var.X.setVisibility(4);
            if (!jd0Var.C0) {
                ImageView imageView = jd0Var.f34811a;
                int i14 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(jd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                jd0Var.f34811a.setTag(Integer.valueOf(i14));
                jd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                dd0 dd0Var = (dd0) arrayList.get(i15);
                if (dd0Var != null && dd0Var.e == iMarker) {
                    jd0Var.f34823i0 = dd0Var.f32940a;
                    if (jd0Var.f34824j0) {
                        jd0Var.f34824j0 = false;
                        jd0Var.C0();
                    }
                    jd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(dd0Var.e.getPosition(), this.f14719a));
                } else {
                    i15++;
                }
            }
            gd0 gd0Var = jd0Var.f34841x;
            jd0 jd0Var2 = gd0Var.f33815b;
            HashMap hashMap = gd0Var.f33814a;
            id0 id0Var = (id0) iMarker.getTag();
            if (id0Var != null && jd0Var2.f34828n0 != id0Var) {
                jd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = jd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        gd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    jd0Var2.m0 = null;
                }
                jd0Var2.f34828n0 = id0Var;
                jd0Var2.m0 = iMarker;
                Context context = gd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                gd0Var.addView(frameLayout, y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                jd0Var2.f34829o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                jd0Var2.f34829o0.getBackground().setColorFilter(new PorterDuffColorFilter(jd0Var2.getThemedColor(j6.f19133h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(jd0Var2.f34829o0, y5.c(71.0f, -2));
                jd0Var2.f34829o0.setAlpha(0.0f);
                jd0Var2.f34829o0.setOnClickListener(new tv(17, gd0Var, id0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(jd0Var2.getThemedColor(j6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = jd0Var2.f34829o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout3, textView, y5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(jd0Var2.getThemedColor(j6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = jd0Var2.f34829o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, y5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(id0Var.f34500c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(j6.K(AndroidUtilities.dp(36.0f), u4.a(id0Var.f34498a)));
                frameLayout.addView(frameLayout5, y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), id0Var.f34500c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fd0(gd0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                jd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
