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
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.sr;
public abstract class p0 extends LinearLayout implements ph.a, le.l {
    public final e6 f8512a;
    public final FrameLayout f8513b;
    public TLRPC.TL_replyKeyboardMarkup f8514c;
    public m0 d;
    public int e;
    public boolean f8515f;
    public int h;
    public final ArrayList f8516n;
    public final ScrollView f8517r;
    public int f8518s;
    public final GradientDrawable v;
    public int f8519w;
    public final le.m f8520x;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f8516n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f8520x = new le.m(this, sr.h, 320L);
        this.f8512a = e6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f8517r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8513b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(int i10) {
        if (this.f8518s == i10) {
            return;
        }
        this.f8518s = i10;
        ScrollView scrollView = this.f8517r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void c(le.m mVar) {
        Iterator it = this.f8520x.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f14212a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f8518s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = i6.l1(navigationBarThirdButtonsFactor, i6.v0(i6.He, this.f8512a));
            int i10 = this.f8519w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, i6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f8519w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f8518s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f8517r, i6.v0(i6.He, this.f8512a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8516n;
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
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f8514c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f8515f) {
            return this.e;
        }
        return org.telegram.messenger.l0.D(4.0f, this.f8514c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        if (this.f8515f && (tL_replyKeyboardMarkup = this.f8514c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f8515f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (qk.B(4.0f, this.f8514c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f8514c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f8520x.iterator();
            while (it.hasNext()) {
                le.h hVar = (le.h) it.next();
                int childCount = ((o0) hVar.f14212a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((o0) hVar.f14212a).getChildAt(i11);
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
