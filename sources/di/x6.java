package di;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.c20;
import org.telegram.messenger.j20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class x6 implements c20 {
    public final int f9938a;
    public final y6 f9939b;

    public x6(y6 y6Var, int i7) {
        this.f9938a = i7;
        this.f9939b = y6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f9938a;
        y6 y6Var = this.f9939b;
        switch (i7) {
            case 0:
                fi.e7 e7Var = y6Var.f9965c;
                e7Var.f11887c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = e7Var.f11887c0;
                int i10 = qp.C8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f26972id = document.f26966id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                y6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                j20 j20Var = (j20) obj;
                y6Var.F = j20Var;
                y6Var.E.f23284p0 = j20Var;
                y6Var.D = j20Var.f23492r / 1000;
                if (j20Var.c()) {
                    MediaController.B().h0(y6Var.E, false, false, false);
                    return;
                } else if (new File(y6Var.E.f23284p0.f23489o).renameTo(new File(y6Var.f9966e))) {
                    org.telegram.messenger.w7.G(y6Var.M.f9997a).h0(false, 33554432, y6Var.f9966e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
