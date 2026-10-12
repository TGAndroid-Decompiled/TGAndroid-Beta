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
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;
import v7.u8;
public final class u5 extends a0 implements org.telegram.ui.ActionBar.x5, n9 {
    public d3 E;
    public m6 F;
    public boolean G;
    public final LinkedHashSet H;
    public r5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.c6 f13560n;
    public final h1 f13561r;
    public final b4 f13562s;
    public final w5 v;
    public final t5 f13563w;
    public final ArrayList f13564x;
    public boolean f13565y;

    public u5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13564x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.f13560n = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, c6Var);
        this.f13561r = h1Var;
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
        h1Var.setListener(new d4(this, 1));
        h1Var.setDelegate(new f1.a(this, 29));
        addView(h1Var);
        b4 b4Var = new b4(this, context, 1);
        this.f13562s = b4Var;
        b4Var.setClipChildren(false);
        b4Var.setClipToPadding(false);
        b4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(b4Var, w7.a6.a(-2.0f, 0.0f, 6.0f, 0.0f, 0.0f, -1, 51));
        w5 w5Var = new w5(context, c6Var);
        this.v = w5Var;
        t5 t5Var = new t5(this, context);
        this.f13563w = t5Var;
        t5Var.addView(w5Var);
        b4Var.addView(t5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void d() {
        h1 h1Var = this.f13561r;
        h1Var.t();
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.f13560n);
        h1Var.setTextColor(w02);
        h1Var.setHintTextColor(org.telegram.ui.ActionBar.g6.m1(0.35f, w02));
        int i10 = 0;
        while (true) {
            w5 w5Var = this.v;
            if (i10 < w5Var.getChildCount()) {
                View childAt = w5Var.getChildAt(i10);
                if (childAt instanceof x5) {
                    ((x5) childAt).f13658a.t();
                }
                i10++;
            } else {
                w5Var.b();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            d3 d3Var = this.E;
            if (d3Var != null) {
                o9Var = d3Var.f13231a.getTextSelectionHelper();
            } else {
                o9Var = null;
            }
            if (o9Var != null) {
                ArrayList arrayList = this.f13564x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z9 z9Var = (z9) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(z9Var.getX(), z9Var.getY());
                    o9Var.Z(canvas, this, i10);
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
            h1 h1Var2 = this.f13561r;
            Layout layout2 = h1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new p5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
            }
            int size = this.F.f13416g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f13416g.get(i10);
                w5 w5Var = this.v;
                x5 m10 = w5Var.m(pagetablecell);
                if (m10 != null && (layout = (h1Var = m10.f13658a).getLayout()) != null) {
                    b4 b4Var = this.f13562s;
                    int left = b4Var.getLeft();
                    t5 t5Var = this.f13563w;
                    int paddingLeft = h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((w5Var.getLeft() + (t5Var.getLeft() + left)) - b4Var.getScrollX());
                    int top = b4Var.getTop();
                    arrayList.add(new q5(layout, paddingLeft, h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + w5Var.getTop() + t5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public w5 getGrid() {
        return this.v;
    }

    public m6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f13119a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public h1 getTitleEditText() {
        return this.f13561r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        m6 m6Var = this.F;
        if (m6Var == null || i10 <= 0 || i10 - 1 >= m6Var.f13416g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f13416g.get(i11);
    }

    public final void i(boolean z10) {
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
                        i10 = Math.max(i10, m6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                m6 m6Var = this.F;
                if (m6Var.f13413b != 0 && (i11 = m6Var.f13414c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[m6Var.f13413b];
                    ArrayList arrayList = m6Var.f13416g;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList.get(i16);
                        i16++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = m6Var.b(pagetablecell2);
                        int a2 = m6Var.a(pagetablecell2);
                        int o10 = m6.o(pagetablecell2);
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
                            for (int i18 = b10; i18 < b10 + o10 && i18 < m6Var.f13413b; i18++) {
                                zArr[i18] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i15, o10, i17});
                    }
                    int i19 = 1;
                    int i20 = 0;
                    while (true) {
                        i13 = m6Var.f13413b;
                        if (i20 >= i13) {
                            break;
                        }
                        if (zArr[i20]) {
                            i14 = i19;
                        } else {
                            i14 = i19;
                            identityHashMap.put(m6.f(), new int[]{i20, i11, i14, i14});
                        }
                        i20++;
                        i19 = i14;
                    }
                    m6Var.j(identityHashMap, i13);
                    m6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = m6Var.f13412a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(m6.f());
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
                            pagetablerow3.cells.add(m6.f());
                        }
                    }
                    m6Var.i();
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
        w5 w5Var = this.v;
        if (w5Var != null) {
            w5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
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
                        i10 = Math.max(i10, m6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                m6 m6Var = this.F;
                int i14 = m6Var.f13413b;
                if (i14 != 0 && m6Var.f13414c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i14) {
                        i14 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[m6Var.f13414c];
                    ArrayList arrayList = m6Var.f13416g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = m6Var.b(pagetablecell2);
                        int a2 = m6Var.a(pagetablecell2);
                        int o10 = m6.o(pagetablecell2);
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
                            for (int i17 = a2; i17 < a2 + i16 && i17 < m6Var.f13414c; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i13, a2, o10, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (i19 < m6Var.f13414c) {
                        if (zArr[i19]) {
                            i12 = i18;
                        } else {
                            i12 = i18;
                            identityHashMap.put(m6.f(), new int[]{i14, i19, i12, i12});
                        }
                        i19++;
                        i18 = i12;
                    }
                    m6Var.j(identityHashMap, m6Var.f13413b + i18);
                    m6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(m6Var.f13414c, 1);
                    for (int i20 = 0; i20 < max; i20++) {
                        pagetablerow.cells.add(m6.f());
                    }
                    m6Var.f13412a.rows.add(pagetablerow);
                    m6Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        m6 m6Var = this.F;
        if (m6Var == null || (indexOf = m6Var.f13416g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final h1 l(int i10) {
        x5 m10;
        if (i10 == 0) {
            return this.f13561r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f13658a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.F != null) {
            b4 b4Var = this.f13562s;
            int left = i10 - b4Var.getLeft();
            t5 t5Var = this.f13563w;
            int left2 = left - t5Var.getLeft();
            w5 w5Var = this.v;
            int scrollX = b4Var.getScrollX() + (left2 - w5Var.getLeft());
            int top = ((i11 - b4Var.getTop()) - t5Var.getTop()) - w5Var.getTop();
            for (int i12 = 0; i12 < w5Var.getChildCount(); i12++) {
                View childAt = w5Var.getChildAt(i12);
                if (childAt instanceof x5) {
                    x5 x5Var = (x5) childAt;
                    if (scrollX >= x5Var.getLeft() && scrollX < x5Var.getRight() && top >= x5Var.getTop() && top < x5Var.getBottom()) {
                        return x5Var.f13659b;
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
            b4 b4Var = this.f13562s;
            int left = i10 - b4Var.getLeft();
            t5 t5Var = this.f13563w;
            int left2 = left - t5Var.getLeft();
            w5 w5Var = this.v;
            int scrollX = b4Var.getScrollX() + (left2 - w5Var.getLeft());
            int top = ((i11 - b4Var.getTop()) - t5Var.getTop()) - w5Var.getTop();
            m6 m6Var = w5Var.f13593a;
            if (m6Var != null && top >= (i12 = w5Var.f13596f[m6Var.f13413b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (w5Var.u()) {
                        int j10 = w5Var.j();
                        int q6 = w5Var.q();
                        if (j10 >= 0) {
                            int[] iArr = w5Var.e;
                            if (scrollX >= iArr[j10] && scrollX < iArr[q6 + 1]) {
                                return j10;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = w5Var.a();
                    if (a10 != null && (a2 = w5Var.f13593a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = w5Var.e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, w5Var.f13593a.f13414c)];
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

    public final x5 o(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof x5) {
                return (x5) parent;
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
        int i17 = this.f13121c;
        int d = u8.d(this.f13119a);
        boolean z11 = this.f13565y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        h1 h1Var = this.f13561r;
        int measuredHeight = h1Var.getMeasuredHeight();
        a aVar = this.f13119a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f13110l) > 0) {
            i18 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        h1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, org.telegram.messenger.q.c(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        b4 b4Var = this.f13562s;
        b4Var.layout(i14, dp, i19, b4Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f13121c) - u8.d(this.f13119a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.f13561r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        b4 b4Var = this.f13562s;
        b4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f13119a;
        if (aVar == null || (i12 = aVar.f13110l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i12, 1, 16, 10));
        }
        a aVar2 = this.f13119a;
        if (aVar2 != null && (i13 = aVar2.f13111m) > 0) {
            i14 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, b4Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F != null) {
            b4 b4Var = this.f13562s;
            int left = i10 - b4Var.getLeft();
            t5 t5Var = this.f13563w;
            int left2 = left - t5Var.getLeft();
            w5 w5Var = this.v;
            int scrollX = b4Var.getScrollX() + (left2 - w5Var.getLeft());
            int top = ((i11 - b4Var.getTop()) - t5Var.getTop()) - w5Var.getTop();
            if (w5Var.f13593a != null && scrollX >= (w5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < w5Var.e[0]) {
                int i12 = 1;
                if (w5Var.v()) {
                    int k10 = w5Var.k();
                    int r10 = w5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = w5Var.f13596f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = w5Var.a();
                if (a2 != null && (b10 = w5Var.f13593a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = w5Var.f13596f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, w5Var.f13593a.f13413b)];
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
        m6 m6Var = this.F;
        if (m6Var != null && (i12 = m6Var.f13413b) != 0 && m6Var.f13414c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.f13414c - 1))];
            if (pagetablecell != null) {
                post(new v2(4, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        m6 m6Var = this.F;
        if (m6Var == null || m6Var.f13416g.isEmpty()) {
            return false;
        }
        x5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f13416g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.f13658a;
        h1Var.r();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean s(x5 x5Var, boolean z10) {
        int indexOf;
        int i10;
        m6 m6Var = this.F;
        if (m6Var != null && (indexOf = m6Var.f13416g.indexOf(x5Var.f13659b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.F.f13416g.size()) {
                x5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f13416g.get(i10));
                if (m10 != null) {
                    h1 h1Var = m10.f13658a;
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

    public void setCellSelectionListener(r5 r5Var) {
        this.I = r5Var;
    }

    public void setLocked(boolean z10) {
        this.f13561r.setLocked(z10);
        int i10 = 0;
        while (true) {
            w5 w5Var = this.v;
            if (i10 < w5Var.getChildCount()) {
                View childAt = w5Var.getChildAt(i10);
                if (childAt instanceof x5) {
                    ((x5) childAt).setLocked(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        r5 r5Var = this.I;
        if (r5Var != null) {
            x3 x3Var = ((t2) r5Var).f13525a;
            if (this == x3Var.f13630g4) {
                if (this.H.isEmpty()) {
                    x3Var.N2();
                } else if (!x3Var.f13656z3) {
                    x3Var.G4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f13119a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13103b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = k6.f(this.f13561r.getText());
            }
        }
    }

    public final void v() {
        w5 w5Var = this.v;
        w5Var.s();
        w5Var.requestLayout();
        w5Var.invalidate();
        y();
        d3 d3Var = this.E;
        if (d3Var != null && this.f13119a != null) {
            d3Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        m6 m6Var = this.F;
        if (m6Var != null && pagetablecell != null) {
            int b10 = m6Var.b(pagetablecell);
            int a2 = this.F.a(pagetablecell);
            int b11 = this.F.b(pagetablecell2);
            int a10 = this.F.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.F.f13413b - 1;
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
                int i15 = this.F.f13414c - 1;
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
                            m6 m6Var2 = this.F;
                            TL_iv.pageTableCell pagetablecell3 = m6Var2.d[min][min2];
                            int i20 = m6Var2.e[min][min2];
                            int i21 = m6Var2.f13415f[min][min2];
                            int min5 = Math.min(m6Var2.f13413b - 1, (m6.o(pagetablecell3) + i20) - 1);
                            int i22 = this.F.f13414c - 1;
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
        this.f13562s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            w5 w5Var = this.v;
            if (i10 < w5Var.getChildCount()) {
                View childAt = w5Var.getChildAt(i10);
                if (childAt instanceof x5) {
                    x5 x5Var = (x5) childAt;
                    h1 h1Var = x5Var.f13658a;
                    h1Var.setListener(new o5(this, x5Var));
                    h1Var.setDelegate(new ah.h0(23, this, x5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
