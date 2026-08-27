package gh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import hh.m7;
import hh.oa;
import java.util.ArrayList;
import java.util.Collections;
import jh.i9;
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
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.mc;
import org.telegram.ui.c31;
import org.telegram.ui.ni0;
import org.telegram.ui.o01;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.t01;

public final class a4 implements View.OnClickListener {

    public final int f7135a;

    public final Object f7136b;

    public final Object f7137c;
    public final Object d;

    public final Object f7138e;

    public a4(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f7135a = i10;
        this.f7136b = obj;
        this.f7137c = obj2;
        this.d = obj3;
        this.f7138e = obj4;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        char c10;
        float paddingLeft;
        int i10 = this.f7135a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        int i12 = 1;
        Object obj = this.f7138e;
        Object obj2 = this.d;
        Object obj3 = this.f7137c;
        Object obj4 = this.f7136b;
        switch (i10) {
            case 0:
                c4 c4Var = (c4) obj4;
                m7 m7Var = (m7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList arrayListH = m7Var.h();
                for (int i13 = 0; i13 < arrayListH.size(); i13++) {
                    if (((TL_stars.SavedStarGift) arrayListH.get(i13)).gift.f22607id == c4Var.f7184b) {
                        savedStarGift = (TL_stars.SavedStarGift) arrayListH.get(i13);
                        i11 = i13;
                        if (savedStarGift == null) {
                            savedStarGift.pinned_to_top = false;
                            arrayListH.set(i11, savedStarGift2);
                            savedStarGift2.pinned_to_top = true;
                            arrayList = m7Var.f9753l;
                            arrayList.removeAll(arrayListH);
                            if (m7Var.f9747e && !m7Var.f9746c) {
                                Collections.sort(arrayList, new a5.f(19));
                            }
                            arrayList.addAll(0, arrayListH);
                            NotificationCenter.getInstance(m7Var.f9744a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m7Var.f9745b), m7Var);
                            m7Var.l();
                            c4Var.dismiss();
                            ((mc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, hh.i5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, hh.i5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                            break;
                        }
                    }
                }
                if (savedStarGift == null) {
                    savedStarGift.pinned_to_top = false;
                    arrayListH.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    arrayList = m7Var.f9753l;
                    arrayList.removeAll(arrayListH);
                    if (m7Var.f9747e) {
                        Collections.sort(arrayList, new a5.f(19));
                    }
                    arrayList.addAll(0, arrayListH);
                    NotificationCenter.getInstance(m7Var.f9744a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m7Var.f9745b), m7Var);
                    m7Var.l();
                    c4Var.dismiss();
                    ((mc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, hh.i5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, hh.i5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    break;
                }
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                jh.e4 e4Var = ((jh.x3) obj4).f14128l;
                jh.x3 x3Var = e4Var.f13261p1;
                if (x3Var != null) {
                    x3Var.a();
                }
                storyItem.dialogId = e4Var.f13291x1;
                storyItem.messageId = storyItem.f22617id;
                MessageObject messageObject = new MessageObject(e4Var.f13296y2, storyItem);
                messageObject.generateThumbs(false);
                i9Var.H(new jh.w3(messageObject, false, chat.f22380id));
                break;
            case 2:
                nh.m mVar = (nh.m) obj4;
                rn rnVar = (rn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (rnVar != null) {
                    mVar.getClass();
                    rnVar.J9(messageObject2, false, false);
                }
                we.e.r(mVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                lh.d dVar = (lh.d) obj;
                strArr[0] = ((nh.n1) obj3).f18832a;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    nh.m1 m1Var = (nh.m1) obj5;
                    m1Var.f18811b.a(TextUtils.equals(m1Var.f18810a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                cg.e1 e1Var = (cg.e1) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    e1Var.run(strArr2[0]);
                }
                e3Var.dismiss();
                break;
            case 5:
                ((VideoAds) obj4).lambda$show$7((b70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 6:
                b70 b70VarF = b70.F(((org.telegram.ui.ActionBar.e3) obj4).getContainer(), (org.telegram.ui.ActionBar.c6) obj3, (ImageView) obj2);
                b70VarF.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (p2) obj, false);
                b70VarF.Y = true;
                b70VarF.a0(0.0f, -AndroidUtilities.dp(6.0f));
                b70VarF.f26992s = 0;
                b70VarF.Z();
                break;
            case 7:
                ((org.telegram.ui.Components.x4) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.z2) obj).f23994a.dismissRunnable.run();
                break;
            case 8:
                o01 o01Var = (o01) obj2;
                t01.U(o01Var.f40972a, o01Var.f40973b, ((org.telegram.ui.Components.e4) obj4).getValue() + 1, (((org.telegram.ui.Components.f4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.z2) obj).f23994a.dismissRunnable.run();
                break;
            case 9:
                ((org.telegram.ui.Components.x4) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.c4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.z2) obj).f23994a.dismissRunnable.run();
                break;
            case 10:
                ((g8) obj4).a();
                org.telegram.ui.Components.y4.k((Context) obj3, (org.telegram.ui.ActionBar.c6) obj2, new org.telegram.ui.Components.s((f8) obj, 13));
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                fb0 fb0Var = (fb0) obj2;
                ni0 ni0Var = (ni0) obj;
                chatActivityEnterView.M4 = !chatActivityEnterView.M4;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).messageOwner.invert_media = chatActivityEnterView.M4;
                }
                fb0Var.a(!chatActivityEnterView.M4, true);
                if (!arrayList3.isEmpty()) {
                    ni0Var.f((MessageObject) arrayList3.get(0));
                }
                ni0Var.n(!chatActivityEnterView.M4);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                ni0 ni0Var2 = (ni0) obj;
                int i16 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList4 = groupedMessages.messages;
                    int size2 = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        MessageObject messageObject4 = arrayList4.get(i17);
                        i17++;
                        messageObject4.messageOwner.invert_media = chatActivityEnterView2.M4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject3.messageOwner.invert_media = chatActivityEnterView2.M4;
                }
                chatActivityEnterView2.d0();
                ni0Var2.h(true);
                chatActivityEnterView2.M4 = false;
                break;
            case 13:
                gi giVar = (gi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
                if (chatAttachAlertPhotoLayout != null) {
                    oa.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new cg.u0(15, giVar, f1Var), c6Var);
                    break;
                }
                break;
            case 14:
                i80 i80Var = (i80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                float[] fArr = i80Var.E;
                FrameLayout frameLayout = i80Var.f29274n;
                if (i80Var.f29276s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!i80Var.f29278x && i80Var.C) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                        f1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, h7.z5.n(-1, 48));
                        f1Var2.setOnClickListener(new b80(i80Var, i12));
                    }
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                    f1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var3, h7.z5.n(-1, 48));
                    f1Var3.setOnClickListener(new b80(i80Var, 2));
                    int i18 = 3;
                    if (i80Var.B) {
                        c10 = 1;
                    } else {
                        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(context2, false, true);
                        c10 = 1;
                        f1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i19 = org.telegram.ui.ActionBar.g6.f23269p7;
                        f1Var4.c(org.telegram.ui.ActionBar.g6.w0(null, i19, false), org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                        f1Var4.setOnClickListener(new b80(i80Var, i18));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var4, h7.z5.n(-1, 48));
                    }
                    FrameLayout overlayContainerView = e3Var2 == null ? n2Var.getParentLayout().getOverlayContainerView() : e3Var2.getContainer();
                    if (overlayContainerView != null) {
                        i80.a(frameLayout, overlayContainerView, fArr);
                        float paddingTop = fArr[c10];
                        ag.t0 t0Var = new ag.t0(i80Var, context2, overlayContainerView, 8);
                        y9 y9Var = new y9(t0Var, i18);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(y9Var);
                        overlayContainerView.addView(t0Var, h7.z5.c(-1.0f, -1));
                        t0Var.setAlpha(0.0f);
                        t0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        i80Var.f29276s = n1Var;
                        n1Var.setOnDismissListener(new e80(i80Var, t0Var, overlayContainerView, y9Var, 0));
                        i80Var.f29276s.setOutsideTouchable(true);
                        i80Var.f29276s.setFocusable(true);
                        i80Var.f29276s.setBackgroundDrawable(new ColorDrawable(0));
                        i80Var.f29276s.setAnimationStyle(R.style.PopupContextAnimation);
                        i80Var.f29276s.setInputMethodMode(2);
                        i80Var.f29276s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new a80(i80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            paddingTop += overlayContainerView.getPaddingTop();
                            paddingLeft = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            paddingLeft = 0.0f;
                        }
                        i80Var.f29276s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + paddingLeft), (int) (overlayContainerView.getY() + paddingTop + frameLayout.getMeasuredHeight()));
                    }
                    break;
                }
                break;
            case 15:
                rf0 rf0Var = (rf0) obj4;
                b70 b70VarH = b70.H(rf0Var.v, rf0Var.f41918a);
                b70VarH.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new l11(rf0Var, (String) obj3, (String) obj2, (String) obj, 16), false);
                b70VarH.V(5);
                b70VarH.Z();
                break;
            default:
                b70 b70VarG = b70.G(((c31) obj4).container, (org.telegram.ui.ActionBar.c6) obj2, (ImageView) obj, true);
                b70VarG.V(5);
                b70VarG.f26993t = false;
                b70VarG.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(b70VarG);
                break;
        }
    }

    public a4(g8 g8Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, f8 f8Var) {
        this.f7135a = 10;
        this.f7136b = g8Var;
        this.f7137c = context;
        this.d = c6Var;
        this.f7138e = f8Var;
    }
}
