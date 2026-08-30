package b6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class s implements DialogInterface.OnClickListener {
    public final int f1639a;
    public final Intent f1640b;
    public final Object f1641c;

    public s(Intent intent, Object obj, int i10) {
        this.f1639a = i10;
        this.f1640b = intent;
        this.f1641c = obj;
    }

    public final void a() {
        switch (this.f1639a) {
            case 0:
                Intent intent = this.f1640b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f1641c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f1640b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f1641c).startActivityForResult(intent2, 2);
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
