package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class bga extends kr0 {
    public final eja H;

    public bga(eja ejaVar, Context context, e eVar, long j) {
        super(context, eVar, j);
        this.H = ejaVar;
    }

    @Override
    public final boolean c(r47 r47Var) {
        char c;
        eja ejaVar = this.H;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        if (r47.B0(r47Var.k) == ejaVar.m1) {
            c = 0;
        } else {
            c = 1;
        }
        if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(r47 r47Var) {
        char c;
        int i;
        int i2;
        eja ejaVar = this.H;
        ArrayList arrayList = ejaVar.Q0;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        if (r47Var != null) {
            if (r47.B0(r47Var.k) == ejaVar.m1) {
                c = 0;
            } else {
                c = 1;
            }
            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c].put(r47Var.e1(), r47Var);
                    if (!r47Var.s(null, false)) {
                        ejaVar.d1++;
                    }
                    if (!ejaVar.F1) {
                        hl.t1(ejaVar.y1.getParentActivity().getCurrentFocus());
                        s7 s7Var = ejaVar.o0;
                        int i3 = 8;
                        if (ejaVar.d1 == 0) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        s7Var.setVisibility(i);
                        s7 s7Var2 = ejaVar.x0;
                        if (s7Var2 != null) {
                            if (ejaVar.getClosestTab() != 8 && ejaVar.getClosestTab() != 13) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            s7Var2.setVisibility(i2);
                        }
                        s7 s7Var3 = ejaVar.y0;
                        if (s7Var3 != null) {
                            s7Var3.setVisibility(8);
                        }
                        s7 s7Var4 = ejaVar.z0;
                        if (s7Var4 != null) {
                            s7Var4.setVisibility(8);
                        }
                        s7 s7Var5 = ejaVar.w0;
                        if (s7Var5 != null) {
                            if (ejaVar.getClosestTab() != 8 && ejaVar.getClosestTab() != 13) {
                                i3 = 0;
                            }
                            s7Var5.setVisibility(i3);
                        }
                        ejaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            View view = (View) arrayList.get(i4);
                            hl.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        ejaVar.e1 = false;
                        ejaVar.l1(true);
                    } else {
                        ejaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(r47 r47Var) {
        char c;
        int i;
        int i2;
        eja ejaVar = this.H;
        ArrayList arrayList = ejaVar.Q0;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        if (r47Var != null) {
            if (r47.B0(r47Var.k) == ejaVar.m1) {
                c = 0;
            } else {
                c = 1;
            }
            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                sparseArrayArr[c].remove(r47Var.e1());
                if (!r47Var.s(null, false)) {
                    ejaVar.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    hl.t1(ejaVar.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    s7 s7Var = ejaVar.o0;
                    int i3 = 8;
                    if (ejaVar.d1 == 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    s7Var.setVisibility(i);
                    s7 s7Var2 = ejaVar.x0;
                    if (s7Var2 != null) {
                        if (ejaVar.getClosestTab() != 8 && ejaVar.getClosestTab() != 13) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        s7Var2.setVisibility(i2);
                    }
                    s7 s7Var3 = ejaVar.y0;
                    if (s7Var3 != null) {
                        s7Var3.setVisibility(8);
                    }
                    s7 s7Var4 = ejaVar.z0;
                    if (s7Var4 != null) {
                        s7Var4.setVisibility(8);
                    }
                    s7 s7Var5 = ejaVar.w0;
                    if (s7Var5 != null) {
                        if (ejaVar.getClosestTab() != 8 && ejaVar.getClosestTab() != 13) {
                            i3 = 0;
                        }
                        s7Var5.setVisibility(i3);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        View view = (View) arrayList.get(i4);
                        hl.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    ejaVar.e1 = false;
                    hl.d3(new ux9(this, (byte) 21), 20L);
                } else {
                    ejaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.H.C1;
    }
}
