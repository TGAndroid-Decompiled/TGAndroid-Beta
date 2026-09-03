package nh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.CountDownLatch;
import n7.qa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.sr;
public final class w3 extends ur {
    public boolean f16001c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final i9 e;
    public final boolean f16002f;
    public final boolean f16003g;
    public final boolean h;
    public final Context f16004i;
    public final a4 f16005j;
    public final boolean[] f16006k;
    public final d4 f16007l;

    public w3(d4 d4Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f6 f6Var2, i9 i9Var, boolean z4, boolean z10, boolean z11, Context context2, a4 a4Var, boolean[] zArr) {
        super(context, f6Var, true);
        this.f16007l = d4Var;
        this.d = f6Var2;
        this.e = i9Var;
        this.f16002f = z4;
        this.f16003g = z10;
        this.h = z11;
        this.f16004i = context2;
        this.f16005j = a4Var;
        this.f16006k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: nh.w3.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f16001c && !this.f16006k[0]) {
            AndroidUtilities.runOnUIThread(new q3(this, 0));
        }
        d4 d4Var = this.f16007l;
        d4Var.f15208q1 = null;
        d4Var.f15205p1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z4) {
        b4 b4Var;
        boolean z10 = this.f16002f;
        d4 d4Var = this.f16007l;
        if (z10 && ((b4Var = d4Var.L1) == null || b4Var.f15092b == null)) {
            Context context = d4Var.getContext();
            bh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final qa qaVar = new qa(2, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
            obj.f40059c = g1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f40057a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c3.setOnClickListener(new sr(swipeBack, 1));
            c3.c(-328966, -328966);
            c3.setSelectorColor(268435455);
            View dVar = new dh.d(context, 12);
            dVar.setMinimumWidth(AndroidUtilities.dp(196.0f));
            dVar.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(dVar);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            dVar.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
            obj.f40058b = c1Var;
            c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            c1Var.setDrawShadow(false);
            c1Var.setBackgroundColor(-14540254);
            c1Var.setTextColor(-1);
            c1Var.setOnValueChange(new org.telegram.ui.f5(qaVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, k7.b6.n(-1, 44));
            View dVar2 = new dh.d(context, 13);
            dVar2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            dVar2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(dVar2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) dVar2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            dVar2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c10.c(-328966, -328966);
            c10.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qaVar.q0(true, true, 0.2f);
                            return;
                        case 1:
                            qaVar.q0(true, true, 0.5f);
                            return;
                        case 2:
                            qaVar.q0(true, true, 1.0f);
                            return;
                        case 3:
                            qaVar.q0(true, true, 1.5f);
                            return;
                        default:
                            qaVar.q0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c10.setSelectorColor(268435455);
            g1VarArr[0] = c10;
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qaVar.q0(true, true, 0.2f);
                            return;
                        case 1:
                            qaVar.q0(true, true, 0.5f);
                            return;
                        case 2:
                            qaVar.q0(true, true, 1.0f);
                            return;
                        case 3:
                            qaVar.q0(true, true, 1.5f);
                            return;
                        default:
                            qaVar.q0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            g1VarArr[1] = c11;
            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
            c12.c(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qaVar.q0(true, true, 0.2f);
                            return;
                        case 1:
                            qaVar.q0(true, true, 0.5f);
                            return;
                        case 2:
                            qaVar.q0(true, true, 1.0f);
                            return;
                        case 3:
                            qaVar.q0(true, true, 1.5f);
                            return;
                        default:
                            qaVar.q0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            g1VarArr[2] = c12;
            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
            c13.c(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qaVar.q0(true, true, 0.2f);
                            return;
                        case 1:
                            qaVar.q0(true, true, 0.5f);
                            return;
                        case 2:
                            qaVar.q0(true, true, 1.0f);
                            return;
                        case 3:
                            qaVar.q0(true, true, 1.5f);
                            return;
                        default:
                            qaVar.q0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            g1VarArr[3] = c13;
            org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
            c14.c(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qaVar.q0(true, true, 0.2f);
                            return;
                        case 1:
                            qaVar.q0(true, true, 0.5f);
                            return;
                        case 2:
                            qaVar.q0(true, true, 1.0f);
                            return;
                        case 3:
                            qaVar.q0(true, true, 1.5f);
                            return;
                        default:
                            qaVar.q0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            g1VarArr[4] = c14;
            d4Var.f15244z3 = obj;
            obj.a(i9.f15426y1, true);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, d4Var.getContext(), this.d, false, false);
            d4Var.A3 = g1Var;
            g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            d4.a0(d4Var, true);
            d4Var.A3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            d4Var.A3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d4Var.A3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) d4Var.A3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            d4Var.A3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(d4Var.f15244z3.f40057a);
            org.telegram.ui.ActionBar.g1 g1Var2 = d4Var.A3;
            g1Var2.D = new r3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            g1Var2.setOnClickListener(new n3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f19470c = true;
            if (z4) {
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(d4Var.getContext(), org.telegram.ui.ActionBar.j6.H8, this.d);
                m1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, k7.b6.n(-1, 8));
                return;
            }
            return;
        }
        d4Var.f15244z3 = null;
        d4Var.A3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        d4 d4Var = this.f16007l;
        if (d4Var.A1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(d4Var.f15243z2).getChat(Long.valueOf(-d4Var.f15238y1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(d4Var.f15243z2).getChatFull(chat.f19159id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(d4Var.f15243z2).loadChatInfo(chat.f19159id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new kh.t3(this, storyItem, this.e, chat, 1));
            }
        }
    }
}
