package oh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class r6 implements Utilities.Callback {
    public final int f17693a;
    public final s6 f17694b;

    public r6(s6 s6Var, int i10) {
        this.f17693a = i10;
        this.f17694b = s6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17693a) {
            case 0:
                s6 s6Var = this.f17694b;
                qh.r6 r6Var = s6Var.f17739c;
                r6Var.f45999c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(r6Var.f45999c0);
                s6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                s6 s6Var2 = this.f17694b;
                s6Var2.C = videoEditedInfo;
                s6Var2.B.videoEditedInfo = videoEditedInfo;
                s6Var2.f17747y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(s6Var2.B, false, false, false);
                    return;
                } else if (new File(s6Var2.B.videoEditedInfo.originalPath).renameTo(new File(s6Var2.f17740e))) {
                    FileLoader.getInstance(s6Var2.J.f17772a).uploadFile(s6Var2.f17740e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
