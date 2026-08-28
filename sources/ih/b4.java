package ih;

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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.kr;
public final class b4 extends nr {
    public boolean f11261c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final m9 f11262e;
    public final boolean f11263f;
    public final boolean f11264g;
    public final boolean h;
    public final Context f11265i;
    public final f4 f11266j;
    public final boolean[] f11267k;
    public final i4 f11268l;

    public b4(i4 i4Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.b6 b6Var2, m9 m9Var, boolean z10, boolean z11, boolean z12, Context context2, f4 f4Var, boolean[] zArr) {
        super(context, b6Var, true);
        this.f11268l = i4Var;
        this.d = b6Var2;
        this.f11262e = m9Var;
        this.f11263f = z10;
        this.f11264g = z11;
        this.h = z12;
        this.f11265i = context2;
        this.f11266j = f4Var;
        this.f11267k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: ih.b4.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f11261c && !this.f11267k[0]) {
            AndroidUtilities.runOnUIThread(new u3(this, 0));
        }
        i4 i4Var = this.f11268l;
        i4Var.f11574p1 = null;
        i4Var.f11571o1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        g4 g4Var;
        boolean z11 = this.f11263f;
        i4 i4Var = this.f11268l;
        if (z11 && ((g4Var = i4Var.K1) == null || g4Var.f11467b == null)) {
            Context context = i4Var.getContext();
            fg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final g5.b bVar = new g5.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 10);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
            obj.f41585c = g1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f41583a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new kr(swipeBack, 1));
            c10.c(-328966, -328966);
            c10.setSelectorColor(268435455);
            View gVar = new dh.g(context, 11);
            gVar.setMinimumWidth(AndroidUtilities.dp(196.0f));
            gVar.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(gVar);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gVar.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            gVar.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
            obj.f41584b = c1Var;
            c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            c1Var.setDrawShadow(false);
            c1Var.setBackgroundColor(-14540254);
            c1Var.setTextColor(-1);
            c1Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, g7.e6.n(-1, 44));
            View gVar2 = new dh.g(context, 12);
            gVar2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            gVar2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(gVar2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) gVar2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            gVar2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            bVar.r(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.r(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.r(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.r(true, true, 1.5f);
                            return;
                        default:
                            bVar.r(true, true, 2.0f);
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
                            bVar.r(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.r(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.r(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.r(true, true, 1.5f);
                            return;
                        default:
                            bVar.r(true, true, 2.0f);
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
                            bVar.r(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.r(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.r(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.r(true, true, 1.5f);
                            return;
                        default:
                            bVar.r(true, true, 2.0f);
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
                            bVar.r(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.r(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.r(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.r(true, true, 1.5f);
                            return;
                        default:
                            bVar.r(true, true, 2.0f);
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
                            bVar.r(true, true, 0.2f);
                            return;
                        case 1:
                            bVar.r(true, true, 0.5f);
                            return;
                        case 2:
                            bVar.r(true, true, 1.0f);
                            return;
                        case 3:
                            bVar.r(true, true, 1.5f);
                            return;
                        default:
                            bVar.r(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            g1VarArr[4] = c15;
            i4Var.f11610y3 = obj;
            obj.a(m9.f11780x1, true);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, i4Var.getContext(), this.d, false, false);
            i4Var.f11614z3 = g1Var;
            g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            i4.a0(i4Var, true);
            i4Var.f11614z3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            i4Var.f11614z3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(i4Var.f11614z3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) i4Var.f11614z3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            i4Var.f11614z3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(i4Var.f11610y3.f41583a);
            org.telegram.ui.ActionBar.g1 g1Var2 = i4Var.f11614z3;
            g1Var2.C = new w3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            g1Var2.setOnClickListener(new q3(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22693c = true;
            if (z10) {
                org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(i4Var.getContext(), org.telegram.ui.ActionBar.f6.H8, this.d);
                l1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, g7.e6.n(-1, 8));
                return;
            }
            return;
        }
        i4Var.f11610y3 = null;
        i4Var.f11614z3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        i4 i4Var = this.f11268l;
        if (i4Var.f11612z1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(i4Var.f11609y2).getChat(Long.valueOf(-i4Var.f11604x1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i4Var.f11609y2).getChatFull(chat.f22380id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(i4Var.f11609y2).loadChatInfo(chat.f22380id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new fh.g4(this, storyItem, this.f11262e, chat, 1));
            }
        }
    }
}
