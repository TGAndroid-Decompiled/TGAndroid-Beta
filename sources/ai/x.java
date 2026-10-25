package ai;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xa1;
public final class x extends HorizontalScrollView {
    public f0 f1966a;
    public p0 f1967b;
    public final xa1 f1968c;
    public final Paint d;
    public int e;
    public float f1969f;
    public final x0 h;

    public x(x0 x0Var, Context context) {
        super(context);
        this.h = x0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f1969f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        xa1 xa1Var = new xa1(this, context, 1);
        this.f1968c = xa1Var;
        xa1Var.setOrientation(0);
        xa1Var.setGravity(16);
        xa1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(xa1Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 != this.e && i10 >= 0) {
            xa1 xa1Var = this.f1968c;
            if (i10 < xa1Var.getChildCount()) {
                this.e = i10;
                if (!z10) {
                    this.f1969f = Float.NaN;
                }
                View childAt = xa1Var.getChildAt(i10);
                int left = childAt.getLeft() - AndroidUtilities.dp(30.0f);
                int dp = AndroidUtilities.dp(30.0f) + childAt.getRight();
                if (left < getScrollX()) {
                    if (z10) {
                        smoothScrollTo(left, 0);
                    } else {
                        scrollTo(left, 0);
                    }
                } else {
                    if (dp > getWidth() + getScrollX()) {
                        if (z10) {
                            smoothScrollTo(dp - getWidth(), 0);
                        } else {
                            scrollTo(dp - getWidth(), 0);
                        }
                    }
                }
                xa1Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.x.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<u> arrayList) {
        TLRPC.Document document;
        xa1 xa1Var = this.f1968c;
        xa1Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u uVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = uVar.f1939a;
            if (i11 == 2) {
                document = (TLRPC.Document) uVar.f1941c.get(0);
            } else {
                document = null;
            }
            v vVar = new v(this.h, context, i11, document);
            vVar.setOnClickListener(new w(this, i10, 0));
            vVar.setContentDescription(uVar.f1940b);
            xa1Var.addView(vVar, new LinearLayout.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(30.0f)));
        }
        this.e = -1;
        this.f1969f = Float.NaN;
    }
}
