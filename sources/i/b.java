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
    public final e f12248a;
    public Resources f12249b;
    public int f12250c;
    public int d;
    public int e;
    public SparseArray f12251f;
    public Drawable[] f12252g;
    public int h;
    public boolean f12253i;
    public boolean f12254j;
    public Rect f12255k;
    public boolean f12256l;
    public boolean f12257m;
    public int f12258n;
    public int f12259o;
    public int f12260p;
    public int f12261q;
    public boolean f12262r;
    public int f12263s;
    public boolean f12264t;
    public boolean f12265u;
    public boolean v;
    public boolean f12266w;
    public int f12267x;
    public int f12268y;
    public int f12269z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f12253i = false;
        this.f12256l = false;
        this.f12266w = true;
        this.f12268y = 0;
        this.f12269z = 0;
        this.f12248a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f12249b;
        } else {
            resources2 = null;
        }
        this.f12249b = resources2;
        if (bVar != null) {
            i10 = bVar.f12250c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f12250c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f12265u = true;
            this.v = true;
            this.f12253i = bVar.f12253i;
            this.f12256l = bVar.f12256l;
            this.f12266w = bVar.f12266w;
            this.f12267x = bVar.f12267x;
            this.f12268y = bVar.f12268y;
            this.f12269z = bVar.f12269z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f12250c == i10) {
                if (bVar.f12254j) {
                    this.f12255k = bVar.f12255k != null ? new Rect(bVar.f12255k) : null;
                    this.f12254j = true;
                }
                if (bVar.f12257m) {
                    this.f12258n = bVar.f12258n;
                    this.f12259o = bVar.f12259o;
                    this.f12260p = bVar.f12260p;
                    this.f12261q = bVar.f12261q;
                    this.f12257m = true;
                }
            }
            if (bVar.f12262r) {
                this.f12263s = bVar.f12263s;
                this.f12262r = true;
            }
            if (bVar.f12264t) {
                this.f12264t = true;
            }
            Drawable[] drawableArr = bVar.f12252g;
            this.f12252g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f12251f;
            if (sparseArray != null) {
                this.f12251f = sparseArray.clone();
            } else {
                this.f12251f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12251f.put(i13, constantState);
                    } else {
                        this.f12252g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f12252g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f12252g.length];
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
        if (i10 >= this.f12252g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f12252g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f12252g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f12248a);
        this.f12252g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f12262r = false;
        this.f12264t = false;
        this.f12255k = null;
        this.f12254j = false;
        this.f12257m = false;
        this.f12265u = false;
        return i10;
    }

    public final void b() {
        this.f12257m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f12252g;
        this.f12259o = -1;
        this.f12258n = -1;
        this.f12261q = 0;
        this.f12260p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12258n) {
                this.f12258n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12259o) {
                this.f12259o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12260p) {
                this.f12260p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12261q) {
                this.f12261q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f12251f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f12251f.keyAt(i10);
                Drawable[] drawableArr = this.f12252g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f12251f.valueAt(i10)).newDrawable(this.f12249b);
                newDrawable.setLayoutDirection(this.f12267x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f12248a);
                drawableArr[keyAt] = mutate;
            }
            this.f12251f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f12252g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12251f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f12252g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12251f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f12251f.valueAt(indexOfKey)).newDrawable(this.f12249b);
        newDrawable.setLayoutDirection(this.f12267x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f12248a);
        this.f12252g[i10] = mutate;
        this.f12251f.removeAt(indexOfKey);
        if (this.f12251f.size() == 0) {
            this.f12251f = null;
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
