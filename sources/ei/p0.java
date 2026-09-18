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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
public abstract class p0 extends LinearLayout implements ph.a, le.k {
    public final e6 f8526a;
    public final FrameLayout f8527b;
    public TLRPC.TL_replyKeyboardMarkup f8528c;
    public m0 d;
    public int e;
    public boolean f8529f;
    public int h;
    public final ArrayList f8530n;
    public final ScrollView f8531r;
    public int f8532s;
    public final GradientDrawable v;
    public int f8533w;
    public final le.l f8534x;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f8530n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f8534x = new le.l(this, qr.h, 320L);
        this.f8526a = e6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f8531r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8527b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(int i10) {
        if (this.f8532s == i10) {
            return;
        }
        this.f8532s = i10;
        ScrollView scrollView = this.f8531r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void c(le.l lVar) {
        Iterator it = this.f8534x.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f14140a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f8532s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = j6.l1(navigationBarThirdButtonsFactor, j6.v0(j6.He, this.f8526a));
            int i10 = this.f8533w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f8533w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f8532s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f8531r, j6.v0(j6.He, this.f8526a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8530n;
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
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f8528c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f8529f) {
            return this.e;
        }
        return wh.c(4.0f, this.f8528c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        if (this.f8529f && (tL_replyKeyboardMarkup = this.f8528c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f8529f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (wh.B(4.0f, this.f8528c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f8528c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f8534x.iterator();
            while (it.hasNext()) {
                le.g gVar = (le.g) it.next();
                int childCount = ((o0) gVar.f14140a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((o0) gVar.f14140a).getChildAt(i11);
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
