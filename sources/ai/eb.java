package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.Window;
import java.util.ArrayList;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.ys;
import org.telegram.ui.ru;
import org.telegram.ui.su;
import org.telegram.ui.uu;
public final class eb implements Runnable {
    public final int f1227a;
    public final int f1228b;
    public final boolean f1229c;
    public final Object d;
    public final Object e;
    public final Object f1230f;

    public eb(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
        this.f1227a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1228b = i10;
        this.f1229c = z10;
        this.f1230f = obj3;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        Activity activity;
        xj0 xj0Var;
        float f7;
        RectF rectF;
        int i10 = this.f1227a;
        Window window = null;
        boolean z10 = true;
        Object obj = this.f1230f;
        boolean z11 = this.f1229c;
        int i11 = this.f1228b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z11) {
                    str = UserConfig.getInstance(i11).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i11).checkTonGiftStickers();
                        return;
                    }
                } else {
                    str = UserConfig.getInstance(i11).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i11).checkPremiumGiftStickers();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByEmojiOrName(str);
                }
                if (stickerSetByName != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < stickerSetByName.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = stickerSetByName.packs.get(i12);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i13 = 0; i13 < stickerSetByName.documents.size(); i13++) {
                                    document = stickerSetByName.documents.get(i13);
                                    if (document == null || document.f20350id != longValue) {
                                    }
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                    document = null;
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new oc(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21126a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", stickerSetByName, 1);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                MediaDataController mediaDataController = MediaDataController.getInstance(i11);
                if (tL_messages_stickerSet != null) {
                    z10 = false;
                }
                mediaDataController.loadStickersByEmojiOrName(str, false, z10);
                return;
            case 1:
                m4.p0 p0Var = (m4.p0) obj3;
                n4.t tVar = (n4.t) obj2;
                m4.o0 o0Var = (m4.o0) obj;
                m4.f0 f0Var = p0Var.f16724g;
                if (!f0Var.j()) {
                    if (!((n4.n) p0Var.f16729m.f17188b).f17171a.isActive()) {
                        StringBuilder n10 = i2.o1.n(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        n10.append(tVar.f17190a.f17192b);
                        e2.a.l("MediaSessionLegacyStub", n10.toString());
                        return;
                    }
                    m4.v L = p0Var.L(tVar);
                    if (!p0Var.f16723f.x(L, i11)) {
                        if (i11 == 1 && !f0Var.f16597t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    pb.a aVar = f0Var.e;
                    f0Var.s(L);
                    aVar.getClass();
                    try {
                        o0Var.f(L);
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                    }
                    if (z11) {
                        new SparseBooleanArray().append(i11, true);
                        f0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((MessagesController) obj3).lambda$startShortPoll$332((TLRPC.Chat) obj2, z11, i11, (q0.a) obj);
                return;
            case 3:
                ys ysVar = (ys) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = ysVar.V;
                int i14 = ysVar.P;
                if (i11 == ysVar.f33036f0 && TextUtils.equals(tL_messages_searchGlobal.f20455q, ysVar.f33037g0)) {
                    ysVar.f33032b0 = false;
                    if (!z11) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i14).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i14).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i14).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList2.get(i15);
                            i15++;
                            MessageObject messageObject = new MessageObject(i14, message, false, true);
                            messageObject.setQuery(ysVar.f33037g0);
                            arrayList.add(messageObject);
                        }
                        ysVar.f33034d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        ysVar.f33035e0 = messages_messages.next_rate;
                    }
                    ysVar.N(true);
                    return;
                }
                return;
            case 4:
                at atVar = (at) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = atVar.R;
                int i16 = atVar.P;
                if (i11 == atVar.f24799c0 && TextUtils.equals(tL_messages_searchGlobal2.f20455q, atVar.f24800d0)) {
                    atVar.Y = false;
                    if (!z11) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i17);
                            i17++;
                            MessageObject messageObject2 = new MessageObject(i16, message2, false, true);
                            messageObject2.setQuery(atVar.f24800d0);
                            arrayList3.add(messageObject2);
                        }
                        atVar.f24797a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        atVar.f24798b0 = messages_messages2.next_rate;
                    }
                    atVar.N(true);
                    return;
                }
                return;
            case 5:
                su suVar = (su) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                uu uuVar = suVar.f41803c;
                uuVar.a();
                org.telegram.ui.Cells.r8 r8Var = uuVar.e;
                uuVar.c();
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false);
                xj0 xj0Var2 = uuVar.d;
                xj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = uuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        uuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = uuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = uuVar.f42491n;
                    }
                    int i18 = i11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uuVar.h = ofFloat;
                    if (z11) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    float f10 = f7;
                    xj0Var = xj0Var2;
                    ofFloat.addUpdateListener(new ru(suVar, f10, i18, x03, activity));
                    uuVar.h.addListener(new org.telegram.ui.v0(activity, x03, 1));
                    uuVar.h.setDuration(350L);
                    uuVar.h.start();
                } else {
                    xj0Var = xj0Var2;
                }
                if (org.telegram.ui.ActionBar.k6.i1()) {
                    r8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), xj0Var, true);
                    r8Var.f23116w += 2;
                } else {
                    r8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), xj0Var, true);
                    r8Var.f23116w += 2;
                }
                org.telegram.ui.ActionBar.k6.J1(o2Var);
                return;
            default:
                qg.s0 s0Var = (qg.s0) obj3;
                qg.t0 t0Var = (qg.t0) obj2;
                Runnable runnable = (Runnable) obj;
                if (z11) {
                    rectF = s0Var.h;
                } else {
                    rectF = null;
                }
                s0Var.d(t0Var, i11, rectF);
                if (z11) {
                    s0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public eb(m4.p0 p0Var, int i10, n4.t tVar, m4.o0 o0Var, boolean z10) {
        this.f1227a = 1;
        this.d = p0Var;
        this.f1228b = i10;
        this.e = tVar;
        this.f1230f = o0Var;
        this.f1229c = z10;
    }

    public eb(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f1227a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f1229c = z10;
        this.f1228b = i10;
        this.f1230f = aVar;
    }

    public eb(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f1227a = i11;
        this.d = a71Var;
        this.f1228b = i10;
        this.e = tL_messages_searchGlobal;
        this.f1229c = z10;
        this.f1230f = tLObject;
    }

    public eb(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f1227a = 0;
        this.f1229c = z10;
        this.f1228b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f1230f = zArr;
    }
}
