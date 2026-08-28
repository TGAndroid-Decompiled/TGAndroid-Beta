package gh;

import android.graphics.RectF;
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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.z41;
public final class m8 implements Runnable {
    public final int f8574a;
    public final boolean f8575b;
    public final int f8576c;
    public final Object d;
    public final Object f8577e;
    public final Object f8578f;

    public m8(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i9, q0.a aVar) {
        this.f8574a = 1;
        this.d = messagesController;
        this.f8577e = chat;
        this.f8575b = z10;
        this.f8576c = i9;
        this.f8578f = aVar;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        RectF rectF;
        switch (this.f8574a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f8577e;
                boolean[] zArr = (boolean[]) this.f8578f;
                boolean z10 = this.f8575b;
                int i9 = this.f8576c;
                if (z10) {
                    str = UserConfig.getInstance(i9).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i9).checkTonGiftStickers();
                        return;
                    }
                } else {
                    str = UserConfig.getInstance(i9).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i9).checkPremiumGiftStickers();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i9).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i9).getStickerSetByEmojiOrName(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                if (tL_messages_stickerSet != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                    document = tL_messages_stickerSet.documents.get(i11);
                                    if (document == null || document.f22386id != longValue) {
                                    }
                                }
                            } else {
                                i10++;
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
                    imageReceiver.setDelegate(new q9(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.f22947a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i9);
                if (tL_messages_stickerSet != null) {
                    z11 = false;
                }
                mediaDataController.loadStickersByEmojiOrName(str, false, z11);
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.f8577e, this.f8575b, this.f8576c, (q0.a) this.f8578f);
                return;
            case 2:
                hs hsVar = (hs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f8577e;
                TLObject tLObject = (TLObject) this.f8578f;
                ArrayList arrayList = hsVar.P;
                int i12 = hsVar.J;
                if (this.f8576c == hsVar.Z && TextUtils.equals(tL_messages_searchGlobal.f22491q, hsVar.f29179a0)) {
                    hsVar.V = false;
                    if (!this.f8575b) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i12).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i12).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i12).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.Message message = arrayList2.get(i13);
                            i13++;
                            MessageObject messageObject = new MessageObject(i12, message, false, true);
                            messageObject.setQuery(hsVar.f29179a0);
                            arrayList.add(messageObject);
                        }
                        hsVar.X = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        hsVar.Y = messages_messages.next_rate;
                    }
                    hsVar.N(true);
                    return;
                }
                return;
            case 3:
                js jsVar = (js) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f8577e;
                TLObject tLObject2 = (TLObject) this.f8578f;
                ArrayList arrayList3 = jsVar.L;
                int i14 = jsVar.J;
                if (this.f8576c == jsVar.W && TextUtils.equals(tL_messages_searchGlobal2.f22491q, jsVar.X)) {
                    jsVar.S = false;
                    if (!this.f8575b) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i14).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i14).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i14).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i15);
                            i15++;
                            MessageObject messageObject2 = new MessageObject(i14, message2, false, true);
                            messageObject2.setQuery(jsVar.X);
                            arrayList3.add(messageObject2);
                        }
                        jsVar.U = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        jsVar.V = messages_messages2.next_rate;
                    }
                    jsVar.N(true);
                    return;
                }
                return;
            default:
                xf.q0 q0Var = (xf.q0) this.d;
                xf.r0 r0Var = (xf.r0) this.f8577e;
                Runnable runnable = (Runnable) this.f8578f;
                boolean z12 = this.f8575b;
                if (z12) {
                    rectF = q0Var.h;
                } else {
                    rectF = null;
                }
                q0Var.d(r0Var, this.f8576c, rectF);
                if (z12) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public m8(z41 z41Var, int i9, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.f8574a = i10;
        this.d = z41Var;
        this.f8576c = i9;
        this.f8577e = tL_messages_searchGlobal;
        this.f8575b = z10;
        this.f8578f = tLObject;
    }

    public m8(xf.q0 q0Var, xf.r0 r0Var, int i9, boolean z10, Runnable runnable) {
        this.f8574a = 4;
        this.d = q0Var;
        this.f8577e = r0Var;
        this.f8576c = i9;
        this.f8575b = z10;
        this.f8578f = runnable;
    }

    public m8(boolean z10, int i9, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f8574a = 0;
        this.f8575b = z10;
        this.f8576c = i9;
        this.d = str;
        this.f8577e = imageReceiver;
        this.f8578f = zArr;
    }
}
