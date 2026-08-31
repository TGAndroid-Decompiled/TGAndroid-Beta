package oh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class r6 implements Utilities.Callback {
    public final int f17691a;
    public final s6 f17692b;

    public r6(s6 s6Var, int i10) {
        this.f17691a = i10;
        this.f17692b = s6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17691a) {
            case 0:
                s6 s6Var = this.f17692b;
                qh.s6 s6Var2 = s6Var.f17737c;
                s6Var2.f46048c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(s6Var2.f46048c0);
                s6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                s6 s6Var3 = this.f17692b;
                s6Var3.C = videoEditedInfo;
                s6Var3.B.videoEditedInfo = videoEditedInfo;
                s6Var3.f17745y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(s6Var3.B, false, false, false);
                    return;
                } else if (new File(s6Var3.B.videoEditedInfo.originalPath).renameTo(new File(s6Var3.f17738e))) {
                    FileLoader.getInstance(s6Var3.J.f17770a).uploadFile(s6Var3.f17738e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
