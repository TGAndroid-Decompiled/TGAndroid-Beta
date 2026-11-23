package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fx implements RequestDelegate {
    public final int f24181a;
    public final zy f24182b;
    public final TLRPC.InputMedia f24183c;
    public final ly d;

    public fx(zy zyVar, TLRPC.InputMedia inputMedia, ly lyVar, int i7) {
        this.f24181a = i7;
        this.f24182b = zyVar;
        this.f24183c = inputMedia;
        this.d = lyVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24181a) {
            case 0:
                final zy zyVar = this.f24182b;
                final TLRPC.InputMedia inputMedia = this.f24183c;
                final ly lyVar = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ox.run():void");
                    }
                });
                return;
            default:
                final zy zyVar2 = this.f24182b;
                final TLRPC.InputMedia inputMedia2 = this.f24183c;
                final ly lyVar2 = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ox.run():void");
                    }
                });
                return;
        }
    }
}
