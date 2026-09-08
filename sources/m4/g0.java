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
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cd0;
import org.telegram.ui.ed0;
import org.telegram.ui.fd0;
import org.telegram.ui.hd0;
import org.telegram.ui.id0;
import org.telegram.ui.tv;
import w7.x5;
public final class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final float f15943a;
    public final Object f15944b;

    public g0(Object obj, float f7) {
        this.f15944b = obj;
        this.f15943a = f7;
    }

    @Override
    public void f(r rVar) {
        ((k0) this.f15944b).f15997g.f15870t.a(this.f15943a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        id0 id0Var = (id0) this.f15944b;
        ArrayList arrayList = id0Var.f37341g0;
        if (iMarker.getTag() instanceof hd0) {
            id0Var.X.setVisibility(4);
            if (!id0Var.C0) {
                ImageView imageView = id0Var.f37330a;
                int i14 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                id0Var.f37330a.setTag(Integer.valueOf(i14));
                id0Var.C0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                cd0 cd0Var = (cd0) arrayList.get(i15);
                if (cd0Var != null && cd0Var.f35103e == iMarker) {
                    id0Var.f37343i0 = cd0Var.f35100a;
                    if (id0Var.f37344j0) {
                        id0Var.f37344j0 = false;
                        id0Var.C0();
                    }
                    id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.f35103e.getPosition(), this.f15943a));
                } else {
                    i15++;
                }
            }
            fd0 fd0Var = id0Var.f37361x;
            id0 id0Var2 = fd0Var.f36403b;
            HashMap hashMap = fd0Var.f36402a;
            hd0 hd0Var = (hd0) iMarker.getTag();
            if (hd0Var != null && id0Var2.f37348n0 != hd0Var) {
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
                id0Var2.f37348n0 = hd0Var;
                id0Var2.m0 = iMarker;
                Context context = fd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                fd0Var.addView(frameLayout, x5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                id0Var2.f37349o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                id0Var2.f37349o0.getBackground().setColorFilter(new PorterDuffColorFilter(id0Var2.getThemedColor(j6.f20761h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(id0Var2.f37349o0, x5.c(71.0f, -2));
                id0Var2.f37349o0.setAlpha(0.0f);
                id0Var2.f37349o0.setOnClickListener(new tv(17, fd0Var, hd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(id0Var2.getThemedColor(j6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = id0Var2.f37349o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView f7 = p6.f(frameLayout3, textView, x5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
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
                FrameLayout frameLayout4 = id0Var2.f37349o0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(f7, x5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(hd0Var.f36987c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(j6.K(AndroidUtilities.dp(36.0f), t4.a(hd0Var.f36985a)));
                frameLayout.addView(frameLayout5, x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                x9 x9Var = new x9(context);
                x9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), hd0Var.f36987c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(x9Var, x5.e(30, 30, 17));
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
