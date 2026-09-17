package i;

import a0.i;
import a0.j;
import a0.m;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import v7.o8;
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public i I;
    public m J;
    public final f f11409a;
    public Resources f11410b;
    public int f11411c;
    public int d;
    public int f11412e;
    public SparseArray f11413f;
    public Drawable[] f11414g;
    public int h;
    public boolean f11415i;
    public boolean f11416j;
    public Rect f11417k;
    public boolean f11418l;
    public boolean f11419m;
    public int f11420n;
    public int f11421o;
    public int f11422p;
    public int f11423q;
    public boolean f11424r;
    public int f11425s;
    public boolean f11426t;
    public boolean f11427u;
    public boolean v;
    public boolean f11428w;
    public int f11429x;
    public int f11430y;
    public int f11431z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f11415i = false;
        this.f11418l = false;
        this.f11428w = true;
        this.f11430y = 0;
        this.f11431z = 0;
        this.f11409a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f11410b;
        } else {
            resources2 = null;
        }
        this.f11410b = resources2;
        if (bVar != null) {
            i10 = bVar.f11411c;
        } else {
            i10 = 0;
        }
        int i11 = f.f11438x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f11411c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f11412e = bVar.f11412e;
            this.f11427u = true;
            this.v = true;
            this.f11415i = bVar.f11415i;
            this.f11418l = bVar.f11418l;
            this.f11428w = bVar.f11428w;
            this.f11429x = bVar.f11429x;
            this.f11430y = bVar.f11430y;
            this.f11431z = bVar.f11431z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f11411c == i10) {
                if (bVar.f11416j) {
                    this.f11417k = bVar.f11417k != null ? new Rect(bVar.f11417k) : null;
                    this.f11416j = true;
                }
                if (bVar.f11419m) {
                    this.f11420n = bVar.f11420n;
                    this.f11421o = bVar.f11421o;
                    this.f11422p = bVar.f11422p;
                    this.f11423q = bVar.f11423q;
                    this.f11419m = true;
                }
            }
            if (bVar.f11424r) {
                this.f11425s = bVar.f11425s;
                this.f11424r = true;
            }
            if (bVar.f11426t) {
                this.f11426t = true;
            }
            Drawable[] drawableArr = bVar.f11414g;
            this.f11414g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f11413f;
            if (sparseArray != null) {
                this.f11413f = sparseArray.clone();
            } else {
                this.f11413f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f11413f.put(i13, constantState);
                    } else {
                        this.f11414g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f11414g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f11414g.length];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
            return;
        }
        this.I = new i();
        this.J = new m();
    }

    public final int a(Drawable drawable) {
        int i10 = this.h;
        if (i10 >= this.f11414g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11414g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11414g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f11409a);
        this.f11414g[i10] = drawable;
        this.h++;
        this.f11412e = drawable.getChangingConfigurations() | this.f11412e;
        this.f11424r = false;
        this.f11426t = false;
        this.f11417k = null;
        this.f11416j = false;
        this.f11419m = false;
        this.f11427u = false;
        return i10;
    }

    public final void b() {
        this.f11419m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f11414g;
        this.f11421o = -1;
        this.f11420n = -1;
        this.f11423q = 0;
        this.f11422p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f11420n) {
                this.f11420n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f11421o) {
                this.f11421o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f11422p) {
                this.f11422p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f11423q) {
                this.f11423q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f11413f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f11413f.keyAt(i10);
                Drawable[] drawableArr = this.f11414g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f11413f.valueAt(i10)).newDrawable(this.f11410b);
                if (Build.VERSION.SDK_INT >= 23) {
                    o8.b(this.f11429x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f11409a);
                drawableArr[keyAt] = mutate;
            }
            this.f11413f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f11414g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11413f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f11414g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f11413f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f11413f.valueAt(indexOfKey)).newDrawable(this.f11410b);
        if (Build.VERSION.SDK_INT >= 23) {
            o8.b(this.f11429x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f11409a);
        this.f11414g[i10] = mutate;
        this.f11413f.removeAt(indexOfKey);
        if (this.f11413f.size() == 0) {
            this.f11413f = null;
        }
        return mutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        m mVar = this.J;
        Integer num = 0;
        int a2 = b0.a.a(mVar.f34c, i10, mVar.f32a);
        if (a2 >= 0 && (obj = mVar.f33b[a2]) != j.f23b) {
            num = obj;
        }
        return num.intValue();
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
        return this.d | this.f11412e;
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
