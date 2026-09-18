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
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.u9;
import org.telegram.ui.ed0;
import org.telegram.ui.gd0;
import org.telegram.ui.hd0;
import org.telegram.ui.jd0;
import org.telegram.ui.kd0;
import org.telegram.ui.uv;
import w7.x5;
public final class h0 implements k0, IMapsProvider.OnMarkerClickListener {
    public final float f14551a;
    public final Object f14552b;

    public h0(Object obj, float f7) {
        this.f14552b = obj;
        this.f14551a = f7;
    }

    @Override
    public void g(r rVar) {
        ((l0) this.f14552b).f14606g.f14476t.a(this.f14551a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        kd0 kd0Var = (kd0) this.f14552b;
        ArrayList arrayList = kd0Var.f35229g0;
        if (iMarker.getTag() instanceof jd0) {
            kd0Var.X.setVisibility(4);
            if (!kd0Var.C0) {
                ImageView imageView = kd0Var.f35219a;
                int i14 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(kd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                kd0Var.f35219a.setTag(Integer.valueOf(i14));
                kd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                ed0 ed0Var = (ed0) arrayList.get(i15);
                if (ed0Var != null && ed0Var.e == iMarker) {
                    kd0Var.f35231i0 = ed0Var.f33370a;
                    if (kd0Var.f35232j0) {
                        kd0Var.f35232j0 = false;
                        kd0Var.C0();
                    }
                    kd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ed0Var.e.getPosition(), this.f14551a));
                } else {
                    i15++;
                }
            }
            hd0 hd0Var = kd0Var.f35249x;
            kd0 kd0Var2 = hd0Var.f34244b;
            HashMap hashMap = hd0Var.f34243a;
            jd0 jd0Var = (jd0) iMarker.getTag();
            if (jd0Var != null && kd0Var2.f35236n0 != jd0Var) {
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
                kd0Var2.f35236n0 = jd0Var;
                kd0Var2.m0 = iMarker;
                Context context = hd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                hd0Var.addView(frameLayout, x5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                kd0Var2.f35237o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                kd0Var2.f35237o0.getBackground().setColorFilter(new PorterDuffColorFilter(kd0Var2.getThemedColor(j6.f18934h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(kd0Var2.f35237o0, x5.c(71.0f, -2));
                kd0Var2.f35237o0.setAlpha(0.0f);
                kd0Var2.f35237o0.setOnClickListener(new uv(17, hd0Var, jd0Var));
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
                FrameLayout frameLayout3 = kd0Var2.f35237o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView f7 = p6.f(frameLayout3, textView, x5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(kd0Var2.getThemedColor(j6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                f7.setGravity(i12);
                FrameLayout frameLayout4 = kd0Var2.f35237o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(f7, x5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(jd0Var.f34854c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(j6.K(AndroidUtilities.dp(36.0f), t4.a(jd0Var.f34852a)));
                frameLayout.addView(frameLayout5, x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                u9 u9Var = new u9(context);
                u9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), jd0Var.f34854c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(u9Var, x5.e(30, 30, 17));
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
