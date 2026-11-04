package e9;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import org.telegram.messenger.GoogleVoiceClientService;
public abstract class a extends Activity {
    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, GoogleVoiceClientService.class);
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        finish();
    }
}
