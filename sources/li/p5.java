package li;

import a8.zd;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.kb1;
public final class p5 extends z implements p6, r9 {
    public b3 E;
    public h6 F;
    public boolean G;
    public final LinkedHashSet H;
    public m5 I;
    public final i J;
    public final u6 f17410n;
    public final g1 f17411r;
    public final z3 f17412s;
    public final r5 v;
    public final o5 f17413w;
    public final ArrayList f17414x;
    public boolean f17415y;

    public p5(Context context, u6 u6Var) {
        super(context);
        this.f17414x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.f17410n = u6Var;
        setClipChildren(false);
        setClipToPadding(false);
        g1 g1Var = new g1(context, u6Var);
        this.f17411r = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(49);
        g1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        g1Var.setIncludeFontPadding(false);
        g1Var.setMinHeight(0);
        g1Var.setBackground(null);
        g1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        g1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        g1Var.setCenterEmptyHint(true);
        g1Var.setListener(new h5(this));
        g1Var.setDelegate(new jg.e1(this, 13));
        addView(g1Var);
        z3 z3Var = new z3(this, context, 1);
        this.f17412s = z3Var;
        z3Var.setClipChildren(false);
        z3Var.setClipToPadding(false);
        z3Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(z3Var, kb1.h(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        r5 r5Var = new r5(context, u6Var);
        this.v = r5Var;
        o5 o5Var = new o5(this, context);
        this.f17413w = o5Var;
        o5Var.addView(r5Var);
        z3Var.addView(o5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.f23357d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s9 s9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            b3 b3Var = this.E;
            if (b3Var != null) {
                s9Var = b3Var.f17153a.getTextSelectionHelper();
            } else {
                s9Var = null;
            }
            if (s9Var != null) {
                ArrayList arrayList = this.f17414x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    da daVar = (da) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(daVar.getX(), daVar.getY());
                    s9Var.Z(canvas, this, i10);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e(int i10) {
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        g1 g1Var;
        Layout layout;
        if (this.F != null) {
            g1 g1Var2 = this.f17411r;
            Layout layout2 = g1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new k5(this, layout2, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop()));
            }
            int size = this.F.f17289g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f17289g.get(i10);
                r5 r5Var = this.v;
                s5 m10 = r5Var.m(pagetablecell);
                if (m10 != null && (layout = (g1Var = m10.f17474a).getLayout()) != null) {
                    z3 z3Var = this.f17412s;
                    int left = z3Var.getLeft();
                    o5 o5Var = this.f17413w;
                    int paddingLeft = g1Var.getPaddingLeft() + g1Var.getLeft() + m10.getLeft() + ((r5Var.getLeft() + (o5Var.getLeft() + left)) - z3Var.getScrollX());
                    int top = z3Var.getTop();
                    arrayList.add(new l5(layout, paddingLeft, g1Var.getPaddingTop() + g1Var.getTop() + m10.getTop() + r5Var.getTop() + o5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final TL_iv.pageTableCell g(int i10) {
        int i11;
        h6 h6Var = this.F;
        if (h6Var == null || i10 <= 0 || i10 - 1 >= h6Var.f17289g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f17289g.get(i11);
    }

    public r5 getGrid() {
        return this.v;
    }

    public h6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f17652a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public g1 getTitleEditText() {
        return this.f17411r;
    }

    public final void h(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
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
                        i10 = Math.max(i10, h6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                h6 h6Var = this.F;
                if (h6Var.f17286b != 0 && (i11 = h6Var.f17287c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[h6Var.f17286b];
                    ArrayList arrayList = h6Var.f17289g;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList.get(i16);
                        i16++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = h6Var.b(pagetablecell2);
                        int a2 = h6Var.a(pagetablecell2);
                        int o10 = h6.o(pagetablecell2);
                        int i17 = pagetablecell2.colspan;
                        if (i17 == 0) {
                            i17 = 1;
                        }
                        if (a2 >= i11) {
                            i15 = a2 + 1;
                        } else {
                            i15 = a2;
                        }
                        if (a2 < i11 && a2 + i17 > i11) {
                            i17++;
                            for (int i18 = b10; i18 < b10 + o10 && i18 < h6Var.f17286b; i18++) {
                                zArr[i18] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i15, o10, i17});
                    }
                    int i19 = 1;
                    int i20 = 0;
                    while (true) {
                        i13 = h6Var.f17286b;
                        if (i20 >= i13) {
                            break;
                        }
                        if (zArr[i20]) {
                            i14 = i19;
                        } else {
                            i14 = i19;
                            identityHashMap.put(h6.f(), new int[]{i20, i11, i14, i14});
                        }
                        i20++;
                        i19 = i14;
                    }
                    h6Var.j(identityHashMap, i13);
                    h6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = h6Var.f17285a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(h6.f());
                        pageblocktable.rows.add(pagetablerow);
                    } else {
                        ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                        int size2 = arrayList3.size();
                        int i21 = 0;
                        while (i21 < size2) {
                            TL_iv.pageTableRow pagetablerow2 = arrayList3.get(i21);
                            i21++;
                            TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                            if (pagetablerow3.cells == null) {
                                pagetablerow3.cells = new ArrayList<>();
                            }
                            pagetablerow3.cells.add(h6.f());
                        }
                    }
                    h6Var.i();
                }
                u();
                p(0, i10);
                s();
            }
        }
    }

    public final void i(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
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
                        i10 = Math.max(i10, h6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                h6 h6Var = this.F;
                int i14 = h6Var.f17286b;
                if (i14 != 0 && h6Var.f17287c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i14) {
                        i14 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[h6Var.f17287c];
                    ArrayList arrayList = h6Var.f17289g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = h6Var.b(pagetablecell2);
                        int a2 = h6Var.a(pagetablecell2);
                        int o10 = h6.o(pagetablecell2);
                        int i16 = pagetablecell2.colspan;
                        if (i16 == 0) {
                            i16 = 1;
                        }
                        if (b10 >= i14) {
                            i13 = b10 + 1;
                        } else {
                            i13 = b10;
                        }
                        if (b10 < i14 && b10 + o10 > i14) {
                            o10++;
                            for (int i17 = a2; i17 < a2 + i16 && i17 < h6Var.f17287c; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i13, a2, o10, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (i19 < h6Var.f17287c) {
                        if (zArr[i19]) {
                            i12 = i18;
                        } else {
                            i12 = i18;
                            identityHashMap.put(h6.f(), new int[]{i14, i19, i12, i12});
                        }
                        i19++;
                        i18 = i12;
                    }
                    h6Var.j(identityHashMap, h6Var.f17286b + i18);
                    h6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(h6Var.f17287c, 1);
                    for (int i20 = 0; i20 < max; i20++) {
                        pagetablerow.cells.add(h6.f());
                    }
                    h6Var.f17285a.rows.add(pagetablerow);
                    h6Var.i();
                }
                u();
                p(i10, 0);
                s();
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

    public final int j(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        h6 h6Var = this.F;
        if (h6Var == null || (indexOf = h6Var.f17289g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final g1 k(int i10) {
        s5 m10;
        if (i10 == 0) {
            return this.f17411r;
        }
        TL_iv.pageTableCell g7 = g(i10);
        if (g7 == null || (m10 = this.v.m(g7)) == null) {
            return null;
        }
        return m10.f17474a;
    }

    public final TL_iv.pageTableCell l(int i10, int i11) {
        if (this.F != null) {
            z3 z3Var = this.f17412s;
            int left = i10 - z3Var.getLeft();
            o5 o5Var = this.f17413w;
            int left2 = left - o5Var.getLeft();
            r5 r5Var = this.v;
            int scrollX = z3Var.getScrollX() + (left2 - r5Var.getLeft());
            int top = ((i11 - z3Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
            for (int i12 = 0; i12 < r5Var.getChildCount(); i12++) {
                View childAt = r5Var.getChildAt(i12);
                if (childAt instanceof s5) {
                    s5 s5Var = (s5) childAt;
                    if (scrollX >= s5Var.getLeft() && scrollX < s5Var.getRight() && top >= s5Var.getTop() && top < s5Var.getBottom()) {
                        return s5Var.f17475b;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final int m(int i10, int i11) {
        int i12;
        int a2;
        if (this.F != null) {
            z3 z3Var = this.f17412s;
            int left = i10 - z3Var.getLeft();
            o5 o5Var = this.f17413w;
            int left2 = left - o5Var.getLeft();
            r5 r5Var = this.v;
            int scrollX = z3Var.getScrollX() + (left2 - r5Var.getLeft());
            int top = ((i11 - z3Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
            h6 h6Var = r5Var.f17445a;
            if (h6Var != null && top >= (i12 = r5Var.f17448f[h6Var.f17286b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (r5Var.u()) {
                        int j10 = r5Var.j();
                        int q5 = r5Var.q();
                        if (j10 >= 0) {
                            int[] iArr = r5Var.e;
                            if (scrollX >= iArr[j10] && scrollX < iArr[q5 + 1]) {
                                return j10;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = r5Var.a();
                    if (a10 != null && (a2 = r5Var.f17445a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = r5Var.e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, r5Var.f17445a.f17287c)];
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

    public final s5 n(g1 g1Var) {
        for (ViewParent parent = g1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof s5) {
                return (s5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int o(int i10, int i11) {
        int b10;
        if (this.F != null) {
            z3 z3Var = this.f17412s;
            int left = i10 - z3Var.getLeft();
            o5 o5Var = this.f17413w;
            int left2 = left - o5Var.getLeft();
            r5 r5Var = this.v;
            int scrollX = z3Var.getScrollX() + (left2 - r5Var.getLeft());
            int top = ((i11 - z3Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
            if (r5Var.f17445a != null && scrollX >= (r5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < r5Var.e[0]) {
                int i12 = 1;
                if (r5Var.v()) {
                    int k10 = r5Var.k();
                    int r6 = r5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = r5Var.f17448f;
                        if (top >= iArr[k10] && top < iArr[r6 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = r5Var.a();
                if (a2 != null && (b10 = r5Var.f17445a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = r5Var.f17448f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, r5Var.f17445a.f17286b)];
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
        int i17 = this.f17654c;
        int d = zd.d(this.f17652a);
        boolean z11 = this.f17415y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        g1 g1Var = this.f17411r;
        int measuredHeight = g1Var.getMeasuredHeight();
        a aVar = this.f17652a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f17060l) > 0) {
            i18 = AndroidUtilities.dp(c3.h0.w(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        g1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, org.telegram.messenger.t.c(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        z3 z3Var = this.f17412s;
        z3Var.layout(i14, dp, i19, z3Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f17654c) - zd.d(this.f17652a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        g1 g1Var = this.f17411r;
        g1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = g1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        z3 z3Var = this.f17412s;
        z3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f17652a;
        if (aVar == null || (i12 = aVar.f17060l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(c3.h0.w(i12, 1, 16, 10));
        }
        a aVar2 = this.f17652a;
        if (aVar2 != null && (i13 = aVar2.f17061m) > 0) {
            i14 = AndroidUtilities.dp(c3.h0.w(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, z3Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final void p(int i10, int i11) {
        int i12;
        h6 h6Var = this.F;
        if (h6Var != null && (i12 = h6Var.f17286b) != 0 && h6Var.f17287c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.f17287c - 1))];
            if (pagetablecell != null) {
                post(new k2.e0(9, this, pagetablecell));
            }
        }
    }

    public final boolean q() {
        h6 h6Var = this.F;
        if (h6Var == null || h6Var.f17289g.isEmpty()) {
            return false;
        }
        s5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f17289g.get(0));
        if (m10 == null) {
            return false;
        }
        g1 g1Var = m10.f17474a;
        g1Var.r();
        g1Var.setSelection(0);
        return true;
    }

    public final boolean r(s5 s5Var, boolean z10) {
        int indexOf;
        int i10;
        h6 h6Var = this.F;
        if (h6Var != null && (indexOf = h6Var.f17289g.indexOf(s5Var.f17475b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.F.f17289g.size()) {
                s5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f17289g.get(i10));
                if (m10 != null) {
                    g1 g1Var = m10.f17474a;
                    g1Var.r();
                    g1Var.setSelection(g1Var.length());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void s() {
        w();
        m5 m5Var = this.I;
        if (m5Var != null) {
            v3 v3Var = ((r2) m5Var).f17441a;
            if (this == v3Var.f17559q4) {
                if (this.H.isEmpty()) {
                    v3Var.S2();
                } else if (!v3Var.J3) {
                    v3Var.L4(this);
                }
            }
        }
    }

    public void setCellSelectionListener(m5 m5Var) {
        this.I = m5Var;
    }

    public void setLocked(boolean z10) {
        this.f17411r.setLocked(z10);
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
        a aVar = this.f17652a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17053b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = f6.f(this.f17411r.getText());
            }
        }
    }

    public final void u() {
        r5 r5Var = this.v;
        r5Var.s();
        r5Var.requestLayout();
        r5Var.invalidate();
        x();
        b3 b3Var = this.E;
        if (b3Var != null && this.f17652a != null) {
            b3Var.a();
        }
    }

    @Override
    public final void updateColors() {
        r5 r5Var;
        g1 g1Var = this.f17411r;
        g1Var.updateColors();
        int i10 = y6.G6;
        u6 u6Var = this.f17410n;
        int w02 = y6.w0(i10, u6Var);
        g1Var.setTextColor(w02);
        g1Var.setHintTextColor(y6.o1(0.35f, w02));
        int i11 = 0;
        while (true) {
            r5Var = this.v;
            if (i11 >= r5Var.getChildCount()) {
                break;
            }
            View childAt = r5Var.getChildAt(i11);
            if (childAt instanceof s5) {
                ((s5) childAt).f17474a.updateColors();
            }
            i11++;
        }
        r5Var.b();
        try {
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(y6.w0(y6.f23357d6, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        h6 h6Var = this.F;
        if (h6Var != null && pagetablecell != null) {
            int b10 = h6Var.b(pagetablecell);
            int a2 = this.F.a(pagetablecell);
            int b11 = this.F.b(pagetablecell2);
            int a10 = this.F.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.F.f17286b - 1;
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
                int i15 = this.F.f17287c - 1;
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
                            h6 h6Var2 = this.F;
                            TL_iv.pageTableCell pagetablecell3 = h6Var2.d[min][min2];
                            int i20 = h6Var2.e[min][min2];
                            int i21 = h6Var2.f17288f[min][min2];
                            int min5 = Math.min(h6Var2.f17286b - 1, (h6.o(pagetablecell3) + i20) - 1);
                            int i22 = this.F.f17287c - 1;
                            int i23 = pagetablecell3.colspan;
                            if (i23 == 0) {
                                i23 = 1;
                            }
                            int min6 = Math.min(i22, (i23 + i21) - 1);
                            if (i20 < i10) {
                                z10 = true;
                                i10 = i20;
                            }
                            if (i21 < i19) {
                                z10 = true;
                                i19 = i21;
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
                    s();
                }
            }
        }
    }

    public final void w() {
        float dp;
        if (this.H.isEmpty() && !this.v.hasFocus()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(1.0f);
        }
        setTranslationZ(dp);
        invalidate();
        this.f17412s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            r5 r5Var = this.v;
            if (i10 < r5Var.getChildCount()) {
                View childAt = r5Var.getChildAt(i10);
                if (childAt instanceof s5) {
                    s5 s5Var = (s5) childAt;
                    g1 g1Var = s5Var.f17474a;
                    g1Var.setListener(new j5(this, s5Var));
                    g1Var.setDelegate(new ai.f0(27, this, s5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
