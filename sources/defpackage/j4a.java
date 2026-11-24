package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j4a implements RequestDelegate {
    public final byte a;
    public final a6a b;
    public final TLRPC.InputMedia c;
    public final m5a d;

    public j4a(a6a a6aVar, TLRPC.InputMedia inputMedia, m5a m5aVar, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = inputMedia;
        this.d = m5aVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final a6a a6aVar = this.b;
                final TLRPC.InputMedia inputMedia = this.c;
                final m5a m5aVar = this.d;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.run():void");
                    }
                });
                return;
            default:
                final a6a a6aVar2 = this.b;
                final TLRPC.InputMedia inputMedia2 = this.c;
                final m5a m5aVar2 = this.d;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.run():void");
                    }
                });
                return;
        }
    }
}
