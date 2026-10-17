package ci;

import ai.ld;
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
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xc;
import org.telegram.ui.b11;
import org.telegram.ui.of0;
import org.telegram.ui.oi0;
import org.telegram.ui.sn;
import org.telegram.ui.v21;
import org.telegram.ui.w01;
import org.telegram.ui.wi0;
public final class c4 implements View.OnClickListener {
    public final int f5272a;
    public final Object f5273b;
    public final Object f5274c;
    public final Object d;
    public final Object e;

    public c4(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5272a = i10;
        this.f5273b = obj;
        this.f5274c = obj2;
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
        int i10 = this.f5272a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f5274c;
        Object obj4 = this.f5273b;
        switch (i10) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                aa aaVar = (aa) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                q4 q4Var = ((h4) obj4).f5463l;
                h4 h4Var = q4Var.f5823t1;
                if (h4Var != null) {
                    h4Var.a();
                }
                storyItem.dialogId = q4Var.B1;
                storyItem.messageId = storyItem.f20506id;
                MessageObject messageObject = new MessageObject(q4Var.C2, storyItem);
                messageObject.generateThumbs(false);
                aaVar.H(new wi0(messageObject, false, chat.f20272id));
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
                strArr[0] = ((gi.o1) obj3).f11367a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    gi.n1 n1Var = (gi.n1) obj5;
                    n1Var.f11357b.a(TextUtils.equals(n1Var.f11356a, strArr[0]), true);
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
                org.telegram.ui.web.z zVar = (org.telegram.ui.web.z) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    zVar.run(strArr2[0]);
                }
                f3Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((i80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                i80 F = i80.F(((org.telegram.ui.ActionBar.f3) obj4).getContainer(), (org.telegram.ui.ActionBar.d6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (hg.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f27134s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.e5) obj2).C(((int[]) obj4)[((org.telegram.ui.Components.o4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f20609a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                w01 w01Var = (w01) obj2;
                b11.U(w01Var.f42310a, w01Var.f42311b, ((org.telegram.ui.Components.l4) obj4).getValue() + 1, (((org.telegram.ui.Components.m4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.a3) obj).f20609a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.e5) obj2).C(((int[]) obj4)[((org.telegram.ui.Components.j4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.a3) obj).f20609a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.p8) obj4).a();
                org.telegram.ui.Components.f5.j((Context) obj3, (org.telegram.ui.ActionBar.d6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.o8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                nc0 nc0Var = (nc0) obj2;
                oi0 oi0Var = (oi0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                nc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    oi0Var.f((MessageObject) arrayList2.get(0));
                }
                oi0Var.n(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                oi0 oi0Var2 = (oi0) obj;
                int i14 = ChatActivityEnterView.f23904n5;
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
                chatActivityEnterView2.b0();
                oi0Var2.h(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                ti tiVar = (ti) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30586j0;
                if (chatAttachAlertPhotoLayout != null) {
                    ld.h1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new ai.q5(13, tiVar, e1Var), d6Var);
                    return;
                }
                return;
            case 13:
                q90 q90Var = (q90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                float[] fArr = q90Var.I;
                FrameLayout frameLayout = q90Var.f29601n;
                if (q90Var.f29603s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!q90Var.f29605x && q90Var.G) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                        e1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                        e1Var2.setOnClickListener(new j90(q90Var, 1));
                    }
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                    e1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.z5.n(-1, 48));
                    e1Var3.setOnClickListener(new j90(q90Var, 2));
                    if (!q90Var.F) {
                        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(context2, false, true);
                        r22 = 1;
                        e1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.h6.f21207p7;
                        e1Var4.c(org.telegram.ui.ActionBar.h6.x0(null, i16, false), org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        e1Var4.setOnClickListener(new j90(q90Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var4, w7.z5.n(-1, 48));
                    } else {
                        r22 = 1;
                    }
                    if (f3Var2 == null) {
                        container = n2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = f3Var2.getContainer();
                    }
                    if (container != null) {
                        q90.a(frameLayout, container, fArr);
                        float f10 = fArr[r22];
                        ei.g6 g6Var = new ei.g6(q90Var, context2, container, 7);
                        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(g6Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(caVar);
                        container.addView(g6Var, w7.z5.d(-1.0f, -1));
                        g6Var.setAlpha(0.0f);
                        g6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        q90Var.f29603s = m1Var;
                        m1Var.setOnDismissListener(new m90(q90Var, g6Var, container, caVar, 0));
                        boolean z11 = r22;
                        q90Var.f29603s.setOutsideTouchable(z11);
                        q90Var.f29603s.setFocusable(z11);
                        q90Var.f29603s.setBackgroundDrawable(new ColorDrawable(0));
                        q90Var.f29603s.setAnimationStyle(R.style.PopupContextAnimation);
                        q90Var.f29603s.setInputMethodMode(2);
                        q90Var.f29603s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new h90(q90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        q90Var.f29603s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                of0 of0Var = (of0) obj4;
                i80 H = i80.H(of0Var.v, of0Var.f39763a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new i90(of0Var, (String) obj3, (String) obj2, (String) obj, 25), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                i80 G = i80.G(((v21) obj4).container, (org.telegram.ui.ActionBar.d6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f27135t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                yh.p2 p2Var = (yh.p2) obj4;
                ai.x9 x9Var = (ai.x9) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList i17 = x9Var.i();
                int i18 = 0;
                while (true) {
                    if (i18 < i17.size()) {
                        if (((TL_stars.SavedStarGift) i17.get(i18)).gift.f20496id == p2Var.f50481b) {
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
                    ArrayList arrayList4 = x9Var.f2448l;
                    arrayList4.removeAll(i17);
                    if (x9Var.e && !x9Var.f2442c) {
                        Collections.sort(arrayList4, new a4.d(4));
                    }
                    arrayList4.addAll(0, i17);
                    NotificationCenter.getInstance(x9Var.f2440a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(x9Var.f2441b), x9Var);
                    x9Var.m();
                    p2Var.dismiss();
                    ((xc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, ai.k7.Q1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, ai.k7.Q1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public c4(org.telegram.ui.Components.p8 p8Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.o8 o8Var) {
        this.f5272a = 9;
        this.f5273b = p8Var;
        this.f5274c = context;
        this.d = d6Var;
        this.e = o8Var;
    }
}
