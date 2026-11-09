package di;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c8.ha;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.we0;
import org.telegram.ui.tq;
public final class a4 extends k.a {
    public boolean f8801c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final q9 f8802e;
    public final boolean f8803f;
    public final boolean h;
    public final boolean f8804n;
    public final Context f8805r;
    public final g4 f8806s;
    public final boolean[] f8807w;
    public final j4 f8808x;

    public a4(j4 j4Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.g6 g6Var2, q9 q9Var, boolean z9, boolean z10, boolean z11, Context context2, g4 g4Var, boolean[] zArr) {
        super(context, g6Var, true);
        this.f8808x = j4Var;
        this.d = g6Var2;
        this.f8802e = q9Var;
        this.f8803f = z9;
        this.h = z10;
        this.f8804n = z11;
        this.f8805r = context2;
        this.f8806s = g4Var;
        this.f8807w = zArr;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r39) {
        throw new UnsupportedOperationException("Method not decompiled: di.a4.j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void k() {
        if (!this.f8801c && !this.f8807w[0]) {
            org.telegram.messenger.g0.h3(new s3(this, 0));
        }
        j4 j4Var = this.f8808x;
        j4Var.f9168c1 = null;
        j4Var.f9165b1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z9) {
        h4 h4Var;
        boolean z10 = this.f8803f;
        j4 j4Var = this.f8808x;
        if (z10 && ((h4Var = j4Var.f9245x1) == null || h4Var.f9065b == null)) {
            Context context = j4Var.getContext();
            we0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 15);
            h6.m mVar = new h6.m(24, false);
            org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
            mVar.d = z0VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            mVar.f14264b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232057, id.M0(2131753756, null), false, null);
            c10.setOnClickListener(new tq(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View b4Var = new b4(context, 11);
            b4Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            b4Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b4Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b4Var.getLayoutParams();
            if (id.f23157a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.g0.L(8.0f);
            b4Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
            mVar.f14265c = v0Var;
            v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            v0Var.setDrawShadow(false);
            v0Var.setBackgroundColor(-14540254);
            v0Var.setTextColor(-1);
            v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ha.o(-1, 44));
            View b4Var2 = new b4(context, 12);
            b4Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            b4Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b4Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b4Var2.getLayoutParams();
            if (id.f23157a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
            b4Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232369, id.M0(2131745263, null), false, null);
            c11.d(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.e0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.e0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.e0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.e0(true, true, 1.5f);
                            return;
                        default:
                            bVar.e0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            z0VarArr[0] = c11;
            org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232373, id.M0(2131745266, null), false, null);
            c12.d(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.e0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.e0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.e0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.e0(true, true, 1.5f);
                            return;
                        default:
                            bVar.e0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            z0VarArr[1] = c12;
            org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232372, id.M0(2131745267, null), false, null);
            c13.d(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.e0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.e0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.e0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.e0(true, true, 1.5f);
                            return;
                        default:
                            bVar.e0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            z0VarArr[2] = c13;
            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232370, id.M0(2131745270, null), false, null);
            c14.d(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.e0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.e0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.e0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.e0(true, true, 1.5f);
                            return;
                        default:
                            bVar.e0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            z0VarArr[3] = c14;
            org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, id.M0(2131745264, null), false, null);
            c15.d(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.e0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.e0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.e0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.e0(true, true, 1.5f);
                            return;
                        default:
                            bVar.e0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            z0VarArr[4] = c15;
            j4Var.f9201l3 = mVar;
            mVar.H(true, q9.A1);
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, j4Var.getContext(), this.d, false, false);
            j4Var.f9204m3 = z0Var;
            z0Var.j(id.M0(2131745271, null), 2131232368, null);
            j4.Y(j4Var, true);
            j4Var.f9204m3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            j4Var.f9204m3.setRightIcon(2131232059);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j4Var.f9204m3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) j4Var.f9204m3.getLayoutParams();
            if (id.f23157a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
            j4Var.f9204m3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) j4Var.f9201l3.f14264b);
            org.telegram.ui.ActionBar.z0 z0Var2 = j4Var.f9204m3;
            z0Var2.P = new t3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            z0Var2.setOnClickListener(new o3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f27287c = true;
            if (z9) {
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.l6.H8, j4Var.getContext(), this.d);
                d1Var.setTag(2131296437, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
                return;
            }
            return;
        }
        j4Var.f9201l3 = null;
        j4Var.f9204m3 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        j4 j4Var = this.f8808x;
        if (j4Var.f9202m1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (M0 = qp.s1(j4Var.f9200l2).M0(Long.valueOf(-j4Var.f9196k1))) != null) {
            TLRPC.ChatFull N0 = qp.s1(j4Var.f9200l2).N0(M0.f26956id);
            if (N0 == null) {
                N0 = yr.a0(j4Var.f9200l2).F0(M0.f26956id, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.can_view_stats) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232378, id.M0(2131743542, null), false, this.d).setOnClickListener(new v3(this, storyItem, this.f8802e, M0, 0));
            }
        }
    }
}
