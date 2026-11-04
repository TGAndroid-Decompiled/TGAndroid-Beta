package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f24752a;
    public final Object f24753b;
    public final Object f24754c;
    public final Object d;
    public final Object f24755e;
    public final Object f24756f;
    public final Object h;

    public pj(File file, File file2, boolean[] zArr, u10 u10Var, org.telegram.ui.ActionBar.s1 s1Var, boolean[] zArr2) {
        this.f24752a = 4;
        this.f24756f = file;
        this.f24753b = file2;
        this.f24754c = zArr;
        this.d = u10Var;
        this.f24755e = s1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pj.run():void");
    }

    public pj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.f24752a = i3;
        this.f24753b = obj;
        this.f24754c = obj2;
        this.d = obj3;
        this.f24755e = obj4;
        this.f24756f = obj5;
        this.h = obj6;
    }

    public pj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i3) {
        this.f24752a = i3;
        this.f24753b = obj;
        this.h = str;
        this.f24754c = str2;
        this.d = obj2;
        this.f24755e = obj3;
        this.f24756f = obj4;
    }

    public pj(yy yyVar, TLObject tLObject, TLRPC.InputMedia inputMedia, ky kyVar, String str, zi ziVar) {
        this.f24752a = 11;
        this.f24753b = yyVar;
        this.f24754c = tLObject;
        this.d = inputMedia;
        this.f24755e = kyVar;
        this.h = str;
        this.f24756f = ziVar;
    }

    public pj(yy yyVar, TLRPC.TL_photo tL_photo, zi ziVar, File file, ky kyVar, String str) {
        this.f24752a = 10;
        this.f24753b = yyVar;
        this.f24754c = tL_photo;
        this.d = ziVar;
        this.f24756f = file;
        this.f24755e = kyVar;
        this.h = str;
    }
}
