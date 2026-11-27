package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e6a implements RequestDelegate {
    public final byte a;
    public final r7a b;
    public final TLRPC.InputMedia c;
    public final d7a d;

    public e6a(r7a r7aVar, TLRPC.InputMedia inputMedia, d7a d7aVar, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = inputMedia;
        this.d = d7aVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final r7a r7aVar = this.b;
                final TLRPC.InputMedia inputMedia = this.c;
                final d7a d7aVar = this.d;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6a.run():void");
                    }
                });
                return;
            default:
                final r7a r7aVar2 = this.b;
                final TLRPC.InputMedia inputMedia2 = this.c;
                final d7a d7aVar2 = this.d;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6a.run():void");
                    }
                });
                return;
        }
    }
}
