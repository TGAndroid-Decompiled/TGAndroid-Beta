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
    public final e f15876a;
    public Resources f15877b;
    public int f15878c;
    public int d;
    public int f15879e;
    public SparseArray f15880f;
    public Drawable[] f15881g;
    public int h;
    public boolean f15882i;
    public boolean f15883j;
    public Rect f15884k;
    public boolean f15885l;
    public boolean f15886m;
    public int f15887n;
    public int f15888o;
    public int f15889p;
    public int f15890q;
    public boolean f15891r;
    public int f15892s;
    public boolean f15893t;
    public boolean f15894u;
    public boolean v;
    public boolean f15895w;
    public int f15896x;
    public int f15897y;
    public int f15898z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15882i = false;
        this.f15885l = false;
        this.f15895w = true;
        this.f15897y = 0;
        this.f15898z = 0;
        this.f15876a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15877b;
        } else {
            resources2 = null;
        }
        this.f15877b = resources2;
        if (bVar != null) {
            i7 = bVar.f15878c;
        } else {
            i7 = 0;
        }
        int i10 = e.K;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15878c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15879e = bVar.f15879e;
            this.f15894u = true;
            this.v = true;
            this.f15882i = bVar.f15882i;
            this.f15885l = bVar.f15885l;
            this.f15895w = bVar.f15895w;
            this.f15896x = bVar.f15896x;
            this.f15897y = bVar.f15897y;
            this.f15898z = bVar.f15898z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15878c == i7) {
                if (bVar.f15883j) {
                    this.f15884k = bVar.f15884k != null ? new Rect(bVar.f15884k) : null;
                    this.f15883j = true;
                }
                if (bVar.f15886m) {
                    this.f15887n = bVar.f15887n;
                    this.f15888o = bVar.f15888o;
                    this.f15889p = bVar.f15889p;
                    this.f15890q = bVar.f15890q;
                    this.f15886m = true;
                }
            }
            if (bVar.f15891r) {
                this.f15892s = bVar.f15892s;
                this.f15891r = true;
            }
            if (bVar.f15893t) {
                this.f15893t = true;
            }
            Drawable[] drawableArr = bVar.f15881g;
            this.f15881g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15880f;
            if (sparseArray != null) {
                this.f15880f = sparseArray.clone();
            } else {
                this.f15880f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15880f.put(i12, constantState);
                    } else {
                        this.f15881g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15881g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15881g.length];
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
        if (i7 >= this.f15881g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15881g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15881g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15876a);
        this.f15881g[i7] = drawable;
        this.h++;
        this.f15879e = drawable.getChangingConfigurations() | this.f15879e;
        this.f15891r = false;
        this.f15893t = false;
        this.f15884k = null;
        this.f15883j = false;
        this.f15886m = false;
        this.f15894u = false;
        return i7;
    }

    public final void b() {
        this.f15886m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15881g;
        this.f15888o = -1;
        this.f15887n = -1;
        this.f15890q = 0;
        this.f15889p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15887n) {
                this.f15887n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15888o) {
                this.f15888o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15889p) {
                this.f15889p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15890q) {
                this.f15890q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15880f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15880f.keyAt(i7);
                Drawable[] drawableArr = this.f15881g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15880f.valueAt(i7)).newDrawable(this.f15877b);
                newDrawable.setLayoutDirection(this.f15896x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15876a);
                drawableArr[keyAt] = mutate;
            }
            this.f15880f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15881g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15880f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15881g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15880f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15880f.valueAt(indexOfKey)).newDrawable(this.f15877b);
        newDrawable.setLayoutDirection(this.f15896x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15876a);
        this.f15881g[i7] = mutate;
        this.f15880f.removeAt(indexOfKey);
        if (this.f15880f.size() == 0) {
            this.f15880f = null;
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
        return this.d | this.f15879e;
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
