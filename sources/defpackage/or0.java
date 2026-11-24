package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public abstract class or0 extends LinearLayout implements cp5, l99 {
    public final ylb a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public lr0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable w;
    public int x;
    public final m99 y;

    public or0(Context context, ylb ylbVar) {
        super(context);
        this.n = new ArrayList();
        this.w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.y = new m99(this, d53.h, 320L);
        this.a = ylbVar;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void a(int i) {
        if (this.s == i) {
            return;
        }
        this.s = i;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i) {
            scrollView.setPadding(0, 0, 0, i);
        }
        invalidate();
    }

    public final void d() {
        gm.u3(this.r, cmb.v0(cmb.yf, this.a));
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                ((mr0) arrayList.get(i)).a();
                i++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float Q0 = gm.Q0(this.s);
        if (Q0 > 0.0f) {
            int p1 = cmb.p1(Q0, cmb.v0(cmb.yf, this.a));
            int i = this.x;
            GradientDrawable gradientDrawable = this.w;
            if (i != p1) {
                gradientDrawable.setColors(new int[]{p1, cmb.p1(0.66f, p1), on2.p(p1, 0)});
                this.x = p1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(m99 m99Var) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            float c = u66Var.c();
            Object obj = u66Var.a;
            float R1 = gm.R1(0.7f, 1.0f, c);
            ((nr0) obj).setAlpha(c);
            ((nr0) obj).setScaleX(R1);
            ((nr0) obj).setScaleY(R1);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f) {
            return this.e;
        }
        int L = gm.L(this.h) * tL_replyKeyboardMarkup.rows.size();
        return hg9.y(4.0f, this.c.rows.size() - 1, gm.L(16.0f) + L);
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(lr0 lr0Var) {
        this.d = lr0Var;
    }

    public void setPanelHeight(int i) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i;
        if (this.f && (tL_replyKeyboardMarkup = this.c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (((this.e - gm.L(16.0f)) - (gm.L(4.0f) * (this.c.rows.size() - 1))) / this.c.rows.size()) / gm.p);
            }
            this.h = max;
            int L = gm.L(max);
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                u66 u66Var = (u66) it.next();
                int childCount = ((nr0) u66Var.a).getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = ((nr0) u66Var.a).getChildAt(i2);
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
    public final void b(float f) {
    }

    @Override
    public final void c() {
    }
}
