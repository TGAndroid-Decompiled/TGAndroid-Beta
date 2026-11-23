package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f27164a;
    public final Object f27165b;
    public final Object f27166c;
    public final Object d;
    public final Object f27167e;
    public final Object f27168f;
    public final Object h;

    public uj(File file, File file2, boolean[] zArr, y10 y10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.f27164a = 4;
        this.f27168f = file;
        this.f27165b = file2;
        this.f27166c = zArr;
        this.d = y10Var;
        this.f27167e = t1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uj.run():void");
    }

    public uj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f27164a = i7;
        this.f27165b = obj;
        this.f27166c = obj2;
        this.d = obj3;
        this.f27167e = obj4;
        this.f27168f = obj5;
        this.h = obj6;
    }

    public uj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27164a = i7;
        this.f27165b = obj;
        this.h = str;
        this.f27166c = str2;
        this.d = obj2;
        this.f27167e = obj3;
        this.f27168f = obj4;
    }

    public uj(az azVar, TLObject tLObject, TLRPC.InputMedia inputMedia, my myVar, String str, gj gjVar) {
        this.f27164a = 11;
        this.f27165b = azVar;
        this.f27166c = tLObject;
        this.d = inputMedia;
        this.f27167e = myVar;
        this.h = str;
        this.f27168f = gjVar;
    }

    public uj(az azVar, TLRPC.TL_photo tL_photo, gj gjVar, File file, my myVar, String str) {
        this.f27164a = 10;
        this.f27165b = azVar;
        this.f27166c = tL_photo;
        this.d = gjVar;
        this.f27168f = file;
        this.f27167e = myVar;
        this.h = str;
    }
}
