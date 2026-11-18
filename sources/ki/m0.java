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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
public abstract class m0 extends LinearLayout implements rh.a, te.i {
    public final i6 f18771a;
    public final FrameLayout f18772b;
    public TLRPC.TL_replyKeyboardMarkup f18773c;
    public j0 d;
    public int f18774e;
    public boolean f18775f;
    public int h;
    public final ArrayList f18776n;
    public final ScrollView f18777r;
    public int f18778s;
    public final GradientDrawable f18779w;
    public int f18780x;
    public final te.j f18781y;

    public m0(Context context, i6 i6Var) {
        super(context);
        this.f18776n = new ArrayList();
        this.f18779w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f18781y = new te.j(this, lr.h, 320L);
        this.f18771a = i6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f18777r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18772b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i7) {
        if (this.f18778s == i7) {
            return;
        }
        this.f18778s = i7;
        ScrollView scrollView = this.f18777r;
        if (scrollView.getPaddingBottom() != i7) {
            scrollView.setPadding(0, 0, 0, i7);
        }
        invalidate();
    }

    public final void d() {
        org.telegram.messenger.g0.x3(this.f18777r, n6.w0(n6.f29814zf, this.f18771a));
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18776n;
            if (i7 < arrayList.size()) {
                ((k0) arrayList.get(i7)).a();
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
        float R0 = org.telegram.messenger.g0.R0(this.f18778s);
        if (R0 > 0.0f) {
            int r12 = n6.r1(R0, n6.w0(n6.f29814zf, this.f18771a));
            int i7 = this.f18780x;
            GradientDrawable gradientDrawable = this.f18779w;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, n6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.f18780x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f18778s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void f(te.j jVar) {
        Iterator it = this.f18781y.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f57666a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            ((l0) obj).setAlpha(c10);
            ((l0) obj).setScaleX(T1);
            ((l0) obj).setScaleY(T1);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f18773c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f18775f) {
            return this.f18774e;
        }
        return org.telegram.messenger.f3.D(4.0f, this.f18773c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.m0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(j0 j0Var) {
        this.d = j0Var;
    }

    public void setPanelHeight(int i7) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f18774e = i7;
        if (this.f18775f && (tL_replyKeyboardMarkup = this.f18773c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f18775f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (n10.B(4.0f, this.f18773c.rows.size() - 1, this.f18774e - org.telegram.messenger.g0.L(16.0f)) / this.f18773c.rows.size()) / org.telegram.messenger.g0.f24117p);
            }
            this.h = max;
            int L = org.telegram.messenger.g0.L(max);
            Iterator it = this.f18781y.iterator();
            while (it.hasNext()) {
                te.e eVar = (te.e) it.next();
                int childCount = ((l0) eVar.f57666a).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ((l0) eVar.f57666a).getChildAt(i10);
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
