package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class lm implements Runnable {
    public final int f23911a;
    public final c1 f23912b;
    public final long f23913c;
    public final Object d;
    public final Object f23914e;
    public final Object f23915f;

    public lm(c1 c1Var, Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f23911a = i7;
        this.f23912b = c1Var;
        this.d = obj;
        this.f23913c = j3;
        this.f23914e = obj2;
        this.f23915f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        f10 f10Var = (f10) this.f23912b;
        a10 a10Var = (a10) this.d;
        TLObject tLObject = (TLObject) this.f23914e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f23915f;
        long j3 = this.f23913c;
        synchronized (f10Var) {
            arrayList = a10Var.f21368b;
            arrayList2 = a10Var.f21369c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i7 = 0; i7 < min; i7++) {
                ((x10) arrayList2.get(i7)).a((Integer) arrayList.get(i7), arrayList3.get(i7), a10Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            f10Var.K(j3, false);
            qs.e().k(qs.P4, 1, id.M0(2131743946, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                qs.e().k(qs.P4, 1, id.M0(2131743947, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((x10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, a10Var.d);
            }
        }
        synchronized (f10Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    f10Var.f22351x.remove(arrayList.get(i11));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lm.run():void");
    }

    public lm(c1 c1Var, Object obj, Object obj2, TLObject tLObject, long j3, int i7) {
        this.f23911a = i7;
        this.f23912b = c1Var;
        this.d = obj;
        this.f23914e = obj2;
        this.f23915f = tLObject;
        this.f23913c = j3;
    }
}
