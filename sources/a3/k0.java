package a3;

import ai.ac;
import ai.d6;
import ai.d9;
import ai.f6;
import ai.f9;
import ai.i5;
import ai.jc;
import ai.l9;
import ai.q9;
import ai.r5;
import ai.s5;
import ai.s8;
import ai.sc;
import ai.t8;
import ai.w3;
import ai.w5;
import ai.x4;
import ai.y4;
import ai.y8;
import ai.z4;
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
import ci.ba;
import ci.d2;
import ci.e2;
import ci.fb;
import ci.ga;
import ci.ia;
import ci.o8;
import ci.oc;
import ci.p1;
import ci.s3;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.b3;
import ei.e4;
import ei.f3;
import ei.k3;
import ei.v1;
import gg.x1;
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
import m4.q1;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vc;
import org.telegram.ui.web.d1;
import v7.l8;
import w7.x5;
import zg.p0;
import zg.r0;
public final class k0 implements Runnable {
    public final int f139a;
    public final Object f140b;
    public final Object f141c;
    public final Object d;

    public k0(Object obj, Object obj2, Object obj3, int i10) {
        this.f139a = i10;
        this.f140b = obj;
        this.f141c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        zg.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        o5 o5Var;
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
        switch (this.f139a) {
            case 0:
                b2.s sVar = (b2.s) this.f141c;
                String str = e2.d0.f7888a;
                i2.e0 e0Var = ((i2.b0) ((l0) ((of.b) this.f140b).f15522c)).f10624a;
                e0Var.Q = sVar;
                j2.f fVar = e0Var.f10674s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.c(p5, sVar, (i2.h) this.d, 17));
                return;
            case 1:
                z4 z4Var = (z4) this.f140b;
                p0 p0Var = (p0) this.f141c;
                View view = (View) this.d;
                f6 f6Var = z4Var.f1784a;
                f6Var.f859u3 = true;
                d6 d6Var = f6Var.O1;
                ImageReceiver imageReceiver = f6Var.f832l3;
                boolean[] zArr = {false};
                q9 q9Var = f6Var.E0;
                q9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new w3(1, q9Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                q9 q9Var2 = new q9(f6Var.getContext(), f6Var.f868x1);
                f6Var.E0 = q9Var2;
                q9Var2.setPadding(dp, dp, dp, dp);
                f6Var.D0.addView(f6Var.E0, x5.e(40, 40, 3));
                o5 o5Var2 = f6Var.f841o3;
                if (o5Var2 != null) {
                    o5Var2.o(f6Var);
                    dVar = null;
                    f6Var.f841o3 = null;
                } else {
                    dVar = null;
                }
                zg.d dVar2 = f6Var.f835m3;
                if (dVar2 != null) {
                    dVar2.d(f6Var);
                    f6Var.f835m3 = dVar;
                }
                f6Var.f844p3 = false;
                if (p0Var.f49151g != 0) {
                    f6Var.f844p3 = true;
                    o5 o5Var3 = new o5(2, f6Var.C2, p0Var.f49151g);
                    f6Var.f841o3 = o5Var3;
                    o5Var3.a(f6Var);
                } else if (p0Var.f49150f != null && (tL_availableReaction = MediaDataController.getInstance(f6Var.C2).getReactionsMap().get(p0Var.f49150f)) != null) {
                    f6Var.f838n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                f6Var.E0.setReaction(p0Var);
                if (f6Var.D1) {
                    TL_stories.StoryItem storyItem3 = d6Var.f706a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = d6Var.f706a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        r0.b(null, storyItem4.sent_reaction, storyViews);
                        f6Var.k1(true);
                    }
                }
                if (p0Var.f49151g != 0 && (o5Var = f6Var.E0.f1438f) != null) {
                    zg.d a2 = zg.d.a(o5Var, false, true);
                    f6Var.f835m3 = a2;
                    a2.f(f6Var);
                }
                f6Var.S1.g0(f6Var.B1, d6Var.f706a, p0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                f6Var.getLocationInWindow(iArr4);
                f6Var.f866w3 = iArr3[0] - iArr4[0];
                f6Var.f870x3 = iArr3[1] - iArr4[1];
                f6Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f6Var.f862v3 = 0.0f;
                f6Var.invalidate();
                q9 q9Var3 = f6Var.E0;
                q9Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = q9Var3.e;
                if (p0Var.f49151g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49150f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new x4(z4Var, ofFloat, zArr, 0));
                ofFloat.addListener(new y4(z4Var, zArr, q9Var3, 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                f6Var.b1(false);
                return;
            case 2:
                w5 w5Var = (w5) this.f140b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.f141c;
                f6 f6Var3 = w5Var.f1658l;
                c5.S(f6Var3.getContext(), null, f6Var2, new r5(w5Var, (TL_stories.StoryItem) this.d, f6Var2, 0));
                w5 w5Var2 = f6Var3.f854t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    return;
                }
                return;
            case 3:
                t8 t8Var = (t8) this.f140b;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.f141c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                while (i12 < t8Var.f721i.size()) {
                    MessageObject messageObject2 = (MessageObject) t8Var.f721i.get(i12);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f18127id == document.f18127id) {
                        callback.run(document2);
                        return;
                    }
                    i12++;
                }
                callback.run(null);
                return;
            case 4:
                l9 l9Var = (l9) this.f140b;
                TLObject tLObject = (TLObject) this.f141c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i13 = l9Var.f1193a;
                l9Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    l9Var.S = null;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    l9Var.S = new f9(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    l9Var.n(tL_error);
                    return;
                }
            case 5:
                s8 s8Var = (s8) this.f141c;
                g2 g2Var = (g2) this.d;
                ArrayList arrayList = ((t8) this.f140b).f721i;
                while (i12 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i12);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = s8Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f18127id == document3.f18127id) {
                                g2Var.run((s8) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f18145id == photo2.f18145id) {
                            g2Var.run((s8) storyItem2);
                            return;
                        }
                    }
                    i12++;
                }
                g2Var.run(null);
                return;
            case 6:
                t8 t8Var2 = (t8) this.f140b;
                TLObject tLObject2 = (TLObject) this.f141c;
                Runnable runnable = (Runnable) this.d;
                y8 y8Var = t8Var2.f729q;
                ArrayList arrayList2 = t8Var2.G;
                ArrayList arrayList3 = t8Var2.f721i;
                ArrayList arrayList4 = t8Var2.H;
                t8Var2.F = 0;
                t8Var2.C = false;
                t8Var2.D = true;
                t8Var2.f730r = true;
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
                    MessageObject messageObject4 = new MessageObject(t8Var2.f718c, new s8(t8Var2, t8Var2.d, botpreviewmedia));
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
                        id2 = t8Var2.I;
                        t8Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f18142id = id2;
                    storyItem6.f18357id = id2;
                    messageObject4.parentStoriesList = t8Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    arrayList5 = arrayList8;
                }
                AndroidUtilities.cancelRunOnUIThread(y8Var);
                AndroidUtilities.runOnUIThread(y8Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 7:
                jc jcVar = ((ac) this.f140b).d;
                jcVar.f1096n0.D(jcVar.h, ((d9) this.f141c).d, (ArrayList) this.d);
                return;
            case 8:
                sc scVar = (sc) this.f140b;
                TLObject tLObject3 = (TLObject) this.f141c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                d dVar3 = scVar.f1539f;
                int i17 = scVar.f1537b;
                sc.f1535g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i17).putUsers(tL_stories_storyViews.users, false);
                    if (!scVar.d(tL_stories_getStoriesViews.f18365id, tL_stories_storyViews)) {
                        scVar.d = 0;
                        scVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                scVar.d = 0;
                if (scVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(dVar3);
                    AndroidUtilities.runOnUIThread(dVar3, 10000L);
                    return;
                }
                return;
            case 9:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f140b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.f141c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).f2608c.compareTo(androidx.lifecycle.n.f2589c) < 0) {
                            z11 = false;
                        }
                        if (z11) {
                            aVar.a();
                            return;
                        }
                    } catch (w.g e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 10:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f140b;
                String str3 = (String) this.f141c;
                try {
                    androidx.car.app.utils.g.d(str3.concat(" onSuccess"), new r5(iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str3, 2));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e7);
                    throw new RuntimeException(e7);
                } catch (w.g e10) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e10);
                    return;
                }
            case 11:
                k6.h hVar = (k6.h) this.f140b;
                v7.w wVar = (v7.w) this.f141c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.q a10 = v7.v.a(hVar.f13518a);
                    if (a10 != null) {
                        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) ((androidx.emoji2.text.k) a10.f2331b);
                        synchronized (pVar.d) {
                            pVar.f2355f = threadPoolExecutor;
                        }
                        ((androidx.emoji2.text.k) a10.f2331b).a(new androidx.emoji2.text.m(wVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    wVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 12:
                d2 d2Var = (d2) this.f140b;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList9 = d2Var.v;
                e2 e2Var = d2Var.N;
                ArrayList arrayList10 = d2Var.f4492s;
                if (TextUtils.equals((String) this.f141c, d2Var.H)) {
                    d2Var.f4494x = 0;
                    arrayList10.clear();
                    arrayList9.clear();
                    d2Var.f4495y.clear();
                    d2Var.f4490n.clear();
                    d2Var.f4494x++;
                    arrayList10.add(null);
                    arrayList9.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList10.addAll(tL_messages_stickers.stickers);
                        d2Var.f4494x = tL_messages_stickers.stickers.size() + d2Var.f4494x;
                    }
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    p1.x1(e2Var.f4588b, 0, 0);
                    e2Var.f4590f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                return;
            case 13:
                s3 s3Var = (s3) this.f140b;
                Object obj3 = this.f141c;
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
                                iArr2 = ci.n0.b(c10, true);
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
                AndroidUtilities.runOnUIThread(new k0(s3Var, str4, iArr2, 14));
                return;
            case 14:
                s3 s3Var2 = (s3) this.f140b;
                String str5 = (String) this.f141c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = s3Var2.d;
                if (bitmap != null) {
                    if (str5 != null) {
                        s3.f5498f0.put(str5, bitmap);
                        HashMap hashMap = s3.f5497e0;
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
                    s3Var2.f5499a = bitmap;
                    if (iArr5 == null) {
                        paint.setShader(null);
                        s3Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        s3Var2.e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    s3Var2.h();
                    s3Var2.invalidate();
                    return;
                }
                return;
            case 15:
                ci.w3 w3Var = (ci.w3) this.f140b;
                TLObject tLObject5 = (TLObject) this.f141c;
                MessagesController messagesController = (MessagesController) this.d;
                w3Var.f5690r = true;
                w3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(w3Var.f5692w.f5733a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    w3Var.E();
                    return;
                }
                return;
            case 16:
                String[] strArr = (String[]) this.f140b;
                int[][] iArr6 = (int[][]) this.f141c;
                i5 i5Var = (i5) this.d;
                while (i12 < strArr.length) {
                    String str6 = strArr[i12];
                    if (str6 != null) {
                        AnimatedFileNative.d(str6, iArr6[i12], 0L);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(i5Var);
                return;
            case 17:
                AnimatedFileNative.d((String) this.f140b, ((int[][]) this.f141c)[0], 0L);
                AndroidUtilities.runOnUIThread((i5) this.d);
                return;
            case 18:
                ba baVar = (ba) this.f140b;
                TLObject tLObject6 = (TLObject) this.f141c;
                MessagesController messagesController2 = (MessagesController) this.d;
                ia iaVar = baVar.W;
                baVar.v.setLoading(false);
                if (tLObject6 != null) {
                    int i19 = ia.f4804d0;
                    ArrayList h12 = iaVar.h1();
                    for (int i20 = 0; i20 < h12.size(); i20++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i20);
                        if (user != null && (contains = baVar.f4403c.contains(Long.valueOf(user.f18268id))) != user.close_friend) {
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
                    iaVar.g1(new ga(1, ia.G(iaVar), (ArrayList) null), new s5(iaVar, 1), false);
                    return;
                }
                iaVar.f1();
                iaVar.f4806b.E(0);
                return;
            case 19:
                ((o8) this.f141c).O0 = (File) this.d;
                fb fbVar = ((oc) this.f140b).f5216d1;
                if (fbVar != null) {
                    fbVar.f5611b.Y2.N(false);
                    return;
                }
                return;
            case 20:
                oc ocVar = (oc) this.f140b;
                Bitmap bitmap2 = (Bitmap) this.f141c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), ocVar.B0.getMatrix(), true);
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
            case 21:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.f140b;
                Intent intent = (Intent) this.f141c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 22:
                i9.w wVar2 = (i9.w) this.f140b;
                i9.c0 c0Var = (i9.c0) this.f141c;
                try {
                    try {
                        c0Var.o(((i9.p) this.d).apply(l8.a(wVar2)));
                        return;
                    } catch (Throwable th3) {
                        c0Var.n(th3);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    c0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
                    c0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    c0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    c0Var.n(e);
                    return;
                }
            case 23:
                i9.c0 c0Var2 = (i9.c0) this.f140b;
                x1 x1Var = (x1) this.f141c;
                q1 q1Var = (q1) this.d;
                try {
                    if (!(c0Var2.f11049a instanceof i9.a)) {
                        x1Var.run();
                        c0Var2.m(q1Var);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    c0Var2.n(th4);
                    return;
                }
            case 24:
                ArrayList arrayList11 = (ArrayList) this.f140b;
                HashMap hashMap2 = (HashMap) this.f141c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                ArrayList arrayList12 = new ArrayList();
                for (int i21 = 0; i21 < arrayList11.size(); i21++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList11.get(i21);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f18268id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj4 = new Object();
                    obj4.f8558a = user2;
                    obj4.f8559b = z10;
                    arrayList12.add(obj4);
                }
                callback2.run(arrayList12);
                return;
            case 25:
                v1 v1Var = (v1) this.d;
                ((boolean[]) this.f140b)[0] = false;
                if (((TLObject) this.f141c) instanceof TLRPC.TL_boolTrue) {
                    v1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 26:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                k3 k3Var = ((f3) this.f140b).d;
                if (((TLObject) this.f141c) instanceof TLRPC.TL_boolTrue) {
                    b3 b3Var = k3Var.f8456x;
                    b3Var.getClass();
                    b3Var.z("emoji_status_access_requested", d1.B("cancelled", "status"));
                    return;
                }
                new vc(k3Var.f8445p0, k3Var.E).Y(tL_error2).k(true);
                return;
            case 27:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f141c;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                vc.a0((e4) this.f140b).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, ei.l.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) this.d))), R.raw.copy).j();
                return;
            case 28:
                e4.A0((e4) this.f140b, (TLObject) this.f141c, (c2) this.d);
                return;
            default:
                gg.s sVar2 = (gg.s) this.d;
                int i22 = ((gg.i0) this.f140b).f9784s0;
                MessagesController messagesController3 = MessagesController.getInstance(i22);
                Iterator it = ((HashSet) this.f141c).iterator();
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
                AndroidUtilities.runOnUIThread(sVar2);
                return;
        }
    }
}
