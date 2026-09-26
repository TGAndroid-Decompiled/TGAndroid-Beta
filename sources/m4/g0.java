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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.w9;
import org.telegram.ui.bd0;
import org.telegram.ui.cd0;
import org.telegram.ui.ov;
import org.telegram.ui.wc0;
import org.telegram.ui.yc0;
import org.telegram.ui.zc0;
import w7.y5;
public final class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final float f14813a;
    public final Object f14814b;

    public g0(Object obj, float f7) {
        this.f14814b = obj;
        this.f14813a = f7;
    }

    @Override
    public void g(r rVar) {
        ((k0) this.f14814b).f14852g.f14707t.a(this.f14813a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        cd0 cd0Var = (cd0) this.f14814b;
        ArrayList arrayList = cd0Var.f32664g0;
        if (iMarker.getTag() instanceof bd0) {
            cd0Var.X.setVisibility(4);
            if (!cd0Var.C0) {
                ImageView imageView = cd0Var.f32654a;
                int i14 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                cd0Var.f32654a.setTag(Integer.valueOf(i14));
                cd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                wc0 wc0Var = (wc0) arrayList.get(i15);
                if (wc0Var != null && wc0Var.e == iMarker) {
                    cd0Var.f32666i0 = wc0Var.f38954a;
                    if (cd0Var.f32667j0) {
                        cd0Var.f32667j0 = false;
                        cd0Var.C0();
                    }
                    cd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var.e.getPosition(), this.f14813a));
                } else {
                    i15++;
                }
            }
            zc0 zc0Var = cd0Var.f32684x;
            cd0 cd0Var2 = zc0Var.f40444b;
            HashMap hashMap = zc0Var.f40443a;
            bd0 bd0Var = (bd0) iMarker.getTag();
            if (bd0Var != null && cd0Var2.f32671n0 != bd0Var) {
                cd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = cd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        zc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    cd0Var2.m0 = null;
                }
                cd0Var2.f32671n0 = bd0Var;
                cd0Var2.m0 = iMarker;
                Context context = zc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                zc0Var.addView(frameLayout, y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                cd0Var2.f32672o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                cd0Var2.f32672o0.getBackground().setColorFilter(new PorterDuffColorFilter(cd0Var2.getThemedColor(h6.f19129h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(cd0Var2.f32672o0, y5.c(71.0f, -2));
                cd0Var2.f32672o0.setAlpha(0.0f);
                cd0Var2.f32672o0.setOnClickListener(new ov(17, zc0Var, bd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(cd0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = cd0Var2.f32672o0;
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
                h.setTextColor(cd0Var2.getThemedColor(h6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                h.setGravity(i12);
                FrameLayout frameLayout4 = cd0Var2.f32672o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(h, y5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(bd0Var.f32391c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(h6.K(AndroidUtilities.dp(36.0f), u4.a(bd0Var.f32389a)));
                frameLayout.addView(frameLayout5, y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), bd0Var.f32391c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yc0(zc0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                cd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
