package di;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.dd;
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
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.c31;
import org.telegram.ui.e11;
import org.telegram.ui.j11;
import org.telegram.ui.pi0;
import org.telegram.ui.qf0;
import org.telegram.ui.wn;
import org.telegram.ui.xi0;
public final class c4 implements View.OnClickListener {
    public final int f8452a;
    public final Object f8453b;
    public final Object f8454c;
    public final Object d;
    public final Object e;

    public c4(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8452a = i10;
        this.f8453b = obj;
        this.f8454c = obj2;
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
        int i10 = this.f8452a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f8454c;
        Object obj4 = this.f8453b;
        switch (i10) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                y9 y9Var = (y9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                q4 q4Var = ((h4) obj4).f8625l;
                h4 h4Var = q4Var.f8987i1;
                if (h4Var != null) {
                    h4Var.a();
                }
                storyItem.dialogId = q4Var.f9015q1;
                storyItem.messageId = storyItem.f22267id;
                MessageObject messageObject = new MessageObject(q4Var.f9020r2, storyItem);
                messageObject.generateThumbs(false);
                y9Var.I(new xi0(messageObject, false, chat.f22028id));
                return;
            case 1:
                hi.u uVar = (hi.u) obj4;
                wn wnVar = (wn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (wnVar != null) {
                    uVar.getClass();
                    wnVar.W9(messageObject2, false, false);
                }
                qf.d.q(uVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                fi.d dVar = (fi.d) obj;
                strArr[0] = ((hi.v1) obj3).f13332a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    hi.u1 u1Var = (hi.u1) obj5;
                    u1Var.f13311b.a(TextUtils.equals(u1Var.f13310a, strArr[0]), true);
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
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a0Var.run(strArr2[0]);
                }
                k3Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((l80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                l80 F = l80.F(((org.telegram.ui.ActionBar.k3) obj4).getContainer(), (org.telegram.ui.ActionBar.u6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (ig.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f30168s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.e5) obj2).G(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.e3) obj).f22602a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                e11 e11Var = (e11) obj2;
                j11.V(e11Var.f38731a, e11Var.f38732b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.e3) obj).f22602a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.e5) obj2).G(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.e3) obj).f22602a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.r8) obj4).a();
                org.telegram.ui.Components.g5.k((Context) obj3, (org.telegram.ui.ActionBar.u6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.q8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                nc0 nc0Var = (nc0) obj2;
                pi0 pi0Var = (pi0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                nc0Var.a(!chatActivityEnterView.R4, true);
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
                int i14 = ChatActivityEnterView.f25845r5;
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
                chatActivityEnterView2.Z();
                pi0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                ti tiVar = (ti) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33002j0;
                if (chatAttachAlertPhotoLayout != null) {
                    dd.f1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bi.m5(13, tiVar, g1Var), u6Var);
                    return;
                }
                return;
            case 13:
                s90 s90Var = (s90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                float[] fArr = s90Var.I;
                FrameLayout frameLayout = s90Var.f32524n;
                if (s90Var.f32526s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!s90Var.f32528x && s90Var.G) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.j(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, kb1.r(-1, 48));
                        g1Var2.setOnClickListener(new l90(s90Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.j(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, kb1.r(-1, 48));
                    g1Var3.setOnClickListener(new l90(s90Var, 2));
                    if (!s90Var.F) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        r22 = 1;
                        g1Var4.j(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.y6.f23582p7;
                        g1Var4.d(org.telegram.ui.ActionBar.y6.x0(null, i16, false), org.telegram.ui.ActionBar.y6.x0(null, i16, false));
                        g1Var4.setOnClickListener(new l90(s90Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, kb1.r(-1, 48));
                    } else {
                        r22 = 1;
                    }
                    if (k3Var2 == null) {
                        container = r2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = k3Var2.getContainer();
                    }
                    if (container != null) {
                        s90.a(frameLayout, container, fArr);
                        float f10 = fArr[r22];
                        fi.f6 f6Var = new fi.f6(s90Var, context2, container, 8);
                        org.telegram.ui.Cells.ha haVar = new org.telegram.ui.Cells.ha(f6Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(haVar);
                        container.addView(f6Var, kb1.g(-1.0f, -1));
                        f6Var.setAlpha(0.0f);
                        f6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        s90Var.f32526s = o1Var;
                        o1Var.setOnDismissListener(new o90(s90Var, f6Var, container, haVar, 0));
                        boolean z11 = r22;
                        s90Var.f32526s.setOutsideTouchable(z11);
                        s90Var.f32526s.setFocusable(z11);
                        s90Var.f32526s.setBackgroundDrawable(new ColorDrawable(0));
                        s90Var.f32526s.setAnimationStyle(R.style.PopupContextAnimation);
                        s90Var.f32526s.setInputMethodMode(2);
                        s90Var.f32526s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new k90(s90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        s90Var.f32526s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                qf0 qf0Var = (qf0) obj4;
                l80 H = l80.H(qf0Var.v, qf0Var.f42696a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new e10(qf0Var, (String) obj3, (String) obj2, (String) obj, 28), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                l80 G = l80.G(((c31) obj4).container, (org.telegram.ui.ActionBar.u6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f30169t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                zh.q2 q2Var = (zh.q2) obj4;
                bi.t9 t9Var = (bi.t9) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList i17 = t9Var.i();
                int i18 = 0;
                while (true) {
                    if (i18 < i17.size()) {
                        if (((TL_stars.SavedStarGift) i17.get(i18)).gift.f22257id == q2Var.f53281b) {
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
                    ArrayList arrayList4 = t9Var.f5471l;
                    arrayList4.removeAll(i17);
                    if (t9Var.e && !t9Var.f5465c) {
                        Collections.sort(arrayList4, new a4.d(4));
                    }
                    arrayList4.addAll(0, i17);
                    NotificationCenter.getInstance(t9Var.f5463a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(t9Var.f5464b), t9Var);
                    t9Var.n();
                    q2Var.dismiss();
                    ((wc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, bi.h7.X1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, bi.h7.X1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public c4(org.telegram.ui.Components.r8 r8Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.q8 q8Var) {
        this.f8452a = 9;
        this.f8453b = r8Var;
        this.f8454c = context;
        this.d = u6Var;
        this.e = q8Var;
    }
}
