package i;

import a0.i;
import a0.j;
import a0.n;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import v7.r8;
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
    public n J;
    public final g f10550a;
    public Resources f10551b;
    public int f10552c;
    public int d;
    public int e;
    public SparseArray f10553f;
    public Drawable[] f10554g;
    public int h;
    public boolean f10555i;
    public boolean f10556j;
    public Rect f10557k;
    public boolean f10558l;
    public boolean f10559m;
    public int f10560n;
    public int f10561o;
    public int f10562p;
    public int f10563q;
    public boolean f10564r;
    public int f10565s;
    public boolean f10566t;
    public boolean f10567u;
    public boolean v;
    public boolean f10568w;
    public int f10569x;
    public int f10570y;
    public int f10571z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10555i = false;
        this.f10558l = false;
        this.f10568w = true;
        this.f10570y = 0;
        this.f10571z = 0;
        this.f10550a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10551b;
        } else {
            resources2 = null;
        }
        this.f10551b = resources2;
        if (bVar != null) {
            i10 = bVar.f10552c;
        } else {
            i10 = 0;
        }
        int i11 = g.f10580x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10552c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10567u = true;
            this.v = true;
            this.f10555i = bVar.f10555i;
            this.f10558l = bVar.f10558l;
            this.f10568w = bVar.f10568w;
            this.f10569x = bVar.f10569x;
            this.f10570y = bVar.f10570y;
            this.f10571z = bVar.f10571z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10552c == i10) {
                if (bVar.f10556j) {
                    this.f10557k = bVar.f10557k != null ? new Rect(bVar.f10557k) : null;
                    this.f10556j = true;
                }
                if (bVar.f10559m) {
                    this.f10560n = bVar.f10560n;
                    this.f10561o = bVar.f10561o;
                    this.f10562p = bVar.f10562p;
                    this.f10563q = bVar.f10563q;
                    this.f10559m = true;
                }
            }
            if (bVar.f10564r) {
                this.f10565s = bVar.f10565s;
                this.f10564r = true;
            }
            if (bVar.f10566t) {
                this.f10566t = true;
            }
            Drawable[] drawableArr = bVar.f10554g;
            this.f10554g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10553f;
            if (sparseArray != null) {
                this.f10553f = sparseArray.clone();
            } else {
                this.f10553f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10553f.put(i13, constantState);
                    } else {
                        this.f10554g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10554g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10554g.length];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
            return;
        }
        this.I = new i();
        this.J = new n();
    }

    public final int a(Drawable drawable) {
        int i10 = this.h;
        if (i10 >= this.f10554g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10554g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10554g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10550a);
        this.f10554g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10564r = false;
        this.f10566t = false;
        this.f10557k = null;
        this.f10556j = false;
        this.f10559m = false;
        this.f10567u = false;
        return i10;
    }

    public final void b() {
        this.f10559m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10554g;
        this.f10561o = -1;
        this.f10560n = -1;
        this.f10563q = 0;
        this.f10562p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10560n) {
                this.f10560n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10561o) {
                this.f10561o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10562p) {
                this.f10562p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10563q) {
                this.f10563q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10553f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10553f.keyAt(i10);
                Drawable[] drawableArr = this.f10554g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10553f.valueAt(i10)).newDrawable(this.f10551b);
                if (Build.VERSION.SDK_INT >= 23) {
                    r8.b(this.f10569x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10550a);
                drawableArr[keyAt] = mutate;
            }
            this.f10553f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10554g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10553f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10554g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10553f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10553f.valueAt(indexOfKey)).newDrawable(this.f10551b);
        if (Build.VERSION.SDK_INT >= 23) {
            r8.b(this.f10569x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10550a);
        this.f10554g[i10] = mutate;
        this.f10553f.removeAt(indexOfKey);
        if (this.f10553f.size() == 0) {
            this.f10553f = null;
        }
        return mutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        n nVar = this.J;
        Integer num = 0;
        int a2 = b0.a.a(nVar.f33c, i10, nVar.f31a);
        if (a2 >= 0 && (obj = nVar.f32b[a2]) != j.f21b) {
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
        return this.d | this.e;
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
