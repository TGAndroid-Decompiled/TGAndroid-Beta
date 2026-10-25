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
    public final e f13412a;
    public Resources f13413b;
    public int f13414c;
    public int d;
    public int e;
    public SparseArray f13415f;
    public Drawable[] f13416g;
    public int h;
    public boolean f13417i;
    public boolean f13418j;
    public Rect f13419k;
    public boolean f13420l;
    public boolean f13421m;
    public int f13422n;
    public int f13423o;
    public int f13424p;
    public int f13425q;
    public boolean f13426r;
    public int f13427s;
    public boolean f13428t;
    public boolean f13429u;
    public boolean v;
    public boolean f13430w;
    public int f13431x;
    public int f13432y;
    public int f13433z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f13417i = false;
        this.f13420l = false;
        this.f13430w = true;
        this.f13432y = 0;
        this.f13433z = 0;
        this.f13412a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f13413b;
        } else {
            resources2 = null;
        }
        this.f13413b = resources2;
        if (bVar != null) {
            i10 = bVar.f13414c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f13414c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f13429u = true;
            this.v = true;
            this.f13417i = bVar.f13417i;
            this.f13420l = bVar.f13420l;
            this.f13430w = bVar.f13430w;
            this.f13431x = bVar.f13431x;
            this.f13432y = bVar.f13432y;
            this.f13433z = bVar.f13433z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f13414c == i10) {
                if (bVar.f13418j) {
                    this.f13419k = bVar.f13419k != null ? new Rect(bVar.f13419k) : null;
                    this.f13418j = true;
                }
                if (bVar.f13421m) {
                    this.f13422n = bVar.f13422n;
                    this.f13423o = bVar.f13423o;
                    this.f13424p = bVar.f13424p;
                    this.f13425q = bVar.f13425q;
                    this.f13421m = true;
                }
            }
            if (bVar.f13426r) {
                this.f13427s = bVar.f13427s;
                this.f13426r = true;
            }
            if (bVar.f13428t) {
                this.f13428t = true;
            }
            Drawable[] drawableArr = bVar.f13416g;
            this.f13416g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f13415f;
            if (sparseArray != null) {
                this.f13415f = sparseArray.clone();
            } else {
                this.f13415f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f13415f.put(i13, constantState);
                    } else {
                        this.f13416g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f13416g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f13416g.length];
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
        if (i10 >= this.f13416g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f13416g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f13416g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f13412a);
        this.f13416g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f13426r = false;
        this.f13428t = false;
        this.f13419k = null;
        this.f13418j = false;
        this.f13421m = false;
        this.f13429u = false;
        return i10;
    }

    public final void b() {
        this.f13421m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f13416g;
        this.f13423o = -1;
        this.f13422n = -1;
        this.f13425q = 0;
        this.f13424p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f13422n) {
                this.f13422n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f13423o) {
                this.f13423o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f13424p) {
                this.f13424p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f13425q) {
                this.f13425q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f13415f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f13415f.keyAt(i10);
                Drawable[] drawableArr = this.f13416g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f13415f.valueAt(i10)).newDrawable(this.f13413b);
                newDrawable.setLayoutDirection(this.f13431x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f13412a);
                drawableArr[keyAt] = mutate;
            }
            this.f13415f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f13416g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13415f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f13416g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f13415f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f13415f.valueAt(indexOfKey)).newDrawable(this.f13413b);
        newDrawable.setLayoutDirection(this.f13431x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f13412a);
        this.f13416g[i10] = mutate;
        this.f13415f.removeAt(indexOfKey);
        if (this.f13415f.size() == 0) {
            this.f13415f = null;
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
