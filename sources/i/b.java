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
    public final f f11485a;
    public Resources f11486b;
    public int f11487c;
    public int d;
    public int f11488e;
    public SparseArray f11489f;
    public Drawable[] f11490g;
    public int h;
    public boolean f11491i;
    public boolean f11492j;
    public Rect f11493k;
    public boolean f11494l;
    public boolean f11495m;
    public int f11496n;
    public int f11497o;
    public int f11498p;
    public int f11499q;
    public boolean f11500r;
    public int f11501s;
    public boolean f11502t;
    public boolean f11503u;
    public boolean v;
    public boolean f11504w;
    public int f11505x;
    public int f11506y;
    public int f11507z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f11491i = false;
        this.f11494l = false;
        this.f11504w = true;
        this.f11506y = 0;
        this.f11507z = 0;
        this.f11485a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f11486b;
        } else {
            resources2 = null;
        }
        this.f11486b = resources2;
        if (bVar != null) {
            i10 = bVar.f11487c;
        } else {
            i10 = 0;
        }
        int i11 = f.f11514x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f11487c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f11488e = bVar.f11488e;
            this.f11503u = true;
            this.v = true;
            this.f11491i = bVar.f11491i;
            this.f11494l = bVar.f11494l;
            this.f11504w = bVar.f11504w;
            this.f11505x = bVar.f11505x;
            this.f11506y = bVar.f11506y;
            this.f11507z = bVar.f11507z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f11487c == i10) {
                if (bVar.f11492j) {
                    this.f11493k = bVar.f11493k != null ? new Rect(bVar.f11493k) : null;
                    this.f11492j = true;
                }
                if (bVar.f11495m) {
                    this.f11496n = bVar.f11496n;
                    this.f11497o = bVar.f11497o;
                    this.f11498p = bVar.f11498p;
                    this.f11499q = bVar.f11499q;
                    this.f11495m = true;
                }
            }
            if (bVar.f11500r) {
                this.f11501s = bVar.f11501s;
                this.f11500r = true;
            }
            if (bVar.f11502t) {
                this.f11502t = true;
            }
            Drawable[] drawableArr = bVar.f11490g;
            this.f11490g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f11489f;
            if (sparseArray != null) {
                this.f11489f = sparseArray.clone();
            } else {
                this.f11489f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f11489f.put(i13, constantState);
                    } else {
                        this.f11490g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f11490g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f11490g.length];
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
        if (i10 >= this.f11490g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11490g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11490g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f11485a);
        this.f11490g[i10] = drawable;
        this.h++;
        this.f11488e = drawable.getChangingConfigurations() | this.f11488e;
        this.f11500r = false;
        this.f11502t = false;
        this.f11493k = null;
        this.f11492j = false;
        this.f11495m = false;
        this.f11503u = false;
        return i10;
    }

    public final void b() {
        this.f11495m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f11490g;
        this.f11497o = -1;
        this.f11496n = -1;
        this.f11499q = 0;
        this.f11498p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f11496n) {
                this.f11496n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f11497o) {
                this.f11497o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f11498p) {
                this.f11498p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f11499q) {
                this.f11499q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f11489f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f11489f.keyAt(i10);
                Drawable[] drawableArr = this.f11490g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f11489f.valueAt(i10)).newDrawable(this.f11486b);
                if (Build.VERSION.SDK_INT >= 23) {
                    r8.b(this.f11505x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f11485a);
                drawableArr[keyAt] = mutate;
            }
            this.f11489f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f11490g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11489f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f11490g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f11489f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f11489f.valueAt(indexOfKey)).newDrawable(this.f11486b);
        if (Build.VERSION.SDK_INT >= 23) {
            r8.b(this.f11505x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f11485a);
        this.f11490g[i10] = mutate;
        this.f11489f.removeAt(indexOfKey);
        if (this.f11489f.size() == 0) {
            this.f11489f = null;
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
        return this.d | this.f11488e;
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
