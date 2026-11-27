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
public final class cz8 extends HorizontalScrollView {
    public m88 a;
    public kz8 b;
    public final oob c;
    public final Paint d;
    public int e;
    public float f;
    public final pz8 h;

    public cz8(pz8 pz8Var, Activity activity) {
        super(activity);
        this.h = pz8Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        oob oobVar = new oob((byte) 12, activity, this);
        this.c = oobVar;
        oobVar.setOrientation(0);
        oobVar.setGravity(16);
        oobVar.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        addView(oobVar, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i, boolean z) {
        if (i != this.e && i >= 0) {
            oob oobVar = this.c;
            if (i < oobVar.getChildCount()) {
                this.e = i;
                if (!z) {
                    this.f = Float.NaN;
                }
                View childAt = oobVar.getChildAt(i);
                int left = childAt.getLeft() - hl.L(30.0f);
                int L = hl.L(30.0f) + childAt.getRight();
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
                oobVar.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz8.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<az8> arrayList) {
        TLRPC.Document document;
        oob oobVar = this.c;
        oobVar.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            az8 az8Var = arrayList.get(i);
            Context context = getContext();
            byte b = az8Var.a;
            if (b == 2) {
                document = (TLRPC.Document) az8Var.c.get(0);
            } else {
                document = null;
            }
            bz8 bz8Var = new bz8(this.h, context, b, document);
            bz8Var.setOnClickListener(new w0(this, i, (byte) 20));
            bz8Var.setContentDescription(az8Var.b);
            oobVar.addView(bz8Var, new LinearLayout.LayoutParams(hl.L(34.0f), hl.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
