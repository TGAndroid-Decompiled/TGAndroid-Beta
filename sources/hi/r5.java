package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bi.cb;
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
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import v7.f8;
public final class r5 extends b0 implements org.telegram.ui.ActionBar.a6, r9 {
    public f3 E;
    public l6 F;
    public boolean G;
    public final LinkedHashSet H;
    public o5 I;
    public final j J;
    public final org.telegram.ui.ActionBar.f6 f9828n;
    public final k1 f9829r;
    public final d4 f9830s;
    public final t5 v;
    public final q5 f9831w;
    public final ArrayList f9832x;
    public boolean f9833y;

    public r5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9832x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new j(this, 3);
        this.f9828n = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        k1 k1Var = new k1(context, f6Var);
        this.f9829r = k1Var;
        k1Var.setAllowNewlines(false);
        k1Var.setInputType(147457);
        k1Var.setGravity(49);
        k1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        k1Var.setIncludeFontPadding(false);
        k1Var.setMinHeight(0);
        k1Var.setBackground(null);
        k1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        k1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        k1Var.setCenterEmptyHint(true);
        k1Var.setListener(new a4.m(this, 22));
        k1Var.setDelegate(new y1(this, 5));
        addView(k1Var);
        d4 d4Var = new d4(this, context, 1);
        this.f9830s = d4Var;
        d4Var.setClipChildren(false);
        d4Var.setClipToPadding(false);
        d4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(d4Var, w7.a6.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        t5 t5Var = new t5(context, f6Var);
        this.v = t5Var;
        q5 q5Var = new q5(this, context);
        this.f9831w = q5Var;
        q5Var.addView(t5Var);
        d4Var.addView(q5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s9 s9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            f3 f3Var = this.E;
            if (f3Var != null) {
                s9Var = f3Var.f9568a.getTextSelectionHelper();
            } else {
                s9Var = null;
            }
            if (s9Var != null) {
                ArrayList arrayList = this.f9832x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    da daVar = (da) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(daVar.getX(), daVar.getY());
                    s9Var.a0(canvas, this, i10);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e() {
        k1 k1Var = this.f9829r;
        k1Var.t();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f9828n);
        k1Var.setTextColor(v02);
        k1Var.setHintTextColor(org.telegram.ui.ActionBar.j6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            t5 t5Var = this.v;
            if (i10 < t5Var.getChildCount()) {
                View childAt = t5Var.getChildAt(i10);
                if (childAt instanceof u5) {
                    ((u5) childAt).f9892a.t();
                }
                i10++;
            } else {
                t5Var.b();
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
        k1 k1Var;
        Layout layout;
        if (this.F != null) {
            k1 k1Var2 = this.f9829r;
            Layout layout2 = k1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new m5(this, layout2, k1Var2.getPaddingLeft() + k1Var2.getLeft(), k1Var2.getPaddingTop() + k1Var2.getTop()));
            }
            int size = this.F.f9733g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f9733g.get(i10);
                t5 t5Var = this.v;
                u5 m10 = t5Var.m(pagetablecell);
                if (m10 != null && (layout = (k1Var = m10.f9892a).getLayout()) != null) {
                    d4 d4Var = this.f9830s;
                    int left = d4Var.getLeft();
                    q5 q5Var = this.f9831w;
                    int paddingLeft = k1Var.getPaddingLeft() + k1Var.getLeft() + m10.getLeft() + ((t5Var.getLeft() + (q5Var.getLeft() + left)) - d4Var.getScrollX());
                    int top = d4Var.getTop();
                    arrayList.add(new n5(layout, paddingLeft, k1Var.getPaddingTop() + k1Var.getTop() + m10.getTop() + t5Var.getTop() + q5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public t5 getGrid() {
        return this.v;
    }

    public l6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f9464a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public k1 getTitleEditText() {
        return this.f9829r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        l6 l6Var = this.F;
        if (l6Var == null || i10 <= 0 || i10 - 1 >= l6Var.f9733g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f9733g.get(i11);
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
                        i10 = Math.max(i10, l6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                l6 l6Var = this.F;
                if (l6Var.f9730b != 0 && (i11 = l6Var.f9731c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[l6Var.f9730b];
                    ArrayList arrayList = l6Var.f9733g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = l6Var.b(pagetablecell2);
                        int a2 = l6Var.a(pagetablecell2);
                        int o9 = l6.o(pagetablecell2);
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
                            for (int i17 = b10; i17 < b10 + o9 && i17 < l6Var.f9730b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o9, i16});
                    }
                    int i18 = 0;
                    while (true) {
                        i13 = l6Var.f9730b;
                        if (i18 >= i13) {
                            break;
                        }
                        if (!zArr[i18]) {
                            identityHashMap.put(l6.f(), new int[]{i18, i11, 1, 1});
                        }
                        i18++;
                    }
                    l6Var.j(identityHashMap, i13);
                    l6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = l6Var.f9729a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(l6.f());
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
                            pagetablerow3.cells.add(l6.f());
                        }
                    }
                    l6Var.i();
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
        t5 t5Var = this.v;
        if (t5Var != null) {
            t5Var.invalidate();
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
                        i10 = Math.max(i10, l6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                l6 l6Var = this.F;
                int i13 = l6Var.f9730b;
                if (i13 != 0 && l6Var.f9731c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i13) {
                        i13 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[l6Var.f9731c];
                    ArrayList arrayList = l6Var.f9733g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = l6Var.b(pagetablecell2);
                        int a2 = l6Var.a(pagetablecell2);
                        int o9 = l6.o(pagetablecell2);
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
                            for (int i16 = a2; i16 < a2 + i15 && i16 < l6Var.f9731c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a2, o9, i15});
                    }
                    for (int i17 = 0; i17 < l6Var.f9731c; i17++) {
                        if (!zArr[i17]) {
                            identityHashMap.put(l6.f(), new int[]{i13, i17, 1, 1});
                        }
                    }
                    l6Var.j(identityHashMap, l6Var.f9730b + 1);
                    l6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(l6Var.f9731c, 1);
                    for (int i18 = 0; i18 < max; i18++) {
                        pagetablerow.cells.add(l6.f());
                    }
                    l6Var.f9729a.rows.add(pagetablerow);
                    l6Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        l6 l6Var = this.F;
        if (l6Var == null || (indexOf = l6Var.f9733g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final k1 l(int i10) {
        u5 m10;
        if (i10 == 0) {
            return this.f9829r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f9892a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.F != null) {
            d4 d4Var = this.f9830s;
            int left = i10 - d4Var.getLeft();
            q5 q5Var = this.f9831w;
            int left2 = left - q5Var.getLeft();
            t5 t5Var = this.v;
            int scrollX = d4Var.getScrollX() + (left2 - t5Var.getLeft());
            int top = ((i11 - d4Var.getTop()) - q5Var.getTop()) - t5Var.getTop();
            for (int i12 = 0; i12 < t5Var.getChildCount(); i12++) {
                View childAt = t5Var.getChildAt(i12);
                if (childAt instanceof u5) {
                    u5 u5Var = (u5) childAt;
                    if (scrollX >= u5Var.getLeft() && scrollX < u5Var.getRight() && top >= u5Var.getTop() && top < u5Var.getBottom()) {
                        return u5Var.f9893b;
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
            d4 d4Var = this.f9830s;
            int left = i10 - d4Var.getLeft();
            q5 q5Var = this.f9831w;
            int left2 = left - q5Var.getLeft();
            t5 t5Var = this.v;
            int scrollX = d4Var.getScrollX() + (left2 - t5Var.getLeft());
            int top = ((i11 - d4Var.getTop()) - q5Var.getTop()) - t5Var.getTop();
            l6 l6Var = t5Var.f9866a;
            if (l6Var != null && top >= (i12 = t5Var.f9869f[l6Var.f9730b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (t5Var.u()) {
                        int j3 = t5Var.j();
                        int q6 = t5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = t5Var.e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q6 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = t5Var.a();
                    if (a10 != null && (a2 = t5Var.f9866a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = t5Var.e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, t5Var.f9866a.f9731c)];
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

    public final u5 o(k1 k1Var) {
        for (ViewParent parent = k1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof u5) {
                return (u5) parent;
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
        int i17 = this.f9466c;
        int d = f8.d(this.f9464a);
        boolean z11 = this.f9833y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        k1 k1Var = this.f9829r;
        int measuredHeight = k1Var.getMeasuredHeight();
        a aVar = this.f9464a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f9428l) > 0) {
            i18 = AndroidUtilities.dp(hc.b.B(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        k1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, hc.b.g(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        d4 d4Var = this.f9830s;
        d4Var.layout(i14, dp, i19, d4Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f9466c) - f8.d(this.f9464a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        k1 k1Var = this.f9829r;
        k1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = k1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d4 d4Var = this.f9830s;
        d4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f9464a;
        if (aVar == null || (i12 = aVar.f9428l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(hc.b.B(i12, 1, 16, 10));
        }
        a aVar2 = this.f9464a;
        if (aVar2 != null && (i13 = aVar2.f9429m) > 0) {
            i14 = AndroidUtilities.dp(hc.b.B(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, d4Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F != null) {
            d4 d4Var = this.f9830s;
            int left = i10 - d4Var.getLeft();
            q5 q5Var = this.f9831w;
            int left2 = left - q5Var.getLeft();
            t5 t5Var = this.v;
            int scrollX = d4Var.getScrollX() + (left2 - t5Var.getLeft());
            int top = ((i11 - d4Var.getTop()) - q5Var.getTop()) - t5Var.getTop();
            if (t5Var.f9866a != null && scrollX >= (t5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < t5Var.e[0]) {
                int i12 = 1;
                if (t5Var.v()) {
                    int k10 = t5Var.k();
                    int r10 = t5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = t5Var.f9869f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = t5Var.a();
                if (a2 != null && (b10 = t5Var.f9866a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = t5Var.f9869f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, t5Var.f9866a.f9730b)];
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
        l6 l6Var = this.F;
        if (l6Var != null && (i12 = l6Var.f9730b) != 0 && l6Var.f9731c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.f9731c - 1))];
            if (pagetablecell != null) {
                post(new fg.s1(18, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        l6 l6Var = this.F;
        if (l6Var == null || l6Var.f9733g.isEmpty()) {
            return false;
        }
        u5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f9733g.get(0));
        if (m10 == null) {
            return false;
        }
        k1 k1Var = m10.f9892a;
        k1Var.r();
        k1Var.setSelection(0);
        return true;
    }

    public final boolean s(u5 u5Var, boolean z10) {
        int indexOf;
        int i10;
        l6 l6Var = this.F;
        if (l6Var != null && (indexOf = l6Var.f9733g.indexOf(u5Var.f9893b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.F.f9733g.size()) {
                u5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f9733g.get(i10));
                if (m10 != null) {
                    k1 k1Var = m10.f9892a;
                    k1Var.r();
                    k1Var.setSelection(k1Var.length());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void setCellSelectionListener(o5 o5Var) {
        this.I = o5Var;
    }

    public void setLocked(boolean z10) {
        this.f9829r.setLocked(z10);
        int i10 = 0;
        while (true) {
            t5 t5Var = this.v;
            if (i10 < t5Var.getChildCount()) {
                View childAt = t5Var.getChildAt(i10);
                if (childAt instanceof u5) {
                    ((u5) childAt).setLocked(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        o5 o5Var = this.I;
        if (o5Var != null) {
            z3 z3Var = ((w2) o5Var).f9924a;
            if (this == z3Var.f10004i4) {
                if (this.H.isEmpty()) {
                    z3Var.L2();
                } else if (!z3Var.B3) {
                    z3Var.E4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f9464a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = i6.f(this.f9829r.getText());
            }
        }
    }

    public final void v() {
        t5 t5Var = this.v;
        t5Var.s();
        t5Var.requestLayout();
        t5Var.invalidate();
        y();
        f3 f3Var = this.E;
        if (f3Var != null && this.f9464a != null) {
            f3Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        l6 l6Var = this.F;
        if (l6Var != null && pagetablecell != null) {
            int b10 = l6Var.b(pagetablecell);
            int a2 = this.F.a(pagetablecell);
            int b11 = this.F.b(pagetablecell2);
            int a10 = this.F.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.F.f9730b - 1;
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
                int i15 = this.F.f9731c - 1;
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
                            l6 l6Var2 = this.F;
                            TL_iv.pageTableCell pagetablecell3 = l6Var2.d[min][min2];
                            int i20 = l6Var2.e[min][min2];
                            int i21 = l6Var2.f9732f[min][min2];
                            int min5 = Math.min(l6Var2.f9730b - 1, (l6.o(pagetablecell3) + i20) - 1);
                            int i22 = this.F.f9731c - 1;
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
        this.f9830s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            t5 t5Var = this.v;
            if (i10 < t5Var.getChildCount()) {
                View childAt = t5Var.getChildAt(i10);
                if (childAt instanceof u5) {
                    u5 u5Var = (u5) childAt;
                    k1 k1Var = u5Var.f9892a;
                    k1Var.setListener(new l5(this, u5Var));
                    k1Var.setDelegate(new cb(15, this, u5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
