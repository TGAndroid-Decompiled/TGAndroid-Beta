package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class im implements Runnable {
    public final int f24414a;
    public final c1 f24415b;
    public final long f24416c;
    public final Object d;
    public final Object f24417e;
    public final Object f24418f;

    public im(c1 c1Var, Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f24414a = i7;
        this.f24415b = c1Var;
        this.d = obj;
        this.f24416c = j3;
        this.f24417e = obj2;
        this.f24418f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        c10 c10Var = (c10) this.f24415b;
        x00 x00Var = (x00) this.d;
        TLObject tLObject = (TLObject) this.f24417e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f24418f;
        long j3 = this.f24416c;
        synchronized (c10Var) {
            arrayList = x00Var.f27448b;
            arrayList2 = x00Var.f27449c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i7 = 0; i7 < min; i7++) {
                ((u10) arrayList2.get(i7)).a((Integer) arrayList.get(i7), arrayList3.get(i7), x00Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            c10Var.K(j3, false);
            ns.e().k(ns.P4, 1, hd.M0(2131743946, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                ns.e().k(ns.P4, 1, hd.M0(2131743947, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((u10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, x00Var.d);
            }
        }
        synchronized (c10Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    c10Var.f22795x.remove(arrayList.get(i11));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.im.run():void");
    }

    public im(c1 c1Var, Object obj, Object obj2, TLObject tLObject, long j3, int i7) {
        this.f24414a = i7;
        this.f24415b = c1Var;
        this.d = obj;
        this.f24417e = obj2;
        this.f24418f = tLObject;
        this.f24416c = j3;
    }
}
