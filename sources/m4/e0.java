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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.ws;
import yh.e7;
public final class e0 implements Runnable {
    public final int f16123a;
    public final boolean f16124b;
    public final int f16125c;
    public final Object d;
    public final Object f16126e;
    public final Object f16127f;

    public e0(k0 k0Var, int i10, n4.a0 a0Var, j0 j0Var, boolean z10) {
        this.f16123a = 0;
        this.d = k0Var;
        this.f16125c = i10;
        this.f16126e = a0Var;
        this.f16127f = j0Var;
        this.f16124b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f16123a) {
            case 0:
                k0 k0Var = (k0) this.d;
                n4.a0 a0Var = (n4.a0) this.f16126e;
                j0 j0Var = (j0) this.f16127f;
                a0 a0Var2 = k0Var.f16208g;
                if (!a0Var2.j()) {
                    boolean isActive = ((n4.r) k0Var.f16211k.f16639b).f16619a.isActive();
                    int i10 = this.f16125c;
                    if (!isActive) {
                        StringBuilder j3 = hg.k0.j(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        j3.append(a0Var.f16568a.f16570b);
                        e2.a.n("MediaSessionLegacyStub", j3.toString());
                        return;
                    }
                    r L = k0Var.L(a0Var);
                    if (!k0Var.f16207f.B(L, i10)) {
                        if (i10 == 1 && !a0Var2.f16052t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    na.d dVar = a0Var2.f16038e;
                    a0Var2.s(L);
                    dVar.getClass();
                    try {
                        j0Var.f(L);
                    } catch (RemoteException e7) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                    }
                    if (this.f16124b) {
                        new SparseBooleanArray().append(i10, true);
                        a0Var2.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.f16126e, this.f16124b, this.f16125c, (q0.a) this.f16127f);
                return;
            case 2:
                us usVar = (us) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f16126e;
                TLObject tLObject = (TLObject) this.f16127f;
                ArrayList arrayList = usVar.T;
                int i11 = usVar.N;
                if (this.f16125c == usVar.f31433d0 && TextUtils.equals(tL_messages_searchGlobal.f20148q, usVar.f31434e0)) {
                    usVar.Z = false;
                    if (!this.f16124b) {
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
                            messageObject.setQuery(usVar.f31434e0);
                            arrayList.add(messageObject);
                        }
                        usVar.f31431b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        usVar.f31432c0 = messages_messages.next_rate;
                    }
                    usVar.N(true);
                    return;
                }
                return;
            case 3:
                ws wsVar = (ws) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f16126e;
                TLObject tLObject2 = (TLObject) this.f16127f;
                ArrayList arrayList3 = wsVar.P;
                int i13 = wsVar.N;
                if (this.f16125c == wsVar.f32616a0 && TextUtils.equals(tL_messages_searchGlobal2.f20148q, wsVar.f32617b0)) {
                    wsVar.W = false;
                    if (!this.f16124b) {
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
                            messageObject2.setQuery(wsVar.f32617b0);
                            arrayList3.add(messageObject2);
                        }
                        wsVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        wsVar.Z = messages_messages2.next_rate;
                    }
                    wsVar.N(true);
                    return;
                }
                return;
            case 4:
                pg.s0 s0Var = (pg.s0) this.d;
                pg.t0 t0Var = (pg.t0) this.f16126e;
                Runnable runnable = (Runnable) this.f16127f;
                boolean z10 = this.f16124b;
                if (z10) {
                    rectF = s0Var.h;
                } else {
                    rectF = null;
                }
                s0Var.d(t0Var, this.f16125c, rectF);
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
                ImageReceiver imageReceiver = (ImageReceiver) this.f16126e;
                boolean[] zArr = (boolean[]) this.f16127f;
                boolean z11 = this.f16124b;
                int i15 = this.f16125c;
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
                                    if (document == null || document.f20043id != longValue) {
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
                    imageReceiver.setDelegate(new e7(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i6.f20761a7, 0.3f);
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

    public e0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f16123a = 1;
        this.d = messagesController;
        this.f16126e = chat;
        this.f16124b = z10;
        this.f16125c = i10;
        this.f16127f = aVar;
    }

    public e0(u61 u61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f16123a = i11;
        this.d = u61Var;
        this.f16125c = i10;
        this.f16126e = tL_messages_searchGlobal;
        this.f16124b = z10;
        this.f16127f = tLObject;
    }

    public e0(pg.s0 s0Var, pg.t0 t0Var, int i10, boolean z10, Runnable runnable) {
        this.f16123a = 4;
        this.d = s0Var;
        this.f16126e = t0Var;
        this.f16125c = i10;
        this.f16124b = z10;
        this.f16127f = runnable;
    }

    public e0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f16123a = 5;
        this.f16124b = z10;
        this.f16125c = i10;
        this.d = str;
        this.f16126e = imageReceiver;
        this.f16127f = zArr;
    }
}
