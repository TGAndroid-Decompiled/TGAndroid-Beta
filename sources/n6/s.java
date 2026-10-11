package n6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class s implements DialogInterface.OnClickListener {
    public final int f16755a;
    public final Intent f16756b;
    public final Object f16757c;

    public s(Intent intent, Object obj, int i10) {
        this.f16755a = i10;
        this.f16756b = intent;
        this.f16757c = obj;
    }

    public final void a() {
        switch (this.f16755a) {
            case 0:
                Intent intent = this.f16756b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f16757c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f16756b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f16757c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e7) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
