package bi;

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
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.qu;
import org.telegram.ui.ru;
import org.telegram.ui.tu;
public final class db implements Runnable {
    public final int f4505a;
    public final int f4506b;
    public final boolean f4507c;
    public final Object d;
    public final Object e;
    public final Object f4508f;

    public db(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
        this.f4505a = i11;
        this.d = obj;
        this.e = obj2;
        this.f4506b = i10;
        this.f4507c = z10;
        this.f4508f = obj3;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        Activity activity;
        yj0 yj0Var;
        float f7;
        RectF rectF;
        int i10 = this.f4505a;
        Window window = null;
        boolean z10 = true;
        Object obj = this.f4508f;
        boolean z11 = this.f4507c;
        int i11 = this.f4506b;
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
                                    if (document == null || document.f22034id != longValue) {
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
                    imageReceiver.setDelegate(new hc(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.y6.f23300a7, 0.3f);
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
                m4.f0 f0Var = p0Var.f18180g;
                if (!f0Var.j()) {
                    if (!((n4.n) p0Var.f18185m.f18695b).f18678a.isActive()) {
                        StringBuilder k10 = ic.a.k(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        k10.append(tVar.f18697a.f18699b);
                        e2.a.l("MediaSessionLegacyStub", k10.toString());
                        return;
                    }
                    m4.w L = p0Var.L(tVar);
                    if (!p0Var.f18179f.v(L, i11)) {
                        if (i11 == 1 && !f0Var.f18056t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    qb.a aVar = f0Var.e;
                    f0Var.s(L);
                    aVar.getClass();
                    try {
                        o0Var.i(L);
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
                ((MessagesController) obj3).lambda$startShortPoll$334((TLRPC.Chat) obj2, z11, i11, (q0.a) obj);
                return;
            case 3:
                ct ctVar = (ct) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = ctVar.V;
                int i14 = ctVar.P;
                if (i11 == ctVar.f27250f0 && TextUtils.equals(tL_messages_searchGlobal.f22141q, ctVar.f27251g0)) {
                    ctVar.f27246b0 = false;
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
                            messageObject.setQuery(ctVar.f27251g0);
                            arrayList.add(messageObject);
                        }
                        ctVar.f27248d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        ctVar.f27249e0 = messages_messages.next_rate;
                    }
                    ctVar.O(true);
                    return;
                }
                return;
            case 4:
                et etVar = (et) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = etVar.R;
                int i16 = etVar.P;
                if (i11 == etVar.f27924c0 && TextUtils.equals(tL_messages_searchGlobal2.f22141q, etVar.f27925d0)) {
                    etVar.Y = false;
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
                            messageObject2.setQuery(etVar.f27925d0);
                            arrayList3.add(messageObject2);
                        }
                        etVar.f27922a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        etVar.f27923b0 = messages_messages2.next_rate;
                    }
                    etVar.O(true);
                    return;
                }
                return;
            case 5:
                ru ruVar = (ru) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                tu tuVar = ruVar.f43172c;
                tuVar.a();
                org.telegram.ui.Cells.v8 v8Var = tuVar.e;
                tuVar.c();
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false);
                yj0 yj0Var2 = tuVar.d;
                yj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23300a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = tuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        tuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = tuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = tuVar.f43780n;
                    }
                    int i18 = i11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    tuVar.h = ofFloat;
                    if (z11) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    float f10 = f7;
                    yj0Var = yj0Var2;
                    ofFloat.addUpdateListener(new qu(ruVar, f10, i18, x03, activity));
                    tuVar.h.addListener(new org.telegram.ui.t0(activity, x03, 1));
                    tuVar.h.setDuration(350L);
                    tuVar.h.start();
                } else {
                    yj0Var = yj0Var2;
                }
                if (org.telegram.ui.ActionBar.y6.i1()) {
                    v8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
                    v8Var.f25602w += 2;
                } else {
                    v8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
                    v8Var.f25602w += 2;
                }
                org.telegram.ui.ActionBar.y6.J1(r2Var);
                return;
            default:
                rg.q0 q0Var = (rg.q0) obj3;
                rg.r0 r0Var = (rg.r0) obj2;
                Runnable runnable = (Runnable) obj;
                if (z11) {
                    rectF = q0Var.h;
                } else {
                    rectF = null;
                }
                q0Var.d(r0Var, i11, rectF);
                if (z11) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public db(m4.p0 p0Var, int i10, n4.t tVar, m4.o0 o0Var, boolean z10) {
        this.f4505a = 1;
        this.d = p0Var;
        this.f4506b = i10;
        this.e = tVar;
        this.f4508f = o0Var;
        this.f4507c = z10;
    }

    public db(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f4505a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f4507c = z10;
        this.f4506b = i10;
        this.f4508f = aVar;
    }

    public db(k71 k71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f4505a = i11;
        this.d = k71Var;
        this.f4506b = i10;
        this.e = tL_messages_searchGlobal;
        this.f4507c = z10;
        this.f4508f = tLObject;
    }

    public db(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f4505a = 0;
        this.f4507c = z10;
        this.f4506b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f4508f = zArr;
    }
}
