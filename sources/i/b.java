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
    public m J;
    public final g f10548a;
    public Resources f10549b;
    public int f10550c;
    public int d;
    public int e;
    public SparseArray f10551f;
    public Drawable[] f10552g;
    public int h;
    public boolean f10553i;
    public boolean f10554j;
    public Rect f10555k;
    public boolean f10556l;
    public boolean f10557m;
    public int f10558n;
    public int f10559o;
    public int f10560p;
    public int f10561q;
    public boolean f10562r;
    public int f10563s;
    public boolean f10564t;
    public boolean f10565u;
    public boolean v;
    public boolean f10566w;
    public int f10567x;
    public int f10568y;
    public int f10569z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10553i = false;
        this.f10556l = false;
        this.f10566w = true;
        this.f10568y = 0;
        this.f10569z = 0;
        this.f10548a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10549b;
        } else {
            resources2 = null;
        }
        this.f10549b = resources2;
        if (bVar != null) {
            i10 = bVar.f10550c;
        } else {
            i10 = 0;
        }
        int i11 = g.f10578x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10550c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10565u = true;
            this.v = true;
            this.f10553i = bVar.f10553i;
            this.f10556l = bVar.f10556l;
            this.f10566w = bVar.f10566w;
            this.f10567x = bVar.f10567x;
            this.f10568y = bVar.f10568y;
            this.f10569z = bVar.f10569z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10550c == i10) {
                if (bVar.f10554j) {
                    this.f10555k = bVar.f10555k != null ? new Rect(bVar.f10555k) : null;
                    this.f10554j = true;
                }
                if (bVar.f10557m) {
                    this.f10558n = bVar.f10558n;
                    this.f10559o = bVar.f10559o;
                    this.f10560p = bVar.f10560p;
                    this.f10561q = bVar.f10561q;
                    this.f10557m = true;
                }
            }
            if (bVar.f10562r) {
                this.f10563s = bVar.f10563s;
                this.f10562r = true;
            }
            if (bVar.f10564t) {
                this.f10564t = true;
            }
            Drawable[] drawableArr = bVar.f10552g;
            this.f10552g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10551f;
            if (sparseArray != null) {
                this.f10551f = sparseArray.clone();
            } else {
                this.f10551f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10551f.put(i13, constantState);
                    } else {
                        this.f10552g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10552g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10552g.length];
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
        if (i10 >= this.f10552g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10552g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10552g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10548a);
        this.f10552g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10562r = false;
        this.f10564t = false;
        this.f10555k = null;
        this.f10554j = false;
        this.f10557m = false;
        this.f10565u = false;
        return i10;
    }

    public final void b() {
        this.f10557m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10552g;
        this.f10559o = -1;
        this.f10558n = -1;
        this.f10561q = 0;
        this.f10560p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10558n) {
                this.f10558n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10559o) {
                this.f10559o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10560p) {
                this.f10560p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10561q) {
                this.f10561q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10551f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10551f.keyAt(i10);
                Drawable[] drawableArr = this.f10552g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10551f.valueAt(i10)).newDrawable(this.f10549b);
                if (Build.VERSION.SDK_INT >= 23) {
                    r8.b(this.f10567x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10548a);
                drawableArr[keyAt] = mutate;
            }
            this.f10551f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10552g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10551f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10552g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10551f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10551f.valueAt(indexOfKey)).newDrawable(this.f10549b);
        if (Build.VERSION.SDK_INT >= 23) {
            r8.b(this.f10567x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10548a);
        this.f10552g[i10] = mutate;
        this.f10551f.removeAt(indexOfKey);
        if (this.f10551f.size() == 0) {
            this.f10551f = null;
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
        int a2 = b0.a.a(mVar.f31c, i10, mVar.f29a);
        if (a2 >= 0 && (obj = mVar.f30b[a2]) != j.f21b) {
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
