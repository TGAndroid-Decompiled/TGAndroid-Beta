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
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.z61;
import zh.u6;
public final class l0 implements Runnable {
    public final int f15506a;
    public final boolean f15507b;
    public final int f15508c;
    public final Object d;
    public final Object e;
    public final Object f15509f;

    public l0(q0 q0Var, int i10, n4.t tVar, p0 p0Var, boolean z10) {
        this.f15506a = 0;
        this.d = q0Var;
        this.f15508c = i10;
        this.e = tVar;
        this.f15509f = p0Var;
        this.f15507b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f15506a) {
            case 0:
                q0 q0Var = (q0) this.d;
                n4.t tVar = (n4.t) this.e;
                p0 p0Var = (p0) this.f15509f;
                f0 f0Var = q0Var.f15573g;
                if (!f0Var.j()) {
                    boolean isActive = ((n4.n) q0Var.f15578m.f16031b).f16014a.isActive();
                    int i10 = this.f15508c;
                    if (!isActive) {
                        StringBuilder k10 = i2.d.k(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        k10.append(tVar.f16033a.f16035b);
                        e2.a.l("MediaSessionLegacyStub", k10.toString());
                        return;
                    }
                    w L = q0Var.L(tVar);
                    if (!q0Var.f15572f.u(L, i10)) {
                        if (i10 == 1 && !f0Var.f15440t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    pb.a aVar = f0Var.e;
                    f0Var.s(L);
                    aVar.getClass();
                    try {
                        p0Var.f(L);
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                    }
                    if (this.f15507b) {
                        new SparseBooleanArray().append(i10, true);
                        f0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.e, this.f15507b, this.f15508c, (q0.a) this.f15509f);
                return;
            case 2:
                et etVar = (et) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f15509f;
                ArrayList arrayList = etVar.T;
                int i11 = etVar.N;
                if (this.f15508c == etVar.f24789d0 && TextUtils.equals(tL_messages_searchGlobal.f19327q, etVar.f24790e0)) {
                    etVar.Z = false;
                    if (!this.f15507b) {
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
                            messageObject.setQuery(etVar.f24790e0);
                            arrayList.add(messageObject);
                        }
                        etVar.f24787b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        etVar.f24788c0 = messages_messages.next_rate;
                    }
                    etVar.N(true);
                    return;
                }
                return;
            case 3:
                gt gtVar = (gt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f15509f;
                ArrayList arrayList3 = gtVar.P;
                int i13 = gtVar.N;
                if (this.f15508c == gtVar.f25418a0 && TextUtils.equals(tL_messages_searchGlobal2.f19327q, gtVar.f25419b0)) {
                    gtVar.W = false;
                    if (!this.f15507b) {
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
                            messageObject2.setQuery(gtVar.f25419b0);
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
                qg.q0 q0Var2 = (qg.q0) this.d;
                qg.r0 r0Var = (qg.r0) this.e;
                Runnable runnable = (Runnable) this.f15509f;
                boolean z10 = this.f15507b;
                if (z10) {
                    rectF = q0Var2.h;
                } else {
                    rectF = null;
                }
                q0Var2.d(r0Var, this.f15508c, rectF);
                if (z10) {
                    q0Var2.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f15509f;
                boolean z11 = this.f15507b;
                int i15 = this.f15508c;
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
                                    if (document == null || document.f19222id != longValue) {
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.f19843a7, 0.3f);
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

    public l0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f15506a = 1;
        this.d = messagesController;
        this.e = chat;
        this.f15507b = z10;
        this.f15508c = i10;
        this.f15509f = aVar;
    }

    public l0(z61 z61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f15506a = i11;
        this.d = z61Var;
        this.f15508c = i10;
        this.e = tL_messages_searchGlobal;
        this.f15507b = z10;
        this.f15509f = tLObject;
    }

    public l0(qg.q0 q0Var, qg.r0 r0Var, int i10, boolean z10, Runnable runnable) {
        this.f15506a = 4;
        this.d = q0Var;
        this.e = r0Var;
        this.f15508c = i10;
        this.f15507b = z10;
        this.f15509f = runnable;
    }

    public l0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f15506a = 5;
        this.f15507b = z10;
        this.f15508c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f15509f = zArr;
    }
}
