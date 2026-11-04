package ii;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public abstract class m0 extends LinearLayout implements sh.a, qe.i {
    public final e6 f15062a;
    public final FrameLayout f15063b;
    public TLRPC.TL_replyKeyboardMarkup f15064c;
    public j0 d;
    public int f15065e;
    public boolean f15066f;
    public int h;
    public final ArrayList f15067n;
    public final ScrollView f15068r;
    public int f15069s;
    public final GradientDrawable f15070w;
    public int f15071x;
    public final qe.j f15072y;

    public m0(Context context, e6 e6Var) {
        super(context);
        this.f15067n = new ArrayList();
        this.f15070w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f15072y = new qe.j(this, xq.h, 320L);
        this.f15062a = e6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f15068r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15063b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(qe.j jVar) {
        Iterator it = this.f15072y.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            float c2 = eVar.c();
            Object obj = eVar.f53849a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c2);
            ((l0) obj).setAlpha(c2);
            ((l0) obj).setScaleX(T1);
            ((l0) obj).setScaleY(T1);
        }
    }

    @Override
    public final void c(int i3) {
        if (this.f15069s == i3) {
            return;
        }
        this.f15069s = i3;
        ScrollView scrollView = this.f15068r;
        if (scrollView.getPaddingBottom() != i3) {
            scrollView.setPadding(0, 0, 0, i3);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float R0 = org.telegram.messenger.g0.R0(this.f15069s);
        if (R0 > 0.0f) {
            int r12 = k6.r1(R0, k6.w0(k6.f28243wf, this.f15062a));
            int i3 = this.f15071x;
            GradientDrawable gradientDrawable = this.f15070w;
            if (i3 != r12) {
                gradientDrawable.setColors(new int[]{r12, k6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.f15071x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f15069s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        org.telegram.messenger.g0.z3(this.f15068r, k6.w0(k6.f28243wf, this.f15062a));
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f15067n;
            if (i3 < arrayList.size()) {
                ((k0) arrayList.get(i3)).a();
                i3++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f15064c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f15066f) {
            return this.f15065e;
        }
        return k5.D(4.0f, this.f15064c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: ii.m0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(j0 j0Var) {
        this.d = j0Var;
    }

    public void setPanelHeight(int i3) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f15065e = i3;
        if (this.f15066f && (tL_replyKeyboardMarkup = this.f15064c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f15066f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (org.telegram.messenger.camera.q.A(4.0f, this.f15064c.rows.size() - 1, this.f15065e - org.telegram.messenger.g0.L(16.0f)) / this.f15064c.rows.size()) / org.telegram.messenger.g0.f22607p);
            }
            this.h = max;
            int L = org.telegram.messenger.g0.L(max);
            Iterator it = this.f15072y.iterator();
            while (it.hasNext()) {
                qe.e eVar = (qe.e) it.next();
                int childCount = ((l0) eVar.f53849a).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ((l0) eVar.f53849a).getChildAt(i10);
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
    public final void d(float f10) {
    }

    @Override
    public final void a() {
    }
}
