package gi;

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
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
public abstract class n0 extends LinearLayout implements qh.a, ne.k {
    public final d6 f11348a;
    public final FrameLayout f11349b;
    public TLRPC.TL_replyKeyboardMarkup f11350c;
    public k0 d;
    public int e;
    public boolean f11351f;
    public int h;
    public final ArrayList f11352n;
    public final ScrollView f11353r;
    public int f11354s;
    public final GradientDrawable v;
    public int f11355w;
    public final ne.l f11356x;

    public n0(Context context, d6 d6Var) {
        super(context);
        this.f11352n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f11356x = new ne.l(this, bs.h, 320L);
        this.f11348a = d6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f11353r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11349b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void a(int i10) {
        if (this.f11354s == i10) {
            return;
        }
        this.f11354s = i10;
        ScrollView scrollView = this.f11353r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f11353r, h6.w0(h6.He, this.f11348a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11352n;
            if (i10 < arrayList.size()) {
                ((l0) arrayList.get(i10)).a();
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
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f11354s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int m12 = h6.m1(navigationBarThirdButtonsFactor, h6.w0(h6.He, this.f11348a));
            int i10 = this.f11355w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != m12) {
                gradientDrawable.setColors(new int[]{m12, h6.m1(0.66f, m12), i0.a.o(m12, 0)});
                this.f11355w = m12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f11354s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(ne.l lVar) {
        Iterator it = this.f11356x.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f17395a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((m0) obj).setAlpha(c10);
            ((m0) obj).setScaleX(lerp);
            ((m0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f11350c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f11351f) {
            return this.e;
        }
        return org.telegram.messenger.g0.D(4.0f, this.f11350c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: gi.n0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(k0 k0Var) {
        this.d = k0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f11351f && (tL_replyKeyboardMarkup = this.f11350c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f11351f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (lk.B(4.0f, this.f11350c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f11350c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f11356x.iterator();
            while (it.hasNext()) {
                ne.g gVar = (ne.g) it.next();
                int childCount = ((m0) gVar.f17395a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((m0) gVar.f17395a).getChildAt(i11);
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
    public final void b(float f7) {
    }

    @Override
    public final void c() {
    }
}
