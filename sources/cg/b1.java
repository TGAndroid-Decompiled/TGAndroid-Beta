package cg;

import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import lh.m9;
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
import org.telegram.ui.Components.os;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.w51;
public final class b1 implements Runnable {
    public final int f2298a;
    public final boolean f2299b;
    public final int f2300c;
    public final Object d;
    public final Object e;
    public final Object f2301f;

    public b1(d1 d1Var, e1 e1Var, int i10, boolean z4, Runnable runnable) {
        this.f2298a = 0;
        this.d = d1Var;
        this.e = e1Var;
        this.f2300c = i10;
        this.f2299b = z4;
        this.f2301f = runnable;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f2298a) {
            case 0:
                d1 d1Var = (d1) this.d;
                e1 e1Var = (e1) this.e;
                Runnable runnable = (Runnable) this.f2301f;
                boolean z4 = this.f2299b;
                if (z4) {
                    rectF = d1Var.h;
                } else {
                    rectF = null;
                }
                d1Var.d(e1Var, this.f2300c, rectF);
                if (z4) {
                    d1Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f2301f;
                boolean z10 = this.f2299b;
                int i10 = this.f2300c;
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
                                    if (document == null || document.f19165id != longValue) {
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
                    imageReceiver.setDelegate(new m9(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.f19827a7, 0.3f);
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
            case 2:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.f2299b, this.f2300c, (q0.a) this.f2301f);
                return;
            case 3:
                os osVar = (os) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f2301f;
                ArrayList arrayList = osVar.Q;
                int i13 = osVar.K;
                if (this.f2300c == osVar.f27638a0 && TextUtils.equals(tL_messages_searchGlobal.f19270q, osVar.f27639b0)) {
                    osVar.W = false;
                    if (!this.f2299b) {
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
                            messageObject.setQuery(osVar.f27639b0);
                            arrayList.add(messageObject);
                        }
                        osVar.Y = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        osVar.Z = messages_messages.next_rate;
                    }
                    osVar.N(true);
                    return;
                }
                return;
            default:
                qs qsVar = (qs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f2301f;
                ArrayList arrayList3 = qsVar.M;
                int i15 = qsVar.K;
                if (this.f2300c == qsVar.X && TextUtils.equals(tL_messages_searchGlobal2.f19270q, qsVar.Y)) {
                    qsVar.T = false;
                    if (!this.f2299b) {
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
                            messageObject2.setQuery(qsVar.Y);
                            arrayList3.add(messageObject2);
                        }
                        qsVar.V = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        qsVar.W = messages_messages2.next_rate;
                    }
                    qsVar.N(true);
                    return;
                }
                return;
        }
    }

    public b1(MessagesController messagesController, TLRPC.Chat chat, boolean z4, int i10, q0.a aVar) {
        this.f2298a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f2299b = z4;
        this.f2300c = i10;
        this.f2301f = aVar;
    }

    public b1(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, TLObject tLObject, int i11) {
        this.f2298a = i11;
        this.d = w51Var;
        this.f2300c = i10;
        this.e = tL_messages_searchGlobal;
        this.f2299b = z4;
        this.f2301f = tLObject;
    }

    public b1(boolean z4, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f2298a = 1;
        this.f2299b = z4;
        this.f2300c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f2301f = zArr;
    }
}
