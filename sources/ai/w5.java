package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.xr;
public final class w5 extends xr {
    public boolean f1652c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final jc e;
    public final boolean f1653f;
    public final boolean f1654g;
    public final boolean h;
    public final Context f1655i;
    public final c6 f1656j;
    public final boolean[] f1657k;
    public final f6 f1658l;

    public w5(f6 f6Var, Context context, org.telegram.ui.ActionBar.f6 f6Var2, org.telegram.ui.ActionBar.f6 f6Var3, jc jcVar, boolean z10, boolean z11, boolean z12, Context context2, c6 c6Var, boolean[] zArr) {
        super(context, f6Var2, true);
        this.f1658l = f6Var;
        this.d = f6Var3;
        this.e = jcVar;
        this.f1653f = z10;
        this.f1654g = z11;
        this.h = z12;
        this.f1655i = context2;
        this.f1656j = c6Var;
        this.f1657k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w5.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f1652c && !this.f1657k[0]) {
            AndroidUtilities.runOnUIThread(new n5(this, 0));
        }
        f6 f6Var = this.f1658l;
        f6Var.f854t1 = null;
        f6Var.f851s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        d6 d6Var;
        boolean z11 = this.f1653f;
        f6 f6Var = this.f1658l;
        if (z11 && ((d6Var = f6Var.O1) == null || d6Var.f707b == null)) {
            Context context = f6Var.getContext();
            vg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final of.b bVar = new of.b(2, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
            obj.f32906c = g1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f32904a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new org.telegram.ui.xr(swipeBack, 1));
            c10.c(-328966, -328966);
            c10.setSelectorColor(268435455);
            View x5Var = new x5(context, 12);
            x5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            x5Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(x5Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) x5Var.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            x5Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
            obj.f32905b = c1Var;
            c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            c1Var.setDrawShadow(false);
            c1Var.setBackgroundColor(-14540254);
            c1Var.setTextColor(-1);
            c1Var.setOnValueChange(new org.telegram.ui.b5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, w7.x5.n(-1, 44));
            View x5Var2 = new x5(context, 13);
            x5Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            x5Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(x5Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) x5Var2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            x5Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.Q(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.Q(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.Q(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.Q(true, true, 1.5f);
                            return;
                        default:
                            bVar.Q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            g1VarArr[0] = c11;
            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
            c12.c(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.Q(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.Q(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.Q(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.Q(true, true, 1.5f);
                            return;
                        default:
                            bVar.Q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            g1VarArr[1] = c12;
            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
            c13.c(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.Q(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.Q(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.Q(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.Q(true, true, 1.5f);
                            return;
                        default:
                            bVar.Q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            g1VarArr[2] = c13;
            org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
            c14.c(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.Q(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.Q(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.Q(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.Q(true, true, 1.5f);
                            return;
                        default:
                            bVar.Q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            g1VarArr[3] = c14;
            org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
            c15.c(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.Q(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.Q(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.Q(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.Q(true, true, 1.5f);
                            return;
                        default:
                            bVar.Q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            g1VarArr[4] = c15;
            f6Var.C3 = obj;
            obj.a(jc.B1, true);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, f6Var.getContext(), this.d, false, false);
            f6Var.D3 = g1Var;
            g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            f6.a0(f6Var, true);
            f6Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            f6Var.D3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f6Var.D3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) f6Var.D3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            f6Var.D3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(f6Var.C3.f32904a);
            org.telegram.ui.ActionBar.g1 g1Var2 = f6Var.D3;
            g1Var2.G = new o5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            g1Var2.setOnClickListener(new j5(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f18438c = true;
            if (z10) {
                org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(f6Var.getContext(), org.telegram.ui.ActionBar.j6.H8, this.d);
                l1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, w7.x5.n(-1, 8));
                return;
            }
            return;
        }
        f6Var.C3 = null;
        f6Var.D3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        f6 f6Var = this.f1658l;
        if (f6Var.D1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(f6Var.C2).getChatFull(chat.f18121id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(f6Var.C2).loadChatInfo(chat.f18121id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new p5(this, storyItem, this.e, chat, 0));
            }
        }
    }
}
