package org.telegram.messenger;

import android.content.Intent;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.internal.zzfx;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.WearAuthSheet;

public class WearAuthListenerService extends WearableListenerService {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        str.getClass();
        if (str.equals("/tg-wear-auth/offer")) {
            StringBuilder sbM80m = Fragment$$ExternalSyntheticOutline0.m80m("wear-auth: offer from ", str2, " (");
            sbM80m.append(bArr.length);
            sbM80m.append(" bytes)");
            FileLog.d(sbM80m.toString());
            WearAuthSheet.onOfferReceived(bArr, str2);
            return;
        }
        if (!str.equals("/tg-wear-auth/cancel")) {
            FileLog.d("wear-auth: unexpected path ".concat(str));
            return;
        }
        FileLog.d("wear-auth: cancel from " + str2);
        WearAuthSheet.onCancelReceived();
    }

    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        zzfx zzfxVar = (zzfx) messageEvent;
        String str = zzfxVar.zzb;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new Utilities$$ExternalSyntheticLambda1(str, zzfxVar.zzd, zzfxVar.zzc, 28));
    }
}
