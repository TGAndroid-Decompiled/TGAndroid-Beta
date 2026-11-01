package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements Runnable {
    public final int f15746a;
    public final Object f15747b;
    public final Object f15748c;
    public final Object d;
    public final Object e;
    public final Object f15749f;
    public final Object h;

    public fk(File file, File file2, boolean[] zArr, r20 r20Var, org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr2) {
        this.f15746a = 4;
        this.f15749f = file;
        this.f15747b = file2;
        this.f15748c = zArr;
        this.d = r20Var;
        this.e = x1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fk.run():void");
    }

    public fk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15746a = i10;
        this.f15747b = obj;
        this.f15748c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15749f = obj5;
        this.h = obj6;
    }

    public fk(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15746a = i10;
        this.f15747b = obj;
        this.h = str;
        this.f15748c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f15749f = obj4;
    }

    public fk(rz rzVar, TLObject tLObject, TLRPC.InputMedia inputMedia, dz dzVar, String str, kj kjVar) {
        this.f15746a = 11;
        this.f15747b = rzVar;
        this.f15748c = tLObject;
        this.d = inputMedia;
        this.e = dzVar;
        this.h = str;
        this.f15749f = kjVar;
    }

    public fk(rz rzVar, TLRPC.TL_photo tL_photo, kj kjVar, File file, dz dzVar, String str) {
        this.f15746a = 10;
        this.f15747b = rzVar;
        this.f15748c = tL_photo;
        this.d = kjVar;
        this.f15749f = file;
        this.e = dzVar;
        this.h = str;
    }
}
