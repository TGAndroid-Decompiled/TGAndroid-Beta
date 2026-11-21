package c8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
public abstract class y9 {
    public static Object a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ai.d.g(bundle);
        }
        Parcelable parcelable = bundle.getParcelable("RESULT_DATA");
        if (Intent.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
