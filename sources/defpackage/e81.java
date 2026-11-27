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
import org.telegram.ui.ActionBar.e;
public final class e81 extends GestureDetector.SimpleOnGestureListener {
    public final Context a;
    public final g81 b;

    public e81(g81 g81Var, Context context) {
        this.b = g81Var;
        this.a = context;
    }

    public final h81 a(float f, float f2) {
        h81 h81Var;
        g81 g81Var = this.b;
        if (g81Var.n != null) {
            int i = g81Var.e;
            float measuredWidth = g81Var.getMeasuredWidth() / 7.0f;
            float L = hl.L(52.0f);
            int L2 = hl.L(44.0f) / 2;
            int i2 = 0;
            for (int i3 = 0; i3 < g81Var.d; i3++) {
                float f3 = (measuredWidth / 2.0f) + (i * measuredWidth);
                float L3 = (L / 2.0f) + (i2 * L) + hl.L(44.0f);
                float f4 = L2;
                if (f >= f3 - f4 && f <= f3 + f4 && f2 >= L3 - f4 && f2 <= L3 + f4 && (h81Var = (h81) g81Var.n.get(i3, null)) != null) {
                    return h81Var;
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
        final h81 a;
        super.onLongPress(motionEvent);
        g81 g81Var = this.b;
        j81 j81Var = g81Var.y;
        if (j81Var.f0 == 0 && !hl.O1() && (a = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                g81Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j = j81Var.y;
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putInt("start_from_date", a.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            zu1 zu1Var = new zu1(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232580, 0, j81Var.getResourceProvider(), j81Var.getParentActivity());
            yob.h(aob.G8, j81Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
            b8 b8Var = new b8(j81Var.getParentActivity(), true, false);
            b8Var.j(ob6.M0(2131748819, null), 2131232229, null);
            b8Var.setMinimumWidth(160);
            b8Var.setOnClickListener(new View.OnClickListener(this) {
                public final e81 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    wk5 wk5Var;
                    wk5 wk5Var2;
                    wk5 wk5Var3;
                    wk5 wk5Var4;
                    byte b = r3;
                    h81 h81Var = a;
                    e81 e81Var = this.b;
                    switch (b) {
                        case 0:
                            j81 j81Var2 = e81Var.b.y;
                            wk5Var = ((e) j81Var2).parentLayout;
                            if (wk5Var != null) {
                                wk5Var2 = ((e) j81Var2).parentLayout;
                                if (wk5Var2.getFragmentStack().size() >= 3) {
                                    wk5Var3 = ((e) j81Var2).parentLayout;
                                    List fragmentStack = wk5Var3.getFragmentStack();
                                    wk5Var4 = ((e) j81Var2).parentLayout;
                                    e eVar = (e) fragmentStack.get(wk5Var4.getFragmentStack().size() - 3);
                                    if (eVar instanceof zu1) {
                                        hl.d3(new tu0(e81Var, (zu1) eVar, h81Var, (byte) 12), 300L);
                                    }
                                }
                            }
                            j81Var2.finishPreviewFragment();
                            return;
                        default:
                            j81 j81Var3 = e81Var.b.y;
                            int i = h81Var.h;
                            j81Var3.R = i;
                            j81Var3.Q = i;
                            j81Var3.H = true;
                            j81Var3.B0();
                            j81Var3.r0();
                            j81Var3.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
            if (j81Var.e0) {
                b8 b8Var2 = new b8(j81Var.getParentActivity(), false, false);
                b8Var2.j(ob6.M0(2131745378, null), 2131232362, null);
                b8Var2.setMinimumWidth(160);
                b8Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final e81 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        wk5 wk5Var;
                        wk5 wk5Var2;
                        wk5 wk5Var3;
                        wk5 wk5Var4;
                        byte b = r3;
                        h81 h81Var = a;
                        e81 e81Var = this.b;
                        switch (b) {
                            case 0:
                                j81 j81Var2 = e81Var.b.y;
                                wk5Var = ((e) j81Var2).parentLayout;
                                if (wk5Var != null) {
                                    wk5Var2 = ((e) j81Var2).parentLayout;
                                    if (wk5Var2.getFragmentStack().size() >= 3) {
                                        wk5Var3 = ((e) j81Var2).parentLayout;
                                        List fragmentStack = wk5Var3.getFragmentStack();
                                        wk5Var4 = ((e) j81Var2).parentLayout;
                                        e eVar = (e) fragmentStack.get(wk5Var4.getFragmentStack().size() - 3);
                                        if (eVar instanceof zu1) {
                                            hl.d3(new tu0(e81Var, (zu1) eVar, h81Var, (byte) 12), 300L);
                                        }
                                    }
                                }
                                j81Var2.finishPreviewFragment();
                                return;
                            default:
                                j81 j81Var3 = e81Var.b.y;
                                int i = h81Var.h;
                                j81Var3.R = i;
                                j81Var3.Q = i;
                                j81Var3.H = true;
                                j81Var3.B0();
                                j81Var3.r0();
                                j81Var3.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var2);
                b8 b8Var3 = new b8(j81Var.getParentActivity(), false, true);
                b8Var3.j(ob6.M0(2131752054, null), 2131232113, null);
                b8Var3.setMinimumWidth(160);
                b8Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final e81 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        wk5 wk5Var;
                        wk5 wk5Var2;
                        wk5 wk5Var3;
                        byte b = r2;
                        e81 e81Var = this.b;
                        switch (b) {
                            case 0:
                                j81 j81Var2 = e81Var.b.y;
                                wk5Var = ((e) j81Var2).parentLayout;
                                if (wk5Var.getFragmentStack().size() >= 3) {
                                    wk5Var2 = ((e) j81Var2).parentLayout;
                                    List fragmentStack = wk5Var2.getFragmentStack();
                                    wk5Var3 = ((e) j81Var2).parentLayout;
                                    e eVar = (e) fragmentStack.get(wk5Var3.getFragmentStack().size() - 3);
                                    if (eVar instanceof zu1) {
                                        jj.q(j81Var2, 1, j81Var2.getMessagesController().X1(Long.valueOf(j81Var2.y)), null, false, new lh2(e81Var, (zu1) eVar, false, (byte) 13), null);
                                    }
                                }
                                j81Var2.finishPreviewFragment();
                                return;
                            default:
                                e81Var.b.y.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            j81Var.w = new tb((byte) 4, this.a, this);
            j81Var.w.setOnClickListener(new View.OnClickListener(this) {
                public final e81 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    wk5 wk5Var;
                    wk5 wk5Var2;
                    wk5 wk5Var3;
                    byte b = r2;
                    e81 e81Var = this.b;
                    switch (b) {
                        case 0:
                            j81 j81Var2 = e81Var.b.y;
                            wk5Var = ((e) j81Var2).parentLayout;
                            if (wk5Var.getFragmentStack().size() >= 3) {
                                wk5Var2 = ((e) j81Var2).parentLayout;
                                List fragmentStack = wk5Var2.getFragmentStack();
                                wk5Var3 = ((e) j81Var2).parentLayout;
                                e eVar = (e) fragmentStack.get(wk5Var3.getFragmentStack().size() - 3);
                                if (eVar instanceof zu1) {
                                    jj.q(j81Var2, 1, j81Var2.getMessagesController().X1(Long.valueOf(j81Var2.y)), null, false, new lh2(e81Var, (zu1) eVar, false, (byte) 13), null);
                                }
                            }
                            j81Var2.finishPreviewFragment();
                            return;
                        default:
                            e81Var.b.y.finishPreviewFragment();
                            return;
                    }
                }
            });
            j81Var.w.setVisibility(8);
            j81Var.w.setFitsSystemWindows(true);
            j81.o0(j81Var).getOverlayContainerView().addView(j81Var.w, tre.c(-1.0f, -1));
            j81Var.x0();
            j81Var.presentFragmentAsPreviewWithMenu(zu1Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h81 a;
        r47 r47Var;
        k09 k09Var;
        g81 g81Var = this.b;
        j81 j81Var = g81Var.y;
        if (j81.j0(j81Var) != null) {
            if (((j81Var.f0 == 1 && g81Var.n != null) || j81Var.g0 != null) && (a = a(motionEvent.getX(), motionEvent.getY())) != null && (r47Var = a.a) != null && (k09Var = j81Var.N) != null) {
                if (j81Var.g0 != null) {
                    lcb orCreateStoryViewer = j81Var.getOrCreateStoryViewer();
                    Context context = g81Var.getContext();
                    r47 r47Var2 = a.a;
                    TL_stories.StoryItem storyItem = r47Var2.l;
                    int e1 = r47Var2.e1();
                    u5b u5bVar = j81Var.g0;
                    z8d z8dVar = j81Var.h0;
                    orCreateStoryViewer.h = yac.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(u5bVar.d));
                    orCreateStoryViewer.P0 = e1;
                    orCreateStoryViewer.K(context, storyItem, arrayList, 0, u5bVar, null, z8dVar, true);
                } else {
                    int e12 = r47Var.e1();
                    int i = a.c;
                    eja ejaVar = (eja) k09Var.b;
                    tia[] tiaVarArr = ejaVar.w1;
                    int i2 = -1;
                    for (int i3 = 0; i3 < tiaVarArr[0].a.size(); i3++) {
                        if (((r47) tiaVarArr[0].a.get(i3)).e1() == e12) {
                            i2 = i3;
                        }
                    }
                    zha P = ejaVar.P(0);
                    if (i2 >= 0 && P != null) {
                        P.x.g1(i2, 0);
                    } else {
                        ejaVar.v0(0, e12, i, true);
                    }
                    if (P != null) {
                        P.J = e12;
                        P.K = false;
                    }
                    j81Var.finishFragment();
                }
            }
            if (g81Var.n != null) {
                if (j81Var.H) {
                    h81 a2 = a(motionEvent.getX(), motionEvent.getY());
                    if (a2 != null) {
                        ValueAnimator valueAnimator = j81Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j81Var.S = null;
                        }
                        int i4 = j81Var.Q;
                        if (i4 == 0 && j81Var.R == 0) {
                            int i5 = a2.h;
                            j81Var.R = i5;
                            j81Var.Q = i5;
                        } else {
                            int i6 = a2.h;
                            int i7 = j81Var.R;
                            if (i4 == i6) {
                                if (i7 == i6) {
                                    j81Var.R = 0;
                                    j81Var.Q = 0;
                                } else {
                                    j81Var.Q = i7;
                                }
                            } else if (i7 == i6) {
                                j81Var.R = i4;
                            } else if (i4 == i7) {
                                if (i6 > i7) {
                                    j81Var.R = i6;
                                } else {
                                    j81Var.Q = i6;
                                }
                            } else {
                                j81Var.R = i6;
                                j81Var.Q = i6;
                            }
                        }
                        j81Var.B0();
                        j81Var.r0();
                        return false;
                    }
                } else {
                    h81 a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != null && j81.k0(j81Var) != null && j81.l0(j81Var).getFragmentStack().size() >= 2) {
                        e eVar = (e) j81.n0(j81Var).getFragmentStack().get(j81.m0(j81Var).getFragmentStack().size() - 2);
                        if (eVar instanceof zu1) {
                            j81Var.finishFragment();
                            ((zu1) eVar).m8(a3.h);
                            return false;
                        }
                    } else if (a3 != null && j81Var.O != null) {
                        j81Var.finishFragment();
                        j81Var.O.m8(a3.h);
                    }
                }
            }
        }
        return false;
    }
}
