package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class k7d implements DialogInterface.OnClickListener {
    public final byte a;
    public final Intent b;
    public final Object c;

    public k7d(Intent intent, Object obj, byte b) {
        this.a = b;
        this.b = intent;
        this.c = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Intent intent = this.b;
        switch (b) {
            case 0:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                if (intent != null) {
                    ((g36) obj).startActivityForResult(intent, 2);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
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
