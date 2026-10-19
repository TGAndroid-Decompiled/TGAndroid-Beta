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
    public final e f12245a;
    public Resources f12246b;
    public int f12247c;
    public int d;
    public int e;
    public SparseArray f12248f;
    public Drawable[] f12249g;
    public int h;
    public boolean f12250i;
    public boolean f12251j;
    public Rect f12252k;
    public boolean f12253l;
    public boolean f12254m;
    public int f12255n;
    public int f12256o;
    public int f12257p;
    public int f12258q;
    public boolean f12259r;
    public int f12260s;
    public boolean f12261t;
    public boolean f12262u;
    public boolean v;
    public boolean f12263w;
    public int f12264x;
    public int f12265y;
    public int f12266z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f12250i = false;
        this.f12253l = false;
        this.f12263w = true;
        this.f12265y = 0;
        this.f12266z = 0;
        this.f12245a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f12246b;
        } else {
            resources2 = null;
        }
        this.f12246b = resources2;
        if (bVar != null) {
            i10 = bVar.f12247c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f12247c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f12262u = true;
            this.v = true;
            this.f12250i = bVar.f12250i;
            this.f12253l = bVar.f12253l;
            this.f12263w = bVar.f12263w;
            this.f12264x = bVar.f12264x;
            this.f12265y = bVar.f12265y;
            this.f12266z = bVar.f12266z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f12247c == i10) {
                if (bVar.f12251j) {
                    this.f12252k = bVar.f12252k != null ? new Rect(bVar.f12252k) : null;
                    this.f12251j = true;
                }
                if (bVar.f12254m) {
                    this.f12255n = bVar.f12255n;
                    this.f12256o = bVar.f12256o;
                    this.f12257p = bVar.f12257p;
                    this.f12258q = bVar.f12258q;
                    this.f12254m = true;
                }
            }
            if (bVar.f12259r) {
                this.f12260s = bVar.f12260s;
                this.f12259r = true;
            }
            if (bVar.f12261t) {
                this.f12261t = true;
            }
            Drawable[] drawableArr = bVar.f12249g;
            this.f12249g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f12248f;
            if (sparseArray != null) {
                this.f12248f = sparseArray.clone();
            } else {
                this.f12248f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12248f.put(i13, constantState);
                    } else {
                        this.f12249g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f12249g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f12249g.length];
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
        if (i10 >= this.f12249g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f12249g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f12249g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f12245a);
        this.f12249g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f12259r = false;
        this.f12261t = false;
        this.f12252k = null;
        this.f12251j = false;
        this.f12254m = false;
        this.f12262u = false;
        return i10;
    }

    public final void b() {
        this.f12254m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f12249g;
        this.f12256o = -1;
        this.f12255n = -1;
        this.f12258q = 0;
        this.f12257p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12255n) {
                this.f12255n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12256o) {
                this.f12256o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12257p) {
                this.f12257p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12258q) {
                this.f12258q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f12248f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f12248f.keyAt(i10);
                Drawable[] drawableArr = this.f12249g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f12248f.valueAt(i10)).newDrawable(this.f12246b);
                newDrawable.setLayoutDirection(this.f12264x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f12245a);
                drawableArr[keyAt] = mutate;
            }
            this.f12248f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f12249g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12248f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f12249g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12248f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f12248f.valueAt(indexOfKey)).newDrawable(this.f12246b);
        newDrawable.setLayoutDirection(this.f12264x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f12245a);
        this.f12249g[i10] = mutate;
        this.f12248f.removeAt(indexOfKey);
        if (this.f12248f.size() == 0) {
            this.f12248f = null;
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
