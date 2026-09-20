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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import v7.p8;
public final class o5 extends a0 implements org.telegram.ui.ActionBar.z5, q9 {
    public c3 E;
    public h6 F;
    public boolean G;
    public final LinkedHashSet H;
    public l5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.f6 f11543n;
    public final i1 f11544r;
    public final a4 f11545s;
    public final q5 v;
    public final n5 f11546w;
    public final ArrayList f11547x;
    public boolean f11548y;

    public o5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f11547x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.f11543n = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        i1 i1Var = new i1(context, f6Var);
        this.f11544r = i1Var;
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
        i1Var.setDelegate(new ei.d5(this, 21));
        addView(i1Var);
        a4 a4Var = new a4(this, context, 1);
        this.f11545s = a4Var;
        a4Var.setClipChildren(false);
        a4Var.setClipToPadding(false);
        a4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(a4Var, w7.y5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        q5 q5Var = new q5(context, f6Var);
        this.v = q5Var;
        n5 n5Var = new n5(this, context);
        this.f11546w = n5Var;
        n5Var.addView(q5Var);
        a4Var.addView(n5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        r9 r9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            c3 c3Var = this.E;
            if (c3Var != null) {
                r9Var = c3Var.f11287a.getTextSelectionHelper();
            } else {
                r9Var = null;
            }
            if (r9Var != null) {
                ArrayList arrayList = this.f11547x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ca caVar = (ca) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(caVar.getX(), caVar.getY());
                    r9Var.a0(canvas, this, i10);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e() {
        i1 i1Var = this.f11544r;
        i1Var.t();
        int v02 = j6.v0(j6.G6, this.f11543n);
        i1Var.setTextColor(v02);
        i1Var.setHintTextColor(j6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            q5 q5Var = this.v;
            if (i10 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i10);
                if (childAt instanceof r5) {
                    ((r5) childAt).f11607a.t();
                }
                i10++;
            } else {
                q5Var.b();
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
            i1 i1Var2 = this.f11544r;
            Layout layout2 = i1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new j5(this, layout2, i1Var2.getPaddingLeft() + i1Var2.getLeft(), i1Var2.getPaddingTop() + i1Var2.getTop()));
            }
            int size = this.F.f11427g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f11427g.get(i10);
                q5 q5Var = this.v;
                r5 m10 = q5Var.m(pagetablecell);
                if (m10 != null && (layout = (i1Var = m10.f11607a).getLayout()) != null) {
                    a4 a4Var = this.f11545s;
                    int left = a4Var.getLeft();
                    n5 n5Var = this.f11546w;
                    int paddingLeft = i1Var.getPaddingLeft() + i1Var.getLeft() + m10.getLeft() + ((q5Var.getLeft() + (n5Var.getLeft() + left)) - a4Var.getScrollX());
                    int top = a4Var.getTop();
                    arrayList.add(new k5(layout, paddingLeft, i1Var.getPaddingTop() + i1Var.getTop() + m10.getTop() + q5Var.getTop() + n5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public q5 getGrid() {
        return this.v;
    }

    public h6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f11221a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public i1 getTitleEditText() {
        return this.f11544r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        h6 h6Var = this.F;
        if (h6Var == null || i10 <= 0 || i10 - 1 >= h6Var.f11427g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f11427g.get(i11);
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
                        i10 = Math.max(i10, h6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                h6 h6Var = this.F;
                if (h6Var.f11424b != 0 && (i11 = h6Var.f11425c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[h6Var.f11424b];
                    ArrayList arrayList = h6Var.f11427g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = h6Var.b(pagetablecell2);
                        int a2 = h6Var.a(pagetablecell2);
                        int o9 = h6.o(pagetablecell2);
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
                            for (int i17 = b10; i17 < b10 + o9 && i17 < h6Var.f11424b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o9, i16});
                    }
                    int i18 = 0;
                    while (true) {
                        i13 = h6Var.f11424b;
                        if (i18 >= i13) {
                            break;
                        }
                        if (!zArr[i18]) {
                            identityHashMap.put(h6.f(), new int[]{i18, i11, 1, 1});
                        }
                        i18++;
                    }
                    h6Var.j(identityHashMap, i13);
                    h6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = h6Var.f11423a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(h6.f());
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
                            pagetablerow3.cells.add(h6.f());
                        }
                    }
                    h6Var.i();
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
        q5 q5Var = this.v;
        if (q5Var != null) {
            q5Var.invalidate();
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
                        i10 = Math.max(i10, h6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                h6 h6Var = this.F;
                int i13 = h6Var.f11424b;
                if (i13 != 0 && h6Var.f11425c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i13) {
                        i13 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[h6Var.f11425c];
                    ArrayList arrayList = h6Var.f11427g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = h6Var.b(pagetablecell2);
                        int a2 = h6Var.a(pagetablecell2);
                        int o9 = h6.o(pagetablecell2);
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
                            for (int i16 = a2; i16 < a2 + i15 && i16 < h6Var.f11425c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a2, o9, i15});
                    }
                    for (int i17 = 0; i17 < h6Var.f11425c; i17++) {
                        if (!zArr[i17]) {
                            identityHashMap.put(h6.f(), new int[]{i13, i17, 1, 1});
                        }
                    }
                    h6Var.j(identityHashMap, h6Var.f11424b + 1);
                    h6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(h6Var.f11425c, 1);
                    for (int i18 = 0; i18 < max; i18++) {
                        pagetablerow.cells.add(h6.f());
                    }
                    h6Var.f11423a.rows.add(pagetablerow);
                    h6Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        h6 h6Var = this.F;
        if (h6Var == null || (indexOf = h6Var.f11427g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final i1 l(int i10) {
        r5 m10;
        if (i10 == 0) {
            return this.f11544r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f11607a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.F != null) {
            a4 a4Var = this.f11545s;
            int left = i10 - a4Var.getLeft();
            n5 n5Var = this.f11546w;
            int left2 = left - n5Var.getLeft();
            q5 q5Var = this.v;
            int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
            int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
            for (int i12 = 0; i12 < q5Var.getChildCount(); i12++) {
                View childAt = q5Var.getChildAt(i12);
                if (childAt instanceof r5) {
                    r5 r5Var = (r5) childAt;
                    if (scrollX >= r5Var.getLeft() && scrollX < r5Var.getRight() && top >= r5Var.getTop() && top < r5Var.getBottom()) {
                        return r5Var.f11608b;
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
            a4 a4Var = this.f11545s;
            int left = i10 - a4Var.getLeft();
            n5 n5Var = this.f11546w;
            int left2 = left - n5Var.getLeft();
            q5 q5Var = this.v;
            int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
            int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
            h6 h6Var = q5Var.f11581a;
            if (h6Var != null && top >= (i12 = q5Var.f11584f[h6Var.f11424b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (q5Var.u()) {
                        int j3 = q5Var.j();
                        int q6 = q5Var.q();
                        if (j3 >= 0) {
                            int[] iArr = q5Var.e;
                            if (scrollX >= iArr[j3] && scrollX < iArr[q6 + 1]) {
                                return j3;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = q5Var.a();
                    if (a10 != null && (a2 = q5Var.f11581a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = q5Var.e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, q5Var.f11581a.f11425c)];
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

    public final r5 o(i1 i1Var) {
        for (ViewParent parent = i1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof r5) {
                return (r5) parent;
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
        int i17 = this.f11223c;
        int d = p8.d(this.f11221a);
        boolean z11 = this.f11548y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        i1 i1Var = this.f11544r;
        int measuredHeight = i1Var.getMeasuredHeight();
        a aVar = this.f11221a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f11212l) > 0) {
            i18 = AndroidUtilities.dp(hg.k0.f(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        i1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, org.telegram.messenger.l0.b(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        a4 a4Var = this.f11545s;
        a4Var.layout(i14, dp, i19, a4Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f11223c) - p8.d(this.f11221a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i1 i1Var = this.f11544r;
        i1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = i1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        a4 a4Var = this.f11545s;
        a4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f11221a;
        if (aVar == null || (i12 = aVar.f11212l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(hg.k0.f(i12, 1, 16, 10));
        }
        a aVar2 = this.f11221a;
        if (aVar2 != null && (i13 = aVar2.f11213m) > 0) {
            i14 = AndroidUtilities.dp(hg.k0.f(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, a4Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F != null) {
            a4 a4Var = this.f11545s;
            int left = i10 - a4Var.getLeft();
            n5 n5Var = this.f11546w;
            int left2 = left - n5Var.getLeft();
            q5 q5Var = this.v;
            int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
            int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
            if (q5Var.f11581a != null && scrollX >= (q5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < q5Var.e[0]) {
                int i12 = 1;
                if (q5Var.v()) {
                    int k10 = q5Var.k();
                    int r10 = q5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = q5Var.f11584f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = q5Var.a();
                if (a2 != null && (b10 = q5Var.f11581a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = q5Var.f11584f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, q5Var.f11581a.f11424b)];
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
        h6 h6Var = this.F;
        if (h6Var != null && (i12 = h6Var.f11424b) != 0 && h6Var.f11425c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.f11425c - 1))];
            if (pagetablecell != null) {
                post(new gg.x1(19, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        h6 h6Var = this.F;
        if (h6Var == null || h6Var.f11427g.isEmpty()) {
            return false;
        }
        r5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f11427g.get(0));
        if (m10 == null) {
            return false;
        }
        i1 i1Var = m10.f11607a;
        i1Var.r();
        i1Var.setSelection(0);
        return true;
    }

    public final boolean s(r5 r5Var, boolean z10) {
        int indexOf;
        int i10;
        h6 h6Var = this.F;
        if (h6Var != null && (indexOf = h6Var.f11427g.indexOf(r5Var.f11608b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.F.f11427g.size()) {
                r5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f11427g.get(i10));
                if (m10 != null) {
                    i1 i1Var = m10.f11607a;
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

    public void setCellSelectionListener(l5 l5Var) {
        this.I = l5Var;
    }

    public void setLocked(boolean z10) {
        this.f11544r.setLocked(z10);
        int i10 = 0;
        while (true) {
            q5 q5Var = this.v;
            if (i10 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i10);
                if (childAt instanceof r5) {
                    ((r5) childAt).setLocked(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        l5 l5Var = this.I;
        if (l5Var != null) {
            w3 w3Var = ((t2) l5Var).f11632a;
            if (this == w3Var.f11718i4) {
                if (this.H.isEmpty()) {
                    w3Var.N2();
                } else if (!w3Var.B3) {
                    w3Var.G4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f11221a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11205b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = f6.f(this.f11544r.getText());
            }
        }
    }

    public final void v() {
        q5 q5Var = this.v;
        q5Var.s();
        q5Var.requestLayout();
        q5Var.invalidate();
        y();
        c3 c3Var = this.E;
        if (c3Var != null && this.f11221a != null) {
            c3Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
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
                int i11 = this.F.f11424b - 1;
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
                int i15 = this.F.f11425c - 1;
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
                            int i21 = h6Var2.f11426f[min][min2];
                            int min5 = Math.min(h6Var2.f11424b - 1, (h6.o(pagetablecell3) + i20) - 1);
                            int i22 = this.F.f11425c - 1;
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
        this.f11545s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            q5 q5Var = this.v;
            if (i10 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i10);
                if (childAt instanceof r5) {
                    r5 r5Var = (r5) childAt;
                    i1 i1Var = r5Var.f11607a;
                    i1Var.setListener(new i5(this, r5Var));
                    i1Var.setDelegate(new ah.b(19, this, r5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
