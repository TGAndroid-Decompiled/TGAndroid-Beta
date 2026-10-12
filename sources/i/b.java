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
    public final e f11531a;
    public Resources f11532b;
    public int f11533c;
    public int d;
    public int f11534e;
    public SparseArray f11535f;
    public Drawable[] f11536g;
    public int h;
    public boolean f11537i;
    public boolean f11538j;
    public Rect f11539k;
    public boolean f11540l;
    public boolean f11541m;
    public int f11542n;
    public int f11543o;
    public int f11544p;
    public int f11545q;
    public boolean f11546r;
    public int f11547s;
    public boolean f11548t;
    public boolean f11549u;
    public boolean v;
    public boolean f11550w;
    public int f11551x;
    public int f11552y;
    public int f11553z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f11537i = false;
        this.f11540l = false;
        this.f11550w = true;
        this.f11552y = 0;
        this.f11553z = 0;
        this.f11531a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f11532b;
        } else {
            resources2 = null;
        }
        this.f11532b = resources2;
        if (bVar != null) {
            i10 = bVar.f11533c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f11533c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f11534e = bVar.f11534e;
            this.f11549u = true;
            this.v = true;
            this.f11537i = bVar.f11537i;
            this.f11540l = bVar.f11540l;
            this.f11550w = bVar.f11550w;
            this.f11551x = bVar.f11551x;
            this.f11552y = bVar.f11552y;
            this.f11553z = bVar.f11553z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f11533c == i10) {
                if (bVar.f11538j) {
                    this.f11539k = bVar.f11539k != null ? new Rect(bVar.f11539k) : null;
                    this.f11538j = true;
                }
                if (bVar.f11541m) {
                    this.f11542n = bVar.f11542n;
                    this.f11543o = bVar.f11543o;
                    this.f11544p = bVar.f11544p;
                    this.f11545q = bVar.f11545q;
                    this.f11541m = true;
                }
            }
            if (bVar.f11546r) {
                this.f11547s = bVar.f11547s;
                this.f11546r = true;
            }
            if (bVar.f11548t) {
                this.f11548t = true;
            }
            Drawable[] drawableArr = bVar.f11536g;
            this.f11536g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f11535f;
            if (sparseArray != null) {
                this.f11535f = sparseArray.clone();
            } else {
                this.f11535f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f11535f.put(i13, constantState);
                    } else {
                        this.f11536g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f11536g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f11536g.length];
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
        if (i10 >= this.f11536g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11536g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11536g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f11531a);
        this.f11536g[i10] = drawable;
        this.h++;
        this.f11534e = drawable.getChangingConfigurations() | this.f11534e;
        this.f11546r = false;
        this.f11548t = false;
        this.f11539k = null;
        this.f11538j = false;
        this.f11541m = false;
        this.f11549u = false;
        return i10;
    }

    public final void b() {
        this.f11541m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f11536g;
        this.f11543o = -1;
        this.f11542n = -1;
        this.f11545q = 0;
        this.f11544p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f11542n) {
                this.f11542n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f11543o) {
                this.f11543o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f11544p) {
                this.f11544p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f11545q) {
                this.f11545q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f11535f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f11535f.keyAt(i10);
                Drawable[] drawableArr = this.f11536g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f11535f.valueAt(i10)).newDrawable(this.f11532b);
                newDrawable.setLayoutDirection(this.f11551x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f11531a);
                drawableArr[keyAt] = mutate;
            }
            this.f11535f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f11536g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11535f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f11536g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f11535f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f11535f.valueAt(indexOfKey)).newDrawable(this.f11532b);
        newDrawable.setLayoutDirection(this.f11551x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f11531a);
        this.f11536g[i10] = mutate;
        this.f11535f.removeAt(indexOfKey);
        if (this.f11535f.size() == 0) {
            this.f11535f = null;
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
        return this.d | this.f11534e;
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
