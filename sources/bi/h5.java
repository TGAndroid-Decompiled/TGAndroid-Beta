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
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.zr;
public final class h5 extends ks {
    public boolean f3120c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final sb e;
    public final boolean f3121f;
    public final boolean f3122g;
    public final boolean h;
    public final Context f3123i;
    public final n5 f3124j;
    public final boolean[] f3125k;
    public final q5 f3126l;

    public h5(q5 q5Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c6 c6Var2, sb sbVar, boolean z10, boolean z11, boolean z12, Context context2, n5 n5Var, boolean[] zArr) {
        super(context, c6Var, true);
        this.f3126l = q5Var;
        this.d = c6Var2;
        this.e = sbVar;
        this.f3121f = z10;
        this.f3122g = z11;
        this.h = z12;
        this.f3123i = context2;
        this.f3124j = n5Var;
        this.f3125k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h5.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f3120c && !this.f3125k[0]) {
            AndroidUtilities.runOnUIThread(new z4(this, 0));
        }
        q5 q5Var = this.f3126l;
        q5Var.f3567t1 = null;
        q5Var.f3564s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        o5 o5Var;
        boolean z11 = this.f3121f;
        q5 q5Var = this.f3126l;
        if (z11 && ((o5Var = q5Var.O1) == null || o5Var.f3418b == null)) {
            Context context = q5Var.getContext();
            vh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final qf.b bVar = new qf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 7);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[5];
            obj.f35372c = e1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f35370a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new zr(swipeBack, 1));
            c10.c(-328966, -328966);
            c10.setSelectorColor(268435455);
            View i5Var = new i5(context, 12);
            i5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            i5Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i5Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i5Var.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            i5Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(context, null);
            obj.f35371b = a1Var;
            a1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            a1Var.setDrawShadow(false);
            a1Var.setBackgroundColor(-14540254);
            a1Var.setTextColor(-1);
            a1Var.setOnValueChange(new org.telegram.ui.f5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a1Var, w7.z5.n(-1, 44));
            View i5Var2 = new i5(context, 13);
            i5Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            i5Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i5Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) i5Var2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            i5Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.b0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.b0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.b0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.b0(true, true, 1.5f);
                            return;
                        default:
                            bVar.b0(true, true, 2.0f);
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
                            bVar.b0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.b0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.b0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.b0(true, true, 1.5f);
                            return;
                        default:
                            bVar.b0(true, true, 2.0f);
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
                            bVar.b0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.b0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.b0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.b0(true, true, 1.5f);
                            return;
                        default:
                            bVar.b0(true, true, 2.0f);
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
                            bVar.b0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.b0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.b0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.b0(true, true, 1.5f);
                            return;
                        default:
                            bVar.b0(true, true, 2.0f);
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
                            bVar.b0(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.b0(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.b0(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.b0(true, true, 1.5f);
                            return;
                        default:
                            bVar.b0(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            e1VarArr[4] = c15;
            q5Var.C3 = obj;
            obj.a(sb.B1, true);
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, q5Var.getContext(), this.d, false, false);
            q5Var.D3 = e1Var;
            e1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            q5.a0(q5Var, true);
            q5Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            q5Var.D3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(q5Var.D3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) q5Var.D3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            q5Var.D3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(q5Var.C3.f35370a);
            org.telegram.ui.ActionBar.e1 e1Var2 = q5Var.D3;
            e1Var2.G = new a5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            e1Var2.setOnClickListener(new v4(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f19240c = true;
            if (z10) {
                org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(q5Var.getContext(), org.telegram.ui.ActionBar.g6.H8, this.d);
                j1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
                return;
            }
            return;
        }
        q5Var.C3 = null;
        q5Var.D3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        q5 q5Var = this.f3126l;
        if (q5Var.D1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(q5Var.C2).getChatFull(chat.f18916id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(q5Var.C2).loadChatInfo(chat.f18916id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new b5(this, storyItem, this.e, chat, 0));
            }
        }
    }
}
