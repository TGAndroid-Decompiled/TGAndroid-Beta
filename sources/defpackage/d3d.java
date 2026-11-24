package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.maps.model.CameraPosition;
public final class d3d implements Parcelable.Creator {
    public final byte a;

    public d3d(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nib[i];
            case 1:
                return new pg7[i];
            case 2:
                return new c3d[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new p3d[i];
            case 5:
                return new qg7[i];
            case 6:
                return new ep[i];
            case 7:
                return new DataHolder[i];
            case 8:
                return new GoogleSignInOptions[i];
            case 9:
                return new wuc[i];
            case 10:
                return new w4d[i];
            case 11:
                return new y4d[i];
            case 12:
                return new e5d[i];
            case 13:
                return new uf7[i];
            case 14:
                return new l5d[i];
            case 15:
                return new n5d[i];
            case 16:
                return new SignInAccount[i];
            case 17:
                return new hi0[i];
            case 18:
                return new ii0[i];
            case 19:
                return new di0[i];
            case 20:
                return new ei0[i];
            case 21:
                return new fi0[i];
            case 22:
                return new gi0[i];
            case 23:
                return new SignInConfiguration[i];
            case 24:
                return new hja[i];
            case 25:
                return new Transport[i];
            case 26:
                return new bz[i];
            case 27:
                return new y9[i];
            case 28:
                return new je1[i];
            default:
                return new CameraPosition[i];
        }
    }
}
