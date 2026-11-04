package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f25862a;
    public final int f25863b;
    public final Object f25864c;
    public final Object d;
    public final Object f25865e;

    public vf(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f25862a = i10;
        this.f25864c = obj;
        this.f25863b = i3;
        this.d = obj2;
        this.f25865e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vf.run():void");
    }

    public vf(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.f25862a = i10;
        this.f25864c = obj;
        this.d = obj2;
        this.f25863b = i3;
        this.f25865e = obj3;
    }

    public vf(c1 c1Var, Object obj, Object obj2, int i3, int i10) {
        this.f25862a = i10;
        this.f25864c = c1Var;
        this.d = obj;
        this.f25865e = obj2;
        this.f25863b = i3;
    }

    public vf(hp hpVar, int i3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f25862a = i10;
        this.f25864c = hpVar;
        this.f25863b = i3;
        this.f25865e = tLObject;
        this.d = tL_error;
    }

    public vf(hp hpVar, TLObject tLObject, int i3, jo joVar) {
        this.f25862a = 10;
        this.f25864c = hpVar;
        this.f25865e = tLObject;
        this.f25863b = i3;
        this.d = joVar;
    }
}
