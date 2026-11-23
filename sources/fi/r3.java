package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c8.ma;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.uq;
public final class r3 extends k.a {
    public boolean f12525c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final f9 f12526e;
    public final boolean f12527f;
    public final boolean h;
    public final boolean f12528n;
    public final Context f12529r;
    public final w3 f12530s;
    public final boolean[] f12531w;
    public final z3 f12532x;

    public r3(z3 z3Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.h6 h6Var2, f9 f9Var, boolean z10, boolean z11, boolean z12, Context context2, w3 w3Var, boolean[] zArr) {
        super(context, h6Var, true);
        this.f12532x = z3Var;
        this.d = h6Var2;
        this.f12526e = f9Var;
        this.f12527f = z10;
        this.h = z11;
        this.f12528n = z12;
        this.f12529r = context2;
        this.f12530s = w3Var;
        this.f12531w = zArr;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r41) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r3.l(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void m() {
        if (!this.f12525c && !this.f12531w[0]) {
            org.telegram.messenger.g0.g3(new l3(this, 0));
        }
        z3 z3Var = this.f12532x;
        z3Var.f12860d1 = null;
        z3Var.f12857c1 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        x3 x3Var;
        boolean z11 = this.f12527f;
        z3 z3Var = this.f12532x;
        if (z11 && ((x3Var = z3Var.f12937y1) == null || x3Var.f12766b == null)) {
            Context context = z3Var.getContext();
            kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 20);
            h6.m mVar = new h6.m(25, false);
            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[5];
            mVar.d = y0VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            mVar.f13968b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232059, hd.N0(2131753753, null), false, null);
            c10.setOnClickListener(new uq(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View t2Var = new bi.t2(context, 13);
            t2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            t2Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(t2Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t2Var.getLayoutParams();
            if (hd.f24444a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.g0.L(8.0f);
            t2Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null);
            mVar.f13969c = u0Var;
            u0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            u0Var.setDrawShadow(false);
            u0Var.setBackgroundColor(-14540254);
            u0Var.setTextColor(-1);
            u0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(u0Var, ma.o(-1, 44));
            View t2Var2 = new bi.t2(context, 14);
            t2Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            t2Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(t2Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) t2Var2.getLayoutParams();
            if (hd.f24444a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
            t2Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232371, hd.N0(2131745020, null), false, null);
            c11.d(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            y0VarArr[0] = c11;
            org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232375, hd.N0(2131745023, null), false, null);
            c12.d(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            y0VarArr[1] = c12;
            org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, hd.N0(2131745024, null), false, null);
            c13.d(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            y0VarArr[2] = c13;
            org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232372, hd.N0(2131745027, null), false, null);
            c14.d(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            y0VarArr[3] = c14;
            org.telegram.ui.ActionBar.y0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232376, hd.N0(2131745021, null), false, null);
            c15.d(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            y0VarArr[4] = c15;
            z3Var.f12892m3 = mVar;
            mVar.K(true, f9.B1);
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, z3Var.getContext(), this.d, false, false);
            z3Var.f12895n3 = y0Var;
            y0Var.j(hd.N0(2131745028, null), 2131232370, null);
            z3.Y(z3Var, true);
            z3Var.f12895n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            z3Var.f12895n3.setRightIcon(2131232061);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z3Var.f12895n3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) z3Var.f12895n3.getLayoutParams();
            if (hd.f24444a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
            z3Var.f12895n3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) z3Var.f12892m3.f13968b);
            org.telegram.ui.ActionBar.y0 y0Var2 = z3Var.f12895n3;
            y0Var2.Q = new m3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            y0Var2.setOnClickListener(new h3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f28768c = true;
            if (z10) {
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, z3Var.getContext(), this.d);
                d1Var.setTag(2131296439, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ma.o(-1, 8));
                return;
            }
            return;
        }
        z3Var.f12892m3 = null;
        z3Var.f12895n3 = null;
    }

    public final void u(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat O0;
        z3 z3Var = this.f12532x;
        if (z3Var.n1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (O0 = np.u1(z3Var.f12891m2).O0(Long.valueOf(-z3Var.l1))) != null) {
            TLRPC.ChatFull P0 = np.u1(z3Var.f12891m2).P0(O0.f28434id);
            if (P0 == null) {
                P0 = ur.a0(z3Var.f12891m2).F0(O0.f28434id, true, new CountDownLatch(1), false, false, 0);
            }
            if (P0 != null && P0.can_view_stats) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232380, hd.N0(2131743297, null), false, this.d).setOnClickListener(new bi.p6(this, storyItem, this.f12526e, O0, 1));
            }
        }
    }
}
