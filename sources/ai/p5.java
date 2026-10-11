package ai;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yi;
import org.telegram.ui.cj0;
import org.telegram.ui.eg0;
import org.telegram.ui.g41;
import org.telegram.ui.kj0;
import org.telegram.ui.lb1;
import org.telegram.ui.p11;
import org.telegram.ui.u11;
import org.telegram.ui.zn;
public final class p5 implements View.OnClickListener {
    public final int f1571a;
    public final Object f1572b;
    public final Object f1573c;
    public final Object d;
    public final Object f1574e;

    public p5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1571a = i10;
        this.f1572b = obj;
        this.f1573c = obj2;
        this.d = obj3;
        this.f1574e = obj4;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        FrameLayout container;
        float f7;
        TL_stars.SavedStarGift savedStarGift;
        int i10;
        int i11 = this.f1571a;
        boolean z10 = true;
        Object obj = this.f1574e;
        Object obj2 = this.d;
        Object obj3 = this.f1573c;
        Object obj4 = this.f1572b;
        switch (i11) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                kc kcVar = (kc) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                f6 f6Var = ((w5) obj4).f1860l;
                w5 w5Var = f6Var.f1006t1;
                if (w5Var != null) {
                    w5Var.a();
                }
                storyItem.dialogId = f6Var.B1;
                storyItem.messageId = storyItem.f20269id;
                MessageObject messageObject = new MessageObject(f6Var.C2, storyItem);
                messageObject.generateThumbs(false);
                kcVar.H(new kj0(messageObject, false, chat.f20032id));
                return;
            case 1:
                ei.n nVar = (ei.n) obj4;
                zn znVar = (zn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (znVar != null) {
                    nVar.getClass();
                    znVar.O9(messageObject2, false, false);
                }
                of.f.r(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ci.d dVar = (ci.d) obj;
                strArr[0] = ((ei.s1) obj3).f9343a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    ei.r1 r1Var = (ei.r1) obj5;
                    r1Var.f9327b.a(TextUtils.equals(r1Var.f9326a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.z zVar = (org.telegram.ui.web.z) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    zVar.run(strArr2[0]);
                }
                e3Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((q80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                q80 F = q80.F(((org.telegram.ui.ActionBar.e3) obj4).getContainer(), (org.telegram.ui.ActionBar.d6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (gg.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f30083s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.f5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.z2) obj).f21710a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                p11 p11Var = (p11) obj2;
                u11.U(p11Var.f40684a, p11Var.f40685b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.z2) obj).f21710a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.f5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.z2) obj).f21710a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.q8) obj4).a();
                org.telegram.ui.Components.g5.j((Context) obj3, (org.telegram.ui.ActionBar.d6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.p8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                vc0 vc0Var = (vc0) obj2;
                cj0 cj0Var = (cj0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                vc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    cj0Var.f((MessageObject) arrayList2.get(0));
                }
                cj0Var.n(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                cj0 cj0Var2 = (cj0) obj;
                int i14 = ChatActivityEnterView.f23842n5;
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
                cj0Var2.h(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                yi yiVar = (yi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33228j0;
                if (chatAttachAlertPhotoLayout != null) {
                    yh.p7.h1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new m0(9, yiVar, e1Var), d6Var);
                    return;
                }
                return;
            case 13:
                y90 y90Var = (y90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                float[] fArr = y90Var.I;
                FrameLayout frameLayout = y90Var.f33146n;
                if (y90Var.f33148s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!y90Var.f33150x && y90Var.G) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                        e1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.x5.n(-1, 48));
                        e1Var2.setOnClickListener(new r90(y90Var, 1));
                    }
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                    e1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.x5.n(-1, 48));
                    e1Var3.setOnClickListener(new r90(y90Var, 2));
                    if (!y90Var.F) {
                        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(context2, false, true);
                        e1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.h6.f21007p7;
                        e1Var4.c(org.telegram.ui.ActionBar.h6.x0(null, i16, false), org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        e1Var4.setOnClickListener(new r90(y90Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var4, w7.x5.n(-1, 48));
                    }
                    if (e3Var2 == null) {
                        container = m2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = e3Var2.getContainer();
                    }
                    if (container != null) {
                        y90.a(frameLayout, container, fArr);
                        float f10 = fArr[1];
                        ci.r6 r6Var = new ci.r6(y90Var, context2, container, 7);
                        org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(r6Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(daVar);
                        container.addView(r6Var, w7.x5.d(-1.0f, -1));
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        y90Var.f33148s = m1Var;
                        m1Var.setOnDismissListener(new u90(y90Var, r6Var, container, daVar, 0));
                        y90Var.f33148s.setOutsideTouchable(true);
                        y90Var.f33148s.setFocusable(true);
                        y90Var.f33148s.setBackgroundDrawable(new ColorDrawable(0));
                        y90Var.f33148s.setAnimationStyle(R.style.PopupContextAnimation);
                        y90Var.f33148s.setInputMethodMode(2);
                        y90Var.f33148s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new q90(y90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        y90Var.f33148s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                eg0 eg0Var = (eg0) obj4;
                q80 H = q80.H(eg0Var.v, eg0Var.f37302a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new qo0(eg0Var, (String) obj3, (String) obj2, (String) obj, 21), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                q80 G = q80.G(((g41) obj4).container, (org.telegram.ui.ActionBar.d6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f30084t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                xh.r2 r2Var = (xh.r2) obj4;
                yh.f5 f5Var = (yh.f5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = f5Var.h();
                int i17 = 0;
                while (true) {
                    if (i17 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i17)).gift.f20259id == r2Var.f51586b) {
                            savedStarGift = (TL_stars.SavedStarGift) h.get(i17);
                            i10 = i17;
                        } else {
                            i17++;
                        }
                    } else {
                        savedStarGift = null;
                        i10 = -1;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    h.set(i10, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = f5Var.f52606l;
                    arrayList4.removeAll(h);
                    if (f5Var.f52600e && !f5Var.f52599c) {
                        Collections.sort(arrayList4, new lb1(24));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(f5Var.f52597a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.f52598b), f5Var);
                    f5Var.l();
                    r2Var.dismiss();
                    ((ad) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, yh.s3.E1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, yh.s3.E1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public p5(org.telegram.ui.Components.q8 q8Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.p8 p8Var) {
        this.f1571a = 9;
        this.f1572b = q8Var;
        this.f1573c = context;
        this.d = d6Var;
        this.f1574e = p8Var;
    }
}
