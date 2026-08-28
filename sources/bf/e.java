package bf;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e implements NotificationCenter.NotificationCenterDelegate {
    public final int f1682a;
    public final String f1683b;
    public boolean f1684c;

    public e(String str, int i9) {
        this.f1682a = i9;
        this.f1683b = str;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploadFailed);
        FileLoader.getInstance(i9).uploadFile(str, false, true, 50331648);
    }

    public final void a() {
        int i9 = this.f1682a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploadFailed);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            if (!this.f1684c && str.equals(this.f1683b)) {
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
                ConnectionsManager.getInstance(this.f1682a).sendRequest(uploadringtone, new a(this, 1));
            }
        }
    }
}
