package nh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class r6 implements Utilities.Callback {
    public final int f15823a;
    public final s6 f15824b;

    public r6(s6 s6Var, int i10) {
        this.f15823a = i10;
        this.f15824b = s6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15823a) {
            case 0:
                s6 s6Var = this.f15824b;
                ph.t6 t6Var = s6Var.f15863c;
                t6Var.f42406c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(t6Var.f42406c0);
                s6Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                s6 s6Var2 = this.f15824b;
                s6Var2.C = videoEditedInfo;
                s6Var2.B.videoEditedInfo = videoEditedInfo;
                s6Var2.f15870y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(s6Var2.B, false, false, false);
                    return;
                } else if (new File(s6Var2.B.videoEditedInfo.originalPath).renameTo(new File(s6Var2.e))) {
                    FileLoader.getInstance(s6Var2.J.f15897a).uploadFile(s6Var2.e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
