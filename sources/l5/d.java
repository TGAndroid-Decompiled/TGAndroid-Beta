package l5;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
public final class d implements Parcelable.Creator {
    public final int f14487a;

    public d(int i10) {
        this.f14487a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14487a) {
            case 0:
                int A = ce.b.A(parcel);
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
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = ce.b.v(parcel, readInt);
                            break;
                        case 2:
                            str = ce.b.i(parcel, readInt);
                            break;
                        case 3:
                            str2 = ce.b.i(parcel, readInt);
                            break;
                        case 4:
                            str3 = ce.b.i(parcel, readInt);
                            break;
                        case 5:
                            str4 = ce.b.i(parcel, readInt);
                            break;
                        case 6:
                            uri = (Uri) ce.b.h(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = ce.b.i(parcel, readInt);
                            break;
                        case '\b':
                            j10 = ce.b.x(parcel, readInt);
                            break;
                        case '\t':
                            str6 = ce.b.i(parcel, readInt);
                            break;
                        case '\n':
                            arrayList = ce.b.m(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = ce.b.i(parcel, readInt);
                            break;
                        case '\f':
                            str8 = ce.b.i(parcel, readInt);
                            break;
                        default:
                            ce.b.z(parcel, readInt);
                            break;
                    }
                }
                ce.b.n(parcel, A);
                return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
            case 1:
                int A2 = ce.b.A(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i11 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = ce.b.v(parcel, readInt2);
                            break;
                        case 2:
                            arrayList3 = ce.b.m(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) ce.b.h(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z10 = ce.b.o(parcel, readInt2);
                            break;
                        case 5:
                            z11 = ce.b.o(parcel, readInt2);
                            break;
                        case 6:
                            z12 = ce.b.o(parcel, readInt2);
                            break;
                        case 7:
                            str9 = ce.b.i(parcel, readInt2);
                            break;
                        case '\b':
                            str10 = ce.b.i(parcel, readInt2);
                            break;
                        case '\t':
                            arrayList2 = ce.b.m(parcel, readInt2, m5.a.CREATOR);
                            break;
                        case '\n':
                            str11 = ce.b.i(parcel, readInt2);
                            break;
                        default:
                            ce.b.z(parcel, readInt2);
                            break;
                    }
                }
                ce.b.n(parcel, A2);
                return new GoogleSignInOptions(i11, arrayList3, account, z10, z11, z12, str9, str10, GoogleSignInOptions.c(arrayList2), str11);
            default:
                int A3 = ce.b.A(parcel);
                String str12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = "";
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 != 4) {
                        if (c3 != 7) {
                            if (c3 != '\b') {
                                ce.b.z(parcel, readInt3);
                            } else {
                                str13 = ce.b.i(parcel, readInt3);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) ce.b.h(parcel, readInt3, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str12 = ce.b.i(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f14487a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
