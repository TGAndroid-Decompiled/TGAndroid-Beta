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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bd0;
import org.telegram.ui.dd0;
import org.telegram.ui.ed0;
import org.telegram.ui.gd0;
import org.telegram.ui.hd0;
import org.telegram.ui.rv;
import w7.x5;
public final class h0 implements k0, IMapsProvider.OnMarkerClickListener {
    public final float f16108a;
    public final Object f16109b;

    public h0(Object obj, float f7) {
        this.f16109b = obj;
        this.f16108a = f7;
    }

    @Override
    public void g(r rVar) {
        ((l0) this.f16109b).f16156g.f15997t.a(this.f16108a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        hd0 hd0Var = (hd0) this.f16109b;
        ArrayList arrayList = hd0Var.f38266g0;
        if (iMarker.getTag() instanceof gd0) {
            hd0Var.X.setVisibility(4);
            if (!hd0Var.C0) {
                ImageView imageView = hd0Var.f38255a;
                int i14 = i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                hd0Var.f38255a.setTag(Integer.valueOf(i14));
                hd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                bd0 bd0Var = (bd0) arrayList.get(i15);
                if (bd0Var != null && bd0Var.f36285e == iMarker) {
                    hd0Var.f38268i0 = bd0Var.f36282a;
                    if (hd0Var.f38269j0) {
                        hd0Var.f38269j0 = false;
                        hd0Var.B0();
                    }
                    hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(bd0Var.f36285e.getPosition(), this.f16108a));
                } else {
                    i15++;
                }
            }
            ed0 ed0Var = hd0Var.f38286x;
            hd0 hd0Var2 = ed0Var.f37234b;
            HashMap hashMap = ed0Var.f37233a;
            gd0 gd0Var = (gd0) iMarker.getTag();
            if (gd0Var != null && hd0Var2.f38273n0 != gd0Var) {
                hd0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = hd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ed0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    hd0Var2.m0 = null;
                }
                hd0Var2.f38273n0 = gd0Var;
                hd0Var2.m0 = iMarker;
                Context context = ed0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ed0Var.addView(frameLayout, x5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                hd0Var2.f38274o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                hd0Var2.f38274o0.getBackground().setColorFilter(new PorterDuffColorFilter(hd0Var2.getThemedColor(i6.f20868h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(hd0Var2.f38274o0, x5.d(71.0f, -2));
                hd0Var2.f38274o0.setAlpha(0.0f);
                hd0Var2.f38274o0.setOnClickListener(new rv(17, ed0Var, gd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(hd0Var2.getThemedColor(i6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = hd0Var2.f38274o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout3, textView, x5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(hd0Var2.getThemedColor(i6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = hd0Var2.f38274o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, x5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(gd0Var.f37982c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(i6.K(AndroidUtilities.dp(36.0f), u4.a(gd0Var.f37980a)));
                frameLayout.addView(frameLayout5, x5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                y9 y9Var = new y9(context);
                y9Var.f(a1.g.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), gd0Var.f37982c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(y9Var, x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dd0(ed0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                hd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
