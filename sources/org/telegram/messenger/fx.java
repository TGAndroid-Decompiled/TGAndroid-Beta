package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fx implements RequestDelegate {
    public final int f22563a;
    public final yy f22564b;
    public final TLRPC.InputMedia f22565c;
    public final ky d;

    public fx(yy yyVar, TLRPC.InputMedia inputMedia, ky kyVar, int i3) {
        this.f22563a = i3;
        this.f22564b = yyVar;
        this.f22565c = inputMedia;
        this.d = kyVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22563a) {
            case 0:
                final yy yyVar = this.f22564b;
                final TLRPC.InputMedia inputMedia = this.f22565c;
                final ky kyVar = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ox.run():void");
                    }
                });
                return;
            default:
                final yy yyVar2 = this.f22564b;
                final TLRPC.InputMedia inputMedia2 = this.f22565c;
                final ky kyVar2 = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ox.run():void");
                    }
                });
                return;
        }
    }
}
