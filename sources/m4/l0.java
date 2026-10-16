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
import org.telegram.ui.fd0;
import org.telegram.ui.hd0;
import org.telegram.ui.id0;
import org.telegram.ui.kd0;
import org.telegram.ui.ld0;
import org.telegram.ui.xv;
import w7.z5;
public final class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final float f15276a;
    public final Object f15277b;

    public l0(Object obj, float f7) {
        this.f15277b = obj;
        this.f15276a = f7;
    }

    @Override
    public void e(v vVar) {
        ((p0) this.f15277b).f15303g.f15170t.a(this.f15276a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        ld0 ld0Var = (ld0) this.f15277b;
        ArrayList arrayList = ld0Var.f37693g0;
        if (iMarker.getTag() instanceof kd0) {
            ld0Var.X.setVisibility(4);
            if (!ld0Var.C0) {
                ImageView imageView = ld0Var.f37683a;
                int i14 = g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                ld0Var.f37683a.setTag(Integer.valueOf(i14));
                ld0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                fd0 fd0Var = (fd0) arrayList.get(i15);
                if (fd0Var != null && fd0Var.e == iMarker) {
                    ld0Var.f37695i0 = fd0Var.f35508a;
                    if (ld0Var.f37696j0) {
                        ld0Var.f37696j0 = false;
                        ld0Var.B0();
                    }
                    ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(fd0Var.e.getPosition(), this.f15276a));
                } else {
                    i15++;
                }
            }
            id0 id0Var = ld0Var.f37713x;
            ld0 ld0Var2 = id0Var.f36787b;
            HashMap hashMap = id0Var.f36786a;
            kd0 kd0Var = (kd0) iMarker.getTag();
            if (kd0Var != null && ld0Var2.f37700n0 != kd0Var) {
                ld0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = ld0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        id0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    ld0Var2.m0 = null;
                }
                ld0Var2.f37700n0 = kd0Var;
                ld0Var2.m0 = iMarker;
                Context context = id0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                id0Var.addView(frameLayout, z5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                ld0Var2.f37701o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                ld0Var2.f37701o0.getBackground().setColorFilter(new PorterDuffColorFilter(ld0Var2.getThemedColor(g6.f19672h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(ld0Var2.f37701o0, z5.d(71.0f, -2));
                ld0Var2.f37701o0.setAlpha(0.0f);
                ld0Var2.f37701o0.setOnClickListener(new xv(17, id0Var, kd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(ld0Var2.getThemedColor(g6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = ld0Var2.f37701o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout3, textView, z5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(ld0Var2.getThemedColor(g6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = ld0Var2.f37701o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, z5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(kd0Var.f37352c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(g6.K(AndroidUtilities.dp(36.0f), u4.a(kd0Var.f37350a)));
                frameLayout.addView(frameLayout5, z5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                z9 z9Var = new z9(context);
                z9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), kd0Var.f37352c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(z9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hd0(id0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                ld0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
