package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mx implements RequestDelegate {
    public final int f24099a;
    public final gz f24100b;
    public final TLRPC.InputMedia f24101c;
    public final sy d;

    public mx(gz gzVar, TLRPC.InputMedia inputMedia, sy syVar, int i7) {
        this.f24099a = i7;
        this.f24100b = gzVar;
        this.f24101c = inputMedia;
        this.d = syVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24099a) {
            case 0:
                final gz gzVar = this.f24100b;
                final TLRPC.InputMedia inputMedia = this.f24101c;
                final sy syVar = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vx.run():void");
                    }
                });
                return;
            default:
                final gz gzVar2 = this.f24100b;
                final TLRPC.InputMedia inputMedia2 = this.f24101c;
                final sy syVar2 = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vx.run():void");
                    }
                });
                return;
        }
    }
}
