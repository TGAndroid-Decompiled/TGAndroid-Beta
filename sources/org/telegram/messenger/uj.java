package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f27200a;
    public final Object f27201b;
    public final Object f27202c;
    public final Object d;
    public final Object f27203e;
    public final Object f27204f;
    public final Object h;

    public uj(File file, File file2, boolean[] zArr, y10 y10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.f27200a = 4;
        this.f27204f = file;
        this.f27201b = file2;
        this.f27202c = zArr;
        this.d = y10Var;
        this.f27203e = t1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uj.run():void");
    }

    public uj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f27200a = i7;
        this.f27201b = obj;
        this.f27202c = obj2;
        this.d = obj3;
        this.f27203e = obj4;
        this.f27204f = obj5;
        this.h = obj6;
    }

    public uj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27200a = i7;
        this.f27201b = obj;
        this.h = str;
        this.f27202c = str2;
        this.d = obj2;
        this.f27203e = obj3;
        this.f27204f = obj4;
    }

    public uj(az azVar, TLObject tLObject, TLRPC.InputMedia inputMedia, my myVar, String str, gj gjVar) {
        this.f27200a = 11;
        this.f27201b = azVar;
        this.f27202c = tLObject;
        this.d = inputMedia;
        this.f27203e = myVar;
        this.h = str;
        this.f27204f = gjVar;
    }

    public uj(az azVar, TLRPC.TL_photo tL_photo, gj gjVar, File file, my myVar, String str) {
        this.f27200a = 10;
        this.f27201b = azVar;
        this.f27202c = tL_photo;
        this.d = gjVar;
        this.f27204f = file;
        this.f27203e = myVar;
        this.h = str;
    }
}
