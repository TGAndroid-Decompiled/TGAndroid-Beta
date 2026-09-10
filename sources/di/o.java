package di;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.k6;
import bi.s7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.n8;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yi;
import org.telegram.ui.c21;
import org.telegram.ui.cj0;
import org.telegram.ui.eo;
import org.telegram.ui.fg0;
import org.telegram.ui.kj0;
import org.telegram.ui.n41;
import org.telegram.ui.x11;
import w7.a6;
import xh.n5;
import xh.z7;
import zh.u7;
public final class o implements View.OnClickListener {
    public final int f6817a;
    public final Object f6818b;
    public final Object f6819c;
    public final Object d;
    public final Object e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6817a = i10;
        this.f6818b = obj;
        this.f6819c = obj2;
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
        int i11 = this.f6817a;
        boolean z10 = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f6819c;
        Object obj4 = this.f6818b;
        switch (i11) {
            case 0:
                p pVar = (p) obj4;
                eo eoVar = (eo) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                String str = (String) obj;
                if (eoVar != null) {
                    pVar.getClass();
                    eoVar.J9(messageObject, false, false);
                }
                nf.f.r(pVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 1:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                bi.d dVar = (bi.d) obj;
                strArr[0] = ((v1) obj3).f6957a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    u1 u1Var = (u1) obj5;
                    u1Var.f6939b.a(TextUtils.equals(u1Var.f6938a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 2:
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
            case 3:
                ((VideoAds) obj4).lambda$show$7((w70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 4:
                w70 F = w70.F(((org.telegram.ui.ActionBar.h3) obj4).getContainer(), (f6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (fg.f1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f28701s = 0;
                F.Z();
                return;
            case 5:
                ((org.telegram.ui.Components.c5) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.m4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.c3) obj).f17571a.dismissRunnable;
                runnable.run();
                return;
            case 6:
                x11 x11Var = (x11) obj2;
                c21.U(x11Var.f38557a, x11Var.f38558b, ((org.telegram.ui.Components.j4) obj4).getValue() + 1, (((org.telegram.ui.Components.k4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.c3) obj).f17571a.dismissRunnable;
                runnable2.run();
                return;
            case 7:
                ((org.telegram.ui.Components.c5) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.c3) obj).f17571a.dismissRunnable;
                runnable3.run();
                return;
            case 8:
                ((o8) obj4).a();
                org.telegram.ui.Components.d5.k((Context) obj3, (f6) obj2, new org.telegram.ui.Components.t((n8) obj, 13));
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                dc0 dc0Var = (dc0) obj2;
                cj0 cj0Var = (cj0) obj;
                chatActivityEnterView.Q4 = !chatActivityEnterView.Q4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.Q4;
                }
                dc0Var.a(!chatActivityEnterView.Q4, true);
                if (!arrayList2.isEmpty()) {
                    cj0Var.f((MessageObject) arrayList2.get(0));
                }
                cj0Var.n(!chatActivityEnterView.Q4);
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                cj0 cj0Var2 = (cj0) obj;
                int i14 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        MessageObject messageObject3 = arrayList3.get(i15);
                        i15++;
                        messageObject3.messageOwner.invert_media = chatActivityEnterView2.Q4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject2.messageOwner.invert_media = chatActivityEnterView2.Q4;
                }
                chatActivityEnterView2.d0();
                cj0Var2.h(true);
                chatActivityEnterView2.Q4 = false;
                return;
            case 11:
                yi yiVar = (yi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                f6 f6Var = (f6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f29378j0;
                if (chatAttachAlertPhotoLayout != null) {
                    z7.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new k6(7, yiVar, g1Var), f6Var);
                    return;
                }
                return;
            case 12:
                f90 f90Var = (f90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                float[] fArr = f90Var.I;
                FrameLayout frameLayout = f90Var.f22951n;
                if (f90Var.f22953s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!f90Var.f22955x && f90Var.G) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, a6.n(-1, 48));
                        g1Var2.setOnClickListener(new y80(f90Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, a6.n(-1, 48));
                    g1Var3.setOnClickListener(new y80(f90Var, 2));
                    if (!f90Var.F) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = j6.f18144p7;
                        g1Var4.c(j6.w0(null, i16, false), j6.w0(null, i16, false));
                        g1Var4.setOnClickListener(new y80(f90Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, a6.n(-1, 48));
                    }
                    if (h3Var2 == null) {
                        container = p2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = h3Var2.getContainer();
                    }
                    if (container != null) {
                        f90.a(frameLayout, container, fArr);
                        float f10 = fArr[1];
                        s7 s7Var = new s7(f90Var, context2, container, 7);
                        ha haVar = new ha(s7Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(haVar);
                        container.addView(s7Var, a6.c(-1.0f, -1));
                        s7Var.setAlpha(0.0f);
                        s7Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        f90Var.f22953s = p1Var;
                        p1Var.setOnDismissListener(new b90(f90Var, s7Var, container, haVar, 0));
                        f90Var.f22953s.setOutsideTouchable(true);
                        f90Var.f22953s.setFocusable(true);
                        f90Var.f22953s.setBackgroundDrawable(new ColorDrawable(0));
                        f90Var.f22953s.setAnimationStyle(R.style.PopupContextAnimation);
                        f90Var.f22953s.setInputMethodMode(2);
                        f90Var.f22953s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new x80(f90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        f90Var.f22953s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                fg0 fg0Var = (fg0) obj4;
                w70 H = w70.H(fg0Var.v, fg0Var.f32812a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new q01(fg0Var, (String) obj, (String) obj3, (String) obj2, 17), false);
                H.V(5);
                H.Z();
                return;
            case 14:
                w70 G = w70.G(((n41) obj4).container, (f6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f28702t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            case 15:
                wh.p2 p2Var2 = (wh.p2) obj4;
                n5 n5Var = (n5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = n5Var.h();
                int i17 = 0;
                while (true) {
                    if (i17 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i17)).gift.f17425id == p2Var2.f44307b) {
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
                    ArrayList arrayList4 = n5Var.f45761l;
                    arrayList4.removeAll(h);
                    if (n5Var.e && !n5Var.f45755c) {
                        Collections.sort(arrayList4, new sg.p(13));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(n5Var.f45753a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n5Var.f45754b), n5Var);
                    n5Var.l();
                    p2Var2.dismiss();
                    ((wc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, xh.x3.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, xh.x3.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                u7 u7Var = (u7) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                zh.a3 a3Var = ((zh.v2) obj4).f48986l;
                zh.v2 v2Var = a3Var.f48211t1;
                if (v2Var != null) {
                    v2Var.a();
                }
                storyItem.dialogId = a3Var.B1;
                storyItem.messageId = storyItem.f17435id;
                MessageObject messageObject4 = new MessageObject(a3Var.C2, storyItem);
                messageObject4.generateThumbs(false);
                u7Var.H(new kj0(messageObject4, false, chat.f17195id));
                return;
        }
    }

    public o(o8 o8Var, Context context, int i10, f6 f6Var, n8 n8Var) {
        this.f6817a = 8;
        this.f6818b = o8Var;
        this.f6819c = context;
        this.d = f6Var;
        this.e = n8Var;
    }

    public o(fg0 fg0Var, String str, String str2, String str3) {
        this.f6817a = 13;
        this.f6818b = fg0Var;
        this.e = str;
        this.f6819c = str2;
        this.d = str3;
    }
}
