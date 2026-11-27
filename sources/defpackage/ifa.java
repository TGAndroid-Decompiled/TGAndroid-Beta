package defpackage;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ifa implements Runnable {
    public final byte a;
    public final eja b;
    public final TLRPC.TL_error c;
    public final int d;
    public final int e;
    public final TLObject f;

    public ifa(eja ejaVar, TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject, byte b) {
        this.a = b;
        this.b = ejaVar;
        this.c = tL_error;
        this.d = i;
        this.e = i2;
        this.f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                eja ejaVar = this.b;
                jn7.f(ejaVar.y1.getCurrentAccount()).d(new ifa(ejaVar, this.c, this.d, this.e, this.f, (byte) 1));
                return;
            default:
                eja ejaVar2 = this.b;
                tia[] tiaVarArr = ejaVar2.w1;
                if (this.c == null) {
                    int i = this.e;
                    tia tiaVar = tiaVarArr[i];
                    if (this.d == tiaVar.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        tiaVar.e.clear();
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
                                obj.a = ob6.e0(i4, true);
                                tiaVarArr[i].e.add(obj);
                            }
                        }
                        Collections.sort(tiaVarArr[i].e, new qq7((byte) 28));
                        tia tiaVar2 = tiaVarArr[i];
                        tiaVar2.f[0] = tL_messages_searchResultsPositions.count;
                        tiaVar2.h = true;
                        if (!tiaVar2.e.isEmpty()) {
                            while (true) {
                                zha[] zhaVarArr = ejaVar2.n0;
                                if (i2 < zhaVarArr.length) {
                                    zha zhaVar = zhaVarArr[i2];
                                    if (zhaVar.F == i) {
                                        zhaVar.b = true;
                                        ejaVar2.D1(zhaVar, true);
                                    }
                                    i2++;
                                }
                            }
                        }
                        ejaVar2.K.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
