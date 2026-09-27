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
import v7.s8;
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
    public final f f10541a;
    public Resources f10542b;
    public int f10543c;
    public int d;
    public int e;
    public SparseArray f10544f;
    public Drawable[] f10545g;
    public int h;
    public boolean f10546i;
    public boolean f10547j;
    public Rect f10548k;
    public boolean f10549l;
    public boolean f10550m;
    public int f10551n;
    public int f10552o;
    public int f10553p;
    public int f10554q;
    public boolean f10555r;
    public int f10556s;
    public boolean f10557t;
    public boolean f10558u;
    public boolean v;
    public boolean f10559w;
    public int f10560x;
    public int f10561y;
    public int f10562z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10546i = false;
        this.f10549l = false;
        this.f10559w = true;
        this.f10561y = 0;
        this.f10562z = 0;
        this.f10541a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10542b;
        } else {
            resources2 = null;
        }
        this.f10542b = resources2;
        if (bVar != null) {
            i10 = bVar.f10543c;
        } else {
            i10 = 0;
        }
        int i11 = f.f10569x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10543c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10558u = true;
            this.v = true;
            this.f10546i = bVar.f10546i;
            this.f10549l = bVar.f10549l;
            this.f10559w = bVar.f10559w;
            this.f10560x = bVar.f10560x;
            this.f10561y = bVar.f10561y;
            this.f10562z = bVar.f10562z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10543c == i10) {
                if (bVar.f10547j) {
                    this.f10548k = bVar.f10548k != null ? new Rect(bVar.f10548k) : null;
                    this.f10547j = true;
                }
                if (bVar.f10550m) {
                    this.f10551n = bVar.f10551n;
                    this.f10552o = bVar.f10552o;
                    this.f10553p = bVar.f10553p;
                    this.f10554q = bVar.f10554q;
                    this.f10550m = true;
                }
            }
            if (bVar.f10555r) {
                this.f10556s = bVar.f10556s;
                this.f10555r = true;
            }
            if (bVar.f10557t) {
                this.f10557t = true;
            }
            Drawable[] drawableArr = bVar.f10545g;
            this.f10545g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10544f;
            if (sparseArray != null) {
                this.f10544f = sparseArray.clone();
            } else {
                this.f10544f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10544f.put(i13, constantState);
                    } else {
                        this.f10545g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10545g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10545g.length];
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
        if (i10 >= this.f10545g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10545g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10545g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10541a);
        this.f10545g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10555r = false;
        this.f10557t = false;
        this.f10548k = null;
        this.f10547j = false;
        this.f10550m = false;
        this.f10558u = false;
        return i10;
    }

    public final void b() {
        this.f10550m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10545g;
        this.f10552o = -1;
        this.f10551n = -1;
        this.f10554q = 0;
        this.f10553p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10551n) {
                this.f10551n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10552o) {
                this.f10552o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10553p) {
                this.f10553p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10554q) {
                this.f10554q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10544f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10544f.keyAt(i10);
                Drawable[] drawableArr = this.f10545g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10544f.valueAt(i10)).newDrawable(this.f10542b);
                if (Build.VERSION.SDK_INT >= 23) {
                    s8.b(this.f10560x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10541a);
                drawableArr[keyAt] = mutate;
            }
            this.f10544f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10545g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10544f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10545g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10544f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10544f.valueAt(indexOfKey)).newDrawable(this.f10542b);
        if (Build.VERSION.SDK_INT >= 23) {
            s8.b(this.f10560x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10541a);
        this.f10545g[i10] = mutate;
        this.f10544f.removeAt(indexOfKey);
        if (this.f10544f.size() == 0) {
            this.f10544f = null;
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
