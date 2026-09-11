package bi;

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
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
import org.telegram.ui.f11;
import org.telegram.ui.fg0;
import org.telegram.ui.k41;
import org.telegram.ui.lj0;
import org.telegram.ui.t11;
import org.telegram.ui.y11;
public final class z4 implements View.OnClickListener {
    public final int f4051a;
    public final Object f4052b;
    public final Object f4053c;
    public final Object d;
    public final Object f4054e;

    public z4(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4051a = i10;
        this.f4052b = obj;
        this.f4053c = obj2;
        this.d = obj3;
        this.f4054e = obj4;
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
        int i11 = this.f4051a;
        boolean z10 = true;
        Object obj = this.f4054e;
        Object obj2 = this.d;
        Object obj3 = this.f4053c;
        Object obj4 = this.f4052b;
        switch (i11) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                pb pbVar = (pb) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                o5 o5Var = ((f5) obj4).f2972l;
                f5 f5Var = o5Var.f3460t1;
                if (f5Var != null) {
                    f5Var.a();
                }
                storyItem.dialogId = o5Var.B1;
                storyItem.messageId = storyItem.f20107id;
                MessageObject messageObject = new MessageObject(o5Var.C2, storyItem);
                messageObject.generateThumbs(false);
                pbVar.H(new lj0(messageObject, false, chat.f19869id));
                return;
            case 1:
                fi.o oVar = (fi.o) obj4;
                co coVar = (co) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (coVar != null) {
                    oVar.getClass();
                    coVar.J9(messageObject2, false, false);
                }
                of.f.r(oVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                di.d dVar = (di.d) obj;
                strArr[0] = ((fi.s1) obj3).f9949a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    fi.r1 r1Var = (fi.r1) obj5;
                    r1Var.f9921b.a(TextUtils.equals(r1Var.f9920a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b0Var.run(strArr2[0]);
                }
                f3Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((n70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                n70 F = n70.F(((org.telegram.ui.ActionBar.f3) obj4).getContainer(), (org.telegram.ui.ActionBar.f6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (hg.e1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f28660s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.d5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.n4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f20204a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                t11 t11Var = (t11) obj2;
                y11.U(t11Var.f40598a, t11Var.f40599b, ((org.telegram.ui.Components.k4) obj4).getValue() + 1, (((org.telegram.ui.Components.l4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.a3) obj).f20204a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.d5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.a3) obj).f20204a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.q8) obj4).a();
                org.telegram.ui.Components.e5.k((Context) obj3, (org.telegram.ui.ActionBar.f6) obj2, new org.telegram.ui.Components.t((org.telegram.ui.Components.p8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                vb0 vb0Var = (vb0) obj2;
                cj0 cj0Var = (cj0) obj;
                chatActivityEnterView.Q4 = !chatActivityEnterView.Q4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.Q4;
                }
                vb0Var.a(!chatActivityEnterView.Q4, true);
                if (!arrayList2.isEmpty()) {
                    cj0Var.f((MessageObject) arrayList2.get(0));
                }
                cj0Var.n(!chatActivityEnterView.Q4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                cj0 cj0Var2 = (cj0) obj;
                int i14 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        MessageObject messageObject4 = arrayList3.get(i15);
                        i15++;
                        messageObject4.messageOwner.invert_media = chatActivityEnterView2.Q4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject3.messageOwner.invert_media = chatActivityEnterView2.Q4;
                }
                chatActivityEnterView2.d0();
                cj0Var2.h(true);
                chatActivityEnterView2.Q4 = false;
                return;
            case 12:
                vi viVar = (vi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f31291j0;
                if (chatAttachAlertPhotoLayout != null) {
                    zh.v7.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new f0(9, viVar, f1Var), f6Var);
                    return;
                }
                return;
            case 13:
                w80 w80Var = (w80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                float[] fArr = w80Var.I;
                FrameLayout frameLayout = w80Var.f32204n;
                if (w80Var.f32206s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!w80Var.f32208x && w80Var.G) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                        f1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
                        f1Var2.setOnClickListener(new o80(w80Var, 1));
                    }
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                    f1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var3, w7.x5.n(-1, 48));
                    f1Var3.setOnClickListener(new o80(w80Var, 2));
                    if (!w80Var.F) {
                        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(context2, false, true);
                        f1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.j6.f20880p7;
                        f1Var4.c(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        f1Var4.setOnClickListener(new o80(w80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var4, w7.x5.n(-1, 48));
                    }
                    if (f3Var2 == null) {
                        container = n2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = f3Var2.getContainer();
                    }
                    if (container != null) {
                        w80.a(frameLayout, container, fArr);
                        float f10 = fArr[1];
                        di.r6 r6Var = new di.r6(w80Var, context2, container, 7);
                        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(r6Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(faVar);
                        container.addView(r6Var, w7.x5.c(-1.0f, -1));
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        w80Var.f32206s = n1Var;
                        n1Var.setOnDismissListener(new s80(w80Var, r6Var, container, faVar, 0));
                        w80Var.f32206s.setOutsideTouchable(true);
                        w80Var.f32206s.setFocusable(true);
                        w80Var.f32206s.setBackgroundDrawable(new ColorDrawable(0));
                        w80Var.f32206s.setAnimationStyle(R.style.PopupContextAnimation);
                        w80Var.f32206s.setInputMethodMode(2);
                        w80Var.f32206s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new n80(w80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        w80Var.f32206s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                fg0 fg0Var = (fg0) obj4;
                n70 H = n70.H(fg0Var.v, fg0Var.f36395a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new in0(fg0Var, (String) obj3, (String) obj2, (String) obj, 21), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                n70 G = n70.G(((k41) obj4).container, (org.telegram.ui.ActionBar.f6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f28661t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                yh.p2 p2Var = (yh.p2) obj4;
                zh.j5 j5Var = (zh.j5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = j5Var.h();
                int i17 = 0;
                while (true) {
                    if (i17 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i17)).gift.f20097id == p2Var.f50503b) {
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
                    ArrayList arrayList4 = j5Var.f52101l;
                    arrayList4.removeAll(h);
                    if (j5Var.f52095e && !j5Var.f52094c) {
                        Collections.sort(arrayList4, new f11(25));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(j5Var.f52092a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j5Var.f52093b), j5Var);
                    j5Var.l();
                    p2Var.dismiss();
                    ((yc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, zh.w3.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, zh.w3.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public z4(org.telegram.ui.Components.q8 q8Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.p8 p8Var) {
        this.f4051a = 9;
        this.f4052b = q8Var;
        this.f4053c = context;
        this.d = f6Var;
        this.f4054e = p8Var;
    }
}
