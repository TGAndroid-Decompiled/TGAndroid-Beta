package bi;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class r8 implements Utilities.Callback {
    public final int f3659a;
    public final t8 f3660b;

    public r8(t8 t8Var, int i10) {
        this.f3659a = i10;
        this.f3660b = t8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3659a) {
            case 0:
                t8 t8Var = this.f3660b;
                di.o8 o8Var = t8Var.f3740c;
                o8Var.f7747c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(o8Var.f7747c0);
                t8Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                t8 t8Var2 = this.f3660b;
                t8Var2.F = videoEditedInfo;
                t8Var2.E.videoEditedInfo = videoEditedInfo;
                t8Var2.f3748y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(t8Var2.E, false, false, false);
                    return;
                } else if (new File(t8Var2.E.videoEditedInfo.originalPath).renameTo(new File(t8Var2.f3741e))) {
                    FileLoader.getInstance(t8Var2.M.f3805a).uploadFile(t8Var2.f3741e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
