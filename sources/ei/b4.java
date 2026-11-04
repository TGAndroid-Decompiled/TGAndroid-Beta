package ei;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import b8.mf;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.qq;
public final class b4 extends k.a {
    public boolean f10119c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final r9 f10120e;
    public final boolean f10121f;
    public final boolean h;
    public final boolean f10122n;
    public final Context f10123r;
    public final g4 f10124s;
    public final boolean[] f10125w;
    public final j4 f10126x;

    public b4(j4 j4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e6 e6Var2, r9 r9Var, boolean z10, boolean z11, boolean z12, Context context2, g4 g4Var, boolean[] zArr) {
        super(context, e6Var, true);
        this.f10126x = j4Var;
        this.d = e6Var2;
        this.f10120e = r9Var;
        this.f10121f = z10;
        this.h = z11;
        this.f10122n = z12;
        this.f10123r = context2;
        this.f10124s = g4Var;
        this.f10125w = zArr;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r42) {
        throw new UnsupportedOperationException("Method not decompiled: ei.b4.k(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void l() {
        if (!this.f10119c && !this.f10125w[0]) {
            org.telegram.messenger.g0.h3(new v3(this, 0));
        }
        j4 j4Var = this.f10126x;
        j4Var.f10449d1 = null;
        j4Var.f10447c1 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        h4 h4Var;
        boolean z11 = this.f10121f;
        j4 j4Var = this.f10126x;
        if (z11 && ((h4Var = j4Var.f10527y1) == null || h4Var.f10359b == null)) {
            Context context = j4Var.getContext();
            xe0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final tf.b bVar = new tf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[5];
            obj.f16871c = y0VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f16869a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232057, bd.M0(2131753756, null), false, null);
            c2.setOnClickListener(new qq(swipeBack, 1));
            c2.d(-328966, -328966);
            c2.setSelectorColor(268435455);
            View d2Var = new ai.d2(context, 13);
            d2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            d2Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d2Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) d2Var.getLayoutParams();
            if (bd.f21784a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.g0.L(8.0f);
            d2Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null);
            obj.f16870b = u0Var;
            u0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            u0Var.setDrawShadow(false);
            u0Var.setBackgroundColor(-14540254);
            u0Var.setTextColor(-1);
            u0Var.setOnValueChange(new org.telegram.ui.c5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(u0Var, mf.o(-1, 44));
            View d2Var2 = new ai.d2(context, 14);
            d2Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            d2Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d2Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) d2Var2.getLayoutParams();
            if (bd.f21784a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
            d2Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232369, bd.M0(2131745273, null), false, null);
            c10.d(-328966, -328966);
            c10.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            bVar.x(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.x(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.x(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.x(true, true, 1.5f);
                            return;
                        default:
                            bVar.x(true, true, 2.0f);
                            return;
                    }
                }
            });
            c10.setSelectorColor(268435455);
            y0VarArr[0] = c10;
            org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232373, bd.M0(2131745276, null), false, null);
            c11.d(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            bVar.x(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.x(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.x(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.x(true, true, 1.5f);
                            return;
                        default:
                            bVar.x(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            y0VarArr[1] = c11;
            org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232372, bd.M0(2131745277, null), false, null);
            c12.d(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            bVar.x(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.x(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.x(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.x(true, true, 1.5f);
                            return;
                        default:
                            bVar.x(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            y0VarArr[2] = c12;
            org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232370, bd.M0(2131745280, null), false, null);
            c13.d(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            bVar.x(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.x(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.x(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.x(true, true, 1.5f);
                            return;
                        default:
                            bVar.x(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            y0VarArr[3] = c13;
            org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, bd.M0(2131745274, null), false, null);
            c14.d(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            bVar.x(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.x(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.x(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.x(true, true, 1.5f);
                            return;
                        default:
                            bVar.x(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            y0VarArr[4] = c14;
            j4Var.f10481m3 = obj;
            obj.K(true, r9.C1);
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, j4Var.getContext(), this.d, false, false);
            j4Var.f10485n3 = y0Var;
            y0Var.j(bd.M0(2131745281, null), 2131232368, null);
            j4.Y(j4Var, true);
            j4Var.f10485n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            j4Var.f10485n3.setRightIcon(2131232059);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j4Var.f10485n3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) j4Var.f10485n3.getLayoutParams();
            if (bd.f21784a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
            j4Var.f10485n3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) j4Var.f10481m3.f16869a);
            org.telegram.ui.ActionBar.y0 y0Var2 = j4Var.f10485n3;
            y0Var2.Q = new w3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            y0Var2.setOnClickListener(new r3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f27334c = true;
            if (z10) {
                org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, j4Var.getContext(), this.d);
                c1Var.setTag(2131296437, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(c1Var, mf.o(-1, 8));
                return;
            }
            return;
        }
        j4Var.f10481m3 = null;
        j4Var.f10485n3 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        j4 j4Var = this.f10126x;
        if (j4Var.f10483n1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (M0 = hp.s1(j4Var.f10480m2).M0(Long.valueOf(-j4Var.f10477l1))) != null) {
            TLRPC.ChatFull N0 = hp.s1(j4Var.f10480m2).N0(M0.f27001id);
            if (N0 == null) {
                N0 = qr.a0(j4Var.f10480m2).F0(M0.f27001id, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.can_view_stats) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232378, bd.M0(2131743552, null), false, this.d).setOnClickListener(new ai.r4(this, storyItem, this.f10120e, M0, 1));
            }
        }
    }
}
