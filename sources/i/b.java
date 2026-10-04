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
    public final f f11484a;
    public Resources f11485b;
    public int f11486c;
    public int d;
    public int f11487e;
    public SparseArray f11488f;
    public Drawable[] f11489g;
    public int h;
    public boolean f11490i;
    public boolean f11491j;
    public Rect f11492k;
    public boolean f11493l;
    public boolean f11494m;
    public int f11495n;
    public int f11496o;
    public int f11497p;
    public int f11498q;
    public boolean f11499r;
    public int f11500s;
    public boolean f11501t;
    public boolean f11502u;
    public boolean v;
    public boolean f11503w;
    public int f11504x;
    public int f11505y;
    public int f11506z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f11490i = false;
        this.f11493l = false;
        this.f11503w = true;
        this.f11505y = 0;
        this.f11506z = 0;
        this.f11484a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f11485b;
        } else {
            resources2 = null;
        }
        this.f11485b = resources2;
        if (bVar != null) {
            i10 = bVar.f11486c;
        } else {
            i10 = 0;
        }
        int i11 = f.f11513x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f11486c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f11487e = bVar.f11487e;
            this.f11502u = true;
            this.v = true;
            this.f11490i = bVar.f11490i;
            this.f11493l = bVar.f11493l;
            this.f11503w = bVar.f11503w;
            this.f11504x = bVar.f11504x;
            this.f11505y = bVar.f11505y;
            this.f11506z = bVar.f11506z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f11486c == i10) {
                if (bVar.f11491j) {
                    this.f11492k = bVar.f11492k != null ? new Rect(bVar.f11492k) : null;
                    this.f11491j = true;
                }
                if (bVar.f11494m) {
                    this.f11495n = bVar.f11495n;
                    this.f11496o = bVar.f11496o;
                    this.f11497p = bVar.f11497p;
                    this.f11498q = bVar.f11498q;
                    this.f11494m = true;
                }
            }
            if (bVar.f11499r) {
                this.f11500s = bVar.f11500s;
                this.f11499r = true;
            }
            if (bVar.f11501t) {
                this.f11501t = true;
            }
            Drawable[] drawableArr = bVar.f11489g;
            this.f11489g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f11488f;
            if (sparseArray != null) {
                this.f11488f = sparseArray.clone();
            } else {
                this.f11488f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f11488f.put(i13, constantState);
                    } else {
                        this.f11489g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f11489g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f11489g.length];
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
        if (i10 >= this.f11489g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11489g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11489g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f11484a);
        this.f11489g[i10] = drawable;
        this.h++;
        this.f11487e = drawable.getChangingConfigurations() | this.f11487e;
        this.f11499r = false;
        this.f11501t = false;
        this.f11492k = null;
        this.f11491j = false;
        this.f11494m = false;
        this.f11502u = false;
        return i10;
    }

    public final void b() {
        this.f11494m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f11489g;
        this.f11496o = -1;
        this.f11495n = -1;
        this.f11498q = 0;
        this.f11497p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f11495n) {
                this.f11495n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f11496o) {
                this.f11496o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f11497p) {
                this.f11497p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f11498q) {
                this.f11498q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f11488f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f11488f.keyAt(i10);
                Drawable[] drawableArr = this.f11489g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f11488f.valueAt(i10)).newDrawable(this.f11485b);
                if (Build.VERSION.SDK_INT >= 23) {
                    r8.b(this.f11504x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f11484a);
                drawableArr[keyAt] = mutate;
            }
            this.f11488f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f11489g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11488f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f11489g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f11488f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f11488f.valueAt(indexOfKey)).newDrawable(this.f11485b);
        if (Build.VERSION.SDK_INT >= 23) {
            r8.b(this.f11504x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f11484a);
        this.f11489g[i10] = mutate;
        this.f11488f.removeAt(indexOfKey);
        if (this.f11488f.size() == 0) {
            this.f11488f = null;
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
        int a2 = b0.a.a(nVar.f36c, i10, nVar.f34a);
        if (a2 >= 0 && (obj = nVar.f35b[a2]) != j.f23b) {
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
        return this.d | this.f11487e;
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
