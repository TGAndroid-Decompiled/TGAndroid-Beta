package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.zn;
public final class p6 implements Runnable {
    public final int f12905a;
    public final Object f12906b;
    public final Object f12907c;
    public final Object d;

    public p6(Object obj, Object obj2, Object obj3, int i10) {
        this.f12905a = i10;
        this.f12906b = obj;
        this.f12907c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        mg.d dVar;
        long j10;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r42;
        TLRPC.TL_availableReaction tL_availableReaction2;
        org.telegram.ui.Components.l5 l5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        MessageObject messageObject;
        int id2;
        ViewGroup viewGroup;
        float f10;
        int i10 = this.f12905a;
        int i11 = 0;
        final boolean z4 = false;
        Object obj = this.d;
        ?? r82 = this.f12907c;
        Object obj2 = this.f12906b;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) obj2;
                Runnable runnable = (Runnable) obj;
                t7Var.getClass();
                Iterator it = ((HashSet) r82).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    t7Var.Q.remove(num);
                    t7Var.R.remove(num);
                }
                runnable.run();
                return;
            case 1:
                ((boolean[]) obj2)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) r82);
                ((org.telegram.ui.ActionBar.g3[]) obj)[0].dismiss();
                return;
            case 2:
                nh.h3 h3Var = (nh.h3) obj2;
                mg.q0 q0Var = (mg.q0) r82;
                View view = (View) obj;
                nh.d4 d4Var = h3Var.f15357a;
                d4Var.f15213r3 = true;
                nh.b4 b4Var = d4Var.L1;
                ImageReceiver imageReceiver = d4Var.f15187i3;
                boolean[] zArr = {false};
                nh.y6 y6Var = d4Var.B0;
                y6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new nh.l2(1, y6Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                nh.y6 y6Var2 = new nh.y6(d4Var.getContext(), d4Var.f15222u1);
                d4Var.B0 = y6Var2;
                y6Var2.setPadding(dp, dp, dp, dp);
                d4Var.A0.addView(d4Var.B0, k7.b6.e(40, 40, 3));
                org.telegram.ui.Components.l5 l5Var2 = d4Var.f15195l3;
                if (l5Var2 != null) {
                    l5Var2.o(d4Var);
                    dVar = null;
                    d4Var.f15195l3 = null;
                } else {
                    dVar = null;
                }
                mg.d dVar2 = d4Var.f15190j3;
                if (dVar2 != null) {
                    dVar2.d(d4Var);
                    d4Var.f15190j3 = dVar;
                }
                d4Var.f15198m3 = false;
                if (q0Var.f14096g != 0) {
                    d4Var.f15198m3 = true;
                    j10 = 0;
                    org.telegram.ui.Components.l5 l5Var3 = new org.telegram.ui.Components.l5(2, d4Var.f15243z2, q0Var.f14096g);
                    d4Var.f15195l3 = l5Var3;
                    l5Var3.a(d4Var);
                } else {
                    j10 = 0;
                    if (q0Var.f14095f != null && (tL_availableReaction = MediaDataController.getInstance(d4Var.f15243z2).getReactionsMap().get(q0Var.f14095f)) != null) {
                        d4Var.f15193k3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), mg.m0.a(), null, null, null, 0);
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().L(0, false, true);
                        }
                    }
                }
                d4Var.B0.setReaction(q0Var);
                if (d4Var.A1) {
                    TL_stories.StoryItem storyItem3 = b4Var.f15091a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = b4Var.f15091a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        mg.s0.b(null, storyItem4.sent_reaction, storyViews);
                        d4Var.k1(true);
                    }
                }
                if (q0Var.f14096g != j10 && (l5Var = d4Var.B0.f16061f) != null) {
                    mg.d a2 = mg.d.a(l5Var, false, true);
                    d4Var.f15190j3 = a2;
                    a2.f(d4Var);
                }
                d4Var.P1.g0(d4Var.f15238y1, b4Var.f15091a, q0Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                d4Var.getLocationInWindow(iArr2);
                d4Var.f15220t3 = iArr[0] - iArr2[0];
                d4Var.f15224u3 = iArr[1] - iArr2[1];
                d4Var.f15228v3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                d4Var.f15216s3 = 0.0f;
                d4Var.invalidate();
                nh.y6 y6Var3 = d4Var.B0;
                y6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = y6Var3.e;
                if (q0Var.f14096g == j10 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f14095f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    r42 = 0;
                    imageReceiver2.setAutoRepeat(0);
                } else {
                    r42 = 0;
                }
                ofFloat.addUpdateListener(new dg.r(h3Var, ofFloat, zArr, 1));
                ofFloat.addListener(new nh.g3(h3Var, zArr, y6Var3, r42));
                ofFloat.setDuration(220L);
                ofFloat.start();
                d4Var.b1(r42);
                return;
            case 3:
                nh.w3 w3Var = (nh.w3) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) r82;
                nh.d4 d4Var2 = w3Var.f16007l;
                org.telegram.ui.Components.z4.S(d4Var2.getContext(), null, f6Var, new androidx.car.app.utils.a(w3Var, (TL_stories.StoryItem) obj, f6Var, 9));
                nh.w3 w3Var2 = d4Var2.f15208q1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    return;
                }
                return;
            case 4:
                nh.d6 d6Var = (nh.d6) obj2;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) r82;
                Utilities.Callback callback = (Utilities.Callback) obj;
                for (int i12 = 0; i12 < d6Var.f15560i.size(); i12++) {
                    MessageObject messageObject2 = (MessageObject) d6Var.f15560i.get(i12);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f19165id == document.f19165id) {
                        callback.run(document2);
                        return;
                    }
                }
                callback.run(null);
                return;
            case 5:
                nh.t6 t6Var = (nh.t6) obj2;
                TLObject tLObject = (TLObject) r82;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i13 = t6Var.f15897a;
                t6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    t6Var.S = null;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    t6Var.S = new nh.n6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    t6Var.n(tL_error);
                    return;
                }
            case 6:
                nh.c6 c6Var = (nh.c6) r82;
                org.telegram.messenger.h2 h2Var = (org.telegram.messenger.h2) obj;
                ArrayList arrayList = ((nh.d6) obj2).f15560i;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = c6Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f19165id == document3.f19165id) {
                                h2Var.run((nh.c6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f19183id == photo2.f19183id) {
                            h2Var.run((nh.c6) storyItem2);
                            return;
                        }
                    }
                }
                h2Var.run(null);
                return;
            case 7:
                nh.d6 d6Var2 = (nh.d6) obj2;
                TLObject tLObject2 = (TLObject) r82;
                Runnable runnable2 = (Runnable) obj;
                nh.i6 i6Var = d6Var2.f15568q;
                ArrayList arrayList2 = d6Var2.G;
                ArrayList arrayList3 = d6Var2.f15560i;
                ArrayList arrayList4 = d6Var2.H;
                d6Var2.F = 0;
                d6Var2.C = false;
                d6Var2.D = true;
                d6Var2.f15569r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList6.get(i15);
                        i15++;
                        arrayList5.add((TL_bots.botPreviewMedia) obj3);
                    }
                } else if (tLObject2 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList2.clear();
                    arrayList2.addAll(previewinfo.lang_codes);
                    arrayList5.addAll(previewinfo.media);
                } else {
                    return;
                }
                ArrayList arrayList7 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList4.clear();
                int size2 = arrayList5.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj4 = arrayList5.get(i16);
                    i16++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj4;
                    MessageObject messageObject4 = new MessageObject(d6Var2.f15557c, new nh.c6(d6Var2, d6Var2.d, botpreviewmedia));
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList7.size()) {
                            if (MessagesController.equals(((MessageObject) arrayList7.get(i17)).storyItem.media, botpreviewmedia.media)) {
                                messageObject = (MessageObject) arrayList7.get(i17);
                            } else {
                                i17++;
                            }
                        } else {
                            messageObject = null;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = d6Var2.I;
                        d6Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f19180id = id2;
                    storyItem6.f19394id = id2;
                    messageObject4.parentStoriesList = d6Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                }
                AndroidUtilities.cancelRunOnUIThread(i6Var);
                AndroidUtilities.runOnUIThread(i6Var);
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 8:
                nh.i9 i9Var = ((nh.z8) obj2).d;
                i9Var.f15452k0.D(i9Var.h, ((nh.l6) r82).d, (ArrayList) obj);
                return;
            case 9:
                nh.r9 r9Var = (nh.r9) obj2;
                TLObject tLObject3 = (TLObject) r82;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                nh.n5 n5Var = r9Var.f15838f;
                int i18 = r9Var.f15836b;
                nh.r9.f15834g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i18).putUsers(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.f19402id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                r9Var.d = 0;
                if (r9Var.e) {
                    AndroidUtilities.cancelRunOnUIThread(n5Var);
                    AndroidUtilities.runOnUIThread(n5Var, 10000L);
                    return;
                }
                return;
            case 10:
                o3.m mVar = (o3.m) obj2;
                r82.e(mVar.f16254a, mVar.f16255b, (Exception) obj);
                return;
            case 11:
                b4.e0 e0Var = (b4.e0) obj2;
                r82.f(e0Var.f1378b, (o4.v) e0Var.f1379c, (o4.r) obj);
                return;
            case 12:
                ((VideoAds) obj2).lambda$show$3((ic) r82, (TLRPC.TL_sponsoredMessage) obj);
                return;
            case 13:
                ((VideoAds) obj2).lambda$show$5((ic) r82, (boolean[]) obj);
                return;
            case 14:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r82, (Runnable) obj);
                return;
            case 15:
                ((Utilities.Callback2) obj2).run((TLObject) r82, (TLRPC.TL_error) obj);
                return;
            case 16:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r82, (TLRPC.TL_error) obj);
                return;
            case 17:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) r82;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.G;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.G);
                }
                if (!actionBarLayout.h && !actionBarLayout.U) {
                    actionBarLayout.v.setTranslationX(0.0f);
                } else {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.G = null;
                    actionBarLayout.U = false;
                }
                actionBarLayout.m(p2Var);
                p2Var.setRemovingFromStack(false);
                p2Var.onTransitionAnimationEnd(false, true);
                p2Var2.onTransitionAnimationEnd(true, true);
                p2Var2.onBecomeFullyVisible();
                return;
            case 18:
                ((org.telegram.ui.ActionBar.p2) r82).presentFragment((zn) obj);
                ((org.telegram.ui.ActionBar.n3) obj2).f20458c = false;
                return;
            case 19:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj2;
                ArrayList arrayList8 = (ArrayList) r82;
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj;
                n3Var.getClass();
                while (i11 < arrayList8.size()) {
                    if (((org.telegram.ui.ActionBar.k3) arrayList8.get(i11)).f20335a == m3Var) {
                        arrayList8.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                n3Var.invalidate();
                return;
            case 20:
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                TLObject tLObject4 = (TLObject) r82;
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) obj;
                if (tLObject4 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject4;
                    i6Var2.f19786d0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(i6Var2.B).addObserver(i6Var2, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i6Var2.B).addObserver(i6Var2, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(i6Var3.B).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                i6Var2.s();
                return;
            case 21:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj2;
                v0Var.U0.N1(v0Var, (TLRPC.TL_premiumGiftOption) r82, (String) obj);
                return;
            case 22:
                org.telegram.ui.ActionBar.i6 i6Var4 = (org.telegram.ui.ActionBar.i6) r82;
                i6Var4.f19788f = !i6Var4.d((File) obj, i6Var4.f19784c);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.ia(8, (org.telegram.ui.Cells.ka) obj2, i6Var4));
                return;
            case 23:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj2;
                org.telegram.ui.Components.z4.M((Context) r82, f0Var.f24737i0, new androidx.biometric.e0(f0Var, 26), (org.telegram.ui.ActionBar.f6) obj);
                return;
            case 24:
                org.telegram.ui.Components.c8.o((org.telegram.ui.Components.c8) obj2, (org.telegram.ui.ActionBar.d2) r82, (TLObject) obj);
                return;
            case 25:
                we weVar = (we) obj2;
                weVar.getClass();
                ((fv0) r82).getViewTreeObserver().removeOnDrawListener(weVar);
                ((xo0) obj).f30682a.setHideAvatar(true);
                return;
            case 26:
                dg dgVar = (dg) obj2;
                File file = (File) obj;
                try {
                    InputStream openInputStream = dgVar.getContext().getContentResolver().openInputStream((Uri) r82);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        } else {
                            openInputStream.close();
                            fileOutputStream.close();
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new p6(dgVar, arrayList9, file, 27));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 27:
                ((dg) obj2).n((File) obj, (ArrayList) r82);
                return;
            case 28:
                li.n((li) obj2, (AnimationNotificationsLocker) r82, (org.telegram.ui.ActionBar.a3) obj);
                return;
            default:
                final li liVar = (li) obj2;
                final wg wgVar = (wg) obj;
                if (liVar.f26748w0.getCurrentItemTop() <= ((di) r82).getButtonsHideOffset()) {
                    z4 = true;
                }
                float alpha = liVar.U0.getAlpha();
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                o1.j jVar = new o1.j(new kb.a(0.0f));
                jVar.b(new dh(liVar, alpha, f10, z4));
                jVar.a(new o1.f() {
                    @Override
                    public final void a(o1.h hVar, boolean z10, float f11, float f12) {
                        li.t(li.this, z4, wgVar);
                    }
                });
                o1.k kVar = new o1.k(500.0f);
                jVar.f16178u = kVar;
                kVar.a(1.0f);
                jVar.f16178u.b(1000.0f);
                jVar.f();
                liVar.f26728q1 = jVar;
                return;
        }
    }
}
