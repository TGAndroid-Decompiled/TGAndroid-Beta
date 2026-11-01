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
    public final e f7728a;
    public Resources f7729b;
    public int f7730c;
    public int d;
    public int e;
    public SparseArray f7731f;
    public Drawable[] f7732g;
    public int h;
    public boolean f7733i;
    public boolean f7734j;
    public Rect f7735k;
    public boolean f7736l;
    public boolean f7737m;
    public int f7738n;
    public int f7739o;
    public int f7740p;
    public int f7741q;
    public boolean f7742r;
    public int f7743s;
    public boolean f7744t;
    public boolean f7745u;
    public boolean v;
    public boolean f7746w;
    public int f7747x;
    public int f7748y;
    public int f7749z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f7733i = false;
        this.f7736l = false;
        this.f7746w = true;
        this.f7748y = 0;
        this.f7749z = 0;
        this.f7728a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f7729b;
        } else {
            resources2 = null;
        }
        this.f7729b = resources2;
        if (bVar != null) {
            i10 = bVar.f7730c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f7730c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f7745u = true;
            this.v = true;
            this.f7733i = bVar.f7733i;
            this.f7736l = bVar.f7736l;
            this.f7746w = bVar.f7746w;
            this.f7747x = bVar.f7747x;
            this.f7748y = bVar.f7748y;
            this.f7749z = bVar.f7749z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f7730c == i10) {
                if (bVar.f7734j) {
                    this.f7735k = bVar.f7735k != null ? new Rect(bVar.f7735k) : null;
                    this.f7734j = true;
                }
                if (bVar.f7737m) {
                    this.f7738n = bVar.f7738n;
                    this.f7739o = bVar.f7739o;
                    this.f7740p = bVar.f7740p;
                    this.f7741q = bVar.f7741q;
                    this.f7737m = true;
                }
            }
            if (bVar.f7742r) {
                this.f7743s = bVar.f7743s;
                this.f7742r = true;
            }
            if (bVar.f7744t) {
                this.f7744t = true;
            }
            Drawable[] drawableArr = bVar.f7732g;
            this.f7732g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f7731f;
            if (sparseArray != null) {
                this.f7731f = sparseArray.clone();
            } else {
                this.f7731f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7731f.put(i13, constantState);
                    } else {
                        this.f7732g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f7732g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f7732g.length];
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
        int i10 = this.h;
        if (i10 >= this.f7732g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f7732g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f7732g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7728a);
        this.f7732g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f7742r = false;
        this.f7744t = false;
        this.f7735k = null;
        this.f7734j = false;
        this.f7737m = false;
        this.f7745u = false;
        return i10;
    }

    public final void b() {
        this.f7737m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f7732g;
        this.f7739o = -1;
        this.f7738n = -1;
        this.f7741q = 0;
        this.f7740p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7738n) {
                this.f7738n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7739o) {
                this.f7739o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7740p) {
                this.f7740p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7741q) {
                this.f7741q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f7731f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f7731f.keyAt(i10);
                Drawable[] drawableArr = this.f7732g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f7731f.valueAt(i10)).newDrawable(this.f7729b);
                newDrawable.setLayoutDirection(this.f7747x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f7728a);
                drawableArr[keyAt] = mutate;
            }
            this.f7731f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f7732g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7731f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f7732g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7731f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f7731f.valueAt(indexOfKey)).newDrawable(this.f7729b);
        newDrawable.setLayoutDirection(this.f7747x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f7728a);
        this.f7732g[i10] = mutate;
        this.f7731f.removeAt(indexOfKey);
        if (this.f7731f.size() == 0) {
            this.f7731f = null;
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
        int a2 = b0.a.a(mVar.f30c, i10, mVar.f28a);
        if (a2 >= 0 && (obj = mVar.f29b[a2]) != i.f18b) {
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
