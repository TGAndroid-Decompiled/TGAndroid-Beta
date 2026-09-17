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
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.x51;
import yh.d7;
public final class e0 implements Runnable {
    public final int f14508a;
    public final boolean f14509b;
    public final int f14510c;
    public final Object d;
    public final Object e;
    public final Object f14511f;

    public e0(l0 l0Var, int i10, n4.a0 a0Var, k0 k0Var, boolean z10) {
        this.f14508a = 0;
        this.d = l0Var;
        this.f14510c = i10;
        this.e = a0Var;
        this.f14511f = k0Var;
        this.f14509b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f14508a) {
            case 0:
                l0 l0Var = (l0) this.d;
                n4.a0 a0Var = (n4.a0) this.e;
                k0 k0Var = (k0) this.f14511f;
                a0 a0Var2 = l0Var.f14606g;
                if (!a0Var2.j()) {
                    boolean isActive = ((n4.r) l0Var.f14609k.f15004b).f14985a.isActive();
                    int i10 = this.f14510c;
                    if (!isActive) {
                        StringBuilder l4 = hg.k0.l(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(a0Var.f14939a.f14941b);
                        e2.a.n("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    r L = l0Var.L(a0Var);
                    if (!l0Var.f14605f.B(L, i10)) {
                        if (i10 == 1 && !a0Var2.f14476t.u()) {
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
                    if (this.f14509b) {
                        new SparseBooleanArray().append(i10, true);
                        a0Var2.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.f14509b, this.f14510c, (q0.a) this.f14511f);
                return;
            case 2:
                rs rsVar = (rs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f14511f;
                ArrayList arrayList = rsVar.T;
                int i11 = rsVar.N;
                if (this.f14510c == rsVar.f27681d0 && TextUtils.equals(tL_messages_searchGlobal.f18232q, rsVar.f27682e0)) {
                    rsVar.Z = false;
                    if (!this.f14509b) {
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
                            messageObject.setQuery(rsVar.f27682e0);
                            arrayList.add(messageObject);
                        }
                        rsVar.f27679b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        rsVar.f27680c0 = messages_messages.next_rate;
                    }
                    rsVar.N(true);
                    return;
                }
                return;
            case 3:
                ts tsVar = (ts) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f14511f;
                ArrayList arrayList3 = tsVar.P;
                int i13 = tsVar.N;
                if (this.f14510c == tsVar.f28196a0 && TextUtils.equals(tL_messages_searchGlobal2.f18232q, tsVar.f28197b0)) {
                    tsVar.W = false;
                    if (!this.f14509b) {
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
                            messageObject2.setQuery(tsVar.f28197b0);
                            arrayList3.add(messageObject2);
                        }
                        tsVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        tsVar.Z = messages_messages2.next_rate;
                    }
                    tsVar.N(true);
                    return;
                }
                return;
            case 4:
                pg.q0 q0Var = (pg.q0) this.d;
                pg.r0 r0Var = (pg.r0) this.e;
                Runnable runnable = (Runnable) this.f14511f;
                boolean z10 = this.f14509b;
                if (z10) {
                    rectF = q0Var.h;
                } else {
                    rectF = null;
                }
                q0Var.d(r0Var, this.f14510c, rectF);
                if (z10) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f14511f;
                boolean z11 = this.f14509b;
                int i15 = this.f14510c;
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
                                    if (document == null || document.f18127id != longValue) {
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
                    imageReceiver.setDelegate(new d7(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.f18806a7, 0.3f);
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
        this.f14508a = 1;
        this.d = messagesController;
        this.e = chat;
        this.f14509b = z10;
        this.f14510c = i10;
        this.f14511f = aVar;
    }

    public e0(x51 x51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f14508a = i11;
        this.d = x51Var;
        this.f14510c = i10;
        this.e = tL_messages_searchGlobal;
        this.f14509b = z10;
        this.f14511f = tLObject;
    }

    public e0(pg.q0 q0Var, pg.r0 r0Var, int i10, boolean z10, Runnable runnable) {
        this.f14508a = 4;
        this.d = q0Var;
        this.e = r0Var;
        this.f14510c = i10;
        this.f14509b = z10;
        this.f14511f = runnable;
    }

    public e0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f14508a = 5;
        this.f14509b = z10;
        this.f14510c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f14511f = zArr;
    }
}
