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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.z9;
import org.telegram.ui.hd0;
import org.telegram.ui.jd0;
import org.telegram.ui.kd0;
import org.telegram.ui.md0;
import org.telegram.ui.nd0;
import org.telegram.ui.xv;
import w7.a6;
public final class m0 implements p0, IMapsProvider.OnMarkerClickListener {
    public final float f15546a;
    public final Object f15547b;

    public m0(Object obj, float f7) {
        this.f15547b = obj;
        this.f15546a = f7;
    }

    @Override
    public void f(w wVar) {
        ((q0) this.f15547b).f15573g.f15440t.a(this.f15546a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        nd0 nd0Var = (nd0) this.f15547b;
        ArrayList arrayList = nd0Var.f38657g0;
        if (iMarker.getTag() instanceof md0) {
            nd0Var.X.setVisibility(4);
            if (!nd0Var.C0) {
                ImageView imageView = nd0Var.f38647a;
                int i14 = g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(nd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                nd0Var.f38647a.setTag(Integer.valueOf(i14));
                nd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                hd0 hd0Var = (hd0) arrayList.get(i15);
                if (hd0Var != null && hd0Var.e == iMarker) {
                    nd0Var.f38659i0 = hd0Var.f36758a;
                    if (nd0Var.f38660j0) {
                        nd0Var.f38660j0 = false;
                        nd0Var.B0();
                    }
                    nd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hd0Var.e.getPosition(), this.f15546a));
                } else {
                    i15++;
                }
            }
            kd0 kd0Var = nd0Var.f38677x;
            nd0 nd0Var2 = kd0Var.f37626b;
            HashMap hashMap = kd0Var.f37625a;
            md0 md0Var = (md0) iMarker.getTag();
            if (md0Var != null && nd0Var2.f38664n0 != md0Var) {
                nd0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = nd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        kd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    nd0Var2.m0 = null;
                }
                nd0Var2.f38664n0 = md0Var;
                nd0Var2.m0 = iMarker;
                Context context = kd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                kd0Var.addView(frameLayout, a6.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                nd0Var2.f38665o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                nd0Var2.f38665o0.getBackground().setColorFilter(new PorterDuffColorFilter(nd0Var2.getThemedColor(g6.f19972h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(nd0Var2.f38665o0, a6.d(71.0f, -2));
                nd0Var2.f38665o0.setAlpha(0.0f);
                nd0Var2.f38665o0.setOnClickListener(new xv(17, kd0Var, md0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(nd0Var2.getThemedColor(g6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = nd0Var2.f38665o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView h = org.telegram.ui.Cells.d0.h(frameLayout3, textView, a6.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(nd0Var2.getThemedColor(g6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                h.setGravity(i12);
                FrameLayout frameLayout4 = nd0Var2.f38665o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(h, a6.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(md0Var.f38224c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(g6.K(AndroidUtilities.dp(36.0f), u4.a(md0Var.f38222a)));
                frameLayout.addView(frameLayout5, a6.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                z9 z9Var = new z9(context);
                z9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), md0Var.f38224c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(z9Var, a6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jd0(kd0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                nd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
