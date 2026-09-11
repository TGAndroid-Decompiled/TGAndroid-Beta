package n6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class r implements DialogInterface.OnClickListener {
    public final int f16588a;
    public final Intent f16589b;
    public final Object f16590c;

    public r(Intent intent, Object obj, int i10) {
        this.f16588a = i10;
        this.f16589b = intent;
        this.f16590c = obj;
    }

    public final void a() {
        switch (this.f16588a) {
            case 0:
                Intent intent = this.f16589b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f16590c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f16589b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f16590c).startActivityForResult(intent2, 2);
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
