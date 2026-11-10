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
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;
public abstract class k0 extends LinearLayout implements rh.a, te.i {
    public final h6 f14753a;
    public final FrameLayout f14754b;
    public TLRPC.TL_replyKeyboardMarkup f14755c;
    public h0 d;
    public int f14756e;
    public boolean f14757f;
    public int h;
    public final ArrayList f14758n;
    public final ScrollView f14759r;
    public int f14760s;
    public final GradientDrawable f14761w;
    public int f14762x;
    public final te.j f14763y;

    public k0(Context context, h6 h6Var) {
        super(context);
        this.f14758n = new ArrayList();
        this.f14761w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f14763y = new te.j(this, wq.h, 320L);
        this.f14753a = h6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f14759r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14754b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i7) {
        if (this.f14760s == i7) {
            return;
        }
        this.f14760s = i7;
        ScrollView scrollView = this.f14759r;
        if (scrollView.getPaddingBottom() != i7) {
            scrollView.setPadding(0, 0, 0, i7);
        }
        invalidate();
    }

    public final void d() {
        org.telegram.messenger.g0.z3(this.f14759r, m6.w0(m6.f28252wf, this.f14753a));
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14758n;
            if (i7 < arrayList.size()) {
                ((i0) arrayList.get(i7)).a();
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
        float R0 = org.telegram.messenger.g0.R0(this.f14760s);
        if (R0 > 0.0f) {
            int r12 = m6.r1(R0, m6.w0(m6.f28252wf, this.f14753a));
            int i7 = this.f14762x;
            GradientDrawable gradientDrawable = this.f14761w;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, m6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.f14762x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f14760s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void f(te.j jVar) {
        Iterator it = this.f14763y.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f55507a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            ((j0) obj).setAlpha(c10);
            ((j0) obj).setScaleX(T1);
            ((j0) obj).setScaleY(T1);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f14755c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f14757f) {
            return this.f14756e;
        }
        return k5.D(4.0f, this.f14755c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: hi.k0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(h0 h0Var) {
        this.d = h0Var;
    }

    public void setPanelHeight(int i7) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f14756e = i7;
        if (this.f14757f && (tL_replyKeyboardMarkup = this.f14755c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f14757f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (org.telegram.messenger.camera.q.A(4.0f, this.f14755c.rows.size() - 1, this.f14756e - org.telegram.messenger.g0.L(16.0f)) / this.f14755c.rows.size()) / org.telegram.messenger.g0.f22566p);
            }
            this.h = max;
            int L = org.telegram.messenger.g0.L(max);
            Iterator it = this.f14763y.iterator();
            while (it.hasNext()) {
                te.e eVar = (te.e) it.next();
                int childCount = ((j0) eVar.f55507a).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ((j0) eVar.f55507a).getChildAt(i10);
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
