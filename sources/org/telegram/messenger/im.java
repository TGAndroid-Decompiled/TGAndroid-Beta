package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class im implements Runnable {
    public final int f24715a;
    public final c1 f24716b;
    public final long f24717c;
    public final Object d;
    public final Object f24718e;
    public final Object f24719f;

    public im(c1 c1Var, Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f24715a = i7;
        this.f24716b = c1Var;
        this.d = obj;
        this.f24717c = j3;
        this.f24718e = obj2;
        this.f24719f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        a10 a10Var = (a10) this.f24716b;
        v00 v00Var = (v00) this.d;
        TLObject tLObject = (TLObject) this.f24718e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f24719f;
        long j3 = this.f24717c;
        synchronized (a10Var) {
            arrayList = v00Var.f27267b;
            arrayList2 = v00Var.f27268c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i7 = 0; i7 < min; i7++) {
                ((t10) arrayList2.get(i7)).a((Integer) arrayList.get(i7), arrayList3.get(i7), v00Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            a10Var.K(j3, false);
            ls.e().k(ls.S4, 1, hd.N0(2131743703, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                ls.e().k(ls.S4, 1, hd.N0(2131743704, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((t10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, v00Var.d);
            }
        }
        synchronized (a10Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    a10Var.f22814x.remove(arrayList.get(i11));
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
        this.f24715a = i7;
        this.f24716b = c1Var;
        this.d = obj;
        this.f24718e = obj2;
        this.f24719f = tLObject;
        this.f24717c = j3;
    }
}
