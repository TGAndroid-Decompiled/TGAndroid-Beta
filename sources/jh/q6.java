package jh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class q6 implements Utilities.Callback {

    public final int f13861a;

    public final r6 f13862b;

    public q6(r6 r6Var, int i10) {
        this.f13861a = i10;
        this.f13862b = r6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13861a) {
            case 0:
                r6 r6Var = this.f13862b;
                lh.z7 z7Var = r6Var.f13907c;
                z7Var.f17200c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(z7Var.f17200c0);
                r6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                r6 r6Var2 = this.f13862b;
                r6Var2.B = videoEditedInfo;
                r6Var2.A.videoEditedInfo = videoEditedInfo;
                r6Var2.f13915y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(r6Var2.A, false, false, false);
                } else if (new File(r6Var2.A.videoEditedInfo.originalPath).renameTo(new File(r6Var2.f13908e))) {
                    FileLoader.getInstance(r6Var2.I.f13955a).uploadFile(r6Var2.f13908e, false, false, 33554432);
                }
                break;
        }
    }
}
