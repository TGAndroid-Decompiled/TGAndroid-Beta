package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class uw extends FrameLayout implements dhb, fkb {
    public final ui5 a;
    public final ey b;
    public final tw c;
    public bx d;
    public final ehb e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final sw w;

    public uw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.w = new sw(this, (byte) 0);
        this.a = ui5Var;
        this.b = eyVar;
        tw twVar = new tw(this, activity, ui5Var);
        this.c = twVar;
        twVar.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        twVar.setClipToPadding(false);
        addView(twVar, qoe.c(-2.0f, -1));
        ehb ehbVar = new ehb(activity, this, ((o) ui5Var).Q0);
        this.e = ehbVar;
        ehbVar.setOrientation(0);
        ehbVar.setRowOrderPreserved(true);
        twVar.addView(ehbVar, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i;
        if (this.d == null) {
            i = 0;
        } else {
            i = 1;
        }
        ehb ehbVar = this.e;
        int childCount = ehbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xgb d = ehbVar.d(i2);
            wgb wgbVar = d.b;
            if (wgbVar != null) {
                wgbVar.j((gm.L(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.h(d.c() + this.h);
                d.b.g(d.j + 10);
                d.r = i;
                i++;
            }
        }
    }

    @Override
    public final wgb c(TL_iv.pageTableCell pagetablecell, int i) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        Layout.Alignment alignment2 = alignment;
        return o.n(this.a, this, null, pagetablecell.text, i, -1, this.s, alignment2, 0, this.b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.w);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void g(wgb wgbVar, int i) {
        if (wgbVar instanceof bx) {
            ui5 ui5Var = this.a;
            if (!ui5Var.F.isEmpty() && ui5Var.G != null) {
                bx bxVar = (bx) wgbVar;
                String lowerCase = bxVar.d.getText().toString().toLowerCase();
                int i2 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(ui5Var.G, i2);
                    if (indexOf >= 0) {
                        int length = ui5Var.G.length() + indexOf;
                        if (indexOf == 0 || gm.I1(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = bxVar.d;
                            this.b.E.put(ui5Var.G + this.s + bxVar.r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i));
                        }
                        i2 = length;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Paint getHalfLinePaint() {
        return o.v1;
    }

    @Override
    public Paint getHeaderPaint() {
        return o.w1;
    }

    @Override
    public Paint getLinePaint() {
        return o.u1;
    }

    @Override
    public Paint getStripPaint() {
        return o.x1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.d;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        ehb ehbVar = this.e;
        int childCount = ehbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            wgb wgbVar = ehbVar.d(i).b;
            if (wgbVar != null) {
                arrayList.add(wgbVar);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.d;
        if (bxVar != null) {
            bxVar.i(this);
        }
        ehb ehbVar = this.e;
        int childCount = ehbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            wgb wgbVar = ehbVar.d(i).b;
            if (wgbVar != null) {
                wgbVar.i(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.d;
        if (bxVar != null) {
            bxVar.f(this);
        }
        ehb ehbVar = this.e;
        int childCount = ehbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            wgb wgbVar = ehbVar.d(i).b;
            if (wgbVar != null) {
                wgbVar.f(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        bx bxVar = this.d;
        ui5 ui5Var = this.a;
        if (bxVar != null) {
            canvas.save();
            canvas.translate(this.n, 0.0f);
            o.s(ui5Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, ui5Var, this.s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(jb6.M0(2131754854, null));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.f;
        int i6 = this.h;
        tw twVar = this.c;
        twVar.layout(i5, i6, twVar.getMeasuredWidth() + i5, twVar.getMeasuredHeight() + this.h);
        if (this.r) {
            ey eyVar = this.b;
            if (eyVar != null && eyVar.H) {
                twVar.setScrollX(gm.L(36.0f) + (this.e.getMeasuredWidth() - twVar.getMeasuredWidth()));
            } else {
                twVar.setScrollX(0);
            }
            this.r = false;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        uw uwVar;
        int i3;
        int L;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i5 = pageblocktable.level;
            ui5 ui5Var = this.a;
            if (i5 > 0) {
                int L2 = gm.L(i5 * 14);
                this.f = L2;
                L = wi8.C(ui5Var, 18.0f, L2);
                this.n = L;
            } else {
                this.f = 0;
                ui5Var.getClass();
                this.n = gm.L(18.0f);
                L = gm.L(36.0f);
            }
            int i6 = size - L;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            uwVar = this;
            bx n = o.n(this.a, uwVar, null, pageblocktable2.title, i6, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            uwVar.d = n;
            if (n != null) {
                i4 = gm.L(8.0f) + n.d.getHeight();
                uwVar.h = i4;
                bx bxVar = uwVar.d;
                bxVar.s = uwVar.n;
                bxVar.w = 0;
            } else {
                uwVar.h = gm.L(8.0f);
                i4 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - uwVar.f, 1073741824);
            tw twVar = uwVar.c;
            twVar.measure(makeMeasureSpec, 0);
            i3 = hg9.v(8.0f, twVar.getMeasuredHeight(), i4);
            TL_iv.pageBlockTable pageblocktable3 = uwVar.s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i3 += gm.L(8.0f);
            }
        } else {
            uwVar = this;
            i3 = 1;
        }
        uwVar.setMeasuredDimension(size, i3);
        uwVar.a();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uw uwVar;
        MotionEvent motionEvent2;
        ehb ehbVar = this.e;
        int childCount = ehbVar.getChildCount();
        int i = 0;
        while (i < childCount) {
            xgb d = ehbVar.d(i);
            wgb wgbVar = d.b;
            if (wgbVar instanceof bx) {
                bx bxVar = (bx) wgbVar;
                tw twVar = this.c;
                uw uwVar2 = this;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                uwVar = uwVar2;
                if (o.i(this.a, this.b, motionEvent3, uwVar2, bxVar, d.b() + (twVar.getPaddingLeft() - twVar.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                uwVar = this;
                motionEvent2 = motionEvent;
            }
            i++;
            motionEvent = motionEvent2;
            this = uwVar;
        }
        uw uwVar3 = this;
        MotionEvent motionEvent4 = motionEvent;
        if (!o.i(uwVar3.a, uwVar3.b, motionEvent4, uwVar3, uwVar3.d, uwVar3.n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z;
        int i;
        this.s = pageblocktable;
        int i2 = cmb.c6;
        ((o) this.a).getClass();
        gm.t3(this.c, cmb.w0(null, i2, false));
        ehb ehbVar = this.e;
        ehbVar.Q.clear();
        ehbVar.L.clear();
        ehbVar.h();
        ehbVar.setDrawLines(this.s.bordered);
        ehbVar.setStriped(this.s.striped);
        ey eyVar = this.b;
        if (eyVar != null && eyVar.H) {
            z = true;
        } else {
            z = false;
        }
        ehbVar.setRtl(z);
        if (!this.s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.s.rows.get(0);
            int size = pagetablerow.cells.size();
            i = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = pagetablerow.cells.get(i3).colspan;
                if (i4 == 0) {
                    i4 = 1;
                }
                i += i4;
            }
        } else {
            i = 0;
        }
        int size2 = this.s.rows.size();
        for (int i5 = 0; i5 < size2; i5++) {
            TL_iv.pageTableRow pagetablerow2 = this.s.rows.get(i5);
            int size3 = pagetablerow2.cells.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size3; i7++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i7);
                int i8 = pagetablecell.colspan;
                if (i8 == 0) {
                    i8 = 1;
                }
                int i9 = pagetablecell.rowspan;
                if (i9 == 0) {
                    i9 = 1;
                }
                if (pagetablecell.text != null) {
                    ehbVar.b(pagetablecell, i6, i5, i8);
                } else {
                    ehbVar.a(i6, i5, i8, i9);
                }
                i6 += i8;
            }
        }
        ehbVar.setColumnCount(i);
        this.r = true;
        requestLayout();
    }
}
