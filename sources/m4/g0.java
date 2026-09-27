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
import org.telegram.ui.Components.w9;
import org.telegram.ui.bd0;
import org.telegram.ui.cd0;
import org.telegram.ui.ed0;
import org.telegram.ui.fd0;
import org.telegram.ui.rv;
import org.telegram.ui.zc0;
import w7.y5;
public final class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final float f14840a;
    public final Object f14841b;

    public g0(Object obj, float f7) {
        this.f14841b = obj;
        this.f14840a = f7;
    }

    @Override
    public void g(r rVar) {
        ((k0) this.f14841b).f14879g.f14734t.a(this.f14840a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        fd0 fd0Var = (fd0) this.f14841b;
        ArrayList arrayList = fd0Var.f33496g0;
        if (iMarker.getTag() instanceof ed0) {
            fd0Var.X.setVisibility(4);
            if (!fd0Var.C0) {
                ImageView imageView = fd0Var.f33486a;
                int i14 = i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(fd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                fd0Var.f33486a.setTag(Integer.valueOf(i14));
                fd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                zc0 zc0Var = (zc0) arrayList.get(i15);
                if (zc0Var != null && zc0Var.e == iMarker) {
                    fd0Var.f33498i0 = zc0Var.f40465a;
                    if (fd0Var.f33499j0) {
                        fd0Var.f33499j0 = false;
                        fd0Var.C0();
                    }
                    fd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(zc0Var.e.getPosition(), this.f14840a));
                } else {
                    i15++;
                }
            }
            cd0 cd0Var = fd0Var.f33516x;
            fd0 fd0Var2 = cd0Var.f32696b;
            HashMap hashMap = cd0Var.f32695a;
            ed0 ed0Var = (ed0) iMarker.getTag();
            if (ed0Var != null && fd0Var2.f33503n0 != ed0Var) {
                fd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = fd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        cd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    fd0Var2.m0 = null;
                }
                fd0Var2.f33503n0 = ed0Var;
                fd0Var2.m0 = iMarker;
                Context context = cd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                cd0Var.addView(frameLayout, y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                fd0Var2.f33504o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                fd0Var2.f33504o0.getBackground().setColorFilter(new PorterDuffColorFilter(fd0Var2.getThemedColor(i6.f19128h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(fd0Var2.f33504o0, y5.c(71.0f, -2));
                fd0Var2.f33504o0.setAlpha(0.0f);
                fd0Var2.f33504o0.setOnClickListener(new rv(17, cd0Var, ed0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(fd0Var2.getThemedColor(i6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = fd0Var2.f33504o0;
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
                h.setTextColor(fd0Var2.getThemedColor(i6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                h.setGravity(i12);
                FrameLayout frameLayout4 = fd0Var2.f33504o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(h, y5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(ed0Var.f33223c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(i6.K(AndroidUtilities.dp(36.0f), u4.a(ed0Var.f33221a)));
                frameLayout.addView(frameLayout5, y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), ed0Var.f33223c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bd0(cd0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                fd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
