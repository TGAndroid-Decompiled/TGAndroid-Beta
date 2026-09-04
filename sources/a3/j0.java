package a3;

import ah.e1;
import ah.j1;
import ah.m1;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import bi.a8;
import bi.b5;
import bi.b8;
import bi.f5;
import bi.g8;
import bi.gb;
import bi.i4;
import bi.j3;
import bi.j4;
import bi.k4;
import bi.l8;
import bi.m5;
import bi.n8;
import bi.o5;
import bi.oa;
import bi.pb;
import bi.u8;
import bi.yb;
import bi.z8;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.ba;
import di.d2;
import di.e2;
import di.fb;
import di.ga;
import di.ia;
import di.n0;
import di.o8;
import di.p1;
import di.pc;
import di.s3;
import di.w3;
import fi.b3;
import fi.e4;
import fi.f3;
import fi.k3;
import fi.v1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
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
import org.telegram.messenger.g2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.web.d1;
import w7.x5;
public final class j0 implements Runnable {
    public final int f126a;
    public final Object f127b;
    public final Object f128c;
    public final Object d;

    public j0(Object obj, Object obj2, Object obj3, int i10) {
        this.f126a = i10;
        this.f127b = obj;
        this.f128c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ah.e eVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        q5 q5Var;
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
        int i10;
        boolean contains;
        int i11;
        boolean z10;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        int[] iArr2 = null;
        boolean z11 = true;
        int i12 = 0;
        switch (this.f126a) {
            case 0:
                b2.s sVar = (b2.s) this.f128c;
                String str = e2.d0.f8737a;
                i2.f0 f0Var = ((i2.c0) ((pf.b) this.f127b).f44047c).f11471a;
                f0Var.Q = sVar;
                j2.f fVar = f0Var.f11533s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.c(p5, sVar, (i2.i) this.d, 15));
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f127b;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) this.f128c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).f1638c.compareTo(androidx.lifecycle.n.f1616c) < 0) {
                            z11 = false;
                        }
                        if (z11) {
                            cVar.a();
                            return;
                        }
                    } catch (w.g e7) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + cVar);
                return;
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f127b;
                String str3 = (String) this.f128c;
                try {
                    androidx.car.app.utils.i.d(str3.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.c) this.d).a(), str3, 0));
                    return;
                } catch (RuntimeException e10) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e10);
                    throw new RuntimeException(e10);
                } catch (w.g e11) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e11);
                    return;
                }
            case 3:
                androidx.biometric.s sVar2 = (androidx.biometric.s) this.f127b;
                v7.w wVar = (v7.w) this.f128c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = v7.v.a(sVar2.f1055a);
                    if (a2 != null) {
                        androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.f1343b);
                        synchronized (qVar.d) {
                            qVar.f1371f = threadPoolExecutor;
                        }
                        ((androidx.emoji2.text.k) a2.f1343b).a(new androidx.emoji2.text.m(wVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    wVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                k4 k4Var = (k4) this.f127b;
                j1 j1Var = (j1) this.f128c;
                View view = (View) this.d;
                o5 o5Var = k4Var.f3194a;
                o5Var.f3465u3 = true;
                m5 m5Var = o5Var.O1;
                ImageReceiver imageReceiver = o5Var.f3438l3;
                boolean[] zArr = {false};
                z8 z8Var = o5Var.E0;
                z8Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new j3(1, z8Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                z8 z8Var2 = new z8(o5Var.getContext(), o5Var.f3474x1);
                o5Var.E0 = z8Var2;
                z8Var2.setPadding(dp, dp, dp, dp);
                o5Var.D0.addView(o5Var.E0, x5.e(40, 40, 3));
                q5 q5Var2 = o5Var.f3447o3;
                if (q5Var2 != null) {
                    q5Var2.o(o5Var);
                    eVar = null;
                    o5Var.f3447o3 = null;
                } else {
                    eVar = null;
                }
                ah.e eVar2 = o5Var.f3441m3;
                if (eVar2 != null) {
                    eVar2.d(o5Var);
                    o5Var.f3441m3 = eVar;
                }
                o5Var.f3450p3 = false;
                if (j1Var.f598g != 0) {
                    o5Var.f3450p3 = true;
                    q5 q5Var3 = new q5(2, o5Var.C2, j1Var.f598g);
                    o5Var.f3447o3 = q5Var3;
                    q5Var3.a(o5Var);
                } else if (j1Var.f597f != null && (tL_availableReaction = MediaDataController.getInstance(o5Var.C2).getReactionsMap().get(j1Var.f597f)) != null) {
                    o5Var.f3444n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), e1.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().L(0, false, true);
                    }
                }
                o5Var.E0.setReaction(j1Var);
                if (o5Var.D1) {
                    TL_stories.StoryItem storyItem3 = m5Var.f3310a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = m5Var.f3310a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        m1.b(null, storyItem4.sent_reaction, storyViews);
                        o5Var.k1(true);
                    }
                }
                if (j1Var.f598g != 0 && (q5Var = o5Var.E0.f4069f) != null) {
                    ah.e a10 = ah.e.a(q5Var, false, true);
                    o5Var.f3441m3 = a10;
                    a10.f(o5Var);
                }
                o5Var.S1.g0(o5Var.B1, m5Var.f3310a, j1Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                o5Var.getLocationInWindow(iArr4);
                o5Var.f3472w3 = iArr3[0] - iArr4[0];
                o5Var.f3476x3 = iArr3[1] - iArr4[1];
                o5Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                o5Var.f3468v3 = 0.0f;
                o5Var.invalidate();
                z8 z8Var3 = o5Var.E0;
                z8Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = z8Var3.f4068e;
                if (j1Var.f598g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(j1Var.f597f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new i4(k4Var, ofFloat, zArr, 0));
                ofFloat.addListener(new j4(k4Var, zArr, z8Var3, 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                o5Var.b1(false);
                return;
            case 5:
                f5 f5Var = (f5) this.f127b;
                f6 f6Var = (f6) this.f128c;
                o5 o5Var2 = f5Var.f2972l;
                e5.S(o5Var2.getContext(), null, f6Var, new androidx.car.app.utils.a(f5Var, (TL_stories.StoryItem) this.d, f6Var, 2));
                f5 f5Var2 = o5Var2.f3460t1;
                if (f5Var2 != null) {
                    f5Var2.a();
                    return;
                }
                return;
            case 6:
                b8 b8Var = (b8) this.f127b;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.f128c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                while (i12 < b8Var.f3275i.size()) {
                    MessageObject messageObject2 = (MessageObject) b8Var.f3275i.get(i12);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f19875id == document.f19875id) {
                        callback.run(document2);
                        return;
                    }
                    i12++;
                }
                callback.run(null);
                return;
            case 7:
                u8 u8Var = (u8) this.f127b;
                TLObject tLObject = (TLObject) this.f128c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i13 = u8Var.f3805a;
                u8Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    u8Var.S = null;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    u8Var.S = new n8(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    u8Var.n(tL_error);
                    return;
                }
            case 8:
                a8 a8Var = (a8) this.f128c;
                g2 g2Var = (g2) this.d;
                ArrayList arrayList = ((b8) this.f127b).f3275i;
                while (i12 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i12);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = a8Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f19875id == document3.f19875id) {
                                g2Var.run((a8) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f19893id == photo2.f19893id) {
                            g2Var.run((a8) storyItem2);
                            return;
                        }
                    }
                    i12++;
                }
                g2Var.run(null);
                return;
            case 9:
                b8 b8Var2 = (b8) this.f127b;
                TLObject tLObject2 = (TLObject) this.f128c;
                Runnable runnable = (Runnable) this.d;
                g8 g8Var = b8Var2.f3283q;
                ArrayList arrayList2 = b8Var2.G;
                ArrayList arrayList3 = b8Var2.f3275i;
                ArrayList arrayList4 = b8Var2.H;
                b8Var2.F = 0;
                b8Var2.C = false;
                b8Var2.D = true;
                b8Var2.f3284r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList6.get(i14);
                        i14++;
                        arrayList5.add((TL_bots.botPreviewMedia) obj);
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
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList5.get(i15);
                    i15++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList8 = arrayList5;
                    MessageObject messageObject4 = new MessageObject(b8Var2.f3271c, new a8(b8Var2, b8Var2.d, botpreviewmedia));
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList7.size()) {
                            if (MessagesController.equals(((MessageObject) arrayList7.get(i16)).storyItem.media, botpreviewmedia.media)) {
                                messageObject = (MessageObject) arrayList7.get(i16);
                            } else {
                                i16++;
                            }
                        } else {
                            messageObject = null;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = b8Var2.I;
                        b8Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f19890id = id2;
                    storyItem6.f20107id = id2;
                    messageObject4.parentStoriesList = b8Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    arrayList5 = arrayList8;
                }
                AndroidUtilities.cancelRunOnUIThread(g8Var);
                AndroidUtilities.runOnUIThread(g8Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 10:
                pb pbVar = ((gb) this.f127b).d;
                pbVar.f3561n0.D(pbVar.h, ((l8) this.f128c).d, (ArrayList) this.d);
                return;
            case 11:
                yb ybVar = (yb) this.f127b;
                TLObject tLObject3 = (TLObject) this.f128c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                oa oaVar = ybVar.f4031f;
                int i17 = ybVar.f4028b;
                yb.f4026g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i17).putUsers(tL_stories_storyViews.users, false);
                    if (!ybVar.d(tL_stories_getStoriesViews.f20115id, tL_stories_storyViews)) {
                        ybVar.d = 0;
                        ybVar.f4030e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                ybVar.d = 0;
                if (ybVar.f4030e) {
                    AndroidUtilities.cancelRunOnUIThread(oaVar);
                    AndroidUtilities.runOnUIThread(oaVar, 10000L);
                    return;
                }
                return;
            case 12:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.f127b;
                Intent intent = (Intent) this.f128c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 13:
                d2 d2Var = (d2) this.f127b;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList9 = d2Var.v;
                e2 e2Var = d2Var.N;
                ArrayList arrayList10 = d2Var.f7056s;
                if (TextUtils.equals((String) this.f128c, d2Var.H)) {
                    d2Var.f7058x = 0;
                    arrayList10.clear();
                    arrayList9.clear();
                    d2Var.f7059y.clear();
                    d2Var.f7054n.clear();
                    d2Var.f7058x++;
                    arrayList10.add(null);
                    arrayList9.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList10.addAll(tL_messages_stickers.stickers);
                        d2Var.f7058x = tL_messages_stickers.stickers.size() + d2Var.f7058x;
                    }
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    p1.v1(e2Var.f7154b, 0, 0);
                    e2Var.f7157f.c(false);
                    e2Var.f7156e.n(false);
                    return;
                }
                return;
            case 14:
                s3 s3Var = (s3) this.f127b;
                Object obj3 = this.f128c;
                String str4 = (String) this.d;
                float f7 = s3Var.K;
                if (obj3 != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj3 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        s3Var.c(photoEntry, options);
                        o8.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = s3Var.c(photoEntry, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = n0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i18 = photoEntry.gradientTopColor;
                                if (i18 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i18, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c10;
                    } else if ((obj3 instanceof o8) && (file = ((o8) obj3).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        o8.C(options2, min);
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
                AndroidUtilities.runOnUIThread(new j0(s3Var, str4, iArr2, 15));
                return;
            case 15:
                s3 s3Var2 = (s3) this.f127b;
                String str5 = (String) this.f128c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = s3Var2.d;
                if (bitmap != null) {
                    if (str5 != null) {
                        s3.f8105f0.put(str5, bitmap);
                        HashMap hashMap = s3.f8104e0;
                        Integer num = (Integer) hashMap.get(str5);
                        if (num != null) {
                            hashMap.put(str5, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str5, 1);
                        }
                    }
                    if (!TextUtils.equals(str5, s3Var2.R)) {
                        s3.d(str5);
                        return;
                    }
                    s3Var2.f8106a = bitmap;
                    if (iArr5 == null) {
                        paint.setShader(null);
                        s3Var2.f8111e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        s3Var2.f8111e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    s3Var2.h();
                    s3Var2.invalidate();
                    return;
                }
                return;
            case 16:
                w3 w3Var = (w3) this.f127b;
                TLObject tLObject5 = (TLObject) this.f128c;
                MessagesController messagesController = (MessagesController) this.d;
                w3Var.f8323r = true;
                w3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(w3Var.f8325w.f8362a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    w3Var.E();
                    return;
                }
                return;
            case 17:
                String[] strArr = (String[]) this.f127b;
                int[][] iArr6 = (int[][]) this.f128c;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.d;
                while (i12 < strArr.length) {
                    String str6 = strArr[i12];
                    if (str6 != null) {
                        AnimatedFileNative.d(str6, iArr6[i12], 0L);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(bVar);
                return;
            case 18:
                AnimatedFileNative.d((String) this.f127b, ((int[][]) this.f128c)[0], 0L);
                AndroidUtilities.runOnUIThread((androidx.car.app.utils.b) this.d);
                return;
            case 19:
                ba baVar = (ba) this.f127b;
                TLObject tLObject6 = (TLObject) this.f128c;
                MessagesController messagesController2 = (MessagesController) this.d;
                ia iaVar = baVar.W;
                baVar.v.setLoading(false);
                if (tLObject6 != null) {
                    int i19 = ia.f7388d0;
                    ArrayList h12 = iaVar.h1();
                    for (int i20 = 0; i20 < h12.size(); i20++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i20);
                        if (user != null && (contains = baVar.f6958c.contains(Long.valueOf(user.f20016id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i11 = user.flags2 | 4;
                            } else {
                                i11 = user.flags2 & (-5);
                            }
                            user.flags2 = i11;
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                iaVar.f1();
                if (iaVar.Z) {
                    iaVar.g1(new ga(1, ia.G(iaVar), (ArrayList) null), new b5(iaVar, 1), false);
                    return;
                }
                iaVar.f1();
                iaVar.f7390b.D(0);
                return;
            case 20:
                ((o8) this.f128c).O0 = (File) this.d;
                fb fbVar = ((pc) this.f127b).f7853d1;
                if (fbVar != null) {
                    fbVar.f8234b.Y2.N(false);
                    return;
                }
                return;
            case 21:
                pc pcVar = (pc) this.f127b;
                Bitmap bitmap2 = (Bitmap) this.f128c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), pcVar.B0.getMatrix(), true);
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
            case 22:
                i9.w wVar2 = (i9.w) this.f127b;
                i9.c0 c0Var = (i9.c0) this.f128c;
                try {
                    try {
                        c0Var.o(((i9.p) this.d).apply(v7.l8.a(wVar2)));
                        return;
                    } catch (Throwable th3) {
                        c0Var.n(th3);
                        return;
                    }
                } catch (Error e12) {
                    e = e12;
                    c0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
                    c0Var.cancel(false);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    c0Var.n(e);
                    return;
                } catch (ExecutionException e14) {
                    e = e14;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    c0Var.n(e);
                    return;
                }
            case 23:
                i9.c0 c0Var2 = (i9.c0) this.f127b;
                ji.b5 b5Var = (ji.b5) this.f128c;
                m4.p1 p1Var = (m4.p1) this.d;
                try {
                    if (!(c0Var2.f11917a instanceof i9.a)) {
                        b5Var.run();
                        c0Var2.m(p1Var);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    c0Var2.n(th4);
                    return;
                }
            case 24:
                ArrayList arrayList11 = (ArrayList) this.f127b;
                HashMap hashMap2 = (HashMap) this.f128c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                ArrayList arrayList12 = new ArrayList();
                for (int i21 = 0; i21 < arrayList11.size(); i21++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList11.get(i21);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f20016id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj4 = new Object();
                    obj4.f9915a = user2;
                    obj4.f9916b = z10;
                    arrayList12.add(obj4);
                }
                callback2.run(arrayList12);
                return;
            case 25:
                v1 v1Var = (v1) this.d;
                ((boolean[]) this.f127b)[0] = false;
                if (((TLObject) this.f128c) instanceof TLRPC.TL_boolTrue) {
                    v1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 26:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                k3 k3Var = ((f3) this.f127b).d;
                if (((TLObject) this.f128c) instanceof TLRPC.TL_boolTrue) {
                    b3 b3Var = k3Var.f9789x;
                    b3Var.getClass();
                    b3Var.z("emoji_status_access_requested", d1.B("cancelled", "status"));
                    return;
                }
                new yc(k3Var.f9778p0, k3Var.E).Y(tL_error2).k(true);
                return;
            case 27:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f128c;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                yc.a0((e4) this.f127b).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, fi.m.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) this.d))), R.raw.copy).j();
                return;
            case 28:
                e4.A0((e4) this.f127b, (TLObject) this.f128c, (b2) this.d);
                return;
            default:
                hg.s sVar3 = (hg.s) this.d;
                int i22 = ((hg.i0) this.f127b).f11093s0;
                MessagesController messagesController3 = MessagesController.getInstance(i22);
                Iterator it = ((HashSet) this.f128c).iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l4 = (Long) pair2.second;
                    long longValue = l4.longValue();
                    if (booleanValue) {
                        concurrentHashMap = messagesController3.dialogs_read_outbox_max;
                    } else {
                        concurrentHashMap = messagesController3.dialogs_read_inbox_max;
                    }
                    concurrentHashMap.put(l4, Integer.valueOf(MessagesStorage.getInstance(i22).getDialogReadMaxSync(booleanValue, longValue)));
                }
                AndroidUtilities.runOnUIThread(sVar3);
                return;
        }
    }
}
