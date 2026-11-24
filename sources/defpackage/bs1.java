package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class bs1 implements Runnable {
    public final byte a;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public bs1(rja rjaVar, boolean z, int i, gb2 gb2Var) {
        this.a = (byte) 9;
        this.d = rjaVar;
        this.c = z;
        this.b = i;
        this.e = gb2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs1.run():void");
    }

    public bs1(hq6 hq6Var, int i, boolean z, p8c p8cVar) {
        this.a = (byte) 7;
        this.d = hq6Var;
        this.b = i;
        this.c = z;
        this.e = p8cVar;
    }

    public bs1(cs1 cs1Var, boolean z, ArrayList arrayList, int i) {
        this.a = (byte) 0;
        this.d = cs1Var;
        this.c = z;
        this.e = arrayList;
        this.b = i;
    }

    public bs1(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = z;
    }

    public bs1(Object obj, Object obj2, int i, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = z;
    }

    public bs1(Object obj, TLObject tLObject, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.c = z;
        this.b = i;
    }
}
