package n5;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import j7.l0;
import java.util.ArrayList;
public final class d implements Parcelable.Creator {
    public final int f14274a;

    public d(int i10) {
        this.f14274a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14274a) {
            case 0:
                int z4 = l0.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j10 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = l0.u(parcel, readInt);
                            break;
                        case 2:
                            str = l0.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = l0.h(parcel, readInt);
                            break;
                        case 4:
                            str3 = l0.h(parcel, readInt);
                            break;
                        case 5:
                            str4 = l0.h(parcel, readInt);
                            break;
                        case 6:
                            uri = (Uri) l0.g(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = l0.h(parcel, readInt);
                            break;
                        case '\b':
                            j10 = l0.w(parcel, readInt);
                            break;
                        case '\t':
                            str6 = l0.h(parcel, readInt);
                            break;
                        case '\n':
                            arrayList = l0.l(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = l0.h(parcel, readInt);
                            break;
                        case '\f':
                            str8 = l0.h(parcel, readInt);
                            break;
                        default:
                            l0.y(parcel, readInt);
                            break;
                    }
                }
                l0.m(parcel, z4);
                return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
            case 1:
                int z10 = l0.z(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i11 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = l0.u(parcel, readInt2);
                            break;
                        case 2:
                            arrayList3 = l0.l(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) l0.g(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z11 = l0.n(parcel, readInt2);
                            break;
                        case 5:
                            z12 = l0.n(parcel, readInt2);
                            break;
                        case 6:
                            z13 = l0.n(parcel, readInt2);
                            break;
                        case 7:
                            str9 = l0.h(parcel, readInt2);
                            break;
                        case '\b':
                            str10 = l0.h(parcel, readInt2);
                            break;
                        case '\t':
                            arrayList2 = l0.l(parcel, readInt2, o5.a.CREATOR);
                            break;
                        case '\n':
                            str11 = l0.h(parcel, readInt2);
                            break;
                        default:
                            l0.y(parcel, readInt2);
                            break;
                    }
                }
                l0.m(parcel, z10);
                return new GoogleSignInOptions(i11, arrayList3, account, z11, z12, z13, str9, str10, GoogleSignInOptions.f(arrayList2), str11);
            default:
                int z14 = l0.z(parcel);
                String str12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = "";
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 != 4) {
                        if (c3 != 7) {
                            if (c3 != '\b') {
                                l0.y(parcel, readInt3);
                            } else {
                                str13 = l0.h(parcel, readInt3);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) l0.g(parcel, readInt3, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str12 = l0.h(parcel, readInt3);
                    }
                }
                l0.m(parcel, z14);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f14274a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
