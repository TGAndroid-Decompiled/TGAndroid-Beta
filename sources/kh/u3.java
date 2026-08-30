package kh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import lh.ja;
import lh.l7;
import nh.i9;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.a30;
import org.telegram.ui.aj0;
import org.telegram.ui.e11;
import org.telegram.ui.p31;
import org.telegram.ui.si0;
import org.telegram.ui.wf0;
import org.telegram.ui.xn;
import org.telegram.ui.z01;
public final class u3 implements View.OnClickListener {
    public final int f10867a;
    public final Object f10868b;
    public final Object f10869c;
    public final Object d;
    public final Object e;

    public u3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10867a = i10;
        this.f10868b = obj;
        this.f10869c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        char c3;
        FrameLayout container;
        float f10;
        int i10 = this.f10867a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        boolean z4 = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f10869c;
        Object obj4 = this.f10868b;
        switch (i10) {
            case 0:
                w3 w3Var = (w3) obj4;
                l7 l7Var = (l7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = l7Var.h();
                int i12 = 0;
                while (true) {
                    if (i12 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i12)).gift.f19409id == w3Var.f10907b) {
                            savedStarGift = (TL_stars.SavedStarGift) h.get(i12);
                            i11 = i12;
                        } else {
                            i12++;
                        }
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    h.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = l7Var.f12772l;
                    arrayList.removeAll(h);
                    if (l7Var.e && !l7Var.f12766c) {
                        Collections.sort(arrayList, new e5.f(18));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(l7Var.f12764a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.f12765b), l7Var);
                    l7Var.l();
                    w3Var.dismiss();
                    ((qc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, lh.g5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, lh.g5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                nh.d4 d4Var = ((nh.w3) obj4).f16027l;
                nh.w3 w3Var2 = d4Var.f15228q1;
                if (w3Var2 != null) {
                    w3Var2.a();
                }
                storyItem.dialogId = d4Var.f15258y1;
                storyItem.messageId = storyItem.f19419id;
                MessageObject messageObject = new MessageObject(d4Var.f15263z2, storyItem);
                messageObject.generateThumbs(false);
                i9Var.H(new aj0(messageObject, false, chat.f19184id));
                return;
            case 2:
                ((VideoAds) obj4).lambda$show$7((o70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 3:
                o70 F = o70.F(((org.telegram.ui.ActionBar.g3) obj4).getContainer(), (org.telegram.ui.ActionBar.f6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (m2) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f27489s = 0;
                F.Z();
                return;
            case 4:
                ((org.telegram.ui.Components.y4) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f19525a.dismissRunnable;
                runnable.run();
                return;
            case 5:
                z01 z01Var = (z01) obj2;
                e11.U(z01Var.f40625a, z01Var.f40626b, ((org.telegram.ui.Components.f4) obj4).getValue() + 1, (((org.telegram.ui.Components.g4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.b3) obj).f19525a.dismissRunnable;
                runnable2.run();
                return;
            case 6:
                ((org.telegram.ui.Components.y4) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.d4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.b3) obj).f19525a.dismissRunnable;
                runnable3.run();
                return;
            case 7:
                ((h8) obj4).a();
                org.telegram.ui.Components.z4.k((Context) obj3, (org.telegram.ui.ActionBar.f6) obj2, new org.telegram.ui.Components.t((g8) obj, 13));
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                vb0 vb0Var = (vb0) obj2;
                si0 si0Var = (si0) obj;
                chatActivityEnterView.N4 = !chatActivityEnterView.N4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.N4;
                }
                vb0Var.a(!chatActivityEnterView.N4, true);
                if (!arrayList2.isEmpty()) {
                    si0Var.f((MessageObject) arrayList2.get(0));
                }
                si0Var.n(!chatActivityEnterView.N4);
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                si0 si0Var2 = (si0) obj;
                int i14 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        MessageObject messageObject3 = arrayList3.get(i15);
                        i15++;
                        messageObject3.messageOwner.invert_media = chatActivityEnterView2.N4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject2.messageOwner.invert_media = chatActivityEnterView2.N4;
                }
                chatActivityEnterView2.d0();
                si0Var2.h(true);
                chatActivityEnterView2.N4 = false;
                return;
            case 10:
                li liVar = (li) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26702g0;
                if (chatAttachAlertPhotoLayout != null) {
                    ja.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new dh.v(14, liVar, g1Var), f6Var);
                    return;
                }
                return;
            case 11:
                x80 x80Var = (x80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                float[] fArr = x80Var.F;
                FrameLayout frameLayout = x80Var.f30607n;
                if (x80Var.f30609s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!x80Var.f30611x && x80Var.D) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
                        g1Var2.setOnClickListener(new q80(x80Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, k7.b6.n(-1, 48));
                    g1Var3.setOnClickListener(new q80(x80Var, 2));
                    if (!x80Var.C) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        c3 = 1;
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = j6.f20122p7;
                        g1Var4.c(j6.w0(null, i16, false), j6.w0(null, i16, false));
                        g1Var4.setOnClickListener(new q80(x80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, k7.b6.n(-1, 48));
                    } else {
                        c3 = 1;
                    }
                    if (g3Var == null) {
                        container = p2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = g3Var.getContainer();
                    }
                    if (container != null) {
                        x80.a(frameLayout, container, fArr);
                        float f11 = fArr[c3];
                        eg.i0 i0Var = new eg.i0(x80Var, context2, container, 6);
                        ba baVar = new ba(i0Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(baVar);
                        container.addView(i0Var, k7.b6.c(-1.0f, -1));
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        x80Var.f30609s = p1Var;
                        p1Var.setOnDismissListener(new t80(x80Var, i0Var, container, baVar, 0));
                        x80Var.f30609s.setOutsideTouchable(true);
                        x80Var.f30609s.setFocusable(true);
                        x80Var.f30609s.setBackgroundDrawable(new ColorDrawable(0));
                        x80Var.f30609s.setAnimationStyle(R.style.PopupContextAnimation);
                        x80Var.f30609s.setInputMethodMode(2);
                        x80Var.f30609s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new p80(x80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f11 += container.getPaddingTop();
                            f10 = 0.0f - container.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        x80Var.f30609s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (container.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                wf0 wf0Var = (wf0) obj4;
                o70 H = o70.H(wf0Var.v, wf0Var.f39725a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new a30(wf0Var, (String) obj3, (String) obj2, (String) obj, 12), false);
                H.V(5);
                H.Z();
                return;
            case 13:
                o70 G = o70.G(((p31) obj4).container, (org.telegram.ui.ActionBar.f6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f27490t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            case 14:
                rh.m mVar = (rh.m) obj4;
                xn xnVar = (xn) obj3;
                MessageObject messageObject4 = (MessageObject) obj2;
                String str = (String) obj;
                if (xnVar != null) {
                    mVar.getClass();
                    xnVar.J9(messageObject4, false, false);
                }
                af.g.r(mVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 15:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                ph.d dVar = (ph.d) obj;
                strArr[0] = ((rh.i1) obj3).f43559a;
                int size2 = arrayList4.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj5 = arrayList4.get(i17);
                    i17++;
                    rh.h1 h1Var = (rh.h1) obj5;
                    h1Var.f43549b.a(TextUtils.equals(h1Var.f43548a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z4 = false;
                }
                dVar.setEnabled(z4);
                return;
            default:
                boolean[] zArr = (boolean[]) obj4;
                gg.c1 c1Var = (gg.c1) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c1Var.run(strArr2[0]);
                }
                g3Var2.dismiss();
                return;
        }
    }

    public u3(h8 h8Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, g8 g8Var) {
        this.f10867a = 7;
        this.f10868b = h8Var;
        this.f10869c = context;
        this.d = f6Var;
        this.e = g8Var;
    }
}
