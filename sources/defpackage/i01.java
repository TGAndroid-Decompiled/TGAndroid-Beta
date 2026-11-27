package defpackage;

import java.util.concurrent.Executor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class i01 {
    public final int a;
    public final TLRPC.InputGroupCall b;
    public final int c;
    public final boolean d;
    public final Executor e;
    public final ye9 f;

    public i01(int i, TLRPC.InputGroupCall inputGroupCall, int i2, boolean z, Executor executor, ye9 ye9Var) {
        this.a = i;
        this.b = inputGroupCall;
        this.c = i2;
        this.d = z;
        this.e = executor;
        this.f = ye9Var;
    }

    public final wg a(qz0 qz0Var, pz0 pz0Var) {
        int i;
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        tL_inputGroupCallStream.call = this.b;
        tL_inputGroupCallStream.time_ms = qz0Var.c;
        tL_inputGroupCallStream.scale = 0;
        int i2 = qz0Var.b;
        if (i2 != 0) {
            tL_inputGroupCallStream.flags |= 1;
            tL_inputGroupCallStream.video_channel = i2;
            tL_inputGroupCallStream.video_quality = qz0Var.d;
        }
        tL_upload_getFile.location = tL_inputGroupCallStream;
        tL_upload_getFile.offset = 0L;
        if (i2 != 0) {
            i = 524288;
        } else {
            i = 131072;
        }
        tL_upload_getFile.limit = i;
        return new wg(this, ConnectionsManager.getInstance(this.a).sendRequest(tL_upload_getFile, new h01(this, pz0Var, (byte) 0), 2, 2, this.c), (byte) 2);
    }

    public final void b(dz0 dz0Var) {
        boolean z = this.d;
        int i = this.a;
        if (!z) {
            this.e.execute(new kt(dz0Var, ConnectionsManager.getInstance(i).getCurrentTimeMillis(), (byte) 4));
            return;
        }
        TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
        getgroupcallstreamchannels.call = this.b;
        ConnectionsManager.getInstance(i).sendRequest(getgroupcallstreamchannels, new o(this, dz0Var, (byte) 29), 2, 2, this.c);
    }
}
