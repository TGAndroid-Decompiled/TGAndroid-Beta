package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wj implements Runnable {
    public final int f27354a;
    public final Object f27355b;
    public final Object f27356c;
    public final Object d;
    public final Object f27357e;
    public final Object f27358f;
    public final Object h;

    public wj(File file, File file2, boolean[] zArr, z10 z10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.f27354a = 4;
        this.f27358f = file;
        this.f27355b = file2;
        this.f27356c = zArr;
        this.d = z10Var;
        this.f27357e = t1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wj.run():void");
    }

    public wj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f27354a = i7;
        this.f27355b = obj;
        this.f27356c = obj2;
        this.d = obj3;
        this.f27357e = obj4;
        this.f27358f = obj5;
        this.h = obj6;
    }

    public wj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27354a = i7;
        this.f27355b = obj;
        this.h = str;
        this.f27356c = str2;
        this.d = obj2;
        this.f27357e = obj3;
        this.f27358f = obj4;
    }

    public wj(ez ezVar, TLObject tLObject, TLRPC.InputMedia inputMedia, qy qyVar, String str, gj gjVar) {
        this.f27354a = 11;
        this.f27355b = ezVar;
        this.f27356c = tLObject;
        this.d = inputMedia;
        this.f27357e = qyVar;
        this.h = str;
        this.f27358f = gjVar;
    }

    public wj(ez ezVar, TLRPC.TL_photo tL_photo, gj gjVar, File file, qy qyVar, String str) {
        this.f27354a = 10;
        this.f27355b = ezVar;
        this.f27356c = tL_photo;
        this.d = gjVar;
        this.f27358f = file;
        this.f27357e = qyVar;
        this.h = str;
    }
}
