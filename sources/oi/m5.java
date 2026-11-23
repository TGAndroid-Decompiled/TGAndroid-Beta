package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c8.ea;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
public final class m5 extends y implements org.telegram.ui.ActionBar.b6, i9 {
    public boolean E;
    public b3 F;
    public e6 G;
    public boolean H;
    public final LinkedHashSet I;
    public j5 J;
    public final h K;
    public final h6 f22245n;
    public final f1 f22246r;
    public final x3 f22247s;
    public final o5 f22248w;
    public final l5 f22249x;
    public final ArrayList f22250y;

    public m5(Context context, h6 h6Var) {
        super(context);
        this.f22250y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new h(this, 3);
        this.f22245n = h6Var;
        setClipChildren(false);
        setClipToPadding(false);
        f1 f1Var = new f1(context, h6Var);
        this.f22246r = f1Var;
        f1Var.setAllowNewlines(false);
        f1Var.setInputType(147457);
        f1Var.setGravity(49);
        f1Var.setTextSize(1, Math.max(8, cz.W0 - 2));
        f1Var.setIncludeFontPadding(false);
        f1Var.setMinHeight(0);
        f1Var.setBackground(null);
        f1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        f1Var.setHint(hd.N0(2131753986, null));
        f1Var.setCenterEmptyHint(true);
        f1Var.setListener(new hi.t5(this, 22));
        f1Var.setDelegate(new kg.x1(this, 26));
        addView(f1Var);
        x3 x3Var = new x3(this, context, 1);
        this.f22247s = x3Var;
        x3Var.setClipChildren(false);
        x3Var.setClipToPadding(false);
        x3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(x3Var, ma.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        o5 o5Var = new o5(context, h6Var);
        this.f22248w = o5Var;
        l5 l5Var = new l5(this, context);
        this.f22249x = l5Var;
        l5Var.addView(o5Var);
        x3Var.addView(l5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i7 = 0;
        while (true) {
            o5 o5Var = this.f22248w;
            if (i7 < o5Var.getChildCount()) {
                View childAt = o5Var.getChildAt(i7);
                if (childAt instanceof p5) {
                    p5 p5Var = (p5) childAt;
                    f1 f1Var = p5Var.f22315a;
                    f1Var.setListener(new g5(this, p5Var));
                    f1Var.setDelegate(new f0(2, this, p5Var));
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f29381d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j9 j9Var;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            b3 b3Var = this.F;
            if (b3Var != null) {
                j9Var = b3Var.f22024a.getTextSelectionHelper();
            } else {
                j9Var = null;
            }
            if (j9Var != null) {
                ArrayList arrayList = this.f22250y;
                arrayList.clear();
                k(arrayList);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    u9 u9Var = (u9) arrayList.get(i7);
                    canvas.save();
                    canvas.translate(u9Var.getX(), u9Var.getY());
                    j9Var.Z(canvas, this, i7);
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
        e6 e6Var = this.G;
        if (e6Var == null || i7 <= 0 || i7 - 1 >= e6Var.f22093g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.f22093g.get(i10);
    }

    public o5 getGrid() {
        return this.f22248w;
    }

    public e6 getModel() {
        return this.G;
    }

    public a getRow() {
        return this.f22531a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public f1 getTitleEditText() {
        return this.f22246r;
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
                        i7 = Math.max(i7, e6.n(pagetablecell) + this.G.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                e6 e6Var = this.G;
                if (e6Var.f22089b != 0 && (i10 = e6Var.f22090c) != 0) {
                    if (i7 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i7;
                    }
                    if (i11 <= i10) {
                        i10 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[e6Var.f22089b];
                    ArrayList arrayList = e6Var.f22093g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = e6Var.b(pagetablecell2);
                        int a10 = e6Var.a(pagetablecell2);
                        int o4 = e6.o(pagetablecell2);
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
                            for (int i17 = b10; i17 < b10 + o4 && i17 < e6Var.f22089b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o4, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        i12 = e6Var.f22089b;
                        if (i19 >= i12) {
                            break;
                        }
                        if (zArr[i19]) {
                            i13 = i18;
                        } else {
                            i13 = i18;
                            identityHashMap.put(e6.f(), new int[]{i19, i10, i13, i13});
                        }
                        i19++;
                        i18 = i13;
                    }
                    e6Var.j(identityHashMap, i12);
                    e6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = e6Var.f22088a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(e6.f());
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
                            pagetablerow3.cells.add(e6.f());
                        }
                    }
                    e6Var.i();
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
        o5 o5Var = this.f22248w;
        if (o5Var != null) {
            o5Var.invalidate();
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
                        i7 = Math.max(i7, e6.o(pagetablecell) + this.G.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                e6 e6Var = this.G;
                int i13 = e6Var.f22089b;
                if (i13 != 0 && e6Var.f22090c != 0) {
                    if (i7 < 0) {
                        i10 = 0;
                    } else {
                        i10 = i7;
                    }
                    if (i10 <= i13) {
                        i13 = i10;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[e6Var.f22090c];
                    ArrayList arrayList = e6Var.f22093g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = e6Var.b(pagetablecell2);
                        int a10 = e6Var.a(pagetablecell2);
                        int o4 = e6.o(pagetablecell2);
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
                            for (int i16 = a10; i16 < a10 + i15 && i16 < e6Var.f22090c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a10, o4, i15});
                    }
                    int i17 = 1;
                    int i18 = 0;
                    while (i18 < e6Var.f22090c) {
                        if (zArr[i18]) {
                            i11 = i17;
                        } else {
                            i11 = i17;
                            identityHashMap.put(e6.f(), new int[]{i13, i18, i11, i11});
                        }
                        i18++;
                        i17 = i11;
                    }
                    e6Var.j(identityHashMap, e6Var.f22089b + i17);
                    e6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(e6Var.f22090c, 1);
                    for (int i19 = 0; i19 < max; i19++) {
                        pagetablerow.cells.add(e6.f());
                    }
                    e6Var.f22088a.rows.add(pagetablerow);
                    e6Var.i();
                }
                x();
                s(i7, 0);
                v();
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        f1 f1Var;
        Layout layout;
        if (this.G != null) {
            f1 f1Var2 = this.f22246r;
            Layout layout2 = f1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new h5(this, layout2, f1Var2.getPaddingLeft() + f1Var2.getLeft(), f1Var2.getPaddingTop() + f1Var2.getTop()));
            }
            int size = this.G.f22093g.size();
            for (int i7 = 0; i7 < size; i7++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.f22093g.get(i7);
                o5 o5Var = this.f22248w;
                p5 m10 = o5Var.m(pagetablecell);
                if (m10 != null && (layout = (f1Var = m10.f22315a).getLayout()) != null) {
                    x3 x3Var = this.f22247s;
                    int left = x3Var.getLeft();
                    l5 l5Var = this.f22249x;
                    int paddingLeft = f1Var.getPaddingLeft() + f1Var.getLeft() + m10.getLeft() + ((o5Var.getLeft() + (l5Var.getLeft() + left)) - x3Var.getScrollX());
                    int top = x3Var.getTop();
                    arrayList.add(new i5(layout, paddingLeft, f1Var.getPaddingTop() + f1Var.getTop() + m10.getTop() + o5Var.getTop() + l5Var.getTop() + top, this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        e6 e6Var = this.G;
        if (e6Var == null || (indexOf = e6Var.f22093g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final f1 m(int i7) {
        p5 m10;
        if (i7 == 0) {
            return this.f22246r;
        }
        TL_iv.pageTableCell g10 = g(i7);
        if (g10 == null || (m10 = this.f22248w.m(g10)) == null) {
            return null;
        }
        return m10.f22315a;
    }

    public final TL_iv.pageTableCell n(int i7, int i10) {
        if (this.G != null) {
            x3 x3Var = this.f22247s;
            int left = i7 - x3Var.getLeft();
            l5 l5Var = this.f22249x;
            int left2 = left - l5Var.getLeft();
            o5 o5Var = this.f22248w;
            int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
            for (int i11 = 0; i11 < o5Var.getChildCount(); i11++) {
                View childAt = o5Var.getChildAt(i11);
                if (childAt instanceof p5) {
                    p5 p5Var = (p5) childAt;
                    if (scrollX >= p5Var.getLeft() && scrollX < p5Var.getRight() && top >= p5Var.getTop() && top < p5Var.getBottom()) {
                        return p5Var.f22316b;
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
        int i16 = this.f22533c;
        int d = ea.d(this.f22531a);
        boolean z11 = this.E;
        if (z11) {
            i13 = d;
        } else {
            i13 = i16;
        }
        if (!z11) {
            i16 = d;
        }
        f1 f1Var = this.f22246r;
        int measuredHeight = f1Var.getMeasuredHeight();
        a aVar = this.f22531a;
        int i17 = 0;
        if (aVar != null && (i14 = aVar.f21943l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i14, 1, 16, 10));
        }
        int i18 = i15 - i16;
        int i19 = measuredHeight + i17;
        f1Var.layout(org.telegram.messenger.g0.L(16.0f) + i13, i17, i5.c.d(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i13), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        x3 x3Var = this.f22247s;
        x3Var.layout(i13, L, i18, x3Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = 0;
        int max = Math.max(0, (size - this.f22533c) - ea.d(this.f22531a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        f1 f1Var = this.f22246r;
        f1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = f1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        x3 x3Var = this.f22247s;
        x3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f22531a;
        if (aVar == null || (i11 = aVar.f21943l) <= 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i11, 1, 16, 10));
        }
        a aVar2 = this.f22531a;
        if (aVar2 != null && (i12 = aVar2.f21944m) > 0) {
            i13 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, x3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(9.0f) + i13 + L + measuredHeight);
    }

    public final int p(int i7, int i10) {
        int i11;
        int a10;
        if (this.G != null) {
            x3 x3Var = this.f22247s;
            int left = i7 - x3Var.getLeft();
            l5 l5Var = this.f22249x;
            int left2 = left - l5Var.getLeft();
            o5 o5Var = this.f22248w;
            int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
            e6 e6Var = o5Var.f22291a;
            if (e6Var != null && top >= (i11 = o5Var.f22295f[e6Var.f22089b])) {
                if (top < org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
                    int i12 = 1;
                    if (o5Var.u()) {
                        int j3 = o5Var.j();
                        int q10 = o5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = o5Var.f22294e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q10 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a11 = o5Var.a();
                    if (a11 != null && (a10 = o5Var.f22291a.a(a11)) >= 0) {
                        int i13 = a11.colspan;
                        if (i13 != 0) {
                            i12 = i13;
                        }
                        int[] iArr2 = o5Var.f22294e;
                        int i14 = iArr2[a10];
                        int i15 = iArr2[Math.min(i12 + a10, o5Var.f22291a.f22090c)];
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

    public final p5 q(f1 f1Var) {
        for (ViewParent parent = f1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof p5) {
                return (p5) parent;
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
            x3 x3Var = this.f22247s;
            int left = i7 - x3Var.getLeft();
            l5 l5Var = this.f22249x;
            int left2 = left - l5Var.getLeft();
            o5 o5Var = this.f22248w;
            int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
            if (o5Var.f22291a != null && scrollX >= (o5Var.f22294e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) && scrollX < o5Var.f22294e[0]) {
                int i11 = 1;
                if (o5Var.v()) {
                    int k10 = o5Var.k();
                    int r10 = o5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = o5Var.f22295f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a10 = o5Var.a();
                if (a10 != null && (b10 = o5Var.f22291a.b(a10)) >= 0) {
                    int i12 = a10.rowspan;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    int[] iArr2 = o5Var.f22295f;
                    int i13 = iArr2[b10];
                    int i14 = iArr2[Math.min(i11 + b10, o5Var.f22291a.f22089b)];
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
        e6 e6Var = this.G;
        if (e6Var != null && (i11 = e6Var.f22089b) != 0 && e6Var.f22090c != 0) {
            TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i7, i11 - 1))][Math.max(0, Math.min(i10, this.G.f22090c - 1))];
            if (pagetablecell != null) {
                post(new t(7, this, pagetablecell));
            }
        }
    }

    public void setCellSelectionListener(j5 j5Var) {
        this.J = j5Var;
    }

    public void setLocked(boolean z10) {
        this.f22246r.setLocked(z10);
        int i7 = 0;
        while (true) {
            o5 o5Var = this.f22248w;
            if (i7 < o5Var.getChildCount()) {
                View childAt = o5Var.getChildAt(i7);
                if (childAt instanceof p5) {
                    ((p5) childAt).setLocked(z10);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        e6 e6Var = this.G;
        if (e6Var == null || e6Var.f22093g.isEmpty()) {
            return false;
        }
        p5 m10 = this.f22248w.m((TL_iv.pageTableCell) this.G.f22093g.get(0));
        if (m10 == null) {
            return false;
        }
        f1 f1Var = m10.f22315a;
        f1Var.O();
        f1Var.setSelection(0);
        return true;
    }

    public final boolean u(p5 p5Var, boolean z10) {
        int indexOf;
        int i7;
        e6 e6Var = this.G;
        if (e6Var != null && (indexOf = e6Var.f22093g.indexOf(p5Var.f22316b)) >= 0) {
            if (z10) {
                i7 = indexOf - 1;
            } else {
                i7 = indexOf + 1;
            }
            if (i7 >= 0 && i7 < this.G.f22093g.size()) {
                p5 m10 = this.f22248w.m((TL_iv.pageTableCell) this.G.f22093g.get(i7));
                if (m10 != null) {
                    f1 f1Var = m10.f22315a;
                    f1Var.O();
                    f1Var.setSelection(f1Var.length());
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
        o5 o5Var;
        f1 f1Var = this.f22246r;
        f1Var.updateColors();
        int i7 = m6.G6;
        h6 h6Var = this.f22245n;
        int w02 = m6.w0(i7, h6Var);
        f1Var.setTextColor(w02);
        f1Var.setHintTextColor(m6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            o5Var = this.f22248w;
            if (i10 >= o5Var.getChildCount()) {
                break;
            }
            View childAt = o5Var.getChildAt(i10);
            if (childAt instanceof p5) {
                ((p5) childAt).f22315a.updateColors();
            }
            i10++;
        }
        o5Var.b();
        try {
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(m6.w0(m6.f29381d6, h6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        j5 j5Var = this.J;
        if (j5Var != null) {
            t3 t3Var = ((s2) j5Var).f22369a;
            if (this == t3Var.f22431q4) {
                if (this.I.isEmpty()) {
                    t3Var.P2();
                } else if (!t3Var.J3) {
                    t3Var.I4(this);
                }
            }
        }
    }

    public final void w() {
        a aVar = this.f22531a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21935b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = c6.f(this.f22246r.getText());
            }
        }
    }

    public final void x() {
        o5 o5Var = this.f22248w;
        o5Var.s();
        o5Var.requestLayout();
        o5Var.invalidate();
        A();
        b3 b3Var = this.F;
        if (b3Var != null && this.f22531a != null) {
            b3Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i7;
        e6 e6Var = this.G;
        if (e6Var != null && pagetablecell != null) {
            int b10 = e6Var.b(pagetablecell);
            int a10 = this.G.a(pagetablecell);
            int b11 = this.G.b(pagetablecell2);
            int a11 = this.G.a(pagetablecell2);
            if (b10 >= 0 && a10 >= 0 && b11 >= 0 && a11 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a10, a11);
                int i10 = this.G.f22089b - 1;
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
                int i14 = this.G.f22090c - 1;
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
                            e6 e6Var2 = this.G;
                            TL_iv.pageTableCell pagetablecell3 = e6Var2.d[min][min2];
                            int i19 = e6Var2.f22091e[min][min2];
                            int i20 = e6Var2.f22092f[min][min2];
                            int min5 = Math.min(e6Var2.f22089b - 1, (e6.o(pagetablecell3) + i19) - 1);
                            int i21 = this.G.f22090c - 1;
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
                    this.f22248w.invalidate();
                    v();
                }
            }
        }
    }

    public final void z() {
        float L;
        if (this.I.isEmpty() && !this.f22248w.hasFocus()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(1.0f);
        }
        setTranslationZ(L);
        invalidate();
        this.f22247s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
