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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.is;
public abstract class p0 extends LinearLayout implements ph.a, me.k {
    public final e6 f9271a;
    public final FrameLayout f9272b;
    public TLRPC.TL_replyKeyboardMarkup f9273c;
    public m0 d;
    public int f9274e;
    public boolean f9275f;
    public int h;
    public final ArrayList f9276n;
    public final ScrollView f9277r;
    public int f9278s;
    public final GradientDrawable v;
    public int f9279w;
    public final me.l f9280x;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f9276n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f9280x = new me.l(this, is.h, 320L);
        this.f9271a = e6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f9277r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9272b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(int i10) {
        if (this.f9278s == i10) {
            return;
        }
        this.f9278s = i10;
        ScrollView scrollView = this.f9277r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void c(me.l lVar) {
        Iterator it = this.f9280x.iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16352a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f9278s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int m12 = i6.m1(navigationBarThirdButtonsFactor, i6.w0(i6.He, this.f9271a));
            int i10 = this.f9279w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != m12) {
                gradientDrawable.setColors(new int[]{m12, i6.m1(0.66f, m12), i0.a.k(m12, 0)});
                this.f9279w = m12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f9278s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f9277r, i6.w0(i6.He, this.f9271a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9276n;
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
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f9273c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f9275f) {
            return this.f9274e;
        }
        return org.telegram.messenger.q.D(4.0f, this.f9273c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        this.f9274e = i10;
        if (this.f9275f && (tL_replyKeyboardMarkup = this.f9273c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f9275f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (bi.B(4.0f, this.f9273c.rows.size() - 1, this.f9274e - AndroidUtilities.dp(16.0f)) / this.f9273c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f9280x.iterator();
            while (it.hasNext()) {
                me.g gVar = (me.g) it.next();
                int childCount = ((o0) gVar.f16352a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((o0) gVar.f16352a).getChildAt(i11);
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
