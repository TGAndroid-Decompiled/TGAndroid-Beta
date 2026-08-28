package fh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import gh.n7;
import gh.oa;
import ih.m9;
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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.x70;
import org.telegram.ui.d31;
import org.telegram.ui.li0;
import org.telegram.ui.n01;
import org.telegram.ui.of0;
import org.telegram.ui.qn;
import org.telegram.ui.s01;
import org.telegram.ui.ti0;
public final class g4 implements View.OnClickListener {
    public final int f6477a;
    public final Object f6478b;
    public final Object f6479c;
    public final Object d;
    public final Object f6480e;

    public g4(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f6477a = i9;
        this.f6478b = obj;
        this.f6479c = obj2;
        this.d = obj3;
        this.f6480e = obj4;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        char c10;
        FrameLayout container;
        float f10;
        int i9 = this.f6477a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i10 = -1;
        Object obj = this.f6480e;
        Object obj2 = this.d;
        Object obj3 = this.f6479c;
        Object obj4 = this.f6478b;
        switch (i9) {
            case 0:
                i4 i4Var = (i4) obj4;
                n7 n7Var = (n7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = n7Var.h();
                int i11 = 0;
                while (true) {
                    if (i11 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i11)).gift.f22607id == i4Var.f6519b) {
                            savedStarGift = (TL_stars.SavedStarGift) h.get(i11);
                            i10 = i11;
                        } else {
                            i11++;
                        }
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    h.set(i10, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = n7Var.f8625l;
                    arrayList.removeAll(h);
                    if (n7Var.f8619e && !n7Var.f8618c) {
                        Collections.sort(arrayList, new a5.e(18));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(n7Var.f8616a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n7Var.f8617b), n7Var);
                    n7Var.l();
                    i4Var.dismiss();
                    ((oc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, gh.k5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, gh.k5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                m9 m9Var = (m9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ih.i4 i4Var2 = ((ih.b4) obj4).f11268l;
                ih.b4 b4Var = i4Var2.f11574p1;
                if (b4Var != null) {
                    b4Var.a();
                }
                storyItem.dialogId = i4Var2.f11604x1;
                storyItem.messageId = storyItem.f22617id;
                MessageObject messageObject = new MessageObject(i4Var2.f11609y2, storyItem);
                messageObject.generateThumbs(false);
                m9Var.H(new ti0(messageObject, false, chat.f22380id));
                return;
            case 2:
                mh.n nVar = (mh.n) obj4;
                qn qnVar = (qn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (qnVar != null) {
                    nVar.getClass();
                    qnVar.J9(messageObject2, false, false);
                }
                ve.e.r(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                kh.d dVar = (kh.d) obj;
                strArr[0] = ((mh.o1) obj3).f18012a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    mh.n1 n1Var = (mh.n1) obj5;
                    n1Var.f17994b.a(TextUtils.equals(n1Var.f17993a, strArr[0]), true);
                }
                if (strArr[0] != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                bg.j1 j1Var = (bg.j1) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    j1Var.run(strArr2[0]);
                }
                f3Var.dismiss();
                return;
            case 5:
                ((VideoAds) obj4).lambda$show$7((x60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 6:
                x60 F = x60.F(((org.telegram.ui.ActionBar.f3) obj4).getContainer(), (org.telegram.ui.ActionBar.b6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (u2) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f34580s = 0;
                F.Z();
                return;
            case 7:
                ((org.telegram.ui.Components.x4) obj2).B(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f22713a.dismissRunnable;
                runnable.run();
                return;
            case 8:
                n01 n01Var = (n01) obj2;
                s01.T(n01Var.f40575a, n01Var.f40576b, ((org.telegram.ui.Components.e4) obj4).getValue() + 1, (((org.telegram.ui.Components.f4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.a3) obj).f22713a.dismissRunnable;
                runnable2.run();
                return;
            case 9:
                ((org.telegram.ui.Components.x4) obj2).B(((int[]) obj4)[((org.telegram.ui.Components.c4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.a3) obj).f22713a.dismissRunnable;
                runnable3.run();
                return;
            case 10:
                ((h8) obj4).a();
                org.telegram.ui.Components.y4.k((Context) obj3, (org.telegram.ui.ActionBar.b6) obj2, new org.telegram.ui.Components.s((g8) obj, 13));
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                bb0 bb0Var = (bb0) obj2;
                li0 li0Var = (li0) obj;
                chatActivityEnterView.M4 = !chatActivityEnterView.M4;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).messageOwner.invert_media = chatActivityEnterView.M4;
                }
                bb0Var.a(!chatActivityEnterView.M4, true);
                if (!arrayList3.isEmpty()) {
                    li0Var.f((MessageObject) arrayList3.get(0));
                }
                li0Var.n(!chatActivityEnterView.M4);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                li0 li0Var2 = (li0) obj;
                int i14 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList4 = groupedMessages.messages;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        MessageObject messageObject4 = arrayList4.get(i15);
                        i15++;
                        messageObject4.messageOwner.invert_media = chatActivityEnterView2.M4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject3.messageOwner.invert_media = chatActivityEnterView2.M4;
                }
                chatActivityEnterView2.c0();
                li0Var2.h(true);
                chatActivityEnterView2.M4 = false;
                return;
            case 13:
                ki kiVar = (ki) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
                if (chatAttachAlertPhotoLayout != null) {
                    oa.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bg.y0(15, kiVar, g1Var), b6Var);
                    return;
                }
                return;
            case 14:
                e80 e80Var = (e80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                float[] fArr = e80Var.E;
                FrameLayout frameLayout = e80Var.f27972n;
                if (e80Var.f27974s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!e80Var.f27976x && e80Var.C) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, g7.e6.n(-1, 48));
                        g1Var2.setOnClickListener(new x70(e80Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, g7.e6.n(-1, 48));
                    g1Var3.setOnClickListener(new x70(e80Var, 2));
                    if (!e80Var.B) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        c10 = 1;
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.f6.f23212p7;
                        g1Var4.c(org.telegram.ui.ActionBar.f6.w0(null, i16, false), org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                        g1Var4.setOnClickListener(new x70(e80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, g7.e6.n(-1, 48));
                    } else {
                        c10 = 1;
                    }
                    if (f3Var2 == null) {
                        container = o2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = f3Var2.getContainer();
                    }
                    if (container != null) {
                        e80.a(frameLayout, container, fArr);
                        float f11 = fArr[c10];
                        kh.h6 h6Var = new kh.h6(e80Var, context2, container, 7);
                        ca caVar = new ca(h6Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(caVar);
                        container.addView(h6Var, g7.e6.c(-1.0f, -1));
                        h6Var.setAlpha(0.0f);
                        h6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        e80Var.f27974s = o1Var;
                        o1Var.setOnDismissListener(new a80(e80Var, h6Var, container, caVar, 0));
                        e80Var.f27974s.setOutsideTouchable(true);
                        e80Var.f27974s.setFocusable(true);
                        e80Var.f27974s.setBackgroundDrawable(new ColorDrawable(0));
                        e80Var.f27974s.setAnimationStyle(R.style.PopupContextAnimation);
                        e80Var.f27974s.setInputMethodMode(2);
                        e80Var.f27974s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new w70(e80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f11 += container.getPaddingTop();
                            f10 = 0.0f - container.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        e80Var.f27974s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (container.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                of0 of0Var = (of0) obj4;
                x60 H = x60.H(of0Var.v, of0Var.f41139a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new no0(of0Var, (String) obj3, (String) obj2, (String) obj, 20), false);
                H.V(5);
                H.Z();
                return;
            default:
                x60 G = x60.G(((d31) obj4).container, (org.telegram.ui.ActionBar.b6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f34581t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
        }
    }

    public g4(h8 h8Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, g8 g8Var) {
        this.f6477a = 10;
        this.f6478b = h8Var;
        this.f6479c = context;
        this.d = b6Var;
        this.f6480e = g8Var;
    }
}
