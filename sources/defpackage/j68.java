package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class j68 extends g9 {
    public boolean c;
    public final x53 d;
    public final lcb e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final Context r;
    public final m68 s;
    public final boolean[] w;
    public final o68 x;

    public j68(o68 o68Var, Context context, x53 x53Var, x53 x53Var2, lcb lcbVar, boolean z, boolean z2, boolean z3, Context context2, m68 m68Var, boolean[] zArr) {
        super(context, x53Var, true);
        this.x = o68Var;
        this.d = x53Var2;
        this.e = lcbVar;
        this.f = z;
        this.h = z2;
        this.n = z3;
        this.r = context2;
        this.s = m68Var;
        this.w = zArr;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j68.j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void k() {
        if (!this.c && !this.w[0]) {
            hl.c3(new z58(this, (byte) 3));
        }
        o68 o68Var = this.x;
        o68Var.d1 = null;
        o68Var.c1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z) {
        n68 n68Var;
        boolean z2 = this.f;
        o68 o68Var = this.x;
        if (z2 && ((n68Var = o68Var.y1) == null || n68Var.b == null)) {
            Context context = o68Var.getContext();
            fj8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final um4 um4Var = new um4(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, (byte) 18);
            rx6 rx6Var = new rx6((byte) 22);
            b8[] b8VarArr = new b8[5];
            rx6Var.d = b8VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, context);
            rx6Var.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232062, ob6.M0(2131753749, null), false, null);
            c.setOnClickListener(new y60(swipeBack, (byte) 3));
            c.d(-328966, -328966);
            c.setSelectorColor(268435455);
            View b6Var = new b6(context, (byte) 8);
            b6Var.setMinimumWidth(hl.L(196.0f));
            b6Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b6Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b6Var.getLayoutParams();
            if (ob6.a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = hl.L(8.0f);
            b6Var.setLayoutParams(layoutParams);
            w7 w7Var = new w7(context, null);
            rx6Var.c = w7Var;
            w7Var.setMinimumWidth(hl.L(196.0f));
            w7Var.setDrawShadow(false);
            w7Var.setBackgroundColor(-14540254);
            w7Var.setTextColor(-1);
            w7Var.setOnValueChange(new n82(um4Var, (byte) 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(w7Var, tre.o(-1, 44));
            View b6Var2 = new b6(context, (byte) 9);
            b6Var2.setMinimumWidth(hl.L(196.0f));
            b6Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b6Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b6Var2.getLayoutParams();
            if (ob6.a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = hl.L(8.0f);
            b6Var2.setLayoutParams(layoutParams2);
            b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, ob6.M0(2131744920, null), false, null);
            c2.d(-328966, -328966);
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    um4 um4Var2 = um4Var;
                    switch (b) {
                        case 0:
                            um4Var2.a0(true, true, 0.2f);
                            return;
                        case 1:
                            um4Var2.a0(true, true, 0.5f);
                            return;
                        case 2:
                            um4Var2.a0(true, true, 1.0f);
                            return;
                        case 3:
                            um4Var2.a0(true, true, 1.5f);
                            return;
                        default:
                            um4Var2.a0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c2.setSelectorColor(268435455);
            b8VarArr[0] = c2;
            b8 c3 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232378, ob6.M0(2131744923, null), false, null);
            c3.d(-328966, -328966);
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    um4 um4Var2 = um4Var;
                    switch (b) {
                        case 0:
                            um4Var2.a0(true, true, 0.2f);
                            return;
                        case 1:
                            um4Var2.a0(true, true, 0.5f);
                            return;
                        case 2:
                            um4Var2.a0(true, true, 1.0f);
                            return;
                        case 3:
                            um4Var2.a0(true, true, 1.5f);
                            return;
                        default:
                            um4Var2.a0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c3.setSelectorColor(268435455);
            b8VarArr[1] = c3;
            b8 c4 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232377, ob6.M0(2131744924, null), false, null);
            c4.d(-328966, -328966);
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    um4 um4Var2 = um4Var;
                    switch (b) {
                        case 0:
                            um4Var2.a0(true, true, 0.2f);
                            return;
                        case 1:
                            um4Var2.a0(true, true, 0.5f);
                            return;
                        case 2:
                            um4Var2.a0(true, true, 1.0f);
                            return;
                        case 3:
                            um4Var2.a0(true, true, 1.5f);
                            return;
                        default:
                            um4Var2.a0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c4.setSelectorColor(268435455);
            b8VarArr[2] = c4;
            b8 c5 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232375, ob6.M0(2131744927, null), false, null);
            c5.d(-328966, -328966);
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    um4 um4Var2 = um4Var;
                    switch (b) {
                        case 0:
                            um4Var2.a0(true, true, 0.2f);
                            return;
                        case 1:
                            um4Var2.a0(true, true, 0.5f);
                            return;
                        case 2:
                            um4Var2.a0(true, true, 1.0f);
                            return;
                        case 3:
                            um4Var2.a0(true, true, 1.5f);
                            return;
                        default:
                            um4Var2.a0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c5.setSelectorColor(268435455);
            b8VarArr[3] = c5;
            b8 c6 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232379, ob6.M0(2131744921, null), false, null);
            c6.d(-328966, -328966);
            c6.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    um4 um4Var2 = um4Var;
                    switch (b) {
                        case 0:
                            um4Var2.a0(true, true, 0.2f);
                            return;
                        case 1:
                            um4Var2.a0(true, true, 0.5f);
                            return;
                        case 2:
                            um4Var2.a0(true, true, 1.0f);
                            return;
                        case 3:
                            um4Var2.a0(true, true, 1.5f);
                            return;
                        default:
                            um4Var2.a0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c6.setSelectorColor(268435455);
            b8VarArr[4] = c6;
            o68Var.m3 = rx6Var;
            rx6Var.C0(true, lcb.B1);
            Context context2 = o68Var.getContext();
            x53 x53Var = this.d;
            b8 b8Var = new b8(0, x53Var, context2, false, false);
            o68Var.n3 = b8Var;
            b8Var.j(ob6.M0(2131744928, null), 2131232373, null);
            o68Var.g1(true);
            o68Var.n3.setMinimumWidth(hl.L(196.0f));
            o68Var.n3.setRightIcon(2131232064);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(o68Var.n3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) o68Var.n3.getLayoutParams();
            if (ob6.a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = hl.L(48.0f);
            o68Var.n3.setLayoutParams(layoutParams3);
            int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) o68Var.m3.b);
            b8 b8Var2 = o68Var.n3;
            b8Var2.Q = new c68(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 0);
            b8Var2.setOnClickListener(new d68(this, (byte) 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
            if (z) {
                k8 k8Var = new k8(aob.H8, x53Var, o68Var.getContext());
                k8Var.setTag(2131296439, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k8Var, tre.o(-1, 8));
                return;
            }
            return;
        }
        o68Var.m3 = null;
        o68Var.n3 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        o68 o68Var = this.x;
        if (o68Var.n1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (M0 = uc7.s1(o68Var.m2).M0(Long.valueOf(-o68Var.l1))) != null) {
            TLRPC.ChatFull N0 = uc7.s1(o68Var.m2).N0(M0.id);
            if (N0 == null) {
                N0 = jf7.Y(o68Var.m2).C0(M0.id, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.can_view_stats) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232383, ob6.M0(2131743194, null), false, this.d).setOnClickListener(new cg(this, storyItem, this.e, M0, (byte) 13));
            }
        }
    }
}
