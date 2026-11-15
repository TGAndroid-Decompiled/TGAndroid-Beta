package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wj implements Runnable {
    public final int f27353a;
    public final Object f27354b;
    public final Object f27355c;
    public final Object d;
    public final Object f27356e;
    public final Object f27357f;
    public final Object h;

    public wj(File file, File file2, boolean[] zArr, z10 z10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.f27353a = 4;
        this.f27357f = file;
        this.f27354b = file2;
        this.f27355c = zArr;
        this.d = z10Var;
        this.f27356e = t1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wj.run():void");
    }

    public wj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f27353a = i7;
        this.f27354b = obj;
        this.f27355c = obj2;
        this.d = obj3;
        this.f27356e = obj4;
        this.f27357f = obj5;
        this.h = obj6;
    }

    public wj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27353a = i7;
        this.f27354b = obj;
        this.h = str;
        this.f27355c = str2;
        this.d = obj2;
        this.f27356e = obj3;
        this.f27357f = obj4;
    }

    public wj(ez ezVar, TLObject tLObject, TLRPC.InputMedia inputMedia, qy qyVar, String str, gj gjVar) {
        this.f27353a = 11;
        this.f27354b = ezVar;
        this.f27355c = tLObject;
        this.d = inputMedia;
        this.f27356e = qyVar;
        this.h = str;
        this.f27357f = gjVar;
    }

    public wj(ez ezVar, TLRPC.TL_photo tL_photo, gj gjVar, File file, qy qyVar, String str) {
        this.f27353a = 10;
        this.f27354b = ezVar;
        this.f27355c = tL_photo;
        this.d = gjVar;
        this.f27357f = file;
        this.f27356e = qyVar;
        this.h = str;
    }
}
