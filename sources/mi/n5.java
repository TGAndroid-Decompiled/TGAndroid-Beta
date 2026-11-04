package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import b8.mf;
import b8.ne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
public final class n5 extends y implements org.telegram.ui.ActionBar.z5, g9 {
    public boolean E;
    public b3 F;
    public f6 G;
    public boolean H;
    public final LinkedHashSet I;
    public k5 J;
    public final i K;
    public final org.telegram.ui.ActionBar.e6 f19768n;
    public final h1 f19769r;
    public final x3 f19770s;
    public final p5 f19771w;
    public final m5 f19772x;
    public final ArrayList f19773y;

    public n5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19773y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new i(this, 3);
        this.f19768n = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, e6Var);
        this.f19769r = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(49);
        h1Var.setTextSize(1, Math.max(8, az.W0 - 2));
        h1Var.setIncludeFontPadding(false);
        h1Var.setMinHeight(0);
        h1Var.setBackground(null);
        h1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        h1Var.setHint(bd.M0(2131753989, null));
        h1Var.setCenterEmptyHint(true);
        h1Var.setListener(new hi.d(this, 16));
        h1Var.setDelegate(new l5.b(this, 13));
        addView(h1Var);
        x3 x3Var = new x3(this, context, 1);
        this.f19770s = x3Var;
        x3Var.setClipChildren(false);
        x3Var.setClipToPadding(false);
        x3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(x3Var, mf.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        p5 p5Var = new p5(context, e6Var);
        this.f19771w = p5Var;
        m5 m5Var = new m5(this, context);
        this.f19772x = m5Var;
        m5Var.addView(p5Var);
        x3Var.addView(m5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i3 = 0;
        while (true) {
            p5 p5Var = this.f19771w;
            if (i3 < p5Var.getChildCount()) {
                View childAt = p5Var.getChildAt(i3);
                if (childAt instanceof q5) {
                    q5 q5Var = (q5) childAt;
                    h1 h1Var = q5Var.f19842a;
                    h1Var.setListener(new h5(this, q5Var));
                    h1Var.setDelegate(new d4(1, this, q5Var));
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f27878d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h9 h9Var;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            b3 b3Var = this.F;
            if (b3Var != null) {
                h9Var = b3Var.f19478a.getTextSelectionHelper();
            } else {
                h9Var = null;
            }
            if (h9Var != null) {
                ArrayList arrayList = this.f19773y;
                arrayList.clear();
                k(arrayList);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    s9 s9Var = (s9) arrayList.get(i3);
                    canvas.save();
                    canvas.translate(s9Var.getX(), s9Var.getY());
                    h9Var.Z(canvas, this, i3);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e(int i3) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i3) {
        int i10;
        f6 f6Var = this.G;
        if (f6Var == null || i3 <= 0 || i3 - 1 >= f6Var.f19613g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.f19613g.get(i10);
    }

    public p5 getGrid() {
        return this.f19771w;
    }

    public f6 getModel() {
        return this.G;
    }

    public a getRow() {
        return this.f20029a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public h1 getTitleEditText() {
        return this.f19769r;
    }

    public final void h(boolean z10) {
        int i3;
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
                    i3 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i3 = Math.min(i3, this.G.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i3 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i3 = Math.max(i3, f6.n(pagetablecell) + this.G.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                f6 f6Var = this.G;
                if (f6Var.f19609b != 0 && (i10 = f6Var.f19610c) != 0) {
                    if (i3 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i3;
                    }
                    if (i11 <= i10) {
                        i10 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[f6Var.f19609b];
                    ArrayList arrayList = f6Var.f19613g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = f6Var.b(pagetablecell2);
                        int a10 = f6Var.a(pagetablecell2);
                        int o10 = f6.o(pagetablecell2);
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
                            for (int i17 = b10; i17 < b10 + o10 && i17 < f6Var.f19609b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o10, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        i12 = f6Var.f19609b;
                        if (i19 >= i12) {
                            break;
                        }
                        if (zArr[i19]) {
                            i13 = i18;
                        } else {
                            i13 = i18;
                            identityHashMap.put(f6.f(), new int[]{i19, i10, i13, i13});
                        }
                        i19++;
                        i18 = i13;
                    }
                    f6Var.j(identityHashMap, i12);
                    f6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = f6Var.f19608a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(f6.f());
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
                            pagetablerow3.cells.add(f6.f());
                        }
                    }
                    f6Var.i();
                }
                x();
                s(0, i3);
                v();
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        p5 p5Var = this.f19771w;
        if (p5Var != null) {
            p5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i3 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i3 = Math.min(i3, this.G.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i3 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i3 = Math.max(i3, f6.o(pagetablecell) + this.G.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                f6 f6Var = this.G;
                int i13 = f6Var.f19609b;
                if (i13 != 0 && f6Var.f19610c != 0) {
                    if (i3 < 0) {
                        i10 = 0;
                    } else {
                        i10 = i3;
                    }
                    if (i10 <= i13) {
                        i13 = i10;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[f6Var.f19610c];
                    ArrayList arrayList = f6Var.f19613g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = f6Var.b(pagetablecell2);
                        int a10 = f6Var.a(pagetablecell2);
                        int o10 = f6.o(pagetablecell2);
                        int i15 = pagetablecell2.colspan;
                        if (i15 == 0) {
                            i15 = 1;
                        }
                        if (b10 >= i13) {
                            i12 = b10 + 1;
                        } else {
                            i12 = b10;
                        }
                        if (b10 < i13 && b10 + o10 > i13) {
                            o10++;
                            for (int i16 = a10; i16 < a10 + i15 && i16 < f6Var.f19610c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a10, o10, i15});
                    }
                    int i17 = 1;
                    int i18 = 0;
                    while (i18 < f6Var.f19610c) {
                        if (zArr[i18]) {
                            i11 = i17;
                        } else {
                            i11 = i17;
                            identityHashMap.put(f6.f(), new int[]{i13, i18, i11, i11});
                        }
                        i18++;
                        i17 = i11;
                    }
                    f6Var.j(identityHashMap, f6Var.f19609b + i17);
                    f6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(f6Var.f19610c, 1);
                    for (int i19 = 0; i19 < max; i19++) {
                        pagetablerow.cells.add(f6.f());
                    }
                    f6Var.f19608a.rows.add(pagetablerow);
                    f6Var.i();
                }
                x();
                s(i3, 0);
                v();
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        h1 h1Var;
        Layout layout;
        if (this.G != null) {
            h1 h1Var2 = this.f19769r;
            Layout layout2 = h1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new i5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
            }
            int size = this.G.f19613g.size();
            for (int i3 = 0; i3 < size; i3++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.f19613g.get(i3);
                p5 p5Var = this.f19771w;
                q5 m10 = p5Var.m(pagetablecell);
                if (m10 != null && (layout = (h1Var = m10.f19842a).getLayout()) != null) {
                    x3 x3Var = this.f19770s;
                    int left = x3Var.getLeft();
                    m5 m5Var = this.f19772x;
                    int paddingLeft = h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((p5Var.getLeft() + (m5Var.getLeft() + left)) - x3Var.getScrollX());
                    int top = x3Var.getTop();
                    arrayList.add(new j5(layout, paddingLeft, h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + p5Var.getTop() + m5Var.getTop() + top, this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        f6 f6Var = this.G;
        if (f6Var == null || (indexOf = f6Var.f19613g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final h1 m(int i3) {
        q5 m10;
        if (i3 == 0) {
            return this.f19769r;
        }
        TL_iv.pageTableCell g7 = g(i3);
        if (g7 == null || (m10 = this.f19771w.m(g7)) == null) {
            return null;
        }
        return m10.f19842a;
    }

    public final TL_iv.pageTableCell n(int i3, int i10) {
        if (this.G != null) {
            x3 x3Var = this.f19770s;
            int left = i3 - x3Var.getLeft();
            m5 m5Var = this.f19772x;
            int left2 = left - m5Var.getLeft();
            p5 p5Var = this.f19771w;
            int scrollX = x3Var.getScrollX() + (left2 - p5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - m5Var.getTop()) - p5Var.getTop();
            for (int i11 = 0; i11 < p5Var.getChildCount(); i11++) {
                View childAt = p5Var.getChildAt(i11);
                if (childAt instanceof q5) {
                    q5 q5Var = (q5) childAt;
                    if (scrollX >= q5Var.getLeft() && scrollX < q5Var.getRight() && top >= q5Var.getTop() && top < q5Var.getBottom()) {
                        return q5Var.f19843b;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i11 - i3;
        int i16 = this.f20031c;
        int d = ne.d(this.f20029a);
        boolean z11 = this.E;
        if (z11) {
            i13 = d;
        } else {
            i13 = i16;
        }
        if (!z11) {
            i16 = d;
        }
        h1 h1Var = this.f19769r;
        int measuredHeight = h1Var.getMeasuredHeight();
        a aVar = this.f20029a;
        int i17 = 0;
        if (aVar != null && (i14 = aVar.f19439l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i14, 1, 16, 10));
        }
        int i18 = i15 - i16;
        int i19 = measuredHeight + i17;
        h1Var.layout(org.telegram.messenger.g0.L(16.0f) + i13, i17, k2.p1.d(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i13), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        x3 x3Var = this.f19770s;
        x3Var.layout(i13, L, i18, x3Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        int i13 = 0;
        int max = Math.max(0, (size - this.f20031c) - ne.d(this.f20029a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.f19769r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        x3 x3Var = this.f19770s;
        x3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f20029a;
        if (aVar == null || (i11 = aVar.f19439l) <= 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i11, 1, 16, 10));
        }
        a aVar2 = this.f20029a;
        if (aVar2 != null && (i12 = aVar2.f19440m) > 0) {
            i13 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, x3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(9.0f) + i13 + L + measuredHeight);
    }

    public final int p(int i3, int i10) {
        int i11;
        int a10;
        if (this.G != null) {
            x3 x3Var = this.f19770s;
            int left = i3 - x3Var.getLeft();
            m5 m5Var = this.f19772x;
            int left2 = left - m5Var.getLeft();
            p5 p5Var = this.f19771w;
            int scrollX = x3Var.getScrollX() + (left2 - p5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - m5Var.getTop()) - p5Var.getTop();
            f6 f6Var = p5Var.f19812a;
            if (f6Var != null && top >= (i11 = p5Var.f19816f[f6Var.f19609b])) {
                if (top < org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
                    int i12 = 1;
                    if (p5Var.u()) {
                        int j10 = p5Var.j();
                        int q10 = p5Var.q();
                        if (j10 >= 0) {
                            int[] iArr = p5Var.f19815e;
                            if (scrollX >= iArr[j10] && scrollX < iArr[q10 + 1]) {
                                return j10;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a11 = p5Var.a();
                    if (a11 != null && (a10 = p5Var.f19812a.a(a11)) >= 0) {
                        int i13 = a11.colspan;
                        if (i13 != 0) {
                            i12 = i13;
                        }
                        int[] iArr2 = p5Var.f19815e;
                        int i14 = iArr2[a10];
                        int i15 = iArr2[Math.min(i12 + a10, p5Var.f19812a.f19610c)];
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

    public final q5 q(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof q5) {
                return (q5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i3, int i10) {
        int b10;
        if (this.G != null) {
            x3 x3Var = this.f19770s;
            int left = i3 - x3Var.getLeft();
            m5 m5Var = this.f19772x;
            int left2 = left - m5Var.getLeft();
            p5 p5Var = this.f19771w;
            int scrollX = x3Var.getScrollX() + (left2 - p5Var.getLeft());
            int top = ((i10 - x3Var.getTop()) - m5Var.getTop()) - p5Var.getTop();
            if (p5Var.f19812a != null && scrollX >= (p5Var.f19815e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) && scrollX < p5Var.f19815e[0]) {
                int i11 = 1;
                if (p5Var.v()) {
                    int k10 = p5Var.k();
                    int r5 = p5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = p5Var.f19816f;
                        if (top >= iArr[k10] && top < iArr[r5 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a10 = p5Var.a();
                if (a10 != null && (b10 = p5Var.f19812a.b(a10)) >= 0) {
                    int i12 = a10.rowspan;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    int[] iArr2 = p5Var.f19816f;
                    int i13 = iArr2[b10];
                    int i14 = iArr2[Math.min(i11 + b10, p5Var.f19812a.f19609b)];
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

    public final void s(int i3, int i10) {
        int i11;
        f6 f6Var = this.G;
        if (f6Var != null && (i11 = f6Var.f19609b) != 0 && f6Var.f19610c != 0) {
            TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i3, i11 - 1))][Math.max(0, Math.min(i10, this.G.f19610c - 1))];
            if (pagetablecell != null) {
                post(new m2.s(11, this, pagetablecell));
            }
        }
    }

    public void setCellSelectionListener(k5 k5Var) {
        this.J = k5Var;
    }

    public void setLocked(boolean z10) {
        this.f19769r.setLocked(z10);
        int i3 = 0;
        while (true) {
            p5 p5Var = this.f19771w;
            if (i3 < p5Var.getChildCount()) {
                View childAt = p5Var.getChildAt(i3);
                if (childAt instanceof q5) {
                    ((q5) childAt).setLocked(z10);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final boolean t() {
        f6 f6Var = this.G;
        if (f6Var == null || f6Var.f19613g.isEmpty()) {
            return false;
        }
        q5 m10 = this.f19771w.m((TL_iv.pageTableCell) this.G.f19613g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.f19842a;
        h1Var.N();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean u(q5 q5Var, boolean z10) {
        int indexOf;
        int i3;
        f6 f6Var = this.G;
        if (f6Var != null && (indexOf = f6Var.f19613g.indexOf(q5Var.f19843b)) >= 0) {
            if (z10) {
                i3 = indexOf - 1;
            } else {
                i3 = indexOf + 1;
            }
            if (i3 >= 0 && i3 < this.G.f19613g.size()) {
                q5 m10 = this.f19771w.m((TL_iv.pageTableCell) this.G.f19613g.get(i3));
                if (m10 != null) {
                    h1 h1Var = m10.f19842a;
                    h1Var.N();
                    h1Var.setSelection(h1Var.length());
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
        p5 p5Var;
        h1 h1Var = this.f19769r;
        h1Var.updateColors();
        int i3 = k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19768n;
        int w02 = k6.w0(i3, e6Var);
        h1Var.setTextColor(w02);
        h1Var.setHintTextColor(k6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            p5Var = this.f19771w;
            if (i10 >= p5Var.getChildCount()) {
                break;
            }
            View childAt = p5Var.getChildAt(i10);
            if (childAt instanceof q5) {
                ((q5) childAt).f19842a.updateColors();
            }
            i10++;
        }
        p5Var.b();
        try {
            if (getBackground() instanceof z1) {
                ((z1) getBackground()).a(k6.w0(k6.f27878d6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        k5 k5Var = this.J;
        if (k5Var != null) {
            t3 t3Var = ((s2) k5Var).f19879a;
            if (this == t3Var.f19919q4) {
                if (this.I.isEmpty()) {
                    t3Var.P2();
                } else if (!t3Var.J3) {
                    t3Var.I4(this);
                }
            }
        }
    }

    public final void w() {
        a aVar = this.f20029a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = d6.f(this.f19769r.getText());
            }
        }
    }

    public final void x() {
        p5 p5Var = this.f19771w;
        p5Var.s();
        p5Var.requestLayout();
        p5Var.invalidate();
        A();
        b3 b3Var = this.F;
        if (b3Var != null && this.f20029a != null) {
            b3Var.a();
        }
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i3;
        f6 f6Var = this.G;
        if (f6Var != null && pagetablecell != null) {
            int b10 = f6Var.b(pagetablecell);
            int a10 = this.G.a(pagetablecell);
            int b11 = this.G.b(pagetablecell2);
            int a11 = this.G.a(pagetablecell2);
            if (b10 >= 0 && a10 >= 0 && b11 >= 0 && a11 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a10, a11);
                int i10 = this.G.f19609b - 1;
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
                int i14 = this.G.f19610c - 1;
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
                    i3 = min;
                    while (min <= min3) {
                        int i18 = min2;
                        while (min2 <= min4) {
                            f6 f6Var2 = this.G;
                            TL_iv.pageTableCell pagetablecell3 = f6Var2.d[min][min2];
                            int i19 = f6Var2.f19611e[min][min2];
                            int i20 = f6Var2.f19612f[min][min2];
                            int min5 = Math.min(f6Var2.f19609b - 1, (f6.o(pagetablecell3) + i19) - 1);
                            int i21 = this.G.f19610c - 1;
                            int i22 = pagetablecell3.colspan;
                            if (i22 == 0) {
                                i22 = 1;
                            }
                            int min6 = Math.min(i21, (i22 + i20) - 1);
                            if (i19 < i3) {
                                z10 = true;
                                i3 = i19;
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
                    min = i3;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i3 <= min3) {
                    for (int i23 = min2; i23 <= min4; i23++) {
                        linkedHashSet.add(this.G.d[i3][i23]);
                    }
                    i3++;
                }
                LinkedHashSet linkedHashSet2 = this.I;
                if (!linkedHashSet2.equals(linkedHashSet)) {
                    linkedHashSet2.clear();
                    linkedHashSet2.addAll(linkedHashSet);
                    this.f19771w.invalidate();
                    v();
                }
            }
        }
    }

    public final void z() {
        float L;
        if (this.I.isEmpty() && !this.f19771w.hasFocus()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(1.0f);
        }
        setTranslationZ(L);
        invalidate();
        this.f19770s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
