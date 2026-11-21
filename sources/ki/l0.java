package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
public abstract class l0 extends LinearLayout implements rh.a, te.i {
    public final h6 f18781a;
    public final FrameLayout f18782b;
    public TLRPC.TL_replyKeyboardMarkup f18783c;
    public i0 d;
    public int f18784e;
    public boolean f18785f;
    public int h;
    public final ArrayList f18786n;
    public final ScrollView f18787r;
    public int f18788s;
    public final GradientDrawable f18789w;
    public int f18790x;
    public final te.j f18791y;

    public l0(Context context, h6 h6Var) {
        super(context);
        this.f18786n = new ArrayList();
        this.f18789w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f18791y = new te.j(this, nr.h, 320L);
        this.f18781a = h6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f18787r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18782b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i7) {
        if (this.f18788s == i7) {
            return;
        }
        this.f18788s = i7;
        ScrollView scrollView = this.f18787r;
        if (scrollView.getPaddingBottom() != i7) {
            scrollView.setPadding(0, 0, 0, i7);
        }
        invalidate();
    }

    public final void d() {
        org.telegram.messenger.g0.x3(this.f18787r, m6.w0(m6.f29798zf, this.f18781a));
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18786n;
            if (i7 < arrayList.size()) {
                ((j0) arrayList.get(i7)).a();
                i7++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float R0 = org.telegram.messenger.g0.R0(this.f18788s);
        if (R0 > 0.0f) {
            int r12 = m6.r1(R0, m6.w0(m6.f29798zf, this.f18781a));
            int i7 = this.f18790x;
            GradientDrawable gradientDrawable = this.f18789w;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, m6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.f18790x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f18788s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void f(te.j jVar) {
        Iterator it = this.f18791y.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f57705a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            ((k0) obj).setAlpha(c10);
            ((k0) obj).setScaleX(T1);
            ((k0) obj).setScaleY(T1);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f18783c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f18785f) {
            return this.f18784e;
        }
        return org.telegram.messenger.f3.D(4.0f, this.f18783c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.l0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(i0 i0Var) {
        this.d = i0Var;
    }

    public void setPanelHeight(int i7) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f18784e = i7;
        if (this.f18785f && (tL_replyKeyboardMarkup = this.f18783c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f18785f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (n10.B(4.0f, this.f18783c.rows.size() - 1, this.f18784e - org.telegram.messenger.g0.L(16.0f)) / this.f18783c.rows.size()) / org.telegram.messenger.g0.f24145p);
            }
            this.h = max;
            int L = org.telegram.messenger.g0.L(max);
            Iterator it = this.f18791y.iterator();
            while (it.hasNext()) {
                te.e eVar = (te.e) it.next();
                int childCount = ((k0) eVar.f57705a).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ((k0) eVar.f57705a).getChildAt(i10);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.height != L) {
                        layoutParams.height = L;
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
    public final void c(float f10) {
    }
}
