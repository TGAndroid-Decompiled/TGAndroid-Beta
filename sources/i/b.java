package i;

import a0.h;
import a0.i;
import a0.m;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
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
    public m J;
    public final e f7727a;
    public Resources f7728b;
    public int f7729c;
    public int d;
    public int e;
    public SparseArray f7730f;
    public Drawable[] f7731g;
    public int h;
    public boolean f7732i;
    public boolean f7733j;
    public Rect f7734k;
    public boolean f7735l;
    public boolean f7736m;
    public int f7737n;
    public int f7738o;
    public int f7739p;
    public int f7740q;
    public boolean f7741r;
    public int f7742s;
    public boolean f7743t;
    public boolean f7744u;
    public boolean v;
    public boolean f7745w;
    public int f7746x;
    public int f7747y;
    public int f7748z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f7732i = false;
        this.f7735l = false;
        this.f7745w = true;
        this.f7747y = 0;
        this.f7748z = 0;
        this.f7727a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f7728b;
        } else {
            resources2 = null;
        }
        this.f7728b = resources2;
        if (bVar != null) {
            i10 = bVar.f7729c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f7729c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f7744u = true;
            this.v = true;
            this.f7732i = bVar.f7732i;
            this.f7735l = bVar.f7735l;
            this.f7745w = bVar.f7745w;
            this.f7746x = bVar.f7746x;
            this.f7747y = bVar.f7747y;
            this.f7748z = bVar.f7748z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f7729c == i10) {
                if (bVar.f7733j) {
                    this.f7734k = bVar.f7734k != null ? new Rect(bVar.f7734k) : null;
                    this.f7733j = true;
                }
                if (bVar.f7736m) {
                    this.f7737n = bVar.f7737n;
                    this.f7738o = bVar.f7738o;
                    this.f7739p = bVar.f7739p;
                    this.f7740q = bVar.f7740q;
                    this.f7736m = true;
                }
            }
            if (bVar.f7741r) {
                this.f7742s = bVar.f7742s;
                this.f7741r = true;
            }
            if (bVar.f7743t) {
                this.f7743t = true;
            }
            Drawable[] drawableArr = bVar.f7731g;
            this.f7731g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f7730f;
            if (sparseArray != null) {
                this.f7730f = sparseArray.clone();
            } else {
                this.f7730f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7730f.put(i13, constantState);
                    } else {
                        this.f7731g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f7731g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f7731g.length];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
            return;
        }
        this.I = new h();
        this.J = new m();
    }

    public final int a(Drawable drawable) {
        int i10 = this.h;
        if (i10 >= this.f7731g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f7731g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f7731g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7727a);
        this.f7731g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f7741r = false;
        this.f7743t = false;
        this.f7734k = null;
        this.f7733j = false;
        this.f7736m = false;
        this.f7744u = false;
        return i10;
    }

    public final void b() {
        this.f7736m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f7731g;
        this.f7738o = -1;
        this.f7737n = -1;
        this.f7740q = 0;
        this.f7739p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7737n) {
                this.f7737n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7738o) {
                this.f7738o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7739p) {
                this.f7739p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7740q) {
                this.f7740q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f7730f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f7730f.keyAt(i10);
                Drawable[] drawableArr = this.f7731g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f7730f.valueAt(i10)).newDrawable(this.f7728b);
                newDrawable.setLayoutDirection(this.f7746x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f7727a);
                drawableArr[keyAt] = mutate;
            }
            this.f7730f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f7731g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7730f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f7731g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7730f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f7730f.valueAt(indexOfKey)).newDrawable(this.f7728b);
        newDrawable.setLayoutDirection(this.f7746x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f7727a);
        this.f7731g[i10] = mutate;
        this.f7730f.removeAt(indexOfKey);
        if (this.f7730f.size() == 0) {
            this.f7730f = null;
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
        int a2 = b0.a.a(mVar.f30c, i10, mVar.f28a);
        if (a2 >= 0 && (obj = mVar.f29b[a2]) != i.f18b) {
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
