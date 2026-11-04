package bi;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s51;
public final class r extends HorizontalScrollView {
    public ai.n f3830a;
    public b0 f3831b;
    public final s51 f3832c;
    public final Paint d;
    public int f3833e;
    public float f3834f;
    public final h0 h;

    public r(h0 h0Var, Context context) {
        super(context);
        this.h = h0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f3833e = -1;
        this.f3834f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        s51 s51Var = new s51(2, context, this);
        this.f3832c = s51Var;
        s51Var.setOrientation(0);
        s51Var.setGravity(16);
        s51Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(s51Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i3, boolean z10) {
        if (i3 != this.f3833e && i3 >= 0) {
            s51 s51Var = this.f3832c;
            if (i3 < s51Var.getChildCount()) {
                this.f3833e = i3;
                if (!z10) {
                    this.f3834f = Float.NaN;
                }
                View childAt = s51Var.getChildAt(i3);
                int left = childAt.getLeft() - org.telegram.messenger.g0.L(30.0f);
                int L = org.telegram.messenger.g0.L(30.0f) + childAt.getRight();
                if (left < getScrollX()) {
                    if (z10) {
                        smoothScrollTo(left, 0);
                    } else {
                        scrollTo(left, 0);
                    }
                } else {
                    if (L > getWidth() + getScrollX()) {
                        if (z10) {
                            smoothScrollTo(L - getWidth(), 0);
                        } else {
                            scrollTo(L - getWidth(), 0);
                        }
                    }
                }
                s51Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: bi.r.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<o> arrayList) {
        TLRPC.Document document;
        s51 s51Var = this.f3832c;
        s51Var.removeAllViews();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            o oVar = arrayList.get(i3);
            Context context = getContext();
            int i10 = oVar.f3803a;
            if (i10 == 2) {
                document = (TLRPC.Document) oVar.f3805c.get(0);
            } else {
                document = null;
            }
            p pVar = new p(this.h, context, i10, document);
            pVar.setOnClickListener(new q(this, i3, 0));
            pVar.setContentDescription(oVar.f3804b);
            s51Var.addView(pVar, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(30.0f)));
        }
        this.f3833e = -1;
        this.f3834f = Float.NaN;
    }
}
