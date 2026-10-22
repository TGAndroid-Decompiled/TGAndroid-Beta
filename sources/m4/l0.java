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
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.hc0;
import org.telegram.ui.jc0;
import org.telegram.ui.kc0;
import org.telegram.ui.mc0;
import org.telegram.ui.nc0;
import w7.z5;
public final class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final float f16634a;
    public final Object f16635b;

    public l0(Object obj, float f7) {
        this.f16635b = obj;
        this.f16634a = f7;
    }

    @Override
    public void f(v vVar) {
        ((p0) this.f16635b).f16661g.f16534t.a(this.f16634a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        nc0 nc0Var = (nc0) this.f16635b;
        ArrayList arrayList = nc0Var.f39511g0;
        if (iMarker.getTag() instanceof mc0) {
            nc0Var.X.setVisibility(4);
            if (!nc0Var.C0) {
                ImageView imageView = nc0Var.f39501a;
                int i13 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(nc0Var.getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
                nc0Var.f39501a.setTag(Integer.valueOf(i13));
                nc0Var.C0 = true;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                hc0 hc0Var = (hc0) arrayList.get(i14);
                if (hc0Var != null && hc0Var.e == iMarker) {
                    nc0Var.f39513i0 = hc0Var.f37573a;
                    if (nc0Var.f39514j0) {
                        nc0Var.f39514j0 = false;
                        nc0Var.B0();
                    }
                    nc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hc0Var.e.getPosition(), this.f16634a));
                } else {
                    i14++;
                }
            }
            kc0 kc0Var = nc0Var.f39531x;
            nc0 nc0Var2 = kc0Var.f38519b;
            HashMap hashMap = kc0Var.f38518a;
            mc0 mc0Var = (mc0) iMarker.getTag();
            if (mc0Var != null && nc0Var2.f39518n0 != mc0Var) {
                nc0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = nc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        kc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    nc0Var2.m0 = null;
                }
                nc0Var2.f39518n0 = mc0Var;
                nc0Var2.m0 = iMarker;
                Context context = kc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                kc0Var.addView(frameLayout, z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                nc0Var2.f39519o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                nc0Var2.f39519o0.getBackground().setColorFilter(new PorterDuffColorFilter(nc0Var2.getThemedColor(h6.f21064h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(nc0Var2.f39519o0, z5.c(71.0f, -2));
                nc0Var2.f39519o0.setAlpha(0.0f);
                nc0Var2.f39519o0.setOnClickListener(new i51(27, kc0Var, mc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(nc0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = nc0Var2.f39519o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout3, textView, z5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                j10.setTextColor(nc0Var2.getThemedColor(h6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                j10.setGravity(i12);
                FrameLayout frameLayout4 = nc0Var2.f39519o0;
                if (LocaleController.isRTL) {
                    i15 = 5;
                }
                frameLayout4.addView(j10, z5.d(-2, -2.0f, i15 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(mc0Var.f39180c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(h6.K(AndroidUtilities.dp(36.0f), t4.a(mc0Var.f39178a)));
                frameLayout.addView(frameLayout5, z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), mc0Var.f39180c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jc0(kc0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                nc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
