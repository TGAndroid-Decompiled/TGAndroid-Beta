package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class da7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public da7(qw0 qw0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, he heVar) {
        this.a = (byte) 8;
        this.b = qw0Var;
        this.d = tLObject;
        this.e = strArr;
        this.c = tL_error;
        this.f = heVar;
    }

    private final void a() {
        vg2 vg2Var = (vg2) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        vh6 vh6Var = (vh6) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.c;
        bu9 bu9Var = vg2Var.h;
        wg2 wg2Var = vg2Var.E;
        if (wg2Var.o1) {
            vg2Var.s = false;
            vg2Var.d = arrayList;
            vg2Var.e = vh6Var;
            vg2Var.f = arrayList2;
            bu9Var.f(arrayList, null);
            if (!sd2.T(wg2Var.n)) {
                ArrayList arrayList4 = bu9Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i = vg2Var.r;
            vg2Var.f();
            if (vg2Var.r > i) {
                wg2Var.C0(i);
            }
            if (!bu9Var.e() && vg2Var.r == 0) {
                wg2Var.b.e(false, true);
            }
        }
    }

    private final void b() {
        hx2 hx2Var = (hx2) this.b;
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
                    TLRPC.TL_messages_stickerSet n0 = hs6.d0(hx2Var.r).n0(tL_inputStickerSetID, true);
                    if (n0 == null || n0.documents.size() < 120) {
                        arrayList.add(stickerSetCovered2);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) b10.f(1, tL_messages_myStickers.sets)).set.id;
                ConnectionsManager.getInstance(hx2Var.r).sendRequest(tL_messages_getMyStickers, new eo0(hx2Var, arrayList, tL_messages_getMyStickers, (byte) 20));
            }
        }
    }

    private final void c() {
        e94 e94Var = (e94) this.b;
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
            d94 d94Var = (d94) arrayList.get(i4);
            Integer num2 = tL_getFactCheck.msg_id.get(i4);
            num2.getClass();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            qac qacVar = (qac) hashMap.get(d94Var);
            if (tL_factCheck != null && !tL_factCheck.need_check && qacVar != null) {
                qacVar.a(tL_factCheck);
                i3++;
                e94Var.d.remove(d94Var);
            }
        }
        if (i3 > 0) {
            nm7.f(e94Var.a).k(nm7.D3, new Object[0]);
        }
    }

    private final void d() {
        mw4 mw4Var = (mw4) this.b;
        k11 k11Var = (k11) this.d;
        he heVar = (he) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        npa npaVar = mw4Var.D1;
        if (npaVar != null) {
            npaVar.run();
        }
        k11Var.c(false);
        heVar.dismiss();
        mw4Var.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            if (updates != null) {
                u31 I = c41.b0(S).I(2131624029, jb6.M0(2131749632, null), gm.S2(jb6.a0(null, null, 2131749633, mw4Var.n1, pg3.s(mw4Var.o1))));
                I.u = true;
                I.j();
                return;
            }
            c41.b0(S).g0(tL_error, false);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da7.run():void");
    }

    public da7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public da7(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public da7(TLObject tLObject, oc7 oc7Var, jv0 jv0Var, vn0 vn0Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = tLObject;
        this.b = oc7Var;
        this.e = jv0Var;
        this.f = vn0Var;
        this.c = tL_error;
    }

    public da7(TLRPC.TL_error tL_error, qac qacVar, TLObject tLObject, oc7 oc7Var, qac qacVar2, byte b) {
        this.a = b;
        this.c = tL_error;
        this.d = qacVar;
        this.e = tLObject;
        this.b = oc7Var;
        this.f = qacVar2;
    }

    public da7(d dVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = dVar;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
    }
}
