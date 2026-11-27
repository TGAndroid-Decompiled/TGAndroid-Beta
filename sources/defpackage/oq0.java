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
public abstract class oq0 extends LinearLayout implements fp5, wa9 {
    public final vnb a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public lq0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable w;
    public int x;
    public final xa9 y;

    public oq0(Context context, vnb vnbVar) {
        super(context);
        this.n = new ArrayList();
        this.w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.y = new xa9(this, k43.h, 320L);
        this.a = vnbVar;
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
        hl.u3(this.r, aob.v0(aob.zf, this.a));
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                ((mq0) arrayList.get(i)).a();
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
        float Q0 = hl.Q0(this.s);
        if (Q0 > 0.0f) {
            int p1 = aob.p1(Q0, aob.v0(aob.zf, this.a));
            int i = this.x;
            GradientDrawable gradientDrawable = this.w;
            if (i != p1) {
                gradientDrawable.setColors(new int[]{p1, aob.p1(0.66f, p1), vm2.o(p1, 0)});
                this.x = p1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void f(xa9 xa9Var) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            float c = y66Var.c();
            Object obj = y66Var.a;
            float R1 = hl.R1(0.7f, 1.0f, c);
            ((nq0) obj).setAlpha(c);
            ((nq0) obj).setScaleX(R1);
            ((nq0) obj).setScaleY(R1);
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
        int L = hl.L(this.h) * tL_replyKeyboardMarkup.rows.size();
        return uh9.y(4.0f, this.c.rows.size() - 1, hl.L(16.0f) + L);
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(lq0 lq0Var) {
        this.d = lq0Var;
    }

    public void setPanelHeight(int i) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i;
        if (this.f && (tL_replyKeyboardMarkup = this.c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (((this.e - hl.L(16.0f)) - (hl.L(4.0f) * (this.c.rows.size() - 1))) / this.c.rows.size()) / hl.p);
            }
            this.h = max;
            int L = hl.L(max);
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                y66 y66Var = (y66) it.next();
                int childCount = ((nq0) y66Var.a).getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = ((nq0) y66Var.a).getChildAt(i2);
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
    public final void c() {
    }

    @Override
    public final void b(float f) {
    }
}
