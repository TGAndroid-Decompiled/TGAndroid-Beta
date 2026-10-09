package a3;

import ai.a5;
import ai.bc;
import ai.d6;
import ai.e9;
import ai.f6;
import ai.g9;
import ai.i5;
import ai.kc;
import ai.m9;
import ai.r5;
import ai.r9;
import ai.tc;
import ai.u8;
import ai.v8;
import ai.w5;
import ai.x3;
import ai.y4;
import ai.z4;
import ai.z8;
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
import ci.c2;
import ci.cb;
import ci.d2;
import ci.da;
import ci.fa;
import ci.l8;
import ci.lc;
import ci.o1;
import ci.q3;
import ci.u3;
import ci.y9;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.b3;
import ei.e4;
import ei.f3;
import ei.k3;
import ei.v1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m4.l1;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.s5;
import org.telegram.ui.web.b1;
import v7.j8;
import w7.x5;
import zg.p0;
public final class k0 implements Runnable {
    public final int f152a;
    public final Object f153b;
    public final Object f154c;
    public final Object d;

    public k0(Object obj, Object obj2, Object obj3, int i10) {
        this.f152a = i10;
        this.f153b = obj;
        this.f154c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        zg.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        s5 s5Var;
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
        int[] iArr2 = null;
        boolean z11 = true;
        int i12 = 0;
        switch (this.f152a) {
            case 0:
                b2.s sVar = (b2.s) this.f154c;
                String str = e2.d0.f8532a;
                i2.f0 f0Var = ((i2.c0) ((l0) ((pf.b) this.f153b).f45559c)).f11620a;
                f0Var.Q = sVar;
                j2.f fVar = f0Var.f11683s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.c(p5, sVar, (i2.h) this.d, 15));
                return;
            case 1:
                a5 a5Var = (a5) this.f153b;
                zg.n0 n0Var = (zg.n0) this.f154c;
                View view = (View) this.d;
                f6 f6Var = a5Var.f642a;
                f6Var.f1011u3 = true;
                d6 d6Var = f6Var.O1;
                ImageReceiver imageReceiver = f6Var.f984l3;
                boolean[] zArr = {false};
                r9 r9Var = f6Var.E0;
                r9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new x3(1, r9Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                r9 r9Var2 = new r9(f6Var.getContext(), f6Var.f1020x1);
                f6Var.E0 = r9Var2;
                r9Var2.setPadding(dp, dp, dp, dp);
                f6Var.D0.addView(f6Var.E0, x5.e(40, 40, 3));
                s5 s5Var2 = f6Var.f993o3;
                if (s5Var2 != null) {
                    s5Var2.o(f6Var);
                    dVar = null;
                    f6Var.f993o3 = null;
                } else {
                    dVar = null;
                }
                zg.d dVar2 = f6Var.f987m3;
                if (dVar2 != null) {
                    dVar2.d(f6Var);
                    f6Var.f987m3 = dVar;
                }
                f6Var.f996p3 = false;
                if (n0Var.f54618g != 0) {
                    f6Var.f996p3 = true;
                    s5 s5Var3 = new s5(2, f6Var.C2, n0Var.f54618g);
                    f6Var.f993o3 = s5Var3;
                    s5Var3.a(f6Var);
                } else if (n0Var.f54617f != null && (tL_availableReaction = MediaDataController.getInstance(f6Var.C2).getReactionsMap().get(n0Var.f54617f)) != null) {
                    f6Var.f990n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                f6Var.E0.setReaction(n0Var);
                if (f6Var.D1) {
                    TL_stories.StoryItem storyItem3 = d6Var.f822a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = d6Var.f822a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        p0.b(null, storyItem4.sent_reaction, storyViews);
                        f6Var.k1(true);
                    }
                }
                if (n0Var.f54618g != 0 && (s5Var = f6Var.E0.f1673f) != null) {
                    zg.d a2 = zg.d.a(s5Var, false, true);
                    f6Var.f987m3 = a2;
                    a2.f(f6Var);
                }
                f6Var.S1.g0(f6Var.B1, d6Var.f822a, n0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                f6Var.getLocationInWindow(iArr4);
                f6Var.f1018w3 = iArr3[0] - iArr4[0];
                f6Var.f1022x3 = iArr3[1] - iArr4[1];
                f6Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f6Var.f1014v3 = 0.0f;
                f6Var.invalidate();
                r9 r9Var3 = f6Var.E0;
                r9Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = r9Var3.f1672e;
                if (n0Var.f54618g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(n0Var.f54617f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new y4(a5Var, ofFloat, zArr, 0));
                ofFloat.addListener(new z4(a5Var, zArr, r9Var3, 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                f6Var.b1(false);
                return;
            case 2:
                w5 w5Var = (w5) this.f153b;
                e6 e6Var = (e6) this.f154c;
                f6 f6Var2 = w5Var.f1860l;
                g5.R(f6Var2.getContext(), null, e6Var, new r5(w5Var, (TL_stories.StoryItem) this.d, e6Var, 0));
                w5 w5Var2 = f6Var2.f1006t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    return;
                }
                return;
            case 3:
                v8 v8Var = (v8) this.f153b;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.f154c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                while (i12 < v8Var.f899i.size()) {
                    MessageObject messageObject2 = (MessageObject) v8Var.f899i.get(i12);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f20044id == document.f20044id) {
                        callback.run(document2);
                        return;
                    }
                    i12++;
                }
                callback.run(null);
                return;
            case 4:
                m9 m9Var = (m9) this.f153b;
                TLObject tLObject = (TLObject) this.f154c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i13 = m9Var.f1406a;
                m9Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    m9Var.S = null;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    m9Var.S = new g9(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    m9Var.n(tL_error);
                    return;
                }
            case 5:
                u8 u8Var = (u8) this.f154c;
                g2 g2Var = (g2) this.d;
                ArrayList arrayList = ((v8) this.f153b).f899i;
                while (i12 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i12);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = u8Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f20044id == document3.f20044id) {
                                g2Var.run((u8) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f20062id == photo2.f20062id) {
                            g2Var.run((u8) storyItem2);
                            return;
                        }
                    }
                    i12++;
                }
                g2Var.run(null);
                return;
            case 6:
                v8 v8Var2 = (v8) this.f153b;
                TLObject tLObject2 = (TLObject) this.f154c;
                Runnable runnable = (Runnable) this.d;
                z8 z8Var = v8Var2.f907q;
                ArrayList arrayList2 = v8Var2.G;
                ArrayList arrayList3 = v8Var2.f899i;
                ArrayList arrayList4 = v8Var2.H;
                v8Var2.F = 0;
                v8Var2.C = false;
                v8Var2.D = true;
                v8Var2.f908r = true;
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
                    MessageObject messageObject4 = new MessageObject(v8Var2.f895c, new u8(v8Var2, v8Var2.d, botpreviewmedia));
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
                        id2 = v8Var2.I;
                        v8Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f20059id = id2;
                    storyItem6.f20275id = id2;
                    messageObject4.parentStoriesList = v8Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    arrayList5 = arrayList8;
                }
                AndroidUtilities.cancelRunOnUIThread(z8Var);
                AndroidUtilities.runOnUIThread(z8Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 7:
                kc kcVar = ((bc) this.f153b).d;
                kcVar.f1283n0.D(kcVar.h, ((e9) this.f154c).d, (ArrayList) this.d);
                return;
            case 8:
                tc tcVar = (tc) this.f153b;
                TLObject tLObject3 = (TLObject) this.f154c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                d dVar3 = tcVar.f1781f;
                int i17 = tcVar.f1778b;
                tc.f1776g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i17).putUsers(tL_stories_storyViews.users, false);
                    if (!tcVar.d(tL_stories_getStoriesViews.f20283id, tL_stories_storyViews)) {
                        tcVar.d = 0;
                        tcVar.f1780e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                tcVar.d = 0;
                if (tcVar.f1780e) {
                    AndroidUtilities.cancelRunOnUIThread(dVar3);
                    AndroidUtilities.runOnUIThread(dVar3, 10000L);
                    return;
                }
                return;
            case 9:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f153b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.f154c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).f2896c.compareTo(androidx.lifecycle.n.f2874c) < 0) {
                            z11 = false;
                        }
                        if (z11) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e7) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 10:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f153b;
                String str3 = (String) this.f154c;
                try {
                    androidx.car.app.utils.g.d(str3.concat(" onSuccess"), new r5(iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str3, 2));
                    return;
                } catch (RuntimeException e10) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e10);
                    throw new RuntimeException(e10);
                } catch (w.f e11) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e11);
                    return;
                }
            case 11:
                k6.h hVar = (k6.h) this.f153b;
                v7.t tVar = (v7.t) this.f154c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.q a10 = v7.s.a(hVar.f14714a);
                    if (a10 != null) {
                        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) ((androidx.emoji2.text.k) a10.f2598b);
                        synchronized (pVar.d) {
                            pVar.f2625f = threadPoolExecutor;
                        }
                        ((androidx.emoji2.text.k) a10.f2598b).a(new androidx.emoji2.text.m(tVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    tVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 12:
                c2 c2Var = (c2) this.f153b;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList9 = c2Var.v;
                d2 d2Var = c2Var.N;
                ArrayList arrayList10 = c2Var.f4829s;
                if (TextUtils.equals((String) this.f154c, c2Var.H)) {
                    c2Var.f4831x = 0;
                    arrayList10.clear();
                    arrayList9.clear();
                    c2Var.f4832y.clear();
                    c2Var.f4827n.clear();
                    c2Var.f4831x++;
                    arrayList10.add(null);
                    arrayList9.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList10.addAll(tL_messages_stickers.stickers);
                        c2Var.f4831x = tL_messages_stickers.stickers.size() + c2Var.f4831x;
                    }
                    c2Var.I = c2Var.H;
                    c2Var.l();
                    o1.x1(d2Var.f4895b, 0, 0);
                    d2Var.f4898f.c(false);
                    d2Var.f4897e.n(false);
                    return;
                }
                return;
            case 13:
                q3 q3Var = (q3) this.f153b;
                Object obj3 = this.f154c;
                String str4 = (String) this.d;
                float f7 = q3Var.K;
                if (obj3 != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj3 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        q3Var.c(photoEntry, options);
                        l8.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = q3Var.c(photoEntry, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = ci.m0.b(c10, true);
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
                AndroidUtilities.runOnUIThread(new k0(q3Var, str4, iArr2, 14));
                return;
            case 14:
                q3 q3Var2 = (q3) this.f153b;
                String str5 = (String) this.f154c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = q3Var2.d;
                if (bitmap != null) {
                    if (str5 != null) {
                        q3.f5772f0.put(str5, bitmap);
                        HashMap hashMap = q3.f5771e0;
                        Integer num = (Integer) hashMap.get(str5);
                        if (num != null) {
                            hashMap.put(str5, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str5, 1);
                        }
                    }
                    if (!TextUtils.equals(str5, q3Var2.R)) {
                        q3.d(str5);
                        return;
                    }
                    q3Var2.f5773a = bitmap;
                    if (iArr5 == null) {
                        paint.setShader(null);
                        q3Var2.f5778e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        q3Var2.f5778e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    q3Var2.h();
                    q3Var2.invalidate();
                    return;
                }
                return;
            case 15:
                u3 u3Var = (u3) this.f153b;
                TLObject tLObject5 = (TLObject) this.f154c;
                MessagesController messagesController = (MessagesController) this.d;
                u3Var.f6060r = true;
                u3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(u3Var.f6062w.f6128a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    u3Var.E();
                    return;
                }
                return;
            case 16:
                String[] strArr = (String[]) this.f153b;
                int[][] iArr6 = (int[][]) this.f154c;
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
                AnimatedFileNative.d((String) this.f153b, ((int[][]) this.f154c)[0], 0L);
                AndroidUtilities.runOnUIThread((i5) this.d);
                return;
            case 18:
                y9 y9Var = (y9) this.f153b;
                TLObject tLObject6 = (TLObject) this.f154c;
                MessagesController messagesController2 = (MessagesController) this.d;
                fa faVar = y9Var.W;
                y9Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i19 = fa.f5092d0;
                    ArrayList i110 = faVar.i1();
                    for (int i20 = 0; i20 < i110.size(); i20++) {
                        TLRPC.User user = (TLRPC.User) i110.get(i20);
                        if (user != null && (contains = y9Var.f6362c.contains(Long.valueOf(user.f20185id))) != user.close_friend) {
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
                faVar.g1();
                if (faVar.Z) {
                    faVar.h1(new da(1, fa.H(faVar), (ArrayList) null), new ai.s5(faVar, 1), false);
                    return;
                }
                faVar.g1();
                faVar.f5094b.D(0);
                return;
            case 19:
                ((l8) this.f154c).O0 = (File) this.d;
                cb cbVar = ((lc) this.f153b).f5470d1;
                if (cbVar != null) {
                    cbVar.f5942b.W2.N(false);
                    return;
                }
                return;
            case 20:
                lc lcVar = (lc) this.f153b;
                Bitmap bitmap2 = (Bitmap) this.f154c;
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
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.f153b;
                Intent intent = (Intent) this.f154c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 22:
                i9.w wVar = (i9.w) this.f153b;
                i9.c0 c0Var = (i9.c0) this.f154c;
                try {
                    try {
                        c0Var.o(((i9.p) this.d).apply(j8.a(wVar)));
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
                i9.c0 c0Var2 = (i9.c0) this.f153b;
                ki.i0 i0Var = (ki.i0) this.f154c;
                l1 l1Var = (l1) this.d;
                try {
                    if (!(c0Var2.f12072a instanceof i9.a)) {
                        i0Var.run();
                        c0Var2.m(l1Var);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    c0Var2.n(th4);
                    return;
                }
            case 24:
                ArrayList arrayList11 = (ArrayList) this.f153b;
                HashMap hashMap2 = (HashMap) this.f154c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                ArrayList arrayList12 = new ArrayList();
                for (int i21 = 0; i21 < arrayList11.size(); i21++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList11.get(i21);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f20185id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj4 = new Object();
                    obj4.f9298a = user2;
                    obj4.f9299b = z10;
                    arrayList12.add(obj4);
                }
                callback2.run(arrayList12);
                return;
            case 25:
                v1 v1Var = (v1) this.d;
                ((boolean[]) this.f153b)[0] = false;
                if (((TLObject) this.f154c) instanceof TLRPC.TL_boolTrue) {
                    v1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 26:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                k3 k3Var = ((f3) this.f153b).d;
                if (((TLObject) this.f154c) instanceof TLRPC.TL_boolTrue) {
                    b3 b3Var = k3Var.f9183x;
                    b3Var.getClass();
                    b3Var.y("emoji_status_access_requested", b1.A("cancelled", "status"));
                    return;
                }
                new ad(k3Var.f9172p0, k3Var.E).Y(tL_error2).k(true);
                return;
            case 27:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f154c;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                ad.a0((e4) this.f153b).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, ei.l.H0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) this.d))), R.raw.copy).j();
                return;
            case 28:
                e4.B0((e4) this.f153b, (TLObject) this.f154c, (b2) this.d);
                return;
            default:
                ((gg.f0) this.f153b).a((a0.i) this.d, (ArrayList) this.f154c);
                return;
        }
    }
}
