package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx implements RequestDelegate {
    public final int f19303a;
    public final qz f19304b;
    public final TLRPC.InputMedia f19305c;
    public final cz d;

    public xx(qz qzVar, TLRPC.InputMedia inputMedia, cz czVar, int i10) {
        this.f19303a = i10;
        this.f19304b = qzVar;
        this.f19305c = inputMedia;
        this.d = czVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19303a) {
            case 0:
                final qz qzVar = this.f19304b;
                final TLRPC.InputMedia inputMedia = this.f19305c;
                final cz czVar = this.d;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hy.run():void");
                    }
                });
                return;
            default:
                final qz qzVar2 = this.f19304b;
                final TLRPC.InputMedia inputMedia2 = this.f19305c;
                final cz czVar2 = this.d;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hy.run():void");
                    }
                });
                return;
        }
    }
}
