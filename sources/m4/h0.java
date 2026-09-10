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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.w9;
import org.telegram.ui.cd0;
import org.telegram.ui.ed0;
import org.telegram.ui.fd0;
import org.telegram.ui.hd0;
import org.telegram.ui.id0;
import org.telegram.ui.ow;
import w7.a6;
public final class h0 implements k0, IMapsProvider.OnMarkerClickListener {
    public final float f13373a;
    public final Object f13374b;

    public h0(Object obj, float f7) {
        this.f13374b = obj;
        this.f13373a = f7;
    }

    @Override
    public void h(r rVar) {
        ((l0) this.f13374b).f13430g.f13307t.a(this.f13373a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        id0 id0Var = (id0) this.f13374b;
        ArrayList arrayList = id0Var.f33624g0;
        if (iMarker.getTag() instanceof hd0) {
            id0Var.X.setVisibility(4);
            if (!id0Var.C0) {
                ImageView imageView = id0Var.f33614a;
                int i13 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
                id0Var.f33614a.setTag(Integer.valueOf(i13));
                id0Var.C0 = true;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                cd0 cd0Var = (cd0) arrayList.get(i14);
                if (cd0Var != null && cd0Var.e == iMarker) {
                    id0Var.f33626i0 = cd0Var.f31642a;
                    if (id0Var.f33627j0) {
                        id0Var.f33627j0 = false;
                        id0Var.C0();
                    }
                    id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.e.getPosition(), this.f13373a));
                } else {
                    i14++;
                }
            }
            fd0 fd0Var = id0Var.f33644x;
            id0 id0Var2 = fd0Var.f32786b;
            HashMap hashMap = fd0Var.f32785a;
            hd0 hd0Var = (hd0) iMarker.getTag();
            if (hd0Var != null && id0Var2.f33631n0 != hd0Var) {
                id0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = id0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        fd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    id0Var2.m0 = null;
                }
                id0Var2.f33631n0 = hd0Var;
                id0Var2.m0 = iMarker;
                Context context = fd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                fd0Var.addView(frameLayout, a6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                id0Var2.f33632o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                id0Var2.f33632o0.getBackground().setColorFilter(new PorterDuffColorFilter(id0Var2.getThemedColor(j6.f17998h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(id0Var2.f33632o0, a6.c(71.0f, -2));
                id0Var2.f33632o0.setAlpha(0.0f);
                id0Var2.f33632o0.setOnClickListener(new ow(14, fd0Var, hd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(id0Var2.getThemedColor(j6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = id0Var2.f33632o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView f7 = r6.f(frameLayout3, textView, a6.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(id0Var2.getThemedColor(j6.A6));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                f7.setGravity(i12);
                FrameLayout frameLayout4 = id0Var2.f33632o0;
                if (LocaleController.isRTL) {
                    i15 = 5;
                }
                frameLayout4.addView(f7, a6.d(-2, -2.0f, i15 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(hd0Var.f33351c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(j6.K(AndroidUtilities.dp(36.0f), u4.a(hd0Var.f33349a)));
                frameLayout.addView(frameLayout5, a6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), hd0Var.f33351c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, a6.e(30, 30, 17));
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
