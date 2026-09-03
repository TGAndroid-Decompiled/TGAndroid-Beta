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
    public final g f7156a;
    public Resources f7157b;
    public int f7158c;
    public int d;
    public int e;
    public SparseArray f7159f;
    public Drawable[] f7160g;
    public int h;
    public boolean f7161i;
    public boolean f7162j;
    public Rect f7163k;
    public boolean f7164l;
    public boolean f7165m;
    public int f7166n;
    public int f7167o;
    public int f7168p;
    public int f7169q;
    public boolean f7170r;
    public int f7171s;
    public boolean f7172t;
    public boolean f7173u;
    public boolean v;
    public boolean f7174w;
    public int f7175x;
    public int f7176y;
    public int f7177z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f7161i = false;
        this.f7164l = false;
        this.f7174w = true;
        this.f7176y = 0;
        this.f7177z = 0;
        this.f7156a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f7157b;
        } else {
            resources2 = null;
        }
        this.f7157b = resources2;
        if (bVar != null) {
            i10 = bVar.f7158c;
        } else {
            i10 = 0;
        }
        int i11 = g.f7186x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f7158c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f7173u = true;
            this.v = true;
            this.f7161i = bVar.f7161i;
            this.f7164l = bVar.f7164l;
            this.f7174w = bVar.f7174w;
            this.f7175x = bVar.f7175x;
            this.f7176y = bVar.f7176y;
            this.f7177z = bVar.f7177z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f7158c == i10) {
                if (bVar.f7162j) {
                    this.f7163k = bVar.f7163k != null ? new Rect(bVar.f7163k) : null;
                    this.f7162j = true;
                }
                if (bVar.f7165m) {
                    this.f7166n = bVar.f7166n;
                    this.f7167o = bVar.f7167o;
                    this.f7168p = bVar.f7168p;
                    this.f7169q = bVar.f7169q;
                    this.f7165m = true;
                }
            }
            if (bVar.f7170r) {
                this.f7171s = bVar.f7171s;
                this.f7170r = true;
            }
            if (bVar.f7172t) {
                this.f7172t = true;
            }
            Drawable[] drawableArr = bVar.f7160g;
            this.f7160g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f7159f;
            if (sparseArray != null) {
                this.f7159f = sparseArray.clone();
            } else {
                this.f7159f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7159f.put(i13, constantState);
                    } else {
                        this.f7160g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f7160g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f7160g.length];
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
        if (i10 >= this.f7160g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f7160g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f7160g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7156a);
        this.f7160g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f7170r = false;
        this.f7172t = false;
        this.f7163k = null;
        this.f7162j = false;
        this.f7165m = false;
        this.f7173u = false;
        return i10;
    }

    public final void b() {
        this.f7165m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f7160g;
        this.f7167o = -1;
        this.f7166n = -1;
        this.f7169q = 0;
        this.f7168p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7166n) {
                this.f7166n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7167o) {
                this.f7167o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7168p) {
                this.f7168p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7169q) {
                this.f7169q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f7159f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f7159f.keyAt(i10);
                Drawable[] drawableArr = this.f7160g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f7159f.valueAt(i10)).newDrawable(this.f7157b);
                if (Build.VERSION.SDK_INT >= 23) {
                    i8.b(this.f7175x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f7156a);
                drawableArr[keyAt] = mutate;
            }
            this.f7159f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f7160g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7159f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f7160g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7159f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f7159f.valueAt(indexOfKey)).newDrawable(this.f7157b);
        if (Build.VERSION.SDK_INT >= 23) {
            i8.b(this.f7175x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f7156a);
        this.f7160g[i10] = mutate;
        this.f7159f.removeAt(indexOfKey);
        if (this.f7159f.size() == 0) {
            this.f7159f = null;
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
        int a2 = b0.a.a(lVar.f28c, i10, lVar.f26a);
        if (a2 >= 0 && (obj = lVar.f27b[a2]) != i.f18b) {
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
