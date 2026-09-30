package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import v7.p8;
public final class p5 extends a0 implements org.telegram.ui.ActionBar.x5, p9 {
    public d3 E;
    public i6 F;
    public boolean G;
    public final LinkedHashSet H;
    public m5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.d6 f11555n;
    public final i1 f11556r;
    public final b4 f11557s;
    public final r5 v;
    public final o5 f11558w;
    public final ArrayList f11559x;
    public boolean f11560y;

    public p5(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f11559x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.f11555n = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        i1 i1Var = new i1(context, d6Var);
        this.f11556r = i1Var;
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(49);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setIncludeFontPadding(false);
        i1Var.setMinHeight(0);
        i1Var.setBackground(null);
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        i1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        i1Var.setCenterEmptyHint(true);
        i1Var.setListener(new a6.m(this, 28));
        i1Var.setDelegate(new ei.d5(this, 20));
        addView(i1Var);
        b4 b4Var = new b4(this, context, 1);
        this.f11557s = b4Var;
        b4Var.setClipChildren(false);
        b4Var.setClipToPadding(false);
        b4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(b4Var, w7.y5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        r5 r5Var = new r5(context, d6Var);
        this.v = r5Var;
        o5 o5Var = new o5(this, context);
        this.f11558w = o5Var;
        o5Var.addView(r5Var);
        b4Var.addView(o5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            d3 d3Var = this.E;
            if (d3Var != null) {
                q9Var = d3Var.f11293a.getTextSelectionHelper();
            } else {
                q9Var = null;
            }
            if (q9Var != null) {
                ArrayList arrayList = this.f11559x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ba baVar = (ba) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(baVar.getX(), baVar.getY());
                    q9Var.a0(canvas, this, i10);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e() {
        i1 i1Var = this.f11556r;
        i1Var.t();
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.f11555n);
        i1Var.setTextColor(v02);
        i1Var.setHintTextColor(org.telegram.ui.ActionBar.h6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            r5 r5Var = this.v;
            if (i10 < r5Var.getChildCount()) {
                View childAt = r5Var.getChildAt(i10);
                if (childAt instanceof s5) {
                    ((s5) childAt).f11616a.t();
                }
                i10++;
            } else {
                r5Var.b();
                return;
            }
        }
    }

    @Override
    public final void f(int i10) {
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var;
        Layout layout;
        if (this.F != null) {
            i1 i1Var2 = this.f11556r;
            Layout layout2 = i1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new k5(this, layout2, i1Var2.getPaddingLeft() + i1Var2.getLeft(), i1Var2.getPaddingTop() + i1Var2.getTop()));
            }
            int size = this.F.f11442g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f11442g.get(i10);
                r5 r5Var = this.v;
                s5 m10 = r5Var.m(pagetablecell);
                if (m10 != null && (layout = (i1Var = m10.f11616a).getLayout()) != null) {
                    b4 b4Var = this.f11557s;
                    int left = b4Var.getLeft();
                    o5 o5Var = this.f11558w;
                    int paddingLeft = i1Var.getPaddingLeft() + i1Var.getLeft() + m10.getLeft() + ((r5Var.getLeft() + (o5Var.getLeft() + left)) - b4Var.getScrollX());
                    int top = b4Var.getTop();
                    arrayList.add(new l5(layout, paddingLeft, i1Var.getPaddingTop() + i1Var.getTop() + m10.getTop() + r5Var.getTop() + o5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public r5 getGrid() {
        return this.v;
    }

    public i6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f11207a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public i1 getTitleEditText() {
        return this.f11556r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        i6 i6Var = this.F;
        if (i6Var == null || i10 <= 0 || i10 - 1 >= i6Var.f11442g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f11442g.get(i11);
    }

    public final void i(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i10 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i10 = Math.min(i10, this.F.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i10 = Math.max(i10, i6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                i6 i6Var = this.F;
                if (i6Var.f11439b != 0 && (i11 = i6Var.f11440c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[i6Var.f11439b];
                    ArrayList arrayList = i6Var.f11442g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = i6Var.b(pagetablecell2);
                        int a2 = i6Var.a(pagetablecell2);
                        int o9 = i6.o(pagetablecell2);
                        int i16 = pagetablecell2.colspan;
                        if (i16 == 0) {
                            i16 = 1;
                        }
                        if (a2 >= i11) {
                            i14 = a2 + 1;
                        } else {
                            i14 = a2;
                        }
                        if (a2 < i11 && a2 + i16 > i11) {
                            i16++;
                            for (int i17 = b10; i17 < b10 + o9 && i17 < i6Var.f11439b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o9, i16});
                    }
                    int i18 = 0;
                    while (true) {
                        i13 = i6Var.f11439b;
                        if (i18 >= i13) {
                            break;
                        }
                        if (!zArr[i18]) {
                            identityHashMap.put(i6.f(), new int[]{i18, i11, 1, 1});
                        }
                        i18++;
                    }
                    i6Var.j(identityHashMap, i13);
                    i6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = i6Var.f11438a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(i6.f());
                        pageblocktable.rows.add(pagetablerow);
                    } else {
                        ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                        int size2 = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            TL_iv.pageTableRow pagetablerow2 = arrayList3.get(i19);
                            i19++;
                            TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                            if (pagetablerow3.cells == null) {
                                pagetablerow3.cells = new ArrayList<>();
                            }
                            pagetablerow3.cells.add(i6.f());
                        }
                    }
                    i6Var.i();
                }
                v();
                q(0, i10);
                t();
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        r5 r5Var = this.v;
        if (r5Var != null) {
            r5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i10 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i10 = Math.min(i10, this.F.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i10 = Math.max(i10, i6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                i6 i6Var = this.F;
                int i13 = i6Var.f11439b;
                if (i13 != 0 && i6Var.f11440c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i13) {
                        i13 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[i6Var.f11440c];
                    ArrayList arrayList = i6Var.f11442g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = i6Var.b(pagetablecell2);
                        int a2 = i6Var.a(pagetablecell2);
                        int o9 = i6.o(pagetablecell2);
                        int i15 = pagetablecell2.colspan;
                        if (i15 == 0) {
                            i15 = 1;
                        }
                        if (b10 >= i13) {
                            i12 = b10 + 1;
                        } else {
                            i12 = b10;
                        }
                        if (b10 < i13 && b10 + o9 > i13) {
                            o9++;
                            for (int i16 = a2; i16 < a2 + i15 && i16 < i6Var.f11440c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a2, o9, i15});
                    }
                    for (int i17 = 0; i17 < i6Var.f11440c; i17++) {
                        if (!zArr[i17]) {
                            identityHashMap.put(i6.f(), new int[]{i13, i17, 1, 1});
                        }
                    }
                    i6Var.j(identityHashMap, i6Var.f11439b + 1);
                    i6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(i6Var.f11440c, 1);
                    for (int i18 = 0; i18 < max; i18++) {
                        pagetablerow.cells.add(i6.f());
                    }
                    i6Var.f11438a.rows.add(pagetablerow);
                    i6Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        i6 i6Var = this.F;
        if (i6Var == null || (indexOf = i6Var.f11442g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final i1 l(int i10) {
        s5 m10;
        if (i10 == 0) {
            return this.f11556r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f11616a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.F != null) {
            b4 b4Var = this.f11557s;
            int left = i10 - b4Var.getLeft();
            o5 o5Var = this.f11558w;
            int left2 = left - o5Var.getLeft();
            r5 r5Var = this.v;
            int scrollX = b4Var.getScrollX() + (left2 - r5Var.getLeft());
            int top = ((i11 - b4Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
            for (int i12 = 0; i12 < r5Var.getChildCount(); i12++) {
                View childAt = r5Var.getChildAt(i12);
                if (childAt instanceof s5) {
                    s5 s5Var = (s5) childAt;
                    if (scrollX >= s5Var.getLeft() && scrollX < s5Var.getRight() && top >= s5Var.getTop() && top < s5Var.getBottom()) {
                        return s5Var.f11617b;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final int n(int i10, int i11) {
        int i12;
        int a2;
        if (this.F != null) {
            b4 b4Var = this.f11557s;
            int left = i10 - b4Var.getLeft();
            o5 o5Var = this.f11558w;
            int left2 = left - o5Var.getLeft();
            r5 r5Var = this.v;
            int scrollX = b4Var.getScrollX() + (left2 - r5Var.getLeft());
            int top = ((i11 - b4Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
            i6 i6Var = r5Var.f11591a;
            if (i6Var != null && top >= (i12 = r5Var.f11594f[i6Var.f11439b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (r5Var.u()) {
                        int j3 = r5Var.j();
                        int q6 = r5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = r5Var.e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q6 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = r5Var.a();
                    if (a10 != null && (a2 = r5Var.f11591a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = r5Var.e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, r5Var.f11591a.f11440c)];
                        if (scrollX >= i15 && scrollX < i16) {
                            return a2;
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

    public final s5 o(i1 i1Var) {
        for (ViewParent parent = i1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof s5) {
                return (s5) parent;
            }
            if (parent == this) {
                return null;
            }
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = this.f11209c;
        int d = p8.d(this.f11207a);
        boolean z11 = this.f11560y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        i1 i1Var = this.f11556r;
        int measuredHeight = i1Var.getMeasuredHeight();
        a aVar = this.f11207a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f11198l) > 0) {
            i18 = AndroidUtilities.dp(hg.c.f(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        i1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, org.telegram.messenger.f0.b(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        b4 b4Var = this.f11557s;
        b4Var.layout(i14, dp, i19, b4Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f11209c) - p8.d(this.f11207a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i1 i1Var = this.f11556r;
        i1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = i1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        b4 b4Var = this.f11557s;
        b4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f11207a;
        if (aVar == null || (i12 = aVar.f11198l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(hg.c.f(i12, 1, 16, 10));
        }
        a aVar2 = this.f11207a;
        if (aVar2 != null && (i13 = aVar2.f11199m) > 0) {
            i14 = AndroidUtilities.dp(hg.c.f(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, b4Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F != null) {
            b4 b4Var = this.f11557s;
            int left = i10 - b4Var.getLeft();
            o5 o5Var = this.f11558w;
            int left2 = left - o5Var.getLeft();
            r5 r5Var = this.v;
            int scrollX = b4Var.getScrollX() + (left2 - r5Var.getLeft());
            int top = ((i11 - b4Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
            if (r5Var.f11591a != null && scrollX >= (r5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < r5Var.e[0]) {
                int i12 = 1;
                if (r5Var.v()) {
                    int k10 = r5Var.k();
                    int r10 = r5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = r5Var.f11594f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = r5Var.a();
                if (a2 != null && (b10 = r5Var.f11591a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = r5Var.f11594f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, r5Var.f11591a.f11439b)];
                    if (top >= i14 && top < i15) {
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

    public final void q(int i10, int i11) {
        int i12;
        i6 i6Var = this.F;
        if (i6Var != null && (i12 = i6Var.f11439b) != 0 && i6Var.f11440c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.f11440c - 1))];
            if (pagetablecell != null) {
                post(new gg.x1(19, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        i6 i6Var = this.F;
        if (i6Var == null || i6Var.f11442g.isEmpty()) {
            return false;
        }
        s5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f11442g.get(0));
        if (m10 == null) {
            return false;
        }
        i1 i1Var = m10.f11616a;
        i1Var.r();
        i1Var.setSelection(0);
        return true;
    }

    public final boolean s(s5 s5Var, boolean z10) {
        int indexOf;
        int i10;
        i6 i6Var = this.F;
        if (i6Var != null && (indexOf = i6Var.f11442g.indexOf(s5Var.f11617b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.F.f11442g.size()) {
                s5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f11442g.get(i10));
                if (m10 != null) {
                    i1 i1Var = m10.f11616a;
                    i1Var.r();
                    i1Var.setSelection(i1Var.length());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void setCellSelectionListener(m5 m5Var) {
        this.I = m5Var;
    }

    public void setLocked(boolean z10) {
        this.f11556r.setLocked(z10);
        int i10 = 0;
        while (true) {
            r5 r5Var = this.v;
            if (i10 < r5Var.getChildCount()) {
                View childAt = r5Var.getChildAt(i10);
                if (childAt instanceof s5) {
                    ((s5) childAt).setLocked(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        m5 m5Var = this.I;
        if (m5Var != null) {
            x3 x3Var = ((u2) m5Var).f11651a;
            if (this == x3Var.f11731i4) {
                if (this.H.isEmpty()) {
                    x3Var.M2();
                } else if (!x3Var.B3) {
                    x3Var.F4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f11207a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11191b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = g6.f(this.f11556r.getText());
            }
        }
    }

    public final void v() {
        r5 r5Var = this.v;
        r5Var.s();
        r5Var.requestLayout();
        r5Var.invalidate();
        y();
        d3 d3Var = this.E;
        if (d3Var != null && this.f11207a != null) {
            d3Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        i6 i6Var = this.F;
        if (i6Var != null && pagetablecell != null) {
            int b10 = i6Var.b(pagetablecell);
            int a2 = this.F.a(pagetablecell);
            int b11 = this.F.b(pagetablecell2);
            int a10 = this.F.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.F.f11439b - 1;
                int i12 = pagetablecell.rowspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                int i13 = (b10 + i12) - 1;
                int i14 = pagetablecell2.rowspan;
                if (i14 == 0) {
                    i14 = 1;
                }
                int min3 = Math.min(i11, Math.max(i13, (b11 + i14) - 1));
                int i15 = this.F.f11440c - 1;
                int i16 = pagetablecell.colspan;
                if (i16 == 0) {
                    i16 = 1;
                }
                int i17 = (a2 + i16) - 1;
                int i18 = pagetablecell2.colspan;
                if (i18 == 0) {
                    i18 = 1;
                }
                int min4 = Math.min(i15, Math.max(i17, (a10 + i18) - 1));
                while (true) {
                    boolean z10 = false;
                    i10 = min;
                    while (min <= min3) {
                        int i19 = min2;
                        while (min2 <= min4) {
                            i6 i6Var2 = this.F;
                            TL_iv.pageTableCell pagetablecell3 = i6Var2.d[min][min2];
                            int i20 = i6Var2.e[min][min2];
                            int i21 = i6Var2.f11441f[min][min2];
                            int min5 = Math.min(i6Var2.f11439b - 1, (i6.o(pagetablecell3) + i20) - 1);
                            int i22 = this.F.f11440c - 1;
                            int i23 = pagetablecell3.colspan;
                            if (i23 == 0) {
                                i23 = 1;
                            }
                            int min6 = Math.min(i22, (i23 + i21) - 1);
                            if (i20 < i10) {
                                i10 = i20;
                                z10 = true;
                            }
                            if (i21 < i19) {
                                i19 = i21;
                                z10 = true;
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
                        min2 = i19;
                    }
                    if (!z10) {
                        break;
                    }
                    min = i10;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i10 <= min3) {
                    for (int i24 = min2; i24 <= min4; i24++) {
                        linkedHashSet.add(this.F.d[i10][i24]);
                    }
                    i10++;
                }
                LinkedHashSet linkedHashSet2 = this.H;
                if (!linkedHashSet2.equals(linkedHashSet)) {
                    linkedHashSet2.clear();
                    linkedHashSet2.addAll(linkedHashSet);
                    this.v.invalidate();
                    t();
                }
            }
        }
    }

    public final void x() {
        float dp;
        if (this.H.isEmpty() && !this.v.hasFocus()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(1.0f);
        }
        setTranslationZ(dp);
        invalidate();
        this.f11557s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            r5 r5Var = this.v;
            if (i10 < r5Var.getChildCount()) {
                View childAt = r5Var.getChildAt(i10);
                if (childAt instanceof s5) {
                    s5 s5Var = (s5) childAt;
                    i1 i1Var = s5Var.f11616a;
                    i1Var.setListener(new j5(this, s5Var));
                    i1Var.setDelegate(new ah.b(19, this, s5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
