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
    public final e f15851a;
    public Resources f15852b;
    public int f15853c;
    public int d;
    public int f15854e;
    public SparseArray f15855f;
    public Drawable[] f15856g;
    public int h;
    public boolean f15857i;
    public boolean f15858j;
    public Rect f15859k;
    public boolean f15860l;
    public boolean f15861m;
    public int f15862n;
    public int f15863o;
    public int f15864p;
    public int f15865q;
    public boolean f15866r;
    public int f15867s;
    public boolean f15868t;
    public boolean f15869u;
    public boolean v;
    public boolean f15870w;
    public int f15871x;
    public int f15872y;
    public int f15873z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15857i = false;
        this.f15860l = false;
        this.f15870w = true;
        this.f15872y = 0;
        this.f15873z = 0;
        this.f15851a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15852b;
        } else {
            resources2 = null;
        }
        this.f15852b = resources2;
        if (bVar != null) {
            i7 = bVar.f15853c;
        } else {
            i7 = 0;
        }
        int i10 = e.K;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15853c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15854e = bVar.f15854e;
            this.f15869u = true;
            this.v = true;
            this.f15857i = bVar.f15857i;
            this.f15860l = bVar.f15860l;
            this.f15870w = bVar.f15870w;
            this.f15871x = bVar.f15871x;
            this.f15872y = bVar.f15872y;
            this.f15873z = bVar.f15873z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15853c == i7) {
                if (bVar.f15858j) {
                    this.f15859k = bVar.f15859k != null ? new Rect(bVar.f15859k) : null;
                    this.f15858j = true;
                }
                if (bVar.f15861m) {
                    this.f15862n = bVar.f15862n;
                    this.f15863o = bVar.f15863o;
                    this.f15864p = bVar.f15864p;
                    this.f15865q = bVar.f15865q;
                    this.f15861m = true;
                }
            }
            if (bVar.f15866r) {
                this.f15867s = bVar.f15867s;
                this.f15866r = true;
            }
            if (bVar.f15868t) {
                this.f15868t = true;
            }
            Drawable[] drawableArr = bVar.f15856g;
            this.f15856g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15855f;
            if (sparseArray != null) {
                this.f15855f = sparseArray.clone();
            } else {
                this.f15855f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15855f.put(i12, constantState);
                    } else {
                        this.f15856g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15856g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15856g.length];
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
        if (i7 >= this.f15856g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15856g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15856g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15851a);
        this.f15856g[i7] = drawable;
        this.h++;
        this.f15854e = drawable.getChangingConfigurations() | this.f15854e;
        this.f15866r = false;
        this.f15868t = false;
        this.f15859k = null;
        this.f15858j = false;
        this.f15861m = false;
        this.f15869u = false;
        return i7;
    }

    public final void b() {
        this.f15861m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15856g;
        this.f15863o = -1;
        this.f15862n = -1;
        this.f15865q = 0;
        this.f15864p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15862n) {
                this.f15862n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15863o) {
                this.f15863o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15864p) {
                this.f15864p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15865q) {
                this.f15865q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15855f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15855f.keyAt(i7);
                Drawable[] drawableArr = this.f15856g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15855f.valueAt(i7)).newDrawable(this.f15852b);
                newDrawable.setLayoutDirection(this.f15871x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15851a);
                drawableArr[keyAt] = mutate;
            }
            this.f15855f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15856g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15855f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15856g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15855f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15855f.valueAt(indexOfKey)).newDrawable(this.f15852b);
        newDrawable.setLayoutDirection(this.f15871x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15851a);
        this.f15856g[i7] = mutate;
        this.f15855f.removeAt(indexOfKey);
        if (this.f15855f.size() == 0) {
            this.f15855f = null;
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
        return this.d | this.f15854e;
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
