package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh implements Runnable {
    public final int f24005a = 2;
    public final boolean f24006b;
    public final boolean f24007c;
    public final Object d;
    public final Object f24008e;
    public final Object f24009f;
    public final Object h;
    public final Object f24010n;

    public mh(cf cfVar, boolean z9, TLRPC.PhotoSize photoSize, ij ijVar, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
        this.d = cfVar;
        this.f24006b = z9;
        this.f24008e = photoSize;
        this.f24009f = ijVar;
        this.h = photo;
        this.f24007c = z10;
        this.f24010n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mh.run():void");
    }

    public mh(ui uiVar, Integer num, ArrayList arrayList, boolean z9, boolean z10, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = uiVar;
        this.f24008e = num;
        this.f24009f = arrayList;
        this.f24006b = z9;
        this.f24007c = z10;
        this.h = arrayListArr;
        this.f24010n = runnable;
    }

    public mh(qp qpVar, bp bpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, boolean z9, boolean z10) {
        this.d = qpVar;
        this.f24008e = bpVar;
        this.f24009f = tL_error;
        this.h = f2Var;
        this.f24010n = tLObject;
        this.f24006b = z9;
        this.f24007c = z10;
    }
}
