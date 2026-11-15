package ci;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.z51;
public final class r extends HorizontalScrollView {
    public ab.g f5472a;
    public b0 f5473b;
    public final z51 f5474c;
    public final Paint d;
    public int f5475e;
    public float f5476f;
    public final g0 h;

    public r(g0 g0Var, Context context) {
        super(context);
        this.h = g0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f5475e = -1;
        this.f5476f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        z51 z51Var = new z51(2, context, this);
        this.f5474c = z51Var;
        z51Var.setOrientation(0);
        z51Var.setGravity(16);
        z51Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(z51Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i7, boolean z10) {
        if (i7 != this.f5475e && i7 >= 0) {
            z51 z51Var = this.f5474c;
            if (i7 < z51Var.getChildCount()) {
                this.f5475e = i7;
                if (!z10) {
                    this.f5476f = Float.NaN;
                }
                View childAt = z51Var.getChildAt(i7);
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
                z51Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<o> arrayList) {
        TLRPC.Document document;
        z51 z51Var = this.f5474c;
        z51Var.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            o oVar = arrayList.get(i7);
            Context context = getContext();
            int i10 = oVar.f5453a;
            if (i10 == 2) {
                document = (TLRPC.Document) oVar.f5455c.get(0);
            } else {
                document = null;
            }
            p pVar = new p(this.h, context, i10, document);
            pVar.setOnClickListener(new q(this, i7, 0));
            pVar.setContentDescription(oVar.f5454b);
            z51Var.addView(pVar, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(30.0f)));
        }
        this.f5475e = -1;
        this.f5476f = Float.NaN;
    }
}
