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
import f7.q8;
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
    public final f f10807a;
    public Resources f10808b;
    public int f10809c;
    public int d;
    public int f10810e;
    public SparseArray f10811f;
    public Drawable[] f10812g;
    public int h;
    public boolean f10813i;
    public boolean f10814j;
    public Rect f10815k;
    public boolean f10816l;
    public boolean f10817m;
    public int f10818n;
    public int f10819o;
    public int f10820p;
    public int f10821q;
    public boolean f10822r;
    public int f10823s;
    public boolean f10824t;
    public boolean f10825u;
    public boolean v;
    public boolean f10826w;
    public int f10827x;
    public int f10828y;
    public int f10829z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i9;
        this.f10813i = false;
        this.f10816l = false;
        this.f10826w = true;
        this.f10828y = 0;
        this.f10829z = 0;
        this.f10807a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10808b;
        } else {
            resources2 = null;
        }
        this.f10808b = resources2;
        if (bVar != null) {
            i9 = bVar.f10809c;
        } else {
            i9 = 0;
        }
        int i10 = f.f10836x;
        i9 = resources != null ? resources.getDisplayMetrics().densityDpi : i9;
        i9 = i9 == 0 ? 160 : i9;
        this.f10809c = i9;
        if (bVar != null) {
            this.d = bVar.d;
            this.f10810e = bVar.f10810e;
            this.f10825u = true;
            this.v = true;
            this.f10813i = bVar.f10813i;
            this.f10816l = bVar.f10816l;
            this.f10826w = bVar.f10826w;
            this.f10827x = bVar.f10827x;
            this.f10828y = bVar.f10828y;
            this.f10829z = bVar.f10829z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10809c == i9) {
                if (bVar.f10814j) {
                    this.f10815k = bVar.f10815k != null ? new Rect(bVar.f10815k) : null;
                    this.f10814j = true;
                }
                if (bVar.f10817m) {
                    this.f10818n = bVar.f10818n;
                    this.f10819o = bVar.f10819o;
                    this.f10820p = bVar.f10820p;
                    this.f10821q = bVar.f10821q;
                    this.f10817m = true;
                }
            }
            if (bVar.f10822r) {
                this.f10823s = bVar.f10823s;
                this.f10822r = true;
            }
            if (bVar.f10824t) {
                this.f10824t = true;
            }
            Drawable[] drawableArr = bVar.f10812g;
            this.f10812g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10811f;
            if (sparseArray != null) {
                this.f10811f = sparseArray.clone();
            } else {
                this.f10811f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10811f.put(i12, constantState);
                    } else {
                        this.f10812g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f10812g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10812g.length];
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
        int i9 = this.h;
        if (i9 >= this.f10812g.length) {
            int i10 = i9 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f10812g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i9);
            }
            this.f10812g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i9);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10807a);
        this.f10812g[i9] = drawable;
        this.h++;
        this.f10810e = drawable.getChangingConfigurations() | this.f10810e;
        this.f10822r = false;
        this.f10824t = false;
        this.f10815k = null;
        this.f10814j = false;
        this.f10817m = false;
        this.f10825u = false;
        return i9;
    }

    public final void b() {
        this.f10817m = true;
        c();
        int i9 = this.h;
        Drawable[] drawableArr = this.f10812g;
        this.f10819o = -1;
        this.f10818n = -1;
        this.f10821q = 0;
        this.f10820p = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10818n) {
                this.f10818n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10819o) {
                this.f10819o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10820p) {
                this.f10820p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10821q) {
                this.f10821q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10811f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i9 = 0; i9 < size; i9++) {
                int keyAt = this.f10811f.keyAt(i9);
                Drawable[] drawableArr = this.f10812g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10811f.valueAt(i9)).newDrawable(this.f10808b);
                if (Build.VERSION.SDK_INT >= 23) {
                    q8.b(this.f10827x, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10807a);
                drawableArr[keyAt] = mutate;
            }
            this.f10811f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i9 = this.h;
        Drawable[] drawableArr = this.f10812g;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10811f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i9) {
        int indexOfKey;
        Drawable drawable = this.f10812g[i9];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10811f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i9)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10811f.valueAt(indexOfKey)).newDrawable(this.f10808b);
        if (Build.VERSION.SDK_INT >= 23) {
            q8.b(this.f10827x, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10807a);
        this.f10812g[i9] = mutate;
        this.f10811f.removeAt(indexOfKey);
        if (this.f10811f.size() == 0) {
            this.f10811f = null;
        }
        return mutate;
    }

    public final int e(int i9) {
        Object obj;
        if (i9 < 0) {
            return 0;
        }
        l lVar = this.J;
        Integer num = 0;
        int a2 = b0.a.a(lVar.f31c, i9, lVar.f29a);
        if (a2 >= 0 && (obj = lVar.f30b[a2]) != i.f20b) {
            num = obj;
        }
        return num.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i9 = this.h;
        for (int i10 = 0; i10 < i9; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int getChangingConfigurations() {
        return this.d | this.f10810e;
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
