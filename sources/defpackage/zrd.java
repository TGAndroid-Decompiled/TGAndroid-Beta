package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
public abstract class zrd {
    public static Object a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return s4.g(bundle);
        }
        Parcelable parcelable = bundle.getParcelable("RESULT_DATA");
        if (Intent.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
