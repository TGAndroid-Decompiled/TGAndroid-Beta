package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
public abstract class o0 extends LinearLayout implements qh.a, ne.k {
    public final c6 f9436a;
    public final FrameLayout f9437b;
    public TLRPC.TL_replyKeyboardMarkup f9438c;
    public l0 d;
    public int e;
    public boolean f9439f;
    public int h;
    public final ArrayList f9440n;
    public final ScrollView f9441r;
    public int f9442s;
    public final GradientDrawable v;
    public int f9443w;
    public final ne.l f9444x;

    public o0(Context context, c6 c6Var) {
        super(context);
        this.f9440n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f9444x = new ne.l(this, es.h, 320L);
        this.f9436a = c6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f9441r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9437b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void a(int i10) {
        if (this.f9442s == i10) {
            return;
        }
        this.f9442s = i10;
        ScrollView scrollView = this.f9441r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f9441r, g6.w0(g6.He, this.f9436a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9440n;
            if (i10 < arrayList.size()) {
                ((m0) arrayList.get(i10)).a();
                i10++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f9442s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int m12 = g6.m1(navigationBarThirdButtonsFactor, g6.w0(g6.He, this.f9436a));
            int i10 = this.f9443w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != m12) {
                gradientDrawable.setColors(new int[]{m12, g6.m1(0.66f, m12), i0.a.k(m12, 0)});
                this.f9443w = m12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f9442s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(ne.l lVar) {
        Iterator it = this.f9444x.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16302a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((n0) obj).setAlpha(c10);
            ((n0) obj).setScaleX(lerp);
            ((n0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f9438c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f9439f) {
            return this.e;
        }
        return yh.y(4.0f, this.f9438c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(l0 l0Var) {
        this.d = l0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f9439f && (tL_replyKeyboardMarkup = this.f9438c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f9439f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (yh.C(4.0f, this.f9438c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f9438c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f9444x.iterator();
            while (it.hasNext()) {
                ne.g gVar = (ne.g) it.next();
                int childCount = ((n0) gVar.f16302a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((n0) gVar.f16302a).getChildAt(i11);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.height != dp) {
                        layoutParams.height = dp;
                        childAt.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void b(float f7) {
    }
}
