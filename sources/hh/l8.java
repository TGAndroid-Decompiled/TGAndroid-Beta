package hh;

import android.text.TextUtils;
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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.hs;

public final class l8 implements Runnable {

    public final int f9677a;

    public final boolean f9678b;

    public final int f9679c;
    public final Object d;

    public final Object f9680e;

    public final Object f9681f;

    public l8(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f9677a = 1;
        this.d = messagesController;
        this.f9680e = chat;
        this.f9678b = z10;
        this.f9679c = i10;
        this.f9681f = aVar;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        switch (this.f9677a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f9680e;
                boolean[] zArr = (boolean[]) this.f9681f;
                boolean z10 = this.f9678b;
                int i10 = this.f9679c;
                if (!z10) {
                    str = UserConfig.getInstance(i10).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i10).checkPremiumGiftStickers();
                    }
                } else {
                    str = UserConfig.getInstance(i10).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i10).checkTonGiftStickers();
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
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i11++;
                            } else {
                                long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                int i12 = 0;
                                while (true) {
                                    if (i12 < tL_messages_stickerSet.documents.size()) {
                                        document = tL_messages_stickerSet.documents.get(i12);
                                        if (document == null || document.f22386id != jLongValue) {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                    }
                    if (document == null && !tL_messages_stickerSet.documents.isEmpty()) {
                        document = tL_messages_stickerSet.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document == null) {
                    MediaDataController.getInstance(i10).loadStickersByEmojiOrName(str, false, tL_messages_stickerSet == null);
                } else {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new p9(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f22999a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                }
                break;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.f9680e, this.f9678b, this.f9679c, (q0.a) this.f9681f);
                break;
            case 2:
                fs fsVar = (fs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f9680e;
                TLObject tLObject = (TLObject) this.f9681f;
                ArrayList arrayList = fsVar.P;
                int i13 = fsVar.J;
                if (this.f9679c == fsVar.Z && TextUtils.equals(tL_messages_searchGlobal.f22491q, fsVar.f28441a0)) {
                    fsVar.V = false;
                    if (!this.f9678b) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i13).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i13).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i13).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.Message message = arrayList2.get(i14);
                            i14++;
                            MessageObject messageObject = new MessageObject(i13, message, false, true);
                            messageObject.setQuery(fsVar.f28441a0);
                            arrayList.add(messageObject);
                        }
                        fsVar.X = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        fsVar.Y = messages_messages.next_rate;
                    }
                    fsVar.N(true);
                    break;
                }
                break;
            case 3:
                hs hsVar = (hs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f9680e;
                TLObject tLObject2 = (TLObject) this.f9681f;
                ArrayList arrayList3 = hsVar.L;
                int i15 = hsVar.J;
                if (this.f9679c == hsVar.W && TextUtils.equals(tL_messages_searchGlobal2.f22491q, hsVar.X)) {
                    hsVar.S = false;
                    if (!this.f9678b) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i15).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i15).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i15).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i16);
                            i16++;
                            MessageObject messageObject2 = new MessageObject(i15, message2, false, true);
                            messageObject2.setQuery(hsVar.X);
                            arrayList3.add(messageObject2);
                        }
                        hsVar.U = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        hsVar.V = messages_messages2.next_rate;
                    }
                    hsVar.N(true);
                    break;
                }
                break;
            default:
                yf.p0 p0Var = (yf.p0) this.d;
                yf.q0 q0Var = (yf.q0) this.f9680e;
                Runnable runnable = (Runnable) this.f9681f;
                boolean z11 = this.f9678b;
                p0Var.d(q0Var, this.f9679c, z11 ? p0Var.h : null);
                if (z11) {
                    p0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    public l8(b51 b51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f9677a = i11;
        this.d = b51Var;
        this.f9679c = i10;
        this.f9680e = tL_messages_searchGlobal;
        this.f9678b = z10;
        this.f9681f = tLObject;
    }

    public l8(yf.p0 p0Var, yf.q0 q0Var, int i10, boolean z10, Runnable runnable) {
        this.f9677a = 4;
        this.d = p0Var;
        this.f9680e = q0Var;
        this.f9679c = i10;
        this.f9678b = z10;
        this.f9681f = runnable;
    }

    public l8(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f9677a = 0;
        this.f9678b = z10;
        this.f9679c = i10;
        this.d = str;
        this.f9680e = imageReceiver;
        this.f9681f = zArr;
    }
}
