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
    public final e f12246a;
    public Resources f12247b;
    public int f12248c;
    public int d;
    public int e;
    public SparseArray f12249f;
    public Drawable[] f12250g;
    public int h;
    public boolean f12251i;
    public boolean f12252j;
    public Rect f12253k;
    public boolean f12254l;
    public boolean f12255m;
    public int f12256n;
    public int f12257o;
    public int f12258p;
    public int f12259q;
    public boolean f12260r;
    public int f12261s;
    public boolean f12262t;
    public boolean f12263u;
    public boolean v;
    public boolean f12264w;
    public int f12265x;
    public int f12266y;
    public int f12267z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f12251i = false;
        this.f12254l = false;
        this.f12264w = true;
        this.f12266y = 0;
        this.f12267z = 0;
        this.f12246a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f12247b;
        } else {
            resources2 = null;
        }
        this.f12247b = resources2;
        if (bVar != null) {
            i10 = bVar.f12248c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f12248c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f12263u = true;
            this.v = true;
            this.f12251i = bVar.f12251i;
            this.f12254l = bVar.f12254l;
            this.f12264w = bVar.f12264w;
            this.f12265x = bVar.f12265x;
            this.f12266y = bVar.f12266y;
            this.f12267z = bVar.f12267z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f12248c == i10) {
                if (bVar.f12252j) {
                    this.f12253k = bVar.f12253k != null ? new Rect(bVar.f12253k) : null;
                    this.f12252j = true;
                }
                if (bVar.f12255m) {
                    this.f12256n = bVar.f12256n;
                    this.f12257o = bVar.f12257o;
                    this.f12258p = bVar.f12258p;
                    this.f12259q = bVar.f12259q;
                    this.f12255m = true;
                }
            }
            if (bVar.f12260r) {
                this.f12261s = bVar.f12261s;
                this.f12260r = true;
            }
            if (bVar.f12262t) {
                this.f12262t = true;
            }
            Drawable[] drawableArr = bVar.f12250g;
            this.f12250g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f12249f;
            if (sparseArray != null) {
                this.f12249f = sparseArray.clone();
            } else {
                this.f12249f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12249f.put(i13, constantState);
                    } else {
                        this.f12250g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f12250g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f12250g.length];
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
        if (i10 >= this.f12250g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f12250g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f12250g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f12246a);
        this.f12250g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f12260r = false;
        this.f12262t = false;
        this.f12253k = null;
        this.f12252j = false;
        this.f12255m = false;
        this.f12263u = false;
        return i10;
    }

    public final void b() {
        this.f12255m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f12250g;
        this.f12257o = -1;
        this.f12256n = -1;
        this.f12259q = 0;
        this.f12258p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12256n) {
                this.f12256n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12257o) {
                this.f12257o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12258p) {
                this.f12258p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12259q) {
                this.f12259q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f12249f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f12249f.keyAt(i10);
                Drawable[] drawableArr = this.f12250g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f12249f.valueAt(i10)).newDrawable(this.f12247b);
                newDrawable.setLayoutDirection(this.f12265x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f12246a);
                drawableArr[keyAt] = mutate;
            }
            this.f12249f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f12250g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12249f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f12250g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12249f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f12249f.valueAt(indexOfKey)).newDrawable(this.f12247b);
        newDrawable.setLayoutDirection(this.f12265x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f12246a);
        this.f12250g[i10] = mutate;
        this.f12249f.removeAt(indexOfKey);
        if (this.f12249f.size() == 0) {
            this.f12249f = null;
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
