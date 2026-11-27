package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class la7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public la7(rv0 rv0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, id idVar) {
        this.a = (byte) 8;
        this.b = rv0Var;
        this.d = tLObject;
        this.e = strArr;
        this.c = tL_error;
        this.f = idVar;
    }

    private final void a() {
        af2 af2Var = (af2) this.b;
        TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        le2 le2Var = (le2) this.c;
        ze2 ze2Var = af2Var.f;
        ze2Var.e = tl_chatThemes.next_offset;
        ze2Var.a = tl_chatThemes.hash;
        ze2Var.b = System.currentTimeMillis();
        ArrayList arrayList3 = (ArrayList) ze2Var.d;
        if (arrayList3 == null) {
            ze2Var.d = new ArrayList(arrayList);
        } else {
            arrayList3.addAll(arrayList);
        }
        if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
            ze2Var.c = true;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = null;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            ez3 ez3Var = (ez3) obj;
            HashMap hashMap = af2Var.e;
            dpb dpbVar = ez3Var.c;
            if (dpbVar != null && (str = dpbVar.b) == null) {
                str = dpbVar.a;
            }
            hashMap.put(str, ez3Var);
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) obj2;
            af2Var.r(wf3.n(tL_chatThemeUniqueGift.gift.theme_peer), tL_chatThemeUniqueGift.gift.slug);
        }
        le2Var.onComplete(null);
    }

    private final void b() {
        ag2 ag2Var = (ag2) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        zh6 zh6Var = (zh6) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.c;
        sv9 sv9Var = ag2Var.h;
        bg2 bg2Var = ag2Var.E;
        if (bg2Var.o1) {
            ag2Var.s = false;
            ag2Var.d = arrayList;
            ag2Var.e = zh6Var;
            ag2Var.f = arrayList2;
            sv9Var.f(arrayList, null);
            if (!xc2.T(bg2Var.n)) {
                ArrayList arrayList4 = sv9Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i = ag2Var.r;
            ag2Var.f();
            if (ag2Var.r > i) {
                bg2Var.C0(i);
            }
            if (!sv9Var.e() && ag2Var.r == 0) {
                bg2Var.b.e(false, true);
            }
        }
    }

    private final void c() {
        rw2 rw2Var = (rw2) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) this.f;
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_myStickers)) {
            TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject;
            ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i);
                i++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                if (!stickerSet.emojis && !stickerSet.masks) {
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                    TLRPC.TL_messages_stickerSet n0 = ls6.d0(rw2Var.r).n0(tL_inputStickerSetID, true);
                    if (n0 == null || n0.documents.size() < 120) {
                        arrayList.add(stickerSetCovered2);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) c00.g(1, tL_messages_myStickers.sets)).set.id;
                ConnectionsManager.getInstance(rw2Var.r).sendRequest(tL_messages_getMyStickers, new fn0(rw2Var, arrayList, tL_messages_getMyStickers, (byte) 20));
            }
        }
    }

    private final void d() {
        q84 q84Var = (q84) this.b;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_getFactCheck tL_getFactCheck = (TLRPC.TL_getFactCheck) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            for (int i = 0; i < arrayList3.size(); i++) {
                if (arrayList3.get(i) instanceof TLRPC.TL_factCheck) {
                    arrayList2.add((TLRPC.TL_factCheck) arrayList3.get(i));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (int i2 = 0; i2 < Math.min(tL_getFactCheck.msg_id.size(), arrayList2.size()); i2++) {
            Integer num = tL_getFactCheck.msg_id.get(i2);
            num.getClass();
            hashMap2.put(num, (TLRPC.TL_factCheck) arrayList2.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < tL_getFactCheck.msg_id.size(); i4++) {
            p84 p84Var = (p84) arrayList.get(i4);
            Integer num2 = tL_getFactCheck.msg_id.get(i4);
            num2.getClass();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            pcc pccVar = (pcc) hashMap.get(p84Var);
            if (tL_factCheck != null && !tL_factCheck.need_check && pccVar != null) {
                pccVar.a(tL_factCheck);
                i3++;
                q84Var.d.remove(p84Var);
            }
        }
        if (i3 > 0) {
            jn7.f(q84Var.a).k(jn7.D3, new Object[0]);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la7.run():void");
    }

    public la7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public la7(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public la7(TLObject tLObject, uc7 uc7Var, ku0 ku0Var, nm0 nm0Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = tLObject;
        this.b = uc7Var;
        this.e = ku0Var;
        this.f = nm0Var;
        this.c = tL_error;
    }

    public la7(TLRPC.TL_error tL_error, pcc pccVar, TLObject tLObject, uc7 uc7Var, pcc pccVar2, byte b) {
        this.a = b;
        this.c = tL_error;
        this.d = pccVar;
        this.e = tLObject;
        this.b = uc7Var;
        this.f = pccVar2;
    }

    public la7(e eVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = eVar;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
    }
}
