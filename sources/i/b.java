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
    public final e f10854a;
    public Resources f10855b;
    public int f10856c;
    public int d;
    public int e;
    public SparseArray f10857f;
    public Drawable[] f10858g;
    public int h;
    public boolean f10859i;
    public boolean f10860j;
    public Rect f10861k;
    public boolean f10862l;
    public boolean f10863m;
    public int f10864n;
    public int f10865o;
    public int f10866p;
    public int f10867q;
    public boolean f10868r;
    public int f10869s;
    public boolean f10870t;
    public boolean f10871u;
    public boolean v;
    public boolean f10872w;
    public int f10873x;
    public int f10874y;
    public int f10875z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10859i = false;
        this.f10862l = false;
        this.f10872w = true;
        this.f10874y = 0;
        this.f10875z = 0;
        this.f10854a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10855b;
        } else {
            resources2 = null;
        }
        this.f10855b = resources2;
        if (bVar != null) {
            i10 = bVar.f10856c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10856c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10871u = true;
            this.v = true;
            this.f10859i = bVar.f10859i;
            this.f10862l = bVar.f10862l;
            this.f10872w = bVar.f10872w;
            this.f10873x = bVar.f10873x;
            this.f10874y = bVar.f10874y;
            this.f10875z = bVar.f10875z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10856c == i10) {
                if (bVar.f10860j) {
                    this.f10861k = bVar.f10861k != null ? new Rect(bVar.f10861k) : null;
                    this.f10860j = true;
                }
                if (bVar.f10863m) {
                    this.f10864n = bVar.f10864n;
                    this.f10865o = bVar.f10865o;
                    this.f10866p = bVar.f10866p;
                    this.f10867q = bVar.f10867q;
                    this.f10863m = true;
                }
            }
            if (bVar.f10868r) {
                this.f10869s = bVar.f10869s;
                this.f10868r = true;
            }
            if (bVar.f10870t) {
                this.f10870t = true;
            }
            Drawable[] drawableArr = bVar.f10858g;
            this.f10858g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10857f;
            if (sparseArray != null) {
                this.f10857f = sparseArray.clone();
            } else {
                this.f10857f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10857f.put(i13, constantState);
                    } else {
                        this.f10858g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10858g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10858g.length];
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
        if (i10 >= this.f10858g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10858g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10858g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10854a);
        this.f10858g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10868r = false;
        this.f10870t = false;
        this.f10861k = null;
        this.f10860j = false;
        this.f10863m = false;
        this.f10871u = false;
        return i10;
    }

    public final void b() {
        this.f10863m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10858g;
        this.f10865o = -1;
        this.f10864n = -1;
        this.f10867q = 0;
        this.f10866p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10864n) {
                this.f10864n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10865o) {
                this.f10865o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10866p) {
                this.f10866p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10867q) {
                this.f10867q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10857f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10857f.keyAt(i10);
                Drawable[] drawableArr = this.f10858g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10857f.valueAt(i10)).newDrawable(this.f10855b);
                newDrawable.setLayoutDirection(this.f10873x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10854a);
                drawableArr[keyAt] = mutate;
            }
            this.f10857f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10858g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10857f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10858g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10857f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10857f.valueAt(indexOfKey)).newDrawable(this.f10855b);
        newDrawable.setLayoutDirection(this.f10873x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10854a);
        this.f10858g[i10] = mutate;
        this.f10857f.removeAt(indexOfKey);
        if (this.f10857f.size() == 0) {
            this.f10857f = null;
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
