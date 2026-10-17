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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.jc0;
import org.telegram.ui.lc0;
import org.telegram.ui.mc0;
import org.telegram.ui.oc0;
import org.telegram.ui.pc0;
import w7.z5;
public final class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final float f16628a;
    public final Object f16629b;

    public l0(Object obj, float f7) {
        this.f16629b = obj;
        this.f16628a = f7;
    }

    @Override
    public void f(v vVar) {
        ((p0) this.f16629b).f16655g.f16528t.a(this.f16628a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        pc0 pc0Var = (pc0) this.f16629b;
        ArrayList arrayList = pc0Var.f40047g0;
        if (iMarker.getTag() instanceof oc0) {
            pc0Var.X.setVisibility(4);
            if (!pc0Var.C0) {
                ImageView imageView = pc0Var.f40037a;
                int i13 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
                pc0Var.f40037a.setTag(Integer.valueOf(i13));
                pc0Var.C0 = true;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                jc0 jc0Var = (jc0) arrayList.get(i14);
                if (jc0Var != null && jc0Var.e == iMarker) {
                    pc0Var.f40049i0 = jc0Var.f38111a;
                    if (pc0Var.f40050j0) {
                        pc0Var.f40050j0 = false;
                        pc0Var.B0();
                    }
                    pc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), this.f16628a));
                } else {
                    i14++;
                }
            }
            mc0 mc0Var = pc0Var.f40067x;
            pc0 pc0Var2 = mc0Var.f39096b;
            HashMap hashMap = mc0Var.f39095a;
            oc0 oc0Var = (oc0) iMarker.getTag();
            if (oc0Var != null && pc0Var2.f40054n0 != oc0Var) {
                pc0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = pc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        mc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    pc0Var2.m0 = null;
                }
                pc0Var2.f40054n0 = oc0Var;
                pc0Var2.m0 = iMarker;
                Context context = mc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                mc0Var.addView(frameLayout, z5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                pc0Var2.f40055o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                pc0Var2.f40055o0.getBackground().setColorFilter(new PorterDuffColorFilter(pc0Var2.getThemedColor(h6.f21057h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(pc0Var2.f40055o0, z5.d(71.0f, -2));
                pc0Var2.f40055o0.setAlpha(0.0f);
                pc0Var2.f40055o0.setOnClickListener(new g51(27, mc0Var, oc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(pc0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = pc0Var2.f40055o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView k10 = org.telegram.ui.Cells.t0.k(frameLayout3, textView, z5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                k10.setTextSize(1, 14.0f);
                k10.setMaxLines(1);
                k10.setEllipsize(truncateAt);
                k10.setSingleLine(true);
                k10.setTextColor(pc0Var2.getThemedColor(h6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                k10.setGravity(i12);
                FrameLayout frameLayout4 = pc0Var2.f40055o0;
                if (LocaleController.isRTL) {
                    i15 = 5;
                }
                frameLayout4.addView(k10, z5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i15 | 48));
                textView.setText(oc0Var.f39709c.title);
                k10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(h6.K(AndroidUtilities.dp(36.0f), t4.a(oc0Var.f39707a)));
                frameLayout.addView(frameLayout5, z5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                w9 w9Var = new w9(context);
                w9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), oc0Var.f39709c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lc0(mc0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                pc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
