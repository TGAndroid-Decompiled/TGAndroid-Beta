package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
public abstract class j26 {
    public static final int a = 0;

    static {
        yo5.s("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static long a(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                u36.j(hg9.j(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static lt6 b(jt6 jt6Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        fk3 fk3Var = new fk3((byte) 19);
        fk3Var.i0("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = jt6Var.a;
        Bundle bundle = jt6Var.K;
        Integer num = jt6Var.q;
        Uri uri2 = jt6Var.n;
        if (charSequence != null) {
            fk3Var.k0(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = jt6Var.e;
        if (charSequence2 != null) {
            fk3Var.k0(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = jt6Var.f;
        if (charSequence3 != null) {
            fk3Var.k0(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = jt6Var.g;
        if (charSequence4 != null) {
            fk3Var.k0(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = jt6Var.b;
        if (charSequence5 != null) {
            fk3Var.k0(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = jt6Var.c;
        if (charSequence6 != null) {
            fk3Var.k0(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = jt6Var.d;
        if (charSequence7 != null) {
            fk3Var.k0(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = jt6Var.u;
        if (num2 != null) {
            fk3Var.e0(num2.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = jt6Var.A;
        if (charSequence8 != null) {
            fk3Var.k0(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = jt6Var.B;
        if (charSequence9 != null) {
            fk3Var.k0(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            fk3Var.i0("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            fk3Var.i0("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            fk3Var.i0("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            fk3Var.i0("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            fk3Var.a0("android.media.metadata.DISPLAY_ICON", bitmap);
            fk3Var.a0("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            fk3Var.e0(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j == -9223372036854775807L && (l = jt6Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        fk3Var.e0(j, "android.media.metadata.DURATION");
        i19 d = d(jt6Var.i);
        if (d != null) {
            fk3Var.h0("android.media.metadata.USER_RATING", d);
        }
        i19 d2 = d(jt6Var.j);
        if (d2 != null) {
            fk3Var.h0("android.media.metadata.RATING", d2);
        }
        Integer num3 = jt6Var.J;
        if (num3 != null) {
            fk3Var.e0(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null && !(obj instanceof CharSequence)) {
                    if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                        fk3Var.e0(((Number) obj).longValue(), str2);
                    }
                } else {
                    fk3Var.k0((CharSequence) obj, str2);
                }
            }
        }
        return new lt6((Bundle) fk3Var.a);
    }

    public static g19 c(i19 i19Var) {
        if (i19Var != null) {
            float f = i19Var.b;
            int i = i19Var.a;
            boolean z = true;
            switch (i) {
                case 1:
                    if (i19Var.b()) {
                        if (i != 1 || f != 1.0f) {
                            z = false;
                        }
                        return new sf5(z);
                    }
                    return new sf5();
                case 2:
                    if (i19Var.b()) {
                        if (i != 2 || f != 1.0f) {
                            z = false;
                        }
                        return new lpb(z);
                    }
                    return new lpb();
                case 3:
                    if (i19Var.b()) {
                        return new eta(3, i19Var.a());
                    }
                    return new eta(3);
                case 4:
                    if (i19Var.b()) {
                        return new eta(4, i19Var.a());
                    }
                    return new eta(4);
                case 5:
                    if (i19Var.b()) {
                        return new eta(5, i19Var.a());
                    }
                    return new eta(5);
                case 6:
                    if (i19Var.b()) {
                        return new g58((i == 6 && i19Var.b()) ? -1.0f : -1.0f);
                    }
                    return new g58();
                default:
                    return null;
            }
        }
        return null;
    }

    public static i19 d(g19 g19Var) {
        if (g19Var != null) {
            int e = e(g19Var);
            if (!g19Var.b()) {
                switch (e) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new i19(e, -1.0f);
                    default:
                        return null;
                }
            }
            float f = 0.0f;
            switch (e) {
                case 1:
                    if (((sf5) g19Var).c) {
                        f = 1.0f;
                    }
                    return new i19(1, f);
                case 2:
                    if (((lpb) g19Var).c) {
                        f = 1.0f;
                    }
                    return new i19(2, f);
                case 3:
                case 4:
                case 5:
                    return i19.d(((eta) g19Var).c, e);
                case 6:
                    return i19.c(((g58) g19Var).b);
            }
        }
        return null;
    }

    public static int e(g19 g19Var) {
        if (g19Var instanceof sf5) {
            return 1;
        }
        if (g19Var instanceof lpb) {
            return 2;
        }
        if (g19Var instanceof eta) {
            int i = ((eta) g19Var).b;
            int i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5) {
                        return 0;
                    }
                }
            }
            return i2;
        } else if (g19Var instanceof g58) {
            return 6;
        } else {
            return 0;
        }
    }
}
