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
    public final e f12277a;
    public Resources f12278b;
    public int f12279c;
    public int d;
    public int e;
    public SparseArray f12280f;
    public Drawable[] f12281g;
    public int h;
    public boolean f12282i;
    public boolean f12283j;
    public Rect f12284k;
    public boolean f12285l;
    public boolean f12286m;
    public int f12287n;
    public int f12288o;
    public int f12289p;
    public int f12290q;
    public boolean f12291r;
    public int f12292s;
    public boolean f12293t;
    public boolean f12294u;
    public boolean v;
    public boolean f12295w;
    public int f12296x;
    public int f12297y;
    public int f12298z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f12282i = false;
        this.f12285l = false;
        this.f12295w = true;
        this.f12297y = 0;
        this.f12298z = 0;
        this.f12277a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f12278b;
        } else {
            resources2 = null;
        }
        this.f12278b = resources2;
        if (bVar != null) {
            i10 = bVar.f12279c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f12279c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f12294u = true;
            this.v = true;
            this.f12282i = bVar.f12282i;
            this.f12285l = bVar.f12285l;
            this.f12295w = bVar.f12295w;
            this.f12296x = bVar.f12296x;
            this.f12297y = bVar.f12297y;
            this.f12298z = bVar.f12298z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f12279c == i10) {
                if (bVar.f12283j) {
                    this.f12284k = bVar.f12284k != null ? new Rect(bVar.f12284k) : null;
                    this.f12283j = true;
                }
                if (bVar.f12286m) {
                    this.f12287n = bVar.f12287n;
                    this.f12288o = bVar.f12288o;
                    this.f12289p = bVar.f12289p;
                    this.f12290q = bVar.f12290q;
                    this.f12286m = true;
                }
            }
            if (bVar.f12291r) {
                this.f12292s = bVar.f12292s;
                this.f12291r = true;
            }
            if (bVar.f12293t) {
                this.f12293t = true;
            }
            Drawable[] drawableArr = bVar.f12281g;
            this.f12281g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f12280f;
            if (sparseArray != null) {
                this.f12280f = sparseArray.clone();
            } else {
                this.f12280f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12280f.put(i13, constantState);
                    } else {
                        this.f12281g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f12281g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f12281g.length];
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
        if (i10 >= this.f12281g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f12281g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f12281g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f12277a);
        this.f12281g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f12291r = false;
        this.f12293t = false;
        this.f12284k = null;
        this.f12283j = false;
        this.f12286m = false;
        this.f12294u = false;
        return i10;
    }

    public final void b() {
        this.f12286m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f12281g;
        this.f12288o = -1;
        this.f12287n = -1;
        this.f12290q = 0;
        this.f12289p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12287n) {
                this.f12287n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12288o) {
                this.f12288o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12289p) {
                this.f12289p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12290q) {
                this.f12290q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f12280f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f12280f.keyAt(i10);
                Drawable[] drawableArr = this.f12281g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f12280f.valueAt(i10)).newDrawable(this.f12278b);
                newDrawable.setLayoutDirection(this.f12296x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f12277a);
                drawableArr[keyAt] = mutate;
            }
            this.f12280f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f12281g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12280f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f12281g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12280f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f12280f.valueAt(indexOfKey)).newDrawable(this.f12278b);
        newDrawable.setLayoutDirection(this.f12296x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f12277a);
        this.f12281g[i10] = mutate;
        this.f12280f.removeAt(indexOfKey);
        if (this.f12280f.size() == 0) {
            this.f12280f = null;
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
