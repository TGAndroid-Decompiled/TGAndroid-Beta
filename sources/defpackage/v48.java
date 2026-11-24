package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class v48 extends f9 {
    public boolean c;
    public final r63 d;
    public final oab e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final Context r;
    public final y48 s;
    public final boolean[] w;
    public final a58 x;

    public v48(a58 a58Var, Context context, r63 r63Var, r63 r63Var2, oab oabVar, boolean z, boolean z2, boolean z3, Context context2, y48 y48Var, boolean[] zArr) {
        super(context, r63Var, true);
        this.x = a58Var;
        this.d = r63Var2;
        this.e = oabVar;
        this.f = z;
        this.h = z2;
        this.n = z3;
        this.r = context2;
        this.s = y48Var;
        this.w = zArr;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v48.j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void k() {
        if (!this.c && !this.w[0]) {
            gm.c3(new p48(this, (byte) 0));
        }
        a58 a58Var = this.x;
        a58Var.j1 = null;
        a58Var.i1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z) {
        z48 z48Var;
        boolean z2 = this.f;
        a58 a58Var = this.x;
        if (z2 && ((z48Var = a58Var.E1) == null || z48Var.b == null)) {
            Context context = a58Var.getContext();
            th8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wm4 wm4Var = new wm4(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, (byte) 17);
            mx6 mx6Var = new mx6((byte) 22);
            a8[] a8VarArr = new a8[5];
            mx6Var.d = a8VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, context);
            mx6Var.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232063, jb6.M0(2131753721, null), false, null);
            c.setOnClickListener(new w70(swipeBack, (byte) 3));
            c.d(-328966, -328966);
            c.setSelectorColor(268435455);
            View a6Var = new a6(context, (byte) 8);
            a6Var.setMinimumWidth(gm.L(196.0f));
            a6Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a6Var.getLayoutParams();
            if (jb6.a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = gm.L(8.0f);
            a6Var.setLayoutParams(layoutParams);
            v7 v7Var = new v7(context, null);
            mx6Var.c = v7Var;
            v7Var.setMinimumWidth(gm.L(196.0f));
            v7Var.setDrawShadow(false);
            v7Var.setBackgroundColor(-14540254);
            v7Var.setTextColor(-1);
            v7Var.setOnValueChange(new h92(wm4Var, (byte) 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v7Var, qoe.o(-1, 44));
            View a6Var2 = new a6(context, (byte) 9);
            a6Var2.setMinimumWidth(gm.L(196.0f));
            a6Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a6Var2.getLayoutParams();
            if (jb6.a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = gm.L(8.0f);
            a6Var2.setLayoutParams(layoutParams2);
            a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232375, jb6.M0(2131744952, null), false, null);
            c2.d(-328966, -328966);
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wm4 wm4Var2 = wm4Var;
                    switch (b) {
                        case 0:
                            wm4Var2.c0(true, true, 0.2f);
                            return;
                        case 1:
                            wm4Var2.c0(true, true, 0.5f);
                            return;
                        case 2:
                            wm4Var2.c0(true, true, 1.0f);
                            return;
                        case 3:
                            wm4Var2.c0(true, true, 1.5f);
                            return;
                        default:
                            wm4Var2.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c2.setSelectorColor(268435455);
            a8VarArr[0] = c2;
            a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232379, jb6.M0(2131744955, null), false, null);
            c3.d(-328966, -328966);
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wm4 wm4Var2 = wm4Var;
                    switch (b) {
                        case 0:
                            wm4Var2.c0(true, true, 0.2f);
                            return;
                        case 1:
                            wm4Var2.c0(true, true, 0.5f);
                            return;
                        case 2:
                            wm4Var2.c0(true, true, 1.0f);
                            return;
                        case 3:
                            wm4Var2.c0(true, true, 1.5f);
                            return;
                        default:
                            wm4Var2.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c3.setSelectorColor(268435455);
            a8VarArr[1] = c3;
            a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232378, jb6.M0(2131744956, null), false, null);
            c4.d(-328966, -328966);
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wm4 wm4Var2 = wm4Var;
                    switch (b) {
                        case 0:
                            wm4Var2.c0(true, true, 0.2f);
                            return;
                        case 1:
                            wm4Var2.c0(true, true, 0.5f);
                            return;
                        case 2:
                            wm4Var2.c0(true, true, 1.0f);
                            return;
                        case 3:
                            wm4Var2.c0(true, true, 1.5f);
                            return;
                        default:
                            wm4Var2.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c4.setSelectorColor(268435455);
            a8VarArr[2] = c4;
            a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232376, jb6.M0(2131744959, null), false, null);
            c5.d(-328966, -328966);
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wm4 wm4Var2 = wm4Var;
                    switch (b) {
                        case 0:
                            wm4Var2.c0(true, true, 0.2f);
                            return;
                        case 1:
                            wm4Var2.c0(true, true, 0.5f);
                            return;
                        case 2:
                            wm4Var2.c0(true, true, 1.0f);
                            return;
                        case 3:
                            wm4Var2.c0(true, true, 1.5f);
                            return;
                        default:
                            wm4Var2.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c5.setSelectorColor(268435455);
            a8VarArr[3] = c5;
            a8 c6 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232380, jb6.M0(2131744953, null), false, null);
            c6.d(-328966, -328966);
            c6.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wm4 wm4Var2 = wm4Var;
                    switch (b) {
                        case 0:
                            wm4Var2.c0(true, true, 0.2f);
                            return;
                        case 1:
                            wm4Var2.c0(true, true, 0.5f);
                            return;
                        case 2:
                            wm4Var2.c0(true, true, 1.0f);
                            return;
                        case 3:
                            wm4Var2.c0(true, true, 1.5f);
                            return;
                        default:
                            wm4Var2.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c6.setSelectorColor(268435455);
            a8VarArr[4] = c6;
            a58Var.s3 = mx6Var;
            mx6Var.B0(true, oab.B1);
            Context context2 = a58Var.getContext();
            r63 r63Var = this.d;
            a8 a8Var = new a8(0, r63Var, context2, false, false);
            a58Var.t3 = a8Var;
            a8Var.j(jb6.M0(2131744960, null), 2131232374, null);
            a58Var.g1(true);
            a58Var.t3.setMinimumWidth(gm.L(196.0f));
            a58Var.t3.setRightIcon(2131232065);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a58Var.t3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a58Var.t3.getLayoutParams();
            if (jb6.a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = gm.L(48.0f);
            a58Var.t3.setLayoutParams(layoutParams3);
            int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) a58Var.s3.b);
            a8 a8Var2 = a58Var.t3;
            a8Var2.Q = new q48(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 0);
            a8Var2.setOnClickListener(new m48(this, (byte) 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
            if (z) {
                j8 j8Var = new j8(cmb.G8, r63Var, a58Var.getContext());
                j8Var.setTag(2131296439, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var, qoe.o(-1, 8));
                return;
            }
            return;
        }
        a58Var.s3 = null;
        a58Var.t3 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat L0;
        a58 a58Var = this.x;
        if (a58Var.t1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (L0 = oc7.r1(a58Var.s2).L0(Long.valueOf(-a58Var.r1))) != null) {
            TLRPC.ChatFull M0 = oc7.r1(a58Var.s2).M0(L0.id);
            if (M0 == null) {
                M0 = cf7.Y(a58Var.s2).C0(L0.id, true, new CountDownLatch(1), false, false, 0);
            }
            if (M0 != null && M0.can_view_stats) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232384, jb6.M0(2131743226, null), false, this.d).setOnClickListener(new ef(this, storyItem, this.e, L0, (byte) 13));
            }
        }
    }
}
