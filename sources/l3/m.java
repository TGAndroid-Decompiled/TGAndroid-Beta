package l3;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import jh.d3;
import lh.b4;
import lh.b6;
import lh.d4;
import lh.f3;
import lh.g3;
import lh.h6;
import lh.i9;
import lh.k2;
import lh.k6;
import lh.m5;
import lh.m6;
import lh.r9;
import lh.s6;
import lh.t3;
import lh.w3;
import lh.x6;
import lh.z8;
import nh.c9;
import nh.e9;
import nh.gb;
import nh.j3;
import nh.m3;
import nh.n1;
import nh.o7;
import nh.x1;
import nh.y1;
import nh.y8;
import nh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g2;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p5;
import org.telegram.ui.tn;
public final class m implements Runnable {
    public final int f14146a;
    public final Object f14147b;
    public final Object f14148c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f14146a = i10;
        this.f14147b = obj;
        this.f14148c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        kg.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r72;
        TLRPC.TL_availableReaction tL_availableReaction2;
        p5 p5Var;
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
        ViewGroup viewGroup;
        int i12 = this.f14146a;
        int[] iArr2 = null;
        int i13 = 0;
        Object obj = this.d;
        ?? r11 = this.f14148c;
        Object obj2 = this.f14147b;
        switch (i12) {
            case 0:
                o oVar = ((n) obj2).f14151b;
                int i14 = f5.d0.f6579a;
                oVar.getClass();
                k3.f fVar = ((j3.h0) oVar).f10477a.f10594r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1009, new d3(k9, (j3.t0) r11, (m3.l) obj, 4));
                return;
            case 1:
                l4.g0 g0Var = (l4.g0) obj2;
                r11.c(g0Var.f14319a, g0Var.f14320b, (l4.x) obj);
                return;
            case 2:
                g3 g3Var = (g3) obj2;
                kg.q0 q0Var = (kg.q0) r11;
                View view = (View) obj;
                ?? r12 = g3Var.f15619a;
                r12.f15515q3 = true;
                b4 b4Var = r12.K1;
                ImageReceiver imageReceiver = r12.f15489h3;
                boolean[] zArr = {false};
                x6 x6Var = r12.A0;
                x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new k2(1, x6Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                x6 x6Var2 = new x6(r12.getContext(), r12.f15524t1);
                r12.A0 = x6Var2;
                x6Var2.setPadding(dp, dp, dp, dp);
                r12.f15547z0.addView(r12.A0, f6.e(40, 40, 3));
                ?? r52 = r12.f15498k3;
                if (r52 != 0) {
                    r52.o(r12);
                    dVar = null;
                    r12.f15498k3 = null;
                } else {
                    dVar = null;
                }
                ?? r6 = r12.f15492i3;
                if (r6 != 0) {
                    r6.d(r12);
                    r12.f15492i3 = dVar;
                }
                r12.f15500l3 = false;
                if (q0Var.f13826g != 0) {
                    r12.f15500l3 = true;
                    ?? p5Var2 = new p5(2, r12.f15545y2, q0Var.f13826g);
                    r12.f15498k3 = p5Var2;
                    p5Var2.a(r12);
                } else if (q0Var.f13825f != null && (tL_availableReaction = MediaDataController.getInstance(r12.f15545y2).getReactionsMap().get(q0Var.f13825f)) != null) {
                    r12.f15495j3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), kg.m0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().L(0, false, true);
                    }
                }
                r12.A0.setReaction(q0Var);
                if (r12.f15548z1) {
                    TL_stories.StoryItem storyItem3 = b4Var.f15374a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = b4Var.f15374a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        kg.s0.b(null, storyItem4.sent_reaction, storyViews);
                        r12.k1(true);
                    }
                }
                if (q0Var.f13826g != 0 && (p5Var = r12.A0.f16402f) != null) {
                    ?? a2 = kg.d.a(p5Var, false, true);
                    r12.f15492i3 = a2;
                    a2.f(r12);
                }
                r12.O1.g0(r12.f15540x1, b4Var.f15374a, q0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                r12.getLocationInWindow(iArr4);
                r12.f15522s3 = iArr3[0] - iArr4[0];
                r12.f15526t3 = iArr3[1] - iArr4[1];
                r12.f15530u3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r12.f15518r3 = 0.0f;
                r12.invalidate();
                x6 x6Var3 = r12.A0;
                x6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = x6Var3.f16401e;
                if (q0Var.f13826g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f13825f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    r72 = 0;
                    imageReceiver2.setAutoRepeat(0);
                } else {
                    r72 = 0;
                }
                ofFloat.addUpdateListener(new bg.s(g3Var, ofFloat, zArr, 1));
                ofFloat.addListener(new f3(g3Var, zArr, x6Var3, r72));
                ofFloat.setDuration(220L);
                ofFloat.start();
                r12.b1(r72);
                return;
            case 3:
                w3 w3Var = (w3) obj2;
                c6 c6Var = (c6) r11;
                d4 d4Var = w3Var.f16362l;
                c5.S(d4Var.getContext(), null, c6Var, new androidx.car.app.utils.a(w3Var, (TL_stories.StoryItem) obj, c6Var, 9));
                w3 w3Var2 = d4Var.f15510p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    return;
                }
                return;
            case 4:
                lh.c6 c6Var2 = (lh.c6) obj2;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) r11;
                Utilities.Callback callback = (Utilities.Callback) obj;
                for (int i15 = 0; i15 < c6Var2.f15838i.size(); i15++) {
                    MessageObject messageObject2 = (MessageObject) c6Var2.f15838i.get(i15);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f22398id == document.f22398id) {
                        callback.run(document2);
                        return;
                    }
                }
                callback.run(null);
                return;
            case 5:
                s6 s6Var = (s6) obj2;
                TLObject tLObject = (TLObject) r11;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i16 = s6Var.f16218a;
                s6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    s6Var.S = null;
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    s6Var.S = new m6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else {
                    s6Var.n(tL_error);
                    return;
                }
            case 6:
                b6 b6Var = (b6) r11;
                g2 g2Var = (g2) obj;
                ArrayList arrayList = ((lh.c6) obj2).f15838i;
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i17);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = b6Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f22398id == document3.f22398id) {
                                g2Var.run((b6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f22416id == photo2.f22416id) {
                            g2Var.run((b6) storyItem2);
                            return;
                        }
                    }
                }
                g2Var.run(null);
                return;
            case 7:
                lh.c6 c6Var3 = (lh.c6) obj2;
                TLObject tLObject2 = (TLObject) r11;
                Runnable runnable = (Runnable) obj;
                h6 h6Var = c6Var3.f15846q;
                ArrayList arrayList2 = c6Var3.G;
                ArrayList arrayList3 = c6Var3.f15838i;
                ArrayList arrayList4 = c6Var3.H;
                c6Var3.F = 0;
                c6Var3.C = false;
                c6Var3.D = true;
                c6Var3.f15847r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj3 = arrayList6.get(i18);
                        i18++;
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
                int i19 = 0;
                while (i19 < size2) {
                    Object obj4 = arrayList5.get(i19);
                    i19++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj4;
                    MessageObject messageObject4 = new MessageObject(c6Var3.f15834c, new b6(c6Var3, c6Var3.d, botpreviewmedia));
                    int i20 = 0;
                    while (true) {
                        if (i20 < arrayList7.size()) {
                            if (MessagesController.equals(((MessageObject) arrayList7.get(i20)).storyItem.media, botpreviewmedia.media)) {
                                messageObject = (MessageObject) arrayList7.get(i20);
                            } else {
                                i20++;
                            }
                        } else {
                            messageObject = null;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = c6Var3.I;
                        c6Var3.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f22413id = id2;
                    storyItem6.f22629id = id2;
                    messageObject4.parentStoriesList = c6Var3;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                }
                AndroidUtilities.cancelRunOnUIThread(h6Var);
                AndroidUtilities.runOnUIThread(h6Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 8:
                i9 i9Var = ((z8) obj2).d;
                i9Var.f15765j0.D(i9Var.h, ((k6) r11).d, (ArrayList) obj);
                return;
            case 9:
                r9 r9Var = (r9) obj2;
                TLObject tLObject3 = (TLObject) r11;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                m5 m5Var = r9Var.f16193f;
                int i21 = r9Var.f16190b;
                r9.f16188g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i21).putUsers(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.f22637id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.f16192e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                r9Var.d = 0;
                if (r9Var.f16192e) {
                    AndroidUtilities.cancelRunOnUIThread(m5Var);
                    AndroidUtilities.runOnUIThread(m5Var, 10000L);
                    return;
                }
                return;
            case 10:
                x1 x1Var = (x1) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList8 = x1Var.v;
                y1 y1Var = x1Var.J;
                ArrayList arrayList9 = x1Var.f18819s;
                if (TextUtils.equals((String) r11, x1Var.D)) {
                    x1Var.f18821x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    x1Var.f18822y.clear();
                    x1Var.f18817n.clear();
                    x1Var.f18821x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList9.addAll(tL_messages_stickers.stickers);
                        x1Var.f18821x = tL_messages_stickers.stickers.size() + x1Var.f18821x;
                    }
                    x1Var.E = x1Var.D;
                    x1Var.l();
                    n1.w1(y1Var.f18853b, 0, 0);
                    y1Var.f18856f.c(false);
                    y1Var.f18855e.n(false);
                    return;
                }
                return;
            case 11:
                j3 j3Var = (j3) obj2;
                String str = (String) obj;
                float f9 = j3Var.G;
                if (r11 != 0) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (r11 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) r11;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        j3Var.c(photoEntry, options);
                        o7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c3 = j3Var.c(photoEntry, options);
                        if (c3 != null && c3.getHeight() / c3.getWidth() < f9) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c3.isRecycled()) {
                                iArr2 = nh.n0.b(c3, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i22 = photoEntry.gradientTopColor;
                                if (i22 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i22, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c3;
                    } else if ((r11 instanceof o7) && (file = ((o7) r11).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        o7.C(options2, min);
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
                AndroidUtilities.runOnUIThread(new m(j3Var, str, iArr2, 12));
                return;
            case 12:
                j3 j3Var2 = (j3) obj2;
                String str2 = (String) r11;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = j3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        j3.f17941b0.put(str2, bitmap);
                        HashMap hashMap = j3.f17940a0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, j3Var2.N)) {
                        j3.d(str2);
                        return;
                    }
                    j3Var2.f17942a = bitmap;
                    if (iArr5 == null) {
                        paint.setShader(null);
                        j3Var2.f17945e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        j3Var2.f17945e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    j3Var2.h();
                    j3Var2.invalidate();
                    return;
                }
                return;
            case 13:
                m3 m3Var = (m3) obj2;
                TLObject tLObject5 = (TLObject) r11;
                MessagesController messagesController = (MessagesController) obj;
                m3Var.f18128r = true;
                m3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(m3Var.f18130w.f18167a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    m3Var.E();
                    return;
                }
                return;
            case 14:
                String[] strArr = (String[]) obj2;
                int[][] iArr6 = (int[][]) r11;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) obj;
                while (i13 < strArr.length) {
                    String str3 = strArr[i13];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr6[i13], 0L);
                    }
                    i13++;
                }
                AndroidUtilities.runOnUIThread(cVar);
                return;
            case 15:
                AnimatedFileNative.d((String) obj2, ((int[][]) r11)[0], 0L);
                AndroidUtilities.runOnUIThread((androidx.car.app.utils.c) obj);
                return;
            case 16:
                y8 y8Var = (y8) obj2;
                TLObject tLObject6 = (TLObject) r11;
                MessagesController messagesController2 = (MessagesController) obj;
                e9 e9Var = y8Var.S;
                y8Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i23 = e9.Z;
                    ArrayList h12 = e9Var.h1();
                    for (int i24 = 0; i24 < h12.size(); i24++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i24);
                        if (user != null && (contains = y8Var.f18903c.contains(Long.valueOf(user.f22539id))) != user.close_friend) {
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
                e9Var.f1();
                if (e9Var.V) {
                    e9Var.g1(new c9(1, e9.F(e9Var), (ArrayList) null), new t3(e9Var, 1), false);
                    return;
                }
                e9Var.f1();
                e9Var.f17603b.D(0);
                return;
            case 17:
                ((o7) r11).O0 = (File) obj;
                y9 y9Var = ((gb) obj2).Z0;
                if (y9Var != null) {
                    y9Var.f17694b.U2.N(false);
                    return;
                }
                return;
            case 18:
                gb gbVar = (gb) obj2;
                Bitmap bitmap2 = (Bitmap) r11;
                Runnable runnable2 = (Runnable) obj;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), gbVar.f17812x0.getMatrix(), true);
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
                ((VideoAds) obj2).lambda$show$3((mc) r11, (TLRPC.TL_sponsoredMessage) obj);
                return;
            case 20:
                ((VideoAds) obj2).lambda$show$5((mc) r11, (boolean[]) obj);
                return;
            case 21:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r11, (Runnable) obj);
                return;
            case 22:
                ((Utilities.Callback2) obj2).run((TLObject) r11, (TLRPC.TL_error) obj);
                return;
            case 23:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r11, (TLRPC.TL_error) obj);
                return;
            case 24:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                o2 o2Var = (o2) r11;
                o2 o2Var2 = (o2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.F;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.F);
                }
                if (!actionBarLayout.h && !actionBarLayout.T) {
                    actionBarLayout.v.setTranslationX(0.0f);
                } else {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.F = null;
                    actionBarLayout.T = false;
                }
                actionBarLayout.m(o2Var);
                o2Var.setRemovingFromStack(false);
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var2.onTransitionAnimationEnd(true, true);
                o2Var2.onBecomeFullyVisible();
                return;
            case 25:
                ((o2) r11).presentFragment((tn) obj);
                ((org.telegram.ui.ActionBar.m3) obj2).f23679c = false;
                return;
            case 26:
                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj2;
                ArrayList arrayList10 = (ArrayList) r11;
                l3 l3Var = (l3) obj;
                m3Var2.getClass();
                while (i13 < arrayList10.size()) {
                    if (((org.telegram.ui.ActionBar.j3) arrayList10.get(i13)).f23551a == l3Var) {
                        arrayList10.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                m3Var2.invalidate();
                return;
            case 27:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TLObject tLObject7 = (TLObject) r11;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                if (tLObject7 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject7;
                    f6Var.f22946c0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(f6Var2.A).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                f6Var.s();
                return;
            case 28:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj2;
                v0Var.T0.K1(v0Var, (TLRPC.TL_premiumGiftOption) r11, (String) obj);
                return;
            default:
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) r11;
                f6Var3.f22950f = !f6Var3.d((File) obj, f6Var3.f22945c);
                AndroidUtilities.runOnUIThread(new ha(8, (ja) obj2, f6Var3));
                return;
        }
    }
}
