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
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.kr;
public final class g4 extends fs {
    public boolean f5353c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final z9 e;
    public final boolean f5354f;
    public final boolean f5355g;
    public final boolean h;
    public final Context f5356i;
    public final m4 f5357j;
    public final boolean[] f5358k;
    public final p4 f5359l;

    public g4(p4 p4Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.g6 g6Var2, z9 z9Var, boolean z10, boolean z11, boolean z12, Context context2, m4 m4Var, boolean[] zArr) {
        super(context, g6Var, true);
        this.f5359l = p4Var;
        this.d = g6Var2;
        this.e = z9Var;
        this.f5354f = z10;
        this.f5355g = z11;
        this.h = z12;
        this.f5356i = context2;
        this.f5357j = m4Var;
        this.f5358k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: ci.g4.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f5353c && !this.f5358k[0]) {
            AndroidUtilities.runOnUIThread(new z3(this, 0));
        }
        p4 p4Var = this.f5359l;
        p4Var.f5708t1 = null;
        p4Var.f5705s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        n4 n4Var;
        boolean z11 = this.f5354f;
        p4 p4Var = this.f5359l;
        if (z11 && ((n4Var = p4Var.O1) == null || n4Var.f5596b == null)) {
            Context context = p4Var.getContext();
            sh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final n4.s sVar = new n4.s(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 12);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[5];
            obj.f40623c = e1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f40621a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new kr(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View h4Var = new h4(context, 12);
            h4Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            h4Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(h4Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h4Var.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            h4Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(context, null);
            obj.f40622b = a1Var;
            a1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            a1Var.setDrawShadow(false);
            a1Var.setBackgroundColor(-14540254);
            a1Var.setTextColor(-1);
            a1Var.setOnValueChange(new org.telegram.ui.f5(sVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a1Var, w7.z5.n(-1, 44));
            View h4Var2 = new h4(context, 13);
            h4Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            h4Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(h4Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) h4Var2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            h4Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.d(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            sVar.A(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.A(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.A(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.A(true, true, 1.5f);
                            return;
                        default:
                            sVar.A(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            e1VarArr[0] = c11;
            org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
            c12.d(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            sVar.A(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.A(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.A(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.A(true, true, 1.5f);
                            return;
                        default:
                            sVar.A(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            e1VarArr[1] = c12;
            org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
            c13.d(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            sVar.A(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.A(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.A(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.A(true, true, 1.5f);
                            return;
                        default:
                            sVar.A(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            e1VarArr[2] = c13;
            org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
            c14.d(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            sVar.A(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.A(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.A(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.A(true, true, 1.5f);
                            return;
                        default:
                            sVar.A(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            e1VarArr[3] = c14;
            org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
            c15.d(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r1) {
                        case 0:
                            sVar.A(true, true, 0.2f);
                            return;
                        case 1:
                            sVar.A(true, true, 0.5f);
                            return;
                        case 2:
                            sVar.A(true, true, 1.0f);
                            return;
                        case 3:
                            sVar.A(true, true, 1.5f);
                            return;
                        default:
                            sVar.A(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            e1VarArr[4] = c15;
            p4Var.C3 = obj;
            obj.a(z9.B1, true);
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, p4Var.getContext(), this.d, false, false);
            p4Var.D3 = e1Var;
            e1Var.j(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            p4.Z(p4Var, true);
            p4Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            p4Var.D3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p4Var.D3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) p4Var.D3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            p4Var.D3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(p4Var.C3.f40621a);
            org.telegram.ui.ActionBar.e1 e1Var2 = p4Var.D3;
            e1Var2.P = new a4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            e1Var2.setOnClickListener(new v3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f20671c = true;
            if (z10) {
                org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(p4Var.getContext(), org.telegram.ui.ActionBar.k6.H8, this.d);
                j1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
                return;
            }
            return;
        }
        p4Var.C3 = null;
        p4Var.D3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        p4 p4Var = this.f5359l;
        if (p4Var.D1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-p4Var.B1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(p4Var.C2).getChatFull(chat.f20344id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(p4Var.C2).loadChatInfo(chat.f20344id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new b4(this, storyItem, this.e, chat, 0));
            }
        }
    }
}
