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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.db1;
import org.telegram.ui.dj0;
import org.telegram.ui.i11;
import org.telegram.ui.n11;
import org.telegram.ui.vi0;
import org.telegram.ui.wn;
import org.telegram.ui.z31;
import org.telegram.ui.zf0;
public final class o5 implements View.OnClickListener {
    public final int f1352a;
    public final Object f1353b;
    public final Object f1354c;
    public final Object d;
    public final Object e;

    public o5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1352a = i10;
        this.f1353b = obj;
        this.f1354c = obj2;
        this.d = obj3;
        this.e = obj4;
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
        int i11 = this.f1352a;
        boolean z10 = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f1354c;
        Object obj4 = this.f1353b;
        switch (i11) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                jc jcVar = (jc) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                e6 e6Var = ((v5) obj4).f1617l;
                v5 v5Var = e6Var.f827t1;
                if (v5Var != null) {
                    v5Var.a();
                }
                storyItem.dialogId = e6Var.B1;
                storyItem.messageId = storyItem.f18587id;
                MessageObject messageObject = new MessageObject(e6Var.C2, storyItem);
                messageObject.generateThumbs(false);
                jcVar.H(new dj0(messageObject, false, chat.f18352id));
                return;
            case 1:
                ei.n nVar = (ei.n) obj4;
                wn wnVar = (wn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (wnVar != null) {
                    nVar.getClass();
                    wnVar.J9(messageObject2, false, false);
                }
                nf.f.r(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ci.d dVar = (ci.d) obj;
                strArr[0] = ((ei.s1) obj3).f8598a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    ei.r1 r1Var = (ei.r1) obj5;
                    r1Var.f8583b.a(TextUtils.equals(r1Var.f8582a, strArr[0]), true);
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
                ((VideoAds) obj4).lambda$show$7((b80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                b80 F = b80.F(((org.telegram.ui.ActionBar.e3) obj4).getContainer(), (org.telegram.ui.ActionBar.d6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (gg.e1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f22872s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.d5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.n4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.z2) obj).f19966a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                i11 i11Var = (i11) obj2;
                n11.U(i11Var.f34438a, i11Var.f34439b, ((org.telegram.ui.Components.k4) obj4).getValue() + 1, (((org.telegram.ui.Components.l4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.z2) obj).f19966a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.d5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.z2) obj).f19966a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.o8) obj4).a();
                org.telegram.ui.Components.e5.k((Context) obj3, (org.telegram.ui.ActionBar.d6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.n8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                hc0 hc0Var = (hc0) obj2;
                vi0 vi0Var = (vi0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                hc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    vi0Var.f((MessageObject) arrayList2.get(0));
                }
                vi0Var.n(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                vi0 vi0Var2 = (vi0) obj;
                int i14 = ChatActivityEnterView.f21974n5;
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
                chatActivityEnterView2.d0();
                vi0Var2.h(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                xi xiVar = (xi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f30282j0;
                if (chatAttachAlertPhotoLayout != null) {
                    yh.w7.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new m0(9, xiVar, e1Var), d6Var);
                    return;
                }
                return;
            case 13:
                j90 j90Var = (j90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                float[] fArr = j90Var.I;
                FrameLayout frameLayout = j90Var.f25374n;
                if (j90Var.f25376s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!j90Var.f25378x && j90Var.G) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                        e1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.y5.n(-1, 48));
                        e1Var2.setOnClickListener(new c90(j90Var, 1));
                    }
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                    e1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.y5.n(-1, 48));
                    e1Var3.setOnClickListener(new c90(j90Var, 2));
                    if (!j90Var.F) {
                        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(context2, false, true);
                        e1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.h6.f19296p7;
                        e1Var4.c(org.telegram.ui.ActionBar.h6.w0(null, i16, false), org.telegram.ui.ActionBar.h6.w0(null, i16, false));
                        e1Var4.setOnClickListener(new c90(j90Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var4, w7.y5.n(-1, 48));
                    }
                    if (e3Var2 == null) {
                        container = m2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = e3Var2.getContainer();
                    }
                    if (container != null) {
                        j90.a(frameLayout, container, fArr);
                        float f10 = fArr[1];
                        ci.r6 r6Var = new ci.r6(j90Var, context2, container, 7);
                        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(r6Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(faVar);
                        container.addView(r6Var, w7.y5.c(-1.0f, -1));
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        j90Var.f25376s = m1Var;
                        m1Var.setOnDismissListener(new f90(j90Var, r6Var, container, faVar, 0));
                        j90Var.f25376s.setOutsideTouchable(true);
                        j90Var.f25376s.setFocusable(true);
                        j90Var.f25376s.setBackgroundDrawable(new ColorDrawable(0));
                        j90Var.f25376s.setAnimationStyle(R.style.PopupContextAnimation);
                        j90Var.f25376s.setInputMethodMode(2);
                        j90Var.f25376s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b90(j90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        j90Var.f25376s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                zf0 zf0Var = (zf0) obj4;
                b80 H = b80.H(zf0Var.v, zf0Var.f40570a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new yn0(zf0Var, (String) obj3, (String) obj2, (String) obj, 22), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                b80 G = b80.G(((z31) obj4).container, (org.telegram.ui.ActionBar.d6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f22873t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                xh.r2 r2Var = (xh.r2) obj4;
                yh.k5 k5Var = (yh.k5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = k5Var.h();
                int i17 = 0;
                while (true) {
                    if (i17 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i17)).gift.f18577id == r2Var.f46495b) {
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
                    ArrayList arrayList4 = k5Var.f47720l;
                    arrayList4.removeAll(h);
                    if (k5Var.e && !k5Var.f47714c) {
                        Collections.sort(arrayList4, new db1(22));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(k5Var.f47712a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k5Var.f47713b), k5Var);
                    k5Var.l();
                    r2Var.dismiss();
                    ((yc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, yh.x3.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, yh.x3.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public o5(org.telegram.ui.Components.o8 o8Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.n8 n8Var) {
        this.f1352a = 9;
        this.f1353b = o8Var;
        this.f1354c = context;
        this.d = d6Var;
        this.e = n8Var;
    }
}
