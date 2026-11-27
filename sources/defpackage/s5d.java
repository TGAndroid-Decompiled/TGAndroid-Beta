package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.maps.model.CameraPosition;
public final class s5d implements Parcelable.Creator {
    public final byte a;

    public s5d(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ikb[i];
            case 1:
                return new wg7[i];
            case 2:
                return new r5d[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new e6d[i];
            case 5:
                return new xg7[i];
            case 6:
                return new fo[i];
            case 7:
                return new DataHolder[i];
            case 8:
                return new GoogleSignInOptions[i];
            case 9:
                return new kxc[i];
            case 10:
                return new l7d[i];
            case 11:
                return new n7d[i];
            case 12:
                return new t7d[i];
            case 13:
                return new bg7[i];
            case 14:
                return new a8d[i];
            case 15:
                return new c8d[i];
            case 16:
                return new SignInAccount[i];
            case 17:
                return new ih0[i];
            case 18:
                return new jh0[i];
            case 19:
                return new eh0[i];
            case 20:
                return new fh0[i];
            case 21:
                return new gh0[i];
            case 22:
                return new hh0[i];
            case 23:
                return new SignInConfiguration[i];
            case 24:
                return new yka[i];
            case 25:
                return new Transport[i];
            case 26:
                return new cy[i];
            case 27:
                return new z9[i];
            case 28:
                return new jd1[i];
            default:
                return new CameraPosition[i];
        }
    }
}
