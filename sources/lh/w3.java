package lh;

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
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.kr;
public final class w3 extends rr {
    public boolean f16355c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final i9 f16356e;
    public final boolean f16357f;
    public final boolean f16358g;
    public final boolean h;
    public final Context f16359i;
    public final a4 f16360j;
    public final boolean[] f16361k;
    public final d4 f16362l;

    public w3(d4 d4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c6 c6Var2, i9 i9Var, boolean z10, boolean z11, boolean z12, Context context2, a4 a4Var, boolean[] zArr) {
        super(context, c6Var, true);
        this.f16362l = d4Var;
        this.d = c6Var2;
        this.f16356e = i9Var;
        this.f16357f = z10;
        this.f16358g = z11;
        this.h = z12;
        this.f16359i = context2;
        this.f16360j = a4Var;
        this.f16361k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: lh.w3.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f16355c && !this.f16361k[0]) {
            AndroidUtilities.runOnUIThread(new p3(this, 0));
        }
        d4 d4Var = this.f16362l;
        d4Var.f15510p1 = null;
        d4Var.f15507o1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        b4 b4Var;
        boolean z11 = this.f16357f;
        d4 d4Var = this.f16362l;
        if (z11 && ((b4Var = d4Var.K1) == null || b4Var.f15375b == null)) {
            Context context = d4Var.getContext();
            qg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final g9.l lVar = new g9.l(19, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
            obj.f41454c = g1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f41452a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c3.setOnClickListener(new kr(swipeBack, 1));
            c3.c(-328966, -328966);
            c3.setSelectorColor(268435455);
            View dVar = new bh.d(context, 13);
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
            obj.f41453b = c1Var;
            c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            c1Var.setDrawShadow(false);
            c1Var.setBackgroundColor(-14540254);
            c1Var.setTextColor(-1);
            c1Var.setOnValueChange(new org.telegram.ui.b5(lVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, i7.f6.n(-1, 44));
            View dVar2 = new bh.d(context, 14);
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
            org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c6.c(-328966, -328966);
            c6.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            lVar.o(true, true, 0.2f);
                            return;
                        case 1:
                            lVar.o(true, true, 0.5f);
                            return;
                        case 2:
                            lVar.o(true, true, 1.0f);
                            return;
                        case 3:
                            lVar.o(true, true, 1.5f);
                            return;
                        default:
                            lVar.o(true, true, 2.0f);
                            return;
                    }
                }
            });
            c6.setSelectorColor(268435455);
            g1VarArr[0] = c6;
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
            c10.c(-328966, -328966);
            c10.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            lVar.o(true, true, 0.2f);
                            return;
                        case 1:
                            lVar.o(true, true, 0.5f);
                            return;
                        case 2:
                            lVar.o(true, true, 1.0f);
                            return;
                        case 3:
                            lVar.o(true, true, 1.5f);
                            return;
                        default:
                            lVar.o(true, true, 2.0f);
                            return;
                    }
                }
            });
            c10.setSelectorColor(268435455);
            g1VarArr[1] = c10;
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            lVar.o(true, true, 0.2f);
                            return;
                        case 1:
                            lVar.o(true, true, 0.5f);
                            return;
                        case 2:
                            lVar.o(true, true, 1.0f);
                            return;
                        case 3:
                            lVar.o(true, true, 1.5f);
                            return;
                        default:
                            lVar.o(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            g1VarArr[2] = c11;
            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
            c12.c(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            lVar.o(true, true, 0.2f);
                            return;
                        case 1:
                            lVar.o(true, true, 0.5f);
                            return;
                        case 2:
                            lVar.o(true, true, 1.0f);
                            return;
                        case 3:
                            lVar.o(true, true, 1.5f);
                            return;
                        default:
                            lVar.o(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            g1VarArr[3] = c12;
            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
            c13.c(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            lVar.o(true, true, 0.2f);
                            return;
                        case 1:
                            lVar.o(true, true, 0.5f);
                            return;
                        case 2:
                            lVar.o(true, true, 1.0f);
                            return;
                        case 3:
                            lVar.o(true, true, 1.5f);
                            return;
                        default:
                            lVar.o(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            g1VarArr[4] = c13;
            d4Var.f15546y3 = obj;
            obj.a(i9.f15739x1, true);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, d4Var.getContext(), this.d, false, false);
            d4Var.f15550z3 = g1Var;
            g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            d4.a0(d4Var, true);
            d4Var.f15550z3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            d4Var.f15550z3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d4Var.f15550z3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) d4Var.f15550z3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            d4Var.f15550z3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(d4Var.f15546y3.f41452a);
            org.telegram.ui.ActionBar.g1 g1Var2 = d4Var.f15550z3;
            g1Var2.C = new q3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            g1Var2.setOnClickListener(new m3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22705c = true;
            if (z10) {
                org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(d4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, this.d);
                l1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, i7.f6.n(-1, 8));
                return;
            }
            return;
        }
        d4Var.f15546y3 = null;
        d4Var.f15550z3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        d4 d4Var = this.f16362l;
        if (d4Var.f15548z1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(d4Var.f15545y2).getChat(Long.valueOf(-d4Var.f15540x1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(d4Var.f15545y2).getChatFull(chat.f22392id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(d4Var.f15545y2).loadChatInfo(chat.f22392id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new ih.u3(this, storyItem, this.f16356e, chat, 1));
            }
        }
    }
}
