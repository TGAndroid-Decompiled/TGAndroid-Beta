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
public final class rv8 extends HorizontalScrollView {
    public kq8 a;
    public zv8 b;
    public final pkb c;
    public final Paint d;
    public int e;
    public float f;
    public final ew8 h;

    public rv8(ew8 ew8Var, Activity activity) {
        super(activity);
        this.h = ew8Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        pkb pkbVar = new pkb((byte) 12, activity, this);
        this.c = pkbVar;
        pkbVar.setOrientation(0);
        pkbVar.setGravity(16);
        pkbVar.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        addView(pkbVar, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i, boolean z) {
        if (i != this.e && i >= 0) {
            pkb pkbVar = this.c;
            if (i < pkbVar.getChildCount()) {
                this.e = i;
                if (!z) {
                    this.f = Float.NaN;
                }
                View childAt = pkbVar.getChildAt(i);
                int left = childAt.getLeft() - gl.L(30.0f);
                int L = gl.L(30.0f) + childAt.getRight();
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
                pkbVar.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv8.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<pv8> arrayList) {
        TLRPC.Document document;
        pkb pkbVar = this.c;
        pkbVar.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            pv8 pv8Var = arrayList.get(i);
            Context context = getContext();
            byte b = pv8Var.a;
            if (b == 2) {
                document = (TLRPC.Document) pv8Var.c.get(0);
            } else {
                document = null;
            }
            qv8 qv8Var = new qv8(this.h, context, b, document);
            qv8Var.setOnClickListener(new v0(this, i, (byte) 19));
            qv8Var.setContentDescription(pv8Var.b);
            pkbVar.addView(qv8Var, new LinearLayout.LayoutParams(gl.L(34.0f), gl.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
