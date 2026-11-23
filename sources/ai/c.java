package ai;

import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.util.Log;
public final class c implements RecognitionSupportCallback {
    public final boolean[] f1136a;
    public final b f1137b;

    public c(boolean[] zArr, b bVar) {
        this.f1136a = zArr;
        this.f1137b = bVar;
    }

    public final void onError(int i7) {
        Log.d("Dictation", "support probe: error " + i7);
        if (i7 == 14) {
            this.f1136a[0] = true;
        }
        this.f1137b.run();
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        Log.d("Dictation", "support probe: installed=" + recognitionSupport.getInstalledOnDeviceLanguages().size() + " pending=" + recognitionSupport.getPendingOnDeviceLanguages().size() + " onDevice=" + recognitionSupport.getSupportedOnDeviceLanguages().size() + " online=" + recognitionSupport.getOnlineLanguages().size());
        if (!recognitionSupport.getInstalledOnDeviceLanguages().isEmpty() || !recognitionSupport.getPendingOnDeviceLanguages().isEmpty() || !recognitionSupport.getSupportedOnDeviceLanguages().isEmpty() || !recognitionSupport.getOnlineLanguages().isEmpty()) {
            this.f1136a[0] = true;
        }
        this.f1137b.run();
    }
}
