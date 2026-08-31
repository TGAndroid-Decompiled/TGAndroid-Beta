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
import j7.i8;
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
    public final g f7714a;
    public Resources f7715b;
    public int f7716c;
    public int d;
    public int f7717e;
    public SparseArray f7718f;
    public Drawable[] f7719g;
    public int h;
    public boolean f7720i;
    public boolean f7721j;
    public Rect f7722k;
    public boolean f7723l;
    public boolean f7724m;
    public int f7725n;
    public int f7726o;
    public int f7727p;
    public int f7728q;
    public boolean f7729r;
    public int f7730s;
    public boolean f7731t;
    public boolean f7732u;
    public boolean v;
    public boolean f7733w;
    public int f7734x;
    public int f7735y;
    public int f7736z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f7720i = false;
        this.f7723l = false;
        this.f7733w = true;
        this.f7735y = 0;
        this.f7736z = 0;
        this.f7714a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f7715b;
        } else {
            resources2 = null;
        }
        this.f7715b = resources2;
        if (bVar != null) {
            i10 = bVar.f7716c;
        } else {
            i10 = 0;
        }
        int i11 = g.f7745x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f7716c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f7717e = bVar.f7717e;
            this.f7732u = true;
            this.v = true;
            this.f7720i = bVar.f7720i;
            this.f7723l = bVar.f7723l;
            this.f7733w = bVar.f7733w;
            this.f7734x = bVar.f7734x;
            this.f7735y = bVar.f7735y;
            this.f7736z = bVar.f7736z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f7716c == i10) {
                if (bVar.f7721j) {
                    this.f7722k = bVar.f7722k != null ? new Rect(bVar.f7722k) : null;
                    this.f7721j = true;
                }
                if (bVar.f7724m) {
                    this.f7725n = bVar.f7725n;
                    this.f7726o = bVar.f7726o;
                    this.f7727p = bVar.f7727p;
                    this.f7728q = bVar.f7728q;
                    this.f7724m = true;
                }
            }
            if (bVar.f7729r) {
                this.f7730s = bVar.f7730s;
                this.f7729r = true;
            }
            if (bVar.f7731t) {
                this.f7731t = true;
            }
            Drawable[] drawableArr = bVar.f7719g;
            this.f7719g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f7718f;
            if (sparseArray != null) {
                this.f7718f = sparseArray.clone();
            } else {
                this.f7718f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7718f.put(i13, constantState);
                    } else {
                        this.f7719g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f7719g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f7719g.length];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
            return;
        }
        this.I = new h();
        this.J = new l();
    }

    public final int a(Drawable drawable) {
        int i10 = this.h;
        if (i10 >= this.f7719g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f7719g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f7719g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7714a);
        this.f7719g[i10] = drawable;
        this.h++;
        this.f7717e = drawable.getChangingConfigurations() | this.f7717e;
        this.f7729r = false;
        this.f7731t = false;
        this.f7722k = null;
        this.f7721j = false;
        this.f7724m = false;
        this.f7732u = false;
        return i10;
    }

    public final void b() {
        this.f7724m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f7719g;
        this.f7726o = -1;
        this.f7725n = -1;
        this.f7728q = 0;
        this.f7727p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7725n) {
                this.f7725n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7726o) {
                this.f7726o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7727p) {
                this.f7727p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7728q) {
                this.f7728q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f7718f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f7718f.keyAt(i10);
                Drawable[] drawableArr = this.f7719g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f7718f.valueAt(i10)).newDrawable(this.f7715b);
                if (Build.VERSION.SDK_INT >= 23) {
                    i8.b(this.f7734x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f7714a);
                drawableArr[keyAt] = mutate;
            }
            this.f7718f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f7719g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7718f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f7719g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7718f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f7718f.valueAt(indexOfKey)).newDrawable(this.f7715b);
        if (Build.VERSION.SDK_INT >= 23) {
            i8.b(this.f7734x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f7714a);
        this.f7719g[i10] = mutate;
        this.f7718f.removeAt(indexOfKey);
        if (this.f7718f.size() == 0) {
            this.f7718f = null;
        }
        return mutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        l lVar = this.J;
        Integer num = 0;
        int a2 = b0.a.a(lVar.f31c, i10, lVar.f29a);
        if (a2 >= 0 && (obj = lVar.f30b[a2]) != i.f20b) {
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
        return this.d | this.f7717e;
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
