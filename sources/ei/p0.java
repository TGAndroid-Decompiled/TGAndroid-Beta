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
import org.telegram.messenger.am;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.js;
public abstract class p0 extends LinearLayout implements ph.a, me.k {
    public final c6 f9268a;
    public final FrameLayout f9269b;
    public TLRPC.TL_replyKeyboardMarkup f9270c;
    public m0 d;
    public int f9271e;
    public boolean f9272f;
    public int h;
    public final ArrayList f9273n;
    public final ScrollView f9274r;
    public int f9275s;
    public final GradientDrawable v;
    public int f9276w;
    public final me.l f9277x;

    public p0(Context context, c6 c6Var) {
        super(context);
        this.f9273n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f9277x = new me.l(this, js.h, 320L);
        this.f9268a = c6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f9274r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9269b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(int i10) {
        if (this.f9275s == i10) {
            return;
        }
        this.f9275s = i10;
        ScrollView scrollView = this.f9274r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void c(me.l lVar) {
        Iterator it = this.f9277x.iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16099a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f9275s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int m12 = h6.m1(navigationBarThirdButtonsFactor, h6.w0(h6.He, this.f9268a));
            int i10 = this.f9276w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != m12) {
                gradientDrawable.setColors(new int[]{m12, h6.m1(0.66f, m12), i0.a.k(m12, 0)});
                this.f9276w = m12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f9275s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f9274r, h6.w0(h6.He, this.f9268a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9273n;
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
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f9270c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f9272f) {
            return this.f9271e;
        }
        return org.telegram.messenger.v0.D(4.0f, this.f9270c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        this.f9271e = i10;
        if (this.f9272f && (tL_replyKeyboardMarkup = this.f9270c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f9272f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (am.B(4.0f, this.f9270c.rows.size() - 1, this.f9271e - AndroidUtilities.dp(16.0f)) / this.f9270c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f9277x.iterator();
            while (it.hasNext()) {
                me.g gVar = (me.g) it.next();
                int childCount = ((o0) gVar.f16099a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((o0) gVar.f16099a).getChildAt(i11);
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
    public final void a() {
    }

    @Override
    public final void d(float f7) {
    }
}
