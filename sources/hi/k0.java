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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public abstract class k0 extends LinearLayout implements rh.a, te.i {
    public final f6 f14748a;
    public final FrameLayout f14749b;
    public TLRPC.TL_replyKeyboardMarkup f14750c;
    public h0 d;
    public int f14751e;
    public boolean f14752f;
    public int h;
    public final ArrayList f14753n;
    public final ScrollView f14754r;
    public int f14755s;
    public final GradientDrawable f14756w;
    public int f14757x;
    public final te.j f14758y;

    public k0(Context context, f6 f6Var) {
        super(context);
        this.f14753n = new ArrayList();
        this.f14756w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f14758y = new te.j(this, xq.h, 320L);
        this.f14748a = f6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f14754r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14749b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i7) {
        if (this.f14755s == i7) {
            return;
        }
        this.f14755s = i7;
        ScrollView scrollView = this.f14754r;
        if (scrollView.getPaddingBottom() != i7) {
            scrollView.setPadding(0, 0, 0, i7);
        }
        invalidate();
    }

    public final void d() {
        org.telegram.messenger.g0.z3(this.f14754r, k6.w0(k6.f28211wf, this.f14748a));
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14753n;
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
        float R0 = org.telegram.messenger.g0.R0(this.f14755s);
        if (R0 > 0.0f) {
            int r12 = k6.r1(R0, k6.w0(k6.f28211wf, this.f14748a));
            int i7 = this.f14757x;
            GradientDrawable gradientDrawable = this.f14756w;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, k6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.f14757x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f14755s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void f(te.j jVar) {
        Iterator it = this.f14758y.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f55403a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            ((j0) obj).setAlpha(c10);
            ((j0) obj).setScaleX(T1);
            ((j0) obj).setScaleY(T1);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f14750c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f14752f) {
            return this.f14751e;
        }
        return k5.D(4.0f, this.f14750c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        this.f14751e = i7;
        if (this.f14752f && (tL_replyKeyboardMarkup = this.f14750c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f14752f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (org.telegram.messenger.camera.q.A(4.0f, this.f14750c.rows.size() - 1, this.f14751e - org.telegram.messenger.g0.L(16.0f)) / this.f14750c.rows.size()) / org.telegram.messenger.g0.f22543p);
            }
            this.h = max;
            int L = org.telegram.messenger.g0.L(max);
            Iterator it = this.f14758y.iterator();
            while (it.hasNext()) {
                te.e eVar = (te.e) it.next();
                int childCount = ((j0) eVar.f55403a).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ((j0) eVar.f55403a).getChildAt(i10);
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
