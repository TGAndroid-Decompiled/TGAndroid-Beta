package mh;

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
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.xn;
public final class p6 implements Runnable {
    public final int f14589a;
    public final Object f14590b;
    public final Object f14591c;
    public final Object d;

    public p6(Object obj, Object obj2, Object obj3, int i10) {
        this.f14589a = i10;
        this.f14590b = obj;
        this.f14591c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ng.d dVar;
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
        int i10 = this.f14589a;
        int i11 = 0;
        final boolean z4 = false;
        Object obj = this.d;
        ?? r82 = this.f14591c;
        Object obj2 = this.f14590b;
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
                ((org.telegram.ui.ActionBar.h3[]) obj)[0].dismiss();
                return;
            case 2:
                o3.l lVar = (o3.l) obj2;
                r82.e(lVar.f16412a, lVar.f16413b, (Exception) obj);
                return;
            case 3:
                b4.e0 e0Var = (b4.e0) obj2;
                r82.f(e0Var.f1474b, (o4.v) e0Var.f1475c, (o4.r) obj);
                return;
            case 4:
                oh.i3 i3Var = (oh.i3) obj2;
                ng.q0 q0Var = (ng.q0) r82;
                View view = (View) obj;
                oh.f4 f4Var = i3Var.f17208a;
                f4Var.f17105r3 = true;
                oh.d4 d4Var = f4Var.L1;
                ImageReceiver imageReceiver = f4Var.f17079i3;
                boolean[] zArr = {false};
                oh.y6 y6Var = f4Var.B0;
                y6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new oh.m2(1, y6Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                oh.y6 y6Var2 = new oh.y6(f4Var.getContext(), f4Var.f17114u1);
                f4Var.B0 = y6Var2;
                y6Var2.setPadding(dp, dp, dp, dp);
                f4Var.A0.addView(f4Var.B0, k7.c6.e(40, 40, 3));
                org.telegram.ui.Components.l5 l5Var2 = f4Var.f17087l3;
                if (l5Var2 != null) {
                    l5Var2.o(f4Var);
                    dVar = null;
                    f4Var.f17087l3 = null;
                } else {
                    dVar = null;
                }
                ng.d dVar2 = f4Var.f17082j3;
                if (dVar2 != null) {
                    dVar2.d(f4Var);
                    f4Var.f17082j3 = dVar;
                }
                f4Var.f17090m3 = false;
                if (q0Var.f16181g != 0) {
                    f4Var.f17090m3 = true;
                    j10 = 0;
                    org.telegram.ui.Components.l5 l5Var3 = new org.telegram.ui.Components.l5(2, f4Var.f17135z2, q0Var.f16181g);
                    f4Var.f17087l3 = l5Var3;
                    l5Var3.a(f4Var);
                } else {
                    j10 = 0;
                    if (q0Var.f16180f != null && (tL_availableReaction = MediaDataController.getInstance(f4Var.f17135z2).getReactionsMap().get(q0Var.f16180f)) != null) {
                        f4Var.f17085k3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a(), null, null, null, 0);
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().L(0, false, true);
                        }
                    }
                }
                f4Var.B0.setReaction(q0Var);
                if (f4Var.A1) {
                    TL_stories.StoryItem storyItem3 = d4Var.f16963a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = d4Var.f16963a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        ng.s0.b(null, storyItem4.sent_reaction, storyViews);
                        f4Var.k1(true);
                    }
                }
                if (q0Var.f16181g != j10 && (l5Var = f4Var.B0.f17962f) != null) {
                    ng.d a2 = ng.d.a(l5Var, false, true);
                    f4Var.f17082j3 = a2;
                    a2.f(f4Var);
                }
                f4Var.P1.g0(f4Var.f17130y1, d4Var.f16963a, q0Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                f4Var.getLocationInWindow(iArr2);
                f4Var.f17112t3 = iArr[0] - iArr2[0];
                f4Var.f17116u3 = iArr[1] - iArr2[1];
                f4Var.f17120v3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f4Var.f17108s3 = 0.0f;
                f4Var.invalidate();
                oh.y6 y6Var3 = f4Var.B0;
                y6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = y6Var3.f17961e;
                if (q0Var.f16181g == j10 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f16180f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    r42 = 0;
                    imageReceiver2.setAutoRepeat(0);
                } else {
                    r42 = 0;
                }
                ofFloat.addUpdateListener(new eg.q(i3Var, ofFloat, zArr, 1));
                ofFloat.addListener(new oh.h3(i3Var, zArr, y6Var3, r42));
                ofFloat.setDuration(220L);
                ofFloat.start();
                f4Var.b1(r42);
                return;
            case 5:
                oh.y3 y3Var = (oh.y3) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) r82;
                oh.f4 f4Var2 = y3Var.f17952l;
                org.telegram.ui.Components.z4.S(f4Var2.getContext(), null, g6Var, new androidx.car.app.utils.a(y3Var, (TL_stories.StoryItem) obj, g6Var, 9));
                oh.y3 y3Var2 = f4Var2.f17100q1;
                if (y3Var2 != null) {
                    y3Var2.a();
                    return;
                }
                return;
            case 6:
                oh.d6 d6Var = (oh.d6) obj2;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) r82;
                Utilities.Callback callback = (Utilities.Callback) obj;
                for (int i12 = 0; i12 < d6Var.f17404i.size(); i12++) {
                    MessageObject messageObject2 = (MessageObject) d6Var.f17404i.get(i12);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f20851id == document.f20851id) {
                        callback.run(document2);
                        return;
                    }
                }
                callback.run(null);
                return;
            case 7:
                oh.t6 t6Var = (oh.t6) obj2;
                TLObject tLObject = (TLObject) r82;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i13 = t6Var.f17772a;
                t6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    t6Var.S = null;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    t6Var.S = new oh.n6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    t6Var.n(tL_error);
                    return;
                }
            case 8:
                oh.c6 c6Var = (oh.c6) r82;
                org.telegram.messenger.h2 h2Var = (org.telegram.messenger.h2) obj;
                ArrayList arrayList = ((oh.d6) obj2).f17404i;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = c6Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f20851id == document3.f20851id) {
                                h2Var.run((oh.c6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f20869id == photo2.f20869id) {
                            h2Var.run((oh.c6) storyItem2);
                            return;
                        }
                    }
                }
                h2Var.run(null);
                return;
            case 9:
                oh.d6 d6Var2 = (oh.d6) obj2;
                TLObject tLObject2 = (TLObject) r82;
                Runnable runnable2 = (Runnable) obj;
                oh.i6 i6Var = d6Var2.f17412q;
                ArrayList arrayList2 = d6Var2.G;
                ArrayList arrayList3 = d6Var2.f17404i;
                ArrayList arrayList4 = d6Var2.H;
                d6Var2.F = 0;
                d6Var2.C = false;
                d6Var2.D = true;
                d6Var2.f17413r = true;
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
                    MessageObject messageObject4 = new MessageObject(d6Var2.f17400c, new oh.c6(d6Var2, d6Var2.d, botpreviewmedia));
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
                    message.f20866id = id2;
                    storyItem6.f21082id = id2;
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
            case 10:
                oh.i9 i9Var = ((oh.z8) obj2).d;
                i9Var.f17279k0.D(i9Var.h, ((oh.l6) r82).d, (ArrayList) obj);
                return;
            case 11:
                oh.r9 r9Var = (oh.r9) obj2;
                TLObject tLObject3 = (TLObject) r82;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                oh.t3 t3Var = r9Var.f17709f;
                int i18 = r9Var.f17706b;
                oh.r9.f17704g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i18).putUsers(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.f21090id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.f17708e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                r9Var.d = 0;
                if (r9Var.f17708e) {
                    AndroidUtilities.cancelRunOnUIThread(t3Var);
                    AndroidUtilities.runOnUIThread(t3Var, 10000L);
                    return;
                }
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
                ((org.telegram.ui.ActionBar.p2) r82).presentFragment((xn) obj);
                ((org.telegram.ui.ActionBar.o3) obj2).f22196c = false;
                return;
            case 19:
                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) obj2;
                ArrayList arrayList8 = (ArrayList) r82;
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                o3Var.getClass();
                while (i11 < arrayList8.size()) {
                    if (((org.telegram.ui.ActionBar.l3) arrayList8.get(i11)).f22067a == n3Var) {
                        arrayList8.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                o3Var.invalidate();
                return;
            case 20:
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj2;
                TLObject tLObject4 = (TLObject) r82;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) obj;
                if (tLObject4 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject4;
                    j6Var.f21511d0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(j6Var.B).addObserver(j6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(j6Var.B).addObserver(j6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(j6Var2.B).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                j6Var.s();
                return;
            case 21:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj2;
                v0Var.U0.Q1(v0Var, (TLRPC.TL_premiumGiftOption) r82, (String) obj);
                return;
            case 22:
                org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) r82;
                j6Var3.f21514f = !j6Var3.d((File) obj, j6Var3.f21509c);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.ja(8, (org.telegram.ui.Cells.la) obj2, j6Var3));
                return;
            case 23:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj2;
                org.telegram.ui.Components.z4.M((Context) r82, f0Var.f26714i0, new oh.h4(f0Var, 1), (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 24:
                org.telegram.ui.Components.c8.o((org.telegram.ui.Components.c8) obj2, (org.telegram.ui.ActionBar.d2) r82, (TLObject) obj);
                return;
            case 25:
                we weVar = (we) obj2;
                weVar.getClass();
                ((fv0) r82).getViewTreeObserver().removeOnDrawListener(weVar);
                ((yo0) obj).f33579a.setHideAvatar(true);
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
                mi.n((mi) obj2, (AnimationNotificationsLocker) r82, (org.telegram.ui.ActionBar.b3) obj);
                return;
            default:
                final mi miVar = (mi) obj2;
                final wg wgVar = (wg) obj;
                if (miVar.f29122w0.getCurrentItemTop() <= ((ei) r82).getButtonsHideOffset()) {
                    z4 = true;
                }
                float alpha = miVar.U0.getAlpha();
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                o1.j jVar = new o1.j(new kb.a(0.0f));
                jVar.b(new dh(miVar, alpha, f10, z4));
                jVar.a(new o1.f() {
                    @Override
                    public final void a(o1.h hVar, boolean z10, float f11, float f12) {
                        mi.t(mi.this, z4, wgVar);
                    }
                });
                o1.k kVar = new o1.k(500.0f);
                jVar.f16338u = kVar;
                kVar.a(1.0f);
                jVar.f16338u.b(1000.0f);
                jVar.f();
                miVar.f29102q1 = jVar;
                return;
        }
    }
}
