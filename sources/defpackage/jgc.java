package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public abstract class jgc extends d {
    public final SparseArray a;
    public ne6 b;
    public igc c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public jgc() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Z() {
        float f;
        boolean z;
        float f2;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hgc hgcVar = (hgc) sparseArray.valueAt(i);
            int keyAt = sparseArray.keyAt(i);
            if (hgcVar != null) {
                d dVar = hgcVar.a;
                if (dVar.fragmentView != null) {
                    float p = this.c.p(keyAt);
                    boolean z2 = this.f;
                    if (z2) {
                        f = this.e;
                    } else {
                        f = 0.0f;
                    }
                    boolean z3 = this.h;
                    if (hgcVar.g <= 0.0f && p > 0.0f && z2) {
                        ((aj6) dVar).F();
                    }
                    hgcVar.g = p;
                    float f3 = hgcVar.f;
                    float f4 = f * p;
                    hgcVar.f = f4;
                    boolean z4 = true;
                    if (f4 > f3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!hgcVar.d && p > 0.0f && z2 && dVar.fragmentView != null) {
                        dVar.onResume();
                        hgcVar.d = true;
                    }
                    if (!hgcVar.e && ((f3 == 0.0f || f3 == 1.0f) && f3 != f4 && Math.abs(f3 - f4) != 1.0f)) {
                        dVar.onTransitionAnimationStart(z, false);
                        hgcVar.e = true;
                    }
                    if (hgcVar.e && f3 != f4) {
                        if (z) {
                            f2 = f4;
                        } else {
                            f2 = 1.0f - f4;
                        }
                        dVar.onTransitionAnimationProgress(z, f2);
                    }
                    if (hgcVar.e && (f4 == 0.0f || f4 == 1.0f)) {
                        dVar.onTransitionAnimationEnd(z, false);
                        hgcVar.e = false;
                    }
                    boolean z5 = hgcVar.c;
                    if (!z5 && f4 >= 1.0f) {
                        dVar.onBecomeFullyVisible();
                        hgcVar.c = true;
                    } else {
                        z4 = z5;
                    }
                    if (z4 && ((f4 == 0.0f && !z3) || p == 0.0f)) {
                        dVar.onBecomeFullyHidden();
                        hgcVar.c = false;
                    }
                    if (hgcVar.d && ((f4 == 0.0f && !z2) || p == 0.0f)) {
                        dVar.onPause();
                        hgcVar.d = false;
                    }
                }
            }
        }
    }

    public abstract d a0(int i);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hgc hgcVar = (hgc) sparseArray.valueAt(i);
            if (hgcVar != null) {
                d dVar = hgcVar.a;
                if (dVar.fragmentView != null) {
                    dVar.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final d b0() {
        igc igcVar = this.c;
        if (igcVar == null) {
            return null;
        }
        hgc hgcVar = (hgc) this.a.get(igcVar.getCurrentPosition());
        if (hgcVar == null) {
            return null;
        }
        return hgcVar.a;
    }

    @Override
    public final void clearViews() {
        igc igcVar = this.c;
        if (igcVar != null) {
            this.d = igcVar.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hgc hgcVar = (hgc) sparseArray.valueAt(i);
            if (hgcVar != null) {
                d dVar = hgcVar.a;
                if (hgcVar.d) {
                    dVar.onPause();
                    hgcVar.d = false;
                }
                dVar.clearViews();
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
        this.b = new ne6((byte) 1, context, (bj6) this);
        igc igcVar = new igc(this, context);
        this.c = igcVar;
        int i = this.d;
        if (i == -1) {
            i = 0;
            this.d = 0;
        }
        igcVar.setPosition(i);
        this.c.setAdapter(new bo0((byte) 9, context, this));
        this.b.addView(this.c, qoe.c(-1.0f, -1));
        ne6 ne6Var = this.b;
        this.fragmentView = ne6Var;
        lcc lccVar = new lcc(this, (byte) 3);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ne6Var, lccVar);
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
            hgc hgcVar = (hgc) sparseArray.valueAt(i);
            if (hgcVar != null) {
                d dVar = hgcVar.a;
                if (dVar.fragmentView != null) {
                    arrayList.addAll(dVar.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        d b0 = b0();
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
        rja rjaVar;
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
                return false;
            }
        } else {
            d b0 = b0();
            if (b0 != null) {
                rjaVar = b0.getSimpleActionBar();
            } else {
                rjaVar = null;
            }
            if (rjaVar != null && (rjaVar.R != null || (!rjaVar.H && rjaVar.G))) {
                if (z) {
                    rjaVar.B();
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
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hgc hgcVar = (hgc) sparseArray.valueAt(i);
            boolean z = hgcVar.b;
            d dVar = hgcVar.a;
            if (z) {
                dVar.onFragmentDestroy();
                dVar.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        d b0 = b0();
        if (b0 != null) {
            b0.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hgc hgcVar = (hgc) sparseArray.valueAt(i);
            if (hgcVar != null) {
                d dVar = hgcVar.a;
                if (dVar.fragmentView != null) {
                    try {
                        dVar.onThemeColorsChanged();
                    } catch (Exception e) {
                        fc4.g(e, true);
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
        Z();
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
            hgc hgcVar = (hgc) sparseArray.valueAt(i2);
            if (hgcVar != null) {
                hgcVar.a.setTitleOverlayText(str, i, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        setTitleOverlayText(str, i, runnable);
    }
}
