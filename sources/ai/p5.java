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
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.bo;
import org.telegram.ui.dj0;
import org.telegram.ui.hg0;
import org.telegram.ui.j41;
import org.telegram.ui.lb1;
import org.telegram.ui.lj0;
import org.telegram.ui.t11;
import org.telegram.ui.y11;
public final class p5 implements View.OnClickListener {
    public final int f1391a;
    public final Object f1392b;
    public final Object f1393c;
    public final Object d;
    public final Object e;

    public p5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1391a = i10;
        this.f1392b = obj;
        this.f1393c = obj2;
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
        int i11 = this.f1391a;
        boolean z10 = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f1393c;
        Object obj4 = this.f1392b;
        switch (i11) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                jc jcVar = (jc) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                f6 f6Var = ((w5) obj4).f1658l;
                w5 w5Var = f6Var.f854t1;
                if (w5Var != null) {
                    w5Var.a();
                }
                storyItem.dialogId = f6Var.B1;
                storyItem.messageId = storyItem.f18356id;
                MessageObject messageObject = new MessageObject(f6Var.C2, storyItem);
                messageObject.generateThumbs(false);
                jcVar.H(new lj0(messageObject, false, chat.f18121id));
                return;
            case 1:
                ei.n nVar = (ei.n) obj4;
                bo boVar = (bo) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (boVar != null) {
                    nVar.getClass();
                    boVar.J9(messageObject2, false, false);
                }
                nf.f.r(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ci.d dVar = (ci.d) obj;
                strArr[0] = ((ei.s1) obj3).f8604a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    ei.r1 r1Var = (ei.r1) obj5;
                    r1Var.f8589b.a(TextUtils.equals(r1Var.f8588a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a0Var.run(strArr2[0]);
                }
                g3Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((n70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                n70 F = n70.F(((org.telegram.ui.ActionBar.g3) obj4).getContainer(), (org.telegram.ui.ActionBar.f6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (gg.e1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f26387s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.b5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.l4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f18471a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                t11 t11Var = (t11) obj2;
                y11.U(t11Var.f37617a, t11Var.f37618b, ((org.telegram.ui.Components.i4) obj4).getValue() + 1, (((org.telegram.ui.Components.j4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.b3) obj).f18471a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.b5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.g4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.b3) obj).f18471a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.m8) obj4).a();
                org.telegram.ui.Components.c5.k((Context) obj3, (org.telegram.ui.ActionBar.f6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.l8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ub0 ub0Var = (ub0) obj2;
                dj0 dj0Var = (dj0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                ub0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    dj0Var.f((MessageObject) arrayList2.get(0));
                }
                dj0Var.n(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                dj0 dj0Var2 = (dj0) obj;
                int i14 = ChatActivityEnterView.f21743n5;
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
                chatActivityEnterView2.e0();
                dj0Var2.h(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                vi viVar = (vi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f28757j0;
                if (chatAttachAlertPhotoLayout != null) {
                    yh.y7.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new m0(9, viVar, g1Var), f6Var2);
                    return;
                }
                return;
            case 13:
                v80 v80Var = (v80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                float[] fArr = v80Var.I;
                FrameLayout frameLayout = v80Var.f28654n;
                if (v80Var.f28656s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!v80Var.f28658x && v80Var.G) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, w7.x5.n(-1, 48));
                        g1Var2.setOnClickListener(new o80(v80Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, w7.x5.n(-1, 48));
                    g1Var3.setOnClickListener(new o80(v80Var, 2));
                    if (!v80Var.F) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.j6.f19083p7;
                        g1Var4.c(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        g1Var4.setOnClickListener(new o80(v80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, w7.x5.n(-1, 48));
                    }
                    if (g3Var2 == null) {
                        container = o2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = g3Var2.getContainer();
                    }
                    if (container != null) {
                        v80.a(frameLayout, container, fArr);
                        float f10 = fArr[1];
                        ci.s6 s6Var = new ci.s6(v80Var, context2, container, 7);
                        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(s6Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(faVar);
                        container.addView(s6Var, w7.x5.c(-1.0f, -1));
                        s6Var.setAlpha(0.0f);
                        s6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        v80Var.f28656s = o1Var;
                        o1Var.setOnDismissListener(new r80(v80Var, s6Var, container, faVar, 0));
                        v80Var.f28656s.setOutsideTouchable(true);
                        v80Var.f28656s.setFocusable(true);
                        v80Var.f28656s.setBackgroundDrawable(new ColorDrawable(0));
                        v80Var.f28656s.setAnimationStyle(R.style.PopupContextAnimation);
                        v80Var.f28656s.setInputMethodMode(2);
                        v80Var.f28656s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new n80(v80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        v80Var.f28656s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                hg0 hg0Var = (hg0) obj4;
                n70 H = n70.H(hg0Var.v, hg0Var.f34267a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new kn0(hg0Var, (String) obj3, (String) obj2, (String) obj, 21), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                n70 G = n70.G(((j41) obj4).container, (org.telegram.ui.ActionBar.f6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f26388t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                xh.q2 q2Var = (xh.q2) obj4;
                yh.n5 n5Var = (yh.n5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = n5Var.h();
                int i17 = 0;
                while (true) {
                    if (i17 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i17)).gift.f18346id == q2Var.f46124b) {
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
                    ArrayList arrayList4 = n5Var.f47526l;
                    arrayList4.removeAll(h);
                    if (n5Var.e && !n5Var.f47520c) {
                        Collections.sort(arrayList4, new lb1(22));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(n5Var.f47518a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n5Var.f47519b), n5Var);
                    n5Var.l();
                    q2Var.dismiss();
                    ((vc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, yh.a4.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, yh.a4.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public p5(org.telegram.ui.Components.m8 m8Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.l8 l8Var) {
        this.f1391a = 9;
        this.f1392b = m8Var;
        this.f1393c = context;
        this.d = f6Var;
        this.e = l8Var;
    }
}
