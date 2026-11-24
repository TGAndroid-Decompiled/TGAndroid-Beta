package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
public final class um extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public vf6 I;
    public qka J;
    public final xm a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public um(um umVar, xm xmVar, Resources resources) {
        Resources resources2;
        int i;
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = xmVar;
        if (resources != null) {
            resources2 = resources;
        } else if (umVar != null) {
            resources2 = umVar.b;
        } else {
            resources2 = null;
        }
        this.b = resources2;
        if (umVar != null) {
            i = umVar.c;
        } else {
            i = 0;
        }
        int i2 = xm.K;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (umVar != null) {
            this.d = umVar.d;
            this.e = umVar.e;
            this.u = true;
            this.v = true;
            this.i = umVar.i;
            this.l = umVar.l;
            this.w = umVar.w;
            this.x = umVar.x;
            this.y = umVar.y;
            this.z = umVar.z;
            this.A = umVar.A;
            this.B = umVar.B;
            this.C = umVar.C;
            this.D = umVar.D;
            this.E = umVar.E;
            this.F = umVar.F;
            this.G = umVar.G;
            if (umVar.c == i) {
                if (umVar.j) {
                    this.k = umVar.k != null ? new Rect(umVar.k) : null;
                    this.j = true;
                }
                if (umVar.m) {
                    this.n = umVar.n;
                    this.o = umVar.o;
                    this.p = umVar.p;
                    this.q = umVar.q;
                    this.m = true;
                }
            }
            if (umVar.r) {
                this.s = umVar.s;
                this.r = true;
            }
            if (umVar.t) {
                this.t = true;
            }
            Drawable[] drawableArr = umVar.g;
            this.g = new Drawable[drawableArr.length];
            this.h = umVar.h;
            SparseArray sparseArray = umVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i4, constantState);
                    } else {
                        this.g[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
        if (umVar != null) {
            this.H = umVar.H;
            this.I = umVar.I;
            this.J = umVar.J;
            return;
        }
        this.H = new int[this.g.length];
        this.I = new vf6();
        this.J = new qka();
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        if (i >= this.g.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.g = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(this.H, 0, iArr, 0, i);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.g[i] = drawable;
        this.h++;
        this.e |= drawable.getChangingConfigurations();
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return i;
    }

    public final void b() {
        this.m = true;
        c();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f.keyAt(i);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(i)).newDrawable(this.b);
                newDrawable.setLayoutDirection(this.x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int indexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.b);
        newDrawable.setLayoutDirection(this.x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.a);
        this.g[i] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    public final int e(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        qka qkaVar = this.J;
        Integer num = 0;
        qkaVar.getClass();
        int a = yp3.a(qkaVar.c, i, qkaVar.a);
        if (a >= 0 && (obj = qkaVar.b[a]) != zcd.a) {
            num = obj;
        }
        return num.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
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
        return new xm(this, null);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new xm(this, resources);
    }
}
