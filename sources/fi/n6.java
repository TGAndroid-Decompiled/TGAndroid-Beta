package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f20;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class n6 implements y10 {
    public final int f12298a;
    public final o6 f12299b;

    public n6(o6 o6Var, int i7) {
        this.f12298a = i7;
        this.f12299b = o6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f12298a;
        o6 o6Var = this.f12299b;
        switch (i7) {
            case 0:
                hi.d7 d7Var = o6Var.f12325c;
                d7Var.f14369c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = d7Var.f14369c0;
                int i10 = np.I8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28410id = document.f28404id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                o6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                f20 f20Var = (f20) obj;
                o6Var.G = f20Var;
                o6Var.F.f24205r0 = f20Var;
                o6Var.E = f20Var.f23807r / 1000;
                if (f20Var.c()) {
                    MediaController.B().h0(o6Var.F, false, false, false);
                    return;
                } else if (new File(o6Var.F.f24205r0.f23804o).renameTo(new File(o6Var.f12326e))) {
                    org.telegram.messenger.w7.G(o6Var.N.f12377a).h0(false, 33554432, o6Var.f12326e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
