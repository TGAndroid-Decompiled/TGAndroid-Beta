package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tj implements Runnable {
    public final int f27004a;
    public final Object f27005b;
    public final Object f27006c;
    public final Object d;
    public final Object f27007e;
    public final Object f27008f;
    public final Object h;

    public tj(File file, File file2, boolean[] zArr, x10 x10Var, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr2) {
        this.f27004a = 4;
        this.f27008f = file;
        this.f27005b = file2;
        this.f27006c = zArr;
        this.d = x10Var;
        this.f27007e = u1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tj.run():void");
    }

    public tj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f27004a = i7;
        this.f27005b = obj;
        this.f27006c = obj2;
        this.d = obj3;
        this.f27007e = obj4;
        this.f27008f = obj5;
        this.h = obj6;
    }

    public tj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27004a = i7;
        this.f27005b = obj;
        this.h = str;
        this.f27006c = str2;
        this.d = obj2;
        this.f27007e = obj3;
        this.f27008f = obj4;
    }

    public tj(zy zyVar, TLObject tLObject, TLRPC.InputMedia inputMedia, ly lyVar, String str, fj fjVar) {
        this.f27004a = 11;
        this.f27005b = zyVar;
        this.f27006c = tLObject;
        this.d = inputMedia;
        this.f27007e = lyVar;
        this.h = str;
        this.f27008f = fjVar;
    }

    public tj(zy zyVar, TLRPC.TL_photo tL_photo, fj fjVar, File file, ly lyVar, String str) {
        this.f27004a = 10;
        this.f27005b = zyVar;
        this.f27006c = tL_photo;
        this.d = fjVar;
        this.f27008f = file;
        this.f27007e = lyVar;
        this.h = str;
    }
}
