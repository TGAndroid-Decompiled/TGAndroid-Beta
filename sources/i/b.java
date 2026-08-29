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
import h7.l8;
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
    public final f f8145a;
    public Resources f8146b;
    public int f8147c;
    public int d;
    public int f8148e;
    public SparseArray f8149f;
    public Drawable[] f8150g;
    public int h;
    public boolean f8151i;
    public boolean f8152j;
    public Rect f8153k;
    public boolean f8154l;
    public boolean f8155m;
    public int f8156n;
    public int f8157o;
    public int f8158p;
    public int f8159q;
    public boolean f8160r;
    public int f8161s;
    public boolean f8162t;
    public boolean f8163u;
    public boolean v;
    public boolean f8164w;
    public int f8165x;
    public int f8166y;
    public int f8167z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f8151i = false;
        this.f8154l = false;
        this.f8164w = true;
        this.f8166y = 0;
        this.f8167z = 0;
        this.f8145a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f8146b;
        } else {
            resources2 = null;
        }
        this.f8146b = resources2;
        if (bVar != null) {
            i10 = bVar.f8147c;
        } else {
            i10 = 0;
        }
        int i11 = f.f8174x;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f8147c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.f8148e = bVar.f8148e;
            this.f8163u = true;
            this.v = true;
            this.f8151i = bVar.f8151i;
            this.f8154l = bVar.f8154l;
            this.f8164w = bVar.f8164w;
            this.f8165x = bVar.f8165x;
            this.f8166y = bVar.f8166y;
            this.f8167z = bVar.f8167z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f8147c == i10) {
                if (bVar.f8152j) {
                    this.f8153k = bVar.f8153k != null ? new Rect(bVar.f8153k) : null;
                    this.f8152j = true;
                }
                if (bVar.f8155m) {
                    this.f8156n = bVar.f8156n;
                    this.f8157o = bVar.f8157o;
                    this.f8158p = bVar.f8158p;
                    this.f8159q = bVar.f8159q;
                    this.f8155m = true;
                }
            }
            if (bVar.f8160r) {
                this.f8161s = bVar.f8161s;
                this.f8160r = true;
            }
            if (bVar.f8162t) {
                this.f8162t = true;
            }
            Drawable[] drawableArr = bVar.f8150g;
            this.f8150g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f8149f;
            if (sparseArray != null) {
                this.f8149f = sparseArray.clone();
            } else {
                this.f8149f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f8149f.put(i13, constantState);
                    } else {
                        this.f8150g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f8150g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f8150g.length];
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
        if (i10 >= this.f8150g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f8150g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f8150g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f8145a);
        this.f8150g[i10] = drawable;
        this.h++;
        this.f8148e = drawable.getChangingConfigurations() | this.f8148e;
        this.f8160r = false;
        this.f8162t = false;
        this.f8153k = null;
        this.f8152j = false;
        this.f8155m = false;
        this.f8163u = false;
        return i10;
    }

    public final void b() {
        this.f8155m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f8150g;
        this.f8157o = -1;
        this.f8156n = -1;
        this.f8159q = 0;
        this.f8158p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f8156n) {
                this.f8156n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f8157o) {
                this.f8157o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f8158p) {
                this.f8158p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f8159q) {
                this.f8159q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f8149f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f8149f.keyAt(i10);
                Drawable[] drawableArr = this.f8150g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f8149f.valueAt(i10)).newDrawable(this.f8146b);
                if (Build.VERSION.SDK_INT >= 23) {
                    l8.b(this.f8165x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f8145a);
                drawableArr[keyAt] = mutate;
            }
            this.f8149f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f8150g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f8149f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f8150g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f8149f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f8149f.valueAt(indexOfKey)).newDrawable(this.f8146b);
        if (Build.VERSION.SDK_INT >= 23) {
            l8.b(this.f8165x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f8145a);
        this.f8150g[i10] = mutate;
        this.f8149f.removeAt(indexOfKey);
        if (this.f8149f.size() == 0) {
            this.f8149f = null;
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
        int a2 = b0.a.a(lVar.f31c, i10, lVar.f29a);
        if (a2 >= 0 && (obj = lVar.f30b[a2]) != i.f20b) {
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
        return this.d | this.f8148e;
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
