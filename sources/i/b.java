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
    public final e f13411a;
    public Resources f13412b;
    public int f13413c;
    public int d;
    public int e;
    public SparseArray f13414f;
    public Drawable[] f13415g;
    public int h;
    public boolean f13416i;
    public boolean f13417j;
    public Rect f13418k;
    public boolean f13419l;
    public boolean f13420m;
    public int f13421n;
    public int f13422o;
    public int f13423p;
    public int f13424q;
    public boolean f13425r;
    public int f13426s;
    public boolean f13427t;
    public boolean f13428u;
    public boolean v;
    public boolean f13429w;
    public int f13430x;
    public int f13431y;
    public int f13432z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f13416i = false;
        this.f13419l = false;
        this.f13429w = true;
        this.f13431y = 0;
        this.f13432z = 0;
        this.f13411a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f13412b;
        } else {
            resources2 = null;
        }
        this.f13412b = resources2;
        if (bVar != null) {
            i10 = bVar.f13413c;
        } else {
            i10 = 0;
        }
        int i11 = e.J;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f13413c = i10;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.f13428u = true;
            this.v = true;
            this.f13416i = bVar.f13416i;
            this.f13419l = bVar.f13419l;
            this.f13429w = bVar.f13429w;
            this.f13430x = bVar.f13430x;
            this.f13431y = bVar.f13431y;
            this.f13432z = bVar.f13432z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f13413c == i10) {
                if (bVar.f13417j) {
                    this.f13418k = bVar.f13418k != null ? new Rect(bVar.f13418k) : null;
                    this.f13417j = true;
                }
                if (bVar.f13420m) {
                    this.f13421n = bVar.f13421n;
                    this.f13422o = bVar.f13422o;
                    this.f13423p = bVar.f13423p;
                    this.f13424q = bVar.f13424q;
                    this.f13420m = true;
                }
            }
            if (bVar.f13425r) {
                this.f13426s = bVar.f13426s;
                this.f13425r = true;
            }
            if (bVar.f13427t) {
                this.f13427t = true;
            }
            Drawable[] drawableArr = bVar.f13415g;
            this.f13415g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f13414f;
            if (sparseArray != null) {
                this.f13414f = sparseArray.clone();
            } else {
                this.f13414f = new SparseArray(this.h);
            }
            int i12 = this.h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f13414f.put(i13, constantState);
                    } else {
                        this.f13415g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f13415g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f13415g.length];
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
        if (i10 >= this.f13415g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f13415g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f13415g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f13411a);
        this.f13415g[i10] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f13425r = false;
        this.f13427t = false;
        this.f13418k = null;
        this.f13417j = false;
        this.f13420m = false;
        this.f13428u = false;
        return i10;
    }

    public final void b() {
        this.f13420m = true;
        c();
        int i10 = this.h;
        Drawable[] drawableArr = this.f13415g;
        this.f13422o = -1;
        this.f13421n = -1;
        this.f13424q = 0;
        this.f13423p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f13421n) {
                this.f13421n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f13422o) {
                this.f13422o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f13423p) {
                this.f13423p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f13424q) {
                this.f13424q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f13414f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f13414f.keyAt(i10);
                Drawable[] drawableArr = this.f13415g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f13414f.valueAt(i10)).newDrawable(this.f13412b);
                newDrawable.setLayoutDirection(this.f13430x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f13411a);
                drawableArr[keyAt] = mutate;
            }
            this.f13414f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i10 = this.h;
        Drawable[] drawableArr = this.f13415g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13414f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f13415g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f13414f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f13414f.valueAt(indexOfKey)).newDrawable(this.f13412b);
        newDrawable.setLayoutDirection(this.f13430x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f13411a);
        this.f13415g[i10] = mutate;
        this.f13414f.removeAt(indexOfKey);
        if (this.f13414f.size() == 0) {
            this.f13414f = null;
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
