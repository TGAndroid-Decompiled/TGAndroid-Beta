package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class b87 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public b87(hv0 hv0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, hd hdVar) {
        this.a = (byte) 8;
        this.b = hv0Var;
        this.d = tLObject;
        this.e = strArr;
        this.c = tL_error;
        this.f = hdVar;
    }

    private final void a() {
        jf2 jf2Var = (jf2) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        vf6 vf6Var = (vf6) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.c;
        zr9 zr9Var = jf2Var.h;
        kf2 kf2Var = jf2Var.E;
        if (kf2Var.o1) {
            jf2Var.s = false;
            jf2Var.d = arrayList;
            jf2Var.e = vf6Var;
            jf2Var.f = arrayList2;
            zr9Var.f(arrayList, null);
            if (!hc2.T(kf2Var.n)) {
                ArrayList arrayList4 = zr9Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i = jf2Var.r;
            jf2Var.f();
            if (jf2Var.r > i) {
                kf2Var.B0(i);
            }
            if (!zr9Var.e() && jf2Var.r == 0) {
                kf2Var.b.e(false, true);
            }
        }
    }

    private final void b() {
        xv2 xv2Var = (xv2) this.b;
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
                    TLRPC.TL_messages_stickerSet n0 = hq6.d0(xv2Var.r).n0(tL_inputStickerSetID, true);
                    if (n0 == null || n0.documents.size() < 120) {
                        arrayList.add(stickerSetCovered2);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) b00.f(1, tL_messages_myStickers.sets)).set.id;
                ConnectionsManager.getInstance(xv2Var.r).sendRequest(tL_messages_getMyStickers, new en0(xv2Var, arrayList, tL_messages_getMyStickers, (byte) 20));
            }
        }
    }

    private final void c() {
        v74 v74Var = (v74) this.b;
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
            u74 u74Var = (u74) arrayList.get(i4);
            Integer num2 = tL_getFactCheck.msg_id.get(i4);
            num2.getClass();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            p8c p8cVar = (p8c) hashMap.get(u74Var);
            if (tL_factCheck != null && !tL_factCheck.need_check && p8cVar != null) {
                p8cVar.a(tL_factCheck);
                i3++;
                v74Var.d.remove(u74Var);
            }
        }
        if (i3 > 0) {
            kk7.f(v74Var.a).k(kk7.C3, new Object[0]);
        }
    }

    private final void d() {
        lu4 lu4Var = (lu4) this.b;
        c01 c01Var = (c01) this.d;
        hd hdVar = (hd) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        nna nnaVar = lu4Var.D1;
        if (nnaVar != null) {
            nnaVar.run();
        }
        c01Var.c(false);
        hdVar.dismiss();
        lu4Var.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            if (updates != null) {
                m21 I = u21.b0(S).I(2131624029, k96.M0(2131749683, null), gl.S2(k96.a0(null, null, 2131749684, lu4Var.n1, cf3.s(lu4Var.o1))));
                I.t = true;
                I.j();
                return;
            }
            u21.b0(S).g0(tL_error, false);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b87.run():void");
    }

    public b87(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public b87(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public b87(TLObject tLObject, na7 na7Var, au0 au0Var, vm0 vm0Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = tLObject;
        this.b = na7Var;
        this.e = au0Var;
        this.f = vm0Var;
        this.c = tL_error;
    }

    public b87(TLRPC.TL_error tL_error, p8c p8cVar, TLObject tLObject, na7 na7Var, p8c p8cVar2, byte b) {
        this.a = b;
        this.c = tL_error;
        this.d = p8cVar;
        this.e = tLObject;
        this.b = na7Var;
        this.f = p8cVar2;
    }

    public b87(d dVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = dVar;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
    }
}
