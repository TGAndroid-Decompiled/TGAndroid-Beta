package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g20;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class q6 implements z10 {
    public final int f12230a;
    public final r6 f12231b;

    public q6(r6 r6Var, int i7) {
        this.f12230a = i7;
        this.f12231b = r6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f12230a;
        r6 r6Var = this.f12231b;
        switch (i7) {
            case 0:
                hi.d7 d7Var = r6Var.f12274c;
                d7Var.f14130c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = d7Var.f14130c0;
                int i10 = np.D8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28063id = document.f28057id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                r6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                g20 g20Var = (g20) obj;
                r6Var.G = g20Var;
                r6Var.F.f23845r0 = g20Var;
                r6Var.E = g20Var.f23649r / 1000;
                if (g20Var.c()) {
                    MediaController.B().h0(r6Var.F, false, false, false);
                    return;
                } else if (new File(r6Var.F.f23845r0.f23646o).renameTo(new File(r6Var.f12275e))) {
                    org.telegram.messenger.w7.G(r6Var.N.f12319a).h0(false, 33554432, r6Var.f12275e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
