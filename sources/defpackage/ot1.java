package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class ot1 implements Runnable {
    public final byte a;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public ot1(sla slaVar, boolean z, int i, rc2 rc2Var) {
        this.a = (byte) 9;
        this.d = slaVar;
        this.c = z;
        this.b = i;
        this.e = rc2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot1.run():void");
    }

    public ot1(hs6 hs6Var, int i, boolean z, qac qacVar) {
        this.a = (byte) 7;
        this.d = hs6Var;
        this.b = i;
        this.c = z;
        this.e = qacVar;
    }

    public ot1(pt1 pt1Var, boolean z, ArrayList arrayList, int i) {
        this.a = (byte) 0;
        this.d = pt1Var;
        this.c = z;
        this.e = arrayList;
        this.b = i;
    }

    public ot1(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = z;
    }

    public ot1(Object obj, Object obj2, int i, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = z;
    }

    public ot1(Object obj, TLObject tLObject, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.c = z;
        this.b = i;
    }
}
