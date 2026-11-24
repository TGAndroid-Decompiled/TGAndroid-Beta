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
public final class hx6 implements Parcelable.Creator {
    public final byte a;

    public hx6(byte b) {
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
        zk5 zk5Var = null;
        Bundle bundle = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                return new jx6(parcel);
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new kx6(token, null);
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
                int z2 = jve.z(parcel);
                while (parcel.dataPosition() < z2) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        jve.y(parcel, readInt);
                    } else {
                        pendingIntent = (PendingIntent) jve.g(parcel, readInt, PendingIntent.CREATOR);
                    }
                }
                jve.m(parcel, z2);
                return new b58(pendingIntent);
            case 8:
                int z3 = jve.z(parcel);
                while (parcel.dataPosition() < z3) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        jve.y(parcel, readInt2);
                    } else {
                        pendingIntent2 = (PendingIntent) jve.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                jve.m(parcel, z3);
                return new c58(pendingIntent2);
            case 9:
                return new ge8(parcel);
            case 10:
                return new PlaybackStateCompat(parcel);
            case 11:
                return new fe8(parcel);
            case 12:
                return new i19(parcel.readInt(), parcel.readFloat());
            case 13:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 14:
                int z4 = jve.z(parcel);
                while (parcel.dataPosition() < z4) {
                    jve.y(parcel, parcel.readInt());
                }
                jve.m(parcel, z4);
                return new Object();
            case 15:
                int z5 = jve.z(parcel);
                while (parcel.dataPosition() < z5) {
                    jve.y(parcel, parcel.readInt());
                }
                jve.m(parcel, z5);
                return new Object();
            case 16:
                int z6 = jve.z(parcel);
                while (parcel.dataPosition() < z6) {
                    jve.y(parcel, parcel.readInt());
                }
                jve.m(parcel, z6);
                return new Object();
            case 17:
                int z7 = jve.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        jve.y(parcel, readInt3);
                    } else {
                        bundle = jve.a(parcel, readInt3);
                    }
                }
                jve.m(parcel, z7);
                return new l89(bundle);
            case 18:
                ?? obj2 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i5 = xc9.b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(zk5.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof zk5)) {
                        zk5Var = (zk5) queryLocalInterface;
                    } else {
                        ?? obj3 = new Object();
                        obj3.a = readStrongBinder;
                        zk5Var = obj3;
                    }
                }
                obj2.a = zk5Var;
                return obj2;
            case 19:
                int z8 = jve.z(parcel);
                while (parcel.dataPosition() < z8) {
                    jve.y(parcel, parcel.readInt());
                }
                jve.m(parcel, z8);
                return new Object();
            case 20:
                return new vab(parcel);
            case 21:
                int z9 = jve.z(parcel);
                while (parcel.dataPosition() < z9) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        jve.y(parcel, readInt4);
                    } else {
                        str3 = jve.h(parcel, readInt4);
                    }
                }
                jve.m(parcel, z9);
                return new y1d(str3);
            case 22:
                int z10 = jve.z(parcel);
                String str4 = null;
                int i6 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt5 = parcel.readInt();
                    char c = (char) readInt5;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                jve.y(parcel, readInt5);
                            } else {
                                i6 = jve.u(parcel, readInt5);
                            }
                        } else {
                            str4 = jve.h(parcel, readInt5);
                        }
                    } else {
                        i = jve.u(parcel, readInt5);
                    }
                }
                jve.m(parcel, z10);
                return new c2d(i, i6, str4);
            case 23:
                int z11 = jve.z(parcel);
                String str5 = null;
                int i7 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                jve.y(parcel, readInt6);
                            } else {
                                i7 = jve.u(parcel, readInt6);
                            }
                        } else {
                            str5 = jve.h(parcel, readInt6);
                        }
                    } else {
                        i4 = jve.u(parcel, readInt6);
                    }
                }
                jve.m(parcel, z11);
                return new wbc(i4, i7, str5);
            case 24:
                int z12 = jve.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        jve.y(parcel, readInt7);
                    } else {
                        arrayList2 = jve.l(parcel, readInt7, c2d.CREATOR);
                    }
                }
                jve.m(parcel, z12);
                return new g2d(arrayList2);
            case 25:
                int z13 = jve.z(parcel);
                while (parcel.dataPosition() < z13) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        jve.y(parcel, readInt8);
                    } else {
                        str2 = jve.h(parcel, readInt8);
                    }
                }
                jve.m(parcel, z13);
                return new l2d(str2);
            case 26:
                int z14 = jve.z(parcel);
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        jve.y(parcel, readInt9);
                    } else {
                        arrayList = jve.e(parcel, readInt9);
                    }
                }
                jve.m(parcel, z14);
                return new q2d(arrayList);
            case 27:
                int z15 = jve.z(parcel);
                Bundle bundle2 = null;
                int i8 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt10 = parcel.readInt();
                    char c3 = (char) readInt10;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                jve.y(parcel, readInt10);
                            } else {
                                bundle2 = jve.a(parcel, readInt10);
                            }
                        } else {
                            i8 = jve.u(parcel, readInt10);
                        }
                    } else {
                        i3 = jve.u(parcel, readInt10);
                    }
                }
                jve.m(parcel, z15);
                return new z05(i3, i8, bundle2);
            case 28:
                int z16 = jve.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            jve.y(parcel, readInt11);
                        } else {
                            str = jve.h(parcel, readInt11);
                        }
                    } else {
                        i2 = jve.u(parcel, readInt11);
                    }
                }
                jve.m(parcel, z16);
                return new xj2(i2, str);
            default:
                int z17 = jve.z(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt12 = parcel.readInt();
                    char c5 = (char) readInt12;
                    if (c5 != 1) {
                        if (c5 != 2) {
                            jve.y(parcel, readInt12);
                        } else {
                            i9 = jve.u(parcel, readInt12);
                        }
                    } else {
                        z = jve.n(parcel, readInt12);
                    }
                }
                jve.m(parcel, z17);
                return new og7(i9, z);
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jx6[i];
            case 1:
                return new MediaSessionCompat$QueueItem[i];
            case 2:
                return new kx6[i];
            case 3:
                return new MediaSessionCompat$Token[i];
            case 4:
                return new sk7[i];
            case 5:
                return new ParcelImpl[i];
            case 6:
                return new ParcelableVolumeInfo[i];
            case 7:
                return new b58[i];
            case 8:
                return new c58[i];
            case 9:
                return new ge8[i];
            case 10:
                return new PlaybackStateCompat[i];
            case 11:
                return new fe8[i];
            case 12:
                return new i19[i];
            case 13:
                return new RatingCompat[i];
            case 14:
                return new k79[i];
            case 15:
                return new l79[i];
            case 16:
                return new w79[i];
            case 17:
                return new l89[i];
            case 18:
                return new yc9[i];
            case 19:
                return new mja[i];
            case 20:
                return new vab[i];
            case 21:
                return new y1d[i];
            case 22:
                return new c2d[i];
            case 23:
                return new wbc[i];
            case 24:
                return new g2d[i];
            case 25:
                return new l2d[i];
            case 26:
                return new q2d[i];
            case 27:
                return new z05[i];
            case 28:
                return new xj2[i];
            default:
                return new og7[i];
        }
    }
}
