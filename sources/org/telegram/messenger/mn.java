package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z60;
public final class mn implements Runnable {
    public final int f16978a = 3;
    public final int f16979b;
    public final long f16980c;
    public final long d;
    public final Object e;
    public final Object f16981f;
    public final Object h;

    public mn(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f16979b = i10;
        this.e = context;
        this.f16980c = j10;
        this.d = j11;
        this.f16981f = z2VarArr;
        this.h = p6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.run():void");
    }

    public mn(vp vpVar, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = vpVar;
        this.f16980c = j10;
        this.d = j11;
        this.f16981f = inputPeer;
        this.f16979b = i10;
        this.h = iArr;
    }

    public mn(hs hsVar, int i10, long j10, String str, long j11, String str2) {
        this.e = hsVar;
        this.f16979b = i10;
        this.f16980c = j10;
        this.f16981f = str;
        this.d = j11;
        this.h = str2;
    }

    public mn(z60 z60Var, int i10, long j10, long j11, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = z60Var;
        this.f16979b = i10;
        this.f16980c = j10;
        this.d = j11;
        this.f16981f = unVar;
        this.h = p6Var;
    }

    public mn(th.j0 j0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = j0Var;
        this.f16979b = i10;
        this.f16981f = tL_error;
        this.f16980c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }
}
