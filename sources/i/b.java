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
    public final e f10850a;
    public Resources f10851b;
    public int f10852c;
    public int d;
    public int e;
    public SparseArray f10853f;
    public Drawable[] f10854g;
    public int h;
    public boolean f10855i;
    public boolean f10856j;
    public Rect f10857k;
    public boolean f10858l;
    public boolean f10859m;
    public int f10860n;
    public int f10861o;
    public int f10862p;
    public int f10863q;
    public boolean f10864r;
    public int f10865s;
    public boolean f10866t;
    public boolean f10867u;
    public boolean v;
    public boolean f10868w;
    public int f10869x;
    public int f10870y;
    public int f10871z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f10855i = false;
        this.f10858l = false;
        this.f10868w = true;
        this.f10870y = 0;
        this.f10871z = 0;
        this.f10850a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f10851b;
        } else {
            resources2 = null;
        }
        this.f10851b = resources2;
        if (bVar != null) {
            i10 = bVar.f10852c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f10852c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f10867u = true;
            this.v = true;
            this.f10855i = bVar.f10855i;
            this.f10858l = bVar.f10858l;
            this.f10868w = bVar.f10868w;
            this.f10869x = bVar.f10869x;
            this.f10870y = bVar.f10870y;
            this.f10871z = bVar.f10871z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f10852c == i10) {
                if (bVar.f10856j) {
                    this.f10857k = bVar.f10857k != null ? new Rect(bVar.f10857k) : null;
                    this.f10856j = true;
                }
                if (bVar.f10859m) {
                    this.f10860n = bVar.f10860n;
                    this.f10861o = bVar.f10861o;
                    this.f10862p = bVar.f10862p;
                    this.f10863q = bVar.f10863q;
                    this.f10859m = true;
                }
            }
            if (bVar.f10864r) {
                this.f10865s = bVar.f10865s;
                this.f10864r = true;
            }
            if (bVar.f10866t) {
                this.f10866t = true;
            }
            Drawable[] drawableArr = bVar.f10854g;
            this.f10854g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f10853f;
            if (sparseArray != null) {
                this.f10853f = sparseArray.clone();
            } else {
                this.f10853f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10853f.put(i13, constantState);
                    } else {
                        this.f10854g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f10854g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f10854g.length];
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
        if (i10 >= this.f10854g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10854g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10854g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10850a);
        this.f10854g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f10864r = false;
        this.f10866t = false;
        this.f10857k = null;
        this.f10856j = false;
        this.f10859m = false;
        this.f10867u = false;
        return i10;
    }

    public final void b() {
        this.f10859m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f10854g;
        this.f10861o = -1;
        this.f10860n = -1;
        this.f10863q = 0;
        this.f10862p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f10860n) {
                this.f10860n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10861o) {
                this.f10861o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10862p) {
                this.f10862p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10863q) {
                this.f10863q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f10853f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f10853f.keyAt(i10);
                Drawable[] drawableArr = this.f10854g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f10853f.valueAt(i10)).newDrawable(this.f10851b);
                newDrawable.setLayoutDirection(this.f10869x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10850a);
                drawableArr[keyAt] = mutate;
            }
            this.f10853f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f10854g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10853f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f10854g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f10853f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f10853f.valueAt(indexOfKey)).newDrawable(this.f10851b);
        newDrawable.setLayoutDirection(this.f10869x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10850a);
        this.f10854g[i10] = mutate;
        this.f10853f.removeAt(indexOfKey);
        if (this.f10853f.size() == 0) {
            this.f10853f = null;
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
