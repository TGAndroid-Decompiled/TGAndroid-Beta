package org.telegram.messenger;

import android.content.Intent;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.WearAuthSheet;

public class WearAuthListenerService extends WearableListenerService {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        final String path = messageEvent.getPath();
        final String sourceNodeId = messageEvent.getSourceNodeId();
        final byte[] data = messageEvent.getData();
        if ("/tg-wear-auth/offer".equals(path)) {
            try {
                Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WearAuthListenerService.lambda$onMessageReceived$0(path, sourceNodeId, data);
            }
        });
    }

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        str.hashCode();
        if (str.equals("/tg-wear-auth/offer")) {
            FileLog.d("wear-auth: offer from " + str2 + " (" + bArr.length + " bytes)");
            WearAuthSheet.onOfferReceived(bArr, str2);
            return;
        }
        if (str.equals("/tg-wear-auth/cancel")) {
            FileLog.d("wear-auth: cancel from " + str2);
            WearAuthSheet.onCancelReceived();
            return;
        }
        FileLog.d("wear-auth: unexpected path " + str);
    }
}
