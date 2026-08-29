package ih;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import jh.ia;
import jh.k7;
import lh.i9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.tc;
import org.telegram.ui.d31;
import org.telegram.ui.ki0;
import org.telegram.ui.n20;
import org.telegram.ui.o01;
import org.telegram.ui.of0;
import org.telegram.ui.si0;
import org.telegram.ui.t01;
import org.telegram.ui.tn;
public final class u3 implements View.OnClickListener {
    public final int f9413a;
    public final Object f9414b;
    public final Object f9415c;
    public final Object d;
    public final Object f9416e;

    public u3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9413a = i10;
        this.f9414b = obj;
        this.f9415c = obj2;
        this.d = obj3;
        this.f9416e = obj4;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        char c3;
        FrameLayout container;
        float f9;
        int i10 = this.f9413a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        boolean z10 = true;
        Object obj = this.f9416e;
        Object obj2 = this.d;
        Object obj3 = this.f9415c;
        Object obj4 = this.f9414b;
        switch (i10) {
            case 0:
                w3 w3Var = (w3) obj4;
                k7 k7Var = (k7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = k7Var.h();
                int i12 = 0;
                while (true) {
                    if (i12 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i12)).gift.f22619id == w3Var.f9490b) {
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
                    ArrayList arrayList = k7Var.f12387l;
                    arrayList.removeAll(h);
                    if (k7Var.f12381e && !k7Var.f12380c) {
                        Collections.sort(arrayList, new c5.e(18));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(k7Var.f12378a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k7Var.f12379b), k7Var);
                    k7Var.l();
                    w3Var.dismiss();
                    ((tc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, jh.h5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, jh.h5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                lh.d4 d4Var = ((lh.w3) obj4).f16362l;
                lh.w3 w3Var2 = d4Var.f15510p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                }
                storyItem.dialogId = d4Var.f15540x1;
                storyItem.messageId = storyItem.f22629id;
                MessageObject messageObject = new MessageObject(d4Var.f15545y2, storyItem);
                messageObject.generateThumbs(false);
                i9Var.H(new si0(messageObject, false, chat.f22392id));
                return;
            case 2:
                ((VideoAds) obj4).lambda$show$7((j70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 3:
                j70 F = j70.F(((org.telegram.ui.ActionBar.f3) obj4).getContainer(), (org.telegram.ui.ActionBar.c6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (m2) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.f29600s = 0;
                F.Z();
                return;
            case 4:
                ((org.telegram.ui.Components.b5) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.l4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f22729a.dismissRunnable;
                runnable.run();
                return;
            case 5:
                o01 o01Var = (o01) obj2;
                t01.U(o01Var.f40948a, o01Var.f40949b, ((org.telegram.ui.Components.i4) obj4).getValue() + 1, (((org.telegram.ui.Components.j4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.a3) obj).f22729a.dismissRunnable;
                runnable2.run();
                return;
            case 6:
                ((org.telegram.ui.Components.b5) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.g4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.a3) obj).f22729a.dismissRunnable;
                runnable3.run();
                return;
            case 7:
                ((m8) obj4).a();
                org.telegram.ui.Components.c5.k((Context) obj3, (org.telegram.ui.ActionBar.c6) obj2, new org.telegram.ui.Components.u((l8) obj, 13));
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                qb0 qb0Var = (qb0) obj2;
                ki0 ki0Var = (ki0) obj;
                chatActivityEnterView.M4 = !chatActivityEnterView.M4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.M4;
                }
                qb0Var.a(!chatActivityEnterView.M4, true);
                if (!arrayList2.isEmpty()) {
                    ki0Var.f((MessageObject) arrayList2.get(0));
                }
                ki0Var.n(!chatActivityEnterView.M4);
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                ki0 ki0Var2 = (ki0) obj;
                int i14 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        MessageObject messageObject3 = arrayList3.get(i15);
                        i15++;
                        messageObject3.messageOwner.invert_media = chatActivityEnterView2.M4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject2.messageOwner.invert_media = chatActivityEnterView2.M4;
                }
                chatActivityEnterView2.d0();
                ki0Var2.h(true);
                chatActivityEnterView2.M4 = false;
                return;
            case 10:
                ni niVar = (ni) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
                if (chatAttachAlertPhotoLayout != null) {
                    ia.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bh.v(15, niVar, g1Var), c6Var);
                    return;
                }
                return;
            case 11:
                r80 r80Var = (r80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                float[] fArr = r80Var.E;
                FrameLayout frameLayout = r80Var.f32236n;
                if (r80Var.f32238s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!r80Var.f32240x && r80Var.C) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, i7.f6.n(-1, 48));
                        g1Var2.setOnClickListener(new k80(r80Var, 1));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, i7.f6.n(-1, 48));
                    g1Var3.setOnClickListener(new k80(r80Var, 2));
                    if (!r80Var.B) {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        c3 = 1;
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i16 = g6.f23279p7;
                        g1Var4.c(g6.w0(null, i16, false), g6.w0(null, i16, false));
                        g1Var4.setOnClickListener(new k80(r80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, i7.f6.n(-1, 48));
                    } else {
                        c3 = 1;
                    }
                    if (f3Var == null) {
                        container = o2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        container = f3Var.getContainer();
                    }
                    if (container != null) {
                        r80.a(frameLayout, container, fArr);
                        float f10 = fArr[c3];
                        cg.i0 i0Var = new cg.i0(r80Var, context2, container, 7);
                        z9 z9Var = new z9(i0Var, 3);
                        container.getViewTreeObserver().addOnPreDrawListener(z9Var);
                        container.addView(i0Var, i7.f6.c(-1.0f, -1));
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(container.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(container.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        r80Var.f32238s = o1Var;
                        o1Var.setOnDismissListener(new n80(r80Var, i0Var, container, z9Var, 0));
                        r80Var.f32238s.setOutsideTouchable(true);
                        r80Var.f32238s.setFocusable(true);
                        r80Var.f32238s.setBackgroundDrawable(new ColorDrawable(0));
                        r80Var.f32238s.setAnimationStyle(R.style.PopupContextAnimation);
                        r80Var.f32238s.setInputMethodMode(2);
                        r80Var.f32238s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new j80(r80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += container.getPaddingTop();
                            f9 = 0.0f - container.getPaddingLeft();
                        } else {
                            f9 = 0.0f;
                        }
                        r80Var.f32238s.showAtLocation(container, 0, (int) (container.getX() + ((container.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f9), (int) (container.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                of0 of0Var = (of0) obj4;
                j70 H = j70.H(of0Var.v, of0Var.f41110a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new n20(of0Var, (String) obj3, (String) obj2, (String) obj, 14), false);
                H.V(5);
                H.Z();
                return;
            case 13:
                j70 G = j70.G(((d31) obj4).container, (org.telegram.ui.ActionBar.c6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f29601t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                return;
            case 14:
                ph.l lVar = (ph.l) obj4;
                tn tnVar = (tn) obj3;
                MessageObject messageObject4 = (MessageObject) obj2;
                String str = (String) obj;
                if (tnVar != null) {
                    lVar.getClass();
                    tnVar.J9(messageObject4, false, false);
                }
                ye.d.r(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                return;
            case 15:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                nh.d dVar = (nh.d) obj;
                strArr[0] = ((ph.h1) obj3).f45826a;
                int size2 = arrayList4.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj5 = arrayList4.get(i17);
                    i17++;
                    ph.g1 g1Var5 = (ph.g1) obj5;
                    g1Var5.f45816b.a(TextUtils.equals(g1Var5.f45815a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            default:
                boolean[] zArr = (boolean[]) obj4;
                eg.d1 d1Var = (eg.d1) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d1Var.run(strArr2[0]);
                }
                f3Var2.dismiss();
                return;
        }
    }

    public u3(m8 m8Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, l8 l8Var) {
        this.f9413a = 7;
        this.f9414b = m8Var;
        this.f9415c = context;
        this.d = c6Var;
        this.f9416e = l8Var;
    }
}
