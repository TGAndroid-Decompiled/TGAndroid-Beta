package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2a implements RequestDelegate {
    public final byte a;
    public final z3a b;
    public final TLRPC.InputMedia c;
    public final k3a d;

    public h2a(z3a z3aVar, TLRPC.InputMedia inputMedia, k3a k3aVar, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = inputMedia;
        this.d = k3aVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final z3a z3aVar = this.b;
                final TLRPC.InputMedia inputMedia = this.c;
                final k3a k3aVar = this.d;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2a.run():void");
                    }
                });
                return;
            default:
                final z3a z3aVar2 = this.b;
                final TLRPC.InputMedia inputMedia2 = this.c;
                final k3a k3aVar2 = this.d;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2a.run():void");
                    }
                });
                return;
        }
    }
}
