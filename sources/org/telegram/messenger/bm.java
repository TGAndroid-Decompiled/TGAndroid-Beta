package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class bm implements Runnable {
    public final int f21852a;
    public final c1 f21853b;
    public final long f21854c;
    public final Object d;
    public final Object f21855e;
    public final Object f21856f;

    public bm(c1 c1Var, Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.f21852a = i3;
        this.f21853b = c1Var;
        this.d = obj;
        this.f21854c = j10;
        this.f21855e = obj2;
        this.f21856f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        x00 x00Var = (x00) this.f21853b;
        s00 s00Var = (s00) this.d;
        TLObject tLObject = (TLObject) this.f21855e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f21856f;
        long j10 = this.f21854c;
        synchronized (x00Var) {
            arrayList = s00Var.f25262b;
            arrayList2 = s00Var.f25263c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i3 = 0; i3 < min; i3++) {
                ((p10) arrayList2.get(i3)).a((Integer) arrayList.get(i3), arrayList3.get(i3), s00Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            x00Var.K(j10, false);
            hs.e().k(hs.P4, 1, bd.M0(2131743956, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                hs.e().k(hs.P4, 1, bd.M0(2131743957, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((p10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, s00Var.d);
            }
        }
        synchronized (x00Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    x00Var.f26331x.remove(arrayList.get(i11));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bm.run():void");
    }

    public bm(c1 c1Var, Object obj, Object obj2, TLObject tLObject, long j10, int i3) {
        this.f21852a = i3;
        this.f21853b = c1Var;
        this.d = obj;
        this.f21855e = obj2;
        this.f21856f = tLObject;
        this.f21854c = j10;
    }
}
