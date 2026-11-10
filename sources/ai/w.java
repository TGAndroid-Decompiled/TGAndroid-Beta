package ai;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.e61;
public final class w extends HorizontalScrollView {
    public ab.g f1660a;
    public j0 f1661b;
    public final e61 f1662c;
    public final Paint d;
    public int f1663e;
    public float f1664f;
    public final q0 h;

    public w(q0 q0Var, Context context) {
        super(context);
        this.h = q0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f1663e = -1;
        this.f1664f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        e61 e61Var = new e61(1, context, this);
        this.f1662c = e61Var;
        e61Var.setOrientation(0);
        e61Var.setGravity(16);
        e61Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(e61Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i7, boolean z9) {
        if (i7 != this.f1663e && i7 >= 0) {
            e61 e61Var = this.f1662c;
            if (i7 < e61Var.getChildCount()) {
                this.f1663e = i7;
                if (!z9) {
                    this.f1664f = Float.NaN;
                }
                View childAt = e61Var.getChildAt(i7);
                int left = childAt.getLeft() - org.telegram.messenger.g0.L(30.0f);
                int L = org.telegram.messenger.g0.L(30.0f) + childAt.getRight();
                if (left < getScrollX()) {
                    if (z9) {
                        smoothScrollTo(left, 0);
                    } else {
                        scrollTo(left, 0);
                    }
                } else {
                    if (L > getWidth() + getScrollX()) {
                        if (z9) {
                            smoothScrollTo(L - getWidth(), 0);
                        } else {
                            scrollTo(L - getWidth(), 0);
                        }
                    }
                }
                e61Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<t> arrayList) {
        TLRPC.Document document;
        e61 e61Var = this.f1662c;
        e61Var.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            t tVar = arrayList.get(i7);
            Context context = getContext();
            int i10 = tVar.f1641a;
            if (i10 == 2) {
                document = (TLRPC.Document) tVar.f1643c.get(0);
            } else {
                document = null;
            }
            u uVar = new u(this.h, context, i10, document);
            uVar.setOnClickListener(new v(this, i7, 0));
            uVar.setContentDescription(tVar.f1642b);
            e61Var.addView(uVar, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(30.0f)));
        }
        this.f1663e = -1;
        this.f1664f = Float.NaN;
    }
}
