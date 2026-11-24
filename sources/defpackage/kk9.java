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
public final class kk9 extends jd9 implements vlb, fkb {
    public boolean E;
    public kg9 F;
    public fhb G;
    public boolean H;
    public final LinkedHashSet I;
    public hk9 J;
    public final i82 K;
    public final ylb n;
    public final ne9 r;
    public final gh9 s;
    public final mk9 w;
    public final jk9 x;
    public final ArrayList y;

    public kk9(Context context, ylb ylbVar) {
        super(context);
        this.y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new i82(this, (byte) 4);
        this.n = ylbVar;
        setClipChildren(false);
        setClipToPadding(false);
        ne9 ne9Var = new ne9(context, ylbVar);
        this.r = ne9Var;
        ne9Var.setAllowNewlines(false);
        ne9Var.setInputType(147457);
        ne9Var.setGravity(49);
        ne9Var.setTextSize(1, Math.max(8, gda.S0 - 2));
        ne9Var.setIncludeFontPadding(false);
        ne9Var.setMinHeight(0);
        ne9Var.setBackground(null);
        ne9Var.setPadding(gm.L(2.0f), gm.L(4.0f), gm.L(2.0f), 0);
        ne9Var.setHint(jb6.M0(2131753954, null));
        ne9Var.setCenterEmptyHint(true);
        ne9Var.setListener(new cf9(this, (byte) 2));
        ne9Var.setDelegate(new yf9(this, (byte) 5));
        addView(ne9Var);
        gh9 gh9Var = new gh9(this, context, (byte) 1);
        this.s = gh9Var;
        gh9Var.setClipChildren(false);
        gh9Var.setClipToPadding(false);
        gh9Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        addView(gh9Var, qoe.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        mk9 mk9Var = new mk9(context, ylbVar);
        this.w = mk9Var;
        jk9 jk9Var = new jk9(this, context);
        this.x = jk9Var;
        jk9Var.addView(mk9Var);
        gh9Var.addView(jk9Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void B() {
        int i = 0;
        while (true) {
            mk9 mk9Var = this.w;
            if (i < mk9Var.getChildCount()) {
                View childAt = mk9Var.getChildAt(i);
                if (childAt instanceof nk9) {
                    nk9 nk9Var = (nk9) childAt;
                    ne9 ne9Var = nk9Var.a;
                    ne9Var.setListener(new ek9(this, nk9Var));
                    ne9Var.setDelegate(new xr8(this, nk9Var, (byte) 11));
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gkb gkbVar;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            kg9 kg9Var = this.F;
            if (kg9Var != null) {
                gkbVar = kg9Var.a.getTextSelectionHelper();
            } else {
                gkbVar = null;
            }
            if (gkbVar != null) {
                ArrayList arrayList = this.y;
                arrayList.clear();
                k(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    qkb qkbVar = (qkb) arrayList.get(i);
                    canvas.save();
                    canvas.translate(qkbVar.getX(), qkbVar.getY());
                    gkbVar.Y(canvas, this, i);
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
        fhb fhbVar = this.G;
        if (fhbVar == null || i <= 0 || i - 1 >= fhbVar.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.g.get(i2);
    }

    public mk9 getGrid() {
        return this.w;
    }

    public fhb getModel() {
        return this.G;
    }

    public ll0 getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public ne9 getTitleEditText() {
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
                        i = Math.max(i, fhb.n(pagetablecell) + this.G.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                fhb fhbVar = this.G;
                if (fhbVar.b != 0 && (i2 = fhbVar.c) != 0) {
                    if (i < 0) {
                        i3 = 0;
                    } else {
                        i3 = i;
                    }
                    if (i3 <= i2) {
                        i2 = i3;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[fhbVar.b];
                    ArrayList arrayList = fhbVar.g;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b = fhbVar.b(pagetablecell2);
                        int a = fhbVar.a(pagetablecell2);
                        int o = fhb.o(pagetablecell2);
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
                            for (int i9 = b; i9 < b + o && i9 < fhbVar.b; i9++) {
                                zArr[i9] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b, i6, o, i8});
                    }
                    int i10 = 1;
                    int i11 = 0;
                    while (true) {
                        i4 = fhbVar.b;
                        if (i11 >= i4) {
                            break;
                        }
                        if (zArr[i11]) {
                            i5 = i10;
                        } else {
                            i5 = i10;
                            identityHashMap.put(fhb.f(), new int[]{i11, i2, i5, i5});
                        }
                        i11++;
                        i10 = i5;
                    }
                    fhbVar.j(identityHashMap, i4);
                    fhbVar.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = fhbVar.a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(fhb.f());
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
                            arrayList4.add(fhb.f());
                        }
                    }
                    fhbVar.i();
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
        mk9 mk9Var = this.w;
        if (mk9Var != null) {
            mk9Var.invalidate();
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
                        i = Math.max(i, fhb.o(pagetablecell) + this.G.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                fhb fhbVar = this.G;
                int i5 = fhbVar.b;
                if (i5 != 0 && fhbVar.c != 0) {
                    if (i < 0) {
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                    if (i2 <= i5) {
                        i5 = i2;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[fhbVar.c];
                    ArrayList arrayList = fhbVar.g;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b = fhbVar.b(pagetablecell2);
                        int a = fhbVar.a(pagetablecell2);
                        int o = fhb.o(pagetablecell2);
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
                            for (int i8 = a; i8 < a + i7 && i8 < fhbVar.c; i8++) {
                                zArr[i8] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i4, a, o, i7});
                    }
                    int i9 = 1;
                    int i10 = 0;
                    while (i10 < fhbVar.c) {
                        if (zArr[i10]) {
                            i3 = i9;
                        } else {
                            i3 = i9;
                            identityHashMap.put(fhb.f(), new int[]{i5, i10, i3, i3});
                        }
                        i10++;
                        i9 = i3;
                    }
                    fhbVar.j(identityHashMap, fhbVar.b + i9);
                    fhbVar.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(fhbVar.c, 1);
                    for (int i11 = 0; i11 < max; i11++) {
                        pagetablerow.cells.add(fhb.f());
                    }
                    fhbVar.a.rows.add(pagetablerow);
                    fhbVar.i();
                }
                x();
                s(i, 0);
                v();
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        ne9 ne9Var;
        Layout layout;
        if (this.G != null) {
            ne9 ne9Var2 = this.r;
            Layout layout2 = ne9Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new fk9(this, layout2, ne9Var2.getPaddingLeft() + ne9Var2.getLeft(), ne9Var2.getPaddingTop() + ne9Var2.getTop()));
            }
            int size = this.G.g.size();
            for (int i = 0; i < size; i++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.g.get(i);
                mk9 mk9Var = this.w;
                nk9 m = mk9Var.m(pagetablecell);
                if (m != null && (layout = (ne9Var = m.a).getLayout()) != null) {
                    gh9 gh9Var = this.s;
                    int left = gh9Var.getLeft();
                    jk9 jk9Var = this.x;
                    int paddingLeft = ne9Var.getPaddingLeft() + ne9Var.getLeft() + m.getLeft() + ((mk9Var.getLeft() + (jk9Var.getLeft() + left)) - gh9Var.getScrollX());
                    int top = gh9Var.getTop();
                    arrayList.add(new gk9(layout, paddingLeft, ne9Var.getPaddingTop() + ne9Var.getTop() + m.getTop() + mk9Var.getTop() + jk9Var.getTop() + top, this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int m(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        fhb fhbVar = this.G;
        if (fhbVar == null || (indexOf = fhbVar.g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final ne9 n(int i) {
        nk9 m;
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
            gh9 gh9Var = this.s;
            int left = i - gh9Var.getLeft();
            jk9 jk9Var = this.x;
            mk9 mk9Var = this.w;
            int scrollX = gh9Var.getScrollX() + ((left - jk9Var.getLeft()) - mk9Var.getLeft());
            int top = ((i2 - gh9Var.getTop()) - jk9Var.getTop()) - mk9Var.getTop();
            for (int i3 = 0; i3 < mk9Var.getChildCount(); i3++) {
                View childAt = mk9Var.getChildAt(i3);
                if (childAt instanceof nk9) {
                    nk9 nk9Var = (nk9) childAt;
                    if (scrollX >= nk9Var.getLeft() && scrollX < nk9Var.getRight() && top >= nk9Var.getTop() && top < nk9Var.getBottom()) {
                        return nk9Var.b;
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
        int d = uue.d(this.a);
        if (!this.E) {
            d = i7;
            i7 = d;
        }
        ne9 ne9Var = this.r;
        int measuredHeight = ne9Var.getMeasuredHeight();
        ll0 ll0Var = this.a;
        int i8 = 0;
        if (ll0Var != null && (i5 = ll0Var.l) > 0) {
            i8 = gm.L(((i5 - 1) << 4) + 10);
        }
        int i9 = i6 - i7;
        int i10 = measuredHeight + i8;
        ne9Var.layout(gm.L(16.0f) + d, i8, b10.c(16.0f, i9, gm.L(16.0f) + d), i10);
        int L = gm.L(9.0f) + i10;
        gh9 gh9Var = this.s;
        gh9Var.layout(d, L, i9, gh9Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int i6 = 0;
        int max = Math.max(0, (size - this.c) - uue.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (gm.L(16.0f) << 1)), 1073741824);
        ne9 ne9Var = this.r;
        ne9Var.measure(makeMeasureSpec, 0);
        int measuredHeight = ne9Var.getMeasuredHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        gh9 gh9Var = this.s;
        gh9Var.measure(makeMeasureSpec2, 0);
        ll0 ll0Var = this.a;
        if (ll0Var == null || (i5 = ll0Var.l) <= 0) {
            i3 = 0;
        } else {
            i3 = gm.L(((i5 - 1) << 4) + 10);
        }
        ll0 ll0Var2 = this.a;
        if (ll0Var2 != null && (i4 = ll0Var2.m) > 0) {
            i6 = gm.L(((i4 - 1) << 4) + 10);
        }
        setMeasuredDimension(size, gh9Var.getMeasuredHeight() + gm.L(9.0f) + i6 + i3 + measuredHeight);
    }

    public final int p(int i, int i2) {
        int i3;
        int a;
        if (this.G != null) {
            gh9 gh9Var = this.s;
            int left = i - gh9Var.getLeft();
            jk9 jk9Var = this.x;
            mk9 mk9Var = this.w;
            int scrollX = gh9Var.getScrollX() + ((left - jk9Var.getLeft()) - mk9Var.getLeft());
            int top = ((i2 - gh9Var.getTop()) - jk9Var.getTop()) - mk9Var.getTop();
            fhb fhbVar = mk9Var.a;
            if (fhbVar != null && top >= (i3 = mk9Var.f[fhbVar.b])) {
                if (top < gm.L(4.0f) + gm.L(16.0f) + i3) {
                    int i4 = 1;
                    if (mk9Var.u()) {
                        int j = mk9Var.j();
                        int q = mk9Var.q();
                        if (j >= 0) {
                            int[] iArr = mk9Var.e;
                            if (scrollX >= iArr[j] && scrollX < iArr[q + 1]) {
                                return j;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a2 = mk9Var.a();
                    if (a2 != null && (a = mk9Var.a.a(a2)) >= 0) {
                        int i5 = a2.colspan;
                        if (i5 != 0) {
                            i4 = i5;
                        }
                        int[] iArr2 = mk9Var.e;
                        int i6 = iArr2[a];
                        int i7 = iArr2[Math.min(i4 + a, mk9Var.a.c)];
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

    public final nk9 q(ne9 ne9Var) {
        for (ViewParent parent = ne9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof nk9) {
                return (nk9) parent;
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
            gh9 gh9Var = this.s;
            int left = i - gh9Var.getLeft();
            jk9 jk9Var = this.x;
            mk9 mk9Var = this.w;
            int scrollX = gh9Var.getScrollX() + ((left - jk9Var.getLeft()) - mk9Var.getLeft());
            int top = ((i2 - gh9Var.getTop()) - jk9Var.getTop()) - mk9Var.getTop();
            if (mk9Var.a != null && scrollX >= (mk9Var.e[0] - gm.L(16.0f)) - gm.L(4.0f) && scrollX < mk9Var.e[0]) {
                int i3 = 1;
                if (mk9Var.v()) {
                    int k = mk9Var.k();
                    int r = mk9Var.r();
                    if (k >= 0) {
                        int[] iArr = mk9Var.f;
                        if (top >= iArr[k] && top < iArr[r + 1]) {
                            return k;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a = mk9Var.a();
                if (a != null && (b = mk9Var.a.b(a)) >= 0) {
                    int i4 = a.rowspan;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    int[] iArr2 = mk9Var.f;
                    int i5 = iArr2[b];
                    int i6 = iArr2[Math.min(i3 + b, mk9Var.a.b)];
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
        fhb fhbVar = this.G;
        if (fhbVar != null && (i3 = fhbVar.b) != 0 && fhbVar.c != 0) {
            TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i, i3 - 1))][Math.max(0, Math.min(i2, this.G.c - 1))];
            if (pagetablecell != null) {
                post(new ey8(this, pagetablecell, (byte) 27));
            }
        }
    }

    public void setCellSelectionListener(hk9 hk9Var) {
        this.J = hk9Var;
    }

    public void setLocked(boolean z) {
        this.r.setLocked(z);
        int i = 0;
        while (true) {
            mk9 mk9Var = this.w;
            if (i < mk9Var.getChildCount()) {
                View childAt = mk9Var.getChildAt(i);
                if (childAt instanceof nk9) {
                    ((nk9) childAt).setLocked(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        fhb fhbVar = this.G;
        if (fhbVar == null || fhbVar.g.isEmpty()) {
            return false;
        }
        nk9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(0));
        if (m == null) {
            return false;
        }
        ne9 ne9Var = m.a;
        ne9Var.O();
        ne9Var.setSelection(0);
        return true;
    }

    public final boolean u(nk9 nk9Var, boolean z) {
        int indexOf;
        int i;
        fhb fhbVar = this.G;
        if (fhbVar != null && (indexOf = fhbVar.g.indexOf(nk9Var.b)) >= 0) {
            if (z) {
                i = indexOf - 1;
            } else {
                i = indexOf + 1;
            }
            if (i >= 0 && i < this.G.g.size()) {
                nk9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(i));
                if (m != null) {
                    ne9 ne9Var = m.a;
                    ne9Var.O();
                    ne9Var.setSelection(ne9Var.length());
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
        mk9 mk9Var;
        ne9 ne9Var = this.r;
        ne9Var.updateColors();
        int i = cmb.F6;
        ylb ylbVar = this.n;
        int v0 = cmb.v0(i, ylbVar);
        ne9Var.setTextColor(v0);
        ne9Var.setHintTextColor(cmb.p1(0.35f, v0));
        int i2 = 0;
        while (true) {
            mk9Var = this.w;
            if (i2 >= mk9Var.getChildCount()) {
                break;
            }
            View childAt = mk9Var.getChildAt(i2);
            if (childAt instanceof nk9) {
                ((nk9) childAt).a.updateColors();
            }
            i2++;
        }
        mk9Var.b();
        try {
            if (getBackground() instanceof gf9) {
                ((gf9) getBackground()).a(cmb.v0(cmb.c6, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v() {
        z();
        hk9 hk9Var = this.J;
        if (hk9Var != null) {
            ch9 ch9Var = ((ag9) hk9Var).a;
            if (this == ch9Var.q4) {
                if (this.I.isEmpty()) {
                    ch9Var.I2();
                } else if (!ch9Var.J3) {
                    ch9Var.H4(this);
                }
            }
        }
    }

    public final void w() {
        ll0 ll0Var = this.a;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = zk9.f(this.r.getText());
            }
        }
    }

    public final void x() {
        mk9 mk9Var = this.w;
        mk9Var.s();
        mk9Var.requestLayout();
        mk9Var.invalidate();
        B();
        kg9 kg9Var = this.F;
        if (kg9Var != null && this.a != null) {
            kg9Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i;
        fhb fhbVar = this.G;
        if (fhbVar != null && pagetablecell != null) {
            int b = fhbVar.b(pagetablecell);
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
                            fhb fhbVar2 = this.G;
                            TL_iv.pageTableCell pagetablecell3 = fhbVar2.d[min][min2];
                            int i11 = fhbVar2.e[min][min2];
                            int i12 = fhbVar2.f[min][min2];
                            int min5 = Math.min(fhbVar2.b - 1, (fhb.o(pagetablecell3) + i11) - 1);
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
            L = gm.L(1.0f);
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
