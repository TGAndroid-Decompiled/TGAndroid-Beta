package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;
public final class m5 extends y implements org.telegram.ui.ActionBar.c6, h9 {
    public boolean D;
    public a3 E;
    public e6 F;
    public boolean G;
    public final LinkedHashSet H;
    public j5 I;
    public final i J;
    public final h6 f18711n;
    public final g1 f18712r;
    public final x3 f18713s;
    public final o5 f18714w;
    public final l5 f18715x;
    public final ArrayList f18716y;

    public m5(Context context, h6 h6Var) {
        super(context);
        this.f18716y = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.f18711n = h6Var;
        setClipChildren(false);
        setClipToPadding(false);
        g1 g1Var = new g1(context, h6Var);
        this.f18712r = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(49);
        g1Var.setTextSize(1, Math.max(8, iz.W0 - 2));
        g1Var.setIncludeFontPadding(false);
        g1Var.setMinHeight(0);
        g1Var.setBackground(null);
        g1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        g1Var.setHint(id.M0(2131753989, null));
        g1Var.setCenterEmptyHint(true);
        g1Var.setListener(new g6.d0(this, 15));
        g1Var.setDelegate(new l2.x(this, 11));
        addView(g1Var);
        x3 x3Var = new x3(this, context, 1);
        this.f18713s = x3Var;
        x3Var.setClipChildren(false);
        x3Var.setClipToPadding(false);
        x3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(x3Var, ha.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        o5 o5Var = new o5(context, h6Var);
        this.f18714w = o5Var;
        l5 l5Var = new l5(this, context);
        this.f18715x = l5Var;
        l5Var.addView(o5Var);
        x3Var.addView(l5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i7 = 0;
        while (true) {
            o5 o5Var = this.f18714w;
            if (i7 < o5Var.getChildCount()) {
                View childAt = o5Var.getChildAt(i7);
                if (childAt instanceof p5) {
                    p5 p5Var = (p5) childAt;
                    g1 g1Var = p5Var.f18781a;
                    g1Var.setListener(new g5(this, p5Var));
                    g1Var.setDelegate(new ab.g(25, this, p5Var));
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
        hashSet.add(Integer.valueOf(m6.f27890d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            a3 a3Var = this.E;
            if (a3Var != null) {
                i9Var = a3Var.f18422a.getTextSelectionHelper();
            } else {
                i9Var = null;
            }
            if (i9Var != null) {
                ArrayList arrayList = this.f18716y;
                arrayList.clear();
                k(arrayList);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    t9 t9Var = (t9) arrayList.get(i7);
                    canvas.save();
                    canvas.translate(t9Var.getX(), t9Var.getY());
                    i9Var.Z(canvas, this, i7);
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
        e6 e6Var = this.F;
        if (e6Var == null || i7 <= 0 || i7 - 1 >= e6Var.f18551g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f18551g.get(i10);
    }

    public o5 getGrid() {
        return this.f18714w;
    }

    public e6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f18994a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public g1 getTitleEditText() {
        return this.f18712r;
    }

    public final void h(boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (!linkedHashSet.isEmpty()) {
                if (z9) {
                    Iterator it = linkedHashSet.iterator();
                    i7 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i7 = Math.min(i7, this.F.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i7 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i7 = Math.max(i7, e6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                e6 e6Var = this.F;
                if (e6Var.f18547b != 0 && (i10 = e6Var.f18548c) != 0) {
                    if (i7 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i7;
                    }
                    if (i11 <= i10) {
                        i10 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[e6Var.f18547b];
                    ArrayList arrayList = e6Var.f18551g;
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
                            for (int i17 = b10; i17 < b10 + o4 && i17 < e6Var.f18547b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o4, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        i12 = e6Var.f18547b;
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
                    TL_iv.pageBlockTable pageblocktable = e6Var.f18546a;
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
        o5 o5Var = this.f18714w;
        if (o5Var != null) {
            o5Var.invalidate();
        }
    }

    public final void j(boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (!linkedHashSet.isEmpty()) {
                if (z9) {
                    Iterator it = linkedHashSet.iterator();
                    i7 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i7 = Math.min(i7, this.F.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i7 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i7 = Math.max(i7, e6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                e6 e6Var = this.F;
                int i13 = e6Var.f18547b;
                if (i13 != 0 && e6Var.f18548c != 0) {
                    if (i7 < 0) {
                        i10 = 0;
                    } else {
                        i10 = i7;
                    }
                    if (i10 <= i13) {
                        i13 = i10;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[e6Var.f18548c];
                    ArrayList arrayList = e6Var.f18551g;
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
                            for (int i16 = a10; i16 < a10 + i15 && i16 < e6Var.f18548c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a10, o4, i15});
                    }
                    int i17 = 1;
                    int i18 = 0;
                    while (i18 < e6Var.f18548c) {
                        if (zArr[i18]) {
                            i11 = i17;
                        } else {
                            i11 = i17;
                            identityHashMap.put(e6.f(), new int[]{i13, i18, i11, i11});
                        }
                        i18++;
                        i17 = i11;
                    }
                    e6Var.j(identityHashMap, e6Var.f18547b + i17);
                    e6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(e6Var.f18548c, 1);
                    for (int i19 = 0; i19 < max; i19++) {
                        pagetablerow.cells.add(e6.f());
                    }
                    e6Var.f18546a.rows.add(pagetablerow);
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
        g1 g1Var;
        Layout layout;
        if (this.F != null) {
            g1 g1Var2 = this.f18712r;
            Layout layout2 = g1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new h5(this, layout2, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop()));
            }
            int size = this.F.f18551g.size();
            for (int i7 = 0; i7 < size; i7++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f18551g.get(i7);
                o5 o5Var = this.f18714w;
                p5 m10 = o5Var.m(pagetablecell);
                if (m10 != null && (layout = (g1Var = m10.f18781a).getLayout()) != null) {
                    x3 x3Var = this.f18713s;
                    int left = x3Var.getLeft();
                    l5 l5Var = this.f18715x;
                    int paddingLeft = g1Var.getPaddingLeft() + g1Var.getLeft() + m10.getLeft() + ((o5Var.getLeft() + (l5Var.getLeft() + left)) - x3Var.getScrollX());
                    int top = x3Var.getTop();
                    arrayList.add(new i5(layout, paddingLeft, g1Var.getPaddingTop() + g1Var.getTop() + m10.getTop() + o5Var.getTop() + l5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        e6 e6Var = this.F;
        if (e6Var == null || (indexOf = e6Var.f18551g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final g1 m(int i7) {
        p5 m10;
        if (i7 == 0) {
            return this.f18712r;
        }
        TL_iv.pageTableCell g10 = g(i7);
        if (g10 == null || (m10 = this.f18714w.m(g10)) == null) {
            return null;
        }
        return m10.f18781a;
    }

    public final TL_iv.pageTableCell n(int i7, int i10) {
        if (this.F != null) {
            x3 x3Var = this.f18713s;
            int left = i7 - x3Var.getLeft();
            l5 l5Var = this.f18715x;
            int left2 = left - l5Var.getLeft();
            o5 o5Var = this.f18714w;
            int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
            for (int i11 = 0; i11 < o5Var.getChildCount(); i11++) {
                View childAt = o5Var.getChildAt(i11);
                if (childAt instanceof p5) {
                    p5 p5Var = (p5) childAt;
                    if (scrollX >= p5Var.getLeft() && scrollX < p5Var.getRight() && top >= p5Var.getTop() && top < p5Var.getBottom()) {
                        return p5Var.f18782b;
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
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.J);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.J);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i11 - i7;
        int i16 = this.f18996c;
        int d = c8.l1.d(this.f18994a);
        boolean z10 = this.D;
        if (z10) {
            i13 = d;
        } else {
            i13 = i16;
        }
        if (!z10) {
            i16 = d;
        }
        g1 g1Var = this.f18712r;
        int measuredHeight = g1Var.getMeasuredHeight();
        a aVar = this.f18994a;
        int i17 = 0;
        if (aVar != null && (i14 = aVar.f18403l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i14, 1, 16, 10));
        }
        int i18 = i15 - i16;
        int i19 = measuredHeight + i17;
        g1Var.layout(org.telegram.messenger.g0.L(16.0f) + i13, i17, jg.g.e(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i13), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        x3 x3Var = this.f18713s;
        x3Var.layout(i13, L, i18, x3Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = 0;
        int max = Math.max(0, (size - this.f18996c) - c8.l1.d(this.f18994a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        g1 g1Var = this.f18712r;
        g1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = g1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        x3 x3Var = this.f18713s;
        x3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f18994a;
        if (aVar == null || (i11 = aVar.f18403l) <= 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i11, 1, 16, 10));
        }
        a aVar2 = this.f18994a;
        if (aVar2 != null && (i12 = aVar2.f18404m) > 0) {
            i13 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, x3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(9.0f) + i13 + L + measuredHeight);
    }

    public final int p(int i7, int i10) {
        int i11;
        int a10;
        if (this.F != null) {
            x3 x3Var = this.f18713s;
            int left = i7 - x3Var.getLeft();
            l5 l5Var = this.f18715x;
            int left2 = left - l5Var.getLeft();
            o5 o5Var = this.f18714w;
            int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
            e6 e6Var = o5Var.f18751a;
            if (e6Var != null && top >= (i11 = o5Var.f18755f[e6Var.f18547b])) {
                if (top < org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
                    int i12 = 1;
                    if (o5Var.u()) {
                        int j3 = o5Var.j();
                        int q10 = o5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = o5Var.f18754e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q10 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a11 = o5Var.a();
                    if (a11 != null && (a10 = o5Var.f18751a.a(a11)) >= 0) {
                        int i13 = a11.colspan;
                        if (i13 != 0) {
                            i12 = i13;
                        }
                        int[] iArr2 = o5Var.f18754e;
                        int i14 = iArr2[a10];
                        int i15 = iArr2[Math.min(i12 + a10, o5Var.f18751a.f18548c)];
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

    public final p5 q(g1 g1Var) {
        for (ViewParent parent = g1Var.getParent(); parent != null; parent = parent.getParent()) {
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
        if (this.F != null) {
            x3 x3Var = this.f18713s;
            int left = i7 - x3Var.getLeft();
            l5 l5Var = this.f18715x;
            int left2 = left - l5Var.getLeft();
            o5 o5Var = this.f18714w;
            int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
            if (o5Var.f18751a != null && scrollX >= (o5Var.f18754e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) && scrollX < o5Var.f18754e[0]) {
                int i11 = 1;
                if (o5Var.v()) {
                    int k10 = o5Var.k();
                    int r10 = o5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = o5Var.f18755f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a10 = o5Var.a();
                if (a10 != null && (b10 = o5Var.f18751a.b(a10)) >= 0) {
                    int i12 = a10.rowspan;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    int[] iArr2 = o5Var.f18755f;
                    int i13 = iArr2[b10];
                    int i14 = iArr2[Math.min(i11 + b10, o5Var.f18751a.f18547b)];
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
        e6 e6Var = this.F;
        if (e6Var != null && (i11 = e6Var.f18547b) != 0 && e6Var.f18548c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i7, i11 - 1))][Math.max(0, Math.min(i10, this.F.f18548c - 1))];
            if (pagetablecell != null) {
                post(new j3(3, this, pagetablecell));
            }
        }
    }

    public void setCellSelectionListener(j5 j5Var) {
        this.I = j5Var;
    }

    public void setLocked(boolean z9) {
        this.f18712r.setLocked(z9);
        int i7 = 0;
        while (true) {
            o5 o5Var = this.f18714w;
            if (i7 < o5Var.getChildCount()) {
                View childAt = o5Var.getChildAt(i7);
                if (childAt instanceof p5) {
                    ((p5) childAt).setLocked(z9);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        e6 e6Var = this.F;
        if (e6Var == null || e6Var.f18551g.isEmpty()) {
            return false;
        }
        p5 m10 = this.f18714w.m((TL_iv.pageTableCell) this.F.f18551g.get(0));
        if (m10 == null) {
            return false;
        }
        g1 g1Var = m10.f18781a;
        g1Var.N();
        g1Var.setSelection(0);
        return true;
    }

    public final boolean u(p5 p5Var, boolean z9) {
        int indexOf;
        int i7;
        e6 e6Var = this.F;
        if (e6Var != null && (indexOf = e6Var.f18551g.indexOf(p5Var.f18782b)) >= 0) {
            if (z9) {
                i7 = indexOf - 1;
            } else {
                i7 = indexOf + 1;
            }
            if (i7 >= 0 && i7 < this.F.f18551g.size()) {
                p5 m10 = this.f18714w.m((TL_iv.pageTableCell) this.F.f18551g.get(i7));
                if (m10 != null) {
                    g1 g1Var = m10.f18781a;
                    g1Var.N();
                    g1Var.setSelection(g1Var.length());
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
        g1 g1Var = this.f18712r;
        g1Var.updateColors();
        int i7 = m6.G6;
        h6 h6Var = this.f18711n;
        int w02 = m6.w0(i7, h6Var);
        g1Var.setTextColor(w02);
        g1Var.setHintTextColor(m6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            o5Var = this.f18714w;
            if (i10 >= o5Var.getChildCount()) {
                break;
            }
            View childAt = o5Var.getChildAt(i10);
            if (childAt instanceof p5) {
                ((p5) childAt).f18781a.updateColors();
            }
            i10++;
        }
        o5Var.b();
        try {
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(m6.w0(m6.f27890d6, h6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        j5 j5Var = this.I;
        if (j5Var != null) {
            t3 t3Var = ((r2) j5Var).f18813a;
            if (this == t3Var.f18895p4) {
                if (this.H.isEmpty()) {
                    t3Var.P2();
                } else if (!t3Var.I3) {
                    t3Var.I4(this);
                }
            }
        }
    }

    public final void w() {
        a aVar = this.f18994a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18395b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = c6.f(this.f18712r.getText());
            }
        }
    }

    public final void x() {
        o5 o5Var = this.f18714w;
        o5Var.s();
        o5Var.requestLayout();
        o5Var.invalidate();
        A();
        a3 a3Var = this.E;
        if (a3Var != null && this.f18994a != null) {
            a3Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i7;
        e6 e6Var = this.F;
        if (e6Var != null && pagetablecell != null) {
            int b10 = e6Var.b(pagetablecell);
            int a10 = this.F.a(pagetablecell);
            int b11 = this.F.b(pagetablecell2);
            int a11 = this.F.a(pagetablecell2);
            if (b10 >= 0 && a10 >= 0 && b11 >= 0 && a11 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a10, a11);
                int i10 = this.F.f18547b - 1;
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
                int i14 = this.F.f18548c - 1;
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
                    boolean z9 = false;
                    i7 = min;
                    while (min <= min3) {
                        int i18 = min2;
                        while (min2 <= min4) {
                            e6 e6Var2 = this.F;
                            TL_iv.pageTableCell pagetablecell3 = e6Var2.d[min][min2];
                            int i19 = e6Var2.f18549e[min][min2];
                            int i20 = e6Var2.f18550f[min][min2];
                            int min5 = Math.min(e6Var2.f18547b - 1, (e6.o(pagetablecell3) + i19) - 1);
                            int i21 = this.F.f18548c - 1;
                            int i22 = pagetablecell3.colspan;
                            if (i22 == 0) {
                                i22 = 1;
                            }
                            int min6 = Math.min(i21, (i22 + i20) - 1);
                            if (i19 < i7) {
                                z9 = true;
                                i7 = i19;
                            }
                            if (i20 < i18) {
                                z9 = true;
                                i18 = i20;
                            }
                            if (min5 > min3) {
                                min3 = min5;
                                z9 = true;
                            }
                            if (min6 > min4) {
                                min4 = min6;
                                z9 = true;
                            }
                            min2++;
                        }
                        min++;
                        min2 = i18;
                    }
                    if (!z9) {
                        break;
                    }
                    min = i7;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i7 <= min3) {
                    for (int i23 = min2; i23 <= min4; i23++) {
                        linkedHashSet.add(this.F.d[i7][i23]);
                    }
                    i7++;
                }
                LinkedHashSet linkedHashSet2 = this.H;
                if (!linkedHashSet2.equals(linkedHashSet)) {
                    linkedHashSet2.clear();
                    linkedHashSet2.addAll(linkedHashSet);
                    this.f18714w.invalidate();
                    v();
                }
            }
        }
    }

    public final void z() {
        float L;
        if (this.H.isEmpty() && !this.f18714w.hasFocus()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(1.0f);
        }
        setTranslationZ(L);
        invalidate();
        this.f18713s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
