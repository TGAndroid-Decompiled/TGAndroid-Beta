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
import org.telegram.ui.Components.s61;
public final class cb implements Runnable {
    public final int f1106a;
    public final int f1107b;
    public final boolean f1108c;
    public final Object d;
    public final Object e;
    public final Object f1109f;

    public cb(m4.p0 p0Var, int i10, n4.t tVar, m4.o0 o0Var, boolean z10) {
        this.f1106a = 1;
        this.d = p0Var;
        this.f1107b = i10;
        this.e = tVar;
        this.f1109f = o0Var;
        this.f1108c = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        RectF rectF;
        switch (this.f1106a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f1109f;
                boolean z10 = this.f1108c;
                int i10 = this.f1107b;
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
                                    if (document == null || document.f20278id != longValue) {
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
                    imageReceiver.setDelegate(new mc(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f20928a7, 0.3f);
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
                m4.o0 o0Var = (m4.o0) this.f1109f;
                m4.f0 f0Var = p0Var.f16655g;
                if (!f0Var.j()) {
                    boolean isActive = ((n4.n) p0Var.f16660m.f17121b).f17104a.isActive();
                    int i13 = this.f1107b;
                    if (!isActive) {
                        StringBuilder l4 = i0.a.l(i13, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(tVar.f17123a.f17125b);
                        e2.a.l("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    m4.v L = p0Var.L(tVar);
                    if (!p0Var.f16654f.x(L, i13)) {
                        if (i13 == 1 && !f0Var.f16528t.t()) {
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
                    if (this.f1108c) {
                        new SparseBooleanArray().append(i13, true);
                        f0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.e, this.f1108c, this.f1107b, (q0.a) this.f1109f);
                return;
            case 3:
                at atVar = (at) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f1109f;
                ArrayList arrayList = atVar.T;
                int i14 = atVar.N;
                if (this.f1107b == atVar.f24711d0 && TextUtils.equals(tL_messages_searchGlobal.f20383q, atVar.f24712e0)) {
                    atVar.Z = false;
                    if (!this.f1108c) {
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
                            messageObject.setQuery(atVar.f24712e0);
                            arrayList.add(messageObject);
                        }
                        atVar.f24709b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        atVar.f24710c0 = messages_messages.next_rate;
                    }
                    atVar.N(true);
                    return;
                }
                return;
            case 4:
                ct ctVar = (ct) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f1109f;
                ArrayList arrayList3 = ctVar.P;
                int i16 = ctVar.N;
                if (this.f1107b == ctVar.f25364a0 && TextUtils.equals(tL_messages_searchGlobal2.f20383q, ctVar.f25365b0)) {
                    ctVar.W = false;
                    if (!this.f1108c) {
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
                            messageObject2.setQuery(ctVar.f25365b0);
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
                qg.s0 s0Var = (qg.s0) this.d;
                qg.t0 t0Var = (qg.t0) this.e;
                Runnable runnable = (Runnable) this.f1109f;
                boolean z12 = this.f1108c;
                if (z12) {
                    rectF = s0Var.h;
                } else {
                    rectF = null;
                }
                s0Var.d(t0Var, this.f1107b, rectF);
                if (z12) {
                    s0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public cb(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f1106a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f1108c = z10;
        this.f1107b = i10;
        this.f1109f = aVar;
    }

    public cb(s61 s61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f1106a = i11;
        this.d = s61Var;
        this.f1107b = i10;
        this.e = tL_messages_searchGlobal;
        this.f1108c = z10;
        this.f1109f = tLObject;
    }

    public cb(qg.s0 s0Var, qg.t0 t0Var, int i10, boolean z10, Runnable runnable) {
        this.f1106a = 5;
        this.d = s0Var;
        this.e = t0Var;
        this.f1107b = i10;
        this.f1108c = z10;
        this.f1109f = runnable;
    }

    public cb(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f1106a = 0;
        this.f1108c = z10;
        this.f1107b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f1109f = zArr;
    }
}
