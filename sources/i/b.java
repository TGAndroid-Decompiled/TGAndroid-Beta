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
    public final f f11383a;
    public Resources f11384b;
    public int f11385c;
    public int d;
    public int f11386e;
    public SparseArray f11387f;
    public Drawable[] f11388g;
    public int h;
    public boolean f11389i;
    public boolean f11390j;
    public Rect f11391k;
    public boolean f11392l;
    public boolean f11393m;
    public int f11394n;
    public int f11395o;
    public int f11396p;
    public int f11397q;
    public boolean f11398r;
    public int f11399s;
    public boolean f11400t;
    public boolean f11401u;
    public boolean v;
    public boolean f11402w;
    public int f11403x;
    public int f11404y;
    public int f11405z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f11389i = false;
        this.f11392l = false;
        this.f11402w = true;
        this.f11404y = 0;
        this.f11405z = 0;
        this.f11383a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f11384b;
        } else {
            resources2 = null;
        }
        this.f11384b = resources2;
        if (bVar != null) {
            i10 = bVar.f11385c;
        } else {
            i10 = 0;
        }
        int i11 = f.f11412x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f11385c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f11386e = bVar.f11386e;
            this.f11401u = true;
            this.v = true;
            this.f11389i = bVar.f11389i;
            this.f11392l = bVar.f11392l;
            this.f11402w = bVar.f11402w;
            this.f11403x = bVar.f11403x;
            this.f11404y = bVar.f11404y;
            this.f11405z = bVar.f11405z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f11385c == i10) {
                if (bVar.f11390j) {
                    this.f11391k = bVar.f11391k != null ? new Rect(bVar.f11391k) : null;
                    this.f11390j = true;
                }
                if (bVar.f11393m) {
                    this.f11394n = bVar.f11394n;
                    this.f11395o = bVar.f11395o;
                    this.f11396p = bVar.f11396p;
                    this.f11397q = bVar.f11397q;
                    this.f11393m = true;
                }
            }
            if (bVar.f11398r) {
                this.f11399s = bVar.f11399s;
                this.f11398r = true;
            }
            if (bVar.f11400t) {
                this.f11400t = true;
            }
            Drawable[] drawableArr = bVar.f11388g;
            this.f11388g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f11387f;
            if (sparseArray != null) {
                this.f11387f = sparseArray.clone();
            } else {
                this.f11387f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f11387f.put(i13, constantState);
                    } else {
                        this.f11388g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f11388g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f11388g.length];
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
        if (i10 >= this.f11388g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11388g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11388g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f11383a);
        this.f11388g[i10] = drawable;
        this.h++;
        this.f11386e = drawable.getChangingConfigurations() | this.f11386e;
        this.f11398r = false;
        this.f11400t = false;
        this.f11391k = null;
        this.f11390j = false;
        this.f11393m = false;
        this.f11401u = false;
        return i10;
    }

    public final void b() {
        this.f11393m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f11388g;
        this.f11395o = -1;
        this.f11394n = -1;
        this.f11397q = 0;
        this.f11396p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f11394n) {
                this.f11394n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f11395o) {
                this.f11395o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f11396p) {
                this.f11396p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f11397q) {
                this.f11397q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f11387f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f11387f.keyAt(i10);
                Drawable[] drawableArr = this.f11388g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f11387f.valueAt(i10)).newDrawable(this.f11384b);
                if (Build.VERSION.SDK_INT >= 23) {
                    o8.b(this.f11403x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f11383a);
                drawableArr[keyAt] = mutate;
            }
            this.f11387f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f11388g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11387f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f11388g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f11387f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f11387f.valueAt(indexOfKey)).newDrawable(this.f11384b);
        if (Build.VERSION.SDK_INT >= 23) {
            o8.b(this.f11403x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f11383a);
        this.f11388g[i10] = mutate;
        this.f11387f.removeAt(indexOfKey);
        if (this.f11387f.size() == 0) {
            this.f11387f = null;
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
        return this.d | this.f11386e;
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
