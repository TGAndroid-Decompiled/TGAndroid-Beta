package di;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wr;
public abstract class s0 extends LinearLayout implements oh.a, le.k {
    public final f6 f6883a;
    public final FrameLayout f6884b;
    public TLRPC.TL_replyKeyboardMarkup f6885c;
    public p0 d;
    public int e;
    public boolean f6886f;
    public int h;
    public final ArrayList f6887n;
    public final ScrollView f6888r;
    public int f6889s;
    public final GradientDrawable v;
    public int f6890w;
    public final le.l f6891x;

    public s0(Context context, f6 f6Var) {
        super(context);
        this.f6887n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f6891x = new le.l(this, wr.h, 320L);
        this.f6883a = f6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f6888r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6884b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i10) {
        if (this.f6889s == i10) {
            return;
        }
        this.f6889s = i10;
        ScrollView scrollView = this.f6888r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f6888r, j6.v0(j6.He, this.f6883a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6887n;
            if (i10 < arrayList.size()) {
                ((q0) arrayList.get(i10)).a();
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
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f6889s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = j6.l1(navigationBarThirdButtonsFactor, j6.v0(j6.He, this.f6883a));
            int i10 = this.f6890w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f6890w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f6889s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(le.l lVar) {
        Iterator it = this.f6891x.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f12879a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((r0) obj).setAlpha(c10);
            ((r0) obj).setScaleX(lerp);
            ((r0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f6885c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f6886f) {
            return this.e;
        }
        return org.telegram.messenger.a2.D(4.0f, this.f6885c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.s0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(p0 p0Var) {
        this.d = p0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f6886f && (tL_replyKeyboardMarkup = this.f6885c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f6886f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (em.A(4.0f, this.f6885c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f6885c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f6891x.iterator();
            while (it.hasNext()) {
                le.g gVar = (le.g) it.next();
                int childCount = ((r0) gVar.f12879a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((r0) gVar.f12879a).getChildAt(i11);
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
    public final void c(float f7) {
    }
}
