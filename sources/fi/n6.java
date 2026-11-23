package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class n6 implements w10 {
    public final int f12310a;
    public final o6 f12311b;

    public n6(o6 o6Var, int i7) {
        this.f12310a = i7;
        this.f12311b = o6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f12310a;
        o6 o6Var = this.f12311b;
        switch (i7) {
            case 0:
                hi.x7 x7Var = o6Var.f12337c;
                x7Var.f15740c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = x7Var.f15740c0;
                int i10 = mp.I8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28504id = document.f28498id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                o6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                d20 d20Var = (d20) obj;
                o6Var.G = d20Var;
                o6Var.F.f24101r0 = d20Var;
                o6Var.E = d20Var.f23604r / 1000;
                if (d20Var.c()) {
                    MediaController.B().h0(o6Var.F, false, false, false);
                    return;
                } else if (new File(o6Var.F.f24101r0.f23601o).renameTo(new File(o6Var.f12338e))) {
                    org.telegram.messenger.w7.G(o6Var.N.f12387a).h0(false, 33554432, o6Var.f12338e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
