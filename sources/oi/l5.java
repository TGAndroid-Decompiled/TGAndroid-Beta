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
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
public final class l5 extends x implements org.telegram.ui.ActionBar.c6, i9 {
    public boolean E;
    public a3 F;
    public d6 G;
    public boolean H;
    public final LinkedHashSet I;
    public i5 J;
    public final h K;
    public final i6 f22162n;
    public final e1 f22163r;
    public final w3 f22164s;
    public final n5 f22165w;
    public final k5 f22166x;
    public final ArrayList f22167y;

    public l5(Context context, i6 i6Var) {
        super(context);
        this.f22167y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new h(this, 3);
        this.f22162n = i6Var;
        setClipChildren(false);
        setClipToPadding(false);
        e1 e1Var = new e1(context, i6Var);
        this.f22163r = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(49);
        e1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        e1Var.setIncludeFontPadding(false);
        e1Var.setMinHeight(0);
        e1Var.setBackground(null);
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        e1Var.setHint(gd.M0(2131753987, null));
        e1Var.setCenterEmptyHint(true);
        e1Var.setListener(new hi.u5(this, 22));
        e1Var.setDelegate(new ki.e(this, 25));
        addView(e1Var);
        w3 w3Var = new w3(this, context, 1);
        this.f22164s = w3Var;
        w3Var.setClipChildren(false);
        w3Var.setClipToPadding(false);
        w3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(w3Var, ma.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(context, i6Var);
        this.f22165w = n5Var;
        k5 k5Var = new k5(this, context);
        this.f22166x = k5Var;
        k5Var.addView(n5Var);
        w3Var.addView(k5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i7 = 0;
        while (true) {
            n5 n5Var = this.f22165w;
            if (i7 < n5Var.getChildCount()) {
                View childAt = n5Var.getChildAt(i7);
                if (childAt instanceof o5) {
                    o5 o5Var = (o5) childAt;
                    e1 e1Var = o5Var.f22223a;
                    e1Var.setListener(new f5(this, o5Var));
                    e1Var.setDelegate(new e0(2, this, o5Var));
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.f29394d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j9 j9Var;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            a3 a3Var = this.F;
            if (a3Var != null) {
                j9Var = a3Var.f21932a.getTextSelectionHelper();
            } else {
                j9Var = null;
            }
            if (j9Var != null) {
                ArrayList arrayList = this.f22167y;
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
        d6 d6Var = this.G;
        if (d6Var == null || i7 <= 0 || i7 - 1 >= d6Var.f22001g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.f22001g.get(i10);
    }

    public n5 getGrid() {
        return this.f22165w;
    }

    public d6 getModel() {
        return this.G;
    }

    public a getRow() {
        return this.f22439a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public e1 getTitleEditText() {
        return this.f22163r;
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
                        i7 = Math.max(i7, d6.n(pagetablecell) + this.G.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                d6 d6Var = this.G;
                if (d6Var.f21997b != 0 && (i10 = d6Var.f21998c) != 0) {
                    if (i7 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i7;
                    }
                    if (i11 <= i10) {
                        i10 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[d6Var.f21997b];
                    ArrayList arrayList = d6Var.f22001g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = d6Var.b(pagetablecell2);
                        int a10 = d6Var.a(pagetablecell2);
                        int o4 = d6.o(pagetablecell2);
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
                            for (int i17 = b10; i17 < b10 + o4 && i17 < d6Var.f21997b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o4, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        i12 = d6Var.f21997b;
                        if (i19 >= i12) {
                            break;
                        }
                        if (zArr[i19]) {
                            i13 = i18;
                        } else {
                            i13 = i18;
                            identityHashMap.put(d6.f(), new int[]{i19, i10, i13, i13});
                        }
                        i19++;
                        i18 = i13;
                    }
                    d6Var.j(identityHashMap, i12);
                    d6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = d6Var.f21996a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(d6.f());
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
                            pagetablerow3.cells.add(d6.f());
                        }
                    }
                    d6Var.i();
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
        n5 n5Var = this.f22165w;
        if (n5Var != null) {
            n5Var.invalidate();
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
                        i7 = Math.max(i7, d6.o(pagetablecell) + this.G.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                d6 d6Var = this.G;
                int i13 = d6Var.f21997b;
                if (i13 != 0 && d6Var.f21998c != 0) {
                    if (i7 < 0) {
                        i10 = 0;
                    } else {
                        i10 = i7;
                    }
                    if (i10 <= i13) {
                        i13 = i10;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[d6Var.f21998c];
                    ArrayList arrayList = d6Var.f22001g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = d6Var.b(pagetablecell2);
                        int a10 = d6Var.a(pagetablecell2);
                        int o4 = d6.o(pagetablecell2);
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
                            for (int i16 = a10; i16 < a10 + i15 && i16 < d6Var.f21998c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a10, o4, i15});
                    }
                    int i17 = 1;
                    int i18 = 0;
                    while (i18 < d6Var.f21998c) {
                        if (zArr[i18]) {
                            i11 = i17;
                        } else {
                            i11 = i17;
                            identityHashMap.put(d6.f(), new int[]{i13, i18, i11, i11});
                        }
                        i18++;
                        i17 = i11;
                    }
                    d6Var.j(identityHashMap, d6Var.f21997b + i17);
                    d6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(d6Var.f21998c, 1);
                    for (int i19 = 0; i19 < max; i19++) {
                        pagetablerow.cells.add(d6.f());
                    }
                    d6Var.f21996a.rows.add(pagetablerow);
                    d6Var.i();
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
            e1 e1Var2 = this.f22163r;
            Layout layout2 = e1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new g5(this, layout2, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop()));
            }
            int size = this.G.f22001g.size();
            for (int i7 = 0; i7 < size; i7++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.f22001g.get(i7);
                n5 n5Var = this.f22165w;
                o5 m10 = n5Var.m(pagetablecell);
                if (m10 != null && (layout = (e1Var = m10.f22223a).getLayout()) != null) {
                    w3 w3Var = this.f22164s;
                    int left = w3Var.getLeft();
                    k5 k5Var = this.f22166x;
                    int paddingLeft = e1Var.getPaddingLeft() + e1Var.getLeft() + m10.getLeft() + ((n5Var.getLeft() + (k5Var.getLeft() + left)) - w3Var.getScrollX());
                    int top = w3Var.getTop();
                    arrayList.add(new h5(layout, paddingLeft, e1Var.getPaddingTop() + e1Var.getTop() + m10.getTop() + n5Var.getTop() + k5Var.getTop() + top, this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        d6 d6Var = this.G;
        if (d6Var == null || (indexOf = d6Var.f22001g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final e1 m(int i7) {
        o5 m10;
        if (i7 == 0) {
            return this.f22163r;
        }
        TL_iv.pageTableCell g10 = g(i7);
        if (g10 == null || (m10 = this.f22165w.m(g10)) == null) {
            return null;
        }
        return m10.f22223a;
    }

    public final TL_iv.pageTableCell n(int i7, int i10) {
        if (this.G != null) {
            w3 w3Var = this.f22164s;
            int left = i7 - w3Var.getLeft();
            k5 k5Var = this.f22166x;
            int left2 = left - k5Var.getLeft();
            n5 n5Var = this.f22165w;
            int scrollX = w3Var.getScrollX() + (left2 - n5Var.getLeft());
            int top = ((i10 - w3Var.getTop()) - k5Var.getTop()) - n5Var.getTop();
            for (int i11 = 0; i11 < n5Var.getChildCount(); i11++) {
                View childAt = n5Var.getChildAt(i11);
                if (childAt instanceof o5) {
                    o5 o5Var = (o5) childAt;
                    if (scrollX >= o5Var.getLeft() && scrollX < o5Var.getRight() && top >= o5Var.getTop() && top < o5Var.getBottom()) {
                        return o5Var.f22224b;
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
        int i16 = this.f22441c;
        int d = ea.d(this.f22439a);
        boolean z11 = this.E;
        if (z11) {
            i13 = d;
        } else {
            i13 = i16;
        }
        if (!z11) {
            i16 = d;
        }
        e1 e1Var = this.f22163r;
        int measuredHeight = e1Var.getMeasuredHeight();
        a aVar = this.f22439a;
        int i17 = 0;
        if (aVar != null && (i14 = aVar.f21915l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i14, 1, 16, 10));
        }
        int i18 = i15 - i16;
        int i19 = measuredHeight + i17;
        e1Var.layout(org.telegram.messenger.g0.L(16.0f) + i13, i17, i5.c.d(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i13), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        w3 w3Var = this.f22164s;
        w3Var.layout(i13, L, i18, w3Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = 0;
        int max = Math.max(0, (size - this.f22441c) - ea.d(this.f22439a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.f22163r;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = e1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        w3 w3Var = this.f22164s;
        w3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f22439a;
        if (aVar == null || (i11 = aVar.f21915l) <= 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i11, 1, 16, 10));
        }
        a aVar2 = this.f22439a;
        if (aVar2 != null && (i12 = aVar2.f21916m) > 0) {
            i13 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, w3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(9.0f) + i13 + L + measuredHeight);
    }

    public final int p(int i7, int i10) {
        int i11;
        int a10;
        if (this.G != null) {
            w3 w3Var = this.f22164s;
            int left = i7 - w3Var.getLeft();
            k5 k5Var = this.f22166x;
            int left2 = left - k5Var.getLeft();
            n5 n5Var = this.f22165w;
            int scrollX = w3Var.getScrollX() + (left2 - n5Var.getLeft());
            int top = ((i10 - w3Var.getTop()) - k5Var.getTop()) - n5Var.getTop();
            d6 d6Var = n5Var.f22195a;
            if (d6Var != null && top >= (i11 = n5Var.f22199f[d6Var.f21997b])) {
                if (top < org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
                    int i12 = 1;
                    if (n5Var.u()) {
                        int j3 = n5Var.j();
                        int q10 = n5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = n5Var.f22198e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q10 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a11 = n5Var.a();
                    if (a11 != null && (a10 = n5Var.f22195a.a(a11)) >= 0) {
                        int i13 = a11.colspan;
                        if (i13 != 0) {
                            i12 = i13;
                        }
                        int[] iArr2 = n5Var.f22198e;
                        int i14 = iArr2[a10];
                        int i15 = iArr2[Math.min(i12 + a10, n5Var.f22195a.f21998c)];
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

    public final o5 q(e1 e1Var) {
        for (ViewParent parent = e1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof o5) {
                return (o5) parent;
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
            w3 w3Var = this.f22164s;
            int left = i7 - w3Var.getLeft();
            k5 k5Var = this.f22166x;
            int left2 = left - k5Var.getLeft();
            n5 n5Var = this.f22165w;
            int scrollX = w3Var.getScrollX() + (left2 - n5Var.getLeft());
            int top = ((i10 - w3Var.getTop()) - k5Var.getTop()) - n5Var.getTop();
            if (n5Var.f22195a != null && scrollX >= (n5Var.f22198e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) && scrollX < n5Var.f22198e[0]) {
                int i11 = 1;
                if (n5Var.v()) {
                    int k10 = n5Var.k();
                    int r10 = n5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = n5Var.f22199f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a10 = n5Var.a();
                if (a10 != null && (b10 = n5Var.f22195a.b(a10)) >= 0) {
                    int i12 = a10.rowspan;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    int[] iArr2 = n5Var.f22199f;
                    int i13 = iArr2[b10];
                    int i14 = iArr2[Math.min(i11 + b10, n5Var.f22195a.f21997b)];
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
        d6 d6Var = this.G;
        if (d6Var != null && (i11 = d6Var.f21997b) != 0 && d6Var.f21998c != 0) {
            TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i7, i11 - 1))][Math.max(0, Math.min(i10, this.G.f21998c - 1))];
            if (pagetablecell != null) {
                post(new s2(5, this, pagetablecell));
            }
        }
    }

    public void setCellSelectionListener(i5 i5Var) {
        this.J = i5Var;
    }

    public void setLocked(boolean z10) {
        this.f22163r.setLocked(z10);
        int i7 = 0;
        while (true) {
            n5 n5Var = this.f22165w;
            if (i7 < n5Var.getChildCount()) {
                View childAt = n5Var.getChildAt(i7);
                if (childAt instanceof o5) {
                    ((o5) childAt).setLocked(z10);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        d6 d6Var = this.G;
        if (d6Var == null || d6Var.f22001g.isEmpty()) {
            return false;
        }
        o5 m10 = this.f22165w.m((TL_iv.pageTableCell) this.G.f22001g.get(0));
        if (m10 == null) {
            return false;
        }
        e1 e1Var = m10.f22223a;
        e1Var.O();
        e1Var.setSelection(0);
        return true;
    }

    public final boolean u(o5 o5Var, boolean z10) {
        int indexOf;
        int i7;
        d6 d6Var = this.G;
        if (d6Var != null && (indexOf = d6Var.f22001g.indexOf(o5Var.f22224b)) >= 0) {
            if (z10) {
                i7 = indexOf - 1;
            } else {
                i7 = indexOf + 1;
            }
            if (i7 >= 0 && i7 < this.G.f22001g.size()) {
                o5 m10 = this.f22165w.m((TL_iv.pageTableCell) this.G.f22001g.get(i7));
                if (m10 != null) {
                    e1 e1Var = m10.f22223a;
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
        n5 n5Var;
        e1 e1Var = this.f22163r;
        e1Var.updateColors();
        int i7 = n6.G6;
        i6 i6Var = this.f22162n;
        int w02 = n6.w0(i7, i6Var);
        e1Var.setTextColor(w02);
        e1Var.setHintTextColor(n6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            n5Var = this.f22165w;
            if (i10 >= n5Var.getChildCount()) {
                break;
            }
            View childAt = n5Var.getChildAt(i10);
            if (childAt instanceof o5) {
                ((o5) childAt).f22223a.updateColors();
            }
            i10++;
        }
        n5Var.b();
        try {
            if (getBackground() instanceof w1) {
                ((w1) getBackground()).a(n6.w0(n6.f29394d6, i6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        i5 i5Var = this.J;
        if (i5Var != null) {
            s3 s3Var = ((q2) i5Var).f22254a;
            if (this == s3Var.f22337q4) {
                if (this.I.isEmpty()) {
                    s3Var.P2();
                } else if (!s3Var.J3) {
                    s3Var.I4(this);
                }
            }
        }
    }

    public final void w() {
        a aVar = this.f22439a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21907b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = b6.f(this.f22163r.getText());
            }
        }
    }

    public final void x() {
        n5 n5Var = this.f22165w;
        n5Var.s();
        n5Var.requestLayout();
        n5Var.invalidate();
        A();
        a3 a3Var = this.F;
        if (a3Var != null && this.f22439a != null) {
            a3Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i7;
        d6 d6Var = this.G;
        if (d6Var != null && pagetablecell != null) {
            int b10 = d6Var.b(pagetablecell);
            int a10 = this.G.a(pagetablecell);
            int b11 = this.G.b(pagetablecell2);
            int a11 = this.G.a(pagetablecell2);
            if (b10 >= 0 && a10 >= 0 && b11 >= 0 && a11 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a10, a11);
                int i10 = this.G.f21997b - 1;
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
                int i14 = this.G.f21998c - 1;
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
                            d6 d6Var2 = this.G;
                            TL_iv.pageTableCell pagetablecell3 = d6Var2.d[min][min2];
                            int i19 = d6Var2.f21999e[min][min2];
                            int i20 = d6Var2.f22000f[min][min2];
                            int min5 = Math.min(d6Var2.f21997b - 1, (d6.o(pagetablecell3) + i19) - 1);
                            int i21 = this.G.f21998c - 1;
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
                    this.f22165w.invalidate();
                    v();
                }
            }
        }
    }

    public final void z() {
        float L;
        if (this.I.isEmpty() && !this.f22165w.hasFocus()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(1.0f);
        }
        setTranslationZ(L);
        invalidate();
        this.f22164s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
