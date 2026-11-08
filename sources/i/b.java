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
    public final e f15079a;
    public Resources f15080b;
    public int f15081c;
    public int d;
    public int f15082e;
    public SparseArray f15083f;
    public Drawable[] f15084g;
    public int h;
    public boolean f15085i;
    public boolean f15086j;
    public Rect f15087k;
    public boolean f15088l;
    public boolean f15089m;
    public int f15090n;
    public int f15091o;
    public int f15092p;
    public int f15093q;
    public boolean f15094r;
    public int f15095s;
    public boolean f15096t;
    public boolean f15097u;
    public boolean v;
    public boolean f15098w;
    public int f15099x;
    public int f15100y;
    public int f15101z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15085i = false;
        this.f15088l = false;
        this.f15098w = true;
        this.f15100y = 0;
        this.f15101z = 0;
        this.f15079a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15080b;
        } else {
            resources2 = null;
        }
        this.f15080b = resources2;
        if (bVar != null) {
            i7 = bVar.f15081c;
        } else {
            i7 = 0;
        }
        int i10 = e.J;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15081c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15082e = bVar.f15082e;
            this.f15097u = true;
            this.v = true;
            this.f15085i = bVar.f15085i;
            this.f15088l = bVar.f15088l;
            this.f15098w = bVar.f15098w;
            this.f15099x = bVar.f15099x;
            this.f15100y = bVar.f15100y;
            this.f15101z = bVar.f15101z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15081c == i7) {
                if (bVar.f15086j) {
                    this.f15087k = bVar.f15087k != null ? new Rect(bVar.f15087k) : null;
                    this.f15086j = true;
                }
                if (bVar.f15089m) {
                    this.f15090n = bVar.f15090n;
                    this.f15091o = bVar.f15091o;
                    this.f15092p = bVar.f15092p;
                    this.f15093q = bVar.f15093q;
                    this.f15089m = true;
                }
            }
            if (bVar.f15094r) {
                this.f15095s = bVar.f15095s;
                this.f15094r = true;
            }
            if (bVar.f15096t) {
                this.f15096t = true;
            }
            Drawable[] drawableArr = bVar.f15084g;
            this.f15084g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15083f;
            if (sparseArray != null) {
                this.f15083f = sparseArray.clone();
            } else {
                this.f15083f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15083f.put(i12, constantState);
                    } else {
                        this.f15084g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15084g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15084g.length];
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
        if (i7 >= this.f15084g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15084g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15084g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15079a);
        this.f15084g[i7] = drawable;
        this.h++;
        this.f15082e = drawable.getChangingConfigurations() | this.f15082e;
        this.f15094r = false;
        this.f15096t = false;
        this.f15087k = null;
        this.f15086j = false;
        this.f15089m = false;
        this.f15097u = false;
        return i7;
    }

    public final void b() {
        this.f15089m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15084g;
        this.f15091o = -1;
        this.f15090n = -1;
        this.f15093q = 0;
        this.f15092p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15090n) {
                this.f15090n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15091o) {
                this.f15091o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15092p) {
                this.f15092p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15093q) {
                this.f15093q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15083f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15083f.keyAt(i7);
                Drawable[] drawableArr = this.f15084g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15083f.valueAt(i7)).newDrawable(this.f15080b);
                newDrawable.setLayoutDirection(this.f15099x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15079a);
                drawableArr[keyAt] = mutate;
            }
            this.f15083f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15084g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15083f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15084g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15083f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15083f.valueAt(indexOfKey)).newDrawable(this.f15080b);
        newDrawable.setLayoutDirection(this.f15099x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15079a);
        this.f15084g[i7] = mutate;
        this.f15083f.removeAt(indexOfKey);
        if (this.f15083f.size() == 0) {
            this.f15083f = null;
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
        return this.d | this.f15082e;
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
