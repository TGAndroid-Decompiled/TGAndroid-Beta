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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import yh.u6;
public final class g0 implements Runnable {
    public final int f15845a;
    public final boolean f15846b;
    public final int f15847c;
    public final Object d;
    public final Object f15848e;
    public final Object f15849f;

    public g0(m0 m0Var, int i10, n4.a0 a0Var, l0 l0Var, boolean z10) {
        this.f15845a = 0;
        this.d = m0Var;
        this.f15847c = i10;
        this.f15848e = a0Var;
        this.f15849f = l0Var;
        this.f15846b = z10;
    }

    @Override
    public final void run() {
        RectF rectF;
        String str;
        TLRPC.Document document;
        switch (this.f15845a) {
            case 0:
                m0 m0Var = (m0) this.d;
                n4.a0 a0Var = (n4.a0) this.f15848e;
                l0 l0Var = (l0) this.f15849f;
                c0 c0Var = m0Var.f15905g;
                if (!c0Var.j()) {
                    boolean isActive = ((n4.s) m0Var.f15908k.f16362b).f16343a.isActive();
                    int i10 = this.f15847c;
                    if (!isActive) {
                        StringBuilder l4 = hg.c.l(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(a0Var.f16291a.f16293b);
                        e2.a.n("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    r L = m0Var.L(a0Var);
                    if (!m0Var.f15904f.B(L, i10)) {
                        if (i10 == 1 && !c0Var.f15748t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    na.d dVar = c0Var.f15734e;
                    c0Var.s(L);
                    dVar.getClass();
                    try {
                        l0Var.g(L);
                    } catch (RemoteException e7) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                    }
                    if (this.f15846b) {
                        new SparseBooleanArray().append(i10, true);
                        c0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.f15848e, this.f15846b, this.f15847c, (q0.a) this.f15849f);
                return;
            case 2:
                kt ktVar = (kt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f15848e;
                TLObject tLObject = (TLObject) this.f15849f;
                ArrayList arrayList = ktVar.T;
                int i11 = ktVar.N;
                if (this.f15847c == ktVar.f27941d0 && TextUtils.equals(tL_messages_searchGlobal.f19913q, ktVar.f27942e0)) {
                    ktVar.Z = false;
                    if (!this.f15846b) {
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
                            messageObject.setQuery(ktVar.f27942e0);
                            arrayList.add(messageObject);
                        }
                        ktVar.f27939b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        ktVar.f27940c0 = messages_messages.next_rate;
                    }
                    ktVar.N(true);
                    return;
                }
                return;
            case 3:
                mt mtVar = (mt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f15848e;
                TLObject tLObject2 = (TLObject) this.f15849f;
                ArrayList arrayList3 = mtVar.P;
                int i13 = mtVar.N;
                if (this.f15847c == mtVar.f28657a0 && TextUtils.equals(tL_messages_searchGlobal2.f19913q, mtVar.f28658b0)) {
                    mtVar.W = false;
                    if (!this.f15846b) {
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
                            messageObject2.setQuery(mtVar.f28658b0);
                            arrayList3.add(messageObject2);
                        }
                        mtVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        mtVar.Z = messages_messages2.next_rate;
                    }
                    mtVar.N(true);
                    return;
                }
                return;
            case 4:
                pg.r0 r0Var = (pg.r0) this.d;
                pg.s0 s0Var = (pg.s0) this.f15848e;
                Runnable runnable = (Runnable) this.f15849f;
                boolean z10 = this.f15846b;
                if (z10) {
                    rectF = r0Var.h;
                } else {
                    rectF = null;
                }
                r0Var.d(s0Var, this.f15847c, rectF);
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
                ImageReceiver imageReceiver = (ImageReceiver) this.f15848e;
                boolean[] zArr = (boolean[]) this.f15849f;
                boolean z11 = this.f15846b;
                int i15 = this.f15847c;
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
                                    if (document == null || document.f19808id != longValue) {
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, h6.f20503a7, 0.3f);
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

    public g0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f15845a = 1;
        this.d = messagesController;
        this.f15848e = chat;
        this.f15846b = z10;
        this.f15847c = i10;
        this.f15849f = aVar;
    }

    public g0(h71 h71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f15845a = i11;
        this.d = h71Var;
        this.f15847c = i10;
        this.f15848e = tL_messages_searchGlobal;
        this.f15846b = z10;
        this.f15849f = tLObject;
    }

    public g0(pg.r0 r0Var, pg.s0 s0Var, int i10, boolean z10, Runnable runnable) {
        this.f15845a = 4;
        this.d = r0Var;
        this.f15848e = s0Var;
        this.f15847c = i10;
        this.f15846b = z10;
        this.f15849f = runnable;
    }

    public g0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f15845a = 5;
        this.f15846b = z10;
        this.f15847c = i10;
        this.d = str;
        this.f15848e = imageReceiver;
        this.f15849f = zArr;
    }
}
