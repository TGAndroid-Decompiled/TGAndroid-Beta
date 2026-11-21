package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tj implements Runnable {
    public final int f27030a;
    public final Object f27031b;
    public final Object f27032c;
    public final Object d;
    public final Object f27033e;
    public final Object f27034f;
    public final Object h;

    public tj(File file, File file2, boolean[] zArr, x10 x10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.f27030a = 4;
        this.f27034f = file;
        this.f27031b = file2;
        this.f27032c = zArr;
        this.d = x10Var;
        this.f27033e = t1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tj.run():void");
    }

    public tj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f27030a = i7;
        this.f27031b = obj;
        this.f27032c = obj2;
        this.d = obj3;
        this.f27033e = obj4;
        this.f27034f = obj5;
        this.h = obj6;
    }

    public tj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27030a = i7;
        this.f27031b = obj;
        this.h = str;
        this.f27032c = str2;
        this.d = obj2;
        this.f27033e = obj3;
        this.f27034f = obj4;
    }

    public tj(zy zyVar, TLObject tLObject, TLRPC.InputMedia inputMedia, ly lyVar, String str, fj fjVar) {
        this.f27030a = 11;
        this.f27031b = zyVar;
        this.f27032c = tLObject;
        this.d = inputMedia;
        this.f27033e = lyVar;
        this.h = str;
        this.f27034f = fjVar;
    }

    public tj(zy zyVar, TLRPC.TL_photo tL_photo, fj fjVar, File file, ly lyVar, String str) {
        this.f27030a = 10;
        this.f27031b = zyVar;
        this.f27032c = tL_photo;
        this.d = fjVar;
        this.f27034f = file;
        this.f27033e = lyVar;
        this.h = str;
    }
}
