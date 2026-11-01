package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z60;
public final class nn implements Runnable {
    public final int f17320a = 3;
    public final int f17321b;
    public final long f17322c;
    public final long d;
    public final Object e;
    public final Object f17323f;
    public final Object h;

    public nn(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f17321b = i10;
        this.e = context;
        this.f17322c = j10;
        this.d = j11;
        this.f17323f = z2VarArr;
        this.h = p6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nn.run():void");
    }

    public nn(wp wpVar, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = wpVar;
        this.f17322c = j10;
        this.d = j11;
        this.f17323f = inputPeer;
        this.f17321b = i10;
        this.h = iArr;
    }

    public nn(is isVar, int i10, long j10, String str, long j11, String str2) {
        this.e = isVar;
        this.f17321b = i10;
        this.f17322c = j10;
        this.f17323f = str;
        this.d = j11;
        this.h = str2;
    }

    public nn(z60 z60Var, int i10, long j10, long j11, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = z60Var;
        this.f17321b = i10;
        this.f17322c = j10;
        this.d = j11;
        this.f17323f = unVar;
        this.h = p6Var;
    }

    public nn(th.j0 j0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = j0Var;
        this.f17321b = i10;
        this.f17323f = tL_error;
        this.f17322c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }
}
