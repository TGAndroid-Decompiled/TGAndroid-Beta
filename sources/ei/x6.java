package ei;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class x6 implements u10 {
    public final int f11208a;
    public final y6 f11209b;

    public x6(y6 y6Var, int i3) {
        this.f11208a = i3;
        this.f11209b = y6Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f11208a;
        y6 y6Var = this.f11209b;
        switch (i3) {
            case 0:
                gi.f7 f7Var = y6Var.f11236c;
                f7Var.f12709c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = f7Var.f12709c0;
                int i10 = hp.C8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f27013id = document.f27007id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                y6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                b20 b20Var = (b20) obj;
                y6Var.G = b20Var;
                y6Var.F.f26886p0 = b20Var;
                y6Var.E = b20Var.f21725r / 1000;
                if (b20Var.c()) {
                    MediaController.B().h0(y6Var.F, false, false, false);
                    return;
                } else if (new File(y6Var.F.f26886p0.f21722o).renameTo(new File(y6Var.f11237e))) {
                    org.telegram.messenger.w7.G(y6Var.N.f11274a).i0(false, 33554432, y6Var.f11237e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
