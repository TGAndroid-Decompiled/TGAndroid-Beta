package lh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import mh.ja;
import mh.l7;
import oh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.b11;
import org.telegram.ui.b30;
import org.telegram.ui.bj0;
import org.telegram.ui.g11;
import org.telegram.ui.r31;
import org.telegram.ui.ti0;
import org.telegram.ui.xf0;
import org.telegram.ui.xn;
public final class u3 implements View.OnClickListener {
    public final int f13018a;
    public final Object f13019b;
    public final Object f13020c;
    public final Object d;
    public final Object f13021e;

    public u3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f13018a = i10;
        this.f13019b = obj;
        this.f13020c = obj2;
        this.d = obj3;
        this.f13021e = obj4;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        char c3;
        FrameLayout container;
        float f10;
        int i10 = this.f13018a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        boolean z4 = true;
        Object obj = this.f13021e;
        Object obj2 = this.d;
        Object obj3 = this.f13020c;
        Object obj4 = this.f13019b;
        switch (i10) {
            case 0:
                w3 w3Var = (w3) obj4;
                l7 l7Var = (l7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = l7Var.h();
                int i12 = 0;
                while (true) {
                    if (i12 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i12)).gift.f21070id == w3Var.f13060b) {
                            savedStarGift = (TL_stars.SavedStarGift) h.get(i12);
                            i11 = i12;
                        } else {
                            i12++;
                        }
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    h.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = l7Var.f14405l;
                    arrayList.removeAll(h);
                    if (l7Var.f14399e && !l7Var.f14398c) {
                        Collections.sort(arrayList, new e5.f(19));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(l7Var.f14396a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.f14397b), l7Var);
                    l7Var.l();
                    w3Var.dismiss();
                    ((qc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, mh.g5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, mh.g5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                oh.f4 f4Var = ((oh.y3) obj4).f17950l;
                oh.y3 y3Var = f4Var.f17098q1;
                if (y3Var != null) {
                    y3Var.a();
                }
                storyItem.dialogId = f4Var.f17128y1;
                storyItem.messageId = storyItem.f21080id;
                MessageObject messageObject = new MessageObject(f4Var.f17133z2, storyItem);
                messageObject.generateThumbs(false);
                i9Var.H(new bj0(messageObject, false, chat.f20843id));
                return;
            case 2:
                ((VideoAds) obj4).lambda$show$7((q70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 3:
                q70 F = q70.F(((org.telegram.ui.ActionBar.h3) obj4).getContainer(), (g6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (l2) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f30329s = 0;
                F.Z();
                return;
            case 4:
                ((org.telegram.ui.Components.y4) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.c3) obj).f21207a.dismissRunnable;
                runnable.run();
                return;
            case 5:
                b11 b11Var = (b11) obj2;
                g11.U(b11Var.f35300a, b11Var.f35301b, ((org.telegram.ui.Components.f4) obj4).getValue() + 1, (((org.telegram.ui.Components.g4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.c3) obj).f21207a.dismissRunnable;
                runnable2.run();
                return;
            case 6:
                ((org.telegram.ui.Components.y4) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.d4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.c3) obj).f21207a.dismissRunnable;
                runnable3.run();
                return;
            case 7:
                ((h8) obj4).a();
                org.telegram.ui.Components.z4.k((Context) obj3, (g6) obj2, new org.telegram.ui.Components.t((g8) obj, 13));
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                xb0 xb0Var = (xb0) obj2;
                ti0 ti0Var = (ti0) obj;
                chatActivityEnterView.N4 = !chatActivityEnterView.N4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.N4;
                }
                xb0Var.a(!chatActivityEnterView.N4, true);
                if (!arrayList2.isEmpty()) {
                    ti0Var.f((MessageObject) arrayList2.get(0));
                }
                ti0Var.n(!chatActivityEnterView.N4);
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                ti0 ti0Var2 = (ti0) obj;
                int i14 = ChatActivityEnterView.f24568j5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        MessageObject messageObject3 = arrayList3.get(i15);
                        i15++;
                        messageObject3.messageOwner.invert_media = chatActivityEnterView2.N4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject2.messageOwner.invert_media = chatActivityEnterView2.N4;
                }
                chatActivityEnterView2.d0();
                ti0Var2.h(true);
                chatActivityEnterView2.N4 = false;
                return;
            case 10:
                mi miVar = (mi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                g6 g6Var = (g6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29054g0;
                if (chatAttachAlertPhotoLayout != null) {
                    ja.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new eh.w(14, miVar, g1Var), g6Var);
                    return;
                }
                return;
            case 11:
                y80 y80Var = (y80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                float[] fArr = y80Var.F;
                FrameLayout frameLayout = y80Var.f33409n;
                if (y80Var.f33411s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!y80Var.f33413x && y80Var.D) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.c6.n(-1, 48));
                        g1Var2.setOnClickListener(new r80(y80Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, k7.c6.n(-1, 48));
                    g1Var3.setOnClickListener(new r80(y80Var, 2));
                    if (!y80Var.C) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        c3 = 1;
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = k6.f21876p7;
                        g1Var4.c(k6.w0(null, i16, false), k6.w0(null, i16, false));
                        g1Var4.setOnClickListener(new r80(y80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, k7.c6.n(-1, 48));
                    } else {
                        c3 = 1;
                    }
                    if (h3Var == null) {
                        container = p2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = h3Var.getContainer();
                    }
                    if (container != null) {
                        y80.a(frameLayout, container, fArr);
                        float f11 = fArr[c3];
                        fg.i0 i0Var = new fg.i0(y80Var, context2, container, 6);
                        ba baVar = new ba(i0Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(baVar);
                        container.addView(i0Var, k7.c6.c(-1.0f, -1));
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        y80Var.f33411s = p1Var;
                        p1Var.setOnDismissListener(new u80(y80Var, i0Var, container, baVar, 0));
                        y80Var.f33411s.setOutsideTouchable(true);
                        y80Var.f33411s.setFocusable(true);
                        y80Var.f33411s.setBackgroundDrawable(new ColorDrawable(0));
                        y80Var.f33411s.setAnimationStyle(R.style.PopupContextAnimation);
                        y80Var.f33411s.setInputMethodMode(2);
                        y80Var.f33411s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new q80(y80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f11 += container.getPaddingTop();
                            f10 = 0.0f - container.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        y80Var.f33411s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (container.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                xf0 xf0Var = (xf0) obj4;
                q70 H = q70.H(xf0Var.v, xf0Var.f43043a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new b30(xf0Var, (String) obj3, (String) obj2, (String) obj, 12), false);
                H.V(5);
                H.Z();
                return;
            case 13:
                q70 G = q70.G(((r31) obj4).container, (g6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f30330t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            case 14:
                sh.l lVar = (sh.l) obj4;
                xn xnVar = (xn) obj3;
                MessageObject messageObject4 = (MessageObject) obj2;
                String str = (String) obj;
                if (xnVar != null) {
                    lVar.getClass();
                    xnVar.J9(messageObject4, false, false);
                }
                af.g.r(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 15:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                qh.d dVar = (qh.d) obj;
                strArr[0] = ((sh.h1) obj3).f47451a;
                int size2 = arrayList4.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj5 = arrayList4.get(i17);
                    i17++;
                    sh.g1 g1Var5 = (sh.g1) obj5;
                    g1Var5.f47440b.a(TextUtils.equals(g1Var5.f47439a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z4 = false;
                }
                dVar.setEnabled(z4);
                return;
            default:
                boolean[] zArr = (boolean[]) obj4;
                hg.c1 c1Var = (hg.c1) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c1Var.run(strArr2[0]);
                }
                h3Var2.dismiss();
                return;
        }
    }

    public u3(h8 h8Var, Context context, int i10, g6 g6Var, g8 g8Var) {
        this.f13018a = 7;
        this.f13019b = h8Var;
        this.f13020c = context;
        this.d = g6Var;
        this.f13021e = g8Var;
    }
}
