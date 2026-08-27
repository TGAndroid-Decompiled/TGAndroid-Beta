package i;

import a0.h;
import a0.i;
import a0.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import g7.k8;

public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public h I;
    public l J;

    public final f f10448a;

    public Resources f10449b;

    public int f10450c;
    public int d;

    public int f10451e;

    public SparseArray f10452f;

    public Drawable[] f10453g;
    public int h;

    public boolean f10454i;

    public boolean f10455j;

    public Rect f10456k;

    public boolean f10457l;

    public boolean f10458m;

    public int f10459n;

    public int f10460o;

    public int f10461p;

    public int f10462q;

    public boolean f10463r;

    public int f10464s;

    public boolean f10465t;

    public boolean f10466u;
    public boolean v;

    public boolean f10467w;

    public int f10468x;

    public int f10469y;

    public int f10470z;

    public b(b bVar, e eVar, Resources resources) {
        this.f10454i = false;
        this.f10457l = false;
        this.f10467w = true;
        this.f10469y = 0;
        this.f10470z = 0;
        this.f10448a = eVar;
        this.f10449b = resources != null ? resources : bVar != null ? bVar.f10449b : null;
        int i10 = bVar != null ? bVar.f10450c : 0;
        int i11 = f.f10477x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10450c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f10451e = bVar.f10451e;
            this.f10466u = true;
            this.v = true;
            this.f10454i = bVar.f10454i;
            this.f10457l = bVar.f10457l;
            this.f10467w = bVar.f10467w;
            this.f10468x = bVar.f10468x;
            this.f10469y = bVar.f10469y;
            this.f10470z = bVar.f10470z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10450c == i10) {
                if (bVar.f10455j) {
                    this.f10456k = bVar.f10456k != null ? new Rect(bVar.f10456k) : null;
                    this.f10455j = true;
                }
                if (bVar.f10458m) {
                    this.f10459n = bVar.f10459n;
                    this.f10460o = bVar.f10460o;
                    this.f10461p = bVar.f10461p;
                    this.f10462q = bVar.f10462q;
                    this.f10458m = true;
                }
            }
            if (bVar.f10463r) {
                this.f10464s = bVar.f10464s;
                this.f10463r = true;
            }
            if (bVar.f10465t) {
                this.f10465t = true;
            }
            Drawable[] drawableArr = bVar.f10453g;
            this.f10453g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10452f;
            if (sparseArray != null) {
                this.f10452f = sparseArray.clone();
            } else {
                this.f10452f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10452f.put(i13, constantState);
                    } else {
                        this.f10453g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10453g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10453g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new h();
            this.J = new l();
        }
    }

    public final int a(Drawable drawable) {
        int i10 = this.h;
        if (i10 >= this.f10453g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10453g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10453g = drawableArr;
            int[][] iArr = new int[i11][];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10448a);
        this.f10453g[i10] = drawable;
        this.h++;
        this.f10451e = drawable.getChangingConfigurations() | this.f10451e;
        this.f10463r = false;
        this.f10465t = false;
        this.f10456k = null;
        this.f10455j = false;
        this.f10458m = false;
        this.f10466u = false;
        return i10;
    }

    public final void b() {
        this.f10458m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10453g;
        this.f10460o = -1;
        this.f10459n = -1;
        this.f10462q = 0;
        this.f10461p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10459n) {
                this.f10459n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10460o) {
                this.f10460o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10461p) {
                this.f10461p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10462q) {
                this.f10462q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10452f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f10452f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10452f.valueAt(i10);
                Drawable[] drawableArr = this.f10453g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f10449b);
                if (Build.VERSION.SDK_INT >= 23) {
                    k8.b(this.f10468x, drawableNewDrawable);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f10448a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f10452f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10453g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10452f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int iIndexOfKey;
        Drawable drawable = this.f10453g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10452f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f10452f.valueAt(iIndexOfKey)).newDrawable(this.f10449b);
        if (Build.VERSION.SDK_INT >= 23) {
            k8.b(this.f10468x, drawableNewDrawable);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f10448a);
        this.f10453g[i10] = drawableMutate;
        this.f10452f.removeAt(iIndexOfKey);
        if (this.f10452f.size() == 0) {
            this.f10452f = null;
        }
        return drawableMutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        l lVar = this.J;
        Object obj2 = 0;
        int iA = b0.a.a(lVar.f31c, i10, lVar.f29a);
        if (iA >= 0 && (obj = lVar.f30b[iA]) != i.f20b) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i10 = this.h;
        for (int i11 = 0; i11 < i10; i11++) {
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                return i11;
            }
        }
        return -1;
    }

    @Override
    public final int getChangingConfigurations() {
        return this.d | this.f10451e;
    }

    @Override
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
