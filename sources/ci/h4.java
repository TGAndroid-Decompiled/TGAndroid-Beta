package ci;

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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.kr;
public final class h4 extends hs {
    public boolean f5457c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final aa e;
    public final boolean f5458f;
    public final boolean f5459g;
    public final boolean h;
    public final Context f5460i;
    public final n4 f5461j;
    public final boolean[] f5462k;
    public final q4 f5463l;

    public h4(q4 q4Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d6 d6Var2, aa aaVar, boolean z10, boolean z11, boolean z12, Context context2, n4 n4Var, boolean[] zArr) {
        super(context, d6Var, true);
        this.f5463l = q4Var;
        this.d = d6Var2;
        this.e = aaVar;
        this.f5458f = z10;
        this.f5459g = z11;
        this.h = z12;
        this.f5460i = context2;
        this.f5461j = n4Var;
        this.f5462k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: ci.h4.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f5457c && !this.f5462k[0]) {
            AndroidUtilities.runOnUIThread(new a4(this, 0));
        }
        q4 q4Var = this.f5463l;
        q4Var.f5823t1 = null;
        q4Var.f5820s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        o4 o4Var;
        boolean z11 = this.f5458f;
        q4 q4Var = this.f5463l;
        if (z11 && ((o4Var = q4Var.O1) == null || o4Var.f5691b == null)) {
            Context context = q4Var.getContext();
            ph0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final n4.s sVar = new n4.s(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 12);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[5];
            obj.f40230c = e1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f40228a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new kr(swipeBack, 1));
            c10.c(-328966, -328966);
            c10.setSelectorColor(268435455);
            View i4Var = new i4(context, 12);
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
            org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(context, null);
            obj.f40229b = a1Var;
            a1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            a1Var.setDrawShadow(false);
            a1Var.setBackgroundColor(-14540254);
            a1Var.setTextColor(-1);
            a1Var.setOnValueChange(new org.telegram.ui.g5(sVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a1Var, w7.z5.n(-1, 44));
            View i4Var2 = new i4(context, 13);
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
            org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            sVar.F(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.F(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.F(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.F(true, true, 1.5f);
                            return;
                        default:
                            sVar.F(true, true, 2.0f);
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
                    switch (r1) {
                        case 0:
                            sVar.F(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.F(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.F(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.F(true, true, 1.5f);
                            return;
                        default:
                            sVar.F(true, true, 2.0f);
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
                    switch (r1) {
                        case 0:
                            sVar.F(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.F(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.F(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.F(true, true, 1.5f);
                            return;
                        default:
                            sVar.F(true, true, 2.0f);
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
                    switch (r1) {
                        case 0:
                            sVar.F(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.F(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.F(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.F(true, true, 1.5f);
                            return;
                        default:
                            sVar.F(true, true, 2.0f);
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
                    switch (r1) {
                        case 0:
                            sVar.F(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.F(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.F(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.F(true, true, 1.5f);
                            return;
                        default:
                            sVar.F(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            e1VarArr[4] = c15;
            q4Var.C3 = obj;
            obj.a(aa.B1, true);
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, q4Var.getContext(), this.d, false, false);
            q4Var.D3 = e1Var;
            e1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            q4.a0(q4Var, true);
            q4Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            q4Var.D3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(q4Var.D3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) q4Var.D3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            q4Var.D3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(q4Var.C3.f40228a);
            org.telegram.ui.ActionBar.e1 e1Var2 = q4Var.D3;
            e1Var2.G = new b4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            e1Var2.setOnClickListener(new w3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f20593c = true;
            if (z10) {
                org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(q4Var.getContext(), org.telegram.ui.ActionBar.h6.H8, this.d);
                j1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
                return;
            }
            return;
        }
        q4Var.C3 = null;
        q4Var.D3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        q4 q4Var = this.f5463l;
        if (q4Var.D1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(q4Var.C2).getChatFull(chat.f20272id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(q4Var.C2).loadChatInfo(chat.f20272id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new c4(this, storyItem, this.e, chat, 0));
            }
        }
    }
}
