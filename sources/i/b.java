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
    public final e f11532a;
    public Resources f11533b;
    public int f11534c;
    public int d;
    public int f11535e;
    public SparseArray f11536f;
    public Drawable[] f11537g;
    public int h;
    public boolean f11538i;
    public boolean f11539j;
    public Rect f11540k;
    public boolean f11541l;
    public boolean f11542m;
    public int f11543n;
    public int f11544o;
    public int f11545p;
    public int f11546q;
    public boolean f11547r;
    public int f11548s;
    public boolean f11549t;
    public boolean f11550u;
    public boolean v;
    public boolean f11551w;
    public int f11552x;
    public int f11553y;
    public int f11554z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f11538i = false;
        this.f11541l = false;
        this.f11551w = true;
        this.f11553y = 0;
        this.f11554z = 0;
        this.f11532a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f11533b;
        } else {
            resources2 = null;
        }
        this.f11533b = resources2;
        if (bVar != null) {
            i10 = bVar.f11534c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f11534c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f11535e = bVar.f11535e;
            this.f11550u = true;
            this.v = true;
            this.f11538i = bVar.f11538i;
            this.f11541l = bVar.f11541l;
            this.f11551w = bVar.f11551w;
            this.f11552x = bVar.f11552x;
            this.f11553y = bVar.f11553y;
            this.f11554z = bVar.f11554z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f11534c == i10) {
                if (bVar.f11539j) {
                    this.f11540k = bVar.f11540k != null ? new Rect(bVar.f11540k) : null;
                    this.f11539j = true;
                }
                if (bVar.f11542m) {
                    this.f11543n = bVar.f11543n;
                    this.f11544o = bVar.f11544o;
                    this.f11545p = bVar.f11545p;
                    this.f11546q = bVar.f11546q;
                    this.f11542m = true;
                }
            }
            if (bVar.f11547r) {
                this.f11548s = bVar.f11548s;
                this.f11547r = true;
            }
            if (bVar.f11549t) {
                this.f11549t = true;
            }
            Drawable[] drawableArr = bVar.f11537g;
            this.f11537g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f11536f;
            if (sparseArray != null) {
                this.f11536f = sparseArray.clone();
            } else {
                this.f11536f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f11536f.put(i13, constantState);
                    } else {
                        this.f11537g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f11537g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f11537g.length];
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
        if (i10 >= this.f11537g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11537g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11537g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f11532a);
        this.f11537g[i10] = drawable;
        this.h++;
        this.f11535e = drawable.getChangingConfigurations() | this.f11535e;
        this.f11547r = false;
        this.f11549t = false;
        this.f11540k = null;
        this.f11539j = false;
        this.f11542m = false;
        this.f11550u = false;
        return i10;
    }

    public final void b() {
        this.f11542m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f11537g;
        this.f11544o = -1;
        this.f11543n = -1;
        this.f11546q = 0;
        this.f11545p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f11543n) {
                this.f11543n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f11544o) {
                this.f11544o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f11545p) {
                this.f11545p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f11546q) {
                this.f11546q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f11536f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f11536f.keyAt(i10);
                Drawable[] drawableArr = this.f11537g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f11536f.valueAt(i10)).newDrawable(this.f11533b);
                newDrawable.setLayoutDirection(this.f11552x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f11532a);
                drawableArr[keyAt] = mutate;
            }
            this.f11536f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f11537g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11536f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f11537g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f11536f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f11536f.valueAt(indexOfKey)).newDrawable(this.f11533b);
        newDrawable.setLayoutDirection(this.f11552x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f11532a);
        this.f11537g[i10] = mutate;
        this.f11536f.removeAt(indexOfKey);
        if (this.f11536f.size() == 0) {
            this.f11536f = null;
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
        return this.d | this.f11535e;
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
