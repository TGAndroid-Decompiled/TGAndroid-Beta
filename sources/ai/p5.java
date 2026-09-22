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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.bj0;
import org.telegram.ui.bo;
import org.telegram.ui.fg0;
import org.telegram.ui.i41;
import org.telegram.ui.jj0;
import org.telegram.ui.kb1;
import org.telegram.ui.s11;
import org.telegram.ui.x11;
public final class p5 implements View.OnClickListener {
    public final int f1388a;
    public final Object f1389b;
    public final Object f1390c;
    public final Object d;
    public final Object e;

    public p5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1388a = i10;
        this.f1389b = obj;
        this.f1390c = obj2;
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
        int i11 = this.f1388a;
        boolean z10 = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f1390c;
        Object obj4 = this.f1389b;
        switch (i11) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                jc jcVar = (jc) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                f6 f6Var = ((w5) obj4).f1655l;
                w5 w5Var = f6Var.f851t1;
                if (w5Var != null) {
                    w5Var.a();
                }
                storyItem.dialogId = f6Var.B1;
                storyItem.messageId = storyItem.f18344id;
                MessageObject messageObject = new MessageObject(f6Var.C2, storyItem);
                messageObject.generateThumbs(false);
                jcVar.H(new jj0(messageObject, false, chat.f18109id));
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
                strArr[0] = ((ei.s1) obj3).f8601a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    ei.r1 r1Var = (ei.r1) obj5;
                    r1Var.f8586b.a(TextUtils.equals(r1Var.f8585a, strArr[0]), true);
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
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a0Var.run(strArr2[0]);
                }
                f3Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((n70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                n70 F = n70.F(((org.telegram.ui.ActionBar.f3) obj4).getContainer(), (org.telegram.ui.ActionBar.e6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (gg.e1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f26367s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.b5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.l4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f18440a.dismissRunnable;
                runnable.run();
                return;
            case 7:
                s11 s11Var = (s11) obj2;
                x11.U(s11Var.f37250a, s11Var.f37251b, ((org.telegram.ui.Components.i4) obj4).getValue() + 1, (((org.telegram.ui.Components.j4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.a3) obj).f18440a.dismissRunnable;
                runnable2.run();
                return;
            case 8:
                ((org.telegram.ui.Components.b5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.g4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.a3) obj).f18440a.dismissRunnable;
                runnable3.run();
                return;
            case 9:
                ((org.telegram.ui.Components.m8) obj4).a();
                org.telegram.ui.Components.c5.k((Context) obj3, (org.telegram.ui.ActionBar.e6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.l8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ub0 ub0Var = (ub0) obj2;
                bj0 bj0Var = (bj0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                ub0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    bj0Var.f((MessageObject) arrayList2.get(0));
                }
                bj0Var.n(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                bj0 bj0Var2 = (bj0) obj;
                int i14 = ChatActivityEnterView.f21727n5;
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
                bj0Var2.h(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                vi viVar = (vi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f28759j0;
                if (chatAttachAlertPhotoLayout != null) {
                    yh.x7.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new m0(9, viVar, f1Var), e6Var);
                    return;
                }
                return;
            case 13:
                v80 v80Var = (v80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                float[] fArr = v80Var.I;
                FrameLayout frameLayout = v80Var.f28655n;
                if (v80Var.f28657s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!v80Var.f28659x && v80Var.G) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                        f1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
                        f1Var2.setOnClickListener(new o80(v80Var, 1));
                    }
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                    f1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var3, w7.x5.n(-1, 48));
                    f1Var3.setOnClickListener(new o80(v80Var, 2));
                    if (!v80Var.F) {
                        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(context2, false, true);
                        f1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.i6.f19053p7;
                        f1Var4.c(org.telegram.ui.ActionBar.i6.w0(null, i16, false), org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                        f1Var4.setOnClickListener(new o80(v80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var4, w7.x5.n(-1, 48));
                    }
                    if (f3Var2 == null) {
                        container = n2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = f3Var2.getContainer();
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
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        v80Var.f28657s = n1Var;
                        n1Var.setOnDismissListener(new r80(v80Var, s6Var, container, faVar, 0));
                        v80Var.f28657s.setOutsideTouchable(true);
                        v80Var.f28657s.setFocusable(true);
                        v80Var.f28657s.setBackgroundDrawable(new ColorDrawable(0));
                        v80Var.f28657s.setAnimationStyle(R.style.PopupContextAnimation);
                        v80Var.f28657s.setInputMethodMode(2);
                        v80Var.f28657s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new n80(v80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f7 = 0.0f - container.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        v80Var.f28657s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                fg0 fg0Var = (fg0) obj4;
                n70 H = n70.H(fg0Var.v, fg0Var.f33592a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new jn0(fg0Var, (String) obj3, (String) obj2, (String) obj, 21), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                n70 G = n70.G(((i41) obj4).container, (org.telegram.ui.ActionBar.e6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f26368t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            default:
                xh.q2 q2Var = (xh.q2) obj4;
                yh.m5 m5Var = (yh.m5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = m5Var.h();
                int i17 = 0;
                while (true) {
                    if (i17 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i17)).gift.f18334id == q2Var.f46092b) {
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
                    ArrayList arrayList4 = m5Var.f47406l;
                    arrayList4.removeAll(h);
                    if (m5Var.e && !m5Var.f47400c) {
                        Collections.sort(arrayList4, new kb1(22));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(m5Var.f47398a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m5Var.f47399b), m5Var);
                    m5Var.l();
                    q2Var.dismiss();
                    ((vc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, yh.z3.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, yh.z3.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
        }
    }

    public p5(org.telegram.ui.Components.m8 m8Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.l8 l8Var) {
        this.f1388a = 9;
        this.f1389b = m8Var;
        this.f1390c = context;
        this.d = e6Var;
        this.e = l8Var;
    }
}
