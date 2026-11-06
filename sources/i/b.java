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
    public final e f15076a;
    public Resources f15077b;
    public int f15078c;
    public int d;
    public int f15079e;
    public SparseArray f15080f;
    public Drawable[] f15081g;
    public int h;
    public boolean f15082i;
    public boolean f15083j;
    public Rect f15084k;
    public boolean f15085l;
    public boolean f15086m;
    public int f15087n;
    public int f15088o;
    public int f15089p;
    public int f15090q;
    public boolean f15091r;
    public int f15092s;
    public boolean f15093t;
    public boolean f15094u;
    public boolean v;
    public boolean f15095w;
    public int f15096x;
    public int f15097y;
    public int f15098z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15082i = false;
        this.f15085l = false;
        this.f15095w = true;
        this.f15097y = 0;
        this.f15098z = 0;
        this.f15076a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15077b;
        } else {
            resources2 = null;
        }
        this.f15077b = resources2;
        if (bVar != null) {
            i7 = bVar.f15078c;
        } else {
            i7 = 0;
        }
        int i10 = e.J;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15078c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15079e = bVar.f15079e;
            this.f15094u = true;
            this.v = true;
            this.f15082i = bVar.f15082i;
            this.f15085l = bVar.f15085l;
            this.f15095w = bVar.f15095w;
            this.f15096x = bVar.f15096x;
            this.f15097y = bVar.f15097y;
            this.f15098z = bVar.f15098z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15078c == i7) {
                if (bVar.f15083j) {
                    this.f15084k = bVar.f15084k != null ? new Rect(bVar.f15084k) : null;
                    this.f15083j = true;
                }
                if (bVar.f15086m) {
                    this.f15087n = bVar.f15087n;
                    this.f15088o = bVar.f15088o;
                    this.f15089p = bVar.f15089p;
                    this.f15090q = bVar.f15090q;
                    this.f15086m = true;
                }
            }
            if (bVar.f15091r) {
                this.f15092s = bVar.f15092s;
                this.f15091r = true;
            }
            if (bVar.f15093t) {
                this.f15093t = true;
            }
            Drawable[] drawableArr = bVar.f15081g;
            this.f15081g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15080f;
            if (sparseArray != null) {
                this.f15080f = sparseArray.clone();
            } else {
                this.f15080f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15080f.put(i12, constantState);
                    } else {
                        this.f15081g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15081g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15081g.length];
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
        if (i7 >= this.f15081g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15081g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15081g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15076a);
        this.f15081g[i7] = drawable;
        this.h++;
        this.f15079e = drawable.getChangingConfigurations() | this.f15079e;
        this.f15091r = false;
        this.f15093t = false;
        this.f15084k = null;
        this.f15083j = false;
        this.f15086m = false;
        this.f15094u = false;
        return i7;
    }

    public final void b() {
        this.f15086m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15081g;
        this.f15088o = -1;
        this.f15087n = -1;
        this.f15090q = 0;
        this.f15089p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15087n) {
                this.f15087n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15088o) {
                this.f15088o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15089p) {
                this.f15089p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15090q) {
                this.f15090q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15080f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15080f.keyAt(i7);
                Drawable[] drawableArr = this.f15081g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15080f.valueAt(i7)).newDrawable(this.f15077b);
                newDrawable.setLayoutDirection(this.f15096x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15076a);
                drawableArr[keyAt] = mutate;
            }
            this.f15080f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15081g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15080f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15081g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15080f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15080f.valueAt(indexOfKey)).newDrawable(this.f15077b);
        newDrawable.setLayoutDirection(this.f15096x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15076a);
        this.f15081g[i7] = mutate;
        this.f15080f.removeAt(indexOfKey);
        if (this.f15080f.size() == 0) {
            this.f15080f = null;
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
        return this.d | this.f15079e;
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
