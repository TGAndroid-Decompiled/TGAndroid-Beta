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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr;
public abstract class p0 extends LinearLayout implements qh.a, le.k {
    public final f6 f9869a;
    public final FrameLayout f9870b;
    public TLRPC.TL_replyKeyboardMarkup f9871c;
    public m0 d;
    public int f9872e;
    public boolean f9873f;
    public int h;
    public final ArrayList f9874n;
    public final ScrollView f9875r;
    public int f9876s;
    public final GradientDrawable v;
    public int f9877w;
    public final le.l f9878x;

    public p0(Context context, f6 f6Var) {
        super(context);
        this.f9874n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f9878x = new le.l(this, pr.h, 320L);
        this.f9869a = f6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f9875r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9870b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void a(int i10) {
        if (this.f9876s == i10) {
            return;
        }
        this.f9876s = i10;
        ScrollView scrollView = this.f9875r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f9875r, j6.v0(j6.He, this.f9869a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9874n;
            if (i10 < arrayList.size()) {
                ((n0) arrayList.get(i10)).a();
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
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f9876s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = j6.l1(navigationBarThirdButtonsFactor, j6.v0(j6.He, this.f9869a));
            int i10 = this.f9877w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f9877w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f9876s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(le.l lVar) {
        Iterator it = this.f9878x.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f15379a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f9871c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f9873f) {
            return this.f9872e;
        }
        return org.telegram.messenger.w1.D(4.0f, this.f9871c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: fi.p0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(m0 m0Var) {
        this.d = m0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f9872e = i10;
        if (this.f9873f && (tL_replyKeyboardMarkup = this.f9871c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f9873f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (wl.A(4.0f, this.f9871c.rows.size() - 1, this.f9872e - AndroidUtilities.dp(16.0f)) / this.f9871c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f9878x.iterator();
            while (it.hasNext()) {
                le.g gVar = (le.g) it.next();
                int childCount = ((o0) gVar.f15379a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((o0) gVar.f15379a).getChildAt(i11);
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
