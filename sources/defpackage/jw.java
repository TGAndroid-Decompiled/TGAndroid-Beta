package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class jw extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f;

    public jw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.d = gm.L(18.0f);
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override
    public int getBoundLeft() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.h(this.a, 18.0f, bxVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.C(this.a, 18.0f, bxVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.C(this.a, 18.0f, bxVar.m() + i);
    }

    public int getMinWidth() {
        return wi8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f != null && this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(this.a, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754856, o.g(this.a, this.b, bxVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        jw jwVar;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            ey eyVar = this.b;
            jwVar = this;
            bx n = o.n(this.a, jwVar, null, pageblockrelatedarticles.title, size - gm.L(52.0f), 0, pageblockrelatedarticles2, alignment, 1, eyVar);
            jwVar.c = n;
            if (n != null) {
                jwVar.e = ((gm.L(32.0f) - jwVar.c.d.getHeight()) / 2) + gm.L(6.0f);
            }
        } else {
            jwVar = this;
        }
        if (jwVar.c != null) {
            jwVar.setMeasuredDimension(size, gm.L(38.0f));
            bx bxVar = jwVar.c;
            bxVar.s = jwVar.d;
            bxVar.w = jwVar.e;
            return;
        }
        jwVar.setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f = pageblockrelatedarticles;
        requestLayout();
    }
}
