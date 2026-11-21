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
    public final e f15873a;
    public Resources f15874b;
    public int f15875c;
    public int d;
    public int f15876e;
    public SparseArray f15877f;
    public Drawable[] f15878g;
    public int h;
    public boolean f15879i;
    public boolean f15880j;
    public Rect f15881k;
    public boolean f15882l;
    public boolean f15883m;
    public int f15884n;
    public int f15885o;
    public int f15886p;
    public int f15887q;
    public boolean f15888r;
    public int f15889s;
    public boolean f15890t;
    public boolean f15891u;
    public boolean v;
    public boolean f15892w;
    public int f15893x;
    public int f15894y;
    public int f15895z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f15879i = false;
        this.f15882l = false;
        this.f15892w = true;
        this.f15894y = 0;
        this.f15895z = 0;
        this.f15873a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f15874b;
        } else {
            resources2 = null;
        }
        this.f15874b = resources2;
        if (bVar != null) {
            i7 = bVar.f15875c;
        } else {
            i7 = 0;
        }
        int i10 = e.K;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f15875c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.f15876e = bVar.f15876e;
            this.f15891u = true;
            this.v = true;
            this.f15879i = bVar.f15879i;
            this.f15882l = bVar.f15882l;
            this.f15892w = bVar.f15892w;
            this.f15893x = bVar.f15893x;
            this.f15894y = bVar.f15894y;
            this.f15895z = bVar.f15895z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f15875c == i7) {
                if (bVar.f15880j) {
                    this.f15881k = bVar.f15881k != null ? new Rect(bVar.f15881k) : null;
                    this.f15880j = true;
                }
                if (bVar.f15883m) {
                    this.f15884n = bVar.f15884n;
                    this.f15885o = bVar.f15885o;
                    this.f15886p = bVar.f15886p;
                    this.f15887q = bVar.f15887q;
                    this.f15883m = true;
                }
            }
            if (bVar.f15888r) {
                this.f15889s = bVar.f15889s;
                this.f15888r = true;
            }
            if (bVar.f15890t) {
                this.f15890t = true;
            }
            Drawable[] drawableArr = bVar.f15878g;
            this.f15878g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f15877f;
            if (sparseArray != null) {
                this.f15877f = sparseArray.clone();
            } else {
                this.f15877f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f15877f.put(i12, constantState);
                    } else {
                        this.f15878g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f15878g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f15878g.length];
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
        int i7 = this.h;
        if (i7 >= this.f15878g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f15878g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f15878g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f15873a);
        this.f15878g[i7] = drawable;
        this.h++;
        this.f15876e = drawable.getChangingConfigurations() | this.f15876e;
        this.f15888r = false;
        this.f15890t = false;
        this.f15881k = null;
        this.f15880j = false;
        this.f15883m = false;
        this.f15891u = false;
        return i7;
    }

    public final void b() {
        this.f15883m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f15878g;
        this.f15885o = -1;
        this.f15884n = -1;
        this.f15887q = 0;
        this.f15886p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f15884n) {
                this.f15884n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f15885o) {
                this.f15885o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f15886p) {
                this.f15886p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f15887q) {
                this.f15887q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f15877f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f15877f.keyAt(i7);
                Drawable[] drawableArr = this.f15878g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f15877f.valueAt(i7)).newDrawable(this.f15874b);
                newDrawable.setLayoutDirection(this.f15893x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f15873a);
                drawableArr[keyAt] = mutate;
            }
            this.f15877f = null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f15878g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15877f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f15878g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f15877f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f15877f.valueAt(indexOfKey)).newDrawable(this.f15874b);
        newDrawable.setLayoutDirection(this.f15893x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f15873a);
        this.f15878g[i7] = mutate;
        this.f15877f.removeAt(indexOfKey);
        if (this.f15877f.size() == 0) {
            this.f15877f = null;
        }
        return mutate;
    }

    public final int e(int i7) {
        Object obj;
        if (i7 < 0) {
            return 0;
        }
        m mVar = this.J;
        Integer num = 0;
        int a10 = b0.a.a(mVar.f34c, i7, mVar.f32a);
        if (a10 >= 0 && (obj = mVar.f33b[a10]) != i.f21b) {
            num = obj;
        }
        return num.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i7 = this.h;
        for (int i10 = 0; i10 < i7; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int getChangingConfigurations() {
        return this.d | this.f15876e;
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
