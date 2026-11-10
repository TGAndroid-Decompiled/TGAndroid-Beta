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
    public final e f15081a;
    public Resources f15082b;
    public int f15083c;
    public int d;
    public int f15084e;
    public SparseArray f15085f;
    public Drawable[] f15086g;
    public int h;
    public boolean f15087i;
    public boolean f15088j;
    public Rect f15089k;
    public boolean f15090l;
    public boolean f15091m;
    public int f15092n;
    public int f15093o;
    public int f15094p;
    public int f15095q;
    public boolean f15096r;
    public int f15097s;
    public boolean f15098t;
    public boolean f15099u;
    public boolean v;
    public boolean f15100w;
    public int f15101x;
    public int f15102y;
    public int f15103z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15087i = false;
        this.f15090l = false;
        this.f15100w = true;
        this.f15102y = 0;
        this.f15103z = 0;
        this.f15081a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15082b;
        } else {
            resources2 = null;
        }
        this.f15082b = resources2;
        if (bVar != null) {
            i7 = bVar.f15083c;
        } else {
            i7 = 0;
        }
        int i10 = e.J;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15083c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15084e = bVar.f15084e;
            this.f15099u = true;
            this.v = true;
            this.f15087i = bVar.f15087i;
            this.f15090l = bVar.f15090l;
            this.f15100w = bVar.f15100w;
            this.f15101x = bVar.f15101x;
            this.f15102y = bVar.f15102y;
            this.f15103z = bVar.f15103z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15083c == i7) {
                if (bVar.f15088j) {
                    this.f15089k = bVar.f15089k != null ? new Rect(bVar.f15089k) : null;
                    this.f15088j = true;
                }
                if (bVar.f15091m) {
                    this.f15092n = bVar.f15092n;
                    this.f15093o = bVar.f15093o;
                    this.f15094p = bVar.f15094p;
                    this.f15095q = bVar.f15095q;
                    this.f15091m = true;
                }
            }
            if (bVar.f15096r) {
                this.f15097s = bVar.f15097s;
                this.f15096r = true;
            }
            if (bVar.f15098t) {
                this.f15098t = true;
            }
            Drawable[] drawableArr = bVar.f15086g;
            this.f15086g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15085f;
            if (sparseArray != null) {
                this.f15085f = sparseArray.clone();
            } else {
                this.f15085f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15085f.put(i12, constantState);
                    } else {
                        this.f15086g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15086g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15086g.length];
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
        if (i7 >= this.f15086g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15086g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15086g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15081a);
        this.f15086g[i7] = drawable;
        this.h++;
        this.f15084e = drawable.getChangingConfigurations() | this.f15084e;
        this.f15096r = false;
        this.f15098t = false;
        this.f15089k = null;
        this.f15088j = false;
        this.f15091m = false;
        this.f15099u = false;
        return i7;
    }

    public final void b() {
        this.f15091m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15086g;
        this.f15093o = -1;
        this.f15092n = -1;
        this.f15095q = 0;
        this.f15094p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15092n) {
                this.f15092n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15093o) {
                this.f15093o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15094p) {
                this.f15094p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15095q) {
                this.f15095q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15085f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15085f.keyAt(i7);
                Drawable[] drawableArr = this.f15086g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15085f.valueAt(i7)).newDrawable(this.f15082b);
                newDrawable.setLayoutDirection(this.f15101x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15081a);
                drawableArr[keyAt] = mutate;
            }
            this.f15085f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15086g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15085f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15086g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15085f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15085f.valueAt(indexOfKey)).newDrawable(this.f15082b);
        newDrawable.setLayoutDirection(this.f15101x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15081a);
        this.f15086g[i7] = mutate;
        this.f15085f.removeAt(indexOfKey);
        if (this.f15085f.size() == 0) {
            this.f15085f = null;
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
        return this.d | this.f15084e;
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
