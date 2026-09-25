package ei;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.rr;
public abstract class p0 extends LinearLayout implements ph.a, le.l {
    public final d6 f8509a;
    public final FrameLayout f8510b;
    public TLRPC.TL_replyKeyboardMarkup f8511c;
    public m0 d;
    public int e;
    public boolean f8512f;
    public int h;
    public final ArrayList f8513n;
    public final ScrollView f8514r;
    public int f8515s;
    public final GradientDrawable v;
    public int f8516w;
    public final le.m f8517x;

    public p0(Context context, d6 d6Var) {
        super(context);
        this.f8513n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f8517x = new le.m(this, rr.h, 320L);
        this.f8509a = d6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f8514r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8510b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(int i10) {
        if (this.f8515s == i10) {
            return;
        }
        this.f8515s = i10;
        ScrollView scrollView = this.f8514r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void c(le.m mVar) {
        Iterator it = this.f8517x.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f14210a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f8515s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = h6.l1(navigationBarThirdButtonsFactor, h6.v0(h6.He, this.f8509a));
            int i10 = this.f8516w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, h6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f8516w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f8515s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f8514r, h6.v0(h6.He, this.f8509a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8513n;
            if (i10 < arrayList.size()) {
                ((n0) arrayList.get(i10)).a();
                i10++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f8511c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f8512f) {
            return this.e;
        }
        return org.telegram.messenger.f0.D(4.0f, this.f8511c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.p0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(m0 m0Var) {
        this.d = m0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f8512f && (tL_replyKeyboardMarkup = this.f8511c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f8512f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (ok.B(4.0f, this.f8511c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f8511c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f8517x.iterator();
            while (it.hasNext()) {
                le.h hVar = (le.h) it.next();
                int childCount = ((o0) hVar.f14210a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((o0) hVar.f14210a).getChildAt(i11);
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
    public final void d(float f7) {
    }

    @Override
    public final void a() {
    }
}
