package a3;

import ai.ac;
import ai.c6;
import ai.d9;
import ai.e6;
import ai.f9;
import ai.h5;
import ai.jc;
import ai.l9;
import ai.q9;
import ai.r5;
import ai.sc;
import ai.t8;
import ai.u8;
import ai.v5;
import ai.w3;
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
import ci.cb;
import ci.d2;
import ci.da;
import ci.e2;
import ci.fa;
import ci.l8;
import ci.lc;
import ci.p1;
import ci.r3;
import ci.v3;
import ci.y9;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.b3;
import ei.e4;
import ei.f3;
import ei.k3;
import ei.v1;
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
import m4.k1;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.web.b1;
import v7.m8;
import w7.y5;
import zg.q0;
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
        switch (this.f139a) {
            case 0:
                b2.s sVar = (b2.s) this.f141c;
                String str = e2.d0.f7870a;
                i2.f0 f0Var = ((i2.c0) ((l0) ((of.b) this.f140b).f15694c)).f10616a;
                f0Var.Q = sVar;
                j2.f fVar = f0Var.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.c(p5, sVar, (i2.h) this.d, 16));
                return;
            case 1:
                z4 z4Var = (z4) this.f140b;
                zg.o0 o0Var = (zg.o0) this.f141c;
                View view = (View) this.d;
                e6 e6Var = z4Var.f1778a;
                e6Var.f832u3 = true;
                c6 c6Var = e6Var.O1;
                ImageReceiver imageReceiver = e6Var.f805l3;
                boolean[] zArr = {false};
                q9 q9Var = e6Var.E0;
                q9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new w3(1, q9Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                q9 q9Var2 = new q9(e6Var.getContext(), e6Var.f841x1);
                e6Var.E0 = q9Var2;
                q9Var2.setPadding(dp, dp, dp, dp);
                e6Var.D0.addView(e6Var.E0, y5.e(40, 40, 3));
                q5 q5Var2 = e6Var.f814o3;
                if (q5Var2 != null) {
                    q5Var2.o(e6Var);
                    dVar = null;
                    e6Var.f814o3 = null;
                } else {
                    dVar = null;
                }
                zg.d dVar2 = e6Var.f808m3;
                if (dVar2 != null) {
                    dVar2.d(e6Var);
                    e6Var.f808m3 = dVar;
                }
                e6Var.f817p3 = false;
                if (o0Var.f49396g != 0) {
                    e6Var.f817p3 = true;
                    q5 q5Var3 = new q5(2, e6Var.C2, o0Var.f49396g);
                    e6Var.f814o3 = q5Var3;
                    q5Var3.a(e6Var);
                } else if (o0Var.f49395f != null && (tL_availableReaction = MediaDataController.getInstance(e6Var.C2).getReactionsMap().get(o0Var.f49395f)) != null) {
                    e6Var.f811n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                e6Var.E0.setReaction(o0Var);
                if (e6Var.D1) {
                    TL_stories.StoryItem storyItem3 = c6Var.f642a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = c6Var.f642a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        q0.b(null, storyItem4.sent_reaction, storyViews);
                        e6Var.k1(true);
                    }
                }
                if (o0Var.f49396g != 0 && (q5Var = e6Var.E0.f1436f) != null) {
                    zg.d a2 = zg.d.a(q5Var, false, true);
                    e6Var.f808m3 = a2;
                    a2.f(e6Var);
                }
                e6Var.S1.g0(e6Var.B1, c6Var.f642a, o0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                e6Var.getLocationInWindow(iArr4);
                e6Var.f839w3 = iArr3[0] - iArr4[0];
                e6Var.f843x3 = iArr3[1] - iArr4[1];
                e6Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e6Var.f835v3 = 0.0f;
                e6Var.invalidate();
                q9 q9Var3 = e6Var.E0;
                q9Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = q9Var3.e;
                if (o0Var.f49396g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(o0Var.f49395f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new x4(z4Var, ofFloat, zArr, 0));
                ofFloat.addListener(new y4(z4Var, zArr, q9Var3, 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                e6Var.b1(false);
                return;
            case 2:
                v5 v5Var = (v5) this.f140b;
                d6 d6Var = (d6) this.f141c;
                e6 e6Var2 = v5Var.f1612l;
                e5.S(e6Var2.getContext(), null, d6Var, new ai.q5(v5Var, (TL_stories.StoryItem) this.d, d6Var, 0));
                v5 v5Var2 = e6Var2.f827t1;
                if (v5Var2 != null) {
                    v5Var2.a();
                    return;
                }
                return;
            case 3:
                u8 u8Var = (u8) this.f140b;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.f141c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                while (i12 < u8Var.f725i.size()) {
                    MessageObject messageObject2 = (MessageObject) u8Var.f725i.get(i12);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f18341id == document.f18341id) {
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
                int i13 = l9Var.f1192a;
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
                t8 t8Var = (t8) this.f141c;
                g2 g2Var = (g2) this.d;
                ArrayList arrayList = ((u8) this.f140b).f725i;
                while (i12 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i12);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = t8Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f18341id == document3.f18341id) {
                                g2Var.run((t8) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f18359id == photo2.f18359id) {
                            g2Var.run((t8) storyItem2);
                            return;
                        }
                    }
                    i12++;
                }
                g2Var.run(null);
                return;
            case 6:
                u8 u8Var2 = (u8) this.f140b;
                TLObject tLObject2 = (TLObject) this.f141c;
                Runnable runnable = (Runnable) this.d;
                y8 y8Var = u8Var2.f733q;
                ArrayList arrayList2 = u8Var2.G;
                ArrayList arrayList3 = u8Var2.f725i;
                ArrayList arrayList4 = u8Var2.H;
                u8Var2.F = 0;
                u8Var2.C = false;
                u8Var2.D = true;
                u8Var2.f734r = true;
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
                    MessageObject messageObject4 = new MessageObject(u8Var2.f722c, new t8(u8Var2, u8Var2.d, botpreviewmedia));
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
                        id2 = u8Var2.I;
                        u8Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f18356id = id2;
                    storyItem6.f18570id = id2;
                    messageObject4.parentStoriesList = u8Var2;
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
                jcVar.f1087n0.D(jcVar.h, ((d9) this.f141c).d, (ArrayList) this.d);
                return;
            case 8:
                sc scVar = (sc) this.f140b;
                TLObject tLObject3 = (TLObject) this.f141c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                d dVar3 = scVar.f1538f;
                int i17 = scVar.f1536b;
                sc.f1534g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i17).putUsers(tL_stories_storyViews.users, false);
                    if (!scVar.d(tL_stories_getStoriesViews.f18578id, tL_stories_storyViews)) {
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
                        if (((androidx.lifecycle.v) oVar).f2600c.compareTo(androidx.lifecycle.n.f2581c) < 0) {
                            z11 = false;
                        }
                        if (z11) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e) {
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
                    androidx.car.app.utils.g.d(str3.concat(" onSuccess"), new ai.q5(iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str3, 2));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e7);
                    throw new RuntimeException(e7);
                } catch (w.f e10) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e10);
                    return;
                }
            case 11:
                k6.h hVar = (k6.h) this.f140b;
                v7.y yVar = (v7.y) this.f141c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.q a10 = v7.x.a(hVar.f13503a);
                    if (a10 != null) {
                        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) ((androidx.emoji2.text.k) a10.f2323b);
                        synchronized (pVar.d) {
                            pVar.f2347f = threadPoolExecutor;
                        }
                        ((androidx.emoji2.text.k) a10.f2323b).a(new androidx.emoji2.text.m(yVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    yVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 12:
                d2 d2Var = (d2) this.f140b;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList9 = d2Var.v;
                e2 e2Var = d2Var.N;
                ArrayList arrayList10 = d2Var.f4506s;
                if (TextUtils.equals((String) this.f141c, d2Var.H)) {
                    d2Var.f4508x = 0;
                    arrayList10.clear();
                    arrayList9.clear();
                    d2Var.f4509y.clear();
                    d2Var.f4504n.clear();
                    d2Var.f4508x++;
                    arrayList10.add(null);
                    arrayList9.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList10.addAll(tL_messages_stickers.stickers);
                        d2Var.f4508x = tL_messages_stickers.stickers.size() + d2Var.f4508x;
                    }
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    p1.w1(e2Var.f4594b, 0, 0);
                    e2Var.f4596f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                return;
            case 13:
                r3 r3Var = (r3) this.f140b;
                Object obj3 = this.f141c;
                String str4 = (String) this.d;
                float f7 = r3Var.K;
                if (obj3 != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj3 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        r3Var.c(photoEntry, options);
                        l8.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = r3Var.c(photoEntry, options);
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
                    } else if ((obj3 instanceof l8) && (file = ((l8) obj3).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        l8.C(options2, min);
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
                AndroidUtilities.runOnUIThread(new k0(r3Var, str4, iArr2, 14));
                return;
            case 14:
                r3 r3Var2 = (r3) this.f140b;
                String str5 = (String) this.f141c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = r3Var2.d;
                if (bitmap != null) {
                    if (str5 != null) {
                        r3.f5439f0.put(str5, bitmap);
                        HashMap hashMap = r3.f5438e0;
                        Integer num = (Integer) hashMap.get(str5);
                        if (num != null) {
                            hashMap.put(str5, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str5, 1);
                        }
                    }
                    if (!TextUtils.equals(str5, r3Var2.R)) {
                        r3.d(str5);
                        return;
                    }
                    r3Var2.f5440a = bitmap;
                    if (iArr5 == null) {
                        paint.setShader(null);
                        r3Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        r3Var2.e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    r3Var2.h();
                    r3Var2.invalidate();
                    return;
                }
                return;
            case 15:
                v3 v3Var = (v3) this.f140b;
                TLObject tLObject5 = (TLObject) this.f141c;
                MessagesController messagesController = (MessagesController) this.d;
                v3Var.f5665r = true;
                v3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(v3Var.f5667w.f5704a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    v3Var.E();
                    return;
                }
                return;
            case 16:
                String[] strArr = (String[]) this.f140b;
                int[][] iArr6 = (int[][]) this.f141c;
                h5 h5Var = (h5) this.d;
                while (i12 < strArr.length) {
                    String str6 = strArr[i12];
                    if (str6 != null) {
                        AnimatedFileNative.d(str6, iArr6[i12], 0L);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(h5Var);
                return;
            case 17:
                AnimatedFileNative.d((String) this.f140b, ((int[][]) this.f141c)[0], 0L);
                AndroidUtilities.runOnUIThread((h5) this.d);
                return;
            case 18:
                y9 y9Var = (y9) this.f140b;
                TLObject tLObject6 = (TLObject) this.f141c;
                MessagesController messagesController2 = (MessagesController) this.d;
                fa faVar = y9Var.W;
                y9Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i19 = fa.f4695d0;
                    ArrayList h12 = faVar.h1();
                    for (int i20 = 0; i20 < h12.size(); i20++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i20);
                        if (user != null && (contains = y9Var.f5882c.contains(Long.valueOf(user.f18482id))) != user.close_friend) {
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
                faVar.f1();
                if (faVar.Z) {
                    faVar.g1(new da(1, fa.G(faVar), (ArrayList) null), new r5(faVar, 1), false);
                    return;
                }
                faVar.f1();
                faVar.f4697b.D(0);
                return;
            case 19:
                ((l8) this.f141c).O0 = (File) this.d;
                cb cbVar = ((lc) this.f140b).f5038d1;
                if (cbVar != null) {
                    cbVar.f5535b.Y2.N(false);
                    return;
                }
                return;
            case 20:
                lc lcVar = (lc) this.f140b;
                Bitmap bitmap2 = (Bitmap) this.f141c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), lcVar.B0.getMatrix(), true);
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
                i9.w wVar = (i9.w) this.f140b;
                i9.c0 c0Var = (i9.c0) this.f141c;
                try {
                    try {
                        c0Var.o(((i9.p) this.d).apply(m8.a(wVar)));
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
                ki.h0 h0Var = (ki.h0) this.f141c;
                k1 k1Var = (k1) this.d;
                try {
                    if (!(c0Var2.f11036a instanceof i9.a)) {
                        h0Var.run();
                        c0Var2.m(k1Var);
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
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f18482id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj4 = new Object();
                    obj4.f8540a = user2;
                    obj4.f8541b = z10;
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
                    b3 b3Var = k3Var.f8438x;
                    b3Var.getClass();
                    b3Var.z("emoji_status_access_requested", b1.B("cancelled", "status"));
                    return;
                }
                new xc(k3Var.f8427p0, k3Var.E).Y(tL_error2).k(true);
                return;
            case 27:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f141c;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                xc.a0((e4) this.f140b).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, ei.l.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) this.d))), R.raw.copy).j();
                return;
            case 28:
                e4.A0((e4) this.f140b, (TLObject) this.f141c, (a2) this.d);
                return;
            default:
                gg.s sVar2 = (gg.s) this.d;
                int i22 = ((gg.i0) this.f140b).f9765s0;
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
