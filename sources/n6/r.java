package n6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class r implements DialogInterface.OnClickListener {
    public final int f13630a;
    public final Intent f13631b;
    public final Object f13632c;

    public r(Intent intent, Object obj, int i10) {
        this.f13630a = i10;
        this.f13631b = intent;
        this.f13632c = obj;
    }

    public final void a() {
        switch (this.f13630a) {
            case 0:
                Intent intent = this.f13631b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f13632c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f13631b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f13632c).startActivityForResult(intent2, 2);
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
