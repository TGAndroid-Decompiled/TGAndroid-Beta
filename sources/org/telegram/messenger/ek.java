package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek implements Runnable {
    public final int f15405a;
    public final Object f15406b;
    public final Object f15407c;
    public final Object d;
    public final Object e;
    public final Object f15408f;
    public final Object h;

    public ek(File file, File file2, boolean[] zArr, q20 q20Var, org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr2) {
        this.f15405a = 4;
        this.f15408f = file;
        this.f15406b = file2;
        this.f15407c = zArr;
        this.d = q20Var;
        this.e = x1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ek.run():void");
    }

    public ek(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15405a = i10;
        this.f15406b = obj;
        this.f15407c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15408f = obj5;
        this.h = obj6;
    }

    public ek(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15405a = i10;
        this.f15406b = obj;
        this.h = str;
        this.f15407c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f15408f = obj4;
    }

    public ek(qz qzVar, TLObject tLObject, TLRPC.InputMedia inputMedia, cz czVar, String str, jj jjVar) {
        this.f15405a = 11;
        this.f15406b = qzVar;
        this.f15407c = tLObject;
        this.d = inputMedia;
        this.e = czVar;
        this.h = str;
        this.f15408f = jjVar;
    }

    public ek(qz qzVar, TLRPC.TL_photo tL_photo, jj jjVar, File file, cz czVar, String str) {
        this.f15405a = 10;
        this.f15406b = qzVar;
        this.f15407c = tL_photo;
        this.d = jjVar;
        this.f15408f = file;
        this.e = czVar;
        this.h = str;
    }
}
