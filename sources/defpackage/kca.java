package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class kca extends kr0 {
    public final nfa H;

    public kca(nfa nfaVar, Context context, d dVar, long j) {
        super(context, dVar, j);
        this.H = nfaVar;
    }

    @Override
    public final boolean c(k27 k27Var) {
        char c;
        nfa nfaVar = this.H;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        if (k27.B0(k27Var.k) == nfaVar.m1) {
            c = 0;
        } else {
            c = 1;
        }
        if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(k27 k27Var) {
        char c;
        int i;
        int i2;
        nfa nfaVar = this.H;
        ArrayList arrayList = nfaVar.Q0;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        if (k27Var != null) {
            if (k27.B0(k27Var.k) == nfaVar.m1) {
                c = 0;
            } else {
                c = 1;
            }
            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c].put(k27Var.e1(), k27Var);
                    if (!k27Var.s(null, false)) {
                        nfaVar.d1++;
                    }
                    if (!nfaVar.F1) {
                        gl.t1(nfaVar.y1.getParentActivity().getCurrentFocus());
                        r7 r7Var = nfaVar.o0;
                        int i3 = 8;
                        if (nfaVar.d1 == 0) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        r7Var.setVisibility(i);
                        r7 r7Var2 = nfaVar.x0;
                        if (r7Var2 != null) {
                            if (nfaVar.getClosestTab() != 8 && nfaVar.getClosestTab() != 13) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            r7Var2.setVisibility(i2);
                        }
                        r7 r7Var3 = nfaVar.y0;
                        if (r7Var3 != null) {
                            r7Var3.setVisibility(8);
                        }
                        r7 r7Var4 = nfaVar.z0;
                        if (r7Var4 != null) {
                            r7Var4.setVisibility(8);
                        }
                        r7 r7Var5 = nfaVar.w0;
                        if (r7Var5 != null) {
                            if (nfaVar.getClosestTab() != 8 && nfaVar.getClosestTab() != 13) {
                                i3 = 0;
                            }
                            r7Var5.setVisibility(i3);
                        }
                        nfaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            View view = (View) arrayList.get(i4);
                            gl.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        nfaVar.e1 = false;
                        nfaVar.l1(true);
                    } else {
                        nfaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(k27 k27Var) {
        char c;
        int i;
        int i2;
        nfa nfaVar = this.H;
        ArrayList arrayList = nfaVar.Q0;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        if (k27Var != null) {
            if (k27.B0(k27Var.k) == nfaVar.m1) {
                c = 0;
            } else {
                c = 1;
            }
            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                sparseArrayArr[c].remove(k27Var.e1());
                if (!k27Var.s(null, false)) {
                    nfaVar.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    gl.t1(nfaVar.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    r7 r7Var = nfaVar.o0;
                    int i3 = 8;
                    if (nfaVar.d1 == 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    r7Var.setVisibility(i);
                    r7 r7Var2 = nfaVar.x0;
                    if (r7Var2 != null) {
                        if (nfaVar.getClosestTab() != 8 && nfaVar.getClosestTab() != 13) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        r7Var2.setVisibility(i2);
                    }
                    r7 r7Var3 = nfaVar.y0;
                    if (r7Var3 != null) {
                        r7Var3.setVisibility(8);
                    }
                    r7 r7Var4 = nfaVar.z0;
                    if (r7Var4 != null) {
                        r7Var4.setVisibility(8);
                    }
                    r7 r7Var5 = nfaVar.w0;
                    if (r7Var5 != null) {
                        if (nfaVar.getClosestTab() != 8 && nfaVar.getClosestTab() != 13) {
                            i3 = 0;
                        }
                        r7Var5.setVisibility(i3);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        View view = (View) arrayList.get(i4);
                        gl.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    nfaVar.e1 = false;
                    gl.d3(new z6a(this, (byte) 4), 20L);
                } else {
                    nfaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
