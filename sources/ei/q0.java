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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.tr;
public abstract class q0 extends LinearLayout implements ph.a, le.k {
    public final d6 f9259a;
    public final FrameLayout f9260b;
    public TLRPC.TL_replyKeyboardMarkup f9261c;
    public n0 d;
    public int f9262e;
    public boolean f9263f;
    public int h;
    public final ArrayList f9264n;
    public final ScrollView f9265r;
    public int f9266s;
    public final GradientDrawable v;
    public int f9267w;
    public final le.l f9268x;

    public q0(Context context, d6 d6Var) {
        super(context);
        this.f9264n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f9268x = new le.l(this, tr.h, 320L);
        this.f9259a = d6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f9265r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9260b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(int i10) {
        if (this.f9266s == i10) {
            return;
        }
        this.f9266s = i10;
        ScrollView scrollView = this.f9265r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void c(le.l lVar) {
        Iterator it = this.f9268x.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f15445a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((p0) obj).setAlpha(c10);
            ((p0) obj).setScaleX(lerp);
            ((p0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f9266s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = i6.l1(navigationBarThirdButtonsFactor, i6.v0(i6.He, this.f9259a));
            int i10 = this.f9267w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, i6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f9267w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f9266s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f9265r, i6.v0(i6.He, this.f9259a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9264n;
            if (i10 < arrayList.size()) {
                ((o0) arrayList.get(i10)).a();
                i10++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f9261c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f9263f) {
            return this.f9262e;
        }
        return org.telegram.messenger.f0.D(4.0f, this.f9261c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.q0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(n0 n0Var) {
        this.d = n0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f9262e = i10;
        if (this.f9263f && (tL_replyKeyboardMarkup = this.f9261c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f9263f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (ok.A(4.0f, this.f9261c.rows.size() - 1, this.f9262e - AndroidUtilities.dp(16.0f)) / this.f9261c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f9268x.iterator();
            while (it.hasNext()) {
                le.g gVar = (le.g) it.next();
                int childCount = ((p0) gVar.f15445a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((p0) gVar.f15445a).getChildAt(i11);
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
