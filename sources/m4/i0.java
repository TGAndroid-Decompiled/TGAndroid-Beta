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
import org.telegram.ui.cd0;
import org.telegram.ui.ed0;
import org.telegram.ui.fd0;
import org.telegram.ui.hd0;
import org.telegram.ui.id0;
import org.telegram.ui.uv;
import w7.w5;
public final class i0 implements l0, IMapsProvider.OnMarkerClickListener {
    public final float f15858a;
    public final Object f15859b;

    public i0(Object obj, float f7) {
        this.f15859b = obj;
        this.f15858a = f7;
    }

    @Override
    public void g(r rVar) {
        ((m0) this.f15859b).f15906g.f15749t.a(this.f15858a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        id0 id0Var = (id0) this.f15859b;
        ArrayList arrayList = id0Var.f38856g0;
        if (iMarker.getTag() instanceof hd0) {
            id0Var.X.setVisibility(4);
            if (!id0Var.C0) {
                ImageView imageView = id0Var.f38845a;
                int i14 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                id0Var.f38845a.setTag(Integer.valueOf(i14));
                id0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                cd0 cd0Var = (cd0) arrayList.get(i15);
                if (cd0Var != null && cd0Var.f36403e == iMarker) {
                    id0Var.f38858i0 = cd0Var.f36400a;
                    if (id0Var.f38859j0) {
                        id0Var.f38859j0 = false;
                        id0Var.B0();
                    }
                    id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.f36403e.getPosition(), this.f15858a));
                } else {
                    i15++;
                }
            }
            fd0 fd0Var = id0Var.f38876x;
            id0 id0Var2 = fd0Var.f37760b;
            HashMap hashMap = fd0Var.f37759a;
            hd0 hd0Var = (hd0) iMarker.getTag();
            if (hd0Var != null && id0Var2.f38863n0 != hd0Var) {
                id0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = id0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        fd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    id0Var2.m0 = null;
                }
                id0Var2.f38863n0 = hd0Var;
                id0Var2.m0 = iMarker;
                Context context = fd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                fd0Var.addView(frameLayout, w5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                id0Var2.f38864o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                id0Var2.f38864o0.getBackground().setColorFilter(new PorterDuffColorFilter(id0Var2.getThemedColor(h6.f20631h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(id0Var2.f38864o0, w5.d(71.0f, -2));
                id0Var2.f38864o0.setAlpha(0.0f);
                id0Var2.f38864o0.setOnClickListener(new uv(17, fd0Var, hd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(id0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = id0Var2.f38864o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout3, textView, w5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(id0Var2.getThemedColor(h6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = id0Var2.f38864o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, w5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(hd0Var.f38333c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(h6.K(AndroidUtilities.dp(36.0f), u4.a(hd0Var.f38331a)));
                frameLayout.addView(frameLayout5, w5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                y9 y9Var = new y9(context);
                y9Var.f(a1.g.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), hd0Var.f38333c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(y9Var, w5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ed0(fd0Var, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                id0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
