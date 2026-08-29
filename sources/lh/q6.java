package lh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Utilities.Callback {
    public final int f16130a;
    public final r6 f16131b;

    public q6(r6 r6Var, int i10) {
        this.f16130a = i10;
        this.f16131b = r6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16130a) {
            case 0:
                r6 r6Var = this.f16131b;
                nh.o7 o7Var = r6Var.f16169c;
                o7Var.f18261c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(o7Var.f18261c0);
                r6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                r6 r6Var2 = this.f16131b;
                r6Var2.B = videoEditedInfo;
                r6Var2.A.videoEditedInfo = videoEditedInfo;
                r6Var2.f16177y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(r6Var2.A, false, false, false);
                    return;
                } else if (new File(r6Var2.A.videoEditedInfo.originalPath).renameTo(new File(r6Var2.f16170e))) {
                    FileLoader.getInstance(r6Var2.I.f16218a).uploadFile(r6Var2.f16170e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
