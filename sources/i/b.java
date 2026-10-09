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
    public i I;
    public n J;
    public final e f11533a;
    public Resources f11534b;
    public int f11535c;
    public int d;
    public int f11536e;
    public SparseArray f11537f;
    public Drawable[] f11538g;
    public int h;
    public boolean f11539i;
    public boolean f11540j;
    public Rect f11541k;
    public boolean f11542l;
    public boolean f11543m;
    public int f11544n;
    public int f11545o;
    public int f11546p;
    public int f11547q;
    public boolean f11548r;
    public int f11549s;
    public boolean f11550t;
    public boolean f11551u;
    public boolean v;
    public boolean f11552w;
    public int f11553x;
    public int f11554y;
    public int f11555z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f11539i = false;
        this.f11542l = false;
        this.f11552w = true;
        this.f11554y = 0;
        this.f11555z = 0;
        this.f11533a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f11534b;
        } else {
            resources2 = null;
        }
        this.f11534b = resources2;
        if (bVar != null) {
            i10 = bVar.f11535c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f11535c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f11536e = bVar.f11536e;
            this.f11551u = true;
            this.v = true;
            this.f11539i = bVar.f11539i;
            this.f11542l = bVar.f11542l;
            this.f11552w = bVar.f11552w;
            this.f11553x = bVar.f11553x;
            this.f11554y = bVar.f11554y;
            this.f11555z = bVar.f11555z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f11535c == i10) {
                if (bVar.f11540j) {
                    this.f11541k = bVar.f11541k != null ? new Rect(bVar.f11541k) : null;
                    this.f11540j = true;
                }
                if (bVar.f11543m) {
                    this.f11544n = bVar.f11544n;
                    this.f11545o = bVar.f11545o;
                    this.f11546p = bVar.f11546p;
                    this.f11547q = bVar.f11547q;
                    this.f11543m = true;
                }
            }
            if (bVar.f11548r) {
                this.f11549s = bVar.f11549s;
                this.f11548r = true;
            }
            if (bVar.f11550t) {
                this.f11550t = true;
            }
            Drawable[] drawableArr = bVar.f11538g;
            this.f11538g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f11537f;
            if (sparseArray != null) {
                this.f11537f = sparseArray.clone();
            } else {
                this.f11537f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f11537f.put(i13, constantState);
                    } else {
                        this.f11538g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f11538g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f11538g.length];
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
        if (i10 >= this.f11538g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11538g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11538g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f11533a);
        this.f11538g[i10] = drawable;
        this.h++;
        this.f11536e = drawable.getChangingConfigurations() | this.f11536e;
        this.f11548r = false;
        this.f11550t = false;
        this.f11541k = null;
        this.f11540j = false;
        this.f11543m = false;
        this.f11551u = false;
        return i10;
    }

    public final void b() {
        this.f11543m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f11538g;
        this.f11545o = -1;
        this.f11544n = -1;
        this.f11547q = 0;
        this.f11546p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f11544n) {
                this.f11544n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f11545o) {
                this.f11545o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f11546p) {
                this.f11546p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f11547q) {
                this.f11547q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f11537f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f11537f.keyAt(i10);
                Drawable[] drawableArr = this.f11538g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f11537f.valueAt(i10)).newDrawable(this.f11534b);
                newDrawable.setLayoutDirection(this.f11553x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f11533a);
                drawableArr[keyAt] = mutate;
            }
            this.f11537f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f11538g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11537f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f11538g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f11537f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f11537f.valueAt(indexOfKey)).newDrawable(this.f11534b);
        newDrawable.setLayoutDirection(this.f11553x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f11533a);
        this.f11538g[i10] = mutate;
        this.f11537f.removeAt(indexOfKey);
        if (this.f11537f.size() == 0) {
            this.f11537f = null;
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
        return this.d | this.f11536e;
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
