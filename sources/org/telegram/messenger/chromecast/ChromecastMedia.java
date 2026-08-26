package org.telegram.messenger.chromecast;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.cast.MediaMetadata;

public final class ChromecastMedia {
    public final String externalPath;
    public final int height;
    public final Uri internalUri;
    public final MediaMetadata mediaMetadata;
    public final String mimeType;
    public final int width;

    public final class Builder {
        public MediaMetadata baseMetadata;
        public final String externalPath;
        public int height;
        public final Uri internalUri;
        public final String mimeType;
        public String subtitle;
        public String title;
        public int width;

        public Builder(Uri uri, String str, String str2) {
            this.mimeType = str;
            this.internalUri = uri;
            this.externalPath = str2;
        }
    }

    public ChromecastMedia(Builder builder) {
        MediaMetadata mediaMetadata;
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        String str2;
        int i;
        int i2 = 3;
        String str3 = builder.mimeType;
        this.mimeType = str3;
        str3.getClass();
        switch (str3) {
            case "image/jpeg":
            case "image/png":
                i2 = 4;
                MediaMetadata mediaMetadata2 = builder.baseMetadata;
                mediaMetadata = mediaMetadata2 == null ? new MediaMetadata(i2) : mediaMetadata2;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str = builder.title;
                if (str != null) {
                    sb.append(str);
                }
                str2 = builder.subtitle;
                if (str2 != null) {
                    sb2.append(str2);
                }
                i = builder.width;
                if (i != 0 && builder.height != 0) {
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.WIDTH");
                    Bundle bundle = mediaMetadata.zza;
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i);
                    int i3 = builder.height;
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i3);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(builder.width);
                    sb2.append("x");
                    sb2.append(builder.height);
                    sb2.append(")");
                }
                if (sb.length() > 0) {
                    mediaMetadata.putString("com.google.android.gms.cast.metadata.TITLE", sb.toString());
                } else {
                    mediaMetadata.putString("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb2.length() > 0) {
                    mediaMetadata.putString("com.google.android.gms.cast.metadata.SUBTITLE", sb2.toString());
                    break;
                }
                break;
            case "application/x-mpegURL":
            case "video/mp4":
                i2 = 1;
                MediaMetadata mediaMetadata3 = builder.baseMetadata;
                mediaMetadata = mediaMetadata3 == null ? new MediaMetadata(i2) : mediaMetadata3;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str = builder.title;
                if (str != null) {
                    sb.append(str);
                }
                str2 = builder.subtitle;
                if (str2 != null) {
                    sb2.append(str2);
                }
                i = builder.width;
                if (i != 0) {
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.WIDTH");
                    Bundle bundle2 = mediaMetadata.zza;
                    bundle2.putInt("com.google.android.gms.cast.metadata.WIDTH", i);
                    int i4 = builder.height;
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle2.putInt("com.google.android.gms.cast.metadata.HEIGHT", i4);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(builder.width);
                    sb2.append("x");
                    sb2.append(builder.height);
                    sb2.append(")");
                }
                if (sb.length() > 0) {
                    mediaMetadata.putString("com.google.android.gms.cast.metadata.TITLE", sb.toString());
                } else {
                    mediaMetadata.putString("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb2.length() > 0) {
                    mediaMetadata.putString("com.google.android.gms.cast.metadata.SUBTITLE", sb2.toString());
                    break;
                }
                break;
            default:
                if (str3.startsWith("audio/")) {
                    MediaMetadata mediaMetadata4 = builder.baseMetadata;
                    mediaMetadata = mediaMetadata4 == null ? new MediaMetadata(i2) : mediaMetadata4;
                    sb = new StringBuilder();
                    sb2 = new StringBuilder();
                    str = builder.title;
                    if (str != null) {
                        sb.append(str);
                    }
                    str2 = builder.subtitle;
                    if (str2 != null) {
                        sb2.append(str2);
                    }
                    i = builder.width;
                    if (i != 0) {
                        MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.WIDTH");
                        Bundle bundle3 = mediaMetadata.zza;
                        bundle3.putInt("com.google.android.gms.cast.metadata.WIDTH", i);
                        int i5 = builder.height;
                        MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.HEIGHT");
                        bundle3.putInt("com.google.android.gms.cast.metadata.HEIGHT", i5);
                        if (sb2.length() > 0) {
                            sb2.append(' ');
                        }
                        sb2.append("(");
                        sb2.append(builder.width);
                        sb2.append("x");
                        sb2.append(builder.height);
                        sb2.append(")");
                    }
                    if (sb.length() > 0) {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.TITLE", sb.toString());
                    } else {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.TITLE", "No Title");
                    }
                    if (sb2.length() > 0) {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.SUBTITLE", sb2.toString());
                    }
                    break;
                } else {
                    mediaMetadata = null;
                    break;
                }
                break;
        }
        this.mediaMetadata = mediaMetadata;
        this.internalUri = builder.internalUri;
        this.externalPath = builder.externalPath;
        this.width = builder.width;
        this.height = builder.height;
    }
}
