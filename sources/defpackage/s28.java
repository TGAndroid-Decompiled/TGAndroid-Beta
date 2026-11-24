package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class s28 extends f9 {
    public boolean c;
    public final f53 d;
    public final m8b e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final Context r;
    public final w28 s;
    public final boolean[] w;
    public final y28 x;

    public s28(y28 y28Var, Context context, f53 f53Var, f53 f53Var2, m8b m8bVar, boolean z, boolean z2, boolean z3, Context context2, w28 w28Var, boolean[] zArr) {
        super(context, f53Var, true);
        this.x = y28Var;
        this.d = f53Var2;
        this.e = m8bVar;
        this.f = z;
        this.h = z2;
        this.n = z3;
        this.r = context2;
        this.s = w28Var;
        this.w = zArr;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s28.j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void k() {
        if (!this.c && !this.w[0]) {
            gl.c3(new m28(this, (byte) 0));
        }
        y28 y28Var = this.x;
        y28Var.j1 = null;
        y28Var.i1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z) {
        x28 x28Var;
        boolean z2 = this.f;
        y28 y28Var = this.x;
        if (z2 && ((x28Var = y28Var.E1) == null || x28Var.b == null)) {
            Context context = y28Var.getContext();
            rf8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final wk4 wk4Var = new wk4(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, (byte) 17);
            mv6 mv6Var = new mv6((byte) 22);
            a8[] a8VarArr = new a8[5];
            mv6Var.d = a8VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, context);
            mv6Var.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232062, k96.M0(2131753753, null), false, null);
            c.setOnClickListener(new w60(swipeBack, (byte) 3));
            c.d(-328966, -328966);
            c.setSelectorColor(268435455);
            View a6Var = new a6(context, (byte) 8);
            a6Var.setMinimumWidth(gl.L(196.0f));
            a6Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a6Var.getLayoutParams();
            if (k96.a0) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = gl.L(8.0f);
            a6Var.setLayoutParams(layoutParams);
            v7 v7Var = new v7(context, null);
            mv6Var.c = v7Var;
            v7Var.setMinimumWidth(gl.L(196.0f));
            v7Var.setDrawShadow(false);
            v7Var.setBackgroundColor(-14540254);
            v7Var.setTextColor(-1);
            v7Var.setOnValueChange(new w72(wk4Var, (byte) 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v7Var, nme.o(-1, 44));
            View a6Var2 = new a6(context, (byte) 9);
            a6Var2.setMinimumWidth(gl.L(196.0f));
            a6Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a6Var2.getLayoutParams();
            if (k96.a0) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = gl.L(8.0f);
            a6Var2.setLayoutParams(layoutParams2);
            a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232374, k96.M0(2131745026, null), false, null);
            c2.d(-328966, -328966);
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wk4 wk4Var2 = wk4Var;
                    switch (b) {
                        case 0:
                            wk4Var2.d0(true, true, 0.2f);
                            return;
                        case 1:
                            wk4Var2.d0(true, true, 0.5f);
                            return;
                        case 2:
                            wk4Var2.d0(true, true, 1.0f);
                            return;
                        case 3:
                            wk4Var2.d0(true, true, 1.5f);
                            return;
                        default:
                            wk4Var2.d0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c2.setSelectorColor(268435455);
            a8VarArr[0] = c2;
            a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232378, k96.M0(2131745029, null), false, null);
            c3.d(-328966, -328966);
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wk4 wk4Var2 = wk4Var;
                    switch (b) {
                        case 0:
                            wk4Var2.d0(true, true, 0.2f);
                            return;
                        case 1:
                            wk4Var2.d0(true, true, 0.5f);
                            return;
                        case 2:
                            wk4Var2.d0(true, true, 1.0f);
                            return;
                        case 3:
                            wk4Var2.d0(true, true, 1.5f);
                            return;
                        default:
                            wk4Var2.d0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c3.setSelectorColor(268435455);
            a8VarArr[1] = c3;
            a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232377, k96.M0(2131745030, null), false, null);
            c4.d(-328966, -328966);
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wk4 wk4Var2 = wk4Var;
                    switch (b) {
                        case 0:
                            wk4Var2.d0(true, true, 0.2f);
                            return;
                        case 1:
                            wk4Var2.d0(true, true, 0.5f);
                            return;
                        case 2:
                            wk4Var2.d0(true, true, 1.0f);
                            return;
                        case 3:
                            wk4Var2.d0(true, true, 1.5f);
                            return;
                        default:
                            wk4Var2.d0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c4.setSelectorColor(268435455);
            a8VarArr[2] = c4;
            a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232375, k96.M0(2131745033, null), false, null);
            c5.d(-328966, -328966);
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wk4 wk4Var2 = wk4Var;
                    switch (b) {
                        case 0:
                            wk4Var2.d0(true, true, 0.2f);
                            return;
                        case 1:
                            wk4Var2.d0(true, true, 0.5f);
                            return;
                        case 2:
                            wk4Var2.d0(true, true, 1.0f);
                            return;
                        case 3:
                            wk4Var2.d0(true, true, 1.5f);
                            return;
                        default:
                            wk4Var2.d0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c5.setSelectorColor(268435455);
            a8VarArr[3] = c5;
            a8 c6 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232379, k96.M0(2131745027, null), false, null);
            c6.d(-328966, -328966);
            c6.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wk4 wk4Var2 = wk4Var;
                    switch (b) {
                        case 0:
                            wk4Var2.d0(true, true, 0.2f);
                            return;
                        case 1:
                            wk4Var2.d0(true, true, 0.5f);
                            return;
                        case 2:
                            wk4Var2.d0(true, true, 1.0f);
                            return;
                        case 3:
                            wk4Var2.d0(true, true, 1.5f);
                            return;
                        default:
                            wk4Var2.d0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c6.setSelectorColor(268435455);
            a8VarArr[4] = c6;
            y28Var.s3 = mv6Var;
            mv6Var.w0(true, m8b.B1);
            Context context2 = y28Var.getContext();
            f53 f53Var = this.d;
            a8 a8Var = new a8(0, f53Var, context2, false, false);
            y28Var.t3 = a8Var;
            a8Var.j(k96.M0(2131745034, null), 2131232373, null);
            y28Var.g1(true);
            y28Var.t3.setMinimumWidth(gl.L(196.0f));
            y28Var.t3.setRightIcon(2131232064);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y28Var.t3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) y28Var.t3.getLayoutParams();
            if (k96.a0) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = gl.L(48.0f);
            y28Var.t3.setLayoutParams(layoutParams3);
            int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) y28Var.s3.b);
            a8 a8Var2 = y28Var.t3;
            a8Var2.Q = new n28(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 0);
            a8Var2.setOnClickListener(new j28(this, (byte) 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
            if (z) {
                j8 j8Var = new j8(bkb.G8, f53Var, y28Var.getContext());
                j8Var.setTag(2131296439, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var, nme.o(-1, 8));
                return;
            }
            return;
        }
        y28Var.s3 = null;
        y28Var.t3 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat K0;
        y28 y28Var = this.x;
        if (y28Var.t1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (K0 = na7.q1(y28Var.s2).K0(Long.valueOf(-y28Var.r1))) != null) {
            TLRPC.ChatFull L0 = na7.q1(y28Var.s2).L0(K0.id);
            if (L0 == null) {
                L0 = ad7.Y(y28Var.s2).C0(K0.id, true, new CountDownLatch(1), false, false, 0);
            }
            if (L0 != null && L0.can_view_stats) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232383, k96.M0(2131743300, null), false, this.d).setOnClickListener(new ee(this, storyItem, this.e, K0, (byte) 13));
            }
        }
    }
}
