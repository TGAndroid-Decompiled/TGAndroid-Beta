package defpackage;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tba implements Runnable {
    public final byte a;
    public final nfa b;
    public final TLRPC.TL_error c;
    public final int d;
    public final int e;
    public final TLObject f;

    public tba(nfa nfaVar, TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject, byte b) {
        this.a = b;
        this.b = nfaVar;
        this.c = tL_error;
        this.d = i;
        this.e = i2;
        this.f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                nfa nfaVar = this.b;
                kk7.f(nfaVar.y1.getCurrentAccount()).d(new tba(nfaVar, this.c, this.d, this.e, this.f, (byte) 1));
                return;
            default:
                nfa nfaVar2 = this.b;
                cfa[] cfaVarArr = nfaVar2.w1;
                if (this.c == null) {
                    int i = this.e;
                    cfa cfaVar = cfaVarArr[i];
                    if (this.d == cfaVar.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        cfaVar.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i3);
                            int i4 = tL_searchResultPosition.date;
                            if (i4 != 0) {
                                ?? obj = new Object();
                                obj.c = i4;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.b = tL_searchResultPosition.offset;
                                obj.a = k96.e0(i4, true);
                                cfaVarArr[i].e.add(obj);
                            }
                        }
                        Collections.sort(cfaVarArr[i].e, new fx7((byte) 25));
                        cfa cfaVar2 = cfaVarArr[i];
                        cfaVar2.f[0] = tL_messages_searchResultsPositions.count;
                        cfaVar2.h = true;
                        if (!cfaVar2.e.isEmpty()) {
                            while (true) {
                                iea[] ieaVarArr = nfaVar2.n0;
                                if (i2 < ieaVarArr.length) {
                                    iea ieaVar = ieaVarArr[i2];
                                    if (ieaVar.F == i) {
                                        ieaVar.b = true;
                                        nfaVar2.D1(ieaVar, true);
                                    }
                                    i2++;
                                }
                            }
                        }
                        nfaVar2.K.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
