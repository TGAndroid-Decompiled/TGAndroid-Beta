package ai;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Utilities.Callback {
    public final int f1246a;
    public final l9 f1247b;

    public k9(l9 l9Var, int i10) {
        this.f1246a = i10;
        this.f1247b = l9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1246a) {
            case 0:
                l9 l9Var = this.f1247b;
                ci.l8 l8Var = l9Var.f1351c;
                l8Var.f5401c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(l8Var.f5401c0);
                l9Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                l9 l9Var2 = this.f1247b;
                l9Var2.F = videoEditedInfo;
                l9Var2.E.videoEditedInfo = videoEditedInfo;
                l9Var2.f1359y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(l9Var2.E, false, false, false);
                    return;
                } else if (new File(l9Var2.E.videoEditedInfo.originalPath).renameTo(new File(l9Var2.f1352e))) {
                    FileLoader.getInstance(l9Var2.M.f1406a).uploadFile(l9Var2.f1352e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
