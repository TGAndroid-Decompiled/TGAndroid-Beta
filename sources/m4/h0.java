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
import org.telegram.ui.Components.y9;
import org.telegram.ui.ad0;
import org.telegram.ui.cd0;
import org.telegram.ui.dd0;
import org.telegram.ui.fd0;
import org.telegram.ui.gd0;
import org.telegram.ui.qv;
import w7.x5;
public final class h0 implements k0, IMapsProvider.OnMarkerClickListener {
    public final float f16167a;
    public final Object f16168b;

    public h0(Object obj, float f7) {
        this.f16168b = obj;
        this.f16167a = f7;
    }

    @Override
    public void g(r rVar) {
        ((l0) this.f16168b).f16198g.f16058t.a(this.f16167a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        gd0 gd0Var = (gd0) this.f16168b;
        ArrayList arrayList = gd0Var.f38058g0;
        if (iMarker.getTag() instanceof fd0) {
            gd0Var.X.setVisibility(4);
            if (!gd0Var.C0) {
                ImageView imageView = gd0Var.f38047a;
                int i14 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(gd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                gd0Var.f38047a.setTag(Integer.valueOf(i14));
                gd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                ad0 ad0Var = (ad0) arrayList.get(i15);
                if (ad0Var != null && ad0Var.f36076e == iMarker) {
                    gd0Var.f38060i0 = ad0Var.f36073a;
                    if (gd0Var.f38061j0) {
                        gd0Var.f38061j0 = false;
                        gd0Var.B0();
                    }
                    gd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ad0Var.f36076e.getPosition(), this.f16167a));
                } else {
                    i15++;
                }
            }
            dd0 dd0Var = gd0Var.f38078x;
            gd0 gd0Var2 = dd0Var.f37022b;
            HashMap hashMap = dd0Var.f37021a;
            fd0 fd0Var = (fd0) iMarker.getTag();
            if (fd0Var != null && gd0Var2.f38065n0 != fd0Var) {
                gd0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = gd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        dd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    gd0Var2.m0 = null;
                }
                gd0Var2.f38065n0 = fd0Var;
                gd0Var2.m0 = iMarker;
                Context context = dd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                dd0Var.addView(frameLayout, x5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                gd0Var2.f38066o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                gd0Var2.f38066o0.getBackground().setColorFilter(new PorterDuffColorFilter(gd0Var2.getThemedColor(h6.f20893h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(gd0Var2.f38066o0, x5.d(71.0f, -2));
                gd0Var2.f38066o0.setAlpha(0.0f);
                gd0Var2.f38066o0.setOnClickListener(new qv(17, dd0Var, fd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(gd0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = gd0Var2.f38066o0;
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
                g10.setTextColor(gd0Var2.getThemedColor(h6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = gd0Var2.f38066o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, x5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(fd0Var.f37678c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(h6.K(AndroidUtilities.dp(36.0f), u4.a(fd0Var.f37676a)));
                frameLayout.addView(frameLayout5, x5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                y9 y9Var = new y9(context);
                y9Var.f(a1.g.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), fd0Var.f37678c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(y9Var, x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new cd0(dd0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                gd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
