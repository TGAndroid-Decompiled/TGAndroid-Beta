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
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
public abstract class m0 extends LinearLayout implements rh.a, te.i {
    public final e6 f18436a;
    public final FrameLayout f18437b;
    public TLRPC.TL_replyKeyboardMarkup f18438c;
    public j0 d;
    public int f18439e;
    public boolean f18440f;
    public int h;
    public final ArrayList f18441n;
    public final ScrollView f18442r;
    public int f18443s;
    public final GradientDrawable f18444w;
    public int f18445x;
    public final te.j f18446y;

    public m0(Context context, e6 e6Var) {
        super(context);
        this.f18441n = new ArrayList();
        this.f18444w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f18446y = new te.j(this, er.h, 320L);
        this.f18436a = e6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f18442r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18437b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i7) {
        if (this.f18443s == i7) {
            return;
        }
        this.f18443s = i7;
        ScrollView scrollView = this.f18442r;
        if (scrollView.getPaddingBottom() != i7) {
            scrollView.setPadding(0, 0, 0, i7);
        }
        invalidate();
    }

    public final void d() {
        org.telegram.messenger.g0.y3(this.f18442r, j6.w0(j6.f29269zf, this.f18436a));
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18441n;
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
        float R0 = org.telegram.messenger.g0.R0(this.f18443s);
        if (R0 > 0.0f) {
            int r12 = j6.r1(R0, j6.w0(j6.f29269zf, this.f18436a));
            int i7 = this.f18445x;
            GradientDrawable gradientDrawable = this.f18444w;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, j6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.f18445x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f18443s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void f(te.j jVar) {
        Iterator it = this.f18446y.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f57090a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            ((l0) obj).setAlpha(c10);
            ((l0) obj).setScaleX(T1);
            ((l0) obj).setScaleY(T1);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f18438c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f18440f) {
            return this.f18439e;
        }
        return k5.D(4.0f, this.f18438c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        this.f18439e = i7;
        if (this.f18440f && (tL_replyKeyboardMarkup = this.f18438c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f18440f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (i20.A(4.0f, this.f18438c.rows.size() - 1, this.f18439e - org.telegram.messenger.g0.L(16.0f)) / this.f18438c.rows.size()) / org.telegram.messenger.g0.f23608p);
            }
            this.h = max;
            int L = org.telegram.messenger.g0.L(max);
            Iterator it = this.f18446y.iterator();
            while (it.hasNext()) {
                te.e eVar = (te.e) it.next();
                int childCount = ((l0) eVar.f57090a).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ((l0) eVar.f57090a).getChildAt(i10);
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
