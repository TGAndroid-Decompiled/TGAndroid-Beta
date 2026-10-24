package m4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.u9;
import org.telegram.ui.lc0;
import org.telegram.ui.nc0;
import org.telegram.ui.oc0;
import org.telegram.ui.qc0;
import org.telegram.ui.rc0;
import w7.z5;
public final class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final float f16697a;
    public final Object f16698b;

    public l0(Object obj, float f7) {
        this.f16698b = obj;
        this.f16697a = f7;
    }

    @Override
    public void f(v vVar) {
        ((p0) this.f16698b).f16724g.f16597t.a(this.f16697a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        rc0 rc0Var = (rc0) this.f16698b;
        ArrayList arrayList = rc0Var.f41102g0;
        if (iMarker.getTag() instanceof qc0) {
            rc0Var.X.setVisibility(4);
            if (!rc0Var.B0) {
                ImageView imageView = rc0Var.f41092a;
                int i13 = k6.ui;
                r6.t(imageView, i13, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                rc0Var.f41092a.setTag(Integer.valueOf(i13));
                rc0Var.B0 = true;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                lc0 lc0Var = (lc0) arrayList.get(i14);
                if (lc0Var != null && lc0Var.e == iMarker) {
                    rc0Var.f41104i0 = lc0Var.f39191a;
                    if (rc0Var.f41105j0) {
                        rc0Var.f41105j0 = false;
                        rc0Var.C0();
                    }
                    rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.e.getPosition(), this.f16697a));
                } else {
                    i14++;
                }
            }
            oc0 oc0Var = rc0Var.f41122x;
            rc0 rc0Var2 = oc0Var.f40160b;
            HashMap hashMap = oc0Var.f40159a;
            qc0 qc0Var = (qc0) iMarker.getTag();
            if (qc0Var != null && rc0Var2.f41109n0 != qc0Var) {
                rc0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = rc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        oc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    rc0Var2.m0 = null;
                }
                rc0Var2.f41109n0 = qc0Var;
                rc0Var2.m0 = iMarker;
                Context context = oc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                oc0Var.addView(frameLayout, z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                rc0Var2.f41110o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = rc0Var2.f41110o0;
                r6.z(frameLayout3, frameLayout3.getBackground(), k6.f21255h5, rc0Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(rc0Var2.f41110o0, z5.c(71.0f, -2));
                rc0Var2.f41110o0.setAlpha(0.0f);
                rc0Var2.f41110o0.setOnClickListener(new c51(28, oc0Var, qc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                r6.W(textView, k6.G6, rc0Var2.getResourceProvider());
                textView.setTypeface(AndroidUtilities.bold());
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout4 = rc0Var2.f41110o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout4, textView, z5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                r6.W(j10, k6.A6, rc0Var2.getResourceProvider());
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                j10.setGravity(i12);
                FrameLayout frameLayout5 = rc0Var2.f41110o0;
                if (LocaleController.isRTL) {
                    i15 = 5;
                }
                frameLayout5.addView(j10, z5.d(-2, -2.0f, i15 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(qc0Var.f40777c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout6 = new FrameLayout(context);
                frameLayout6.setBackground(k6.K(AndroidUtilities.dp(36.0f), t4.a(qc0Var.f40775a)));
                frameLayout.addView(frameLayout6, z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                u9 u9Var = new u9(context);
                u9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), qc0Var.f40777c.venue_type, "_64.png"), null, null);
                frameLayout6.addView(u9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nc0(oc0Var, frameLayout6));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                rc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
