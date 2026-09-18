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
    public final f f10553a;
    public Resources f10554b;
    public int f10555c;
    public int d;
    public int e;
    public SparseArray f10556f;
    public Drawable[] f10557g;
    public int h;
    public boolean f10558i;
    public boolean f10559j;
    public Rect f10560k;
    public boolean f10561l;
    public boolean f10562m;
    public int f10563n;
    public int f10564o;
    public int f10565p;
    public int f10566q;
    public boolean f10567r;
    public int f10568s;
    public boolean f10569t;
    public boolean f10570u;
    public boolean v;
    public boolean f10571w;
    public int f10572x;
    public int f10573y;
    public int f10574z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10558i = false;
        this.f10561l = false;
        this.f10571w = true;
        this.f10573y = 0;
        this.f10574z = 0;
        this.f10553a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10554b;
        } else {
            resources2 = null;
        }
        this.f10554b = resources2;
        if (bVar != null) {
            i10 = bVar.f10555c;
        } else {
            i10 = 0;
        }
        int i11 = f.f10581x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10555c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10570u = true;
            this.v = true;
            this.f10558i = bVar.f10558i;
            this.f10561l = bVar.f10561l;
            this.f10571w = bVar.f10571w;
            this.f10572x = bVar.f10572x;
            this.f10573y = bVar.f10573y;
            this.f10574z = bVar.f10574z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10555c == i10) {
                if (bVar.f10559j) {
                    this.f10560k = bVar.f10560k != null ? new Rect(bVar.f10560k) : null;
                    this.f10559j = true;
                }
                if (bVar.f10562m) {
                    this.f10563n = bVar.f10563n;
                    this.f10564o = bVar.f10564o;
                    this.f10565p = bVar.f10565p;
                    this.f10566q = bVar.f10566q;
                    this.f10562m = true;
                }
            }
            if (bVar.f10567r) {
                this.f10568s = bVar.f10568s;
                this.f10567r = true;
            }
            if (bVar.f10569t) {
                this.f10569t = true;
            }
            Drawable[] drawableArr = bVar.f10557g;
            this.f10557g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10556f;
            if (sparseArray != null) {
                this.f10556f = sparseArray.clone();
            } else {
                this.f10556f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10556f.put(i13, constantState);
                    } else {
                        this.f10557g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10557g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10557g.length];
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
        if (i10 >= this.f10557g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10557g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10557g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10553a);
        this.f10557g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10567r = false;
        this.f10569t = false;
        this.f10560k = null;
        this.f10559j = false;
        this.f10562m = false;
        this.f10570u = false;
        return i10;
    }

    public final void b() {
        this.f10562m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10557g;
        this.f10564o = -1;
        this.f10563n = -1;
        this.f10566q = 0;
        this.f10565p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10563n) {
                this.f10563n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10564o) {
                this.f10564o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10565p) {
                this.f10565p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10566q) {
                this.f10566q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10556f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10556f.keyAt(i10);
                Drawable[] drawableArr = this.f10557g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10556f.valueAt(i10)).newDrawable(this.f10554b);
                if (Build.VERSION.SDK_INT >= 23) {
                    r8.b(this.f10572x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10553a);
                drawableArr[keyAt] = mutate;
            }
            this.f10556f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10557g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10556f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10557g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10556f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10556f.valueAt(indexOfKey)).newDrawable(this.f10554b);
        if (Build.VERSION.SDK_INT >= 23) {
            r8.b(this.f10572x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10553a);
        this.f10557g[i10] = mutate;
        this.f10556f.removeAt(indexOfKey);
        if (this.f10556f.size() == 0) {
            this.f10556f = null;
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
