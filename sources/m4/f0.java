package m4;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.lt;
import yh.u6;
public final class f0 implements Runnable {
    public final int f16093a;
    public final boolean f16094b;
    public final int f16095c;
    public final Object d;
    public final Object f16096e;
    public final Object f16097f;

    public f0(l0 l0Var, int i10, n4.z zVar, k0 k0Var, boolean z10) {
        this.f16093a = 0;
        this.d = l0Var;
        this.f16095c = i10;
        this.f16096e = zVar;
        this.f16097f = k0Var;
        this.f16094b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f16093a) {
            case 0:
                l0 l0Var = (l0) this.d;
                n4.z zVar = (n4.z) this.f16096e;
                k0 k0Var = (k0) this.f16097f;
                b0 b0Var = l0Var.f16162g;
                if (!b0Var.j()) {
                    boolean isActive = ((n4.r) l0Var.f16165k.f16658b).f16639a.isActive();
                    int i10 = this.f16095c;
                    if (!isActive) {
                        StringBuilder j3 = hg.c.j(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        j3.append(zVar.f16663a.f16590b);
                        e2.a.n("MediaSessionLegacyStub", j3.toString());
                        return;
                    }
                    r L = l0Var.L(zVar);
                    if (!l0Var.f16161f.B(L, i10)) {
                        if (i10 == 1 && !b0Var.f16022t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    na.d dVar = b0Var.f16008e;
                    b0Var.s(L);
                    dVar.getClass();
                    try {
                        k0Var.g(L);
                    } catch (RemoteException e7) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                    }
                    if (this.f16094b) {
                        new SparseBooleanArray().append(i10, true);
                        b0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.f16096e, this.f16094b, this.f16095c, (q0.a) this.f16097f);
                return;
            case 2:
                jt jtVar = (jt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f16096e;
                TLObject tLObject = (TLObject) this.f16097f;
                ArrayList arrayList = jtVar.T;
                int i11 = jtVar.N;
                if (this.f16095c == jtVar.f27747d0 && TextUtils.equals(tL_messages_searchGlobal.f20143q, jtVar.f27748e0)) {
                    jtVar.Z = false;
                    if (!this.f16094b) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i11).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            TLRPC.Message message = arrayList2.get(i12);
                            i12++;
                            MessageObject messageObject = new MessageObject(i11, message, false, true);
                            messageObject.setQuery(jtVar.f27748e0);
                            arrayList.add(messageObject);
                        }
                        jtVar.f27745b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        jtVar.f27746c0 = messages_messages.next_rate;
                    }
                    jtVar.N(true);
                    return;
                }
                return;
            case 3:
                lt ltVar = (lt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f16096e;
                TLObject tLObject2 = (TLObject) this.f16097f;
                ArrayList arrayList3 = ltVar.P;
                int i13 = ltVar.N;
                if (this.f16095c == ltVar.f28455a0 && TextUtils.equals(tL_messages_searchGlobal2.f20143q, ltVar.f28456b0)) {
                    ltVar.W = false;
                    if (!this.f16094b) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i13).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i13).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i13).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i14);
                            i14++;
                            MessageObject messageObject2 = new MessageObject(i13, message2, false, true);
                            messageObject2.setQuery(ltVar.f28456b0);
                            arrayList3.add(messageObject2);
                        }
                        ltVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        ltVar.Z = messages_messages2.next_rate;
                    }
                    ltVar.N(true);
                    return;
                }
                return;
            case 4:
                pg.s0 s0Var = (pg.s0) this.d;
                pg.t0 t0Var = (pg.t0) this.f16096e;
                Runnable runnable = (Runnable) this.f16097f;
                boolean z10 = this.f16094b;
                if (z10) {
                    rectF = s0Var.h;
                } else {
                    rectF = null;
                }
                s0Var.d(t0Var, this.f16095c, rectF);
                if (z10) {
                    s0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f16096e;
                boolean[] zArr = (boolean[]) this.f16097f;
                boolean z11 = this.f16094b;
                int i15 = this.f16095c;
                if (z11) {
                    str = UserConfig.getInstance(i15).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i15).checkTonGiftStickers();
                        return;
                    }
                } else {
                    str = UserConfig.getInstance(i15).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i15).checkPremiumGiftStickers();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i15).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i15).getStickerSetByEmojiOrName(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                if (tL_messages_stickerSet != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i16);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                    document = tL_messages_stickerSet.documents.get(i17);
                                    if (document == null || document.f20038id != longValue) {
                                    }
                                }
                            } else {
                                i16++;
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
                boolean z12 = true;
                if (document != null) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new u6(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, h6.f20730a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i15);
                if (tL_messages_stickerSet != null) {
                    z12 = false;
                }
                mediaDataController.loadStickersByEmojiOrName(str, false, z12);
                return;
        }
    }

    public f0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f16093a = 1;
        this.d = messagesController;
        this.f16096e = chat;
        this.f16094b = z10;
        this.f16095c = i10;
        this.f16097f = aVar;
    }

    public f0(e71 e71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f16093a = i11;
        this.d = e71Var;
        this.f16095c = i10;
        this.f16096e = tL_messages_searchGlobal;
        this.f16094b = z10;
        this.f16097f = tLObject;
    }

    public f0(pg.s0 s0Var, pg.t0 t0Var, int i10, boolean z10, Runnable runnable) {
        this.f16093a = 4;
        this.d = s0Var;
        this.f16096e = t0Var;
        this.f16095c = i10;
        this.f16094b = z10;
        this.f16097f = runnable;
    }

    public f0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f16093a = 5;
        this.f16094b = z10;
        this.f16095c = i10;
        this.d = str;
        this.f16096e = imageReceiver;
        this.f16097f = zArr;
    }
}
