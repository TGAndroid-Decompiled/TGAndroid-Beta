package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c8.ca;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
public final class k5 extends x implements org.telegram.ui.ActionBar.z5, g9 {
    public boolean E;
    public y2 F;
    public c6 G;
    public boolean H;
    public final LinkedHashSet I;
    public h5 J;
    public final h K;
    public final e6 f21775n;
    public final e1 f21776r;
    public final u3 f21777s;
    public final m5 f21778w;
    public final j5 f21779x;
    public final ArrayList f21780y;

    public k5(Context context, e6 e6Var) {
        super(context);
        this.f21780y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new h(this, 3);
        this.f21775n = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        e1 e1Var = new e1(context, e6Var);
        this.f21776r = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(49);
        e1Var.setTextSize(1, Math.max(8, gz.W0 - 2));
        e1Var.setIncludeFontPadding(false);
        e1Var.setMinHeight(0);
        e1Var.setBackground(null);
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        e1Var.setHint(hd.M0(2131753989, null));
        e1Var.setCenterEmptyHint(true);
        e1Var.setListener(new ia.d(this, 19));
        e1Var.setDelegate(new ki.e(this, 24));
        addView(e1Var);
        u3 u3Var = new u3(this, context, 1);
        this.f21777s = u3Var;
        u3Var.setClipChildren(false);
        u3Var.setClipToPadding(false);
        u3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(u3Var, ja.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        m5 m5Var = new m5(context, e6Var);
        this.f21778w = m5Var;
        j5 j5Var = new j5(this, context);
        this.f21779x = j5Var;
        j5Var.addView(m5Var);
        u3Var.addView(j5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i7 = 0;
        while (true) {
            m5 m5Var = this.f21778w;
            if (i7 < m5Var.getChildCount()) {
                View childAt = m5Var.getChildAt(i7);
                if (childAt instanceof n5) {
                    n5 n5Var = (n5) childAt;
                    e1 e1Var = n5Var.f21845a;
                    e1Var.setListener(new e5(this, n5Var));
                    e1Var.setDelegate(new m2.d(4, this, n5Var));
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.f28849d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h9 h9Var;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            y2 y2Var = this.F;
            if (y2Var != null) {
                h9Var = y2Var.f22138a.getTextSelectionHelper();
            } else {
                h9Var = null;
            }
            if (h9Var != null) {
                ArrayList arrayList = this.f21780y;
                arrayList.clear();
                k(arrayList);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    s9 s9Var = (s9) arrayList.get(i7);
                    canvas.save();
                    canvas.translate(s9Var.getX(), s9Var.getY());
                    h9Var.Z(canvas, this, i7);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e(int i7) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i7) {
        int i10;
        c6 c6Var = this.G;
        if (c6Var == null || i7 <= 0 || i7 - 1 >= c6Var.f21623g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.f21623g.get(i10);
    }

    public m5 getGrid() {
        return this.f21778w;
    }

    public c6 getModel() {
        return this.G;
    }

    public a getRow() {
        return this.f22106a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public e1 getTitleEditText() {
        return this.f21776r;
    }

    public final void h(boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i7 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i7 = Math.min(i7, this.G.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i7 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i7 = Math.max(i7, c6.n(pagetablecell) + this.G.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                c6 c6Var = this.G;
                if (c6Var.f21619b != 0 && (i10 = c6Var.f21620c) != 0) {
                    if (i7 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i7;
                    }
                    if (i11 <= i10) {
                        i10 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[c6Var.f21619b];
                    ArrayList arrayList = c6Var.f21623g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = c6Var.b(pagetablecell2);
                        int a10 = c6Var.a(pagetablecell2);
                        int o4 = c6.o(pagetablecell2);
                        int i16 = pagetablecell2.colspan;
                        if (i16 == 0) {
                            i16 = 1;
                        }
                        if (a10 >= i10) {
                            i14 = a10 + 1;
                        } else {
                            i14 = a10;
                        }
                        if (a10 < i10 && a10 + i16 > i10) {
                            i16++;
                            for (int i17 = b10; i17 < b10 + o4 && i17 < c6Var.f21619b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o4, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        i12 = c6Var.f21619b;
                        if (i19 >= i12) {
                            break;
                        }
                        if (zArr[i19]) {
                            i13 = i18;
                        } else {
                            i13 = i18;
                            identityHashMap.put(c6.f(), new int[]{i19, i10, i13, i13});
                        }
                        i19++;
                        i18 = i13;
                    }
                    c6Var.j(identityHashMap, i12);
                    c6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = c6Var.f21618a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(c6.f());
                        pageblocktable.rows.add(pagetablerow);
                    } else {
                        ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                        int size2 = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            TL_iv.pageTableRow pagetablerow2 = arrayList3.get(i20);
                            i20++;
                            TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                            if (pagetablerow3.cells == null) {
                                pagetablerow3.cells = new ArrayList<>();
                            }
                            pagetablerow3.cells.add(c6.f());
                        }
                    }
                    c6Var.i();
                }
                x();
                s(0, i7);
                v();
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        m5 m5Var = this.f21778w;
        if (m5Var != null) {
            m5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i7 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i7 = Math.min(i7, this.G.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i7 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i7 = Math.max(i7, c6.o(pagetablecell) + this.G.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                c6 c6Var = this.G;
                int i13 = c6Var.f21619b;
                if (i13 != 0 && c6Var.f21620c != 0) {
                    if (i7 < 0) {
                        i10 = 0;
                    } else {
                        i10 = i7;
                    }
                    if (i10 <= i13) {
                        i13 = i10;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[c6Var.f21620c];
                    ArrayList arrayList = c6Var.f21623g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = c6Var.b(pagetablecell2);
                        int a10 = c6Var.a(pagetablecell2);
                        int o4 = c6.o(pagetablecell2);
                        int i15 = pagetablecell2.colspan;
                        if (i15 == 0) {
                            i15 = 1;
                        }
                        if (b10 >= i13) {
                            i12 = b10 + 1;
                        } else {
                            i12 = b10;
                        }
                        if (b10 < i13 && b10 + o4 > i13) {
                            o4++;
                            for (int i16 = a10; i16 < a10 + i15 && i16 < c6Var.f21620c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a10, o4, i15});
                    }
                    int i17 = 1;
                    int i18 = 0;
                    while (i18 < c6Var.f21620c) {
                        if (zArr[i18]) {
                            i11 = i17;
                        } else {
                            i11 = i17;
                            identityHashMap.put(c6.f(), new int[]{i13, i18, i11, i11});
                        }
                        i18++;
                        i17 = i11;
                    }
                    c6Var.j(identityHashMap, c6Var.f21619b + i17);
                    c6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(c6Var.f21620c, 1);
                    for (int i19 = 0; i19 < max; i19++) {
                        pagetablerow.cells.add(c6.f());
                    }
                    c6Var.f21618a.rows.add(pagetablerow);
                    c6Var.i();
                }
                x();
                s(i7, 0);
                v();
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        e1 e1Var;
        Layout layout;
        if (this.G != null) {
            e1 e1Var2 = this.f21776r;
            Layout layout2 = e1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new f5(this, layout2, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop()));
            }
            int size = this.G.f21623g.size();
            for (int i7 = 0; i7 < size; i7++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.f21623g.get(i7);
                m5 m5Var = this.f21778w;
                n5 m10 = m5Var.m(pagetablecell);
                if (m10 != null && (layout = (e1Var = m10.f21845a).getLayout()) != null) {
                    u3 u3Var = this.f21777s;
                    int left = u3Var.getLeft();
                    j5 j5Var = this.f21779x;
                    int paddingLeft = e1Var.getPaddingLeft() + e1Var.getLeft() + m10.getLeft() + ((m5Var.getLeft() + (j5Var.getLeft() + left)) - u3Var.getScrollX());
                    int top = u3Var.getTop();
                    arrayList.add(new g5(layout, paddingLeft, e1Var.getPaddingTop() + e1Var.getTop() + m10.getTop() + m5Var.getTop() + j5Var.getTop() + top, this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        c6 c6Var = this.G;
        if (c6Var == null || (indexOf = c6Var.f21623g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final e1 m(int i7) {
        n5 m10;
        if (i7 == 0) {
            return this.f21776r;
        }
        TL_iv.pageTableCell g10 = g(i7);
        if (g10 == null || (m10 = this.f21778w.m(g10)) == null) {
            return null;
        }
        return m10.f21845a;
    }

    public final TL_iv.pageTableCell n(int i7, int i10) {
        if (this.G != null) {
            u3 u3Var = this.f21777s;
            int left = i7 - u3Var.getLeft();
            j5 j5Var = this.f21779x;
            int left2 = left - j5Var.getLeft();
            m5 m5Var = this.f21778w;
            int scrollX = u3Var.getScrollX() + (left2 - m5Var.getLeft());
            int top = ((i10 - u3Var.getTop()) - j5Var.getTop()) - m5Var.getTop();
            for (int i11 = 0; i11 < m5Var.getChildCount(); i11++) {
                View childAt = m5Var.getChildAt(i11);
                if (childAt instanceof n5) {
                    n5 n5Var = (n5) childAt;
                    if (scrollX >= n5Var.getLeft() && scrollX < n5Var.getRight() && top >= n5Var.getTop() && top < n5Var.getBottom()) {
                        return n5Var.f21846b;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i11 - i7;
        int i16 = this.f22108c;
        int d = ca.d(this.f22106a);
        boolean z11 = this.E;
        if (z11) {
            i13 = d;
        } else {
            i13 = i16;
        }
        if (!z11) {
            i16 = d;
        }
        e1 e1Var = this.f21776r;
        int measuredHeight = e1Var.getMeasuredHeight();
        a aVar = this.f22106a;
        int i17 = 0;
        if (aVar != null && (i14 = aVar.f21552l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i14, 1, 16, 10));
        }
        int i18 = i15 - i16;
        int i19 = measuredHeight + i17;
        e1Var.layout(org.telegram.messenger.g0.L(16.0f) + i13, i17, i5.c.d(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i13), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        u3 u3Var = this.f21777s;
        u3Var.layout(i13, L, i18, u3Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = 0;
        int max = Math.max(0, (size - this.f22108c) - ca.d(this.f22106a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.f21776r;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = e1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        u3 u3Var = this.f21777s;
        u3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f22106a;
        if (aVar == null || (i11 = aVar.f21552l) <= 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i11, 1, 16, 10));
        }
        a aVar2 = this.f22106a;
        if (aVar2 != null && (i12 = aVar2.f21553m) > 0) {
            i13 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, u3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(9.0f) + i13 + L + measuredHeight);
    }

    public final int p(int i7, int i10) {
        int i11;
        int a10;
        if (this.G != null) {
            u3 u3Var = this.f21777s;
            int left = i7 - u3Var.getLeft();
            j5 j5Var = this.f21779x;
            int left2 = left - j5Var.getLeft();
            m5 m5Var = this.f21778w;
            int scrollX = u3Var.getScrollX() + (left2 - m5Var.getLeft());
            int top = ((i10 - u3Var.getTop()) - j5Var.getTop()) - m5Var.getTop();
            c6 c6Var = m5Var.f21817a;
            if (c6Var != null && top >= (i11 = m5Var.f21821f[c6Var.f21619b])) {
                if (top < org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
                    int i12 = 1;
                    if (m5Var.u()) {
                        int j3 = m5Var.j();
                        int q10 = m5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = m5Var.f21820e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q10 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a11 = m5Var.a();
                    if (a11 != null && (a10 = m5Var.f21817a.a(a11)) >= 0) {
                        int i13 = a11.colspan;
                        if (i13 != 0) {
                            i12 = i13;
                        }
                        int[] iArr2 = m5Var.f21820e;
                        int i14 = iArr2[a10];
                        int i15 = iArr2[Math.min(i12 + a10, m5Var.f21817a.f21620c)];
                        if (scrollX >= i14 && scrollX < i15) {
                            return a10;
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

    public final n5 q(e1 e1Var) {
        for (ViewParent parent = e1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof n5) {
                return (n5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i7, int i10) {
        int b10;
        if (this.G != null) {
            u3 u3Var = this.f21777s;
            int left = i7 - u3Var.getLeft();
            j5 j5Var = this.f21779x;
            int left2 = left - j5Var.getLeft();
            m5 m5Var = this.f21778w;
            int scrollX = u3Var.getScrollX() + (left2 - m5Var.getLeft());
            int top = ((i10 - u3Var.getTop()) - j5Var.getTop()) - m5Var.getTop();
            if (m5Var.f21817a != null && scrollX >= (m5Var.f21820e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) && scrollX < m5Var.f21820e[0]) {
                int i11 = 1;
                if (m5Var.v()) {
                    int k10 = m5Var.k();
                    int r10 = m5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = m5Var.f21821f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a10 = m5Var.a();
                if (a10 != null && (b10 = m5Var.f21817a.b(a10)) >= 0) {
                    int i12 = a10.rowspan;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    int[] iArr2 = m5Var.f21821f;
                    int i13 = iArr2[b10];
                    int i14 = iArr2[Math.min(i11 + b10, m5Var.f21817a.f21619b)];
                    if (top >= i13 && top < i14) {
                        return b10;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final void s(int i7, int i10) {
        int i11;
        c6 c6Var = this.G;
        if (c6Var != null && (i11 = c6Var.f21619b) != 0 && c6Var.f21620c != 0) {
            TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i7, i11 - 1))][Math.max(0, Math.min(i10, this.G.f21620c - 1))];
            if (pagetablecell != null) {
                post(new u4(2, this, pagetablecell));
            }
        }
    }

    public void setCellSelectionListener(h5 h5Var) {
        this.J = h5Var;
    }

    public void setLocked(boolean z10) {
        this.f21776r.setLocked(z10);
        int i7 = 0;
        while (true) {
            m5 m5Var = this.f21778w;
            if (i7 < m5Var.getChildCount()) {
                View childAt = m5Var.getChildAt(i7);
                if (childAt instanceof n5) {
                    ((n5) childAt).setLocked(z10);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        c6 c6Var = this.G;
        if (c6Var == null || c6Var.f21623g.isEmpty()) {
            return false;
        }
        n5 m10 = this.f21778w.m((TL_iv.pageTableCell) this.G.f21623g.get(0));
        if (m10 == null) {
            return false;
        }
        e1 e1Var = m10.f21845a;
        e1Var.O();
        e1Var.setSelection(0);
        return true;
    }

    public final boolean u(n5 n5Var, boolean z10) {
        int indexOf;
        int i7;
        c6 c6Var = this.G;
        if (c6Var != null && (indexOf = c6Var.f21623g.indexOf(n5Var.f21846b)) >= 0) {
            if (z10) {
                i7 = indexOf - 1;
            } else {
                i7 = indexOf + 1;
            }
            if (i7 >= 0 && i7 < this.G.f21623g.size()) {
                n5 m10 = this.f21778w.m((TL_iv.pageTableCell) this.G.f21623g.get(i7));
                if (m10 != null) {
                    e1 e1Var = m10.f21845a;
                    e1Var.O();
                    e1Var.setSelection(e1Var.length());
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
        m5 m5Var;
        e1 e1Var = this.f21776r;
        e1Var.updateColors();
        int i7 = j6.G6;
        e6 e6Var = this.f21775n;
        int w02 = j6.w0(i7, e6Var);
        e1Var.setTextColor(w02);
        e1Var.setHintTextColor(j6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            m5Var = this.f21778w;
            if (i10 >= m5Var.getChildCount()) {
                break;
            }
            View childAt = m5Var.getChildAt(i10);
            if (childAt instanceof n5) {
                ((n5) childAt).f21845a.updateColors();
            }
            i10++;
        }
        m5Var.b();
        try {
            if (getBackground() instanceof w1) {
                ((w1) getBackground()).a(j6.w0(j6.f28849d6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        h5 h5Var = this.J;
        if (h5Var != null) {
            q3 q3Var = ((p2) h5Var).f21873a;
            if (this == q3Var.f21934q4) {
                if (this.I.isEmpty()) {
                    q3Var.P2();
                } else if (!q3Var.J3) {
                    q3Var.I4(this);
                }
            }
        }
    }

    public final void w() {
        a aVar = this.f22106a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = a6.f(this.f21776r.getText());
            }
        }
    }

    public final void x() {
        m5 m5Var = this.f21778w;
        m5Var.s();
        m5Var.requestLayout();
        m5Var.invalidate();
        A();
        y2 y2Var = this.F;
        if (y2Var != null && this.f22106a != null) {
            y2Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i7;
        c6 c6Var = this.G;
        if (c6Var != null && pagetablecell != null) {
            int b10 = c6Var.b(pagetablecell);
            int a10 = this.G.a(pagetablecell);
            int b11 = this.G.b(pagetablecell2);
            int a11 = this.G.a(pagetablecell2);
            if (b10 >= 0 && a10 >= 0 && b11 >= 0 && a11 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a10, a11);
                int i10 = this.G.f21619b - 1;
                int i11 = pagetablecell.rowspan;
                if (i11 == 0) {
                    i11 = 1;
                }
                int i12 = (b10 + i11) - 1;
                int i13 = pagetablecell2.rowspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                int min3 = Math.min(i10, Math.max(i12, (b11 + i13) - 1));
                int i14 = this.G.f21620c - 1;
                int i15 = pagetablecell.colspan;
                if (i15 == 0) {
                    i15 = 1;
                }
                int i16 = (a10 + i15) - 1;
                int i17 = pagetablecell2.colspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                int min4 = Math.min(i14, Math.max(i16, (a11 + i17) - 1));
                while (true) {
                    boolean z10 = false;
                    i7 = min;
                    while (min <= min3) {
                        int i18 = min2;
                        while (min2 <= min4) {
                            c6 c6Var2 = this.G;
                            TL_iv.pageTableCell pagetablecell3 = c6Var2.d[min][min2];
                            int i19 = c6Var2.f21621e[min][min2];
                            int i20 = c6Var2.f21622f[min][min2];
                            int min5 = Math.min(c6Var2.f21619b - 1, (c6.o(pagetablecell3) + i19) - 1);
                            int i21 = this.G.f21620c - 1;
                            int i22 = pagetablecell3.colspan;
                            if (i22 == 0) {
                                i22 = 1;
                            }
                            int min6 = Math.min(i21, (i22 + i20) - 1);
                            if (i19 < i7) {
                                z10 = true;
                                i7 = i19;
                            }
                            if (i20 < i18) {
                                z10 = true;
                                i18 = i20;
                            }
                            if (min5 > min3) {
                                min3 = min5;
                                z10 = true;
                            }
                            if (min6 > min4) {
                                min4 = min6;
                                z10 = true;
                            }
                            min2++;
                        }
                        min++;
                        min2 = i18;
                    }
                    if (!z10) {
                        break;
                    }
                    min = i7;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i7 <= min3) {
                    for (int i23 = min2; i23 <= min4; i23++) {
                        linkedHashSet.add(this.G.d[i7][i23]);
                    }
                    i7++;
                }
                LinkedHashSet linkedHashSet2 = this.I;
                if (!linkedHashSet2.equals(linkedHashSet)) {
                    linkedHashSet2.clear();
                    linkedHashSet2.addAll(linkedHashSet);
                    this.f21778w.invalidate();
                    v();
                }
            }
        }
    }

    public final void z() {
        float L;
        if (this.I.isEmpty() && !this.f21778w.hasFocus()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(1.0f);
        }
        setTranslationZ(L);
        invalidate();
        this.f21777s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
