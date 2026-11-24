package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class kea extends ks0 {
    public final nha H;

    public kea(nha nhaVar, Context context, d dVar, long j) {
        super(context, dVar, j);
        this.H = nhaVar;
    }

    @Override
    public final boolean c(k47 k47Var) {
        char c;
        nha nhaVar = this.H;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        if (k47.B0(k47Var.k) == nhaVar.m1) {
            c = 0;
        } else {
            c = 1;
        }
        if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(k47 k47Var) {
        char c;
        int i;
        int i2;
        nha nhaVar = this.H;
        ArrayList arrayList = nhaVar.Q0;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        if (k47Var != null) {
            if (k47.B0(k47Var.k) == nhaVar.m1) {
                c = 0;
            } else {
                c = 1;
            }
            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c].put(k47Var.e1(), k47Var);
                    if (!k47Var.s(null, false)) {
                        nhaVar.d1++;
                    }
                    if (!nhaVar.F1) {
                        gm.t1(nhaVar.y1.getParentActivity().getCurrentFocus());
                        r7 r7Var = nhaVar.o0;
                        int i3 = 8;
                        if (nhaVar.d1 == 0) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        r7Var.setVisibility(i);
                        r7 r7Var2 = nhaVar.x0;
                        if (r7Var2 != null) {
                            if (nhaVar.getClosestTab() != 8 && nhaVar.getClosestTab() != 13) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            r7Var2.setVisibility(i2);
                        }
                        r7 r7Var3 = nhaVar.y0;
                        if (r7Var3 != null) {
                            r7Var3.setVisibility(8);
                        }
                        r7 r7Var4 = nhaVar.z0;
                        if (r7Var4 != null) {
                            r7Var4.setVisibility(8);
                        }
                        r7 r7Var5 = nhaVar.w0;
                        if (r7Var5 != null) {
                            if (nhaVar.getClosestTab() != 8 && nhaVar.getClosestTab() != 13) {
                                i3 = 0;
                            }
                            r7Var5.setVisibility(i3);
                        }
                        nhaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            View view = (View) arrayList.get(i4);
                            gm.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        nhaVar.e1 = false;
                        nhaVar.l1(true);
                    } else {
                        nhaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(k47 k47Var) {
        char c;
        int i;
        int i2;
        nha nhaVar = this.H;
        ArrayList arrayList = nhaVar.Q0;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        if (k47Var != null) {
            if (k47.B0(k47Var.k) == nhaVar.m1) {
                c = 0;
            } else {
                c = 1;
            }
            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                sparseArrayArr[c].remove(k47Var.e1());
                if (!k47Var.s(null, false)) {
                    nhaVar.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    gm.t1(nhaVar.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    r7 r7Var = nhaVar.o0;
                    int i3 = 8;
                    if (nhaVar.d1 == 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    r7Var.setVisibility(i);
                    r7 r7Var2 = nhaVar.x0;
                    if (r7Var2 != null) {
                        if (nhaVar.getClosestTab() != 8 && nhaVar.getClosestTab() != 13) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        r7Var2.setVisibility(i2);
                    }
                    r7 r7Var3 = nhaVar.y0;
                    if (r7Var3 != null) {
                        r7Var3.setVisibility(8);
                    }
                    r7 r7Var4 = nhaVar.z0;
                    if (r7Var4 != null) {
                        r7Var4.setVisibility(8);
                    }
                    r7 r7Var5 = nhaVar.w0;
                    if (r7Var5 != null) {
                        if (nhaVar.getClosestTab() != 8 && nhaVar.getClosestTab() != 13) {
                            i3 = 0;
                        }
                        r7Var5.setVisibility(i3);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        View view = (View) arrayList.get(i4);
                        gm.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    nhaVar.e1 = false;
                    gm.d3(new c0a(this, (byte) 12), 20L);
                } else {
                    nhaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
