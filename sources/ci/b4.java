package ci;

import ai.nd;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.vc;
import org.telegram.ui.c11;
import org.telegram.ui.pi0;
import org.telegram.ui.qf0;
import org.telegram.ui.sn;
import org.telegram.ui.w21;
import org.telegram.ui.x01;
import org.telegram.ui.xi0;
public final class b4 implements View.OnClickListener {
    public final int f5171a;
    public final Object f5172b;
    public final Object f5173c;
    public final Object d;
    public final Object e;

    public b4(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5171a = i10;
        this.f5172b = obj;
        this.f5173c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        ?? r22;
        FrameLayout container;
        float f7;
        int i10 = this.f5171a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f5173c;
        Object obj4 = this.f5172b;
        switch (i10) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                z9 z9Var = (z9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                p4 p4Var = ((g4) obj4).f5359l;
                g4 g4Var = p4Var.f5708t1;
                if (g4Var != null) {
                    g4Var.a();
                }
                storyItem.dialogId = p4Var.B1;
                storyItem.messageId = storyItem.f20578id;
                MessageObject messageObject = new MessageObject(p4Var.C2, storyItem);
                messageObject.generateThumbs(false);
                z9Var.H(new xi0(messageObject, false, chat.f20344id));
                return;
            case 1:
                gi.n nVar = (gi.n) obj4;
                sn snVar = (sn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (snVar != null) {
                    nVar.getClass();
                    snVar.O9(messageObject2, false, false);
                }
                pf.d.q(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ei.d dVar = (ei.d) obj;
                strArr[0] = ((gi.o1) obj3).f11391a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    gi.n1 n1Var = (gi.n1) obj5;
                    n1Var.f11381b.a(TextUtils.equals(n1Var.f11380a, strArr[0]), true);
                }
                if (strArr[0] != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a0Var.run(strArr2[0]);
                }
                h3Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((h80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                h80 F = h80.F(((org.telegram.ui.ActionBar.h3) obj4).getContainer(), (org.telegram.ui.ActionBar.g6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (hg.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f26929s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.b5) obj2).C(((int[]) obj4)[((org.telegram.ui.Components.m4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f20729a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                x01 x01Var = (x01) obj2;
                c11.U(x01Var.f43443a, x01Var.f43444b, ((org.telegram.ui.Components.j4) obj4).getValue() + 1, (((org.telegram.ui.Components.k4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.b3) obj).f20729a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.b5) obj2).C(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.b3) obj).f20729a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.n8) obj4).a();
                org.telegram.ui.Components.d5.k((Context) obj3, (org.telegram.ui.ActionBar.g6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.m8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                oc0 oc0Var = (oc0) obj2;
                pi0 pi0Var = (pi0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                oc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    pi0Var.e((MessageObject) arrayList2.get(0));
                }
                pi0Var.m(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                pi0 pi0Var2 = (pi0) obj;
                int i14 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        MessageObject messageObject4 = arrayList3.get(i15);
                        i15++;
                        messageObject4.messageOwner.invert_media = chatActivityEnterView2.R4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject3.messageOwner.invert_media = chatActivityEnterView2.R4;
                }
                chatActivityEnterView2.a0();
                pi0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                ri riVar = (ri) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = riVar.f30158j0;
                if (chatAttachAlertPhotoLayout != null) {
                    nd.h1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new ai.r5(13, riVar, e1Var), g6Var);
                    return;
                }
                return;
            case 13:
                p90 p90Var = (p90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                float[] fArr = p90Var.I;
                FrameLayout frameLayout = p90Var.f29520n;
                if (p90Var.f29522s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!p90Var.f29524x && p90Var.G) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                        e1Var2.j(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                        e1Var2.setOnClickListener(new i90(p90Var, 1));
                    }
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                    e1Var3.j(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.z5.n(-1, 48));
                    e1Var3.setOnClickListener(new i90(p90Var, 2));
                    if (!p90Var.F) {
                        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(context2, false, true);
                        r22 = 1;
                        e1Var4.j(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.k6.f21405p7;
                        e1Var4.d(org.telegram.ui.ActionBar.k6.x0(null, i16, false), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
                        e1Var4.setOnClickListener(new i90(p90Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var4, w7.z5.n(-1, 48));
                    } else {
                        r22 = 1;
                    }
                    if (h3Var2 == null) {
                        container = o2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = h3Var2.getContainer();
                    }
                    if (container != null) {
                        p90.a(frameLayout, container, fArr);
                        float f10 = fArr[r22];
                        ei.g6 g6Var2 = new ei.g6(p90Var, context2, container, 7);
                        org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(g6Var2, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(daVar);
                        container.addView(g6Var2, w7.z5.c(-1.0f, -1));
                        g6Var2.setAlpha(0.0f);
                        g6Var2.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        p90Var.f29522s = m1Var;
                        m1Var.setOnDismissListener(new l90(p90Var, g6Var2, container, daVar, 0));
                        boolean z11 = r22;
                        p90Var.f29522s.setOutsideTouchable(z11);
                        p90Var.f29522s.setFocusable(z11);
                        p90Var.f29522s.setBackgroundDrawable(new ColorDrawable(0));
                        p90Var.f29522s.setAnimationStyle(R.style.PopupContextAnimation);
                        p90Var.f29522s.setInputMethodMode(2);
                        p90Var.f29522s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new g90(p90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        p90Var.f29522s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                qf0 qf0Var = (qf0) obj4;
                h80 H = h80.H(qf0Var.v, qf0Var.f40807a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new h90(qf0Var, (String) obj3, (String) obj2, (String) obj, 25), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                h80 G = h80.G(((w21) obj4).container, (org.telegram.ui.ActionBar.g6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f26930t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                yh.o2 o2Var2 = (yh.o2) obj4;
                ai.y9 y9Var = (ai.y9) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList i17 = y9Var.i();
                int i18 = 0;
                while (true) {
                    if (i18 < i17.size()) {
                        if (((TL_stars.SavedStarGift) i17.get(i18)).gift.f20568id == o2Var2.f50912b) {
                            savedStarGift = (TL_stars.SavedStarGift) i17.get(i18);
                            i11 = i18;
                        } else {
                            i18++;
                        }
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i17.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = y9Var.f2511l;
                    arrayList4.removeAll(i17);
                    if (y9Var.e && !y9Var.f2505c) {
                        Collections.sort(arrayList4, new a4.d(4));
                    }
                    arrayList4.addAll(0, i17);
                    NotificationCenter.getInstance(y9Var.f2503a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(y9Var.f2504b), y9Var);
                    y9Var.n();
                    o2Var2.dismiss();
                    ((vc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, ai.l7.X1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, ai.l7.X1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public b4(org.telegram.ui.Components.n8 n8Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.m8 m8Var) {
        this.f5171a = 9;
        this.f5172b = n8Var;
        this.f5173c = context;
        this.d = g6Var;
        this.e = m8Var;
    }
}
