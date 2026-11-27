package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public abstract class iic extends e {
    public final SparseArray a;
    public d26 b;
    public hic c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public iic() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Y() {
        float f;
        boolean z;
        float f2;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            int keyAt = sparseArray.keyAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    float p = this.c.p(keyAt);
                    boolean z2 = this.f;
                    if (z2) {
                        f = this.e;
                    } else {
                        f = 0.0f;
                    }
                    boolean z3 = this.h;
                    if (gicVar.g <= 0.0f && p > 0.0f && z2) {
                        ((ej6) eVar).F();
                    }
                    gicVar.g = p;
                    float f3 = gicVar.f;
                    float f4 = f * p;
                    gicVar.f = f4;
                    boolean z4 = true;
                    if (f4 > f3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!gicVar.d && p > 0.0f && z2 && eVar.fragmentView != null) {
                        eVar.onResume();
                        gicVar.d = true;
                    }
                    if (!gicVar.e && ((f3 == 0.0f || f3 == 1.0f) && f3 != f4 && Math.abs(f3 - f4) != 1.0f)) {
                        eVar.onTransitionAnimationStart(z, false);
                        gicVar.e = true;
                    }
                    if (gicVar.e && f3 != f4) {
                        if (z) {
                            f2 = f4;
                        } else {
                            f2 = 1.0f - f4;
                        }
                        eVar.onTransitionAnimationProgress(z, f2);
                    }
                    if (gicVar.e && (f4 == 0.0f || f4 == 1.0f)) {
                        eVar.onTransitionAnimationEnd(z, false);
                        gicVar.e = false;
                    }
                    boolean z5 = gicVar.c;
                    if (!z5 && f4 >= 1.0f) {
                        eVar.onBecomeFullyVisible();
                        gicVar.c = true;
                    } else {
                        z4 = z5;
                    }
                    if (z4 && ((f4 == 0.0f && !z3) || p == 0.0f)) {
                        eVar.onBecomeFullyHidden();
                        gicVar.c = false;
                    }
                    if (gicVar.d && ((f4 == 0.0f && !z2) || p == 0.0f)) {
                        eVar.onPause();
                        gicVar.d = false;
                    }
                }
            }
        }
    }

    public abstract e Z(int i);

    public final void a0(int i) {
        SparseArray sparseArray = this.a;
        gic gicVar = (gic) sparseArray.get(i);
        if (gicVar != null) {
            e eVar = gicVar.a;
            if (gicVar.c) {
                eVar.onBecomeFullyHidden();
            }
            if (gicVar.d) {
                eVar.onPause();
            }
            eVar.onFragmentDestroy();
            eVar.setParentLayout(null);
        }
        sparseArray.remove(i);
    }

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    eVar.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final e b0() {
        hic hicVar = this.c;
        if (hicVar == null) {
            return null;
        }
        gic gicVar = (gic) this.a.get(hicVar.getCurrentPosition());
        if (gicVar == null) {
            return null;
        }
        return gicVar.a;
    }

    @Override
    public final void clearViews() {
        hic hicVar = this.c;
        if (hicVar != null) {
            this.d = hicVar.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (gicVar.d) {
                    eVar.onPause();
                    gicVar.d = false;
                }
                eVar.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public final a createActionBar(Context context) {
        return null;
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new d26((byte) 2, context, (fj6) this);
        hic hicVar = new hic(this, context);
        this.c = hicVar;
        int i = this.d;
        if (i == -1) {
            i = 0;
            this.d = 0;
        }
        hicVar.setPosition(i);
        this.c.setAdapter(new bn0((byte) 10, context, this));
        this.b.addView(this.c, tre.c(-1.0f, -1));
        d26 d26Var = this.b;
        this.fragmentView = d26Var;
        ftb ftbVar = new ftb(this, (byte) 13);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(d26Var, ftbVar);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    arrayList.addAll(eVar.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        e b0 = b0();
        if (b0 != null && b0.fragmentView != null) {
            return b0.isLightStatusBar();
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        jla jlaVar;
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
                return false;
            }
        } else {
            e b0 = b0();
            if (b0 != null) {
                jlaVar = b0.getSimpleActionBar();
            } else {
                jlaVar = null;
            }
            if (jlaVar != null && (jlaVar.a0 != null || (!jlaVar.M && jlaVar.L))) {
                if (z) {
                    jlaVar.E();
                    return false;
                }
            } else if (b0 == null || b0.onBackPressed(z)) {
                return super.onBackPressed(z);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Y();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Y();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            boolean z = gicVar.b;
            e eVar = gicVar.a;
            if (z) {
                eVar.onFragmentDestroy();
                eVar.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f = false;
        Y();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        e b0 = b0();
        if (b0 != null) {
            b0.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Y();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    try {
                        eVar.onThemeColorsChanged();
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        if (!z) {
            f = 1.0f - f;
        }
        this.e = f;
        Y();
    }

    @Override
    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        super.setTitleOverlayText(str, i, runnable);
        this.n = str;
        this.r = i;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            gic gicVar = (gic) sparseArray.valueAt(i2);
            if (gicVar != null) {
                gicVar.a.setTitleOverlayText(str, i, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        setTitleOverlayText(str, i, runnable);
    }
}
