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
public final class ii9 extends jb9 implements tjb, eib {
    public boolean E;
    public ge9 F;
    public ffb G;
    public boolean H;
    public final LinkedHashSet I;
    public fi9 J;
    public final x62 K;
    public final wjb n;
    public final mc9 r;
    public final cf9 s;
    public final ki9 w;
    public final hi9 x;
    public final ArrayList y;

    public ii9(Context context, wjb wjbVar) {
        super(context);
        this.y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new x62(this, (byte) 4);
        this.n = wjbVar;
        setClipChildren(false);
        setClipToPadding(false);
        mc9 mc9Var = new mc9(context, wjbVar);
        this.r = mc9Var;
        mc9Var.setAllowNewlines(false);
        mc9Var.setInputType(147457);
        mc9Var.setGravity(49);
        mc9Var.setTextSize(1, Math.max(8, gba.T0 - 2));
        mc9Var.setIncludeFontPadding(false);
        mc9Var.setMinHeight(0);
        mc9Var.setBackground(null);
        mc9Var.setPadding(gl.L(2.0f), gl.L(4.0f), gl.L(2.0f), 0);
        mc9Var.setHint(k96.M0(2131753986, null));
        mc9Var.setCenterEmptyHint(true);
        mc9Var.setListener(new ln8(this, (byte) 9));
        mc9Var.setDelegate(new wh9(this, (byte) 1));
        addView(mc9Var);
        cf9 cf9Var = new cf9(this, context, (byte) 1);
        this.s = cf9Var;
        cf9Var.setClipChildren(false);
        cf9Var.setClipToPadding(false);
        cf9Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        addView(cf9Var, nme.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        ki9 ki9Var = new ki9(context, wjbVar);
        this.w = ki9Var;
        hi9 hi9Var = new hi9(this, context);
        this.x = hi9Var;
        hi9Var.addView(ki9Var);
        cf9Var.addView(hi9Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i = 0;
        while (true) {
            ki9 ki9Var = this.w;
            if (i < ki9Var.getChildCount()) {
                View childAt = ki9Var.getChildAt(i);
                if (childAt instanceof li9) {
                    li9 li9Var = (li9) childAt;
                    mc9 mc9Var = li9Var.a;
                    mc9Var.setListener(new ci9(this, li9Var));
                    mc9Var.setDelegate(new kq8(this, li9Var, (byte) 10));
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fib fibVar;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            ge9 ge9Var = this.F;
            if (ge9Var != null) {
                fibVar = ge9Var.a.getTextSelectionHelper();
            } else {
                fibVar = null;
            }
            if (fibVar != null) {
                ArrayList arrayList = this.y;
                arrayList.clear();
                k(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    pib pibVar = (pib) arrayList.get(i);
                    canvas.save();
                    canvas.translate(pibVar.getX(), pibVar.getY());
                    fibVar.Y(canvas, this, i);
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
        ffb ffbVar = this.G;
        if (ffbVar == null || i <= 0 || i - 1 >= ffbVar.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.g.get(i2);
    }

    public ki9 getGrid() {
        return this.w;
    }

    public ffb getModel() {
        return this.G;
    }

    public lk0 getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public mc9 getTitleEditText() {
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
                        i = Math.max(i, ffb.n(pagetablecell) + this.G.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                ffb ffbVar = this.G;
                if (ffbVar.b != 0 && (i2 = ffbVar.c) != 0) {
                    if (i < 0) {
                        i3 = 0;
                    } else {
                        i3 = i;
                    }
                    if (i3 <= i2) {
                        i2 = i3;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[ffbVar.b];
                    ArrayList arrayList = ffbVar.g;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b = ffbVar.b(pagetablecell2);
                        int a = ffbVar.a(pagetablecell2);
                        int o = ffb.o(pagetablecell2);
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
                            for (int i9 = b; i9 < b + o && i9 < ffbVar.b; i9++) {
                                zArr[i9] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b, i6, o, i8});
                    }
                    int i10 = 1;
                    int i11 = 0;
                    while (true) {
                        i4 = ffbVar.b;
                        if (i11 >= i4) {
                            break;
                        }
                        if (zArr[i11]) {
                            i5 = i10;
                        } else {
                            i5 = i10;
                            identityHashMap.put(ffb.f(), new int[]{i11, i2, i5, i5});
                        }
                        i11++;
                        i10 = i5;
                    }
                    ffbVar.j(identityHashMap, i4);
                    ffbVar.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = ffbVar.a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(ffb.f());
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
                            arrayList4.add(ffb.f());
                        }
                    }
                    ffbVar.i();
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
        ki9 ki9Var = this.w;
        if (ki9Var != null) {
            ki9Var.invalidate();
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
                        i = Math.max(i, ffb.o(pagetablecell) + this.G.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                ffb ffbVar = this.G;
                int i5 = ffbVar.b;
                if (i5 != 0 && ffbVar.c != 0) {
                    if (i < 0) {
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                    if (i2 <= i5) {
                        i5 = i2;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[ffbVar.c];
                    ArrayList arrayList = ffbVar.g;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b = ffbVar.b(pagetablecell2);
                        int a = ffbVar.a(pagetablecell2);
                        int o = ffb.o(pagetablecell2);
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
                            for (int i8 = a; i8 < a + i7 && i8 < ffbVar.c; i8++) {
                                zArr[i8] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i4, a, o, i7});
                    }
                    int i9 = 1;
                    int i10 = 0;
                    while (i10 < ffbVar.c) {
                        if (zArr[i10]) {
                            i3 = i9;
                        } else {
                            i3 = i9;
                            identityHashMap.put(ffb.f(), new int[]{i5, i10, i3, i3});
                        }
                        i10++;
                        i9 = i3;
                    }
                    ffbVar.j(identityHashMap, ffbVar.b + i9);
                    ffbVar.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(ffbVar.c, 1);
                    for (int i11 = 0; i11 < max; i11++) {
                        pagetablerow.cells.add(ffb.f());
                    }
                    ffbVar.a.rows.add(pagetablerow);
                    ffbVar.i();
                }
                x();
                s(i, 0);
                v();
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        mc9 mc9Var;
        Layout layout;
        if (this.G != null) {
            mc9 mc9Var2 = this.r;
            Layout layout2 = mc9Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new di9(this, layout2, mc9Var2.getPaddingLeft() + mc9Var2.getLeft(), mc9Var2.getPaddingTop() + mc9Var2.getTop()));
            }
            int size = this.G.g.size();
            for (int i = 0; i < size; i++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.g.get(i);
                ki9 ki9Var = this.w;
                li9 m = ki9Var.m(pagetablecell);
                if (m != null && (layout = (mc9Var = m.a).getLayout()) != null) {
                    cf9 cf9Var = this.s;
                    int left = cf9Var.getLeft();
                    hi9 hi9Var = this.x;
                    int paddingLeft = mc9Var.getPaddingLeft() + mc9Var.getLeft() + m.getLeft() + ((ki9Var.getLeft() + (hi9Var.getLeft() + left)) - cf9Var.getScrollX());
                    int top = cf9Var.getTop();
                    arrayList.add(new ei9(layout, paddingLeft, mc9Var.getPaddingTop() + mc9Var.getTop() + m.getTop() + ki9Var.getTop() + hi9Var.getTop() + top, this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int m(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        ffb ffbVar = this.G;
        if (ffbVar == null || (indexOf = ffbVar.g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final mc9 n(int i) {
        li9 m;
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
            cf9 cf9Var = this.s;
            int left = i - cf9Var.getLeft();
            hi9 hi9Var = this.x;
            ki9 ki9Var = this.w;
            int scrollX = cf9Var.getScrollX() + ((left - hi9Var.getLeft()) - ki9Var.getLeft());
            int top = ((i2 - cf9Var.getTop()) - hi9Var.getTop()) - ki9Var.getTop();
            for (int i3 = 0; i3 < ki9Var.getChildCount(); i3++) {
                View childAt = ki9Var.getChildAt(i3);
                if (childAt instanceof li9) {
                    li9 li9Var = (li9) childAt;
                    if (scrollX >= li9Var.getLeft() && scrollX < li9Var.getRight() && top >= li9Var.getTop() && top < li9Var.getBottom()) {
                        return li9Var.b;
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
        int d = rse.d(this.a);
        if (!this.E) {
            d = i7;
            i7 = d;
        }
        mc9 mc9Var = this.r;
        int measuredHeight = mc9Var.getMeasuredHeight();
        lk0 lk0Var = this.a;
        int i8 = 0;
        if (lk0Var != null && (i5 = lk0Var.l) > 0) {
            i8 = gl.L(((i5 - 1) << 4) + 10);
        }
        int i9 = i6 - i7;
        int i10 = measuredHeight + i8;
        mc9Var.layout(gl.L(16.0f) + d, i8, b00.c(16.0f, i9, gl.L(16.0f) + d), i10);
        int L = gl.L(9.0f) + i10;
        cf9 cf9Var = this.s;
        cf9Var.layout(d, L, i9, cf9Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int i6 = 0;
        int max = Math.max(0, (size - this.c) - rse.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (gl.L(16.0f) << 1)), 1073741824);
        mc9 mc9Var = this.r;
        mc9Var.measure(makeMeasureSpec, 0);
        int measuredHeight = mc9Var.getMeasuredHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        cf9 cf9Var = this.s;
        cf9Var.measure(makeMeasureSpec2, 0);
        lk0 lk0Var = this.a;
        if (lk0Var == null || (i5 = lk0Var.l) <= 0) {
            i3 = 0;
        } else {
            i3 = gl.L(((i5 - 1) << 4) + 10);
        }
        lk0 lk0Var2 = this.a;
        if (lk0Var2 != null && (i4 = lk0Var2.m) > 0) {
            i6 = gl.L(((i4 - 1) << 4) + 10);
        }
        setMeasuredDimension(size, cf9Var.getMeasuredHeight() + gl.L(9.0f) + i6 + i3 + measuredHeight);
    }

    public final int p(int i, int i2) {
        int i3;
        int a;
        if (this.G != null) {
            cf9 cf9Var = this.s;
            int left = i - cf9Var.getLeft();
            hi9 hi9Var = this.x;
            ki9 ki9Var = this.w;
            int scrollX = cf9Var.getScrollX() + ((left - hi9Var.getLeft()) - ki9Var.getLeft());
            int top = ((i2 - cf9Var.getTop()) - hi9Var.getTop()) - ki9Var.getTop();
            ffb ffbVar = ki9Var.a;
            if (ffbVar != null && top >= (i3 = ki9Var.f[ffbVar.b])) {
                if (top < gl.L(4.0f) + gl.L(16.0f) + i3) {
                    int i4 = 1;
                    if (ki9Var.u()) {
                        int j = ki9Var.j();
                        int q = ki9Var.q();
                        if (j >= 0) {
                            int[] iArr = ki9Var.e;
                            if (scrollX >= iArr[j] && scrollX < iArr[q + 1]) {
                                return j;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a2 = ki9Var.a();
                    if (a2 != null && (a = ki9Var.a.a(a2)) >= 0) {
                        int i5 = a2.colspan;
                        if (i5 != 0) {
                            i4 = i5;
                        }
                        int[] iArr2 = ki9Var.e;
                        int i6 = iArr2[a];
                        int i7 = iArr2[Math.min(i4 + a, ki9Var.a.c)];
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

    public final li9 q(mc9 mc9Var) {
        for (ViewParent parent = mc9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof li9) {
                return (li9) parent;
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
            cf9 cf9Var = this.s;
            int left = i - cf9Var.getLeft();
            hi9 hi9Var = this.x;
            ki9 ki9Var = this.w;
            int scrollX = cf9Var.getScrollX() + ((left - hi9Var.getLeft()) - ki9Var.getLeft());
            int top = ((i2 - cf9Var.getTop()) - hi9Var.getTop()) - ki9Var.getTop();
            if (ki9Var.a != null && scrollX >= (ki9Var.e[0] - gl.L(16.0f)) - gl.L(4.0f) && scrollX < ki9Var.e[0]) {
                int i3 = 1;
                if (ki9Var.v()) {
                    int k = ki9Var.k();
                    int r = ki9Var.r();
                    if (k >= 0) {
                        int[] iArr = ki9Var.f;
                        if (top >= iArr[k] && top < iArr[r + 1]) {
                            return k;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a = ki9Var.a();
                if (a != null && (b = ki9Var.a.b(a)) >= 0) {
                    int i4 = a.rowspan;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    int[] iArr2 = ki9Var.f;
                    int i5 = iArr2[b];
                    int i6 = iArr2[Math.min(i3 + b, ki9Var.a.b)];
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
        ffb ffbVar = this.G;
        if (ffbVar != null && (i3 = ffbVar.b) != 0 && ffbVar.c != 0) {
            TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i, i3 - 1))][Math.max(0, Math.min(i2, this.G.c - 1))];
            if (pagetablecell != null) {
                post(new lw8(this, pagetablecell, (byte) 25));
            }
        }
    }

    public void setCellSelectionListener(fi9 fi9Var) {
        this.J = fi9Var;
    }

    public void setLocked(boolean z) {
        this.r.setLocked(z);
        int i = 0;
        while (true) {
            ki9 ki9Var = this.w;
            if (i < ki9Var.getChildCount()) {
                View childAt = ki9Var.getChildAt(i);
                if (childAt instanceof li9) {
                    ((li9) childAt).setLocked(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        ffb ffbVar = this.G;
        if (ffbVar == null || ffbVar.g.isEmpty()) {
            return false;
        }
        li9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(0));
        if (m == null) {
            return false;
        }
        mc9 mc9Var = m.a;
        mc9Var.O();
        mc9Var.setSelection(0);
        return true;
    }

    public final boolean u(li9 li9Var, boolean z) {
        int indexOf;
        int i;
        ffb ffbVar = this.G;
        if (ffbVar != null && (indexOf = ffbVar.g.indexOf(li9Var.b)) >= 0) {
            if (z) {
                i = indexOf - 1;
            } else {
                i = indexOf + 1;
            }
            if (i >= 0 && i < this.G.g.size()) {
                li9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(i));
                if (m != null) {
                    mc9 mc9Var = m.a;
                    mc9Var.O();
                    mc9Var.setSelection(mc9Var.length());
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
        ki9 ki9Var;
        mc9 mc9Var = this.r;
        mc9Var.updateColors();
        int i = bkb.F6;
        wjb wjbVar = this.n;
        int v0 = bkb.v0(i, wjbVar);
        mc9Var.setTextColor(v0);
        mc9Var.setHintTextColor(bkb.p1(0.35f, v0));
        int i2 = 0;
        while (true) {
            ki9Var = this.w;
            if (i2 >= ki9Var.getChildCount()) {
                break;
            }
            View childAt = ki9Var.getChildAt(i2);
            if (childAt instanceof li9) {
                ((li9) childAt).a.updateColors();
            }
            i2++;
        }
        ki9Var.b();
        try {
            if (getBackground() instanceof ed9) {
                ((ed9) getBackground()).a(bkb.v0(bkb.c6, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void v() {
        z();
        fi9 fi9Var = this.J;
        if (fi9Var != null) {
            ye9 ye9Var = ((wd9) fi9Var).a;
            if (this == ye9Var.q4) {
                if (this.I.isEmpty()) {
                    ye9Var.I2();
                } else if (!ye9Var.J3) {
                    ye9Var.H4(this);
                }
            }
        }
    }

    public final void w() {
        lk0 lk0Var = this.a;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = yi9.f(this.r.getText());
            }
        }
    }

    public final void x() {
        ki9 ki9Var = this.w;
        ki9Var.s();
        ki9Var.requestLayout();
        ki9Var.invalidate();
        A();
        ge9 ge9Var = this.F;
        if (ge9Var != null && this.a != null) {
            ge9Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i;
        ffb ffbVar = this.G;
        if (ffbVar != null && pagetablecell != null) {
            int b = ffbVar.b(pagetablecell);
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
                            ffb ffbVar2 = this.G;
                            TL_iv.pageTableCell pagetablecell3 = ffbVar2.d[min][min2];
                            int i11 = ffbVar2.e[min][min2];
                            int i12 = ffbVar2.f[min][min2];
                            int min5 = Math.min(ffbVar2.b - 1, (ffb.o(pagetablecell3) + i11) - 1);
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
            L = gl.L(1.0f);
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
