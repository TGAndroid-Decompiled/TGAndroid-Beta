package ef;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class f implements NotificationCenter.NotificationCenterDelegate {
    public final int f5903a;
    public final String f5904b;
    public boolean f5905c;

    public f(String str, int i10) {
        this.f5903a = i10;
        this.f5904b = str;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
        FileLoader.getInstance(i10).uploadFile(str, false, true, 50331648);
    }

    public final void a() {
        int i10 = this.f5903a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            if (!this.f5905c && str.equals(this.f5904b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String fileExtension = FileLoader.getFileExtension(new File(inputFile.name));
                uploadringtone.mime_type = fileExtension;
                if ("ogg".equals(fileExtension)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.f5903a).sendRequest(uploadringtone, new a(this, 1));
            }
        }
    }
}
