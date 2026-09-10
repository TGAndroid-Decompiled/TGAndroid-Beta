package i;

import a0.i;
import a0.j;
import a0.m;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import v7.r8;
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
    public m J;
    public final f f10035a;
    public Resources f10036b;
    public int f10037c;
    public int d;
    public int e;
    public SparseArray f10038f;
    public Drawable[] f10039g;
    public int h;
    public boolean f10040i;
    public boolean f10041j;
    public Rect f10042k;
    public boolean f10043l;
    public boolean f10044m;
    public int f10045n;
    public int f10046o;
    public int f10047p;
    public int f10048q;
    public boolean f10049r;
    public int f10050s;
    public boolean f10051t;
    public boolean f10052u;
    public boolean v;
    public boolean f10053w;
    public int f10054x;
    public int f10055y;
    public int f10056z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10040i = false;
        this.f10043l = false;
        this.f10053w = true;
        this.f10055y = 0;
        this.f10056z = 0;
        this.f10035a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10036b;
        } else {
            resources2 = null;
        }
        this.f10036b = resources2;
        if (bVar != null) {
            i10 = bVar.f10037c;
        } else {
            i10 = 0;
        }
        int i11 = f.f10063x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10037c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10052u = true;
            this.v = true;
            this.f10040i = bVar.f10040i;
            this.f10043l = bVar.f10043l;
            this.f10053w = bVar.f10053w;
            this.f10054x = bVar.f10054x;
            this.f10055y = bVar.f10055y;
            this.f10056z = bVar.f10056z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10037c == i10) {
                if (bVar.f10041j) {
                    this.f10042k = bVar.f10042k != null ? new Rect(bVar.f10042k) : null;
                    this.f10041j = true;
                }
                if (bVar.f10044m) {
                    this.f10045n = bVar.f10045n;
                    this.f10046o = bVar.f10046o;
                    this.f10047p = bVar.f10047p;
                    this.f10048q = bVar.f10048q;
                    this.f10044m = true;
                }
            }
            if (bVar.f10049r) {
                this.f10050s = bVar.f10050s;
                this.f10049r = true;
            }
            if (bVar.f10051t) {
                this.f10051t = true;
            }
            Drawable[] drawableArr = bVar.f10039g;
            this.f10039g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10038f;
            if (sparseArray != null) {
                this.f10038f = sparseArray.clone();
            } else {
                this.f10038f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10038f.put(i13, constantState);
                    } else {
                        this.f10039g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10039g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10039g.length];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
            return;
        }
        this.I = new i();
        this.J = new m();
    }

    public final int a(Drawable drawable) {
        int i10 = this.h;
        if (i10 >= this.f10039g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10039g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10039g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10035a);
        this.f10039g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10049r = false;
        this.f10051t = false;
        this.f10042k = null;
        this.f10041j = false;
        this.f10044m = false;
        this.f10052u = false;
        return i10;
    }

    public final void b() {
        this.f10044m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10039g;
        this.f10046o = -1;
        this.f10045n = -1;
        this.f10048q = 0;
        this.f10047p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10045n) {
                this.f10045n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10046o) {
                this.f10046o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10047p) {
                this.f10047p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10048q) {
                this.f10048q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10038f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10038f.keyAt(i10);
                Drawable[] drawableArr = this.f10039g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10038f.valueAt(i10)).newDrawable(this.f10036b);
                if (Build.VERSION.SDK_INT >= 23) {
                    r8.b(this.f10054x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10035a);
                drawableArr[keyAt] = mutate;
            }
            this.f10038f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10039g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10038f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10039g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10038f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10038f.valueAt(indexOfKey)).newDrawable(this.f10036b);
        if (Build.VERSION.SDK_INT >= 23) {
            r8.b(this.f10054x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10035a);
        this.f10039g[i10] = mutate;
        this.f10038f.removeAt(indexOfKey);
        if (this.f10038f.size() == 0) {
            this.f10038f = null;
        }
        return mutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        m mVar = this.J;
        Integer num = 0;
        int a2 = b0.a.a(mVar.f31c, i10, mVar.f29a);
        if (a2 >= 0 && (obj = mVar.f30b[a2]) != j.f21b) {
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
