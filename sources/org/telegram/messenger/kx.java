package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kx implements RequestDelegate {
    public final int f24771a;
    public final ez f24772b;
    public final TLRPC.InputMedia f24773c;
    public final qy d;

    public kx(ez ezVar, TLRPC.InputMedia inputMedia, qy qyVar, int i7) {
        this.f24771a = i7;
        this.f24772b = ezVar;
        this.f24773c = inputMedia;
        this.d = qyVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24771a) {
            case 0:
                final ez ezVar = this.f24772b;
                final TLRPC.InputMedia inputMedia = this.f24773c;
                final qy qyVar = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tx.run():void");
                    }
                });
                return;
            default:
                final ez ezVar2 = this.f24772b;
                final TLRPC.InputMedia inputMedia2 = this.f24773c;
                final qy qyVar2 = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tx.run():void");
                    }
                });
                return;
        }
    }
}
