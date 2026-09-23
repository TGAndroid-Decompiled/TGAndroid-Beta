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
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ad0;
import org.telegram.ui.cd0;
import org.telegram.ui.dd0;
import org.telegram.ui.pv;
import org.telegram.ui.xc0;
import org.telegram.ui.zc0;
import w7.x5;
public final class h0 implements k0, IMapsProvider.OnMarkerClickListener {
    public final float f14564a;
    public final Object f14565b;

    public h0(Object obj, float f7) {
        this.f14565b = obj;
        this.f14564a = f7;
    }

    @Override
    public void g(r rVar) {
        ((l0) this.f14565b).f14607g.f14454t.a(this.f14564a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        dd0 dd0Var = (dd0) this.f14565b;
        ArrayList arrayList = dd0Var.f32590g0;
        if (iMarker.getTag() instanceof cd0) {
            dd0Var.X.setVisibility(4);
            if (!dd0Var.C0) {
                ImageView imageView = dd0Var.f32580a;
                int i14 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(dd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                dd0Var.f32580a.setTag(Integer.valueOf(i14));
                dd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                xc0 xc0Var = (xc0) arrayList.get(i15);
                if (xc0Var != null && xc0Var.e == iMarker) {
                    dd0Var.f32592i0 = xc0Var.f39239a;
                    if (dd0Var.f32593j0) {
                        dd0Var.f32593j0 = false;
                        dd0Var.C0();
                    }
                    dd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(xc0Var.e.getPosition(), this.f14564a));
                } else {
                    i15++;
                }
            }
            ad0 ad0Var = dd0Var.f32610x;
            dd0 dd0Var2 = ad0Var.f31773b;
            HashMap hashMap = ad0Var.f31772a;
            cd0 cd0Var = (cd0) iMarker.getTag();
            if (cd0Var != null && dd0Var2.f32597n0 != cd0Var) {
                dd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = dd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ad0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    dd0Var2.m0 = null;
                }
                dd0Var2.f32597n0 = cd0Var;
                dd0Var2.m0 = iMarker;
                Context context = ad0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ad0Var.addView(frameLayout, x5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                dd0Var2.f32598o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                dd0Var2.f32598o0.getBackground().setColorFilter(new PorterDuffColorFilter(dd0Var2.getThemedColor(h6.f18859h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(dd0Var2.f32598o0, x5.c(71.0f, -2));
                dd0Var2.f32598o0.setAlpha(0.0f);
                dd0Var2.f32598o0.setOnClickListener(new pv(17, ad0Var, cd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(dd0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = dd0Var2.f32598o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView f7 = q3.f(frameLayout3, textView, x5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(dd0Var2.getThemedColor(h6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                f7.setGravity(i12);
                FrameLayout frameLayout4 = dd0Var2.f32598o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(f7, x5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(cd0Var.f32315c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(h6.K(AndroidUtilities.dp(36.0f), u4.a(cd0Var.f32313a)));
                frameLayout.addView(frameLayout5, x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), cd0Var.f32315c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new zc0(ad0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                dd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
