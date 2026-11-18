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
    public final e f15848a;
    public Resources f15849b;
    public int f15850c;
    public int d;
    public int f15851e;
    public SparseArray f15852f;
    public Drawable[] f15853g;
    public int h;
    public boolean f15854i;
    public boolean f15855j;
    public Rect f15856k;
    public boolean f15857l;
    public boolean f15858m;
    public int f15859n;
    public int f15860o;
    public int f15861p;
    public int f15862q;
    public boolean f15863r;
    public int f15864s;
    public boolean f15865t;
    public boolean f15866u;
    public boolean v;
    public boolean f15867w;
    public int f15868x;
    public int f15869y;
    public int f15870z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15854i = false;
        this.f15857l = false;
        this.f15867w = true;
        this.f15869y = 0;
        this.f15870z = 0;
        this.f15848a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15849b;
        } else {
            resources2 = null;
        }
        this.f15849b = resources2;
        if (bVar != null) {
            i7 = bVar.f15850c;
        } else {
            i7 = 0;
        }
        int i10 = e.K;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15850c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15851e = bVar.f15851e;
            this.f15866u = true;
            this.v = true;
            this.f15854i = bVar.f15854i;
            this.f15857l = bVar.f15857l;
            this.f15867w = bVar.f15867w;
            this.f15868x = bVar.f15868x;
            this.f15869y = bVar.f15869y;
            this.f15870z = bVar.f15870z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15850c == i7) {
                if (bVar.f15855j) {
                    this.f15856k = bVar.f15856k != null ? new Rect(bVar.f15856k) : null;
                    this.f15855j = true;
                }
                if (bVar.f15858m) {
                    this.f15859n = bVar.f15859n;
                    this.f15860o = bVar.f15860o;
                    this.f15861p = bVar.f15861p;
                    this.f15862q = bVar.f15862q;
                    this.f15858m = true;
                }
            }
            if (bVar.f15863r) {
                this.f15864s = bVar.f15864s;
                this.f15863r = true;
            }
            if (bVar.f15865t) {
                this.f15865t = true;
            }
            Drawable[] drawableArr = bVar.f15853g;
            this.f15853g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15852f;
            if (sparseArray != null) {
                this.f15852f = sparseArray.clone();
            } else {
                this.f15852f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15852f.put(i12, constantState);
                    } else {
                        this.f15853g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15853g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15853g.length];
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
        int i7 = this.h;
        if (i7 >= this.f15853g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15853g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15853g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15848a);
        this.f15853g[i7] = drawable;
        this.h++;
        this.f15851e = drawable.getChangingConfigurations() | this.f15851e;
        this.f15863r = false;
        this.f15865t = false;
        this.f15856k = null;
        this.f15855j = false;
        this.f15858m = false;
        this.f15866u = false;
        return i7;
    }

    public final void b() {
        this.f15858m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15853g;
        this.f15860o = -1;
        this.f15859n = -1;
        this.f15862q = 0;
        this.f15861p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15859n) {
                this.f15859n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15860o) {
                this.f15860o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15861p) {
                this.f15861p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15862q) {
                this.f15862q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15852f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15852f.keyAt(i7);
                Drawable[] drawableArr = this.f15853g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15852f.valueAt(i7)).newDrawable(this.f15849b);
                newDrawable.setLayoutDirection(this.f15868x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15848a);
                drawableArr[keyAt] = mutate;
            }
            this.f15852f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15853g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15852f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15853g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15852f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15852f.valueAt(indexOfKey)).newDrawable(this.f15849b);
        newDrawable.setLayoutDirection(this.f15868x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15848a);
        this.f15853g[i7] = mutate;
        this.f15852f.removeAt(indexOfKey);
        if (this.f15852f.size() == 0) {
            this.f15852f = null;
        }
        return mutate;
    }

    public final int e(int i7) {
        Object obj;
        if (i7 < 0) {
            return 0;
        }
        m mVar = this.J;
        Integer num = 0;
        int a10 = b0.a.a(mVar.f34c, i7, mVar.f32a);
        if (a10 >= 0 && (obj = mVar.f33b[a10]) != i.f21b) {
            num = obj;
        }
        return num.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i7 = this.h;
        for (int i10 = 0; i10 < i7; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int getChangingConfigurations() {
        return this.d | this.f15851e;
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
