package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class hm implements Runnable {
    public final int f24470a;
    public final c1 f24471b;
    public final long f24472c;
    public final Object d;
    public final Object f24473e;
    public final Object f24474f;

    public hm(c1 c1Var, Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f24470a = i7;
        this.f24471b = c1Var;
        this.d = obj;
        this.f24472c = j3;
        this.f24473e = obj2;
        this.f24474f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        z00 z00Var = (z00) this.f24471b;
        u00 u00Var = (u00) this.d;
        TLObject tLObject = (TLObject) this.f24473e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f24474f;
        long j3 = this.f24472c;
        synchronized (z00Var) {
            arrayList = u00Var.f27108b;
            arrayList2 = u00Var.f27109c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i7 = 0; i7 < min; i7++) {
                ((s10) arrayList2.get(i7)).a((Integer) arrayList.get(i7), arrayList3.get(i7), u00Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            z00Var.K(j3, false);
            ks.e().k(ks.S4, 1, gd.M0(2131743709, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                ks.e().k(ks.S4, 1, gd.M0(2131743710, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((s10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, u00Var.d);
            }
        }
        synchronized (z00Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    z00Var.f28246x.remove(arrayList.get(i11));
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
        this.f24470a = i7;
        this.f24471b = c1Var;
        this.d = obj;
        this.f24473e = obj2;
        this.f24474f = tLObject;
        this.f24472c = j3;
    }
}
