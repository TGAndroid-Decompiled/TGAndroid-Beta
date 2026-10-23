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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
public abstract class n0 extends LinearLayout implements qh.a, ne.k {
    public final g6 f11371a;
    public final FrameLayout f11372b;
    public TLRPC.TL_replyKeyboardMarkup f11373c;
    public k0 d;
    public int e;
    public boolean f11374f;
    public int h;
    public final ArrayList f11375n;
    public final ScrollView f11376r;
    public int f11377s;
    public final GradientDrawable v;
    public int f11378w;
    public final ne.l f11379x;

    public n0(Context context, g6 g6Var) {
        super(context);
        this.f11375n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f11379x = new ne.l(this, bs.h, 320L);
        this.f11371a = g6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f11376r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11372b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i10) {
        if (this.f11377s == i10) {
            return;
        }
        this.f11377s = i10;
        ScrollView scrollView = this.f11376r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f11376r, k6.w0(k6.He, this.f11371a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11375n;
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
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f11377s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int o12 = k6.o1(navigationBarThirdButtonsFactor, k6.w0(k6.He, this.f11371a));
            int i10 = this.f11378w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != o12) {
                gradientDrawable.setColors(new int[]{o12, k6.o1(0.66f, o12), i0.a.o(o12, 0)});
                this.f11378w = o12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f11377s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(ne.l lVar) {
        Iterator it = this.f11379x.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f17456a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((m0) obj).setAlpha(c10);
            ((m0) obj).setScaleX(lerp);
            ((m0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f11373c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f11374f) {
            return this.e;
        }
        return org.telegram.messenger.v0.D(4.0f, this.f11373c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        if (this.f11374f && (tL_replyKeyboardMarkup = this.f11373c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f11374f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (sl.B(4.0f, this.f11373c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f11373c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f11379x.iterator();
            while (it.hasNext()) {
                ne.g gVar = (ne.g) it.next();
                int childCount = ((m0) gVar.f17456a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((m0) gVar.f17456a).getChildAt(i11);
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
    public final void c(float f7) {
    }

    @Override
    public final void a() {
    }
}
