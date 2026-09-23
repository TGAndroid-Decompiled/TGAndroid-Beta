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
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.v51;
import yh.b7;
public final class e0 implements Runnable {
    public final int f14516a;
    public final boolean f14517b;
    public final int f14518c;
    public final Object d;
    public final Object e;
    public final Object f14519f;

    public e0(l0 l0Var, int i10, n4.a0 a0Var, k0 k0Var, boolean z10) {
        this.f14516a = 0;
        this.d = l0Var;
        this.f14518c = i10;
        this.e = a0Var;
        this.f14519f = k0Var;
        this.f14517b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f14516a) {
            case 0:
                l0 l0Var = (l0) this.d;
                n4.a0 a0Var = (n4.a0) this.e;
                k0 k0Var = (k0) this.f14519f;
                a0 a0Var2 = l0Var.f14607g;
                if (!a0Var2.j()) {
                    boolean isActive = ((n4.r) l0Var.f14610k.f14969b).f14950a.isActive();
                    int i10 = this.f14518c;
                    if (!isActive) {
                        StringBuilder l4 = hg.c.l(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(a0Var.f14904a.f14906b);
                        e2.a.n("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    r L = l0Var.L(a0Var);
                    if (!l0Var.f14606f.B(L, i10)) {
                        if (i10 == 1 && !a0Var2.f14454t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    na.d dVar = a0Var2.e;
                    a0Var2.s(L);
                    dVar.getClass();
                    try {
                        k0Var.g(L);
                    } catch (RemoteException e) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e);
                    }
                    if (this.f14517b) {
                        new SparseBooleanArray().append(i10, true);
                        a0Var2.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.f14517b, this.f14518c, (q0.a) this.f14519f);
                return;
            case 2:
                ss ssVar = (ss) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f14519f;
                ArrayList arrayList = ssVar.T;
                int i11 = ssVar.N;
                if (this.f14518c == ssVar.f27980d0 && TextUtils.equals(tL_messages_searchGlobal.f18194q, ssVar.f27981e0)) {
                    ssVar.Z = false;
                    if (!this.f14517b) {
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
                            messageObject.setQuery(ssVar.f27981e0);
                            arrayList.add(messageObject);
                        }
                        ssVar.f27978b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        ssVar.f27979c0 = messages_messages.next_rate;
                    }
                    ssVar.N(true);
                    return;
                }
                return;
            case 3:
                us usVar = (us) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f14519f;
                ArrayList arrayList3 = usVar.P;
                int i13 = usVar.N;
                if (this.f14518c == usVar.f28548a0 && TextUtils.equals(tL_messages_searchGlobal2.f18194q, usVar.f28549b0)) {
                    usVar.W = false;
                    if (!this.f14517b) {
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
                            messageObject2.setQuery(usVar.f28549b0);
                            arrayList3.add(messageObject2);
                        }
                        usVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        usVar.Z = messages_messages2.next_rate;
                    }
                    usVar.N(true);
                    return;
                }
                return;
            case 4:
                pg.r0 r0Var = (pg.r0) this.d;
                pg.s0 s0Var = (pg.s0) this.e;
                Runnable runnable = (Runnable) this.f14519f;
                boolean z10 = this.f14517b;
                if (z10) {
                    rectF = r0Var.h;
                } else {
                    rectF = null;
                }
                r0Var.d(s0Var, this.f14518c, rectF);
                if (z10) {
                    r0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f14519f;
                boolean z11 = this.f14517b;
                int i15 = this.f14518c;
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
                                    if (document == null || document.f18089id != longValue) {
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
                    imageReceiver.setDelegate(new b7(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, h6.f18733a7, 0.3f);
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
        this.f14516a = 1;
        this.d = messagesController;
        this.e = chat;
        this.f14517b = z10;
        this.f14518c = i10;
        this.f14519f = aVar;
    }

    public e0(v51 v51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f14516a = i11;
        this.d = v51Var;
        this.f14518c = i10;
        this.e = tL_messages_searchGlobal;
        this.f14517b = z10;
        this.f14519f = tLObject;
    }

    public e0(pg.r0 r0Var, pg.s0 s0Var, int i10, boolean z10, Runnable runnable) {
        this.f14516a = 4;
        this.d = r0Var;
        this.e = s0Var;
        this.f14518c = i10;
        this.f14517b = z10;
        this.f14519f = runnable;
    }

    public e0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f14516a = 5;
        this.f14517b = z10;
        this.f14518c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f14519f = zArr;
    }
}
