package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
public final class so6 extends Binder implements hk5 {
    public final WeakReference a;

    public so6(tu6 tu6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(tu6Var);
    }

    @Override
    public final void N(PlaybackStateCompat playbackStateCompat) {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            tu6Var.e(2, playbackStateCompat, null);
        }
    }

    @Override
    public final void g(int i) {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            tu6Var.e(9, Integer.valueOf(i), null);
        }
    }

    @Override
    public final void i(int i) {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            tu6Var.e(12, Integer.valueOf(i), null);
        }
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        boolean z = false;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) bme.a(parcel, Bundle.CREATOR);
                tu6 tu6Var = (tu6) this.a.get();
                if (tu6Var != null) {
                    tu6Var.e(1, readString, bundle);
                    break;
                }
                break;
            case 2:
                zo4.f();
                return false;
            case 3:
                N((PlaybackStateCompat) bme.a(parcel, PlaybackStateCompat.CREATOR));
                break;
            case 4:
                MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) bme.a(parcel, MediaMetadataCompat.CREATOR);
                zo4.f();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                zo4.f();
                return false;
            case 6:
                CharSequence charSequence = (CharSequence) bme.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR);
                zo4.f();
                return false;
            case 7:
                Bundle bundle2 = (Bundle) bme.a(parcel, Bundle.CREATOR);
                zo4.f();
                return false;
            case 8:
                ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) bme.a(parcel, ParcelableVolumeInfo.CREATOR);
                zo4.f();
                return false;
            case 9:
                g(parcel.readInt());
                break;
            case 10:
                parcel.readInt();
                break;
            case 11:
                if (parcel.readInt() != 0) {
                    z = true;
                }
                tu6 tu6Var2 = (tu6) this.a.get();
                if (tu6Var2 != null) {
                    tu6Var2.e(11, Boolean.valueOf(z), null);
                    break;
                }
                break;
            case 12:
                i(parcel.readInt());
                break;
            case 13:
                tu6 tu6Var3 = (tu6) this.a.get();
                if (tu6Var3 != null) {
                    tu6Var3.e(13, null, null);
                    break;
                }
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
