package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
public final class hv6 implements Parcelable.Creator {
    public final byte a;

    public hv6(byte b) {
        this.a = b;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        aj5 aj5Var = null;
        Bundle bundle = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                return new jv6(parcel);
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new kv6(token, null);
            case 3:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 4:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.a = parcel.readInt();
                return baseSavedState;
            case 5:
                return new ParcelImpl(parcel);
            case 6:
                ?? obj = new Object();
                obj.a = parcel.readInt();
                obj.c = parcel.readInt();
                obj.d = parcel.readInt();
                obj.e = parcel.readInt();
                obj.b = parcel.readInt();
                return obj;
            case 7:
                int z2 = gte.z(parcel);
                while (parcel.dataPosition() < z2) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        gte.y(parcel, readInt);
                    } else {
                        pendingIntent = (PendingIntent) gte.g(parcel, readInt, PendingIntent.CREATOR);
                    }
                }
                gte.m(parcel, z2);
                return new z28(pendingIntent);
            case 8:
                int z3 = gte.z(parcel);
                while (parcel.dataPosition() < z3) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        gte.y(parcel, readInt2);
                    } else {
                        pendingIntent2 = (PendingIntent) gte.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                gte.m(parcel, z3);
                return new a38(pendingIntent2);
            case 9:
                return new dc8(parcel);
            case 10:
                return new PlaybackStateCompat(parcel);
            case 11:
                return new cc8(parcel);
            case 12:
                return new hz8(parcel.readInt(), parcel.readFloat());
            case 13:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 14:
                int z4 = gte.z(parcel);
                while (parcel.dataPosition() < z4) {
                    gte.y(parcel, parcel.readInt());
                }
                gte.m(parcel, z4);
                return new Object();
            case 15:
                int z5 = gte.z(parcel);
                while (parcel.dataPosition() < z5) {
                    gte.y(parcel, parcel.readInt());
                }
                gte.m(parcel, z5);
                return new Object();
            case 16:
                int z6 = gte.z(parcel);
                while (parcel.dataPosition() < z6) {
                    gte.y(parcel, parcel.readInt());
                }
                gte.m(parcel, z6);
                return new Object();
            case 17:
                int z7 = gte.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        gte.y(parcel, readInt3);
                    } else {
                        bundle = gte.a(parcel, readInt3);
                    }
                }
                gte.m(parcel, z7);
                return new j69(bundle);
            case 18:
                ?? obj2 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i5 = xa9.b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(aj5.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof aj5)) {
                        aj5Var = (aj5) queryLocalInterface;
                    } else {
                        ?? obj3 = new Object();
                        obj3.a = readStrongBinder;
                        aj5Var = obj3;
                    }
                }
                obj2.a = aj5Var;
                return obj2;
            case 19:
                int z8 = gte.z(parcel);
                while (parcel.dataPosition() < z8) {
                    gte.y(parcel, parcel.readInt());
                }
                gte.m(parcel, z8);
                return new Object();
            case 20:
                return new t8b(parcel);
            case 21:
                int z9 = gte.z(parcel);
                while (parcel.dataPosition() < z9) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        gte.y(parcel, readInt4);
                    } else {
                        str3 = gte.h(parcel, readInt4);
                    }
                }
                gte.m(parcel, z9);
                return new xzc(str3);
            case 22:
                int z10 = gte.z(parcel);
                String str4 = null;
                int i6 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt5 = parcel.readInt();
                    char c = (char) readInt5;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                gte.y(parcel, readInt5);
                            } else {
                                i6 = gte.u(parcel, readInt5);
                            }
                        } else {
                            str4 = gte.h(parcel, readInt5);
                        }
                    } else {
                        i = gte.u(parcel, readInt5);
                    }
                }
                gte.m(parcel, z10);
                return new b0d(i, i6, str4);
            case 23:
                int z11 = gte.z(parcel);
                String str5 = null;
                int i7 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                gte.y(parcel, readInt6);
                            } else {
                                i7 = gte.u(parcel, readInt6);
                            }
                        } else {
                            str5 = gte.h(parcel, readInt6);
                        }
                    } else {
                        i4 = gte.u(parcel, readInt6);
                    }
                }
                gte.m(parcel, z11);
                return new v9c(i4, i7, str5);
            case 24:
                int z12 = gte.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        gte.y(parcel, readInt7);
                    } else {
                        arrayList2 = gte.l(parcel, readInt7, b0d.CREATOR);
                    }
                }
                gte.m(parcel, z12);
                return new f0d(arrayList2);
            case 25:
                int z13 = gte.z(parcel);
                while (parcel.dataPosition() < z13) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        gte.y(parcel, readInt8);
                    } else {
                        str2 = gte.h(parcel, readInt8);
                    }
                }
                gte.m(parcel, z13);
                return new j0d(str2);
            case 26:
                int z14 = gte.z(parcel);
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        gte.y(parcel, readInt9);
                    } else {
                        arrayList = gte.e(parcel, readInt9);
                    }
                }
                gte.m(parcel, z14);
                return new o0d(arrayList);
            case 27:
                int z15 = gte.z(parcel);
                Bundle bundle2 = null;
                int i8 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt10 = parcel.readInt();
                    char c3 = (char) readInt10;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                gte.y(parcel, readInt10);
                            } else {
                                bundle2 = gte.a(parcel, readInt10);
                            }
                        } else {
                            i8 = gte.u(parcel, readInt10);
                        }
                    } else {
                        i3 = gte.u(parcel, readInt10);
                    }
                }
                gte.m(parcel, z15);
                return new az4(i3, i8, bundle2);
            case 28:
                int z16 = gte.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            gte.y(parcel, readInt11);
                        } else {
                            str = gte.h(parcel, readInt11);
                        }
                    } else {
                        i2 = gte.u(parcel, readInt11);
                    }
                }
                gte.m(parcel, z16);
                return new ji2(i2, str);
            default:
                int z17 = gte.z(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt12 = parcel.readInt();
                    char c5 = (char) readInt12;
                    if (c5 != 1) {
                        if (c5 != 2) {
                            gte.y(parcel, readInt12);
                        } else {
                            i9 = gte.u(parcel, readInt12);
                        }
                    } else {
                        z = gte.n(parcel, readInt12);
                    }
                }
                gte.m(parcel, z17);
                return new me7(i9, z);
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jv6[i];
            case 1:
                return new MediaSessionCompat$QueueItem[i];
            case 2:
                return new kv6[i];
            case 3:
                return new MediaSessionCompat$Token[i];
            case 4:
                return new qi7[i];
            case 5:
                return new ParcelImpl[i];
            case 6:
                return new ParcelableVolumeInfo[i];
            case 7:
                return new z28[i];
            case 8:
                return new a38[i];
            case 9:
                return new dc8[i];
            case 10:
                return new PlaybackStateCompat[i];
            case 11:
                return new cc8[i];
            case 12:
                return new hz8[i];
            case 13:
                return new RatingCompat[i];
            case 14:
                return new i59[i];
            case 15:
                return new j59[i];
            case 16:
                return new u59[i];
            case 17:
                return new j69[i];
            case 18:
                return new ya9[i];
            case 19:
                return new kha[i];
            case 20:
                return new t8b[i];
            case 21:
                return new xzc[i];
            case 22:
                return new b0d[i];
            case 23:
                return new v9c[i];
            case 24:
                return new f0d[i];
            case 25:
                return new j0d[i];
            case 26:
                return new o0d[i];
            case 27:
                return new az4[i];
            case 28:
                return new ji2[i];
            default:
                return new me7[i];
        }
    }
}
