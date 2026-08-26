package org.telegram.messenger.ringtone;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class RingtoneUploader implements NotificationCenter.NotificationCenterDelegate {
    public boolean canceled;
    public final int currentAccount;
    public final String filePath;

    public RingtoneUploader(String str, int i) {
        this.currentAccount = i;
        this.filePath = str;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileUploadFailed);
        FileLoader.getInstance(i).uploadFile(str, false, true, 50331648);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            if (!this.canceled && str.equals(this.filePath)) {
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(uploadringtone, new RichMediaUploader$$ExternalSyntheticLambda0(this, 2));
            }
        }
    }
}
