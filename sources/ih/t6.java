package ih;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Utilities.Callback {
    public final int f12167a;
    public final u6 f12168b;

    public t6(u6 u6Var, int i9) {
        this.f12167a = i9;
        this.f12168b = u6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12167a) {
            case 0:
                u6 u6Var = this.f12168b;
                kh.a8 a8Var = u6Var.f12193c;
                a8Var.f14908c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(a8Var.f14908c0);
                u6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                u6 u6Var2 = this.f12168b;
                u6Var2.B = videoEditedInfo;
                u6Var2.A.videoEditedInfo = videoEditedInfo;
                u6Var2.f12201y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(u6Var2.A, false, false, false);
                    return;
                } else if (new File(u6Var2.A.videoEditedInfo.originalPath).renameTo(new File(u6Var2.f12194e))) {
                    FileLoader.getInstance(u6Var2.I.f12236a).uploadFile(u6Var2.f12194e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
