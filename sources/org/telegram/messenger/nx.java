package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nx implements RequestDelegate {
    public final int f24236a;
    public final gz f24237b;
    public final TLRPC.InputMedia f24238c;
    public final sy d;

    public nx(gz gzVar, TLRPC.InputMedia inputMedia, sy syVar, int i7) {
        this.f24236a = i7;
        this.f24237b = gzVar;
        this.f24238c = inputMedia;
        this.d = syVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24236a) {
            case 0:
                final gz gzVar = this.f24237b;
                final TLRPC.InputMedia inputMedia = this.f24238c;
                final sy syVar = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wx.run():void");
                    }
                });
                return;
            default:
                final gz gzVar2 = this.f24237b;
                final TLRPC.InputMedia inputMedia2 = this.f24238c;
                final sy syVar2 = this.d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wx.run():void");
                    }
                });
                return;
        }
    }
}
