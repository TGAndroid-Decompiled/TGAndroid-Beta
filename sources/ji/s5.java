package ji;

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
import v7.c9;
public final class s5 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public b3 E;
    public k6 F;
    public boolean G;
    public final LinkedHashSet H;
    public p5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.f6 f14166n;
    public final h1 f14167r;
    public final z3 f14168s;
    public final u5 v;
    public final r5 f14169w;
    public final ArrayList f14170x;
    public boolean f14171y;

    public s5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14170x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.f14166n = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, f6Var);
        this.f14167r = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(49);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setIncludeFontPadding(false);
        h1Var.setMinHeight(0);
        h1Var.setBackground(null);
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        h1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        h1Var.setCenterEmptyHint(true);
        h1Var.setListener(new xa.c(this, 24));
        h1Var.setDelegate(new fi.f(this, 29));
        addView(h1Var);
        z3 z3Var = new z3(this, context, 1);
        this.f14168s = z3Var;
        z3Var.setClipChildren(false);
        z3Var.setClipToPadding(false);
        z3Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(z3Var, w7.x5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        u5 u5Var = new u5(context, f6Var);
        this.v = u5Var;
        r5 r5Var = new r5(this, context);
        this.f14169w = r5Var;
        r5Var.addView(u5Var);
        z3Var.addView(r5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void d() {
        h1 h1Var = this.f14167r;
        h1Var.t();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f14166n);
        h1Var.setTextColor(v02);
        h1Var.setHintTextColor(org.telegram.ui.ActionBar.j6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            u5 u5Var = this.v;
            if (i10 < u5Var.getChildCount()) {
                View childAt = u5Var.getChildAt(i10);
                if (childAt instanceof v5) {
                    ((v5) childAt).f14277a.t();
                }
                i10++;
            } else {
                u5Var.b();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            b3 b3Var = this.E;
            if (b3Var != null) {
                q9Var = b3Var.f13790a.getTextSelectionHelper();
            } else {
                q9Var = null;
            }
            if (q9Var != null) {
                ArrayList arrayList = this.f14170x;
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
    public final void f(int i10) {
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var;
        Layout layout;
        if (this.F != null) {
            h1 h1Var2 = this.f14167r;
            Layout layout2 = h1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new n5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
            }
            int size = this.F.f14028g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f14028g.get(i10);
                u5 u5Var = this.v;
                v5 m10 = u5Var.m(pagetablecell);
                if (m10 != null && (layout = (h1Var = m10.f14277a).getLayout()) != null) {
                    z3 z3Var = this.f14168s;
                    int left = z3Var.getLeft();
                    r5 r5Var = this.f14169w;
                    int paddingLeft = h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((u5Var.getLeft() + (r5Var.getLeft() + left)) - z3Var.getScrollX());
                    int top = z3Var.getTop();
                    arrayList.add(new o5(layout, paddingLeft, h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + u5Var.getTop() + r5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public u5 getGrid() {
        return this.v;
    }

    public k6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f13749a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public h1 getTitleEditText() {
        return this.f14167r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        k6 k6Var = this.F;
        if (k6Var == null || i10 <= 0 || i10 - 1 >= k6Var.f14028g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f14028g.get(i11);
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
                        i10 = Math.max(i10, k6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                k6 k6Var = this.F;
                if (k6Var.f14024b != 0 && (i11 = k6Var.f14025c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[k6Var.f14024b];
                    ArrayList arrayList = k6Var.f14028g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = k6Var.b(pagetablecell2);
                        int a2 = k6Var.a(pagetablecell2);
                        int o9 = k6.o(pagetablecell2);
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
                            for (int i17 = b10; i17 < b10 + o9 && i17 < k6Var.f14024b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o9, i16});
                    }
                    int i18 = 0;
                    while (true) {
                        i13 = k6Var.f14024b;
                        if (i18 >= i13) {
                            break;
                        }
                        if (!zArr[i18]) {
                            identityHashMap.put(k6.f(), new int[]{i18, i11, 1, 1});
                        }
                        i18++;
                    }
                    k6Var.j(identityHashMap, i13);
                    k6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = k6Var.f14023a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(k6.f());
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
                            pagetablerow3.cells.add(k6.f());
                        }
                    }
                    k6Var.i();
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
        u5 u5Var = this.v;
        if (u5Var != null) {
            u5Var.invalidate();
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
                        i10 = Math.max(i10, k6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                k6 k6Var = this.F;
                int i13 = k6Var.f14024b;
                if (i13 != 0 && k6Var.f14025c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i13) {
                        i13 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[k6Var.f14025c];
                    ArrayList arrayList = k6Var.f14028g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = k6Var.b(pagetablecell2);
                        int a2 = k6Var.a(pagetablecell2);
                        int o9 = k6.o(pagetablecell2);
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
                            for (int i16 = a2; i16 < a2 + i15 && i16 < k6Var.f14025c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a2, o9, i15});
                    }
                    for (int i17 = 0; i17 < k6Var.f14025c; i17++) {
                        if (!zArr[i17]) {
                            identityHashMap.put(k6.f(), new int[]{i13, i17, 1, 1});
                        }
                    }
                    k6Var.j(identityHashMap, k6Var.f14024b + 1);
                    k6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(k6Var.f14025c, 1);
                    for (int i18 = 0; i18 < max; i18++) {
                        pagetablerow.cells.add(k6.f());
                    }
                    k6Var.f14023a.rows.add(pagetablerow);
                    k6Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        k6 k6Var = this.F;
        if (k6Var == null || (indexOf = k6Var.f14028g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final h1 l(int i10) {
        v5 m10;
        if (i10 == 0) {
            return this.f14167r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f14277a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.F != null) {
            z3 z3Var = this.f14168s;
            int left = i10 - z3Var.getLeft();
            r5 r5Var = this.f14169w;
            int left2 = left - r5Var.getLeft();
            u5 u5Var = this.v;
            int scrollX = z3Var.getScrollX() + (left2 - u5Var.getLeft());
            int top = ((i11 - z3Var.getTop()) - r5Var.getTop()) - u5Var.getTop();
            for (int i12 = 0; i12 < u5Var.getChildCount(); i12++) {
                View childAt = u5Var.getChildAt(i12);
                if (childAt instanceof v5) {
                    v5 v5Var = (v5) childAt;
                    if (scrollX >= v5Var.getLeft() && scrollX < v5Var.getRight() && top >= v5Var.getTop() && top < v5Var.getBottom()) {
                        return v5Var.f14278b;
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
            z3 z3Var = this.f14168s;
            int left = i10 - z3Var.getLeft();
            r5 r5Var = this.f14169w;
            int left2 = left - r5Var.getLeft();
            u5 u5Var = this.v;
            int scrollX = z3Var.getScrollX() + (left2 - u5Var.getLeft());
            int top = ((i11 - z3Var.getTop()) - r5Var.getTop()) - u5Var.getTop();
            k6 k6Var = u5Var.f14222a;
            if (k6Var != null && top >= (i12 = u5Var.f14226f[k6Var.f14024b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (u5Var.u()) {
                        int j3 = u5Var.j();
                        int q6 = u5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = u5Var.f14225e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q6 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = u5Var.a();
                    if (a10 != null && (a2 = u5Var.f14222a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = u5Var.f14225e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, u5Var.f14222a.f14025c)];
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

    public final v5 o(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof v5) {
                return (v5) parent;
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
        int i17 = this.f13751c;
        int d = c9.d(this.f13749a);
        boolean z11 = this.f14171y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        h1 h1Var = this.f14167r;
        int measuredHeight = h1Var.getMeasuredHeight();
        a aVar = this.f13749a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f13740l) > 0) {
            i18 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        h1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, i2.g.f(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        z3 z3Var = this.f14168s;
        z3Var.layout(i14, dp, i19, z3Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f13751c) - c9.d(this.f13749a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.f14167r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        z3 z3Var = this.f14168s;
        z3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f13749a;
        if (aVar == null || (i12 = aVar.f13740l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i12, 1, 16, 10));
        }
        a aVar2 = this.f13749a;
        if (aVar2 != null && (i13 = aVar2.f13741m) > 0) {
            i14 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, z3Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F != null) {
            z3 z3Var = this.f14168s;
            int left = i10 - z3Var.getLeft();
            r5 r5Var = this.f14169w;
            int left2 = left - r5Var.getLeft();
            u5 u5Var = this.v;
            int scrollX = z3Var.getScrollX() + (left2 - u5Var.getLeft());
            int top = ((i11 - z3Var.getTop()) - r5Var.getTop()) - u5Var.getTop();
            if (u5Var.f14222a != null && scrollX >= (u5Var.f14225e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < u5Var.f14225e[0]) {
                int i12 = 1;
                if (u5Var.v()) {
                    int k10 = u5Var.k();
                    int r10 = u5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = u5Var.f14226f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = u5Var.a();
                if (a2 != null && (b10 = u5Var.f14222a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = u5Var.f14226f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, u5Var.f14222a.f14024b)];
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
        k6 k6Var = this.F;
        if (k6Var != null && (i12 = k6Var.f14024b) != 0 && k6Var.f14025c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.f14025c - 1))];
            if (pagetablecell != null) {
                post(new b5(2, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        k6 k6Var = this.F;
        if (k6Var == null || k6Var.f14028g.isEmpty()) {
            return false;
        }
        v5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f14028g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.f14277a;
        h1Var.r();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean s(v5 v5Var, boolean z10) {
        int indexOf;
        int i10;
        k6 k6Var = this.F;
        if (k6Var != null && (indexOf = k6Var.f14028g.indexOf(v5Var.f14278b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.F.f14028g.size()) {
                v5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f14028g.get(i10));
                if (m10 != null) {
                    h1 h1Var = m10.f14277a;
                    h1Var.r();
                    h1Var.setSelection(h1Var.length());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void setCellSelectionListener(p5 p5Var) {
        this.I = p5Var;
    }

    public void setLocked(boolean z10) {
        this.f14167r.setLocked(z10);
        int i10 = 0;
        while (true) {
            u5 u5Var = this.v;
            if (i10 < u5Var.getChildCount()) {
                View childAt = u5Var.getChildAt(i10);
                if (childAt instanceof v5) {
                    ((v5) childAt).setLocked(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        p5 p5Var = this.I;
        if (p5Var != null) {
            v3 v3Var = ((s2) p5Var).f14160a;
            if (this == v3Var.f14252i4) {
                if (this.H.isEmpty()) {
                    v3Var.L2();
                } else if (!v3Var.B3) {
                    v3Var.E4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f13749a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13732b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = i6.f(this.f14167r.getText());
            }
        }
    }

    public final void v() {
        u5 u5Var = this.v;
        u5Var.s();
        u5Var.requestLayout();
        u5Var.invalidate();
        y();
        b3 b3Var = this.E;
        if (b3Var != null && this.f13749a != null) {
            b3Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        k6 k6Var = this.F;
        if (k6Var != null && pagetablecell != null) {
            int b10 = k6Var.b(pagetablecell);
            int a2 = this.F.a(pagetablecell);
            int b11 = this.F.b(pagetablecell2);
            int a10 = this.F.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.F.f14024b - 1;
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
                int i15 = this.F.f14025c - 1;
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
                            k6 k6Var2 = this.F;
                            TL_iv.pageTableCell pagetablecell3 = k6Var2.d[min][min2];
                            int i20 = k6Var2.f14026e[min][min2];
                            int i21 = k6Var2.f14027f[min][min2];
                            int min5 = Math.min(k6Var2.f14024b - 1, (k6.o(pagetablecell3) + i20) - 1);
                            int i22 = this.F.f14025c - 1;
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
        this.f14168s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            u5 u5Var = this.v;
            if (i10 < u5Var.getChildCount()) {
                View childAt = u5Var.getChildAt(i10);
                if (childAt instanceof v5) {
                    v5 v5Var = (v5) childAt;
                    h1 h1Var = v5Var.f14277a;
                    h1Var.setListener(new m5(this, v5Var));
                    h1Var.setDelegate(new ah.i0(23, this, v5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
