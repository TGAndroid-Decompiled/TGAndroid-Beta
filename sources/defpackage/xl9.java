package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.tgnet.tl.TL_iv;
public final class xl9 extends ze9 implements snb, zlb {
    public boolean E;
    public xh9 F;
    public ajb G;
    public boolean H;
    public final LinkedHashSet I;
    public ul9 J;
    public final o72 K;
    public final vnb n;
    public final dg9 r;
    public final ti9 s;
    public final zl9 w;
    public final wl9 x;
    public final ArrayList y;

    public xl9(Context context, vnb vnbVar) {
        super(context);
        this.y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new o72(this, (byte) 4);
        this.n = vnbVar;
        setClipChildren(false);
        setClipToPadding(false);
        dg9 dg9Var = new dg9(context, vnbVar);
        this.r = dg9Var;
        dg9Var.setAllowNewlines(false);
        dg9Var.setInputType(147457);
        dg9Var.setGravity(49);
        dg9Var.setTextSize(1, Math.max(8, xea.S0 - 2));
        dg9Var.setIncludeFontPadding(false);
        dg9Var.setMinHeight(0);
        dg9Var.setBackground(null);
        dg9Var.setPadding(hl.L(2.0f), hl.L(4.0f), hl.L(2.0f), 0);
        dg9Var.setHint(ob6.M0(2131753982, null));
        dg9Var.setCenterEmptyHint(true);
        dg9Var.setListener(new i09(this, (byte) 7));
        dg9Var.setDelegate(new ye9(this, (byte) 8));
        addView(dg9Var);
        ti9 ti9Var = new ti9(this, context, (byte) 1);
        this.s = ti9Var;
        ti9Var.setClipChildren(false);
        ti9Var.setClipToPadding(false);
        ti9Var.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        addView(ti9Var, tre.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        zl9 zl9Var = new zl9(context, vnbVar);
        this.w = zl9Var;
        wl9 wl9Var = new wl9(this, context);
        this.x = wl9Var;
        wl9Var.addView(zl9Var);
        ti9Var.addView(wl9Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i = 0;
        while (true) {
            zl9 zl9Var = this.w;
            if (i < zl9Var.getChildCount()) {
                View childAt = zl9Var.getChildAt(i);
                if (childAt instanceof am9) {
                    am9 am9Var = (am9) childAt;
                    dg9 dg9Var = am9Var.a;
                    dg9Var.setListener(new rl9(this, am9Var));
                    dg9Var.setDelegate(new m88(this, am9Var, (byte) 25));
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        amb ambVar;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            xh9 xh9Var = this.F;
            if (xh9Var != null) {
                ambVar = xh9Var.a.getTextSelectionHelper();
            } else {
                ambVar = null;
            }
            if (ambVar != null) {
                ArrayList arrayList = this.y;
                arrayList.clear();
                k(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    kmb kmbVar = (kmb) arrayList.get(i);
                    canvas.save();
                    canvas.translate(kmbVar.getX(), kmbVar.getY());
                    ambVar.Y(canvas, this, i);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e(int i) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i) {
        int i2;
        ajb ajbVar = this.G;
        if (ajbVar == null || i <= 0 || i - 1 >= ajbVar.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.g.get(i2);
    }

    public zl9 getGrid() {
        return this.w;
    }

    public ajb getModel() {
        return this.G;
    }

    public mk0 getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public dg9 getTitleEditText() {
        return this.r;
    }

    public final void h(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (!linkedHashSet.isEmpty()) {
                if (z) {
                    Iterator it = linkedHashSet.iterator();
                    i = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i = Math.min(i, this.G.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i = Math.max(i, ajb.n(pagetablecell) + this.G.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                ajb ajbVar = this.G;
                if (ajbVar.b != 0 && (i2 = ajbVar.c) != 0) {
                    if (i < 0) {
                        i3 = 0;
                    } else {
                        i3 = i;
                    }
                    if (i3 <= i2) {
                        i2 = i3;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[ajbVar.b];
                    ArrayList arrayList = ajbVar.g;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b = ajbVar.b(pagetablecell2);
                        int a = ajbVar.a(pagetablecell2);
                        int o = ajb.o(pagetablecell2);
                        int i8 = pagetablecell2.colspan;
                        if (i8 == 0) {
                            i8 = 1;
                        }
                        if (a >= i2) {
                            i6 = a + 1;
                        } else {
                            i6 = a;
                        }
                        if (a < i2 && a + i8 > i2) {
                            i8++;
                            for (int i9 = b; i9 < b + o && i9 < ajbVar.b; i9++) {
                                zArr[i9] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b, i6, o, i8});
                    }
                    int i10 = 1;
                    int i11 = 0;
                    while (true) {
                        i4 = ajbVar.b;
                        if (i11 >= i4) {
                            break;
                        }
                        if (zArr[i11]) {
                            i5 = i10;
                        } else {
                            i5 = i10;
                            identityHashMap.put(ajb.f(), new int[]{i11, i2, i5, i5});
                        }
                        i11++;
                        i10 = i5;
                    }
                    ajbVar.j(identityHashMap, i4);
                    ajbVar.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = ajbVar.a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(ajb.f());
                        pageblocktable.rows.add(pagetablerow);
                    } else {
                        ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                        int size2 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            TL_iv.pageTableRow pagetablerow2 = arrayList3.get(i12);
                            i12++;
                            TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                            ArrayList<TL_iv.pageTableCell> arrayList4 = pagetablerow3.cells;
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList<>();
                                pagetablerow3.cells = arrayList4;
                            }
                            arrayList4.add(ajb.f());
                        }
                    }
                    ajbVar.i();
                }
                x();
                s(0, i);
                v();
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        zl9 zl9Var = this.w;
        if (zl9Var != null) {
            zl9Var.invalidate();
        }
    }

    public final void j(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (!linkedHashSet.isEmpty()) {
                if (z) {
                    Iterator it = linkedHashSet.iterator();
                    i = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i = Math.min(i, this.G.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i = Math.max(i, ajb.o(pagetablecell) + this.G.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                ajb ajbVar = this.G;
                int i5 = ajbVar.b;
                if (i5 != 0 && ajbVar.c != 0) {
                    if (i < 0) {
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                    if (i2 <= i5) {
                        i5 = i2;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[ajbVar.c];
                    ArrayList arrayList = ajbVar.g;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b = ajbVar.b(pagetablecell2);
                        int a = ajbVar.a(pagetablecell2);
                        int o = ajb.o(pagetablecell2);
                        int i7 = pagetablecell2.colspan;
                        if (i7 == 0) {
                            i7 = 1;
                        }
                        if (b >= i5) {
                            i4 = b + 1;
                        } else {
                            i4 = b;
                        }
                        if (b < i5 && b + o > i5) {
                            o++;
                            for (int i8 = a; i8 < a + i7 && i8 < ajbVar.c; i8++) {
                                zArr[i8] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i4, a, o, i7});
                    }
                    int i9 = 1;
                    int i10 = 0;
                    while (i10 < ajbVar.c) {
                        if (zArr[i10]) {
                            i3 = i9;
                        } else {
                            i3 = i9;
                            identityHashMap.put(ajb.f(), new int[]{i5, i10, i3, i3});
                        }
                        i10++;
                        i9 = i3;
                    }
                    ajbVar.j(identityHashMap, ajbVar.b + i9);
                    ajbVar.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(ajbVar.c, 1);
                    for (int i11 = 0; i11 < max; i11++) {
                        pagetablerow.cells.add(ajb.f());
                    }
                    ajbVar.a.rows.add(pagetablerow);
                    ajbVar.i();
                }
                x();
                s(i, 0);
                v();
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        dg9 dg9Var;
        Layout layout;
        if (this.G != null) {
            dg9 dg9Var2 = this.r;
            Layout layout2 = dg9Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new sl9(this, layout2, dg9Var2.getPaddingLeft() + dg9Var2.getLeft(), dg9Var2.getPaddingTop() + dg9Var2.getTop()));
            }
            int size = this.G.g.size();
            for (int i = 0; i < size; i++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.g.get(i);
                zl9 zl9Var = this.w;
                am9 m = zl9Var.m(pagetablecell);
                if (m != null && (layout = (dg9Var = m.a).getLayout()) != null) {
                    ti9 ti9Var = this.s;
                    int left = ti9Var.getLeft();
                    wl9 wl9Var = this.x;
                    int paddingLeft = dg9Var.getPaddingLeft() + dg9Var.getLeft() + m.getLeft() + ((zl9Var.getLeft() + (wl9Var.getLeft() + left)) - ti9Var.getScrollX());
                    int top = ti9Var.getTop();
                    arrayList.add(new tl9(layout, paddingLeft, dg9Var.getPaddingTop() + dg9Var.getTop() + m.getTop() + zl9Var.getTop() + wl9Var.getTop() + top, this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int m(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        ajb ajbVar = this.G;
        if (ajbVar == null || (indexOf = ajbVar.g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final dg9 n(int i) {
        am9 m;
        if (i == 0) {
            return this.r;
        }
        TL_iv.pageTableCell g = g(i);
        if (g == null || (m = this.w.m(g)) == null) {
            return null;
        }
        return m.a;
    }

    public final TL_iv.pageTableCell o(int i, int i2) {
        if (this.G != null) {
            ti9 ti9Var = this.s;
            int left = i - ti9Var.getLeft();
            wl9 wl9Var = this.x;
            zl9 zl9Var = this.w;
            int scrollX = ti9Var.getScrollX() + ((left - wl9Var.getLeft()) - zl9Var.getLeft());
            int top = ((i2 - ti9Var.getTop()) - wl9Var.getTop()) - zl9Var.getTop();
            for (int i3 = 0; i3 < zl9Var.getChildCount(); i3++) {
                View childAt = zl9Var.getChildAt(i3);
                if (childAt instanceof am9) {
                    am9 am9Var = (am9) childAt;
                    if (scrollX >= am9Var.getLeft() && scrollX < am9Var.getRight() && top >= am9Var.getTop() && top < am9Var.getBottom()) {
                        return am9Var.b;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.K);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.K);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = this.c;
        int d = nxe.d(this.a);
        if (!this.E) {
            d = i7;
            i7 = d;
        }
        dg9 dg9Var = this.r;
        int measuredHeight = dg9Var.getMeasuredHeight();
        mk0 mk0Var = this.a;
        int i8 = 0;
        if (mk0Var != null && (i5 = mk0Var.l) > 0) {
            i8 = hl.L(((i5 - 1) << 4) + 10);
        }
        int i9 = i6 - i7;
        int i10 = measuredHeight + i8;
        dg9Var.layout(hl.L(16.0f) + d, i8, c00.d(16.0f, i9, hl.L(16.0f) + d), i10);
        int L = hl.L(9.0f) + i10;
        ti9 ti9Var = this.s;
        ti9Var.layout(d, L, i9, ti9Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int i6 = 0;
        int max = Math.max(0, (size - this.c) - nxe.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (hl.L(16.0f) << 1)), 1073741824);
        dg9 dg9Var = this.r;
        dg9Var.measure(makeMeasureSpec, 0);
        int measuredHeight = dg9Var.getMeasuredHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        ti9 ti9Var = this.s;
        ti9Var.measure(makeMeasureSpec2, 0);
        mk0 mk0Var = this.a;
        if (mk0Var == null || (i5 = mk0Var.l) <= 0) {
            i3 = 0;
        } else {
            i3 = hl.L(((i5 - 1) << 4) + 10);
        }
        mk0 mk0Var2 = this.a;
        if (mk0Var2 != null && (i4 = mk0Var2.m) > 0) {
            i6 = hl.L(((i4 - 1) << 4) + 10);
        }
        setMeasuredDimension(size, ti9Var.getMeasuredHeight() + hl.L(9.0f) + i6 + i3 + measuredHeight);
    }

    public final int p(int i, int i2) {
        int i3;
        int a;
        if (this.G != null) {
            ti9 ti9Var = this.s;
            int left = i - ti9Var.getLeft();
            wl9 wl9Var = this.x;
            zl9 zl9Var = this.w;
            int scrollX = ti9Var.getScrollX() + ((left - wl9Var.getLeft()) - zl9Var.getLeft());
            int top = ((i2 - ti9Var.getTop()) - wl9Var.getTop()) - zl9Var.getTop();
            ajb ajbVar = zl9Var.a;
            if (ajbVar != null && top >= (i3 = zl9Var.f[ajbVar.b])) {
                if (top < hl.L(4.0f) + hl.L(16.0f) + i3) {
                    int i4 = 1;
                    if (zl9Var.u()) {
                        int j = zl9Var.j();
                        int q = zl9Var.q();
                        if (j >= 0) {
                            int[] iArr = zl9Var.e;
                            if (scrollX >= iArr[j] && scrollX < iArr[q + 1]) {
                                return j;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a2 = zl9Var.a();
                    if (a2 != null && (a = zl9Var.a.a(a2)) >= 0) {
                        int i5 = a2.colspan;
                        if (i5 != 0) {
                            i4 = i5;
                        }
                        int[] iArr2 = zl9Var.e;
                        int i6 = iArr2[a];
                        int i7 = iArr2[Math.min(i4 + a, zl9Var.a.c)];
                        if (scrollX >= i6 && scrollX < i7) {
                            return a;
                        }
                        return -1;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final am9 q(dg9 dg9Var) {
        for (ViewParent parent = dg9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof am9) {
                return (am9) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i, int i2) {
        int b;
        if (this.G != null) {
            ti9 ti9Var = this.s;
            int left = i - ti9Var.getLeft();
            wl9 wl9Var = this.x;
            zl9 zl9Var = this.w;
            int scrollX = ti9Var.getScrollX() + ((left - wl9Var.getLeft()) - zl9Var.getLeft());
            int top = ((i2 - ti9Var.getTop()) - wl9Var.getTop()) - zl9Var.getTop();
            if (zl9Var.a != null && scrollX >= (zl9Var.e[0] - hl.L(16.0f)) - hl.L(4.0f) && scrollX < zl9Var.e[0]) {
                int i3 = 1;
                if (zl9Var.v()) {
                    int k = zl9Var.k();
                    int r = zl9Var.r();
                    if (k >= 0) {
                        int[] iArr = zl9Var.f;
                        if (top >= iArr[k] && top < iArr[r + 1]) {
                            return k;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a = zl9Var.a();
                if (a != null && (b = zl9Var.a.b(a)) >= 0) {
                    int i4 = a.rowspan;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    int[] iArr2 = zl9Var.f;
                    int i5 = iArr2[b];
                    int i6 = iArr2[Math.min(i3 + b, zl9Var.a.b)];
                    if (top >= i5 && top < i6) {
                        return b;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final void s(int i, int i2) {
        int i3;
        ajb ajbVar = this.G;
        if (ajbVar != null && (i3 = ajbVar.b) != 0 && ajbVar.c != 0) {
            TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i, i3 - 1))][Math.max(0, Math.min(i2, this.G.c - 1))];
            if (pagetablecell != null) {
                post(new z09(this, pagetablecell, (byte) 24));
            }
        }
    }

    public void setCellSelectionListener(ul9 ul9Var) {
        this.J = ul9Var;
    }

    public void setLocked(boolean z) {
        this.r.setLocked(z);
        int i = 0;
        while (true) {
            zl9 zl9Var = this.w;
            if (i < zl9Var.getChildCount()) {
                View childAt = zl9Var.getChildAt(i);
                if (childAt instanceof am9) {
                    ((am9) childAt).setLocked(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        ajb ajbVar = this.G;
        if (ajbVar == null || ajbVar.g.isEmpty()) {
            return false;
        }
        am9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(0));
        if (m == null) {
            return false;
        }
        dg9 dg9Var = m.a;
        dg9Var.O();
        dg9Var.setSelection(0);
        return true;
    }

    public final boolean u(am9 am9Var, boolean z) {
        int indexOf;
        int i;
        ajb ajbVar = this.G;
        if (ajbVar != null && (indexOf = ajbVar.g.indexOf(am9Var.b)) >= 0) {
            if (z) {
                i = indexOf - 1;
            } else {
                i = indexOf + 1;
            }
            if (i >= 0 && i < this.G.g.size()) {
                am9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(i));
                if (m != null) {
                    dg9 dg9Var = m.a;
                    dg9Var.O();
                    dg9Var.setSelection(dg9Var.length());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void updateColors() {
        zl9 zl9Var;
        dg9 dg9Var = this.r;
        dg9Var.updateColors();
        int i = aob.G6;
        vnb vnbVar = this.n;
        int v0 = aob.v0(i, vnbVar);
        dg9Var.setTextColor(v0);
        dg9Var.setHintTextColor(aob.p1(0.35f, v0));
        int i2 = 0;
        while (true) {
            zl9Var = this.w;
            if (i2 >= zl9Var.getChildCount()) {
                break;
            }
            View childAt = zl9Var.getChildAt(i2);
            if (childAt instanceof am9) {
                ((am9) childAt).a.updateColors();
            }
            i2++;
        }
        zl9Var.b();
        try {
            if (getBackground() instanceof vg9) {
                ((vg9) getBackground()).a(aob.v0(aob.d6, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void v() {
        z();
        ul9 ul9Var = this.J;
        if (ul9Var != null) {
            pi9 pi9Var = ((oh9) ul9Var).a;
            if (this == pi9Var.q4) {
                if (this.I.isEmpty()) {
                    pi9Var.J2();
                } else if (!pi9Var.J3) {
                    pi9Var.I4(this);
                }
            }
        }
    }

    public final void w() {
        mk0 mk0Var = this.a;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = mm9.f(this.r.getText());
            }
        }
    }

    public final void x() {
        zl9 zl9Var = this.w;
        zl9Var.s();
        zl9Var.requestLayout();
        zl9Var.invalidate();
        A();
        xh9 xh9Var = this.F;
        if (xh9Var != null && this.a != null) {
            xh9Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i;
        ajb ajbVar = this.G;
        if (ajbVar != null && pagetablecell != null) {
            int b = ajbVar.b(pagetablecell);
            int a = this.G.a(pagetablecell);
            int b2 = this.G.b(pagetablecell2);
            int a2 = this.G.a(pagetablecell2);
            if (b >= 0 && a >= 0 && b2 >= 0 && a2 >= 0) {
                int min = Math.min(b, b2);
                int min2 = Math.min(a, a2);
                int i2 = this.G.b - 1;
                int i3 = pagetablecell.rowspan;
                if (i3 == 0) {
                    i3 = 1;
                }
                int i4 = (b + i3) - 1;
                int i5 = pagetablecell2.rowspan;
                if (i5 == 0) {
                    i5 = 1;
                }
                int min3 = Math.min(i2, Math.max(i4, (b2 + i5) - 1));
                int i6 = this.G.c - 1;
                int i7 = pagetablecell.colspan;
                if (i7 == 0) {
                    i7 = 1;
                }
                int i8 = (a + i7) - 1;
                int i9 = pagetablecell2.colspan;
                if (i9 == 0) {
                    i9 = 1;
                }
                int min4 = Math.min(i6, Math.max(i8, (a2 + i9) - 1));
                while (true) {
                    boolean z = false;
                    i = min;
                    while (min <= min3) {
                        int i10 = min2;
                        while (min2 <= min4) {
                            ajb ajbVar2 = this.G;
                            TL_iv.pageTableCell pagetablecell3 = ajbVar2.d[min][min2];
                            int i11 = ajbVar2.e[min][min2];
                            int i12 = ajbVar2.f[min][min2];
                            int min5 = Math.min(ajbVar2.b - 1, (ajb.o(pagetablecell3) + i11) - 1);
                            int i13 = this.G.c - 1;
                            int i14 = pagetablecell3.colspan;
                            if (i14 == 0) {
                                i14 = 1;
                            }
                            int min6 = Math.min(i13, (i14 + i12) - 1);
                            if (i11 < i) {
                                z = true;
                                i = i11;
                            }
                            if (i12 < i10) {
                                z = true;
                                i10 = i12;
                            }
                            if (min5 > min3) {
                                min3 = min5;
                                z = true;
                            }
                            if (min6 > min4) {
                                min4 = min6;
                                z = true;
                            }
                            min2++;
                        }
                        min++;
                        min2 = i10;
                    }
                    if (!z) {
                        break;
                    }
                    min = i;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i <= min3) {
                    for (int i15 = min2; i15 <= min4; i15++) {
                        linkedHashSet.add(this.G.d[i][i15]);
                    }
                    i++;
                }
                LinkedHashSet linkedHashSet2 = this.I;
                if (!linkedHashSet2.equals(linkedHashSet)) {
                    linkedHashSet2.clear();
                    linkedHashSet2.addAll(linkedHashSet);
                    this.w.invalidate();
                    v();
                }
            }
        }
    }

    public final void z() {
        float L;
        if (this.I.isEmpty() && !this.w.hasFocus()) {
            L = 0.0f;
        } else {
            L = hl.L(1.0f);
        }
        setTranslationZ(L);
        invalidate();
        this.s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
