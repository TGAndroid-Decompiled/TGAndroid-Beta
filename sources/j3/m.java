package j3;

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
import h3.q2;
import h7.z5;
import hh.y9;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import jh.a6;
import jh.b6;
import jh.c4;
import jh.e4;
import jh.g3;
import jh.g6;
import jh.h3;
import jh.i3;
import jh.i9;
import jh.j6;
import jh.l2;
import jh.l6;
import jh.r9;
import jh.s6;
import jh.u3;
import jh.x3;
import jh.x6;
import jh.z8;
import lh.k9;
import lh.ka;
import lh.l3;
import lh.o1;
import lh.o3;
import lh.o9;
import lh.q9;
import lh.sb;
import lh.y1;
import lh.z1;
import lh.z7;
import nh.b3;
import nh.q1;
import nh.s3;
import nh.t2;
import nh.w2;
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
import org.telegram.messenger.h2;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.y4;
import org.telegram.ui.web.z0;

public final class m implements Runnable {

    public final int f12388a;

    public final Object f12389b;

    public final Object f12390c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f12388a = i10;
        this.f12389b = obj;
        this.f12390c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ig.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        k5 k5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        MessageObject messageObject;
        int id2;
        int[] iArr;
        File file;
        int i10;
        boolean zContains;
        ViewGroup viewGroup;
        int i11 = this.f12388a;
        Pair pair = null;
        iArrB = null;
        iArrB = null;
        iArrB = null;
        int[] iArrB = null;
        Bitmap bitmapDecodeFile = null;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.d;
        ?? r10 = this.f12390c;
        Object obj2 = this.f12389b;
        switch (i11) {
            case 0:
                o oVar = ((n) obj2).f12392b;
                int i14 = d5.g0.f4795a;
                oVar.getClass();
                i3.f fVar = ((h3.h0) oVar).f7870a.f7987r;
                i3.a aVarK = fVar.k();
                fVar.l(aVarK, 1009, new q2(aVarK, (h3.t0) r10, (k3.l) obj, 11));
                break;
            case 1:
                j4.g0 g0Var = (j4.g0) obj2;
                r10.b(g0Var.f12561a, g0Var.f12562b, (j4.x) obj);
                break;
            case 2:
                i3 i3Var = (i3) obj2;
                ig.q0 q0Var = (ig.q0) r10;
                View view = (View) obj;
                e4 e4Var = i3Var.f13436a;
                e4Var.f13266q3 = true;
                c4 c4Var = e4Var.K1;
                ImageReceiver imageReceiver = e4Var.f13240h3;
                boolean[] zArr = {false};
                x6 x6Var = e4Var.A0;
                x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(i12, x6Var)).setDuration(150L).start();
                int iDp = AndroidUtilities.dp(8.0f);
                x6 x6Var2 = new x6(e4Var.getContext(), e4Var.f13275t1);
                e4Var.A0 = x6Var2;
                x6Var2.setPadding(iDp, iDp, iDp, iDp);
                e4Var.f13298z0.addView(e4Var.A0, z5.e(40, 40, 3));
                k5 k5Var2 = e4Var.f13249k3;
                if (k5Var2 != null) {
                    k5Var2.o(e4Var);
                    dVar = null;
                    e4Var.f13249k3 = null;
                } else {
                    dVar = null;
                }
                ig.d dVar2 = e4Var.f13243i3;
                if (dVar2 != null) {
                    dVar2.d(e4Var);
                    e4Var.f13243i3 = dVar;
                }
                e4Var.f13251l3 = false;
                if (q0Var.f11413g != 0) {
                    e4Var.f13251l3 = true;
                    k5 k5Var3 = new k5(2, e4Var.f13296y2, q0Var.f11413g);
                    e4Var.f13249k3 = k5Var3;
                    k5Var3.a(e4Var);
                } else if (q0Var.f11412f != null && (tL_availableReaction = MediaDataController.getInstance(e4Var.f13296y2).getReactionsMap().get(q0Var.f11412f)) != null) {
                    e4Var.f13246j3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), ig.m0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().L(0, false, true);
                    }
                }
                e4Var.A0.setReaction(q0Var);
                if (e4Var.f13299z1) {
                    TL_stories.StoryItem storyItem3 = c4Var.f13141a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = c4Var.f13141a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        ig.s0.b(null, storyItem4.sent_reaction, storyViews);
                        e4Var.k1(true);
                    }
                }
                if (q0Var.f11413g != 0 && (k5Var = e4Var.A0.f14137f) != null) {
                    ig.d dVarA = ig.d.a(k5Var, false, true);
                    e4Var.f13243i3 = dVarA;
                    dVarA.f(e4Var);
                }
                e4Var.O1.g0(e4Var.f13291x1, c4Var.f13141a, q0Var);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int[] iArr3 = new int[2];
                e4Var.getLocationInWindow(iArr3);
                e4Var.f13273s3 = iArr2[0] - iArr3[0];
                e4Var.f13277t3 = iArr2[1] - iArr3[1];
                e4Var.f13281u3 = view.getMeasuredHeight();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e4Var.f13269r3 = 0.0f;
                e4Var.invalidate();
                x6 x6Var3 = e4Var.A0;
                x6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = x6Var3.f14136e;
                if (q0Var.f11413g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f11412f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                valueAnimatorOfFloat.addUpdateListener(new g3(i3Var, valueAnimatorOfFloat, zArr, i13));
                valueAnimatorOfFloat.addListener(new h3(i3Var, zArr, x6Var3, i13));
                valueAnimatorOfFloat.setDuration(220L);
                valueAnimatorOfFloat.start();
                e4Var.b1(false);
                break;
            case 3:
                x3 x3Var = (x3) obj2;
                c6 c6Var = (c6) r10;
                e4 e4Var2 = x3Var.f14128l;
                y4.S(e4Var2.getContext(), null, c6Var, new ag.l0(x3Var, (TL_stories.StoryItem) obj, c6Var, 9));
                x3 x3Var2 = e4Var2.f13261p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                }
                break;
            case 4:
                b6 b6Var = (b6) obj2;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) r10;
                Utilities.Callback callback = (Utilities.Callback) obj;
                while (i13 < b6Var.f13540i.size()) {
                    MessageObject messageObject2 = (MessageObject) b6Var.f13540i.get(i13);
                    if (messageObject2 == null || (storyItem = messageObject2.storyItem) == null || (messageMedia = storyItem.media) == null || (document = storyItem5.media.document) == null || (document2 = messageMedia.document) == null || document2.f22386id != document.f22386id) {
                        i13++;
                    } else {
                        callback.run(document2);
                    }
                    break;
                }
                callback.run(null);
                break;
            case 5:
                s6 s6Var = (s6) obj2;
                TLObject tLObject = (TLObject) r10;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i15 = s6Var.f13955a;
                s6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    s6Var.S = null;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    s6Var.S = new l6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                } else {
                    s6Var.n(tL_error);
                }
                break;
            case 6:
                a6 a6Var = (a6) r10;
                h2 h2Var = (h2) obj;
                ArrayList arrayList = ((b6) obj2).f13540i;
                while (i13 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = a6Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 != null) {
                                if (document4.f22386id == document3.f22386id) {
                                    h2Var.run((a6) storyItem2);
                                }
                                photo = messageMedia3.photo;
                                if (photo != null) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                            break;
                        } else {
                            photo = messageMedia3.photo;
                            if (photo != null && (photo2 = messageMedia2.photo) != null && photo2.f22404id == photo.f22404id) {
                                h2Var.run((a6) storyItem2);
                                break;
                            }
                        }
                    }
                    i13++;
                }
                h2Var.run(null);
                break;
            case 7:
                b6 b6Var2 = (b6) obj2;
                TLObject tLObject2 = (TLObject) r10;
                Runnable runnable = (Runnable) obj;
                g6 g6Var = b6Var2.f13548q;
                ArrayList arrayList2 = b6Var2.G;
                ArrayList arrayList3 = b6Var2.f13540i;
                ArrayList arrayList4 = b6Var2.H;
                b6Var2.F = 0;
                b6Var2.C = false;
                b6Var2.D = true;
                b6Var2.f13549r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList6.get(i16);
                        i16++;
                        arrayList5.add((TL_bots.botPreviewMedia) obj3);
                    }
                } else if (tLObject2 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList2.clear();
                    arrayList2.addAll(previewinfo.lang_codes);
                    arrayList5.addAll(previewinfo.media);
                }
                ArrayList arrayList7 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList4.clear();
                int size2 = arrayList5.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj4 = arrayList5.get(i17);
                    i17++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj4;
                    int i18 = size2;
                    MessageObject messageObject4 = new MessageObject(b6Var2.f13536c, new a6(b6Var2, b6Var2.d, botpreviewmedia));
                    int i19 = 0;
                    while (true) {
                        if (i19 >= arrayList7.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList7.get(i19)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList7.get(i19);
                        } else {
                            i19++;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = b6Var2.I;
                        b6Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.f22401id = id2;
                    storyItem6.f22617id = id2;
                    messageObject4.parentStoriesList = b6Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    size2 = i18;
                }
                AndroidUtilities.cancelRunOnUIThread(g6Var);
                AndroidUtilities.runOnUIThread(g6Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                break;
            case 8:
                i9 i9Var = ((z8) obj2).d;
                i9Var.f13487j0.D(i9Var.h, ((j6) r10).d, (ArrayList) obj);
                break;
            case 9:
                r9 r9Var = (r9) obj2;
                TLObject tLObject3 = (TLObject) r10;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                y9 y9Var = r9Var.f13928f;
                int i20 = r9Var.f13925b;
                r9.f13923g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i20).putUsers(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.f22625id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.f13927e = false;
                    } else {
                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    }
                }
                r9Var.d = 0;
                if (r9Var.f13927e) {
                    AndroidUtilities.cancelRunOnUIThread(y9Var);
                    AndroidUtilities.runOnUIThread(y9Var, 10000L);
                }
                break;
            case 10:
                y1 y1Var = (y1) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList8 = y1Var.v;
                z1 z1Var = y1Var.J;
                ArrayList arrayList9 = y1Var.f17075s;
                if (TextUtils.equals((String) r10, y1Var.D)) {
                    y1Var.f17077x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    y1Var.f17078y.clear();
                    y1Var.f17073n.clear();
                    y1Var.f17077x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList9.addAll(tL_messages_stickers.stickers);
                        y1Var.f17077x = tL_messages_stickers.stickers.size() + y1Var.f17077x;
                    }
                    y1Var.E = y1Var.D;
                    y1Var.l();
                    o1.w1(z1Var.f17173b, 0, 0);
                    z1Var.f17176f.c(false);
                    z1Var.f17175e.n(false);
                    break;
                }
                break;
            case 11:
                l3 l3Var = (l3) obj2;
                String str = (String) obj;
                float f10 = l3Var.G;
                if (r10 != 0) {
                    int iMin = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (r10 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) r10;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        l3Var.c(photoEntry, options);
                        z7.C(options, iMin);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap bitmapC = l3Var.c(photoEntry, options);
                        if (bitmapC != null && bitmapC.getHeight() / bitmapC.getWidth() < f10) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !bitmapC.isRecycled()) {
                                iArrB = lh.n0.b(bitmapC, true);
                                photoEntry.gradientTopColor = iArrB[0];
                                photoEntry.gradientBottomColor = iArrB[1];
                            } else {
                                int i21 = photoEntry.gradientTopColor;
                                if (i21 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArrB = new int[]{i21, i10};
                                }
                            }
                        }
                        iArr = iArrB;
                        bitmapDecodeFile = bitmapC;
                    } else if (!(r10 instanceof z7) || (file = ((z7) r10).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        z7.C(options2, iMin);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(bitmapDecodeFile, iArr);
                }
                AndroidUtilities.runOnUIThread(new m(l3Var, str, pair, 12));
                break;
            case 12:
                l3 l3Var2 = (l3) obj2;
                String str2 = (String) r10;
                Pair pair2 = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr4 = (int[]) pair2.second;
                Paint paint = l3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        l3.f16296b0.put(str2, bitmap);
                        HashMap map = l3.f16295a0;
                        Integer num = (Integer) map.get(str2);
                        if (num != null) {
                            map.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            map.put(str2, 1);
                        }
                    }
                    if (TextUtils.equals(str2, l3Var2.N)) {
                        l3Var2.f16297a = bitmap;
                        if (iArr4 == null) {
                            paint.setShader(null);
                            l3Var2.f16300e = null;
                        } else {
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr4, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            l3Var2.f16300e = linearGradient;
                            paint.setShader(linearGradient);
                        }
                        l3Var2.h();
                        l3Var2.invalidate();
                    } else {
                        l3.d(str2);
                    }
                    break;
                }
                break;
            case 13:
                o3 o3Var = (o3) obj2;
                TLObject tLObject5 = (TLObject) r10;
                MessagesController messagesController = (MessagesController) obj;
                o3Var.f16474r = true;
                o3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(o3Var.f16476w.f16507a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    o3Var.E();
                }
                break;
            case 14:
                String[] strArr = (String[]) obj2;
                int[][] iArr5 = (int[][]) r10;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) obj;
                while (i13 < strArr.length) {
                    String str3 = strArr[i13];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr5[i13], 0L);
                    }
                    i13++;
                }
                AndroidUtilities.runOnUIThread(bVar);
                break;
            case 15:
                AnimatedFileNative.d((String) obj2, ((int[][]) r10)[0], 0L);
                AndroidUtilities.runOnUIThread((androidx.car.app.utils.b) obj);
                break;
            case 16:
                k9 k9Var = (k9) obj2;
                TLObject tLObject6 = (TLObject) r10;
                MessagesController messagesController2 = (MessagesController) obj;
                q9 q9Var = k9Var.S;
                k9Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i22 = q9.Z;
                    ArrayList arrayListH1 = q9Var.h1();
                    for (int i23 = 0; i23 < arrayListH1.size(); i23++) {
                        TLRPC.User user = (TLRPC.User) arrayListH1.get(i23);
                        if (user != null && (zContains = k9Var.f16251c.contains(Long.valueOf(user.f22527id))) != user.close_friend) {
                            user.close_friend = zContains;
                            user.flags2 = zContains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                q9Var.f1();
                if (q9Var.V) {
                    q9Var.g1(new o9(1, ((e3) q9Var).currentAccount, (ArrayList) null), new u3(q9Var, i12), false);
                } else {
                    q9Var.f1();
                    q9Var.f16593b.D(0);
                }
                break;
            case 17:
                ((z7) r10).O0 = (File) obj;
                ka kaVar = ((sb) obj2).Z0;
                if (kaVar != null) {
                    kaVar.f16228b.U2.N(false);
                }
                break;
            case 18:
                sb sbVar = (sb) obj2;
                Bitmap bitmap2 = (Bitmap) r10;
                Runnable runnable2 = (Runnable) obj;
                if (bitmap2 != null) {
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), sbVar.f16818x0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                        if (bitmapCreateScaledBitmap != null) {
                            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                bitmapCreateBitmap.recycle();
                            }
                            Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            bitmapCreateScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(runnable2);
                break;
            case 19:
                ArrayList arrayList10 = (ArrayList) obj2;
                HashMap map2 = (HashMap) r10;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                ArrayList arrayList11 = new ArrayList();
                for (int i24 = 0; i24 < arrayList10.size(); i24++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList10.get(i24);
                    Boolean bool = (Boolean) map2.get(Long.valueOf(user2.f22527id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    nh.p pVar = new nh.p();
                    pVar.f18862a = user2;
                    pVar.f18863b = z10;
                    arrayList11.add(pVar);
                }
                callback2.run(arrayList11);
                break;
            case 20:
                q1 q1Var = (q1) obj;
                ((boolean[]) obj2)[0] = false;
                if (((TLObject) r10) instanceof TLRPC.TL_boolTrue) {
                    q1Var.run(Boolean.TRUE);
                }
                break;
            case 21:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                b3 b3Var = ((w2) obj2).d;
                if (((TLObject) r10) instanceof TLRPC.TL_boolTrue) {
                    t2 t2Var = b3Var.f18599x;
                    t2Var.getClass();
                    t2Var.v("emoji_status_access_requested", z0.x("cancelled", "status"));
                } else {
                    new mc(b3Var.f18584l0, b3Var.A).Y(tL_error2).k(true);
                }
                break;
            case 22:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) r10;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                mc.a0((s3) obj2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, nh.k.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                break;
            case 23:
                s3.A0((s3) obj2, (TLObject) r10, (b2) obj);
                break;
            case 24:
                ((VideoAds) obj2).lambda$show$3((ec) r10, (TLRPC.TL_sponsoredMessage) obj);
                break;
            case 25:
                ((VideoAds) obj2).lambda$show$5((ec) r10, (boolean[]) obj);
                break;
            case 26:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r10, (Runnable) obj);
                break;
            case 27:
                ((Utilities.Callback2) obj2).run((TLObject) r10, (TLRPC.TL_error) obj);
                break;
            case 28:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r10, (TLRPC.TL_error) obj);
                break;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                n2 n2Var = (n2) r10;
                n2 n2Var2 = (n2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.F;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.F);
                }
                if (actionBarLayout.h || actionBarLayout.T) {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.F = null;
                    actionBarLayout.T = false;
                } else {
                    actionBarLayout.v.setTranslationX(0.0f);
                }
                actionBarLayout.m(n2Var);
                n2Var.setRemovingFromStack(false);
                n2Var.onTransitionAnimationEnd(false, true);
                n2Var2.onTransitionAnimationEnd(true, true);
                n2Var2.onBecomeFullyVisible();
                break;
        }
    }
}
