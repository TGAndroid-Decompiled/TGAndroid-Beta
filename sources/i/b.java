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
    public final e f15842a;
    public Resources f15843b;
    public int f15844c;
    public int d;
    public int f15845e;
    public SparseArray f15846f;
    public Drawable[] f15847g;
    public int h;
    public boolean f15848i;
    public boolean f15849j;
    public Rect f15850k;
    public boolean f15851l;
    public boolean f15852m;
    public int f15853n;
    public int f15854o;
    public int f15855p;
    public int f15856q;
    public boolean f15857r;
    public int f15858s;
    public boolean f15859t;
    public boolean f15860u;
    public boolean v;
    public boolean f15861w;
    public int f15862x;
    public int f15863y;
    public int f15864z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15848i = false;
        this.f15851l = false;
        this.f15861w = true;
        this.f15863y = 0;
        this.f15864z = 0;
        this.f15842a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15843b;
        } else {
            resources2 = null;
        }
        this.f15843b = resources2;
        if (bVar != null) {
            i7 = bVar.f15844c;
        } else {
            i7 = 0;
        }
        int i10 = e.K;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15844c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15845e = bVar.f15845e;
            this.f15860u = true;
            this.v = true;
            this.f15848i = bVar.f15848i;
            this.f15851l = bVar.f15851l;
            this.f15861w = bVar.f15861w;
            this.f15862x = bVar.f15862x;
            this.f15863y = bVar.f15863y;
            this.f15864z = bVar.f15864z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15844c == i7) {
                if (bVar.f15849j) {
                    this.f15850k = bVar.f15850k != null ? new Rect(bVar.f15850k) : null;
                    this.f15849j = true;
                }
                if (bVar.f15852m) {
                    this.f15853n = bVar.f15853n;
                    this.f15854o = bVar.f15854o;
                    this.f15855p = bVar.f15855p;
                    this.f15856q = bVar.f15856q;
                    this.f15852m = true;
                }
            }
            if (bVar.f15857r) {
                this.f15858s = bVar.f15858s;
                this.f15857r = true;
            }
            if (bVar.f15859t) {
                this.f15859t = true;
            }
            Drawable[] drawableArr = bVar.f15847g;
            this.f15847g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15846f;
            if (sparseArray != null) {
                this.f15846f = sparseArray.clone();
            } else {
                this.f15846f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15846f.put(i12, constantState);
                    } else {
                        this.f15847g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15847g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15847g.length];
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
        if (i7 >= this.f15847g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15847g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15847g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15842a);
        this.f15847g[i7] = drawable;
        this.h++;
        this.f15845e = drawable.getChangingConfigurations() | this.f15845e;
        this.f15857r = false;
        this.f15859t = false;
        this.f15850k = null;
        this.f15849j = false;
        this.f15852m = false;
        this.f15860u = false;
        return i7;
    }

    public final void b() {
        this.f15852m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15847g;
        this.f15854o = -1;
        this.f15853n = -1;
        this.f15856q = 0;
        this.f15855p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15853n) {
                this.f15853n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15854o) {
                this.f15854o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15855p) {
                this.f15855p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15856q) {
                this.f15856q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15846f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15846f.keyAt(i7);
                Drawable[] drawableArr = this.f15847g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15846f.valueAt(i7)).newDrawable(this.f15843b);
                newDrawable.setLayoutDirection(this.f15862x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15842a);
                drawableArr[keyAt] = mutate;
            }
            this.f15846f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15847g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15846f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15847g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15846f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15846f.valueAt(indexOfKey)).newDrawable(this.f15843b);
        newDrawable.setLayoutDirection(this.f15862x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15842a);
        this.f15847g[i7] = mutate;
        this.f15846f.removeAt(indexOfKey);
        if (this.f15846f.size() == 0) {
            this.f15846f = null;
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
        return this.d | this.f15845e;
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
