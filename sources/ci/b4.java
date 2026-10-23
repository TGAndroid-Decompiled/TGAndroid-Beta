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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xc;
import org.telegram.ui.d11;
import org.telegram.ui.qi0;
import org.telegram.ui.rf0;
import org.telegram.ui.sn;
import org.telegram.ui.x21;
import org.telegram.ui.y01;
import org.telegram.ui.yi0;
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
                storyItem.messageId = storyItem.f20577id;
                MessageObject messageObject = new MessageObject(p4Var.C2, storyItem);
                messageObject.generateThumbs(false);
                z9Var.H(new yi0(messageObject, false, chat.f20343id));
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
                ((VideoAds) obj4).lambda$show$7((j80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                j80 F = j80.F(((org.telegram.ui.ActionBar.h3) obj4).getContainer(), (org.telegram.ui.ActionBar.g6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (hg.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f27580s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.d5) obj2).C(((int[]) obj4)[((org.telegram.ui.Components.n4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f20728a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                y01 y01Var = (y01) obj2;
                d11.U(y01Var.f43681a, y01Var.f43682b, ((org.telegram.ui.Components.k4) obj4).getValue() + 1, (((org.telegram.ui.Components.l4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.b3) obj).f20728a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.d5) obj2).C(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.b3) obj).f20728a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.p8) obj4).a();
                org.telegram.ui.Components.f5.k((Context) obj3, (org.telegram.ui.ActionBar.g6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.o8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                qc0 qc0Var = (qc0) obj2;
                qi0 qi0Var = (qi0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                qc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    qi0Var.e((MessageObject) arrayList2.get(0));
                }
                qi0Var.m(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                qi0 qi0Var2 = (qi0) obj;
                int i14 = ChatActivityEnterView.f24050r5;
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
                qi0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                ti tiVar = (ti) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30742j0;
                if (chatAttachAlertPhotoLayout != null) {
                    nd.h1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new ai.r5(13, tiVar, e1Var), g6Var);
                    return;
                }
                return;
            case 13:
                r90 r90Var = (r90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                float[] fArr = r90Var.I;
                FrameLayout frameLayout = r90Var.f30127n;
                if (r90Var.f30129s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!r90Var.f30131x && r90Var.G) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                        e1Var2.j(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                        e1Var2.setOnClickListener(new k90(r90Var, 1));
                    }
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                    e1Var3.j(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.z5.n(-1, 48));
                    e1Var3.setOnClickListener(new k90(r90Var, 2));
                    if (!r90Var.F) {
                        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(context2, false, true);
                        r22 = 1;
                        e1Var4.j(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.k6.f21404p7;
                        e1Var4.d(org.telegram.ui.ActionBar.k6.x0(null, i16, false), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
                        e1Var4.setOnClickListener(new k90(r90Var, 3));
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
                        r90.a(frameLayout, container, fArr);
                        float f10 = fArr[r22];
                        ei.g6 g6Var2 = new ei.g6(r90Var, context2, container, 7);
                        org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(g6Var2, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(daVar);
                        container.addView(g6Var2, w7.z5.c(-1.0f, -1));
                        g6Var2.setAlpha(0.0f);
                        g6Var2.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        r90Var.f30129s = m1Var;
                        m1Var.setOnDismissListener(new n90(r90Var, g6Var2, container, daVar, 0));
                        boolean z11 = r22;
                        r90Var.f30129s.setOutsideTouchable(z11);
                        r90Var.f30129s.setFocusable(z11);
                        r90Var.f30129s.setBackgroundDrawable(new ColorDrawable(0));
                        r90Var.f30129s.setAnimationStyle(R.style.PopupContextAnimation);
                        r90Var.f30129s.setInputMethodMode(2);
                        r90Var.f30129s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new i90(r90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        r90Var.f30129s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                rf0 rf0Var = (rf0) obj4;
                j80 H = j80.H(rf0Var.v, rf0Var.f41120a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new j90(rf0Var, (String) obj3, (String) obj2, (String) obj, 25), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                j80 G = j80.G(((x21) obj4).container, (org.telegram.ui.ActionBar.g6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f27581t = false;
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
                        if (((TL_stars.SavedStarGift) i17.get(i18)).gift.f20567id == o2Var2.f50913b) {
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
                    ((xc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, ai.l7.X1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, ai.l7.X1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public b4(org.telegram.ui.Components.p8 p8Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.o8 o8Var) {
        this.f5171a = 9;
        this.f5172b = p8Var;
        this.f5173c = context;
        this.d = g6Var;
        this.e = o8Var;
    }
}
