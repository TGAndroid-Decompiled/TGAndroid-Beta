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
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.qr;
public final class v5 extends zr {
    public boolean f1606c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final jc e;
    public final boolean f1607f;
    public final boolean f1608g;
    public final boolean h;
    public final Context f1609i;
    public final b6 f1610j;
    public final boolean[] f1611k;
    public final e6 f1612l;

    public v5(e6 e6Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d6 d6Var2, jc jcVar, boolean z10, boolean z11, boolean z12, Context context2, b6 b6Var, boolean[] zArr) {
        super(context, d6Var, true);
        this.f1612l = e6Var;
        this.d = d6Var2;
        this.e = jcVar;
        this.f1607f = z10;
        this.f1608g = z11;
        this.h = z12;
        this.f1609i = context2;
        this.f1610j = b6Var;
        this.f1611k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: ai.v5.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f1606c && !this.f1611k[0]) {
            AndroidUtilities.runOnUIThread(new m5(this, 0));
        }
        e6 e6Var = this.f1612l;
        e6Var.f827t1 = null;
        e6Var.f824s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        c6 c6Var;
        boolean z11 = this.f1607f;
        e6 e6Var = this.f1612l;
        if (z11 && ((c6Var = e6Var.O1) == null || c6Var.f643b == null)) {
            Context context = e6Var.getContext();
            gh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final of.b bVar = new of.b(2, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[5];
            obj.f38799c = e1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f38797a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new qr(swipeBack, 1));
            c10.c(-328966, -328966);
            c10.setSelectorColor(268435455);
            View w5Var = new w5(context, 12);
            w5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            w5Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(w5Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w5Var.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            w5Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(context, null);
            obj.f38798b = a1Var;
            a1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            a1Var.setDrawShadow(false);
            a1Var.setBackgroundColor(-14540254);
            a1Var.setTextColor(-1);
            a1Var.setOnValueChange(new org.telegram.ui.b5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a1Var, w7.y5.n(-1, 44));
            View w5Var2 = new w5(context, 13);
            w5Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            w5Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(w5Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) w5Var2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            w5Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
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
            e1VarArr[0] = c11;
            org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
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
            e1VarArr[1] = c12;
            org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
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
            e1VarArr[2] = c13;
            org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
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
            e1VarArr[3] = c14;
            org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
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
            e1VarArr[4] = c15;
            e6Var.C3 = obj;
            obj.a(jc.B1, true);
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, e6Var.getContext(), this.d, false, false);
            e6Var.D3 = e1Var;
            e1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            e6.a0(e6Var, true);
            e6Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            e6Var.D3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e6Var.D3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) e6Var.D3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            e6Var.D3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(e6Var.C3.f38797a);
            org.telegram.ui.ActionBar.e1 e1Var2 = e6Var.D3;
            e1Var2.G = new n5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            e1Var2.setOnClickListener(new i5(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f18653c = true;
            if (z10) {
                org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(e6Var.getContext(), org.telegram.ui.ActionBar.h6.H8, this.d);
                j1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.y5.n(-1, 8));
                return;
            }
            return;
        }
        e6Var.C3 = null;
        e6Var.D3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        e6 e6Var = this.f1612l;
        if (e6Var.D1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-e6Var.B1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(e6Var.C2).getChatFull(chat.f18335id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(e6Var.C2).loadChatInfo(chat.f18335id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new o5(this, storyItem, this.e, chat, 0));
            }
        }
    }
}
