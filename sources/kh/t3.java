package kh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import lh.ja;
import lh.l7;
import nh.i9;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.c30;
import org.telegram.ui.cj0;
import org.telegram.ui.g11;
import org.telegram.ui.l11;
import org.telegram.ui.ui0;
import org.telegram.ui.w31;
import org.telegram.ui.yf0;
import org.telegram.ui.zn;
public final class t3 implements View.OnClickListener {
    public final int f10934a;
    public final Object f10935b;
    public final Object f10936c;
    public final Object d;
    public final Object e;

    public t3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10934a = i10;
        this.f10935b = obj;
        this.f10936c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        char c3;
        FrameLayout container;
        float f10;
        int i10 = this.f10934a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        boolean z4 = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f10936c;
        Object obj4 = this.f10935b;
        switch (i10) {
            case 0:
                v3 v3Var = (v3) obj4;
                l7 l7Var = (l7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = l7Var.h();
                int i12 = 0;
                while (true) {
                    if (i12 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i12)).gift.f19384id == v3Var.f11005b) {
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
                    ArrayList arrayList = l7Var.f12756l;
                    arrayList.removeAll(h);
                    if (l7Var.e && !l7Var.f12750c) {
                        Collections.sort(arrayList, new e5.e(19));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(l7Var.f12748a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.f12749b), l7Var);
                    l7Var.l();
                    v3Var.dismiss();
                    ((qc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, lh.g5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, lh.g5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                nh.d4 d4Var = ((nh.w3) obj4).f16007l;
                nh.w3 w3Var = d4Var.f15208q1;
                if (w3Var != null) {
                    w3Var.a();
                }
                storyItem.dialogId = d4Var.f15238y1;
                storyItem.messageId = storyItem.f19394id;
                MessageObject messageObject = new MessageObject(d4Var.f15243z2, storyItem);
                messageObject.generateThumbs(false);
                i9Var.H(new cj0(messageObject, false, chat.f19159id));
                return;
            case 2:
                ((VideoAds) obj4).lambda$show$7((p70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 3:
                p70 F = p70.F(((org.telegram.ui.ActionBar.g3) obj4).getContainer(), (f6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (l2) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f27777s = 0;
                F.Z();
                return;
            case 4:
                ((org.telegram.ui.Components.y4) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f19500a.dismissRunnable;
                runnable.run();
                return;
            case 5:
                g11 g11Var = (g11) obj2;
                l11.U(g11Var.f34287a, g11Var.f34288b, ((org.telegram.ui.Components.f4) obj4).getValue() + 1, (((org.telegram.ui.Components.g4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.b3) obj).f19500a.dismissRunnable;
                runnable2.run();
                return;
            case 6:
                ((org.telegram.ui.Components.y4) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.d4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.b3) obj).f19500a.dismissRunnable;
                runnable3.run();
                return;
            case 7:
                ((h8) obj4).a();
                org.telegram.ui.Components.z4.k((Context) obj3, (f6) obj2, new org.telegram.ui.Components.t((g8) obj, 13));
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                wb0 wb0Var = (wb0) obj2;
                ui0 ui0Var = (ui0) obj;
                chatActivityEnterView.N4 = !chatActivityEnterView.N4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.N4;
                }
                wb0Var.a(!chatActivityEnterView.N4, true);
                if (!arrayList2.isEmpty()) {
                    ui0Var.f((MessageObject) arrayList2.get(0));
                }
                ui0Var.n(!chatActivityEnterView.N4);
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                ui0 ui0Var2 = (ui0) obj;
                int i14 = ChatActivityEnterView.f22702j5;
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
                ui0Var2.h(true);
                chatActivityEnterView2.N4 = false;
                return;
            case 10:
                li liVar = (li) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                f6 f6Var = (f6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
                if (chatAttachAlertPhotoLayout != null) {
                    ja.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new dh.v(14, liVar, g1Var), f6Var);
                    return;
                }
                return;
            case 11:
                x80 x80Var = (x80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                float[] fArr = x80Var.F;
                FrameLayout frameLayout = x80Var.f30537n;
                if (x80Var.f30539s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!x80Var.f30541x && x80Var.D) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
                        g1Var2.setOnClickListener(new q80(x80Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, k7.b6.n(-1, 48));
                    g1Var3.setOnClickListener(new q80(x80Var, 2));
                    if (!x80Var.C) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        c3 = 1;
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = j6.f20097p7;
                        g1Var4.c(j6.w0(null, i16, false), j6.w0(null, i16, false));
                        g1Var4.setOnClickListener(new q80(x80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, k7.b6.n(-1, 48));
                    } else {
                        c3 = 1;
                    }
                    if (g3Var == null) {
                        container = p2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = g3Var.getContainer();
                    }
                    if (container != null) {
                        x80.a(frameLayout, container, fArr);
                        float f11 = fArr[c3];
                        eg.i0 i0Var = new eg.i0(x80Var, context2, container, 6);
                        aa aaVar = new aa(i0Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(aaVar);
                        container.addView(i0Var, k7.b6.c(-1.0f, -1));
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        x80Var.f30539s = p1Var;
                        p1Var.setOnDismissListener(new t80(x80Var, i0Var, container, aaVar, 0));
                        x80Var.f30539s.setOutsideTouchable(true);
                        x80Var.f30539s.setFocusable(true);
                        x80Var.f30539s.setBackgroundDrawable(new ColorDrawable(0));
                        x80Var.f30539s.setAnimationStyle(R.style.PopupContextAnimation);
                        x80Var.f30539s.setInputMethodMode(2);
                        x80Var.f30539s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new p80(x80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f11 += container.getPaddingTop();
                            f10 = 0.0f - container.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        x80Var.f30539s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (container.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                yf0 yf0Var = (yf0) obj4;
                p70 H = p70.H(yf0Var.v, yf0Var.f40259a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new c30(yf0Var, (String) obj3, (String) obj2, (String) obj, 12), false);
                H.V(5);
                H.Z();
                return;
            case 13:
                p70 G = p70.G(((w31) obj4).container, (f6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f27778t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            case 14:
                rh.l lVar = (rh.l) obj4;
                zn znVar = (zn) obj3;
                MessageObject messageObject4 = (MessageObject) obj2;
                String str = (String) obj;
                if (znVar != null) {
                    lVar.getClass();
                    znVar.J9(messageObject4, false, false);
                }
                ze.d.r(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 15:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                ph.d dVar = (ph.d) obj;
                strArr[0] = ((rh.h1) obj3).f43611a;
                int size2 = arrayList4.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj5 = arrayList4.get(i17);
                    i17++;
                    rh.g1 g1Var5 = (rh.g1) obj5;
                    g1Var5.f43601b.a(TextUtils.equals(g1Var5.f43600a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z4 = false;
                }
                dVar.setEnabled(z4);
                return;
            default:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a0Var.run(strArr2[0]);
                }
                g3Var2.dismiss();
                return;
        }
    }

    public t3(h8 h8Var, Context context, int i10, f6 f6Var, g8 g8Var) {
        this.f10934a = 7;
        this.f10935b = h8Var;
        this.f10936c = context;
        this.d = f6Var;
        this.e = g8Var;
    }
}
