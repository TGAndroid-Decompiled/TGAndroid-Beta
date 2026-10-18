package ci;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class g7 implements Utilities.Callback {
    public final int f5425a;
    public final h7 f5426b;

    public g7(h7 h7Var, int i10) {
        this.f5425a = i10;
        this.f5426b = h7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5425a) {
            case 0:
                h7 h7Var = this.f5426b;
                ei.a8 a8Var = h7Var.f5471c;
                a8Var.f8704c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(a8Var.f8704c0);
                h7Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                h7 h7Var2 = this.f5426b;
                h7Var2.F = videoEditedInfo;
                h7Var2.E.videoEditedInfo = videoEditedInfo;
                h7Var2.f5478y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(h7Var2.E, false, false, false);
                    return;
                } else if (new File(h7Var2.E.videoEditedInfo.originalPath).renameTo(new File(h7Var2.e))) {
                    FileLoader.getInstance(h7Var2.M.f5494a).uploadFile(h7Var2.e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
