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
    public final e f14454a;
    public Resources f14455b;
    public int f14456c;
    public int d;
    public int f14457e;
    public SparseArray f14458f;
    public Drawable[] f14459g;
    public int h;
    public boolean f14460i;
    public boolean f14461j;
    public Rect f14462k;
    public boolean f14463l;
    public boolean f14464m;
    public int f14465n;
    public int f14466o;
    public int f14467p;
    public int f14468q;
    public boolean f14469r;
    public int f14470s;
    public boolean f14471t;
    public boolean f14472u;
    public boolean v;
    public boolean f14473w;
    public int f14474x;
    public int f14475y;
    public int f14476z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i3;
        this.f14460i = false;
        this.f14463l = false;
        this.f14473w = true;
        this.f14475y = 0;
        this.f14476z = 0;
        this.f14454a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f14455b;
        } else {
            resources2 = null;
        }
        this.f14455b = resources2;
        if (bVar != null) {
            i3 = bVar.f14456c;
        } else {
            i3 = 0;
        }
        int i10 = e.K;
        i3 = resources != null ? resources.getDisplayMetrics().densityDpi : i3;
        i3 = i3 == 0 ? 160 : i3;
        this.f14456c = i3;
        if (bVar != null) {
            this.d = bVar.d;
            this.f14457e = bVar.f14457e;
            this.f14472u = true;
            this.v = true;
            this.f14460i = bVar.f14460i;
            this.f14463l = bVar.f14463l;
            this.f14473w = bVar.f14473w;
            this.f14474x = bVar.f14474x;
            this.f14475y = bVar.f14475y;
            this.f14476z = bVar.f14476z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f14456c == i3) {
                if (bVar.f14461j) {
                    this.f14462k = bVar.f14462k != null ? new Rect(bVar.f14462k) : null;
                    this.f14461j = true;
                }
                if (bVar.f14464m) {
                    this.f14465n = bVar.f14465n;
                    this.f14466o = bVar.f14466o;
                    this.f14467p = bVar.f14467p;
                    this.f14468q = bVar.f14468q;
                    this.f14464m = true;
                }
            }
            if (bVar.f14469r) {
                this.f14470s = bVar.f14470s;
                this.f14469r = true;
            }
            if (bVar.f14471t) {
                this.f14471t = true;
            }
            Drawable[] drawableArr = bVar.f14459g;
            this.f14459g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f14458f;
            if (sparseArray != null) {
                this.f14458f = sparseArray.clone();
            } else {
                this.f14458f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f14458f.put(i12, constantState);
                    } else {
                        this.f14459g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f14459g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f14459g.length];
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
        int i3 = this.h;
        if (i3 >= this.f14459g.length) {
            int i10 = i3 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f14459g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i3);
            }
            this.f14459g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i3);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f14454a);
        this.f14459g[i3] = drawable;
        this.h++;
        this.f14457e = drawable.getChangingConfigurations() | this.f14457e;
        this.f14469r = false;
        this.f14471t = false;
        this.f14462k = null;
        this.f14461j = false;
        this.f14464m = false;
        this.f14472u = false;
        return i3;
    }

    public final void b() {
        this.f14464m = true;
        c();
        int i3 = this.h;
        Drawable[] drawableArr = this.f14459g;
        this.f14466o = -1;
        this.f14465n = -1;
        this.f14468q = 0;
        this.f14467p = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f14465n) {
                this.f14465n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f14466o) {
                this.f14466o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f14467p) {
                this.f14467p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f14468q) {
                this.f14468q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f14458f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f14458f.keyAt(i3);
                Drawable[] drawableArr = this.f14459g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f14458f.valueAt(i3)).newDrawable(this.f14455b);
                newDrawable.setLayoutDirection(this.f14474x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f14454a);
                drawableArr[keyAt] = mutate;
            }
            this.f14458f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i3 = this.h;
        Drawable[] drawableArr = this.f14459g;
        for (int i10 = 0; i10 < i3; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14458f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i3) {
        int indexOfKey;
        Drawable drawable = this.f14459g[i3];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f14458f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i3)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f14458f.valueAt(indexOfKey)).newDrawable(this.f14455b);
        newDrawable.setLayoutDirection(this.f14474x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f14454a);
        this.f14459g[i3] = mutate;
        this.f14458f.removeAt(indexOfKey);
        if (this.f14458f.size() == 0) {
            this.f14458f = null;
        }
        return mutate;
    }

    public final int e(int i3) {
        Object obj;
        if (i3 < 0) {
            return 0;
        }
        m mVar = this.J;
        Integer num = 0;
        int a10 = b0.a.a(mVar.f34c, i3, mVar.f32a);
        if (a10 >= 0 && (obj = mVar.f33b[a10]) != i.f21b) {
            num = obj;
        }
        return num.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i3 = this.h;
        for (int i10 = 0; i10 < i3; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int getChangingConfigurations() {
        return this.d | this.f14457e;
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
