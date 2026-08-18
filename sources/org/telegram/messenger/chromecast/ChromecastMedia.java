package org.telegram.messenger.chromecast;

import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;

public class ChromecastMedia {
    public final String externalPath;
    public final int height;
    public final Uri internalUri;
    public final MediaMetadata mediaMetadata;
    public final String mimeType;
    public final int width;

    private ChromecastMedia(Builder builder) {
        this.mimeType = builder.mimeType;
        this.mediaMetadata = builder.buildMetadata();
        this.internalUri = builder.internalUri;
        this.externalPath = builder.externalPath;
        this.width = builder.width;
        this.height = builder.height;
    }

    public String getExternalUri(String str) {
        return ChromecastFileServer.getUrlToSource(str, this.externalPath);
    }

    public MediaInfo buildMediaInfo(String str, String str2) {
        return new MediaInfo.Builder(getExternalUri(str) + str2).setContentType(this.mimeType).setMetadata(this.mediaMetadata).setStreamType(1).build();
    }

    public static class Builder {
        private MediaMetadata baseMetadata;
        private final String externalPath;
        private int height;
        private final Uri internalUri;
        private final String mimeType;
        private String subtitle;
        private String title;
        private int width;

        private Builder(String str, Uri uri, String str2) {
            this.mimeType = str;
            this.internalUri = uri;
            this.externalPath = str2;
        }

        public static Builder fromUri(Uri uri, String str, String str2) {
            return new Builder(str2, uri, str);
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setSubtitle(String str) {
            this.subtitle = str;
            return this;
        }

        public Builder setSize(int i, int i2) {
            this.width = i;
            this.height = i2;
            return this;
        }

        public Builder setMetadata(MediaMetadata mediaMetadata) {
            this.baseMetadata = mediaMetadata;
            return this;
        }

        public ChromecastMedia build() {
            return new ChromecastMedia(this);
        }

        public MediaMetadata buildMetadata() {
            int i = 3;
            String str = this.mimeType;
            str.hashCode();
            switch (str) {
                case "image/jpeg":
                case "image/png":
                    i = 4;
                    break;
                case "application/x-mpegURL":
                case "video/mp4":
                    i = 1;
                    break;
                default:
                    if (!this.mimeType.startsWith("audio/")) {
                        return null;
                    }
                    break;
            }
            MediaMetadata mediaMetadata = this.baseMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = new MediaMetadata(i);
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.title;
            if (str2 != null) {
                sb.append(str2);
            }
            String str3 = this.subtitle;
            if (str3 != null) {
                sb2.append(str3);
            }
            int i2 = this.width;
            if (i2 != 0 && this.height != 0) {
                mediaMetadata.putInt("com.google.android.gms.cast.metadata.WIDTH", i2);
                mediaMetadata.putInt("com.google.android.gms.cast.metadata.HEIGHT", this.height);
                if (sb2.length() > 0) {
                    sb2.append(' ');
                }
                sb2.append("(");
                sb2.append(this.width);
                sb2.append("x");
                sb2.append(this.height);
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
            return mediaMetadata;
        }
    }
}
