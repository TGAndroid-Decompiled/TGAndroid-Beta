package di;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.nr;
public final class h4 extends js {
    public boolean f8620c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final y9 e;
    public final boolean f8621f;
    public final boolean f8622g;
    public final boolean h;
    public final Context f8623i;
    public final n4 f8624j;
    public final boolean[] f8625k;
    public final q4 f8626l;

    public h4(q4 q4Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.u6 u6Var2, y9 y9Var, boolean z10, boolean z11, boolean z12, Context context2, n4 n4Var, boolean[] zArr) {
        super(context, u6Var, true);
        this.f8626l = q4Var;
        this.d = u6Var2;
        this.e = y9Var;
        this.f8621f = z10;
        this.f8622g = z11;
        this.h = z12;
        this.f8623i = context2;
        this.f8624j = n4Var;
        this.f8625k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.h4.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f8620c && !this.f8625k[0]) {
            AndroidUtilities.runOnUIThread(new z3(this, 0));
        }
        q4 q4Var = this.f8626l;
        q4Var.f8988i1 = null;
        q4Var.f8985h1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        o4 o4Var;
        boolean z11 = this.f8621f;
        q4 q4Var = this.f8626l;
        if (z11 && ((o4Var = q4Var.D1) == null || o4Var.f8872b == null)) {
            Context context = q4Var.getContext();
            sh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final rf.b bVar = new rf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 16);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
            obj.f43579c = g1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f43577a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new nr(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View i4Var = new i4(context, 11);
            i4Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            i4Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i4Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i4Var.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            i4Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
            obj.f43578b = c1Var;
            c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            c1Var.setDrawShadow(false);
            c1Var.setBackgroundColor(-14540254);
            c1Var.setTextColor(-1);
            c1Var.setOnValueChange(new org.telegram.ui.e5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, gb1.r(-1, 44));
            View i4Var2 = new i4(context, 12);
            i4Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            i4Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i4Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) i4Var2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            i4Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.d(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            g1VarArr[0] = c11;
            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
            c12.d(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            g1VarArr[1] = c12;
            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
            c13.d(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            g1VarArr[2] = c13;
            org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
            c14.d(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            g1VarArr[3] = c14;
            org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
            c15.d(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.N(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.N(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.N(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.N(true, true, 1.5f);
                            return;
                        default:
                            bVar.N(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            g1VarArr[4] = c15;
            q4Var.f9022r3 = obj;
            obj.a(y9.B1, true);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, q4Var.getContext(), this.d, false, false);
            q4Var.f9026s3 = g1Var;
            g1Var.j(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            q4.Y(q4Var, true);
            q4Var.f9026s3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            q4Var.f9026s3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(q4Var.f9026s3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) q4Var.f9026s3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            q4Var.f9026s3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(q4Var.f9022r3.f43577a);
            org.telegram.ui.ActionBar.g1 g1Var2 = q4Var.f9026s3;
            g1Var2.P = new a4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            g1Var2.setOnClickListener(new v3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22360c = true;
            if (z10) {
                org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(q4Var.getContext(), org.telegram.ui.ActionBar.y6.H8, this.d);
                l1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, gb1.r(-1, 8));
                return;
            }
            return;
        }
        q4Var.f9022r3 = null;
        q4Var.f9026s3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        q4 q4Var = this.f8626l;
        if (q4Var.f9024s1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(q4Var.f9021r2).getChat(Long.valueOf(-q4Var.f9016q1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(q4Var.f9021r2).getChatFull(chat.f22027id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(q4Var.f9021r2).loadChatInfo(chat.f22027id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new c4(this, storyItem, this.e, chat, 0));
            }
        }
    }
}
