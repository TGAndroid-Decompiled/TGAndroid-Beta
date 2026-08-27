package j5;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import h7.q8;
import java.util.ArrayList;

public final class d implements Parcelable.Creator {

    public final int f12726a;

    public d(int i10) {
        this.f12726a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12726a) {
            case 0:
                int iZ = q8.z(parcel);
                String strH = null;
                String strH2 = null;
                String strH3 = null;
                String strH4 = null;
                Uri uri = null;
                String strH5 = null;
                String strH6 = null;
                ArrayList arrayListL = null;
                String strH7 = null;
                String strH8 = null;
                long jW = 0;
                int iU = 0;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iU = q8.u(parcel, i10);
                            break;
                        case 2:
                            strH = q8.h(parcel, i10);
                            break;
                        case 3:
                            strH2 = q8.h(parcel, i10);
                            break;
                        case 4:
                            strH3 = q8.h(parcel, i10);
                            break;
                        case 5:
                            strH4 = q8.h(parcel, i10);
                            break;
                        case 6:
                            uri = (Uri) q8.g(parcel, i10, Uri.CREATOR);
                            break;
                        case 7:
                            strH5 = q8.h(parcel, i10);
                            break;
                        case '\b':
                            jW = q8.w(parcel, i10);
                            break;
                        case '\t':
                            strH6 = q8.h(parcel, i10);
                            break;
                        case '\n':
                            arrayListL = q8.l(parcel, i10, Scope.CREATOR);
                            break;
                        case 11:
                            strH7 = q8.h(parcel, i10);
                            break;
                        case '\f':
                            strH8 = q8.h(parcel, i10);
                            break;
                        default:
                            q8.y(parcel, i10);
                            break;
                    }
                }
                q8.m(parcel, iZ);
                return new GoogleSignInAccount(iU, strH, strH2, strH3, strH4, uri, strH5, jW, strH6, arrayListL, strH7, strH8);
            case 1:
                int iZ2 = q8.z(parcel);
                ArrayList arrayListL2 = null;
                ArrayList arrayListL3 = null;
                Account account = null;
                String strH9 = null;
                String strH10 = null;
                String strH11 = null;
                int iU2 = 0;
                boolean zN = false;
                boolean zN2 = false;
                boolean zN3 = false;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iU2 = q8.u(parcel, i11);
                            break;
                        case 2:
                            arrayListL3 = q8.l(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) q8.g(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zN = q8.n(parcel, i11);
                            break;
                        case 5:
                            zN2 = q8.n(parcel, i11);
                            break;
                        case 6:
                            zN3 = q8.n(parcel, i11);
                            break;
                        case 7:
                            strH9 = q8.h(parcel, i11);
                            break;
                        case '\b':
                            strH10 = q8.h(parcel, i11);
                            break;
                        case '\t':
                            arrayListL2 = q8.l(parcel, i11, k5.a.CREATOR);
                            break;
                        case '\n':
                            strH11 = q8.h(parcel, i11);
                            break;
                        default:
                            q8.y(parcel, i11);
                            break;
                    }
                }
                q8.m(parcel, iZ2);
                return new GoogleSignInOptions(iU2, arrayListL3, account, zN, zN2, zN3, strH9, strH10, GoogleSignInOptions.c(arrayListL2), strH11);
            default:
                int iZ3 = q8.z(parcel);
                String strH12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strH13 = "";
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 4) {
                        strH12 = q8.h(parcel, i12);
                    } else if (c10 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) q8.g(parcel, i12, GoogleSignInAccount.CREATOR);
                    } else if (c10 != '\b') {
                        q8.y(parcel, i12);
                    } else {
                        strH13 = q8.h(parcel, i12);
                    }
                }
                q8.m(parcel, iZ3);
                return new SignInAccount(strH12, googleSignInAccount, strH13);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f12726a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
