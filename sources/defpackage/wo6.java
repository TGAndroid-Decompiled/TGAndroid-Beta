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
public final class wo6 extends Binder implements kk5 {
    public final WeakReference a;

    public wo6(yu6 yu6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(yu6Var);
    }

    @Override
    public final void N(PlaybackStateCompat playbackStateCompat) {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            yu6Var.e(2, playbackStateCompat, null);
        }
    }

    @Override
    public final void g(int i) {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            yu6Var.e(9, Integer.valueOf(i), null);
        }
    }

    @Override
    public final void i(int i) {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            yu6Var.e(12, Integer.valueOf(i), null);
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
                Bundle bundle = (Bundle) roe.a(parcel, Bundle.CREATOR);
                yu6 yu6Var = (yu6) this.a.get();
                if (yu6Var != null) {
                    yu6Var.e(1, readString, bundle);
                    break;
                }
                break;
            case 2:
                lq5.f();
                return false;
            case 3:
                N((PlaybackStateCompat) roe.a(parcel, PlaybackStateCompat.CREATOR));
                break;
            case 4:
                MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) roe.a(parcel, MediaMetadataCompat.CREATOR);
                lq5.f();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                lq5.f();
                return false;
            case 6:
                CharSequence charSequence = (CharSequence) roe.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR);
                lq5.f();
                return false;
            case 7:
                Bundle bundle2 = (Bundle) roe.a(parcel, Bundle.CREATOR);
                lq5.f();
                return false;
            case 8:
                ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) roe.a(parcel, ParcelableVolumeInfo.CREATOR);
                lq5.f();
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
                yu6 yu6Var2 = (yu6) this.a.get();
                if (yu6Var2 != null) {
                    yu6Var2.e(11, Boolean.valueOf(z), null);
                    break;
                }
                break;
            case 12:
                i(parcel.readInt());
                break;
            case 13:
                yu6 yu6Var3 = (yu6) this.a.get();
                if (yu6Var3 != null) {
                    yu6Var3.e(13, null, null);
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
