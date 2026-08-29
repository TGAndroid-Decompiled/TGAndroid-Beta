package ag;

import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import jh.l9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.ns;
public final class d1 implements Runnable {
    public final int f436a;
    public final boolean f437b;
    public final int f438c;
    public final Object d;
    public final Object f439e;
    public final Object f440f;

    public d1(f1 f1Var, g1 g1Var, int i10, boolean z10, Runnable runnable) {
        this.f436a = 0;
        this.d = f1Var;
        this.f439e = g1Var;
        this.f438c = i10;
        this.f437b = z10;
        this.f440f = runnable;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f436a) {
            case 0:
                f1 f1Var = (f1) this.d;
                g1 g1Var = (g1) this.f439e;
                Runnable runnable = (Runnable) this.f440f;
                boolean z10 = this.f437b;
                if (z10) {
                    rectF = f1Var.h;
                } else {
                    rectF = null;
                }
                f1Var.d(g1Var, this.f438c, rectF);
                if (z10) {
                    f1Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f439e;
                boolean[] zArr = (boolean[]) this.f440f;
                boolean z11 = this.f437b;
                int i10 = this.f438c;
                if (z11) {
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
                                    if (document == null || document.f22398id != longValue) {
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
                boolean z12 = true;
                if (document != null) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new l9(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.f23009a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                if (tL_messages_stickerSet != null) {
                    z12 = false;
                }
                mediaDataController.loadStickersByEmojiOrName(str, false, z12);
                return;
            case 2:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.f439e, this.f437b, this.f438c, (q0.a) this.f440f);
                return;
            case 3:
                ls lsVar = (ls) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f439e;
                TLObject tLObject = (TLObject) this.f440f;
                ArrayList arrayList = lsVar.P;
                int i13 = lsVar.J;
                if (this.f438c == lsVar.Z && TextUtils.equals(tL_messages_searchGlobal.f22503q, lsVar.f30420a0)) {
                    lsVar.V = false;
                    if (!this.f437b) {
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
                            messageObject.setQuery(lsVar.f30420a0);
                            arrayList.add(messageObject);
                        }
                        lsVar.X = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        lsVar.Y = messages_messages.next_rate;
                    }
                    lsVar.N(true);
                    return;
                }
                return;
            default:
                ns nsVar = (ns) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f439e;
                TLObject tLObject2 = (TLObject) this.f440f;
                ArrayList arrayList3 = nsVar.L;
                int i15 = nsVar.J;
                if (this.f438c == nsVar.W && TextUtils.equals(tL_messages_searchGlobal2.f22503q, nsVar.X)) {
                    nsVar.S = false;
                    if (!this.f437b) {
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
                            messageObject2.setQuery(nsVar.X);
                            arrayList3.add(messageObject2);
                        }
                        nsVar.U = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        nsVar.V = messages_messages2.next_rate;
                    }
                    nsVar.N(true);
                    return;
                }
                return;
        }
    }

    public d1(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f436a = 2;
        this.d = messagesController;
        this.f439e = chat;
        this.f437b = z10;
        this.f438c = i10;
        this.f440f = aVar;
    }

    public d1(k51 k51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f436a = i11;
        this.d = k51Var;
        this.f438c = i10;
        this.f439e = tL_messages_searchGlobal;
        this.f437b = z10;
        this.f440f = tLObject;
    }

    public d1(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f436a = 1;
        this.f437b = z10;
        this.f438c = i10;
        this.d = str;
        this.f439e = imageReceiver;
        this.f440f = zArr;
    }
}
