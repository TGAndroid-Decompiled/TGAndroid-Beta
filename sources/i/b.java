package i;

import a0.h;
import a0.i;
import a0.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import j7.h8;
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
    public l J;
    public final g f7173a;
    public Resources f7174b;
    public int f7175c;
    public int d;
    public int e;
    public SparseArray f7176f;
    public Drawable[] f7177g;
    public int h;
    public boolean f7178i;
    public boolean f7179j;
    public Rect f7180k;
    public boolean f7181l;
    public boolean f7182m;
    public int f7183n;
    public int f7184o;
    public int f7185p;
    public int f7186q;
    public boolean f7187r;
    public int f7188s;
    public boolean f7189t;
    public boolean f7190u;
    public boolean v;
    public boolean f7191w;
    public int f7192x;
    public int f7193y;
    public int f7194z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f7178i = false;
        this.f7181l = false;
        this.f7191w = true;
        this.f7193y = 0;
        this.f7194z = 0;
        this.f7173a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f7174b;
        } else {
            resources2 = null;
        }
        this.f7174b = resources2;
        if (bVar != null) {
            i10 = bVar.f7175c;
        } else {
            i10 = 0;
        }
        int i11 = g.f7203x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f7175c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f7190u = true;
            this.v = true;
            this.f7178i = bVar.f7178i;
            this.f7181l = bVar.f7181l;
            this.f7191w = bVar.f7191w;
            this.f7192x = bVar.f7192x;
            this.f7193y = bVar.f7193y;
            this.f7194z = bVar.f7194z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f7175c == i10) {
                if (bVar.f7179j) {
                    this.f7180k = bVar.f7180k != null ? new Rect(bVar.f7180k) : null;
                    this.f7179j = true;
                }
                if (bVar.f7182m) {
                    this.f7183n = bVar.f7183n;
                    this.f7184o = bVar.f7184o;
                    this.f7185p = bVar.f7185p;
                    this.f7186q = bVar.f7186q;
                    this.f7182m = true;
                }
            }
            if (bVar.f7187r) {
                this.f7188s = bVar.f7188s;
                this.f7187r = true;
            }
            if (bVar.f7189t) {
                this.f7189t = true;
            }
            Drawable[] drawableArr = bVar.f7177g;
            this.f7177g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f7176f;
            if (sparseArray != null) {
                this.f7176f = sparseArray.clone();
            } else {
                this.f7176f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7176f.put(i13, constantState);
                    } else {
                        this.f7177g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f7177g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f7177g.length];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
            return;
        }
        this.I = new h();
        this.J = new l();
    }

    public final int a(Drawable drawable) {
        int i10 = this.h;
        if (i10 >= this.f7177g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f7177g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f7177g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7173a);
        this.f7177g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f7187r = false;
        this.f7189t = false;
        this.f7180k = null;
        this.f7179j = false;
        this.f7182m = false;
        this.f7190u = false;
        return i10;
    }

    public final void b() {
        this.f7182m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f7177g;
        this.f7184o = -1;
        this.f7183n = -1;
        this.f7186q = 0;
        this.f7185p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7183n) {
                this.f7183n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7184o) {
                this.f7184o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7185p) {
                this.f7185p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7186q) {
                this.f7186q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f7176f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f7176f.keyAt(i10);
                Drawable[] drawableArr = this.f7177g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f7176f.valueAt(i10)).newDrawable(this.f7174b);
                if (Build.VERSION.SDK_INT >= 23) {
                    h8.b(this.f7192x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f7173a);
                drawableArr[keyAt] = mutate;
            }
            this.f7176f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f7177g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7176f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f7177g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7176f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f7176f.valueAt(indexOfKey)).newDrawable(this.f7174b);
        if (Build.VERSION.SDK_INT >= 23) {
            h8.b(this.f7192x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f7173a);
        this.f7177g[i10] = mutate;
        this.f7176f.removeAt(indexOfKey);
        if (this.f7176f.size() == 0) {
            this.f7176f = null;
        }
        return mutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        l lVar = this.J;
        Integer num = 0;
        int a2 = b0.a.a(lVar.f28c, i10, lVar.f26a);
        if (a2 >= 0 && (obj = lVar.f27b[a2]) != i.f18b) {
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
        return this.d | this.e;
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
