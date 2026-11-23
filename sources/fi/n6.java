package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f20;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class n6 implements y10 {
    public final int f12348a;
    public final o6 f12349b;

    public n6(o6 o6Var, int i7) {
        this.f12348a = i7;
        this.f12349b = o6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f12348a;
        o6 o6Var = this.f12349b;
        switch (i7) {
            case 0:
                hi.c7 c7Var = o6Var.f12375c;
                c7Var.f14345c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = c7Var.f14345c0;
                int i10 = np.I8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28446id = document.f28440id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                o6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                f20 f20Var = (f20) obj;
                o6Var.G = f20Var;
                o6Var.F.f24241r0 = f20Var;
                o6Var.E = f20Var.f23843r / 1000;
                if (f20Var.c()) {
                    MediaController.B().h0(o6Var.F, false, false, false);
                    return;
                } else if (new File(o6Var.F.f24241r0.f23840o).renameTo(new File(o6Var.f12376e))) {
                    org.telegram.messenger.w7.G(o6Var.N.f12425a).h0(false, 33554432, o6Var.f12376e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
