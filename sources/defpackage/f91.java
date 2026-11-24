package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class f91 extends GestureDetector.SimpleOnGestureListener {
    public final Context a;
    public final h91 b;

    public f91(h91 h91Var, Context context) {
        this.b = h91Var;
        this.a = context;
    }

    public final i91 a(float f, float f2) {
        i91 i91Var;
        h91 h91Var = this.b;
        if (h91Var.n != null) {
            int i = h91Var.e;
            float measuredWidth = h91Var.getMeasuredWidth() / 7.0f;
            float L = gm.L(52.0f);
            int L2 = gm.L(44.0f) / 2;
            int i2 = 0;
            for (int i3 = 0; i3 < h91Var.d; i3++) {
                float f3 = (measuredWidth / 2.0f) + (i * measuredWidth);
                float L3 = (L / 2.0f) + (i2 * L) + gm.L(44.0f);
                float f4 = L2;
                if (f >= f3 - f4 && f <= f3 + f4 && f2 >= L3 - f4 && f2 <= L3 + f4 && (i91Var = (i91) h91Var.n.get(i3, null)) != null) {
                    return i91Var;
                }
                i++;
                if (i >= 7) {
                    i2++;
                    i = 0;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        final i91 a;
        super.onLongPress(motionEvent);
        h91 h91Var = this.b;
        k91 k91Var = h91Var.y;
        if (k91Var.f0 == 0 && !gm.O1() && (a = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                h91Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j = k91Var.y;
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putInt("start_from_date", a.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            yv1 yv1Var = new yv1(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232581, 0, k91Var.getResourceProvider(), k91Var.getParentActivity());
            anb.h(cmb.F8, k91Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
            a8 a8Var = new a8(k91Var.getParentActivity(), true, false);
            a8Var.j(jb6.M0(2131748822, null), 2131232230, null);
            a8Var.setMinimumWidth(160);
            a8Var.setOnClickListener(new View.OnClickListener(this) {
                public final f91 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    tk5 tk5Var;
                    tk5 tk5Var2;
                    tk5 tk5Var3;
                    tk5 tk5Var4;
                    byte b = r3;
                    i91 i91Var = a;
                    f91 f91Var = this.b;
                    switch (b) {
                        case 0:
                            k91 k91Var2 = f91Var.b.y;
                            tk5Var = ((d) k91Var2).parentLayout;
                            if (tk5Var != null) {
                                tk5Var2 = ((d) k91Var2).parentLayout;
                                if (tk5Var2.getFragmentStack().size() >= 3) {
                                    tk5Var3 = ((d) k91Var2).parentLayout;
                                    List fragmentStack = tk5Var3.getFragmentStack();
                                    tk5Var4 = ((d) k91Var2).parentLayout;
                                    d dVar = (d) fragmentStack.get(tk5Var4.getFragmentStack().size() - 3);
                                    if (dVar instanceof yv1) {
                                        gm.d3(new tv0(f91Var, (yv1) dVar, i91Var, (byte) 12), 300L);
                                    }
                                }
                            }
                            k91Var2.finishPreviewFragment();
                            return;
                        default:
                            k91 k91Var3 = f91Var.b.y;
                            int i = i91Var.h;
                            k91Var3.R = i;
                            k91Var3.Q = i;
                            k91Var3.H = true;
                            k91Var3.B0();
                            k91Var3.s0();
                            k91Var3.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
            if (k91Var.e0) {
                a8 a8Var2 = new a8(k91Var.getParentActivity(), false, false);
                a8Var2.j(jb6.M0(2131745384, null), 2131232363, null);
                a8Var2.setMinimumWidth(160);
                a8Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final f91 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        tk5 tk5Var;
                        tk5 tk5Var2;
                        tk5 tk5Var3;
                        tk5 tk5Var4;
                        byte b = r3;
                        i91 i91Var = a;
                        f91 f91Var = this.b;
                        switch (b) {
                            case 0:
                                k91 k91Var2 = f91Var.b.y;
                                tk5Var = ((d) k91Var2).parentLayout;
                                if (tk5Var != null) {
                                    tk5Var2 = ((d) k91Var2).parentLayout;
                                    if (tk5Var2.getFragmentStack().size() >= 3) {
                                        tk5Var3 = ((d) k91Var2).parentLayout;
                                        List fragmentStack = tk5Var3.getFragmentStack();
                                        tk5Var4 = ((d) k91Var2).parentLayout;
                                        d dVar = (d) fragmentStack.get(tk5Var4.getFragmentStack().size() - 3);
                                        if (dVar instanceof yv1) {
                                            gm.d3(new tv0(f91Var, (yv1) dVar, i91Var, (byte) 12), 300L);
                                        }
                                    }
                                }
                                k91Var2.finishPreviewFragment();
                                return;
                            default:
                                k91 k91Var3 = f91Var.b.y;
                                int i = i91Var.h;
                                k91Var3.R = i;
                                k91Var3.Q = i;
                                k91Var3.H = true;
                                k91Var3.B0();
                                k91Var3.s0();
                                k91Var3.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
                a8 a8Var3 = new a8(k91Var.getParentActivity(), false, true);
                a8Var3.j(jb6.M0(2131752026, null), 2131232114, null);
                a8Var3.setMinimumWidth(160);
                a8Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final f91 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        tk5 tk5Var;
                        tk5 tk5Var2;
                        tk5 tk5Var3;
                        byte b = r2;
                        f91 f91Var = this.b;
                        switch (b) {
                            case 0:
                                k91 k91Var2 = f91Var.b.y;
                                tk5Var = ((d) k91Var2).parentLayout;
                                if (tk5Var.getFragmentStack().size() >= 3) {
                                    tk5Var2 = ((d) k91Var2).parentLayout;
                                    List fragmentStack = tk5Var2.getFragmentStack();
                                    tk5Var3 = ((d) k91Var2).parentLayout;
                                    d dVar = (d) fragmentStack.get(tk5Var3.getFragmentStack().size() - 3);
                                    if (dVar instanceof yv1) {
                                        ik.q(k91Var2, 1, k91Var2.getMessagesController().W1(Long.valueOf(k91Var2.y)), null, false, new lx6(f91Var, (yv1) dVar, false, (byte) 12), null);
                                    }
                                }
                                k91Var2.finishPreviewFragment();
                                return;
                            default:
                                f91Var.b.y.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            k91Var.w = new sb((byte) 4, this.a, this);
            k91Var.w.setOnClickListener(new View.OnClickListener(this) {
                public final f91 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    tk5 tk5Var;
                    tk5 tk5Var2;
                    tk5 tk5Var3;
                    byte b = r2;
                    f91 f91Var = this.b;
                    switch (b) {
                        case 0:
                            k91 k91Var2 = f91Var.b.y;
                            tk5Var = ((d) k91Var2).parentLayout;
                            if (tk5Var.getFragmentStack().size() >= 3) {
                                tk5Var2 = ((d) k91Var2).parentLayout;
                                List fragmentStack = tk5Var2.getFragmentStack();
                                tk5Var3 = ((d) k91Var2).parentLayout;
                                d dVar = (d) fragmentStack.get(tk5Var3.getFragmentStack().size() - 3);
                                if (dVar instanceof yv1) {
                                    ik.q(k91Var2, 1, k91Var2.getMessagesController().W1(Long.valueOf(k91Var2.y)), null, false, new lx6(f91Var, (yv1) dVar, false, (byte) 12), null);
                                }
                            }
                            k91Var2.finishPreviewFragment();
                            return;
                        default:
                            f91Var.b.y.finishPreviewFragment();
                            return;
                    }
                }
            });
            k91Var.w.setVisibility(8);
            k91Var.w.setFitsSystemWindows(true);
            k91.f0(k91Var).getOverlayContainerView().addView(k91Var.w, qoe.c(-1.0f, -1));
            k91Var.x0();
            k91Var.presentFragmentAsPreviewWithMenu(yv1Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i91 a;
        k47 k47Var;
        oo8 oo8Var;
        h91 h91Var = this.b;
        k91 k91Var = h91Var.y;
        if (k91.a0(k91Var) != null) {
            if (((k91Var.f0 == 1 && h91Var.n != null) || k91Var.g0 != null) && (a = a(motionEvent.getX(), motionEvent.getY())) != null && (k47Var = a.a) != null && (oo8Var = k91Var.N) != null) {
                if (k91Var.g0 != null) {
                    oab orCreateStoryViewer = k91Var.getOrCreateStoryViewer();
                    Context context = h91Var.getContext();
                    k47 k47Var2 = a.a;
                    TL_stories.StoryItem storyItem = k47Var2.l;
                    int e1 = k47Var2.e1();
                    z3b z3bVar = k91Var.g0;
                    k6d k6dVar = k91Var.h0;
                    orCreateStoryViewer.h = z8c.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(z3bVar.d));
                    orCreateStoryViewer.P0 = e1;
                    orCreateStoryViewer.K(context, storyItem, arrayList, 0, z3bVar, null, k6dVar, true);
                } else {
                    int e12 = k47Var.e1();
                    int i = a.c;
                    nha nhaVar = (nha) oo8Var.b;
                    cha[] chaVarArr = nhaVar.w1;
                    int i2 = -1;
                    for (int i3 = 0; i3 < chaVarArr[0].a.size(); i3++) {
                        if (((k47) chaVarArr[0].a.get(i3)).e1() == e12) {
                            i2 = i3;
                        }
                    }
                    iga P = nhaVar.P(0);
                    if (i2 >= 0 && P != null) {
                        P.x.g1(i2, 0);
                    } else {
                        nhaVar.v0(0, e12, i, true);
                    }
                    if (P != null) {
                        P.J = e12;
                        P.K = false;
                    }
                    k91Var.finishFragment();
                }
            }
            if (h91Var.n != null) {
                if (k91Var.H) {
                    i91 a2 = a(motionEvent.getX(), motionEvent.getY());
                    if (a2 != null) {
                        ValueAnimator valueAnimator = k91Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            k91Var.S = null;
                        }
                        int i4 = k91Var.Q;
                        if (i4 == 0 && k91Var.R == 0) {
                            int i5 = a2.h;
                            k91Var.R = i5;
                            k91Var.Q = i5;
                        } else {
                            int i6 = a2.h;
                            int i7 = k91Var.R;
                            if (i4 == i6) {
                                if (i7 == i6) {
                                    k91Var.R = 0;
                                    k91Var.Q = 0;
                                } else {
                                    k91Var.Q = i7;
                                }
                            } else if (i7 == i6) {
                                k91Var.R = i4;
                            } else if (i4 == i7) {
                                if (i6 > i7) {
                                    k91Var.R = i6;
                                } else {
                                    k91Var.Q = i6;
                                }
                            } else {
                                k91Var.R = i6;
                                k91Var.Q = i6;
                            }
                        }
                        k91Var.B0();
                        k91Var.s0();
                        return false;
                    }
                } else {
                    i91 a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != null && k91.b0(k91Var) != null && k91.c0(k91Var).getFragmentStack().size() >= 2) {
                        d dVar = (d) k91.e0(k91Var).getFragmentStack().get(k91.d0(k91Var).getFragmentStack().size() - 2);
                        if (dVar instanceof yv1) {
                            k91Var.finishFragment();
                            ((yv1) dVar).l8(a3.h);
                            return false;
                        }
                    } else if (a3 != null && k91Var.O != null) {
                        k91Var.finishFragment();
                        k91Var.O.l8(a3.h);
                    }
                }
            }
        }
        return false;
    }
}
