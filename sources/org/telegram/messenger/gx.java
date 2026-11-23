package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gx implements RequestDelegate {
    public final int f24321a;
    public final az f24322b;
    public final TLRPC.InputMedia f24323c;
    public final my d;

    public gx(az azVar, TLRPC.InputMedia inputMedia, my myVar, int i7) {
        this.f24321a = i7;
        this.f24322b = azVar;
        this.f24323c = inputMedia;
        this.d = myVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24321a) {
            case 0:
                final az azVar = this.f24322b;
                final TLRPC.InputMedia inputMedia = this.f24323c;
                final my myVar = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.px.run():void");
                    }
                });
                return;
            default:
                final az azVar2 = this.f24322b;
                final TLRPC.InputMedia inputMedia2 = this.f24323c;
                final my myVar2 = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.px.run():void");
                    }
                });
                return;
        }
    }
}
