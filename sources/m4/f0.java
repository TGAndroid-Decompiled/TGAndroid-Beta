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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.kt;
import yh.u6;
public final class f0 implements Runnable {
    public final int f16074a;
    public final boolean f16075b;
    public final int f16076c;
    public final Object d;
    public final Object f16077e;
    public final Object f16078f;

    public f0(l0 l0Var, int i10, n4.z zVar, k0 k0Var, boolean z10) {
        this.f16074a = 0;
        this.d = l0Var;
        this.f16076c = i10;
        this.f16077e = zVar;
        this.f16078f = k0Var;
        this.f16075b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f16074a) {
            case 0:
                l0 l0Var = (l0) this.d;
                n4.z zVar = (n4.z) this.f16077e;
                k0 k0Var = (k0) this.f16078f;
                b0 b0Var = l0Var.f16156g;
                if (!b0Var.j()) {
                    boolean isActive = ((n4.r) l0Var.f16159k.f16612b).f16593a.isActive();
                    int i10 = this.f16076c;
                    if (!isActive) {
                        StringBuilder j3 = hg.c.j(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        j3.append(zVar.f16617a.f16544b);
                        e2.a.n("MediaSessionLegacyStub", j3.toString());
                        return;
                    }
                    r L = l0Var.L(zVar);
                    if (!l0Var.f16155f.B(L, i10)) {
                        if (i10 == 1 && !b0Var.f15997t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    na.d dVar = b0Var.f15983e;
                    b0Var.s(L);
                    dVar.getClass();
                    try {
                        k0Var.g(L);
                    } catch (RemoteException e7) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                    }
                    if (this.f16075b) {
                        new SparseBooleanArray().append(i10, true);
                        b0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.f16077e, this.f16075b, this.f16076c, (q0.a) this.f16078f);
                return;
            case 2:
                ht htVar = (ht) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f16077e;
                TLObject tLObject = (TLObject) this.f16078f;
                ArrayList arrayList = htVar.T;
                int i11 = htVar.N;
                if (this.f16076c == htVar.f27134d0 && TextUtils.equals(tL_messages_searchGlobal.f20149q, htVar.f27135e0)) {
                    htVar.Z = false;
                    if (!this.f16075b) {
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
                            messageObject.setQuery(htVar.f27135e0);
                            arrayList.add(messageObject);
                        }
                        htVar.f27132b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        htVar.f27133c0 = messages_messages.next_rate;
                    }
                    htVar.N(true);
                    return;
                }
                return;
            case 3:
                kt ktVar = (kt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f16077e;
                TLObject tLObject2 = (TLObject) this.f16078f;
                ArrayList arrayList3 = ktVar.P;
                int i13 = ktVar.N;
                if (this.f16076c == ktVar.f28162a0 && TextUtils.equals(tL_messages_searchGlobal2.f20149q, ktVar.f28163b0)) {
                    ktVar.W = false;
                    if (!this.f16075b) {
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
                            messageObject2.setQuery(ktVar.f28163b0);
                            arrayList3.add(messageObject2);
                        }
                        ktVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        ktVar.Z = messages_messages2.next_rate;
                    }
                    ktVar.N(true);
                    return;
                }
                return;
            case 4:
                pg.s0 s0Var = (pg.s0) this.d;
                pg.t0 t0Var = (pg.t0) this.f16077e;
                Runnable runnable = (Runnable) this.f16078f;
                boolean z10 = this.f16075b;
                if (z10) {
                    rectF = s0Var.h;
                } else {
                    rectF = null;
                }
                s0Var.d(t0Var, this.f16076c, rectF);
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
                ImageReceiver imageReceiver = (ImageReceiver) this.f16077e;
                boolean[] zArr = (boolean[]) this.f16078f;
                boolean z11 = this.f16075b;
                int i15 = this.f16076c;
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
                                    if (document == null || document.f20044id != longValue) {
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i6.f20741a7, 0.3f);
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
        this.f16074a = 1;
        this.d = messagesController;
        this.f16077e = chat;
        this.f16075b = z10;
        this.f16076c = i10;
        this.f16078f = aVar;
    }

    public f0(c71 c71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f16074a = i11;
        this.d = c71Var;
        this.f16076c = i10;
        this.f16077e = tL_messages_searchGlobal;
        this.f16075b = z10;
        this.f16078f = tLObject;
    }

    public f0(pg.s0 s0Var, pg.t0 t0Var, int i10, boolean z10, Runnable runnable) {
        this.f16074a = 4;
        this.d = s0Var;
        this.f16077e = t0Var;
        this.f16076c = i10;
        this.f16075b = z10;
        this.f16078f = runnable;
    }

    public f0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f16074a = 5;
        this.f16075b = z10;
        this.f16076c = i10;
        this.d = str;
        this.f16077e = imageReceiver;
        this.f16078f = zArr;
    }
}
