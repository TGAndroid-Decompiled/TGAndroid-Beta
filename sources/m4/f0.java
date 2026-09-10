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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zs;
import xh.e7;
public final class f0 implements Runnable {
    public final int f13344a;
    public final int f13345b;
    public final boolean f13346c;
    public final Object d;
    public final Object e;
    public final Object f13347f;

    public f0(l0 l0Var, int i10, n4.a0 a0Var, k0 k0Var, boolean z10) {
        this.f13344a = 0;
        this.d = l0Var;
        this.f13345b = i10;
        this.e = a0Var;
        this.f13347f = k0Var;
        this.f13346c = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f13344a) {
            case 0:
                l0 l0Var = (l0) this.d;
                n4.a0 a0Var = (n4.a0) this.e;
                k0 k0Var = (k0) this.f13347f;
                b0 b0Var = l0Var.f13430g;
                if (!b0Var.j()) {
                    boolean isActive = ((n4.r) l0Var.f13433k.f13824b).f13805a.isActive();
                    int i10 = this.f13345b;
                    if (!isActive) {
                        StringBuilder m10 = hc.b.m(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(a0Var.f13759a.f13761b);
                        e2.a.n("MediaSessionLegacyStub", m10.toString());
                        return;
                    }
                    r L = l0Var.L(a0Var);
                    if (!l0Var.f13429f.A(L, i10)) {
                        if (i10 == 1 && !b0Var.f13307t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    na.d dVar = b0Var.e;
                    b0Var.s(L);
                    dVar.getClass();
                    try {
                        k0Var.h(L);
                    } catch (RemoteException e) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e);
                    }
                    if (this.f13346c) {
                        new SparseBooleanArray().append(i10, true);
                        b0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                og.v0 v0Var = (og.v0) this.d;
                og.w0 w0Var = (og.w0) this.e;
                Runnable runnable = (Runnable) this.f13347f;
                boolean z10 = this.f13346c;
                if (z10) {
                    rectF = v0Var.h;
                } else {
                    rectF = null;
                }
                v0Var.d(w0Var, this.f13345b, rectF);
                if (z10) {
                    v0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.f13346c, this.f13345b, (q0.a) this.f13347f);
                return;
            case 3:
                xs xsVar = (xs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f13347f;
                ArrayList arrayList = xsVar.T;
                int i11 = xsVar.N;
                if (this.f13345b == xsVar.f29144d0 && TextUtils.equals(tL_messages_searchGlobal.f17306q, xsVar.f29145e0)) {
                    xsVar.Z = false;
                    if (!this.f13346c) {
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
                            messageObject.setQuery(xsVar.f29145e0);
                            arrayList.add(messageObject);
                        }
                        xsVar.f29142b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        xsVar.f29143c0 = messages_messages.next_rate;
                    }
                    xsVar.N(true);
                    return;
                }
                return;
            case 4:
                zs zsVar = (zs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f13347f;
                ArrayList arrayList3 = zsVar.P;
                int i13 = zsVar.N;
                if (this.f13345b == zsVar.f29801a0 && TextUtils.equals(tL_messages_searchGlobal2.f17306q, zsVar.f29802b0)) {
                    zsVar.W = false;
                    if (!this.f13346c) {
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
                            messageObject2.setQuery(zsVar.f29802b0);
                            arrayList3.add(messageObject2);
                        }
                        zsVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        zsVar.Z = messages_messages2.next_rate;
                    }
                    zsVar.N(true);
                    return;
                }
                return;
            default:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f13347f;
                boolean z11 = this.f13346c;
                int i15 = this.f13345b;
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
                                    if (document == null || document.f17201id != longValue) {
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.f17872a7, 0.3f);
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

    public f0(og.v0 v0Var, og.w0 w0Var, int i10, boolean z10, Runnable runnable) {
        this.f13344a = 1;
        this.d = v0Var;
        this.e = w0Var;
        this.f13345b = i10;
        this.f13346c = z10;
        this.f13347f = runnable;
    }

    public f0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f13344a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f13346c = z10;
        this.f13345b = i10;
        this.f13347f = aVar;
    }

    public f0(j61 j61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f13344a = i11;
        this.d = j61Var;
        this.f13345b = i10;
        this.e = tL_messages_searchGlobal;
        this.f13346c = z10;
        this.f13347f = tLObject;
    }

    public f0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f13344a = 5;
        this.f13346c = z10;
        this.f13345b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f13347f = zArr;
    }
}
