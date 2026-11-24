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
public final class f41 implements Parcelable.Creator {
    public static final f41 b = new f41((byte) 1);
    public final byte a;

    public f41(byte b2) {
        this.a = b2;
    }

    @Override
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        boolean z = false;
        uq2 uq2Var = null;
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
                Bundle readBundle = parcel.readBundle(f41.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new g41(readBundle);
            case 1:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    int z2 = jve.z(parcel);
                    while (parcel.dataPosition() < z2) {
                        int readInt = parcel.readInt();
                        char c = (char) readInt;
                        if (c != 1) {
                            if (c != 2) {
                                jve.y(parcel, readInt);
                            } else {
                                z = jve.n(parcel, readInt);
                            }
                        } else {
                            uq2Var = (uq2) jve.g(parcel, readInt, uq2.CREATOR);
                        }
                    }
                    jve.m(parcel, z2);
                    return new hp(uq2Var, z);
                }
                parcel.setDataPosition(dataPosition - 4);
                return hp.d;
            case 2:
                return new q9(parcel);
            case 3:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z = true;
                }
                baseSavedState.a = z;
                return baseSavedState;
            case 4:
                return new je0(parcel);
            case 5:
                return new ke0(parcel);
            case 6:
                int z3 = jve.z(parcel);
                while (parcel.dataPosition() < z3) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        jve.y(parcel, readInt2);
                    } else {
                        z = jve.n(parcel, readInt2);
                    }
                }
                jve.m(parcel, z3);
                return new ij2(z);
            case 7:
                int z4 = jve.z(parcel);
                while (parcel.dataPosition() < z4) {
                    jve.y(parcel, parcel.readInt());
                }
                jve.m(parcel, z4);
                return new Object();
            case 8:
                int z5 = jve.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        jve.y(parcel, readInt3);
                    } else {
                        z = jve.n(parcel, readInt3);
                    }
                }
                jve.m(parcel, z5);
                return new mj2(z);
            case 9:
                int z6 = jve.z(parcel);
                while (parcel.dataPosition() < z6) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        jve.y(parcel, readInt4);
                    } else {
                        z = jve.n(parcel, readInt4);
                    }
                }
                jve.m(parcel, z6);
                return new sj2(z);
            case 10:
                int z7 = jve.z(parcel);
                v13 v13Var = null;
                while (parcel.dataPosition() < z7) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            jve.y(parcel, readInt5);
                        } else {
                            v13Var = (v13) jve.g(parcel, readInt5, v13.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) jve.g(parcel, readInt5, PendingIntent.CREATOR);
                    }
                }
                jve.m(parcel, z7);
                return new p13(pendingIntent, v13Var);
            case 11:
                int z8 = jve.z(parcel);
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
                            str2 = jve.h(parcel, readInt6);
                            break;
                        case 2:
                            bundle6 = jve.a(parcel, readInt6);
                            break;
                        case 3:
                            bundle7 = jve.a(parcel, readInt6);
                            break;
                        case 4:
                            str3 = jve.h(parcel, readInt6);
                            break;
                        case 5:
                            str4 = jve.h(parcel, readInt6);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) jve.g(parcel, readInt6, ResultReceiver.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt6);
                            break;
                    }
                }
                jve.m(parcel, z8);
                return new t13(str2, bundle6, bundle7, str3, str4, resultReceiver);
            case 12:
                int z9 = jve.z(parcel);
                Bundle bundle8 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            jve.y(parcel, readInt7);
                        } else {
                            bundle8 = jve.a(parcel, readInt7);
                        }
                    } else {
                        str = jve.h(parcel, readInt7);
                    }
                }
                jve.m(parcel, z9);
                return new v13(str, bundle8);
            case 13:
                int z10 = jve.z(parcel);
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
                            str5 = jve.h(parcel, readInt8);
                            break;
                        case 2:
                            bundle9 = jve.a(parcel, readInt8);
                            break;
                        case 3:
                            bundle10 = jve.a(parcel, readInt8);
                            break;
                        case 4:
                            str8 = jve.h(parcel, readInt8);
                            break;
                        case 5:
                            str6 = jve.h(parcel, readInt8);
                            break;
                        case 6:
                            str7 = jve.h(parcel, readInt8);
                            break;
                        default:
                            jve.y(parcel, readInt8);
                            break;
                    }
                }
                jve.m(parcel, z10);
                return new b33(str5, bundle9, bundle10, str8, str6, str7);
            case 14:
                int z11 = jve.z(parcel);
                while (parcel.dataPosition() < z11) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        jve.y(parcel, readInt9);
                    } else {
                        bundle5 = jve.a(parcel, readInt9);
                    }
                }
                jve.m(parcel, z11);
                return new x33(bundle5);
            case 15:
                return new as3(parcel);
            case 16:
                return new zr3(parcel);
            case 17:
                int z12 = jve.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        jve.y(parcel, readInt10);
                    } else {
                        bundle4 = jve.a(parcel, readInt10);
                    }
                }
                jve.m(parcel, z12);
                return new c84(bundle4);
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
                obj2.c = (je0[]) parcel.createTypedArray(je0.CREATOR);
                obj2.d = parcel.readInt();
                obj2.e = parcel.readString();
                obj2.f = parcel.createStringArrayList();
                obj2.h = parcel.createTypedArrayList(ke0.CREATOR);
                obj2.n = parcel.createTypedArrayList(dq4.CREATOR);
                return obj2;
            case 20:
                return new tq4(parcel);
            case 21:
                int z13 = jve.z(parcel);
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
                                    jve.y(parcel, readInt11);
                                } else {
                                    resultReceiver2 = (ResultReceiver) jve.g(parcel, readInt11, ResultReceiver.CREATOR);
                                }
                            } else {
                                str9 = jve.h(parcel, readInt11);
                            }
                        } else {
                            bundle11 = jve.a(parcel, readInt11);
                        }
                    } else {
                        arrayList = jve.l(parcel, readInt11, b33.CREATOR);
                    }
                }
                jve.m(parcel, z13);
                return new GetCredentialRequest(arrayList, bundle11, str9, resultReceiver2);
            case 22:
                int z14 = jve.z(parcel);
                while (parcel.dataPosition() < z14) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        jve.y(parcel, readInt12);
                    } else {
                        bundle3 = jve.a(parcel, readInt12);
                    }
                }
                jve.m(parcel, z14);
                return new zo5(bundle3);
            case 23:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new jr5((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
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
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new f41((byte) 25);
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
                Bundle o = hac.o(mediaDescription.getExtras());
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
                        ncd.g("MediaDescriptionCompat", "Failed to parse extras", e);
                        bundle = null;
                    }
                } else {
                    bundle = o;
                }
                if (uri == null) {
                    uri = mediaDescription.getMediaUri();
                }
                ks6 ks6Var = new ks6(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                ks6Var.s = mediaDescription;
                return ks6Var;
            case 27:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 28:
                return new lt6(parcel);
            default:
                return new MediaMetadataCompat(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new g41[i];
            case 1:
                return new hp[i];
            case 2:
                return new q9[i];
            case 3:
                return new dr[i];
            case 4:
                return new je0[i];
            case 5:
                return new ke0[i];
            case 6:
                return new ij2[i];
            case 7:
                return new lj2[i];
            case 8:
                return new mj2[i];
            case 9:
                return new sj2[i];
            case 10:
                return new p13[i];
            case 11:
                return new t13[i];
            case 12:
                return new v13[i];
            case 13:
                return new b33[i];
            case 14:
                return new x33[i];
            case 15:
                return new as3[i];
            case 16:
                return new zr3[i];
            case 17:
                return new c84[i];
            case 18:
                return new dq4[i];
            case 19:
                return new jq4[i];
            case 20:
                return new tq4[i];
            case 21:
                return new GetCredentialRequest[i];
            case 22:
                return new zo5[i];
            case 23:
                return new jr5[i];
            case 24:
                return new t46[i];
            case 25:
                return new MediaBrowserCompat$MediaItem[i];
            case 26:
                return new ks6[i];
            case 27:
                return new MediaDescriptionCompat[i];
            case 28:
                return new lt6[i];
            default:
                return new MediaMetadataCompat[i];
        }
    }
}
