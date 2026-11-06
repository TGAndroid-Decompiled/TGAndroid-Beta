package di;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c8.ha;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.rq;
public final class z3 extends k.a {
    public boolean f10006c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final p9 f10007e;
    public final boolean f10008f;
    public final boolean h;
    public final boolean f10009n;
    public final Context f10010r;
    public final f4 f10011s;
    public final boolean[] f10012w;
    public final i4 f10013x;

    public z3(i4 i4Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f6 f6Var2, p9 p9Var, boolean z9, boolean z10, boolean z11, Context context2, f4 f4Var, boolean[] zArr) {
        super(context, f6Var, true);
        this.f10013x = i4Var;
        this.d = f6Var2;
        this.f10007e = p9Var;
        this.f10008f = z9;
        this.h = z10;
        this.f10009n = z11;
        this.f10010r = context2;
        this.f10011s = f4Var;
        this.f10012w = zArr;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r39) {
        throw new UnsupportedOperationException("Method not decompiled: di.z3.j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void k() {
        if (!this.f10006c && !this.f10012w[0]) {
            org.telegram.messenger.g0.h3(new s3(this, 0));
        }
        i4 i4Var = this.f10013x;
        i4Var.f9136c1 = null;
        i4Var.f9133b1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z9) {
        g4 g4Var;
        boolean z10 = this.f10008f;
        i4 i4Var = this.f10013x;
        if (z10 && ((g4Var = i4Var.f9213x1) == null || g4Var.f9039b == null)) {
            Context context = i4Var.getContext();
            ve0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 15);
            h6.m mVar = new h6.m(24, false);
            org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
            mVar.d = z0VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            mVar.f14264b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232057, hd.M0(2131753756, null), false, null);
            c10.setOnClickListener(new rq(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View a4Var = new a4(context, 11);
            a4Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            a4Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a4Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a4Var.getLayoutParams();
            if (hd.f22878a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.g0.L(8.0f);
            a4Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
            mVar.f14265c = v0Var;
            v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            v0Var.setDrawShadow(false);
            v0Var.setBackgroundColor(-14540254);
            v0Var.setTextColor(-1);
            v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ha.o(-1, 44));
            View a4Var2 = new a4(context, 12);
            a4Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            a4Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a4Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a4Var2.getLayoutParams();
            if (hd.f22878a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
            a4Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232369, hd.M0(2131745264, null), false, null);
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
            org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232373, hd.M0(2131745267, null), false, null);
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
            org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232372, hd.M0(2131745268, null), false, null);
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
            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232370, hd.M0(2131745271, null), false, null);
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
            org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, hd.M0(2131745265, null), false, null);
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
            i4Var.f9169l3 = mVar;
            mVar.H(true, p9.A1);
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, i4Var.getContext(), this.d, false, false);
            i4Var.f9172m3 = z0Var;
            z0Var.j(hd.M0(2131745272, null), 2131232368, null);
            i4.Y(i4Var, true);
            i4Var.f9172m3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            i4Var.f9172m3.setRightIcon(2131232059);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(i4Var.f9172m3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) i4Var.f9172m3.getLayoutParams();
            if (hd.f22878a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
            i4Var.f9172m3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) i4Var.f9169l3.f14264b);
            org.telegram.ui.ActionBar.z0 z0Var2 = i4Var.f9172m3;
            z0Var2.P = new t3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            z0Var2.setOnClickListener(new o3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f27284c = true;
            if (z9) {
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, i4Var.getContext(), this.d);
                d1Var.setTag(2131296437, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
                return;
            }
            return;
        }
        i4Var.f9169l3 = null;
        i4Var.f9172m3 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        i4 i4Var = this.f10013x;
        if (i4Var.f9170m1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (M0 = qp.s1(i4Var.f9168l2).M0(Long.valueOf(-i4Var.f9164k1))) != null) {
            TLRPC.ChatFull N0 = qp.s1(i4Var.f9168l2).N0(M0.f26953id);
            if (N0 == null) {
                N0 = yr.a0(i4Var.f9168l2).F0(M0.f26953id, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.can_view_stats) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232378, hd.M0(2131743543, null), false, this.d).setOnClickListener(new u3(this, storyItem, this.f10007e, M0, 0));
            }
        }
    }
}
