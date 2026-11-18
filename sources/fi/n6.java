package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.e20;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class n6 implements x10 {
    public final int f12303a;
    public final o6 f12304b;

    public n6(o6 o6Var, int i7) {
        this.f12303a = i7;
        this.f12304b = o6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f12303a;
        o6 o6Var = this.f12304b;
        switch (i7) {
            case 0:
                hi.d7 d7Var = o6Var.f12330c;
                d7Var.f14392c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = d7Var.f14392c0;
                int i10 = mp.I8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28415id = document.f28409id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                o6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                e20 e20Var = (e20) obj;
                o6Var.G = e20Var;
                o6Var.F.f23993r0 = e20Var;
                o6Var.E = e20Var.f23651r / 1000;
                if (e20Var.c()) {
                    MediaController.B().h0(o6Var.F, false, false, false);
                    return;
                } else if (new File(o6Var.F.f23993r0.f23648o).renameTo(new File(o6Var.f12331e))) {
                    org.telegram.messenger.w7.G(o6Var.N.f12382a).h0(false, 33554432, o6Var.f12331e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
