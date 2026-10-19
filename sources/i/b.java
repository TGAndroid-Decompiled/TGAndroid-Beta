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
    public final e f12247a;
    public Resources f12248b;
    public int f12249c;
    public int d;
    public int e;
    public SparseArray f12250f;
    public Drawable[] f12251g;
    public int h;
    public boolean f12252i;
    public boolean f12253j;
    public Rect f12254k;
    public boolean f12255l;
    public boolean f12256m;
    public int f12257n;
    public int f12258o;
    public int f12259p;
    public int f12260q;
    public boolean f12261r;
    public int f12262s;
    public boolean f12263t;
    public boolean f12264u;
    public boolean v;
    public boolean f12265w;
    public int f12266x;
    public int f12267y;
    public int f12268z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f12252i = false;
        this.f12255l = false;
        this.f12265w = true;
        this.f12267y = 0;
        this.f12268z = 0;
        this.f12247a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f12248b;
        } else {
            resources2 = null;
        }
        this.f12248b = resources2;
        if (bVar != null) {
            i10 = bVar.f12249c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f12249c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f12264u = true;
            this.v = true;
            this.f12252i = bVar.f12252i;
            this.f12255l = bVar.f12255l;
            this.f12265w = bVar.f12265w;
            this.f12266x = bVar.f12266x;
            this.f12267y = bVar.f12267y;
            this.f12268z = bVar.f12268z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f12249c == i10) {
                if (bVar.f12253j) {
                    this.f12254k = bVar.f12254k != null ? new Rect(bVar.f12254k) : null;
                    this.f12253j = true;
                }
                if (bVar.f12256m) {
                    this.f12257n = bVar.f12257n;
                    this.f12258o = bVar.f12258o;
                    this.f12259p = bVar.f12259p;
                    this.f12260q = bVar.f12260q;
                    this.f12256m = true;
                }
            }
            if (bVar.f12261r) {
                this.f12262s = bVar.f12262s;
                this.f12261r = true;
            }
            if (bVar.f12263t) {
                this.f12263t = true;
            }
            Drawable[] drawableArr = bVar.f12251g;
            this.f12251g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f12250f;
            if (sparseArray != null) {
                this.f12250f = sparseArray.clone();
            } else {
                this.f12250f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12250f.put(i13, constantState);
                    } else {
                        this.f12251g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f12251g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f12251g.length];
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
        if (i10 >= this.f12251g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f12251g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f12251g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f12247a);
        this.f12251g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f12261r = false;
        this.f12263t = false;
        this.f12254k = null;
        this.f12253j = false;
        this.f12256m = false;
        this.f12264u = false;
        return i10;
    }

    public final void b() {
        this.f12256m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f12251g;
        this.f12258o = -1;
        this.f12257n = -1;
        this.f12260q = 0;
        this.f12259p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12257n) {
                this.f12257n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12258o) {
                this.f12258o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12259p) {
                this.f12259p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12260q) {
                this.f12260q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f12250f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f12250f.keyAt(i10);
                Drawable[] drawableArr = this.f12251g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f12250f.valueAt(i10)).newDrawable(this.f12248b);
                newDrawable.setLayoutDirection(this.f12266x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f12247a);
                drawableArr[keyAt] = mutate;
            }
            this.f12250f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f12251g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12250f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f12251g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12250f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f12250f.valueAt(indexOfKey)).newDrawable(this.f12248b);
        newDrawable.setLayoutDirection(this.f12266x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f12247a);
        this.f12251g[i10] = mutate;
        this.f12250f.removeAt(indexOfKey);
        if (this.f12250f.size() == 0) {
            this.f12250f = null;
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
