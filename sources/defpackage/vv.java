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
public final class vv extends FrameLayout implements yib, zlb {
    public final xi5 a;
    public final ex b;
    public final uv c;
    public cw d;
    public final zib e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final tv w;

    public vv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.w = new tv(this, (byte) 0);
        this.a = xi5Var;
        this.b = exVar;
        uv uvVar = new uv(this, activity, xi5Var);
        this.c = uvVar;
        uvVar.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        uvVar.setClipToPadding(false);
        addView(uvVar, tre.c(-2.0f, -1));
        zib zibVar = new zib(activity, this, ((o) xi5Var).Q0);
        this.e = zibVar;
        zibVar.setOrientation(0);
        zibVar.setRowOrderPreserved(true);
        uvVar.addView(zibVar, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i;
        if (this.d == null) {
            i = 0;
        } else {
            i = 1;
        }
        zib zibVar = this.e;
        int childCount = zibVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            sib d = zibVar.d(i2);
            rib ribVar = d.b;
            if (ribVar != null) {
                ribVar.j((hl.L(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.h(d.c() + this.h);
                d.b.g(d.j + 10);
                d.r = i;
                i++;
            }
        }
    }

    @Override
    public final rib c(TL_iv.pageTableCell pagetablecell, int i) {
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
    public final void g(rib ribVar, int i) {
        if (ribVar instanceof cw) {
            xi5 xi5Var = this.a;
            if (!xi5Var.F.isEmpty() && xi5Var.G != null) {
                cw cwVar = (cw) ribVar;
                String lowerCase = cwVar.d.getText().toString().toLowerCase();
                int i2 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(xi5Var.G, i2);
                    if (indexOf >= 0) {
                        int length = xi5Var.G.length() + indexOf;
                        if (indexOf == 0 || hl.I1(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = cwVar.d;
                            this.b.E.put(xi5Var.G + this.s + cwVar.r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i));
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
        cw cwVar = this.d;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        zib zibVar = this.e;
        int childCount = zibVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            rib ribVar = zibVar.d(i).b;
            if (ribVar != null) {
                arrayList.add(ribVar);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.d;
        if (cwVar != null) {
            cwVar.i(this);
        }
        zib zibVar = this.e;
        int childCount = zibVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            rib ribVar = zibVar.d(i).b;
            if (ribVar != null) {
                ribVar.i(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.d;
        if (cwVar != null) {
            cwVar.f(this);
        }
        zib zibVar = this.e;
        int childCount = zibVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            rib ribVar = zibVar.d(i).b;
            if (ribVar != null) {
                ribVar.f(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        cw cwVar = this.d;
        xi5 xi5Var = this.a;
        if (cwVar != null) {
            canvas.save();
            canvas.translate(this.n, 0.0f);
            o.s(xi5Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, xi5Var, this.s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131754850, null));
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
        uv uvVar = this.c;
        uvVar.layout(i5, i6, uvVar.getMeasuredWidth() + i5, uvVar.getMeasuredHeight() + this.h);
        if (this.r) {
            ex exVar = this.b;
            if (exVar != null && exVar.H) {
                uvVar.setScrollX(hl.L(36.0f) + (this.e.getMeasuredWidth() - uvVar.getMeasuredWidth()));
            } else {
                uvVar.setScrollX(0);
            }
            this.r = false;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        vv vvVar;
        int i3;
        int L;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i5 = pageblocktable.level;
            xi5 xi5Var = this.a;
            if (i5 > 0) {
                int L2 = hl.L(i5 * 14);
                this.f = L2;
                L = ik8.C(xi5Var, 18.0f, L2);
                this.n = L;
            } else {
                this.f = 0;
                xi5Var.getClass();
                this.n = hl.L(18.0f);
                L = hl.L(36.0f);
            }
            int i6 = size - L;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            vvVar = this;
            cw n = o.n(this.a, vvVar, null, pageblocktable2.title, i6, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            vvVar.d = n;
            if (n != null) {
                i4 = hl.L(8.0f) + n.d.getHeight();
                vvVar.h = i4;
                cw cwVar = vvVar.d;
                cwVar.s = vvVar.n;
                cwVar.w = 0;
            } else {
                vvVar.h = hl.L(8.0f);
                i4 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - vvVar.f, 1073741824);
            uv uvVar = vvVar.c;
            uvVar.measure(makeMeasureSpec, 0);
            i3 = uh9.w(8.0f, uvVar.getMeasuredHeight(), i4);
            TL_iv.pageBlockTable pageblocktable3 = vvVar.s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i3 += hl.L(8.0f);
            }
        } else {
            vvVar = this;
            i3 = 1;
        }
        vvVar.setMeasuredDimension(size, i3);
        vvVar.a();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vv vvVar;
        MotionEvent motionEvent2;
        zib zibVar = this.e;
        int childCount = zibVar.getChildCount();
        int i = 0;
        while (i < childCount) {
            sib d = zibVar.d(i);
            rib ribVar = d.b;
            if (ribVar instanceof cw) {
                cw cwVar = (cw) ribVar;
                uv uvVar = this.c;
                vv vvVar2 = this;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                vvVar = vvVar2;
                if (o.i(this.a, this.b, motionEvent3, vvVar2, cwVar, d.b() + (uvVar.getPaddingLeft() - uvVar.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                vvVar = this;
                motionEvent2 = motionEvent;
            }
            i++;
            motionEvent = motionEvent2;
            this = vvVar;
        }
        vv vvVar3 = this;
        MotionEvent motionEvent4 = motionEvent;
        if (!o.i(vvVar3.a, vvVar3.b, motionEvent4, vvVar3, vvVar3.d, vvVar3.n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z;
        int i;
        this.s = pageblocktable;
        int i2 = aob.d6;
        ((o) this.a).getClass();
        hl.t3(this.c, aob.w0(null, i2, false));
        zib zibVar = this.e;
        zibVar.Q.clear();
        zibVar.L.clear();
        zibVar.h();
        zibVar.setDrawLines(this.s.bordered);
        zibVar.setStriped(this.s.striped);
        ex exVar = this.b;
        if (exVar != null && exVar.H) {
            z = true;
        } else {
            z = false;
        }
        zibVar.setRtl(z);
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
                    zibVar.b(pagetablecell, i6, i5, i8);
                } else {
                    zibVar.a(i6, i5, i8, i9);
                }
                i6 += i8;
            }
        }
        zibVar.setColumnCount(i);
        this.r = true;
        requestLayout();
    }
}
