package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class e2b implements p8c {
    public final byte a;
    public final f2b b;

    public e2b(f2b f2bVar, byte b) {
        this.a = b;
        this.b = f2bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        f2b f2bVar = this.b;
        switch (b) {
            case 0:
                f4b f4bVar = f2bVar.c;
                f4bVar.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = f4bVar.c0;
                int i = na7.q5;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                f2bVar.c(tL_inputFileStoryDocument);
                return;
            default:
                oac oacVar = (oac) obj;
                f2bVar.G = oacVar;
                f2bVar.F.r0 = oacVar;
                f2bVar.E = oacVar.r / 1000;
                if (oacVar.b()) {
                    MediaController.w().g0(f2bVar.F, false, false, false);
                    return;
                } else if (new File(f2bVar.F.r0.o).renameTo(new File(f2bVar.e))) {
                    ba4.G(f2bVar.N.a).h0(false, 33554432, f2bVar.e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
