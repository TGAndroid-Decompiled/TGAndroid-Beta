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
import org.telegram.messenger.dd;
import org.telegram.messenger.fb;
import org.telegram.messenger.ga;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.xk;
import org.telegram.ui.rb0;
import org.telegram.ui.tb0;
import org.telegram.ui.vu;
import org.telegram.ui.wb0;
import org.telegram.ui.xb0;
import w7.b6;
public final class l0 implements o0, fb {
    public final float f12821a;
    public final Object f12822b;

    public l0(Object obj, float f7) {
        this.f12822b = obj;
        this.f12821a = f7;
    }

    @Override
    public void a(ga gaVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        xb0 xb0Var = (xb0) this.f12822b;
        ArrayList arrayList = xb0Var.f43319p0;
        if (gaVar.b() instanceof wb0) {
            xb0Var.V.setVisibility(4);
            if (!xb0Var.K0) {
                ImageView imageView = xb0Var.f43300a;
                int i14 = t6.ij;
                a7.t(imageView, i14, xb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                xb0Var.f43300a.setTag(Integer.valueOf(i14));
                xb0Var.K0 = true;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                rb0 rb0Var = (rb0) arrayList.get(i15);
                if (rb0Var != null && rb0Var.e == gaVar) {
                    xb0Var.f43322r0 = rb0Var.f41029a;
                    if (xb0Var.f43324s0) {
                        xb0Var.f43324s0 = false;
                        xb0Var.S0();
                    }
                    xb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(rb0Var.e.a(), this.f12821a));
                } else {
                    i15++;
                }
            }
            tb0 tb0Var = xb0Var.f43328w;
            xb0 xb0Var2 = tb0Var.f41610b;
            HashMap hashMap = tb0Var.f41609a;
            wb0 wb0Var = (wb0) gaVar.b();
            if (wb0Var != null && xb0Var2.f43329w0 != wb0Var) {
                xb0Var2.N0(false);
                ga gaVar2 = xb0Var2.f43327v0;
                if (gaVar2 != null) {
                    View view = (View) hashMap.get(gaVar2);
                    if (view != null) {
                        tb0Var.removeView(view);
                        hashMap.remove(gaVar2);
                    }
                    xb0Var2.f43327v0 = null;
                }
                xb0Var2.f43329w0 = wb0Var;
                xb0Var2.f43327v0 = gaVar;
                Context context = tb0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                tb0Var.addView(frameLayout, b6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                xb0Var2.f43331x0 = frameLayout2;
                frameLayout2.setBackgroundResource(2131232786);
                FrameLayout frameLayout3 = xb0Var2.f43331x0;
                a7.y(frameLayout3, frameLayout3.getBackground(), t6.f21002h5, xb0Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(xb0Var2.f43331x0, b6.c(71.0f, -2));
                xb0Var2.f43331x0.setAlpha(0.0f);
                xb0Var2.f43331x0.setOnClickListener(new vu(17, tb0Var, wb0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                a7.V(textView, t6.G6, xb0Var2.getResourceProvider());
                textView.setTypeface(org.telegram.messenger.i0.o());
                if (dd.X) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout4 = xb0Var2.f43331x0;
                if (dd.X) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout4, textView, b6.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                l4.setTextSize(1, 14.0f);
                l4.setMaxLines(1);
                l4.setEllipsize(truncateAt);
                l4.setSingleLine(true);
                a7.V(l4, t6.A6, xb0Var2.getResourceProvider());
                if (dd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                l4.setGravity(i12);
                FrameLayout frameLayout5 = xb0Var2.f43331x0;
                if (dd.X) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout5.addView(l4, b6.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(wb0Var.f42750c.title);
                l4.setText(dd.L0(2131744280, null));
                FrameLayout frameLayout6 = new FrameLayout(context);
                frameLayout6.setBackground(t6.L(org.telegram.messenger.i0.L(36.0f), x4.a(wb0Var.f42748a)));
                frameLayout.addView(frameLayout6, b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                g9 g9Var = new g9(context);
                g9Var.h(a1.g.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), wb0Var.f42750c.venue_type, "_64.png"), null, null);
                frameLayout6.addView(g9Var, b6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xk(tb0Var, frameLayout6));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(gaVar, frameLayout);
                xb0Var2.G.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(gaVar.a()), 300);
            }
        }
    }

    @Override
    public void b(w wVar) {
        ((p0) this.f12822b).h.f12755t.b(this.f12821a);
    }
}
