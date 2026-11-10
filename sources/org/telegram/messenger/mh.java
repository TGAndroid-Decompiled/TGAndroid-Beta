package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh implements Runnable {
    public final int f24021a = 2;
    public final boolean f24022b;
    public final boolean f24023c;
    public final Object d;
    public final Object f24024e;
    public final Object f24025f;
    public final Object h;
    public final Object f24026n;

    public mh(cf cfVar, boolean z9, TLRPC.PhotoSize photoSize, ij ijVar, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
        this.d = cfVar;
        this.f24022b = z9;
        this.f24024e = photoSize;
        this.f24025f = ijVar;
        this.h = photo;
        this.f24023c = z10;
        this.f24026n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mh.run():void");
    }

    public mh(ui uiVar, Integer num, ArrayList arrayList, boolean z9, boolean z10, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = uiVar;
        this.f24024e = num;
        this.f24025f = arrayList;
        this.f24022b = z9;
        this.f24023c = z10;
        this.h = arrayListArr;
        this.f24026n = runnable;
    }

    public mh(qp qpVar, bp bpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, boolean z9, boolean z10) {
        this.d = qpVar;
        this.f24024e = bpVar;
        this.f24025f = tL_error;
        this.h = f2Var;
        this.f24026n = tLObject;
        this.f24022b = z9;
        this.f24023c = z10;
    }
}
