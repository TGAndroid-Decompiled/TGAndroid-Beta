package bi;

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
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.wr;
public final class f5 extends wr {
    public boolean f2992c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final pb f2993e;
    public final boolean f2994f;
    public final boolean f2995g;
    public final boolean h;
    public final Context f2996i;
    public final l5 f2997j;
    public final boolean[] f2998k;
    public final o5 f2999l;

    public f5(o5 o5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f6 f6Var2, pb pbVar, boolean z10, boolean z11, boolean z12, Context context2, l5 l5Var, boolean[] zArr) {
        super(context, f6Var, true);
        this.f2999l = o5Var;
        this.d = f6Var2;
        this.f2993e = pbVar;
        this.f2994f = z10;
        this.f2995g = z11;
        this.h = z12;
        this.f2996i = context2;
        this.f2997j = l5Var;
        this.f2998k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: bi.f5.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f2992c && !this.f2998k[0]) {
            AndroidUtilities.runOnUIThread(new x4(this, 0));
        }
        o5 o5Var = this.f2999l;
        o5Var.f3487t1 = null;
        o5Var.f3484s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        m5 m5Var;
        boolean z11 = this.f2994f;
        o5 o5Var = this.f2999l;
        if (z11 && ((m5Var = o5Var.O1) == null || m5Var.f3338b == null)) {
            Context context = o5Var.getContext();
            ug0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final pf.b bVar = new pf.b(5, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[5];
            obj.f34944c = f1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f34942a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new org.telegram.ui.wr(swipeBack, 1));
            c10.c(-328966, -328966);
            c10.setSelectorColor(268435455);
            View g5Var = new g5(context, 12);
            g5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            g5Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(g5Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g5Var.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            g5Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(context, null);
            obj.f34943b = b1Var;
            b1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            b1Var.setDrawShadow(false);
            b1Var.setBackgroundColor(-14540254);
            b1Var.setTextColor(-1);
            b1Var.setOnValueChange(new org.telegram.ui.b5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b1Var, w7.x5.n(-1, 44));
            View g5Var2 = new g5(context, 13);
            g5Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            g5Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(g5Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g5Var2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            g5Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.c0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.c0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.c0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.c0(true, true, 1.5f);
                            return;
                        default:
                            bVar.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            f1VarArr[0] = c11;
            org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
            c12.c(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.c0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.c0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.c0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.c0(true, true, 1.5f);
                            return;
                        default:
                            bVar.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            f1VarArr[1] = c12;
            org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
            c13.c(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.c0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.c0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.c0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.c0(true, true, 1.5f);
                            return;
                        default:
                            bVar.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            f1VarArr[2] = c13;
            org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
            c14.c(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.c0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.c0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.c0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.c0(true, true, 1.5f);
                            return;
                        default:
                            bVar.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            f1VarArr[3] = c14;
            org.telegram.ui.ActionBar.f1 c15 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
            c15.c(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.c0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.c0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.c0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.c0(true, true, 1.5f);
                            return;
                        default:
                            bVar.c0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            f1VarArr[4] = c15;
            o5Var.C3 = obj;
            obj.a(pb.B1, true);
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, o5Var.getContext(), this.d, false, false);
            o5Var.D3 = f1Var;
            f1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            o5.a0(o5Var, true);
            o5Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            o5Var.D3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(o5Var.D3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) o5Var.D3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            o5Var.D3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(o5Var.C3.f34942a);
            org.telegram.ui.ActionBar.f1 f1Var2 = o5Var.D3;
            f1Var2.G = new y4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            f1Var2.setOnClickListener(new t4(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f20216c = true;
            if (z10) {
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(o5Var.getContext(), org.telegram.ui.ActionBar.j6.H8, this.d);
                k1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
                return;
            }
            return;
        }
        o5Var.C3 = null;
        o5Var.D3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        o5 o5Var = this.f2999l;
        if (o5Var.D1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(o5Var.C2).getChatFull(chat.f19896id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(o5Var.C2).loadChatInfo(chat.f19896id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new z4(this, storyItem, this.f2993e, chat, 0));
            }
        }
    }
}
