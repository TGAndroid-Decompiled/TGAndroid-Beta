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
import org.telegram.ui.ad0;
import org.telegram.ui.cd0;
import org.telegram.ui.dd0;
import org.telegram.ui.fd0;
import org.telegram.ui.gd0;
import org.telegram.ui.tv;
import w7.z5;
public final class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final float f16165a;
    public final Object f16166b;

    public g0(Object obj, float f7) {
        this.f16166b = obj;
        this.f16165a = f7;
    }

    @Override
    public void f(r rVar) {
        ((k0) this.f16166b).f16208g.f16052t.a(this.f16165a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        gd0 gd0Var = (gd0) this.f16166b;
        ArrayList arrayList = gd0Var.f36572g0;
        if (iMarker.getTag() instanceof fd0) {
            gd0Var.X.setVisibility(4);
            if (!gd0Var.C0) {
                ImageView imageView = gd0Var.f36561a;
                int i14 = i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(gd0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                gd0Var.f36561a.setTag(Integer.valueOf(i14));
                gd0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                ad0 ad0Var = (ad0) arrayList.get(i15);
                if (ad0Var != null && ad0Var.f34791e == iMarker) {
                    gd0Var.f36574i0 = ad0Var.f34788a;
                    if (gd0Var.f36575j0) {
                        gd0Var.f36575j0 = false;
                        gd0Var.C0();
                    }
                    gd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ad0Var.f34791e.getPosition(), this.f16165a));
                } else {
                    i15++;
                }
            }
            dd0 dd0Var = gd0Var.f36592x;
            gd0 gd0Var2 = dd0Var.f35746b;
            HashMap hashMap = dd0Var.f35745a;
            fd0 fd0Var = (fd0) iMarker.getTag();
            if (fd0Var != null && gd0Var2.f36579n0 != fd0Var) {
                gd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = gd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        dd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    gd0Var2.m0 = null;
                }
                gd0Var2.f36579n0 = fd0Var;
                gd0Var2.m0 = iMarker;
                Context context = dd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                dd0Var.addView(frameLayout, z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                gd0Var2.f36580o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                gd0Var2.f36580o0.getBackground().setColorFilter(new PorterDuffColorFilter(gd0Var2.getThemedColor(i6.f20889h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(gd0Var2.f36580o0, z5.c(71.0f, -2));
                gd0Var2.f36580o0.setAlpha(0.0f);
                gd0Var2.f36580o0.setOnClickListener(new tv(17, dd0Var, fd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(gd0Var2.getThemedColor(i6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = gd0Var2.f36580o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView i16 = org.telegram.ui.Cells.c1.i(frameLayout3, textView, z5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                i16.setTextSize(1, 14.0f);
                i16.setMaxLines(1);
                i16.setEllipsize(truncateAt);
                i16.setSingleLine(true);
                i16.setTextColor(gd0Var2.getThemedColor(i6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                i16.setGravity(i12);
                FrameLayout frameLayout4 = gd0Var2.f36580o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(i16, z5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(fd0Var.f36274c.title);
                i16.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(i6.K(AndroidUtilities.dp(36.0f), u4.a(fd0Var.f36272a)));
                frameLayout.addView(frameLayout5, z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), fd0Var.f36274c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, z5.e(30, 30, 17));
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
