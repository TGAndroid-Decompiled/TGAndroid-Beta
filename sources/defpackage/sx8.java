package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sx8 extends HorizontalScrollView {
    public xr8 a;
    public ay8 b;
    public final qmb c;
    public final Paint d;
    public int e;
    public float f;
    public final gy8 h;

    public sx8(gy8 gy8Var, Activity activity) {
        super(activity);
        this.h = gy8Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        qmb qmbVar = new qmb((byte) 12, activity, this);
        this.c = qmbVar;
        qmbVar.setOrientation(0);
        qmbVar.setGravity(16);
        qmbVar.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        addView(qmbVar, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i, boolean z) {
        if (i != this.e && i >= 0) {
            qmb qmbVar = this.c;
            if (i < qmbVar.getChildCount()) {
                this.e = i;
                if (!z) {
                    this.f = Float.NaN;
                }
                View childAt = qmbVar.getChildAt(i);
                int left = childAt.getLeft() - gm.L(30.0f);
                int L = gm.L(30.0f) + childAt.getRight();
                if (left < getScrollX()) {
                    if (z) {
                        smoothScrollTo(left, 0);
                    } else {
                        scrollTo(left, 0);
                    }
                } else {
                    if (L > getWidth() + getScrollX()) {
                        if (z) {
                            smoothScrollTo(L - getWidth(), 0);
                        } else {
                            scrollTo(L - getWidth(), 0);
                        }
                    }
                }
                qmbVar.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx8.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<qx8> arrayList) {
        TLRPC.Document document;
        qmb qmbVar = this.c;
        qmbVar.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            qx8 qx8Var = arrayList.get(i);
            Context context = getContext();
            byte b = qx8Var.a;
            if (b == 2) {
                document = (TLRPC.Document) qx8Var.c.get(0);
            } else {
                document = null;
            }
            rx8 rx8Var = new rx8(this.h, context, b, document);
            rx8Var.setOnClickListener(new v0(this, i, (byte) 19));
            rx8Var.setContentDescription(qx8Var.b);
            qmbVar.addView(rx8Var, new LinearLayout.LayoutParams(gm.L(34.0f), gm.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
