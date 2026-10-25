package bi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.Window;
import java.util.ArrayList;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.ou;
import org.telegram.ui.pu;
import org.telegram.ui.ru;
public final class db implements Runnable {
    public final int f4505a;
    public final int f4506b;
    public final boolean f4507c;
    public final Object d;
    public final Object e;
    public final Object f4508f;

    public db(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
        this.f4505a = i11;
        this.d = obj;
        this.e = obj2;
        this.f4506b = i10;
        this.f4507c = z10;
        this.f4508f = obj3;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        Activity activity;
        xj0 xj0Var;
        float f7;
        RectF rectF;
        int i10 = this.f4505a;
        Window window = null;
        boolean z10 = true;
        Object obj = this.f4508f;
        boolean z11 = this.f4507c;
        int i11 = this.f4506b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z11) {
                    str = UserConfig.getInstance(i11).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i11).checkTonGiftStickers();
                        return;
                    }
                } else {
                    str = UserConfig.getInstance(i11).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i11).checkPremiumGiftStickers();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByEmojiOrName(str);
                }
                if (stickerSetByName != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < stickerSetByName.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = stickerSetByName.packs.get(i12);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i13 = 0; i13 < stickerSetByName.documents.size(); i13++) {
                                    document = stickerSetByName.documents.get(i13);
                                    if (document == null || document.f22033id != longValue) {
                                    }
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                    document = null;
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new hc(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.y6.f23297a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", stickerSetByName, 1);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                MediaDataController mediaDataController = MediaDataController.getInstance(i11);
                if (tL_messages_stickerSet != null) {
                    z10 = false;
                }
                mediaDataController.loadStickersByEmojiOrName(str, false, z10);
                return;
            case 1:
                m4.p0 p0Var = (m4.p0) obj3;
                n4.t tVar = (n4.t) obj2;
                m4.o0 o0Var = (m4.o0) obj;
                m4.f0 f0Var = p0Var.f18181g;
                if (!f0Var.j()) {
                    if (!((n4.n) p0Var.f18186m.f18696b).f18679a.isActive()) {
                        StringBuilder k10 = ic.a.k(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        k10.append(tVar.f18698a.f18700b);
                        e2.a.l("MediaSessionLegacyStub", k10.toString());
                        return;
                    }
                    m4.w L = p0Var.L(tVar);
                    if (!p0Var.f18180f.v(L, i11)) {
                        if (i11 == 1 && !f0Var.f18057t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    qb.a aVar = f0Var.e;
                    f0Var.s(L);
                    aVar.getClass();
                    try {
                        o0Var.i(L);
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                    }
                    if (z11) {
                        new SparseBooleanArray().append(i11, true);
                        f0Var.p(L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((MessagesController) obj3).lambda$startShortPoll$334((TLRPC.Chat) obj2, z11, i11, (q0.a) obj);
                return;
            case 3:
                ct ctVar = (ct) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = ctVar.V;
                int i14 = ctVar.P;
                if (i11 == ctVar.f27257f0 && TextUtils.equals(tL_messages_searchGlobal.f22138q, ctVar.f27258g0)) {
                    ctVar.f27253b0 = false;
                    if (!z11) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i14).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i14).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i14).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList2.get(i15);
                            i15++;
                            MessageObject messageObject = new MessageObject(i14, message, false, true);
                            messageObject.setQuery(ctVar.f27258g0);
                            arrayList.add(messageObject);
                        }
                        ctVar.f27255d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        ctVar.f27256e0 = messages_messages.next_rate;
                    }
                    ctVar.O(true);
                    return;
                }
                return;
            case 4:
                et etVar = (et) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = etVar.R;
                int i16 = etVar.P;
                if (i11 == etVar.f27979c0 && TextUtils.equals(tL_messages_searchGlobal2.f22138q, etVar.f27980d0)) {
                    etVar.Y = false;
                    if (!z11) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i17);
                            i17++;
                            MessageObject messageObject2 = new MessageObject(i16, message2, false, true);
                            messageObject2.setQuery(etVar.f27980d0);
                            arrayList3.add(messageObject2);
                        }
                        etVar.f27977a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        etVar.f27978b0 = messages_messages2.next_rate;
                    }
                    etVar.O(true);
                    return;
                }
                return;
            case 5:
                pu puVar = (pu) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                ru ruVar = puVar.f42658c;
                ruVar.a();
                org.telegram.ui.Cells.v8 v8Var = ruVar.e;
                ruVar.c();
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23595q6, false);
                xj0 xj0Var2 = ruVar.d;
                xj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23297a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = ruVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        ruVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = ruVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = ruVar.f43291n;
                    }
                    int i18 = i11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ruVar.h = ofFloat;
                    if (z11) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    float f10 = f7;
                    xj0Var = xj0Var2;
                    ofFloat.addUpdateListener(new ou(puVar, f10, i18, x03, activity));
                    ruVar.h.addListener(new org.telegram.ui.t0(activity, x03, 1));
                    ruVar.h.setDuration(350L);
                    ruVar.h.start();
                } else {
                    xj0Var = xj0Var2;
                }
                if (org.telegram.ui.ActionBar.y6.i1()) {
                    v8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), xj0Var, true);
                    v8Var.f25598w += 2;
                } else {
                    v8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), xj0Var, true);
                    v8Var.f25598w += 2;
                }
                org.telegram.ui.ActionBar.y6.J1(r2Var);
                return;
            default:
                rg.q0 q0Var = (rg.q0) obj3;
                rg.r0 r0Var = (rg.r0) obj2;
                Runnable runnable = (Runnable) obj;
                if (z11) {
                    rectF = q0Var.h;
                } else {
                    rectF = null;
                }
                q0Var.d(r0Var, i11, rectF);
                if (z11) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public db(m4.p0 p0Var, int i10, n4.t tVar, m4.o0 o0Var, boolean z10) {
        this.f4505a = 1;
        this.d = p0Var;
        this.f4506b = i10;
        this.e = tVar;
        this.f4508f = o0Var;
        this.f4507c = z10;
    }

    public db(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f4505a = 2;
        this.d = messagesController;
        this.e = chat;
        this.f4507c = z10;
        this.f4506b = i10;
        this.f4508f = aVar;
    }

    public db(j71 j71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f4505a = i11;
        this.d = j71Var;
        this.f4506b = i10;
        this.e = tL_messages_searchGlobal;
        this.f4507c = z10;
        this.f4508f = tLObject;
    }

    public db(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f4505a = 0;
        this.f4507c = z10;
        this.f4506b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f4508f = zArr;
    }
}
