package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c8.ma;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.uq;
public final class r3 extends k.a {
    public boolean f12522c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final f9 f12523e;
    public final boolean f12524f;
    public final boolean h;
    public final boolean f12525n;
    public final Context f12526r;
    public final w3 f12527s;
    public final boolean[] f12528w;
    public final z3 f12529x;

    public r3(z3 z3Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.h6 h6Var2, f9 f9Var, boolean z10, boolean z11, boolean z12, Context context2, w3 w3Var, boolean[] zArr) {
        super(context, h6Var, true);
        this.f12529x = z3Var;
        this.d = h6Var2;
        this.f12523e = f9Var;
        this.f12524f = z10;
        this.h = z11;
        this.f12525n = z12;
        this.f12526r = context2;
        this.f12527s = w3Var;
        this.f12528w = zArr;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r41) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r3.l(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void m() {
        if (!this.f12522c && !this.f12528w[0]) {
            org.telegram.messenger.g0.g3(new l3(this, 0));
        }
        z3 z3Var = this.f12529x;
        z3Var.f12857d1 = null;
        z3Var.f12854c1 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        x3 x3Var;
        boolean z11 = this.f12524f;
        z3 z3Var = this.f12529x;
        if (z11 && ((x3Var = z3Var.f12934y1) == null || x3Var.f12763b == null)) {
            Context context = z3Var.getContext();
            kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 20);
            h6.m mVar = new h6.m(25, false);
            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[5];
            mVar.d = y0VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            mVar.f13965b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232059, gd.N0(2131753753, null), false, null);
            c10.setOnClickListener(new uq(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View t2Var = new bi.t2(context, 13);
            t2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            t2Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(t2Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t2Var.getLayoutParams();
            if (gd.f24241a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.g0.L(8.0f);
            t2Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null);
            mVar.f13966c = u0Var;
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
            if (gd.f24241a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
            t2Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232371, gd.N0(2131745022, null), false, null);
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
            org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232375, gd.N0(2131745025, null), false, null);
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
            org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, gd.N0(2131745026, null), false, null);
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
            org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232372, gd.N0(2131745029, null), false, null);
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
            org.telegram.ui.ActionBar.y0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232376, gd.N0(2131745023, null), false, null);
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
            z3Var.f12889m3 = mVar;
            mVar.K(true, f9.B1);
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, z3Var.getContext(), this.d, false, false);
            z3Var.f12892n3 = y0Var;
            y0Var.j(gd.N0(2131745030, null), 2131232370, null);
            z3.Y(z3Var, true);
            z3Var.f12892n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            z3Var.f12892n3.setRightIcon(2131232061);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z3Var.f12892n3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) z3Var.f12892n3.getLayoutParams();
            if (gd.f24241a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
            z3Var.f12892n3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) z3Var.f12889m3.f13965b);
            org.telegram.ui.ActionBar.y0 y0Var2 = z3Var.f12892n3;
            y0Var2.Q = new m3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            y0Var2.setOnClickListener(new h3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f28765c = true;
            if (z10) {
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, z3Var.getContext(), this.d);
                d1Var.setTag(2131296439, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ma.o(-1, 8));
                return;
            }
            return;
        }
        z3Var.f12889m3 = null;
        z3Var.f12892n3 = null;
    }

    public final void u(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat O0;
        z3 z3Var = this.f12529x;
        if (z3Var.n1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (O0 = mp.u1(z3Var.f12888m2).O0(Long.valueOf(-z3Var.l1))) != null) {
            TLRPC.ChatFull P0 = mp.u1(z3Var.f12888m2).P0(O0.f28431id);
            if (P0 == null) {
                P0 = tr.a0(z3Var.f12888m2).F0(O0.f28431id, true, new CountDownLatch(1), false, false, 0);
            }
            if (P0 != null && P0.can_view_stats) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232380, gd.N0(2131743299, null), false, this.d).setOnClickListener(new bi.q6(this, storyItem, this.f12523e, O0, 1));
            }
        }
    }
}
