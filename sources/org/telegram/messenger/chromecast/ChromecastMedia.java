package org.telegram.messenger.chromecast;

import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaMetadata;

public final class ChromecastMedia {
    public final String externalPath;
    public final int height;
    public final Uri internalUri;
    public final MediaMetadata mediaMetadata;
    public final String mimeType;
    public final int width;

    public ChromecastMedia(RecyclerView.Recycler recycler) {
        MediaMetadata mediaMetadata;
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        String str2;
        int i;
        int i2 = 3;
        String str3 = (String) recycler.mAttachedScrap;
        this.mimeType = str3;
        str3.getClass();
        switch (str3) {
            case "image/jpeg":
            case "image/png":
                i2 = 4;
                MediaMetadata mediaMetadata2 = (MediaMetadata) recycler.mUnmodifiableAttachedScrap;
                mediaMetadata = mediaMetadata2 == null ? new MediaMetadata(i2) : mediaMetadata2;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str = (String) recycler.mRecyclerPool;
                if (str != null) {
                    sb.append(str);
                }
                str2 = (String) recycler.this$0;
                if (str2 != null) {
                    sb2.append(str2);
                }
                i = recycler.mRequestedCacheMax;
                if (i != 0 && recycler.mViewCacheMax != 0) {
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.WIDTH");
                    Bundle bundle = mediaMetadata.zza;
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i);
                    int i3 = recycler.mViewCacheMax;
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i3);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(recycler.mRequestedCacheMax);
                    sb2.append("x");
                    sb2.append(recycler.mViewCacheMax);
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
                MediaMetadata mediaMetadata3 = (MediaMetadata) recycler.mUnmodifiableAttachedScrap;
                mediaMetadata = mediaMetadata3 == null ? new MediaMetadata(i2) : mediaMetadata3;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str = (String) recycler.mRecyclerPool;
                if (str != null) {
                    sb.append(str);
                }
                str2 = (String) recycler.this$0;
                if (str2 != null) {
                    sb2.append(str2);
                }
                i = recycler.mRequestedCacheMax;
                if (i != 0) {
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.WIDTH");
                    Bundle bundle2 = mediaMetadata.zza;
                    bundle2.putInt("com.google.android.gms.cast.metadata.WIDTH", i);
                    int i4 = recycler.mViewCacheMax;
                    MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle2.putInt("com.google.android.gms.cast.metadata.HEIGHT", i4);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(recycler.mRequestedCacheMax);
                    sb2.append("x");
                    sb2.append(recycler.mViewCacheMax);
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
                    MediaMetadata mediaMetadata4 = (MediaMetadata) recycler.mUnmodifiableAttachedScrap;
                    mediaMetadata = mediaMetadata4 == null ? new MediaMetadata(i2) : mediaMetadata4;
                    sb = new StringBuilder();
                    sb2 = new StringBuilder();
                    str = (String) recycler.mRecyclerPool;
                    if (str != null) {
                        sb.append(str);
                    }
                    str2 = (String) recycler.this$0;
                    if (str2 != null) {
                        sb2.append(str2);
                    }
                    i = recycler.mRequestedCacheMax;
                    if (i != 0) {
                        MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.WIDTH");
                        Bundle bundle3 = mediaMetadata.zza;
                        bundle3.putInt("com.google.android.gms.cast.metadata.WIDTH", i);
                        int i5 = recycler.mViewCacheMax;
                        MediaMetadata.throwIfWrongType(2, "com.google.android.gms.cast.metadata.HEIGHT");
                        bundle3.putInt("com.google.android.gms.cast.metadata.HEIGHT", i5);
                        if (sb2.length() > 0) {
                            sb2.append(' ');
                        }
                        sb2.append("(");
                        sb2.append(recycler.mRequestedCacheMax);
                        sb2.append("x");
                        sb2.append(recycler.mViewCacheMax);
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
        this.internalUri = (Uri) recycler.mChangedScrap;
        this.externalPath = (String) recycler.mCachedViews;
        this.width = recycler.mRequestedCacheMax;
        this.height = recycler.mViewCacheMax;
    }
}
