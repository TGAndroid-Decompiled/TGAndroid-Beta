package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c8.ja;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.tq;
public final class t3 extends k.a {
    public boolean f12353c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final i9 f12354e;
    public final boolean f12355f;
    public final boolean h;
    public final boolean f12356n;
    public final Context f12357r;
    public final y3 f12358s;
    public final boolean[] f12359w;
    public final b4 f12360x;

    public t3(b4 b4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e6 e6Var2, i9 i9Var, boolean z10, boolean z11, boolean z12, Context context2, y3 y3Var, boolean[] zArr) {
        super(context, e6Var, true);
        this.f12360x = b4Var;
        this.d = e6Var2;
        this.f12354e = i9Var;
        this.f12355f = z10;
        this.h = z11;
        this.f12356n = z12;
        this.f12357r = context2;
        this.f12358s = y3Var;
        this.f12359w = zArr;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r42) {
        throw new UnsupportedOperationException("Method not decompiled: fi.t3.k(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void l() {
        if (!this.f12353c && !this.f12359w[0]) {
            org.telegram.messenger.g0.h3(new n3(this, 0));
        }
        b4 b4Var = this.f12360x;
        b4Var.f11466d1 = null;
        b4Var.f11463c1 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        z3 z3Var;
        boolean z11 = this.f12355f;
        b4 b4Var = this.f12360x;
        if (z11 && ((z3Var = b4Var.f11543y1) == null || z3Var.f12580b == null)) {
            Context context = b4Var.getContext();
            ye0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 20);
            h6.m mVar = new h6.m(25, false);
            org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
            mVar.d = z0VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            mVar.f13624b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232058, hd.M0(2131753756, null), false, null);
            c10.setOnClickListener(new tq(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View v1Var = new bi.v1(context, 13);
            v1Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            v1Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(v1Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v1Var.getLayoutParams();
            if (hd.f24101a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.g0.L(8.0f);
            v1Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
            mVar.f13625c = v0Var;
            v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            v0Var.setDrawShadow(false);
            v0Var.setBackgroundColor(-14540254);
            v0Var.setTextColor(-1);
            v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ja.o(-1, 44));
            View v1Var2 = new bi.v1(context, 14);
            v1Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            v1Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(v1Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) v1Var2.getLayoutParams();
            if (hd.f24101a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
            v1Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232370, hd.M0(2131745263, null), false, null);
            c11.d(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.M(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.M(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.M(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.M(true, true, 1.5f);
                            return;
                        default:
                            bVar.M(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            z0VarArr[0] = c11;
            org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, hd.M0(2131745266, null), false, null);
            c12.d(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.M(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.M(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.M(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.M(true, true, 1.5f);
                            return;
                        default:
                            bVar.M(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            z0VarArr[1] = c12;
            org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232373, hd.M0(2131745267, null), false, null);
            c13.d(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.M(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.M(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.M(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.M(true, true, 1.5f);
                            return;
                        default:
                            bVar.M(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            z0VarArr[2] = c13;
            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232371, hd.M0(2131745270, null), false, null);
            c14.d(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.M(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.M(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.M(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.M(true, true, 1.5f);
                            return;
                        default:
                            bVar.M(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            z0VarArr[3] = c14;
            org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232375, hd.M0(2131745264, null), false, null);
            c15.d(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.M(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.M(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.M(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.M(true, true, 1.5f);
                            return;
                        default:
                            bVar.M(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            z0VarArr[4] = c15;
            b4Var.f11498m3 = mVar;
            mVar.H(true, i9.B1);
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, b4Var.getContext(), this.d, false, false);
            b4Var.f11501n3 = z0Var;
            z0Var.j(hd.M0(2131745271, null), 2131232369, null);
            b4.Y(b4Var, true);
            b4Var.f11501n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            b4Var.f11501n3.setRightIcon(2131232060);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b4Var.f11501n3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) b4Var.f11501n3.getLayoutParams();
            if (hd.f24101a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
            b4Var.f11501n3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) b4Var.f11498m3.f13624b);
            org.telegram.ui.ActionBar.z0 z0Var2 = b4Var.f11501n3;
            z0Var2.Q = new o3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            z0Var2.setOnClickListener(new j3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f28383c = true;
            if (z10) {
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, b4Var.getContext(), this.d);
                d1Var.setTag(2131296437, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ja.o(-1, 8));
                return;
            }
            return;
        }
        b4Var.f11498m3 = null;
        b4Var.f11501n3 = null;
    }

    public final void u(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        b4 b4Var = this.f12360x;
        if (b4Var.n1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (M0 = np.s1(b4Var.f11497m2).M0(Long.valueOf(-b4Var.l1))) != null) {
            TLRPC.ChatFull N0 = np.s1(b4Var.f11497m2).N0(M0.f28051id);
            if (N0 == null) {
                N0 = vr.a0(b4Var.f11497m2).F0(M0.f28051id, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.can_view_stats) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232379, hd.M0(2131743542, null), false, this.d).setOnClickListener(new bi.f4(this, storyItem, this.f12354e, M0, 1));
            }
        }
    }
}
