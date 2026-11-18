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
import org.telegram.ui.Components.if0;
import org.telegram.ui.uq;
public final class r3 extends k.a {
    public boolean f12494c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final f9 f12495e;
    public final boolean f12496f;
    public final boolean h;
    public final boolean f12497n;
    public final Context f12498r;
    public final w3 f12499s;
    public final boolean[] f12500w;
    public final z3 f12501x;

    public r3(z3 z3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.i6 i6Var2, f9 f9Var, boolean z10, boolean z11, boolean z12, Context context2, w3 w3Var, boolean[] zArr) {
        super(context, i6Var, true);
        this.f12501x = z3Var;
        this.d = i6Var2;
        this.f12495e = f9Var;
        this.f12496f = z10;
        this.h = z11;
        this.f12497n = z12;
        this.f12498r = context2;
        this.f12499s = w3Var;
        this.f12500w = zArr;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r42) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r3.l(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void m() {
        if (!this.f12494c && !this.f12500w[0]) {
            org.telegram.messenger.g0.g3(new l3(this, 0));
        }
        z3 z3Var = this.f12501x;
        z3Var.f12819d1 = null;
        z3Var.f12816c1 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        x3 x3Var;
        boolean z11 = this.f12496f;
        z3 z3Var = this.f12501x;
        if (z11 && ((x3Var = z3Var.f12896y1) == null || x3Var.f12724b == null)) {
            Context context = z3Var.getContext();
            if0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 20);
            h6.m mVar = new h6.m(25, false);
            org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
            mVar.d = z0VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            mVar.f13939b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232059, gd.M0(2131753754, null), false, null);
            c10.setOnClickListener(new uq(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View p2Var = new bi.p2(context, 13);
            p2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            p2Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(p2Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) p2Var.getLayoutParams();
            if (gd.f24216a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.g0.L(8.0f);
            p2Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
            mVar.f13940c = v0Var;
            v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            v0Var.setDrawShadow(false);
            v0Var.setBackgroundColor(-14540254);
            v0Var.setTextColor(-1);
            v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ma.o(-1, 44));
            View p2Var2 = new bi.p2(context, 14);
            p2Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            p2Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(p2Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) p2Var2.getLayoutParams();
            if (gd.f24216a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
            p2Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232371, gd.M0(2131745028, null), false, null);
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
            z0VarArr[0] = c11;
            org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232375, gd.M0(2131745031, null), false, null);
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
            z0VarArr[1] = c12;
            org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, gd.M0(2131745032, null), false, null);
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
            z0VarArr[2] = c13;
            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232372, gd.M0(2131745035, null), false, null);
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
            z0VarArr[3] = c14;
            org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232376, gd.M0(2131745029, null), false, null);
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
            z0VarArr[4] = c15;
            z3Var.f12851m3 = mVar;
            mVar.K(true, f9.B1);
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, z3Var.getContext(), this.d, false, false);
            z3Var.f12854n3 = z0Var;
            z0Var.j(gd.M0(2131745036, null), 2131232370, null);
            z3.Y(z3Var, true);
            z3Var.f12854n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            z3Var.f12854n3.setRightIcon(2131232061);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z3Var.f12854n3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) z3Var.f12854n3.getLayoutParams();
            if (gd.f24216a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
            z3Var.f12854n3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) z3Var.f12851m3.f13939b);
            org.telegram.ui.ActionBar.z0 z0Var2 = z3Var.f12854n3;
            z0Var2.Q = new m3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            z0Var2.setOnClickListener(new h3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f28737c = true;
            if (z10) {
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(org.telegram.ui.ActionBar.n6.H8, z3Var.getContext(), this.d);
                e1Var.setTag(2131296437, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, ma.o(-1, 8));
                return;
            }
            return;
        }
        z3Var.f12851m3 = null;
        z3Var.f12854n3 = null;
    }

    public final void u(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat O0;
        z3 z3Var = this.f12501x;
        if (z3Var.n1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (O0 = mp.u1(z3Var.f12850m2).O0(Long.valueOf(-z3Var.l1))) != null) {
            TLRPC.ChatFull P0 = mp.u1(z3Var.f12850m2).P0(O0.f28405id);
            if (P0 == null) {
                P0 = tr.a0(z3Var.f12850m2).F0(O0.f28405id, true, new CountDownLatch(1), false, false, 0);
            }
            if (P0 != null && P0.can_view_stats) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232380, gd.M0(2131743305, null), false, this.d).setOnClickListener(new bi.n6(this, storyItem, this.f12495e, O0, 1));
            }
        }
    }
}
