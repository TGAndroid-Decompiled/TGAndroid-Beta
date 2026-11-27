package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public class amb extends mmb {
    public boolean E0;
    public int r0;
    public int u0;
    public x46 z0;
    public int p0 = -1;
    public int q0 = -1;
    public int s0 = -1;
    public int t0 = -1;
    public int v0 = -1;
    public final SparseArray w0 = new SparseArray();
    public final SparseArray x0 = new SparseArray();
    public final SparseIntArray y0 = new SparseIntArray();
    public final ArrayList A0 = new ArrayList();
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = 0;

    public amb() {
        this.Z = true;
    }

    public static CharSequence X(CharSequence charSequence) {
        Object[] spans;
        if (charSequence == null) {
            return "";
        }
        if (!(charSequence instanceof Spanned)) {
            return charSequence.toString();
        }
        Spanned spanned = (Spanned) charSequence;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            if (!(obj instanceof TextWatcher) && !(obj instanceof SpanWatcher) && !(obj instanceof NoCopySpan)) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (spanStart >= 0 && spanEnd >= spanStart && spanStart <= spannableStringBuilder.length()) {
                    spannableStringBuilder.setSpan(obj, spanStart, Math.min(spanEnd, spannableStringBuilder.length()), spanned.getSpanFlags(obj));
                }
            }
        }
        return spannableStringBuilder;
    }

    @Override
    public void E() {
        int i;
        int c0 = c0((zlb) this.W);
        if (this.E0) {
            i = this.q0;
        } else {
            i = this.t0;
        }
        if (c0 == this.p0 && i == this.q0) {
            this.r0 = this.u;
        }
        if (c0 == this.s0 && i == this.t0) {
            this.u0 = this.v;
        }
    }

    @Override
    public final void K(hmb hmbVar, hmb hmbVar2) {
        zlb zlbVar = (zlb) hmbVar;
        zlb zlbVar2 = (zlb) hmbVar2;
        int c0 = c0(zlbVar);
        if (c0 >= 0) {
            this.s0 = c0;
            this.p0 = c0;
            int i = this.v0;
            this.t0 = i;
            this.q0 = i;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            zlbVar.k(arrayList);
            int size = arrayList.size();
            this.y0.put(c0, size);
            for (int i2 = 0; i2 < size; i2++) {
                V(c0, i2, (kmb) arrayList.get(i2));
            }
        }
    }

    @Override
    public final void M() {
        zlb zlbVar;
        if (w()) {
            this.E0 = false;
            int i = this.s0;
            if (i >= 0) {
                x46 x46Var = this.z0;
                if (x46Var != null) {
                    zlbVar = (zlb) x46Var.m(i);
                } else if (i < this.F.getChildCount()) {
                    zlbVar = (zlb) this.F.getChildAt(this.s0);
                } else {
                    zlbVar = null;
                }
                if (zlbVar == null) {
                    this.W = null;
                    return;
                }
                this.W = zlbVar;
                if (this.p0 != this.s0) {
                    this.u = 0;
                } else if (this.q0 != this.t0) {
                    this.u = 0;
                } else {
                    this.u = this.r0;
                }
                this.v = this.u0;
                CharSequence r = r(zlbVar, false);
                if (this.v > r.length()) {
                    this.v = r.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((zlb) this.W).k(arrayList);
                int i2 = this.t0;
                if (i2 >= 0 && i2 < arrayList.size()) {
                    this.a = ((kmb) arrayList.get(this.t0)).getX();
                    this.b = ((kmb) arrayList.get(this.t0)).getY();
                }
            }
        }
    }

    @Override
    public final void N() {
        zlb zlbVar;
        if (w()) {
            this.E0 = true;
            int i = this.p0;
            if (i >= 0) {
                x46 x46Var = this.z0;
                if (x46Var != null) {
                    zlbVar = (zlb) x46Var.m(i);
                } else if (this.s0 < this.F.getChildCount()) {
                    zlbVar = (zlb) this.F.getChildAt(this.p0);
                } else {
                    zlbVar = null;
                }
                if (zlbVar == null) {
                    this.W = null;
                    return;
                }
                this.W = zlbVar;
                if (this.p0 != this.s0) {
                    this.v = r(zlbVar, false).length();
                } else if (this.q0 != this.t0) {
                    this.v = r(zlbVar, false).length();
                } else {
                    this.v = this.u0;
                }
                this.u = this.r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((zlb) this.W).k(arrayList);
                int i2 = this.q0;
                if (i2 >= 0 && i2 < arrayList.size()) {
                    this.a = ((kmb) arrayList.get(this.q0)).getX();
                    this.b = ((kmb) arrayList.get(this.q0)).getY();
                }
            }
        }
    }

    @Override
    public final boolean O(int i, int i2) {
        int i3;
        if (this.Z) {
            if (i2 > ((zlb) this.W).getTop() && i2 < ((zlb) this.W).getBottom()) {
                if (this.E0) {
                    i3 = this.q0;
                } else {
                    i3 = this.t0;
                }
                int b0 = b0((int) (i - ((zlb) this.W).getX()), (int) (i2 - ((zlb) this.W).getY()), (zlb) this.W);
                if (b0 != i3 && b0 >= 0) {
                    zlb zlbVar = (zlb) this.W;
                    f0(zlbVar, zlbVar, b0);
                    return true;
                }
            } else {
                int childCount = this.F.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    if (e0(this.F.getChildAt(i4))) {
                        zlb zlbVar2 = (zlb) this.F.getChildAt(i4);
                        if (i2 > zlbVar2.getTop() && i2 < zlbVar2.getBottom()) {
                            int b02 = b0((int) (i - zlbVar2.getX()), (int) (i2 - zlbVar2.getY()), zlbVar2);
                            if (b02 >= 0) {
                                f0((zlb) this.W, zlbVar2, b02);
                                this.W = zlbVar2;
                                return true;
                            }
                        }
                    }
                    i4++;
                }
            }
        }
        return false;
    }

    public final void V(int i, int i2, kmb kmbVar) {
        int i3 = i + (i2 << 16);
        this.w0.put(i3, X(kmbVar.getText()));
        CharSequence prefix = kmbVar.getPrefix();
        SparseArray sparseArray = this.x0;
        if (prefix == null) {
            sparseArray.remove(i3);
        } else {
            sparseArray.put(i3, X(prefix));
        }
    }

    public final void W(int i, String str) {
        this.w0.put(i, X(str));
        this.x0.remove(i);
        SparseIntArray sparseIntArray = this.y0;
        sparseIntArray.put(i, Math.max(1, sparseIntArray.get(i)));
    }

    public final void Y(Canvas canvas, zlb zlbVar, int i) {
        kmb kmbVar;
        int i2;
        int i3;
        int i4 = aob.lg;
        this.o.setColor(aob.v0(i4, this.g0));
        this.p.setColor(aob.v0(i4, this.g0));
        int c0 = c0(zlbVar);
        if (c0 >= 0) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            zlbVar.k(arrayList);
            if (i >= 0 && i < arrayList.size() && (kmbVar = (kmb) arrayList.get(i)) != null && kmbVar.a() != null && kmbVar.a().getText() != null) {
                int i5 = this.u0;
                int length = kmbVar.a().getText().length();
                if (i5 > length) {
                    i5 = length;
                }
                int i6 = this.p0;
                if (c0 == i6) {
                    int i7 = this.s0;
                    int i8 = this.q0;
                    if (c0 == i7) {
                        int i9 = this.t0;
                        if (i8 == i9 && i8 == i) {
                            g(canvas, kmbVar.a(), this.r0, i5, true, true, 0.0f);
                            return;
                        } else if (i == i8) {
                            g(canvas, kmbVar.a(), this.r0, length, true, false, 0.0f);
                            return;
                        } else {
                            int i10 = i5;
                            if (i == i9) {
                                g(canvas, kmbVar.a(), 0, i10, false, true, 0.0f);
                                return;
                            } else if (i > i8 && i < i9) {
                                g(canvas, kmbVar.a(), 0, length, false, false, 0.0f);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    i2 = i5;
                    i3 = length;
                    if (i8 == i) {
                        g(canvas, kmbVar.a(), this.r0, i3, true, false, 0.0f);
                        return;
                    }
                } else {
                    i2 = i5;
                    i3 = length;
                }
                int i11 = this.s0;
                if (c0 == i11 && this.t0 == i) {
                    g(canvas, kmbVar.a(), 0, i2, false, true, 0.0f);
                } else if ((c0 > i6 && c0 < i11) || ((c0 == i6 && i > this.q0) || (c0 == i11 && i < this.t0))) {
                    g(canvas, kmbVar.a(), 0, i3, false, false, 0.0f);
                }
            }
        }
    }

    public final boolean Z() {
        int i;
        int length;
        if (w() && this.W != null && this.p0 == this.s0 && (i = this.q0) == this.t0) {
            if (i < 0) {
                i = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((zlb) this.W).k(arrayList);
            if (!arrayList.isEmpty() && i < arrayList.size() && (length = ((kmb) arrayList.get(i)).a().getText().length()) > 0 && (this.r0 > 0 || this.u0 < length)) {
                return i0((zlb) this.W, i, 0, length);
            }
        }
        return false;
    }

    public final boolean a0(int i, int i2, zlb zlbVar) {
        int compare;
        int i3;
        int c0 = c0(zlbVar);
        if (c0 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.p0;
            this.D0 = this.q0;
            this.C0 = this.r0;
        }
        g0(zlbVar, c0);
        int i4 = this.B0;
        int i5 = this.D0;
        int i6 = this.C0;
        if (c0 != i4) {
            compare = Integer.compare(c0, i4);
        } else if (i != i5) {
            compare = Integer.compare(i, i5);
        } else {
            compare = Integer.compare(i2, i6);
        }
        int i7 = this.B0;
        int i8 = this.D0;
        if (compare < 0) {
            i3 = this.C0;
        } else {
            i8 = i;
            i = i8;
            i3 = i2;
            i2 = this.C0;
            i7 = c0;
            c0 = i7;
        }
        if (c0 == i7 && i == i8 && i2 == i3) {
            e(false);
            return true;
        }
        this.p0 = c0;
        this.q0 = i;
        this.r0 = i2;
        this.s0 = i7;
        this.t0 = i8;
        this.u0 = i3;
        M();
        v();
        lmb lmbVar = this.C;
        if (lmbVar != null) {
            lmbVar.invalidate();
        }
        s8b s8bVar = this.m0;
        hl.r(s8bVar);
        hl.c3(s8bVar);
        return true;
    }

    @Override
    public final boolean b(int i) {
        if (this.p0 == this.s0 && this.q0 == this.t0) {
            return super.b(i);
        }
        return true;
    }

    public final int b0(int i, int i2, zlb zlbVar) {
        int i3 = 0;
        if (zlbVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) zlbVar;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof zlb) {
                    float f = i2;
                    if (f > childAt.getY() && f < childAt.getY() + childAt.getHeight()) {
                        return b0((int) (i - childAt.getX()), (int) (f - childAt.getY()), (zlb) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        zlbVar.k(arrayList);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size() - 1;
            int i5 = Integer.MAX_VALUE;
            int i6 = -1;
            int i7 = Integer.MAX_VALUE;
            while (true) {
                if (size >= 0) {
                    kmb kmbVar = (kmb) arrayList.get(size);
                    int y = kmbVar.getY();
                    int height = kmbVar.a().getHeight() + y;
                    if (i2 >= y && i2 < height) {
                        break;
                    }
                    int min = Math.min(Math.abs(i2 - y), Math.abs(i2 - height));
                    if (min < i7) {
                        i6 = size;
                        i7 = min;
                    }
                    size--;
                } else {
                    i3 = i7;
                    size = i6;
                    break;
                }
            }
            if (size >= 0) {
                int row = ((kmb) arrayList.get(size)).getRow();
                if (row > 0 && i3 < hl.L(24.0f)) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        kmb kmbVar2 = (kmb) arrayList.get(size2);
                        if (kmbVar2.getRow() == row) {
                            int x = kmbVar2.getX();
                            int width = kmbVar2.a().getWidth() + kmbVar2.getX();
                            if (i >= x && i <= width) {
                                return size2;
                            }
                            int min2 = Math.min(Math.abs(i - x), Math.abs(i - width));
                            if (min2 < i5) {
                                size = size2;
                                i5 = min2;
                            }
                        }
                    }
                }
                return size;
            }
        }
        return -1;
    }

    @Override
    public final boolean c() {
        x46 x46Var = this.z0;
        if (x46Var == null) {
            return true;
        }
        int K0 = x46Var.K0();
        int M0 = this.z0.M0();
        int i = this.p0;
        if ((K0 >= i && K0 <= this.s0) || (M0 >= i && M0 <= this.s0)) {
            return true;
        }
        if (i >= K0 && this.s0 <= M0) {
            return true;
        }
        return false;
    }

    public final int c0(zlb zlbVar) {
        ViewGroup viewGroup;
        View view = (View) zlbVar;
        ViewParent parent = view.getParent();
        while (true) {
            viewGroup = this.F;
            if (parent != viewGroup && parent != null) {
                if (parent instanceof View) {
                    view = (View) parent;
                    parent = view.getParent();
                } else {
                    parent = null;
                    break;
                }
            } else {
                break;
            }
        }
        if (parent != null) {
            if (this.E != null) {
                return RecyclerView.S(view);
            }
            return viewGroup.indexOfChild(view);
        }
        return -1;
    }

    @Override
    public final CharSequence r(zlb zlbVar, boolean z) {
        int i;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        zlbVar.k(arrayList);
        if (z) {
            i = this.v0;
        } else if (this.E0) {
            i = this.q0;
        } else {
            i = this.t0;
        }
        if (!arrayList.isEmpty() && i >= 0 && i < arrayList.size()) {
            return ((kmb) arrayList.get(i)).a().getText();
        }
        return "";
    }

    @Override
    public final void e(boolean z) {
        super.e(z);
        this.p0 = -1;
        this.s0 = -1;
        this.q0 = -1;
        this.t0 = -1;
        this.w0.clear();
        this.y0.clear();
        this.B0 = -1;
        this.C0 = -1;
    }

    public final boolean e0(View view) {
        if (view instanceof zlb) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((zlb) view).k(arrayList);
            if (view instanceof vv) {
                return true;
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public final void f0(zlb zlbVar, zlb zlbVar2, int i) {
        int i2;
        int i3;
        int c0 = c0(zlbVar2);
        if (zlbVar != null) {
            i2 = c0(zlbVar);
        } else {
            i2 = -1;
        }
        v();
        if (this.R && (i3 = this.p0) == this.s0) {
            if (c0 == i3) {
                if (i < this.q0) {
                    this.q0 = i;
                    N();
                    this.j = true;
                    int i4 = this.v;
                    this.r0 = i4;
                    this.u = i4 - 1;
                } else {
                    this.t0 = i;
                    M();
                    this.j = false;
                    this.u0 = 0;
                }
            } else if (c0 < i3) {
                this.p0 = c0;
                this.q0 = i;
                N();
                this.j = true;
                int i5 = this.v;
                this.r0 = i5;
                this.u = i5 - 1;
            } else {
                this.s0 = c0;
                this.t0 = i;
                M();
                this.j = false;
                this.u0 = 0;
            }
        } else if (this.j) {
            if (c0 == i2) {
                int i6 = this.t0;
                if (i > i6 && c0 >= this.s0) {
                    this.s0 = c0;
                    this.q0 = i6;
                    this.t0 = i;
                    this.r0 = this.u0;
                    M();
                    this.u0 = 0;
                    this.j = false;
                } else {
                    this.p0 = c0;
                    this.q0 = i;
                    N();
                    this.r0 = this.v;
                }
            } else if (c0 <= this.s0) {
                this.p0 = c0;
                this.q0 = i;
                N();
                this.r0 = this.v;
            } else {
                this.s0 = c0;
                this.q0 = this.t0;
                this.t0 = i;
                this.r0 = this.u0;
                M();
                this.u0 = 0;
                this.j = false;
            }
        } else if (c0 == i2) {
            int i7 = this.q0;
            if (i < i7 && c0 <= this.p0) {
                this.p0 = c0;
                this.t0 = i7;
                this.q0 = i;
                this.u0 = this.r0;
                N();
                this.j = true;
                this.r0 = this.v;
            } else {
                this.s0 = c0;
                this.t0 = i;
                M();
                this.u0 = 0;
            }
        } else if (c0 >= this.p0) {
            this.s0 = c0;
            this.t0 = i;
            M();
            this.u0 = 0;
        } else {
            this.p0 = c0;
            this.t0 = this.q0;
            this.q0 = i;
            this.u0 = this.r0;
            N();
            this.j = true;
            this.r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        zlbVar2.k(arrayList);
        int size = arrayList.size();
        this.y0.put(c0, size);
        for (int i8 = 0; i8 < size; i8++) {
            V(c0, i8, (kmb) arrayList.get(i8));
        }
    }

    public final void g0(zlb zlbVar, int i) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        zlbVar.k(arrayList);
        int size = arrayList.size();
        this.y0.put(i, size);
        for (int i2 = 0; i2 < size; i2++) {
            V(i, i2, (kmb) arrayList.get(i2));
        }
    }

    @Override
    public final void h(int i, dj2 dj2Var, boolean z) {
        hmb hmbVar;
        int i2;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        dj2Var.e = null;
        if (z) {
            hmbVar = this.X;
        } else {
            hmbVar = this.W;
        }
        zlb zlbVar = (zlb) hmbVar;
        if (zlbVar == null) {
            dj2Var.d = null;
            return;
        }
        zlbVar.k(arrayList);
        if (z) {
            i2 = this.v0;
        } else if (this.E0) {
            i2 = this.q0;
        } else {
            i2 = this.t0;
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            dj2Var.d = ((kmb) arrayList.get(i2)).a();
            dj2Var.e = ((kmb) arrayList.get(i2)).c();
            dj2Var.b = 0.0f;
            dj2Var.c = 0.0f;
            return;
        }
        dj2Var.d = null;
    }

    public final void h0(int i, int i2) {
        int length;
        zlb zlbVar;
        if (i >= 0 && i2 >= i) {
            CharSequence charSequence = (CharSequence) this.w0.get(i2);
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            if (this.F != null) {
                for (int i3 = 0; i3 < this.F.getChildCount(); i3++) {
                    View childAt = this.F.getChildAt(i3);
                    if (childAt instanceof zlb) {
                        zlbVar = (zlb) childAt;
                        if (c0(zlbVar) == i2) {
                            break;
                        }
                    }
                }
            }
            zlbVar = null;
            this.W = zlbVar;
            this.u = 0;
            this.v = length;
            this.p0 = i;
            this.s0 = i2;
            this.t0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.u0 = length;
            SparseIntArray sparseIntArray = this.y0;
            sparseIntArray.put(i, Math.max(1, sparseIntArray.get(i)));
            sparseIntArray.put(i2, Math.max(1, sparseIntArray.get(i2)));
            this.B0 = i;
            this.C0 = 0;
            lmb lmbVar = this.C;
            if (lmbVar != null) {
                lmbVar.setVisibility(0);
            }
            S();
            v();
            t();
            s8b s8bVar = this.m0;
            hl.r(s8bVar);
            hl.c3(s8bVar);
            b0f b0fVar = this.D;
            if (b0fVar != null) {
                b0fVar.a(true);
            }
        }
    }

    public final boolean i0(zlb zlbVar, int i, int i2, int i3) {
        int c0 = c0(zlbVar);
        if (c0 < 0 || i2 == i3) {
            return false;
        }
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        this.W = zlbVar;
        this.u = min;
        this.v = max;
        this.s0 = c0;
        this.p0 = c0;
        this.t0 = i;
        this.q0 = i;
        this.r0 = min;
        this.u0 = max;
        this.B0 = c0;
        this.C0 = i2;
        this.D0 = i;
        g0(zlbVar, c0);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i >= 0 && i < arrayList.size()) {
            this.a = ((kmb) arrayList.get(i)).getX();
            this.b = ((kmb) arrayList.get(i)).getY();
        } else if (!arrayList.isEmpty()) {
            this.a = ((kmb) arrayList.get(0)).getX();
            this.b = ((kmb) arrayList.get(0)).getY();
        }
        lmb lmbVar = this.C;
        if (lmbVar != null) {
            lmbVar.setVisibility(0);
        }
        S();
        v();
        t();
        s8b s8bVar = this.m0;
        hl.r(s8bVar);
        hl.c3(s8bVar);
        b0f b0fVar = this.D;
        if (b0fVar != null) {
            b0fVar.a(true);
        }
        zlbVar.invalidate();
        return true;
    }

    @Override
    public final int j(int i, int i2, int i3, int i4, hmb hmbVar, boolean z) {
        int i5;
        zlb zlbVar = (zlb) hmbVar;
        if (zlbVar != null) {
            int i6 = i - i3;
            int i7 = i2 - i4;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            zlbVar.k(arrayList);
            if (z) {
                i5 = this.v0;
            } else if (this.E0) {
                i5 = this.q0;
            } else {
                i5 = this.t0;
            }
            if (i5 >= 0 && i5 < arrayList.size()) {
                Layout a = ((kmb) arrayList.get(i5)).a();
                if (i6 < 0) {
                    i6 = 1;
                }
                if (i7 < 0) {
                    i7 = 1;
                }
                if (i6 > a.getWidth()) {
                    i6 = a.getWidth();
                }
                if (i7 > a.getLineBottom(a.getLineCount() - 1)) {
                    i7 = a.getLineBottom(a.getLineCount() - 1) - 1;
                }
                int i8 = 0;
                while (true) {
                    if (i8 < a.getLineCount()) {
                        if (i7 >= a.getLineTop(i8) && i7 <= a.getLineBottom(i8)) {
                            break;
                        }
                        i8++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                if (i8 >= 0) {
                    return a.getOffsetForHorizontal(i8, i6);
                }
            }
        }
        return -1;
    }

    public final void j0(View view, int i, int i2) {
        if (view instanceof zlb) {
            this.s = i;
            this.t = i2;
            zlb zlbVar = (zlb) view;
            this.X = zlbVar;
            int b0 = b0(i, i2, zlbVar);
            this.v0 = b0;
            if (b0 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.c = ((kmb) arrayList.get(b0)).getX();
            this.d = ((kmb) arrayList.get(this.v0)).getY();
        }
    }

    public final void k0() {
        if (this.X != null) {
            this.f0.run();
        }
    }

    @Override
    public final int l() {
        int i;
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((zlb) this.W).k(arrayList);
            if (this.E0) {
                i = this.q0;
            } else {
                i = this.t0;
            }
            if (i >= 0 && i < arrayList.size()) {
                Layout a = ((kmb) arrayList.get(i)).a();
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < a.getLineCount(); i3++) {
                    int lineBottom = a.getLineBottom(i3) - a.getLineTop(i3);
                    if (lineBottom < i2) {
                        i2 = lineBottom;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    @Override
    public final CharSequence q() {
        cmb[] cmbVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.p0;
        while (true) {
            int i2 = this.s0;
            if (i > i2) {
                break;
            }
            int i3 = this.p0;
            SparseIntArray sparseIntArray = this.y0;
            SparseArray sparseArray = this.w0;
            SparseArray sparseArray2 = this.x0;
            if (i == i3) {
                int i4 = i3 == i2 ? this.t0 : sparseIntArray.get(i) - 1;
                for (int i5 = this.q0; i5 <= i4; i5++) {
                    int i6 = (i5 << 16) + i;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i6);
                    if (charSequence != null) {
                        int i7 = this.p0;
                        int i8 = this.s0;
                        if (i7 == i8 && i5 == this.t0 && i5 == this.q0) {
                            int i9 = this.u0;
                            int i10 = this.r0;
                            if (i9 >= i10) {
                                i10 = i9;
                                i9 = i10;
                            }
                            if (i9 < charSequence.length()) {
                                if (i10 > charSequence.length()) {
                                    i10 = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(i9, i10));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i7 == i8 && i5 == this.t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i6);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i11 = this.u0;
                            if (i11 > charSequence.length()) {
                                i11 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i11));
                            spannableStringBuilder.append('\n');
                        } else if (i5 == this.q0) {
                            int i12 = this.r0;
                            if (i12 < charSequence.length()) {
                                spannableStringBuilder.append(charSequence.subSequence(i12, charSequence.length()));
                                spannableStringBuilder.append('\n');
                            }
                        } else {
                            CharSequence charSequence3 = (CharSequence) sparseArray2.get(i6);
                            if (charSequence3 != null) {
                                spannableStringBuilder.append(charSequence3).append(' ');
                            }
                            spannableStringBuilder.append(charSequence);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else if (i == i2) {
                for (int i13 = 0; i13 <= this.t0; i13++) {
                    int i14 = (i13 << 16) + i;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i14);
                    if (charSequence4 != null) {
                        if (this.p0 == this.s0 && i13 == this.t0 && i13 == this.q0) {
                            int i15 = this.u0;
                            int i16 = this.r0;
                            if (i16 < charSequence4.length()) {
                                if (i15 > charSequence4.length()) {
                                    i15 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i16, i15));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i13 == this.t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i17 = this.u0;
                            if (i17 > charSequence4.length()) {
                                i17 = charSequence4.length();
                            }
                            spannableStringBuilder.append(charSequence4.subSequence(0, i17));
                            spannableStringBuilder.append('\n');
                        } else {
                            CharSequence charSequence6 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence6 != null) {
                                spannableStringBuilder.append(charSequence6).append(' ');
                            }
                            spannableStringBuilder.append(charSequence4);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else {
                int i18 = sparseIntArray.get(i);
                for (int i19 = this.q0; i19 < i18; i19++) {
                    int i20 = (i19 << 16) + i;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i20);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i20));
                    spannableStringBuilder.append('\n');
                }
            }
            i++;
        }
        if (spannableStringBuilder.length() > 0) {
            fmb[] fmbVarArr = (fmb[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, fmb.class);
            if (fmbVarArr != null && fmbVarArr.length > 0) {
                Arrays.sort(fmbVarArr, new jz0(spannableStringBuilder, (byte) 10));
                for (fmb fmbVar : fmbVarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(fmbVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(fmbVar);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        String str = fmbVar.a;
                        if (str == null) {
                            str = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) str);
                    }
                }
            }
            for (cmb cmbVar : (cmb[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, cmb.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(cmbVar), spannableStringBuilder.getSpanEnd(cmbVar));
            }
            return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
        }
        return null;
    }

    @Override
    public final void v() {
        super.v();
        if (this.F != null) {
            for (int i = 0; i < this.F.getChildCount(); i++) {
                this.F.getChildAt(i).invalidate();
            }
        }
    }

    @Override
    public final void z(int i, int i2, boolean z, float f, float f2, hmb hmbVar) {
        zlb zlbVar = (zlb) hmbVar;
        if (z && zlbVar == this.W && f2 == f) {
            if (this.j) {
                this.u = i;
                return;
            } else {
                this.v = i;
                return;
            }
        }
        super.z(i, i2, z, f, f2, zlbVar);
    }
}
