package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.view.View;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import j$.util.Objects;
import java.util.ArrayList;
public final class g31 implements Parcelable.Creator {
    public static final g31 b = new g31((byte) 1);
    public final byte a;

    public g31(byte b2) {
        this.a = b2;
    }

    @Override
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        boolean z = false;
        cq2 cq2Var = null;
        r2 = null;
        Bundle bundle2 = null;
        Uri uri = null;
        Bundle bundle3 = null;
        ArrayList arrayList = null;
        Bundle bundle4 = null;
        Bundle bundle5 = null;
        String str = null;
        PendingIntent pendingIntent = null;
        switch (this.a) {
            case 0:
                Bundle readBundle = parcel.readBundle(g31.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new h31(readBundle);
            case 1:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    int z2 = aye.z(parcel);
                    while (parcel.dataPosition() < z2) {
                        int readInt = parcel.readInt();
                        char c = (char) readInt;
                        if (c != 1) {
                            if (c != 2) {
                                aye.y(parcel, readInt);
                            } else {
                                z = aye.n(parcel, readInt);
                            }
                        } else {
                            cq2Var = (cq2) aye.g(parcel, readInt, cq2.CREATOR);
                        }
                    }
                    aye.m(parcel, z2);
                    return new io(cq2Var, z);
                }
                parcel.setDataPosition(dataPosition - 4);
                return io.d;
            case 2:
                return new r9(parcel);
            case 3:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z = true;
                }
                baseSavedState.a = z;
                return baseSavedState;
            case 4:
                return new ld0(parcel);
            case 5:
                return new md0(parcel);
            case 6:
                int z3 = aye.z(parcel);
                while (parcel.dataPosition() < z3) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        aye.y(parcel, readInt2);
                    } else {
                        z = aye.n(parcel, readInt2);
                    }
                }
                aye.m(parcel, z3);
                return new qi2(z);
            case 7:
                int z4 = aye.z(parcel);
                while (parcel.dataPosition() < z4) {
                    aye.y(parcel, parcel.readInt());
                }
                aye.m(parcel, z4);
                return new Object();
            case 8:
                int z5 = aye.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        aye.y(parcel, readInt3);
                    } else {
                        z = aye.n(parcel, readInt3);
                    }
                }
                aye.m(parcel, z5);
                return new ui2(z);
            case 9:
                int z6 = aye.z(parcel);
                while (parcel.dataPosition() < z6) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        aye.y(parcel, readInt4);
                    } else {
                        z = aye.n(parcel, readInt4);
                    }
                }
                aye.m(parcel, z6);
                return new aj2(z);
            case 10:
                int z7 = aye.z(parcel);
                c13 c13Var = null;
                while (parcel.dataPosition() < z7) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            aye.y(parcel, readInt5);
                        } else {
                            c13Var = (c13) aye.g(parcel, readInt5, c13.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) aye.g(parcel, readInt5, PendingIntent.CREATOR);
                    }
                }
                aye.m(parcel, z7);
                return new x03(pendingIntent, c13Var);
            case 11:
                int z8 = aye.z(parcel);
                String str2 = null;
                Bundle bundle6 = null;
                Bundle bundle7 = null;
                String str3 = null;
                String str4 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z8) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            str2 = aye.h(parcel, readInt6);
                            break;
                        case 2:
                            bundle6 = aye.a(parcel, readInt6);
                            break;
                        case 3:
                            bundle7 = aye.a(parcel, readInt6);
                            break;
                        case 4:
                            str3 = aye.h(parcel, readInt6);
                            break;
                        case 5:
                            str4 = aye.h(parcel, readInt6);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) aye.g(parcel, readInt6, ResultReceiver.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt6);
                            break;
                    }
                }
                aye.m(parcel, z8);
                return new a13(str2, bundle6, bundle7, str3, str4, resultReceiver);
            case 12:
                int z9 = aye.z(parcel);
                Bundle bundle8 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            aye.y(parcel, readInt7);
                        } else {
                            bundle8 = aye.a(parcel, readInt7);
                        }
                    } else {
                        str = aye.h(parcel, readInt7);
                    }
                }
                aye.m(parcel, z9);
                return new c13(str, bundle8);
            case 13:
                int z10 = aye.z(parcel);
                String str5 = "";
                String str6 = str5;
                String str7 = str6;
                Bundle bundle9 = null;
                Bundle bundle10 = null;
                String str8 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str5 = aye.h(parcel, readInt8);
                            break;
                        case 2:
                            bundle9 = aye.a(parcel, readInt8);
                            break;
                        case 3:
                            bundle10 = aye.a(parcel, readInt8);
                            break;
                        case 4:
                            str8 = aye.h(parcel, readInt8);
                            break;
                        case 5:
                            str6 = aye.h(parcel, readInt8);
                            break;
                        case 6:
                            str7 = aye.h(parcel, readInt8);
                            break;
                        default:
                            aye.y(parcel, readInt8);
                            break;
                    }
                }
                aye.m(parcel, z10);
                return new i23(str5, bundle9, bundle10, str8, str6, str7);
            case 14:
                int z11 = aye.z(parcel);
                while (parcel.dataPosition() < z11) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        aye.y(parcel, readInt9);
                    } else {
                        bundle5 = aye.a(parcel, readInt9);
                    }
                }
                aye.m(parcel, z11);
                return new e33(bundle5);
            case 15:
                return new hr3(parcel);
            case 16:
                return new gr3(parcel);
            case 17:
                int z12 = aye.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        aye.y(parcel, readInt10);
                    } else {
                        bundle4 = aye.a(parcel, readInt10);
                    }
                }
                aye.m(parcel, z12);
                return new n74(bundle4);
            case 18:
                ?? obj = new Object();
                obj.a = parcel.readString();
                obj.b = parcel.readInt();
                return obj;
            case 19:
                ?? obj2 = new Object();
                obj2.e = null;
                obj2.f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.a = parcel.createStringArrayList();
                obj2.b = parcel.createStringArrayList();
                obj2.c = (ld0[]) parcel.createTypedArray(ld0.CREATOR);
                obj2.d = parcel.readInt();
                obj2.e = parcel.readString();
                obj2.f = parcel.createStringArrayList();
                obj2.h = parcel.createTypedArrayList(md0.CREATOR);
                obj2.n = parcel.createTypedArrayList(gq4.CREATOR);
                return obj2;
            case 20:
                return new wq4(parcel);
            case 21:
                int z13 = aye.z(parcel);
                Bundle bundle11 = null;
                String str9 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    aye.y(parcel, readInt11);
                                } else {
                                    resultReceiver2 = (ResultReceiver) aye.g(parcel, readInt11, ResultReceiver.CREATOR);
                                }
                            } else {
                                str9 = aye.h(parcel, readInt11);
                            }
                        } else {
                            bundle11 = aye.a(parcel, readInt11);
                        }
                    } else {
                        arrayList = aye.l(parcel, readInt11, i23.CREATOR);
                    }
                }
                aye.m(parcel, z13);
                return new GetCredentialRequest(arrayList, bundle11, str9, resultReceiver2);
            case 22:
                int z14 = aye.z(parcel);
                while (parcel.dataPosition() < z14) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        aye.y(parcel, readInt12);
                    } else {
                        bundle3 = aye.a(parcel, readInt12);
                    }
                }
                aye.m(parcel, z14);
                return new cp5(bundle3);
            case 23:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new mr5((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 24:
                ?? obj3 = new Object();
                obj3.a = parcel.readInt();
                obj3.b = parcel.readInt();
                if (parcel.readInt() == 1) {
                    z = true;
                }
                obj3.c = z;
                return obj3;
            case 25:
                return new Parcelable(parcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new g31((byte) 25);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    {
                        this.a = parcel.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }
                };
            case 26:
                MediaDescription mediaDescription = (MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel);
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle o = gcc.o(mediaDescription.getExtras());
                if (o != null) {
                    try {
                        Bundle bundle12 = new Bundle(o);
                        Uri uri2 = (Uri) bundle12.getParcelable("android.support.v4.media.description.MEDIA_URI");
                        if (uri2 != null) {
                            if (!bundle12.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundle12.size() != 2) {
                                bundle12.remove("android.support.v4.media.description.MEDIA_URI");
                                bundle12.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                            }
                            bundle = bundle2;
                            uri = uri2;
                        }
                        bundle2 = bundle12;
                        bundle = bundle2;
                        uri = uri2;
                    } catch (RuntimeException e) {
                        efd.g("MediaDescriptionCompat", "Failed to parse extras", e);
                        bundle = null;
                    }
                } else {
                    bundle = o;
                }
                if (uri == null) {
                    uri = mediaDescription.getMediaUri();
                }
                os6 os6Var = new os6(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                os6Var.s = mediaDescription;
                return os6Var;
            case 27:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 28:
                return new pt6(parcel);
            default:
                return new MediaMetadataCompat(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new h31[i];
            case 1:
                return new io[i];
            case 2:
                return new r9[i];
            case 3:
                return new eq[i];
            case 4:
                return new ld0[i];
            case 5:
                return new md0[i];
            case 6:
                return new qi2[i];
            case 7:
                return new ti2[i];
            case 8:
                return new ui2[i];
            case 9:
                return new aj2[i];
            case 10:
                return new x03[i];
            case 11:
                return new a13[i];
            case 12:
                return new c13[i];
            case 13:
                return new i23[i];
            case 14:
                return new e33[i];
            case 15:
                return new hr3[i];
            case 16:
                return new gr3[i];
            case 17:
                return new n74[i];
            case 18:
                return new gq4[i];
            case 19:
                return new mq4[i];
            case 20:
                return new wq4[i];
            case 21:
                return new GetCredentialRequest[i];
            case 22:
                return new cp5[i];
            case 23:
                return new mr5[i];
            case 24:
                return new w46[i];
            case 25:
                return new MediaBrowserCompat$MediaItem[i];
            case 26:
                return new os6[i];
            case 27:
                return new MediaDescriptionCompat[i];
            case 28:
                return new pt6[i];
            default:
                return new MediaMetadataCompat[i];
        }
    }
}
