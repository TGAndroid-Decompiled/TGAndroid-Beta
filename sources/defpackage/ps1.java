package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class ps1 implements Runnable {
    public final byte a;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public ps1(lna lnaVar, boolean z, int i, wb2 wb2Var) {
        this.a = (byte) 9;
        this.d = lnaVar;
        this.c = z;
        this.b = i;
        this.e = wb2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps1.run():void");
    }

    public ps1(ls6 ls6Var, int i, boolean z, pcc pccVar) {
        this.a = (byte) 7;
        this.d = ls6Var;
        this.b = i;
        this.c = z;
        this.e = pccVar;
    }

    public ps1(qs1 qs1Var, boolean z, ArrayList arrayList, int i) {
        this.a = (byte) 0;
        this.d = qs1Var;
        this.c = z;
        this.e = arrayList;
        this.b = i;
    }

    public ps1(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = z;
    }

    public ps1(Object obj, Object obj2, int i, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = z;
    }

    public ps1(Object obj, TLObject tLObject, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.c = z;
        this.b = i;
    }
}
