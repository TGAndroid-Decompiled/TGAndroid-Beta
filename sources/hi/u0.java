package hi;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
public abstract class u0 extends LinearLayout implements rh.a, oe.k {
    public final u6 f13301a;
    public final FrameLayout f13302b;
    public TLRPC.TL_replyKeyboardMarkup f13303c;
    public r0 d;
    public int e;
    public boolean f13304f;
    public int h;
    public final ArrayList f13305n;
    public final ScrollView f13306r;
    public int f13307s;
    public final GradientDrawable v;
    public int f13308w;
    public final oe.l f13309x;

    public u0(Context context, u6 u6Var) {
        super(context);
        this.f13305n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f13309x = new oe.l(this, ds.h, 320L);
        this.f13301a = u6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f13306r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13302b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(oe.l lVar) {
        Iterator it = this.f13309x.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f19336a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((t0) obj).setAlpha(c10);
            ((t0) obj).setScaleX(lerp);
            ((t0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void c(int i10) {
        if (this.f13307s == i10) {
            return;
        }
        this.f13307s = i10;
        ScrollView scrollView = this.f13306r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f13307s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int o12 = y6.o1(navigationBarThirdButtonsFactor, y6.w0(y6.He, this.f13301a));
            int i10 = this.f13308w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != o12) {
                gradientDrawable.setColors(new int[]{o12, y6.o1(0.66f, o12), i0.a.o(o12, 0)});
                this.f13308w = o12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f13307s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f13306r, y6.w0(y6.He, this.f13301a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13305n;
            if (i10 < arrayList.size()) {
                ((s0) arrayList.get(i10)).a();
                i10++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f13303c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f13304f) {
            return this.e;
        }
        return wh.b(4.0f, this.f13303c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: hi.u0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(r0 r0Var) {
        this.d = r0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f13304f && (tL_replyKeyboardMarkup = this.f13303c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f13304f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (wh.C(4.0f, this.f13303c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f13303c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f13309x.iterator();
            while (it.hasNext()) {
                oe.g gVar = (oe.g) it.next();
                int childCount = ((t0) gVar.f19336a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((t0) gVar.f19336a).getChildAt(i11);
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
