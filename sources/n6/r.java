package n6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class r implements DialogInterface.OnClickListener {
    public final int f15077a;
    public final Intent f15078b;
    public final Object f15079c;

    public r(Intent intent, Object obj, int i10) {
        this.f15077a = i10;
        this.f15078b = intent;
        this.f15079c = obj;
    }

    public final void a() {
        switch (this.f15077a) {
            case 0:
                Intent intent = this.f15078b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f15079c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f15078b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f15079c).startActivityForResult(intent2, 2);
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
            } catch (ActivityNotFoundException e) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
