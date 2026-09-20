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
    public final f f10554a;
    public Resources f10555b;
    public int f10556c;
    public int d;
    public int e;
    public SparseArray f10557f;
    public Drawable[] f10558g;
    public int h;
    public boolean f10559i;
    public boolean f10560j;
    public Rect f10561k;
    public boolean f10562l;
    public boolean f10563m;
    public int f10564n;
    public int f10565o;
    public int f10566p;
    public int f10567q;
    public boolean f10568r;
    public int f10569s;
    public boolean f10570t;
    public boolean f10571u;
    public boolean v;
    public boolean f10572w;
    public int f10573x;
    public int f10574y;
    public int f10575z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10559i = false;
        this.f10562l = false;
        this.f10572w = true;
        this.f10574y = 0;
        this.f10575z = 0;
        this.f10554a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10555b;
        } else {
            resources2 = null;
        }
        this.f10555b = resources2;
        if (bVar != null) {
            i10 = bVar.f10556c;
        } else {
            i10 = 0;
        }
        int i11 = f.f10582x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10556c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10571u = true;
            this.v = true;
            this.f10559i = bVar.f10559i;
            this.f10562l = bVar.f10562l;
            this.f10572w = bVar.f10572w;
            this.f10573x = bVar.f10573x;
            this.f10574y = bVar.f10574y;
            this.f10575z = bVar.f10575z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10556c == i10) {
                if (bVar.f10560j) {
                    this.f10561k = bVar.f10561k != null ? new Rect(bVar.f10561k) : null;
                    this.f10560j = true;
                }
                if (bVar.f10563m) {
                    this.f10564n = bVar.f10564n;
                    this.f10565o = bVar.f10565o;
                    this.f10566p = bVar.f10566p;
                    this.f10567q = bVar.f10567q;
                    this.f10563m = true;
                }
            }
            if (bVar.f10568r) {
                this.f10569s = bVar.f10569s;
                this.f10568r = true;
            }
            if (bVar.f10570t) {
                this.f10570t = true;
            }
            Drawable[] drawableArr = bVar.f10558g;
            this.f10558g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10557f;
            if (sparseArray != null) {
                this.f10557f = sparseArray.clone();
            } else {
                this.f10557f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10557f.put(i13, constantState);
                    } else {
                        this.f10558g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10558g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10558g.length];
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
        if (i10 >= this.f10558g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10558g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10558g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10554a);
        this.f10558g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10568r = false;
        this.f10570t = false;
        this.f10561k = null;
        this.f10560j = false;
        this.f10563m = false;
        this.f10571u = false;
        return i10;
    }

    public final void b() {
        this.f10563m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10558g;
        this.f10565o = -1;
        this.f10564n = -1;
        this.f10567q = 0;
        this.f10566p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10564n) {
                this.f10564n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10565o) {
                this.f10565o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10566p) {
                this.f10566p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10567q) {
                this.f10567q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10557f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10557f.keyAt(i10);
                Drawable[] drawableArr = this.f10558g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10557f.valueAt(i10)).newDrawable(this.f10555b);
                if (Build.VERSION.SDK_INT >= 23) {
                    s8.b(this.f10573x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10554a);
                drawableArr[keyAt] = mutate;
            }
            this.f10557f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10558g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10557f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10558g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10557f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10557f.valueAt(indexOfKey)).newDrawable(this.f10555b);
        if (Build.VERSION.SDK_INT >= 23) {
            s8.b(this.f10573x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10554a);
        this.f10558g[i10] = mutate;
        this.f10557f.removeAt(indexOfKey);
        if (this.f10557f.size() == 0) {
            this.f10557f = null;
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
