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
    public final g f10536a;
    public Resources f10537b;
    public int f10538c;
    public int d;
    public int e;
    public SparseArray f10539f;
    public Drawable[] f10540g;
    public int h;
    public boolean f10541i;
    public boolean f10542j;
    public Rect f10543k;
    public boolean f10544l;
    public boolean f10545m;
    public int f10546n;
    public int f10547o;
    public int f10548p;
    public int f10549q;
    public boolean f10550r;
    public int f10551s;
    public boolean f10552t;
    public boolean f10553u;
    public boolean v;
    public boolean f10554w;
    public int f10555x;
    public int f10556y;
    public int f10557z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10541i = false;
        this.f10544l = false;
        this.f10554w = true;
        this.f10556y = 0;
        this.f10557z = 0;
        this.f10536a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10537b;
        } else {
            resources2 = null;
        }
        this.f10537b = resources2;
        if (bVar != null) {
            i10 = bVar.f10538c;
        } else {
            i10 = 0;
        }
        int i11 = g.f10566x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10538c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10553u = true;
            this.v = true;
            this.f10541i = bVar.f10541i;
            this.f10544l = bVar.f10544l;
            this.f10554w = bVar.f10554w;
            this.f10555x = bVar.f10555x;
            this.f10556y = bVar.f10556y;
            this.f10557z = bVar.f10557z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10538c == i10) {
                if (bVar.f10542j) {
                    this.f10543k = bVar.f10543k != null ? new Rect(bVar.f10543k) : null;
                    this.f10542j = true;
                }
                if (bVar.f10545m) {
                    this.f10546n = bVar.f10546n;
                    this.f10547o = bVar.f10547o;
                    this.f10548p = bVar.f10548p;
                    this.f10549q = bVar.f10549q;
                    this.f10545m = true;
                }
            }
            if (bVar.f10550r) {
                this.f10551s = bVar.f10551s;
                this.f10550r = true;
            }
            if (bVar.f10552t) {
                this.f10552t = true;
            }
            Drawable[] drawableArr = bVar.f10540g;
            this.f10540g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10539f;
            if (sparseArray != null) {
                this.f10539f = sparseArray.clone();
            } else {
                this.f10539f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10539f.put(i13, constantState);
                    } else {
                        this.f10540g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10540g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10540g.length];
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
        if (i10 >= this.f10540g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10540g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10540g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10536a);
        this.f10540g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10550r = false;
        this.f10552t = false;
        this.f10543k = null;
        this.f10542j = false;
        this.f10545m = false;
        this.f10553u = false;
        return i10;
    }

    public final void b() {
        this.f10545m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10540g;
        this.f10547o = -1;
        this.f10546n = -1;
        this.f10549q = 0;
        this.f10548p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10546n) {
                this.f10546n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10547o) {
                this.f10547o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10548p) {
                this.f10548p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10549q) {
                this.f10549q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10539f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10539f.keyAt(i10);
                Drawable[] drawableArr = this.f10540g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10539f.valueAt(i10)).newDrawable(this.f10537b);
                if (Build.VERSION.SDK_INT >= 23) {
                    s8.b(this.f10555x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10536a);
                drawableArr[keyAt] = mutate;
            }
            this.f10539f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10540g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10539f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10540g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10539f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10539f.valueAt(indexOfKey)).newDrawable(this.f10537b);
        if (Build.VERSION.SDK_INT >= 23) {
            s8.b(this.f10555x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10536a);
        this.f10540g[i10] = mutate;
        this.f10539f.removeAt(indexOfKey);
        if (this.f10539f.size() == 0) {
            this.f10539f = null;
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
