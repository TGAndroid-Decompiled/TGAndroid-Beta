package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tj implements Runnable {
    public final int f27099a;
    public final Object f27100b;
    public final Object f27101c;
    public final Object d;
    public final Object f27102e;
    public final Object f27103f;
    public final Object h;

    public tj(File file, File file2, boolean[] zArr, w10 w10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.f27099a = 4;
        this.f27103f = file;
        this.f27100b = file2;
        this.f27101c = zArr;
        this.d = w10Var;
        this.f27102e = t1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tj.run():void");
    }

    public tj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f27099a = i7;
        this.f27100b = obj;
        this.f27101c = obj2;
        this.d = obj3;
        this.f27102e = obj4;
        this.f27103f = obj5;
        this.h = obj6;
    }

    public tj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27099a = i7;
        this.f27100b = obj;
        this.h = str;
        this.f27101c = str2;
        this.d = obj2;
        this.f27102e = obj3;
        this.f27103f = obj4;
    }

    public tj(zy zyVar, TLObject tLObject, TLRPC.InputMedia inputMedia, ly lyVar, String str, fj fjVar) {
        this.f27099a = 11;
        this.f27100b = zyVar;
        this.f27101c = tLObject;
        this.d = inputMedia;
        this.f27102e = lyVar;
        this.h = str;
        this.f27103f = fjVar;
    }

    public tj(zy zyVar, TLRPC.TL_photo tL_photo, fj fjVar, File file, ly lyVar, String str) {
        this.f27099a = 10;
        this.f27100b = zyVar;
        this.f27101c = tL_photo;
        this.d = fjVar;
        this.f27103f = file;
        this.f27102e = lyVar;
        this.h = str;
    }
}
