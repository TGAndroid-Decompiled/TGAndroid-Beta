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
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.w51;
public final class b1 implements Runnable {
    public final int f2315a;
    public final boolean f2316b;
    public final int f2317c;
    public final Object d;
    public final Object e;
    public final Object f2318f;

    public b1(d1 d1Var, e1 e1Var, int i10, boolean z4, Runnable runnable) {
        this.f2315a = 0;
        this.d = d1Var;
        this.e = e1Var;
        this.f2317c = i10;
        this.f2316b = z4;
        this.f2318f = runnable;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f2315a) {
            case 0:
                d1 d1Var = (d1) this.d;
                e1 e1Var = (e1) this.e;
                Runnable runnable = (Runnable) this.f2318f;
                boolean z4 = this.f2316b;
                if (z4) {
                    rectF = d1Var.h;
                } else {
                    rectF = null;
                }
                d1Var.d(e1Var, this.f2317c, rectF);
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
                boolean[] zArr = (boolean[]) this.f2318f;
                boolean z10 = this.f2316b;
                int i10 = this.f2317c;
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
                                    if (document == null || document.f19190id != longValue) {
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.f19852a7, 0.3f);
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
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.f2316b, this.f2317c, (q0.a) this.f2318f);
                return;
            case 3:
                ps psVar = (ps) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f2318f;
                ArrayList arrayList = psVar.Q;
                int i13 = psVar.K;
                if (this.f2317c == psVar.f27974a0 && TextUtils.equals(tL_messages_searchGlobal.f19295q, psVar.f27975b0)) {
                    psVar.W = false;
                    if (!this.f2316b) {
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
                            messageObject.setQuery(psVar.f27975b0);
                            arrayList.add(messageObject);
                        }
                        psVar.Y = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        psVar.Z = messages_messages.next_rate;
                    }
                    psVar.N(true);
                    return;
                }
                return;
            default:
                rs rsVar = (rs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f2318f;
                ArrayList arrayList3 = rsVar.M;
                int i15 = rsVar.K;
                if (this.f2317c == rsVar.X && TextUtils.equals(tL_messages_searchGlobal2.f19295q, rsVar.Y)) {
                    rsVar.T = false;
                    if (!this.f2316b) {
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
                            messageObject2.setQuery(rsVar.Y);
                            arrayList3.add(messageObject2);
                        }
                        rsVar.V = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        rsVar.W = messages_messages2.next_rate;
                    }
                    rsVar.N(true);
                    return;
                }
                return;
        }
    }

    public b1(MessagesController messagesController, TLRPC.Chat chat, boolean z4, int i10, q0.a aVar) {
        this.f2315a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f2316b = z4;
        this.f2317c = i10;
        this.f2318f = aVar;
    }

    public b1(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, TLObject tLObject, int i11) {
        this.f2315a = i11;
        this.d = w51Var;
        this.f2317c = i10;
        this.e = tL_messages_searchGlobal;
        this.f2316b = z4;
        this.f2318f = tLObject;
    }

    public b1(boolean z4, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f2315a = 1;
        this.f2316b = z4;
        this.f2317c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f2318f = zArr;
    }
}
