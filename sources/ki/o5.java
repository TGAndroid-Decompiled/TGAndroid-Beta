package ki;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;
public final class o5 extends a0 implements org.telegram.ui.ActionBar.y5, m9 {
    public c3 E;
    public g6 F;
    public boolean G;
    public final LinkedHashSet H;
    public l5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.d6 f15429n;
    public final h1 f15430r;
    public final a4 f15431s;
    public final q5 v;
    public final n5 f15432w;
    public final ArrayList f15433x;
    public boolean f15434y;

    public o5(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f15433x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.f15429n = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, d6Var);
        this.f15430r = h1Var;
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
        h1Var.setListener(new ya.d(this, 29));
        h1Var.setDelegate(new j5.b(this, 9));
        addView(h1Var);
        a4 a4Var = new a4(this, context, 1);
        this.f15431s = a4Var;
        a4Var.setClipChildren(false);
        a4Var.setClipToPadding(false);
        a4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(a4Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        q5 q5Var = new q5(context, d6Var);
        this.v = q5Var;
        n5 n5Var = new n5(this, context);
        this.f15432w = n5Var;
        n5Var.addView(q5Var);
        a4Var.addView(n5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void d() {
        h1 h1Var = this.f15430r;
        h1Var.t();
        int w02 = h6.w0(h6.G6, this.f15429n);
        h1Var.setTextColor(w02);
        h1Var.setHintTextColor(h6.m1(0.35f, w02));
        int i10 = 0;
        while (true) {
            q5 q5Var = this.v;
            if (i10 < q5Var.getChildCount()) {
                View childAt = q5Var.getChildAt(i10);
                if (childAt instanceof r5) {
                    ((r5) childAt).f15490a.t();
                }
                i10++;
            } else {
                q5Var.b();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n9 n9Var;
        super.dispatchDraw(canvas);
        if (this.F != null) {
            c3 c3Var = this.E;
            if (c3Var != null) {
                n9Var = c3Var.f15174a.getTextSelectionHelper();
            } else {
                n9Var = null;
            }
            if (n9Var != null) {
                ArrayList arrayList = this.f15433x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    y9 y9Var = (y9) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(y9Var.getX(), y9Var.getY());
                    n9Var.Z(canvas, this, i10);
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
            h1 h1Var2 = this.f15430r;
            Layout layout2 = h1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new j5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
            }
            int size = this.F.f15291g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.f15291g.get(i10);
                q5 q5Var = this.v;
                r5 m10 = q5Var.m(pagetablecell);
                if (m10 != null && (layout = (h1Var = m10.f15490a).getLayout()) != null) {
                    a4 a4Var = this.f15431s;
                    int left = a4Var.getLeft();
                    n5 n5Var = this.f15432w;
                    int paddingLeft = h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((q5Var.getLeft() + (n5Var.getLeft() + left)) - a4Var.getScrollX());
                    int top = a4Var.getTop();
                    arrayList.add(new k5(layout, paddingLeft, h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + q5Var.getTop() + n5Var.getTop() + top, this.F.b(pagetablecell) + 10, pagetablecell));
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

    public g6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.f15110a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public h1 getTitleEditText() {
        return this.f15430r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        g6 g6Var = this.F;
        if (g6Var == null || i10 <= 0 || i10 - 1 >= g6Var.f15291g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.f15291g.get(i11);
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
                        i10 = Math.max(i10, g6.n(pagetablecell) + this.F.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                g6 g6Var = this.F;
                if (g6Var.f15288b != 0 && (i11 = g6Var.f15289c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[g6Var.f15288b];
                    ArrayList arrayList = g6Var.f15291g;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList.get(i16);
                        i16++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = g6Var.b(pagetablecell2);
                        int a2 = g6Var.a(pagetablecell2);
                        int o10 = g6.o(pagetablecell2);
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
                            for (int i18 = b10; i18 < b10 + o10 && i18 < g6Var.f15288b; i18++) {
                                zArr[i18] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i15, o10, i17});
                    }
                    int i19 = 1;
                    int i20 = 0;
                    while (true) {
                        i13 = g6Var.f15288b;
                        if (i20 >= i13) {
                            break;
                        }
                        if (zArr[i20]) {
                            i14 = i19;
                        } else {
                            i14 = i19;
                            identityHashMap.put(g6.f(), new int[]{i20, i11, i14, i14});
                        }
                        i20++;
                        i19 = i14;
                    }
                    g6Var.j(identityHashMap, i13);
                    g6Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = g6Var.f15287a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(g6.f());
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
                            pagetablerow3.cells.add(g6.f());
                        }
                    }
                    g6Var.i();
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
                        i10 = Math.max(i10, g6.o(pagetablecell) + this.F.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                g6 g6Var = this.F;
                int i14 = g6Var.f15288b;
                if (i14 != 0 && g6Var.f15289c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i14) {
                        i14 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[g6Var.f15289c];
                    ArrayList arrayList = g6Var.f15291g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = g6Var.b(pagetablecell2);
                        int a2 = g6Var.a(pagetablecell2);
                        int o10 = g6.o(pagetablecell2);
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
                            for (int i17 = a2; i17 < a2 + i16 && i17 < g6Var.f15289c; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i13, a2, o10, i16});
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (i19 < g6Var.f15289c) {
                        if (zArr[i19]) {
                            i12 = i18;
                        } else {
                            i12 = i18;
                            identityHashMap.put(g6.f(), new int[]{i14, i19, i12, i12});
                        }
                        i19++;
                        i18 = i12;
                    }
                    g6Var.j(identityHashMap, g6Var.f15288b + i18);
                    g6Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(g6Var.f15289c, 1);
                    for (int i20 = 0; i20 < max; i20++) {
                        pagetablerow.cells.add(g6.f());
                    }
                    g6Var.f15287a.rows.add(pagetablerow);
                    g6Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        g6 g6Var = this.F;
        if (g6Var == null || (indexOf = g6Var.f15291g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final h1 l(int i10) {
        r5 m10;
        if (i10 == 0) {
            return this.f15430r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f15490a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.F != null) {
            a4 a4Var = this.f15431s;
            int left = i10 - a4Var.getLeft();
            n5 n5Var = this.f15432w;
            int left2 = left - n5Var.getLeft();
            q5 q5Var = this.v;
            int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
            int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
            for (int i12 = 0; i12 < q5Var.getChildCount(); i12++) {
                View childAt = q5Var.getChildAt(i12);
                if (childAt instanceof r5) {
                    r5 r5Var = (r5) childAt;
                    if (scrollX >= r5Var.getLeft() && scrollX < r5Var.getRight() && top >= r5Var.getTop() && top < r5Var.getBottom()) {
                        return r5Var.f15491b;
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
            a4 a4Var = this.f15431s;
            int left = i10 - a4Var.getLeft();
            n5 n5Var = this.f15432w;
            int left2 = left - n5Var.getLeft();
            q5 q5Var = this.v;
            int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
            int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
            g6 g6Var = q5Var.f15465a;
            if (g6Var != null && top >= (i12 = q5Var.f15468f[g6Var.f15288b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (q5Var.u()) {
                        int j10 = q5Var.j();
                        int q6 = q5Var.q();
                        if (j10 >= 0) {
                            int[] iArr = q5Var.e;
                            if (scrollX >= iArr[j10] && scrollX < iArr[q6 + 1]) {
                                return j10;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = q5Var.a();
                    if (a10 != null && (a2 = q5Var.f15465a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = q5Var.e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, q5Var.f15465a.f15289c)];
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

    public final r5 o(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
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
        int i17 = this.f15112c;
        int d = w7.i.d(this.f15110a);
        boolean z11 = this.f15434y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        h1 h1Var = this.f15430r;
        int measuredHeight = h1Var.getMeasuredHeight();
        a aVar = this.f15110a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f15101l) > 0) {
            i18 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        h1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, org.telegram.messenger.g0.b(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        a4 a4Var = this.f15431s;
        a4Var.layout(i14, dp, i19, a4Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f15112c) - w7.i.d(this.f15110a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.f15430r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        a4 a4Var = this.f15431s;
        a4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f15110a;
        if (aVar == null || (i12 = aVar.f15101l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i12, 1, 16, 10));
        }
        a aVar2 = this.f15110a;
        if (aVar2 != null && (i13 = aVar2.f15102m) > 0) {
            i14 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, a4Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F != null) {
            a4 a4Var = this.f15431s;
            int left = i10 - a4Var.getLeft();
            n5 n5Var = this.f15432w;
            int left2 = left - n5Var.getLeft();
            q5 q5Var = this.v;
            int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
            int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
            if (q5Var.f15465a != null && scrollX >= (q5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < q5Var.e[0]) {
                int i12 = 1;
                if (q5Var.v()) {
                    int k10 = q5Var.k();
                    int r10 = q5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = q5Var.f15468f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = q5Var.a();
                if (a2 != null && (b10 = q5Var.f15465a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = q5Var.f15468f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, q5Var.f15465a.f15288b)];
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
        g6 g6Var = this.F;
        if (g6Var != null && (i12 = g6Var.f15288b) != 0 && g6Var.f15289c != 0) {
            TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.f15289c - 1))];
            if (pagetablecell != null) {
                post(new hi.t(27, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        g6 g6Var = this.F;
        if (g6Var == null || g6Var.f15291g.isEmpty()) {
            return false;
        }
        r5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f15291g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.f15490a;
        h1Var.r();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean s(r5 r5Var, boolean z10) {
        int indexOf;
        int i10;
        g6 g6Var = this.F;
        if (g6Var != null && (indexOf = g6Var.f15291g.indexOf(r5Var.f15491b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.F.f15291g.size()) {
                r5 m10 = this.v.m((TL_iv.pageTableCell) this.F.f15291g.get(i10));
                if (m10 != null) {
                    h1 h1Var = m10.f15490a;
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

    public void setCellSelectionListener(l5 l5Var) {
        this.I = l5Var;
    }

    public void setLocked(boolean z10) {
        this.f15430r.setLocked(z10);
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
            w3 w3Var = ((t2) l5Var).f15525a;
            if (this == w3Var.f15594g4) {
                if (this.H.isEmpty()) {
                    w3Var.N2();
                } else if (!w3Var.f15620z3) {
                    w3Var.G4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f15110a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15094b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = e6.f(this.f15430r.getText());
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
        if (c3Var != null && this.f15110a != null) {
            c3Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        g6 g6Var = this.F;
        if (g6Var != null && pagetablecell != null) {
            int b10 = g6Var.b(pagetablecell);
            int a2 = this.F.a(pagetablecell);
            int b11 = this.F.b(pagetablecell2);
            int a10 = this.F.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.F.f15288b - 1;
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
                int i15 = this.F.f15289c - 1;
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
                            g6 g6Var2 = this.F;
                            TL_iv.pageTableCell pagetablecell3 = g6Var2.d[min][min2];
                            int i20 = g6Var2.e[min][min2];
                            int i21 = g6Var2.f15290f[min][min2];
                            int min5 = Math.min(g6Var2.f15288b - 1, (g6.o(pagetablecell3) + i20) - 1);
                            int i22 = this.F.f15289c - 1;
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
        this.f15431s.invalidate();
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
                    h1 h1Var = r5Var.f15490a;
                    h1Var.setListener(new i5(this, r5Var));
                    h1Var.setDelegate(new ah.h0(25, this, r5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
