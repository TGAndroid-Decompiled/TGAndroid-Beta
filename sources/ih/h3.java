package ih;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kh.na;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.v31;
public final class h3 implements Runnable {
    public final int f11497a;
    public final Object f11498b;
    public final Object f11499c;
    public final Object d;

    public h3(Object obj, Object obj2, Object obj3, int i9) {
        this.f11497a = i9;
        this.f11498b = obj;
        this.f11499c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        hg.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r52;
        TLRPC.TL_availableReaction tL_availableReaction2;
        org.telegram.ui.Components.k5 k5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        MessageObject messageObject;
        int id2;
        int[] iArr;
        File file;
        int i9;
        boolean contains;
        int i10;
        boolean z10;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13 = this.f11497a;
        int[] iArr2 = null;
        boolean z11 = false;
        Object obj = this.d;
        ?? r92 = this.f11499c;
        Object obj2 = this.f11498b;
        switch (i13) {
            case 0:
                k3 k3Var = (k3) obj2;
                hg.r0 r0Var = (hg.r0) r92;
                View view = (View) obj;
                ?? r12 = k3Var.f11670a;
                r12.f11579q3 = true;
                g4 g4Var = r12.K1;
                ImageReceiver imageReceiver = r12.f11553h3;
                boolean[] zArr = {false};
                a7 a7Var = r12.A0;
                a7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new m2(1, a7Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                a7 a7Var2 = new a7(r12.getContext(), r12.f11588t1);
                r12.A0 = a7Var2;
                a7Var2.setPadding(dp, dp, dp, dp);
                r12.f11611z0.addView(r12.A0, g7.e6.e(40, 40, 3));
                ?? r22 = r12.f11562k3;
                if (r22 != 0) {
                    r22.o(r12);
                    dVar = null;
                    r12.f11562k3 = null;
                } else {
                    dVar = null;
                }
                ?? r32 = r12.f11556i3;
                if (r32 != 0) {
                    r32.d(r12);
                    r12.f11556i3 = dVar;
                }
                r12.f11564l3 = false;
                if (r0Var.f10718g != 0) {
                    r12.f11564l3 = true;
                    ?? k5Var2 = new org.telegram.ui.Components.k5(2, r12.f11609y2, r0Var.f10718g);
                    r12.f11562k3 = k5Var2;
                    k5Var2.a(r12);
                } else if (r0Var.f10717f != null && (tL_availableReaction = MediaDataController.getInstance(r12.f11609y2).getReactionsMap().get(r0Var.f10717f)) != null) {
                    r12.f11559j3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), hg.n0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().L(0, false, true);
                    }
                }
                r12.A0.setReaction(r0Var);
                if (r12.f11612z1) {
                    TL_stories.StoryItem storyItem3 = g4Var.f11466a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = g4Var.f11466a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        hg.t0.b(null, storyItem4.sent_reaction, storyViews);
                        r12.k1(true);
                    }
                }
                if (r0Var.f10718g != 0 && (k5Var = r12.A0.f11227f) != null) {
                    ?? a2 = hg.d.a(k5Var, false, true);
                    r12.f11556i3 = a2;
                    a2.f(r12);
                }
                r12.O1.g0(r12.f11604x1, g4Var.f11466a, r0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                r12.getLocationInWindow(iArr4);
                r12.f11586s3 = iArr3[0] - iArr4[0];
                r12.f11590t3 = iArr3[1] - iArr4[1];
                r12.f11594u3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r12.f11582r3 = 0.0f;
                r12.invalidate();
                a7 a7Var3 = r12.A0;
                a7Var3.setAllowDrawReaction(false);
                ?? r42 = a7Var3.f11226e;
                if (r0Var.f10718g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(r0Var.f10717f)) != null) {
                    r42.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    r52 = 0;
                    r42.setAutoRepeat(0);
                } else {
                    r52 = 0;
                }
                ofFloat.addUpdateListener(new i3(k3Var, ofFloat, zArr, r52));
                ofFloat.addListener(new j3(k3Var, zArr, a7Var3, r52));
                ofFloat.setDuration(220L);
                ofFloat.start();
                r12.b1(r52);
                return;
            case 1:
                b4 b4Var = (b4) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) r92;
                i4 i4Var = b4Var.f11268l;
                org.telegram.ui.Components.y4.S(i4Var.getContext(), null, b6Var, new androidx.car.app.utils.a(b4Var, (TL_stories.StoryItem) obj, b6Var, 8));
                b4 b4Var2 = i4Var.f11574p1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    return;
                }
                return;
            case 2:
                f6 f6Var = (f6) obj2;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) r92;
                Utilities.Callback callback = (Utilities.Callback) obj;
                for (int i14 = 0; i14 < f6Var.f11851i.size(); i14++) {
                    MessageObject messageObject2 = (MessageObject) f6Var.f11851i.get(i14);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f22386id == document.f22386id) {
                        callback.run(document2);
                        return;
                    }
                }
                callback.run(null);
                return;
            case 3:
                v6 v6Var = (v6) obj2;
                TLObject tLObject = (TLObject) r92;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i15 = v6Var.f12236a;
                v6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    v6Var.S = null;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    v6Var.S = new p6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    v6Var.n(tL_error);
                    return;
                }
            case 4:
                e6 e6Var = (e6) r92;
                org.telegram.messenger.g2 g2Var = (org.telegram.messenger.g2) obj;
                ArrayList arrayList2 = ((f6) obj2).f11851i;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    MessageObject messageObject3 = (MessageObject) arrayList2.get(i16);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = e6Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f22386id == document3.f22386id) {
                                g2Var.run((e6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f22404id == photo2.f22404id) {
                            g2Var.run((e6) storyItem2);
                            return;
                        }
                    }
                }
                g2Var.run(null);
                return;
            case 5:
                f6 f6Var2 = (f6) obj2;
                TLObject tLObject2 = (TLObject) r92;
                Runnable runnable = (Runnable) obj;
                k6 k6Var = f6Var2.f11859q;
                ArrayList arrayList3 = f6Var2.G;
                ArrayList arrayList4 = f6Var2.f11851i;
                ArrayList arrayList5 = f6Var2.H;
                f6Var2.F = 0;
                f6Var2.C = false;
                f6Var2.D = true;
                f6Var2.f11860r = true;
                ArrayList arrayList6 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList arrayList7 = ((Vector) tLObject2).objects;
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList7.get(i17);
                        i17++;
                        arrayList6.add((TL_bots.botPreviewMedia) obj3);
                    }
                } else if (tLObject2 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList3.clear();
                    arrayList3.addAll(previewinfo.lang_codes);
                    arrayList6.addAll(previewinfo.media);
                } else {
                    return;
                }
                ArrayList arrayList8 = new ArrayList(arrayList4);
                arrayList4.clear();
                arrayList5.clear();
                int size2 = arrayList6.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj4 = arrayList6.get(i18);
                    i18++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj4;
                    MessageObject messageObject4 = new MessageObject(f6Var2.f11847c, new e6(f6Var2, f6Var2.d, botpreviewmedia));
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList8.size()) {
                            if (MessagesController.equals(((MessageObject) arrayList8.get(i19)).storyItem.media, botpreviewmedia.media)) {
                                messageObject = (MessageObject) arrayList8.get(i19);
                            } else {
                                i19++;
                            }
                        } else {
                            messageObject = null;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = f6Var2.I;
                        f6Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f22401id = id2;
                    storyItem6.f22617id = id2;
                    messageObject4.parentStoriesList = f6Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList5.isEmpty()) {
                        arrayList5.add(new ArrayList());
                    }
                    ((ArrayList) arrayList5.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList4.add(messageObject4);
                }
                AndroidUtilities.cancelRunOnUIThread(k6Var);
                AndroidUtilities.runOnUIThread(k6Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 6:
                m9 m9Var = ((d9) obj2).d;
                m9Var.f11806j0.D(m9Var.h, ((n6) r92).d, (ArrayList) obj);
                return;
            case 7:
                v9 v9Var = (v9) obj2;
                TLObject tLObject3 = (TLObject) r92;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                g gVar = v9Var.f12271f;
                int i20 = v9Var.f12268b;
                v9.f12266g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i20).putUsers(tL_stories_storyViews.users, false);
                    if (!v9Var.d(tL_stories_getStoriesViews.f22625id, tL_stories_storyViews)) {
                        v9Var.d = 0;
                        v9Var.f12270e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                v9Var.d = 0;
                if (v9Var.f12270e) {
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar, 10000L);
                    return;
                }
                return;
            case 8:
                j3.n nVar = ((j3.m) obj2).f13292b;
                int i21 = d5.f0.f4349a;
                nVar.getClass();
                i3.f fVar = ((h3.h0) nVar).f9440a.f9557r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1009, new h9.a(k10, (h3.t0) r92, (k3.l) obj, 18));
                return;
            case 9:
                j4.h0 h0Var = (j4.h0) obj2;
                r92.b(h0Var.f13464a, h0Var.f13465b, (j4.y) obj);
                return;
            case 10:
                kh.a2 a2Var = (kh.a2) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList9 = a2Var.v;
                kh.b2 b2Var = a2Var.J;
                ArrayList arrayList10 = a2Var.f14885s;
                if (TextUtils.equals((String) r92, a2Var.D)) {
                    a2Var.f14887x = 0;
                    arrayList10.clear();
                    arrayList9.clear();
                    a2Var.f14888y.clear();
                    a2Var.f14883n.clear();
                    a2Var.f14887x++;
                    arrayList10.add(null);
                    arrayList9.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList10.addAll(tL_messages_stickers.stickers);
                        a2Var.f14887x = tL_messages_stickers.stickers.size() + a2Var.f14887x;
                    }
                    a2Var.E = a2Var.D;
                    a2Var.l();
                    kh.q1.w1(b2Var.f14982b, 0, 0);
                    b2Var.f14985f.c(false);
                    b2Var.f14984e.n(false);
                    return;
                }
                return;
            case 11:
                kh.m3 m3Var = (kh.m3) obj2;
                String str = (String) obj;
                float f10 = m3Var.G;
                if (r92 != 0) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (r92 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) r92;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        m3Var.c(photoEntry, options);
                        kh.a8.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = m3Var.c(photoEntry, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f10) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = kh.o0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i22 = photoEntry.gradientTopColor;
                                if (i22 != 0 && (i9 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i22, i9};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c10;
                    } else if ((r92 instanceof kh.a8) && (file = ((kh.a8) r92).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        kh.a8.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new h3(m3Var, str, iArr2, 12));
                return;
            case 12:
                kh.m3 m3Var2 = (kh.m3) obj2;
                String str2 = (String) r92;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                ?? r23 = m3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        kh.m3.f15676b0.put(str2, bitmap);
                        HashMap hashMap = kh.m3.f15675a0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, m3Var2.N)) {
                        kh.m3.d(str2);
                        return;
                    }
                    m3Var2.f15677a = bitmap;
                    if (iArr5 == null) {
                        r23.setShader(null);
                        m3Var2.f15680e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        m3Var2.f15680e = linearGradient;
                        r23.setShader(linearGradient);
                    }
                    m3Var2.h();
                    m3Var2.invalidate();
                    return;
                }
                return;
            case 13:
                kh.p3 p3Var = (kh.p3) obj2;
                TLObject tLObject5 = (TLObject) r92;
                MessagesController messagesController = (MessagesController) obj;
                p3Var.f15830r = true;
                p3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(p3Var.f15832w.f15858a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    p3Var.E();
                    return;
                }
                return;
            case 14:
                String[] strArr = (String[]) obj2;
                int[][] iArr6 = (int[][]) r92;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) obj;
                for (int i23 = 0; i23 < strArr.length; i23++) {
                    String str3 = strArr[i23];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr6[i23], 0L);
                    }
                }
                AndroidUtilities.runOnUIThread(cVar);
                return;
            case 15:
                AnimatedFileNative.d((String) obj2, ((int[][]) r92)[0], 0L);
                AndroidUtilities.runOnUIThread((androidx.car.app.utils.c) obj);
                return;
            case 16:
                kh.n9 n9Var = (kh.n9) obj2;
                TLObject tLObject6 = (TLObject) r92;
                MessagesController messagesController2 = (MessagesController) obj;
                kh.t9 t9Var = n9Var.S;
                n9Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i24 = kh.t9.Z;
                    ArrayList h12 = t9Var.h1();
                    for (int i25 = 0; i25 < h12.size(); i25++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i25);
                        if (user != null && (contains = n9Var.f15769c.contains(Long.valueOf(user.f22527id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i10 = user.flags2 | 4;
                            } else {
                                i10 = user.flags2 & (-5);
                            }
                            user.flags2 = i10;
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                t9Var.f1();
                if (t9Var.V) {
                    t9Var.g1(new kh.r9(1, kh.t9.F(t9Var), (ArrayList) null), new y3(t9Var, 1), false);
                    return;
                }
                t9Var.f1();
                t9Var.f16097b.D(0);
                return;
            case 17:
                ((kh.a8) r92).O0 = (File) obj;
                na naVar = ((wb) obj2).Z0;
                if (naVar != null) {
                    naVar.f15689b.U2.N(false);
                    return;
                }
                return;
            case 18:
                wb wbVar = (wb) obj2;
                Bitmap bitmap2 = (Bitmap) r92;
                Runnable runnable2 = (Runnable) obj;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), wbVar.f16322x0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 19:
                ArrayList arrayList11 = (ArrayList) obj2;
                HashMap hashMap2 = (HashMap) r92;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                ArrayList arrayList12 = new ArrayList();
                for (int i26 = 0; i26 < arrayList11.size(); i26++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList11.get(i26);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f22527id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj5 = new Object();
                    obj5.f18046a = user2;
                    obj5.f18047b = z10;
                    arrayList12.add(obj5);
                }
                callback2.run(arrayList12);
                return;
            case 20:
                mh.r1 r1Var = (mh.r1) obj;
                ((boolean[]) obj2)[0] = false;
                if (((TLObject) r92) instanceof TLRPC.TL_boolTrue) {
                    r1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 21:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                mh.c3 c3Var = ((mh.x2) obj2).d;
                if (((TLObject) r92) instanceof TLRPC.TL_boolTrue) {
                    mh.u2 u2Var = c3Var.f17778x;
                    u2Var.getClass();
                    u2Var.v("emoji_status_access_requested", org.telegram.ui.web.y0.x("cancelled", "status"));
                    return;
                }
                new oc(c3Var.f17763l0, c3Var.A).Y(tL_error2).k(true);
                return;
            case 22:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) r92;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                oc.a0((mh.u3) obj2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, mh.l.F0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                return;
            case 23:
                mh.u3.z0((mh.u3) obj2, (TLObject) r92, (org.telegram.ui.ActionBar.c2) obj);
                return;
            case 24:
                of.r rVar = (of.r) obj;
                int i27 = ((of.f0) obj2).f19303o0;
                MessagesController messagesController3 = MessagesController.getInstance(i27);
                Iterator it = ((HashSet) r92).iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l10 = (Long) pair2.second;
                    long longValue = l10.longValue();
                    if (booleanValue) {
                        concurrentHashMap = messagesController3.dialogs_read_outbox_max;
                    } else {
                        concurrentHashMap = messagesController3.dialogs_read_inbox_max;
                    }
                    concurrentHashMap.put(l10, Integer.valueOf(MessagesStorage.getInstance(i27).getDialogReadMaxSync(booleanValue, longValue)));
                }
                AndroidUtilities.runOnUIThread(rVar);
                return;
            case 25:
                ((of.d0) obj2).b((a0.h) obj, (ArrayList) r92);
                return;
            case 26:
                of.f1 f1Var = (of.f1) obj2;
                String str4 = (String) r92;
                TLObject tLObject7 = (TLObject) obj;
                f1Var.A0 = 0;
                if (str4.equals(f1Var.f19353z0) && (tLObject7 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject7;
                    ArrayList arrayList13 = f1Var.f19348w0;
                    if (arrayList13 != null) {
                        i11 = arrayList13.size();
                    } else {
                        i11 = 0;
                    }
                    f1Var.F("sticker_search_".concat(str4), tL_messages_stickers2.stickers);
                    ArrayList arrayList14 = f1Var.f19348w0;
                    if (arrayList14 != null) {
                        i12 = arrayList14.size();
                    } else {
                        i12 = 0;
                    }
                    if (!f1Var.f19333k0 && (arrayList = f1Var.f19348w0) != null && !arrayList.isEmpty()) {
                        f1Var.H();
                        r90 r90Var = f1Var.R;
                        if (f1Var.K() > 0) {
                            z11 = true;
                        }
                        r90Var.a(z11);
                        f1Var.f19333k0 = true;
                    }
                    if (i11 != i12) {
                        f1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                of.f1 f1Var2 = (of.f1) obj2;
                f1Var2.f19334l0 = null;
                f1Var2.Y((a0.h) obj, (ArrayList) r92, true);
                return;
            case 28:
                of.v1 v1Var = (of.v1) obj2;
                ArrayList arrayList15 = (ArrayList) r92;
                v1Var.f19538q = arrayList15;
                v1Var.f19539r = (HashMap) obj;
                v1Var.f19540s = true;
                v1Var.f19524a.H0(arrayList15);
                return;
            default:
                of.w1 w1Var = (of.w1) obj2;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj;
                String str5 = ((TLRPC.TL_messages_searchStickerSets) r92).f22492q;
                of.y1 y1Var = w1Var.f19543a;
                String str6 = y1Var.N;
                v31 v31Var = y1Var.f19551e;
                if (str5.equals(str6)) {
                    w1Var.a();
                    v31Var.f33257b.h.getProgressDrawable().f33974e = false;
                    y1Var.J = 0;
                    v31Var.b(true);
                    y1Var.A.addAll(tL_messages_foundStickerSets.sets);
                    y1Var.l();
                    return;
                }
                return;
        }
    }
}
