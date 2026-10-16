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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
import zh.u6;
public final class k0 implements Runnable {
    public final int f15236a;
    public final boolean f15237b;
    public final int f15238c;
    public final Object d;
    public final Object e;
    public final Object f15239f;

    public k0(p0 p0Var, int i10, n4.t tVar, o0 o0Var, boolean z10) {
        this.f15236a = 0;
        this.d = p0Var;
        this.f15238c = i10;
        this.e = tVar;
        this.f15239f = o0Var;
        this.f15237b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f15236a) {
            case 0:
                p0 p0Var = (p0) this.d;
                n4.t tVar = (n4.t) this.e;
                o0 o0Var = (o0) this.f15239f;
                e0 e0Var = p0Var.f15303g;
                if (!e0Var.j()) {
                    boolean isActive = ((n4.n) p0Var.f15308m.f15745b).f15728a.isActive();
                    int i10 = this.f15238c;
                    if (!isActive) {
                        StringBuilder l4 = i2.d.l(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(tVar.f15747a.f15749b);
                        e2.a.l("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    v L = p0Var.L(tVar);
                    if (!p0Var.f15302f.u(L, i10)) {
                        if (i10 == 1 && !e0Var.f15170t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    pb.a aVar = e0Var.e;
                    e0Var.s(L);
                    aVar.getClass();
                    try {
                        o0Var.e(L);
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                    }
                    if (this.f15237b) {
                        new SparseBooleanArray().append(i10, true);
                        e0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.e, this.f15237b, this.f15238c, (q0.a) this.f15239f);
                return;
            case 2:
                et etVar = (et) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f15239f;
                ArrayList arrayList = etVar.T;
                int i11 = etVar.N;
                if (this.f15238c == etVar.f24483d0 && TextUtils.equals(tL_messages_searchGlobal.f19027q, etVar.f24484e0)) {
                    etVar.Z = false;
                    if (!this.f15237b) {
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
                            messageObject.setQuery(etVar.f24484e0);
                            arrayList.add(messageObject);
                        }
                        etVar.f24481b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        etVar.f24482c0 = messages_messages.next_rate;
                    }
                    etVar.N(true);
                    return;
                }
                return;
            case 3:
                gt gtVar = (gt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f15239f;
                ArrayList arrayList3 = gtVar.P;
                int i13 = gtVar.N;
                if (this.f15238c == gtVar.f25106a0 && TextUtils.equals(tL_messages_searchGlobal2.f19027q, gtVar.f25107b0)) {
                    gtVar.W = false;
                    if (!this.f15237b) {
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
                            messageObject2.setQuery(gtVar.f25107b0);
                            arrayList3.add(messageObject2);
                        }
                        gtVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        gtVar.Z = messages_messages2.next_rate;
                    }
                    gtVar.N(true);
                    return;
                }
                return;
            case 4:
                qg.q0 q0Var = (qg.q0) this.d;
                qg.r0 r0Var = (qg.r0) this.e;
                Runnable runnable = (Runnable) this.f15239f;
                boolean z10 = this.f15237b;
                if (z10) {
                    rectF = q0Var.h;
                } else {
                    rectF = null;
                }
                q0Var.d(r0Var, this.f15238c, rectF);
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
                boolean[] zArr = (boolean[]) this.f15239f;
                boolean z11 = this.f15237b;
                int i15 = this.f15238c;
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
                                    if (document == null || document.f18922id != longValue) {
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.f19543a7, 0.3f);
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

    public k0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f15236a = 1;
        this.d = messagesController;
        this.e = chat;
        this.f15237b = z10;
        this.f15238c = i10;
        this.f15239f = aVar;
    }

    public k0(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f15236a = i11;
        this.d = a71Var;
        this.f15238c = i10;
        this.e = tL_messages_searchGlobal;
        this.f15237b = z10;
        this.f15239f = tLObject;
    }

    public k0(qg.q0 q0Var, qg.r0 r0Var, int i10, boolean z10, Runnable runnable) {
        this.f15236a = 4;
        this.d = q0Var;
        this.e = r0Var;
        this.f15238c = i10;
        this.f15237b = z10;
        this.f15239f = runnable;
    }

    public k0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f15236a = 5;
        this.f15237b = z10;
        this.f15238c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f15239f = zArr;
    }
}
