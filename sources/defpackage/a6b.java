package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class a6b implements pcc {
    public final byte a;
    public final b6b b;

    public a6b(b6b b6bVar, byte b) {
        this.a = b;
        this.b = b6bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        b6b b6bVar = this.b;
        switch (b) {
            case 0:
                c8b c8bVar = b6bVar.c;
                c8bVar.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = c8bVar.c0;
                int i = uc7.s5;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                b6bVar.c(tL_inputFileStoryDocument);
                return;
            default:
                oec oecVar = (oec) obj;
                b6bVar.G = oecVar;
                b6bVar.F.r0 = oecVar;
                b6bVar.E = oecVar.r / 1000;
                if (oecVar.b()) {
                    MediaController.z().j0(b6bVar.F, false, false, false);
                    return;
                } else if (new File(b6bVar.F.r0.o).renameTo(new File(b6bVar.e))) {
                    xb4.G(b6bVar.N.a).h0(false, 33554432, b6bVar.e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
