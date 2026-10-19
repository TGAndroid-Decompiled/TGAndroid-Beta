package ai;

import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.t61;
public final class db implements Runnable {
    public final int f1169a;
    public final int f1170b;
    public final boolean f1171c;
    public final Object d;
    public final Object e;
    public final Object f1172f;

    public db(m4.p0 p0Var, int i10, n4.t tVar, m4.o0 o0Var, boolean z10) {
        this.f1169a = 1;
        this.d = p0Var;
        this.f1170b = i10;
        this.e = tVar;
        this.f1172f = o0Var;
        this.f1171c = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        RectF rectF;
        switch (this.f1169a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f1172f;
                boolean z10 = this.f1171c;
                int i10 = this.f1170b;
                if (z10) {
                    str = UserConfig.getInstance(i10).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i10).checkTonGiftStickers();
                        return;
                    }
                } else {
                    str = UserConfig.getInstance(i10).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i10).checkPremiumGiftStickers();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                if (tL_messages_stickerSet != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                                    document = tL_messages_stickerSet.documents.get(i12);
                                    if (document == null || document.f20281id != longValue) {
                                    }
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    document = null;
                    if (document == null && !tL_messages_stickerSet.documents.isEmpty()) {
                        document = tL_messages_stickerSet.documents.get(0);
                    }
                } else {
                    document = null;
                }
                boolean z11 = true;
                if (document != null) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new nc(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f20931a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                if (tL_messages_stickerSet != null) {
                    z11 = false;
                }
                mediaDataController.loadStickersByEmojiOrName(str, false, z11);
                return;
            case 1:
                m4.p0 p0Var = (m4.p0) this.d;
                n4.t tVar = (n4.t) this.e;
                m4.o0 o0Var = (m4.o0) this.f1172f;
                m4.f0 f0Var = p0Var.f16663g;
                if (!f0Var.j()) {
                    boolean isActive = ((n4.n) p0Var.f16668m.f17127b).f17110a.isActive();
                    int i13 = this.f1170b;
                    if (!isActive) {
                        StringBuilder l4 = i2.e.l(i13, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(tVar.f17129a.f17131b);
                        e2.a.l("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    m4.v L = p0Var.L(tVar);
                    if (!p0Var.f16662f.x(L, i13)) {
                        if (i13 == 1 && !f0Var.f16536t.t()) {
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
                    if (this.f1171c) {
                        new SparseBooleanArray().append(i13, true);
                        f0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.e, this.f1171c, this.f1170b, (q0.a) this.f1172f);
                return;
            case 3:
                at atVar = (at) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f1172f;
                ArrayList arrayList = atVar.T;
                int i14 = atVar.N;
                if (this.f1170b == atVar.f24701d0 && TextUtils.equals(tL_messages_searchGlobal.f20386q, atVar.f24702e0)) {
                    atVar.Z = false;
                    if (!this.f1171c) {
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
                            messageObject.setQuery(atVar.f24702e0);
                            arrayList.add(messageObject);
                        }
                        atVar.f24699b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        atVar.f24700c0 = messages_messages.next_rate;
                    }
                    atVar.N(true);
                    return;
                }
                return;
            case 4:
                ct ctVar = (ct) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f1172f;
                ArrayList arrayList3 = ctVar.P;
                int i16 = ctVar.N;
                if (this.f1170b == ctVar.f25340a0 && TextUtils.equals(tL_messages_searchGlobal2.f20386q, ctVar.f25341b0)) {
                    ctVar.W = false;
                    if (!this.f1171c) {
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
                            messageObject2.setQuery(ctVar.f25341b0);
                            arrayList3.add(messageObject2);
                        }
                        ctVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        ctVar.Z = messages_messages2.next_rate;
                    }
                    ctVar.N(true);
                    return;
                }
                return;
            default:
                qg.t0 t0Var = (qg.t0) this.d;
                qg.u0 u0Var = (qg.u0) this.e;
                Runnable runnable = (Runnable) this.f1172f;
                boolean z12 = this.f1171c;
                if (z12) {
                    rectF = t0Var.h;
                } else {
                    rectF = null;
                }
                t0Var.d(u0Var, this.f1170b, rectF);
                if (z12) {
                    t0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public db(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f1169a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f1171c = z10;
        this.f1170b = i10;
        this.f1172f = aVar;
    }

    public db(t61 t61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f1169a = i11;
        this.d = t61Var;
        this.f1170b = i10;
        this.e = tL_messages_searchGlobal;
        this.f1171c = z10;
        this.f1172f = tLObject;
    }

    public db(qg.t0 t0Var, qg.u0 u0Var, int i10, boolean z10, Runnable runnable) {
        this.f1169a = 5;
        this.d = t0Var;
        this.e = u0Var;
        this.f1170b = i10;
        this.f1171c = z10;
        this.f1172f = runnable;
    }

    public db(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f1169a = 0;
        this.f1171c = z10;
        this.f1170b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f1172f = zArr;
    }
}
