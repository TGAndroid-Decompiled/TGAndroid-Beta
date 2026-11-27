package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class nu extends FrameLayout implements zlb {
    public final gu a;
    public final ku b;
    public cw c;
    public cw d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final mu w;
    public final ex x;
    public final o y;

    public nu(o oVar, Activity activity, ex exVar) {
        super(activity);
        this.y = oVar;
        this.w = new mu(this);
        this.x = exVar;
        gu guVar = new gu((byte) 0, activity, this);
        this.a = guVar;
        guVar.i(new hu(this));
        iu iuVar = new iu(this);
        iuVar.O = new ju(this);
        guVar.setLayoutManager(iuVar);
        ku kuVar = new ku(this);
        this.b = kuVar;
        guVar.setAdapter(kuVar);
        addView(guVar, tre.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.s != null) {
            cw cwVar = this.c;
            o oVar = this.y;
            int i = 0;
            if (cwVar != null) {
                canvas.save();
                canvas.translate(this.f, this.h);
                o.s(oVar, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f, this.h + this.n);
                o.s(oVar, canvas, this, i);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131754891, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.e;
        int L = hl.L(8.0f);
        int i6 = this.e;
        gu guVar = this.a;
        guVar.layout(i5, L, guVar.getMeasuredWidth() + i6, hl.L(8.0f) + guVar.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        nu nuVar;
        int L;
        int i3;
        int i4 = 1;
        this.r = true;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockCollage pageblockcollage = this.s;
        if (pageblockcollage != null) {
            int i5 = pageblockcollage.level;
            if (i5 > 0) {
                int L2 = hl.L(18.0f) + hl.L(i5 * 14);
                this.e = L2;
                this.f = L2;
                i3 = ik8.B(18.0f, L2, size);
                L = i3;
            } else {
                this.e = 0;
                this.f = hl.L(18.0f);
                L = size - hl.L(36.0f);
                i3 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            gu guVar = this.a;
            guVar.measure(makeMeasureSpec, 0);
            int measuredHeight = guVar.getMeasuredHeight();
            int L3 = hl.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.y;
            nuVar = this;
            cw n = o.n(oVar, nuVar, null, richText, L, L3, pageblockcollage2, alignment, 0, this.x);
            nuVar.c = n;
            if (n != null) {
                int height = nuVar.c.d.getHeight() + hl.L(4.0f);
                nuVar.n = height;
                measuredHeight = uh9.w(4.0f, height, measuredHeight);
                cw cwVar = nuVar.c;
                cwVar.s = nuVar.f;
                cwVar.w = nuVar.h;
            } else {
                nuVar.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = nuVar.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (nuVar.x.H) {
                alignment = o0b.a();
            }
            cw n2 = o.n(oVar, nuVar, null, richText2, L, 0, pageblockcollage3, alignment, 0, nuVar.x);
            nuVar.d = n2;
            if (n2 != null) {
                measuredHeight += nuVar.d.d.getHeight() + hl.L(4.0f);
                cw cwVar2 = nuVar.d;
                cwVar2.s = nuVar.f;
                cwVar2.w = nuVar.h + nuVar.n;
            }
            int L4 = hl.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = nuVar.s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i4 = hl.L(8.0f) + L4;
            } else {
                i4 = L4;
            }
        } else {
            nuVar = this;
        }
        nuVar.setMeasuredDimension(size, i4);
        nuVar.r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cw cwVar = this.c;
        int i = this.f;
        int i2 = this.h;
        o oVar = this.y;
        if (!o.i(oVar, this.x, motionEvent, this, cwVar, i, i2)) {
            if (!o.i(oVar, this.x, motionEvent, this, this.d, this.f, this.h + this.n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
