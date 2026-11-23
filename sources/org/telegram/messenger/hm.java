package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class hm implements Runnable {
    public final int f24569a;
    public final c1 f24570b;
    public final long f24571c;
    public final Object d;
    public final Object f24572e;
    public final Object f24573f;

    public hm(c1 c1Var, Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f24569a = i7;
        this.f24570b = c1Var;
        this.d = obj;
        this.f24571c = j3;
        this.f24572e = obj2;
        this.f24573f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        y00 y00Var = (y00) this.f24570b;
        t00 t00Var = (t00) this.d;
        TLObject tLObject = (TLObject) this.f24572e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f24573f;
        long j3 = this.f24571c;
        synchronized (y00Var) {
            arrayList = t00Var.f27024b;
            arrayList2 = t00Var.f27025c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i7 = 0; i7 < min; i7++) {
                ((r10) arrayList2.get(i7)).a((Integer) arrayList.get(i7), arrayList3.get(i7), t00Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            y00Var.K(j3, false);
            ks.e().k(ks.S4, 1, gd.N0(2131743699, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                ks.e().k(ks.S4, 1, gd.N0(2131743700, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((r10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, t00Var.d);
            }
        }
        synchronized (y00Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    y00Var.f28189x.remove(arrayList.get(i11));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hm.run():void");
    }

    public hm(c1 c1Var, Object obj, Object obj2, TLObject tLObject, long j3, int i7) {
        this.f24569a = i7;
        this.f24570b = c1Var;
        this.d = obj;
        this.f24572e = obj2;
        this.f24573f = tLObject;
        this.f24571c = j3;
    }
}
