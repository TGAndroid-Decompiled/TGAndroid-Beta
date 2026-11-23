package ci;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d61;
public final class r extends HorizontalScrollView {
    public ab.g f5783a;
    public c0 f5784b;
    public final d61 f5785c;
    public final Paint d;
    public int f5786e;
    public float f5787f;
    public final h0 h;

    public r(h0 h0Var, Context context) {
        super(context);
        this.h = h0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f5786e = -1;
        this.f5787f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        d61 d61Var = new d61(1, context, this);
        this.f5785c = d61Var;
        d61Var.setOrientation(0);
        d61Var.setGravity(16);
        d61Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(d61Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i7, boolean z10) {
        if (i7 != this.f5786e && i7 >= 0) {
            d61 d61Var = this.f5785c;
            if (i7 < d61Var.getChildCount()) {
                this.f5786e = i7;
                if (!z10) {
                    this.f5787f = Float.NaN;
                }
                View childAt = d61Var.getChildAt(i7);
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
                d61Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<o> arrayList) {
        TLRPC.Document document;
        d61 d61Var = this.f5785c;
        d61Var.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            o oVar = arrayList.get(i7);
            Context context = getContext();
            int i10 = oVar.f5757a;
            if (i10 == 2) {
                document = (TLRPC.Document) oVar.f5759c.get(0);
            } else {
                document = null;
            }
            p pVar = new p(this.h, context, i10, document);
            pVar.setOnClickListener(new q(this, i7, 0));
            pVar.setContentDescription(oVar.f5758b);
            d61Var.addView(pVar, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(30.0f)));
        }
        this.f5786e = -1;
        this.f5787f = Float.NaN;
    }
}
