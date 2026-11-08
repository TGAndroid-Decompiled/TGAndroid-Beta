package di;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.c20;
import org.telegram.messenger.j20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class w6 implements c20 {
    public final int f9908a;
    public final x6 f9909b;

    public w6(x6 x6Var, int i7) {
        this.f9908a = i7;
        this.f9909b = x6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f9908a;
        x6 x6Var = this.f9909b;
        switch (i7) {
            case 0:
                fi.e7 e7Var = x6Var.f9930c;
                e7Var.f11883c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = e7Var.f11883c0;
                int i10 = qp.C8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f26968id = document.f26962id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                x6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                j20 j20Var = (j20) obj;
                x6Var.F = j20Var;
                x6Var.E.f23280p0 = j20Var;
                x6Var.D = j20Var.f23488r / 1000;
                if (j20Var.c()) {
                    MediaController.B().h0(x6Var.E, false, false, false);
                    return;
                } else if (new File(x6Var.E.f23280p0.f23485o).renameTo(new File(x6Var.f9931e))) {
                    org.telegram.messenger.w7.G(x6Var.M.f9963a).h0(false, 33554432, x6Var.f9931e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
