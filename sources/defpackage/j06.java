package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
public abstract class j06 {
    public static final int a = 0;

    static {
        ym5.s("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
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
                w26.j(de9.k(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static kr6 b(jr6 jr6Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        s34 s34Var = new s34((byte) 16);
        s34Var.V("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = jr6Var.a;
        Bundle bundle = jr6Var.K;
        Integer num = jr6Var.q;
        Uri uri2 = jr6Var.n;
        if (charSequence != null) {
            s34Var.X(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = jr6Var.e;
        if (charSequence2 != null) {
            s34Var.X(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = jr6Var.f;
        if (charSequence3 != null) {
            s34Var.X(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = jr6Var.g;
        if (charSequence4 != null) {
            s34Var.X(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = jr6Var.b;
        if (charSequence5 != null) {
            s34Var.X(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = jr6Var.c;
        if (charSequence6 != null) {
            s34Var.X(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = jr6Var.d;
        if (charSequence7 != null) {
            s34Var.X(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = jr6Var.u;
        if (num2 != null) {
            s34Var.S(num2.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = jr6Var.A;
        if (charSequence8 != null) {
            s34Var.X(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = jr6Var.B;
        if (charSequence9 != null) {
            s34Var.X(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            s34Var.V("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            s34Var.V("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            s34Var.V("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            s34Var.V("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            s34Var.Q("android.media.metadata.DISPLAY_ICON", bitmap);
            s34Var.Q("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            s34Var.S(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j == -9223372036854775807L && (l = jr6Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        s34Var.S(j, "android.media.metadata.DURATION");
        hz8 d = d(jr6Var.i);
        if (d != null) {
            s34Var.U("android.media.metadata.USER_RATING", d);
        }
        hz8 d2 = d(jr6Var.j);
        if (d2 != null) {
            s34Var.U("android.media.metadata.RATING", d2);
        }
        Integer num3 = jr6Var.J;
        if (num3 != null) {
            s34Var.S(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null && !(obj instanceof CharSequence)) {
                    if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                        s34Var.S(((Number) obj).longValue(), str2);
                    }
                } else {
                    s34Var.X((CharSequence) obj, str2);
                }
            }
        }
        return new kr6((Bundle) s34Var.b);
    }

    public static fz8 c(hz8 hz8Var) {
        if (hz8Var != null) {
            float f = hz8Var.b;
            int i = hz8Var.a;
            boolean z = true;
            switch (i) {
                case 1:
                    if (hz8Var.b()) {
                        if (i != 1 || f != 1.0f) {
                            z = false;
                        }
                        return new ud5(z);
                    }
                    return new ud5();
                case 2:
                    if (hz8Var.b()) {
                        if (i != 2 || f != 1.0f) {
                            z = false;
                        }
                        return new knb(z);
                    }
                    return new knb();
                case 3:
                    if (hz8Var.b()) {
                        return new dra(3, hz8Var.a());
                    }
                    return new dra(3);
                case 4:
                    if (hz8Var.b()) {
                        return new dra(4, hz8Var.a());
                    }
                    return new dra(4);
                case 5:
                    if (hz8Var.b()) {
                        return new dra(5, hz8Var.a());
                    }
                    return new dra(5);
                case 6:
                    if (hz8Var.b()) {
                        return new e38((i == 6 && hz8Var.b()) ? -1.0f : -1.0f);
                    }
                    return new e38();
                default:
                    return null;
            }
        }
        return null;
    }

    public static hz8 d(fz8 fz8Var) {
        if (fz8Var != null) {
            int e = e(fz8Var);
            if (!fz8Var.b()) {
                switch (e) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new hz8(e, -1.0f);
                    default:
                        return null;
                }
            }
            float f = 0.0f;
            switch (e) {
                case 1:
                    if (((ud5) fz8Var).c) {
                        f = 1.0f;
                    }
                    return new hz8(1, f);
                case 2:
                    if (((knb) fz8Var).c) {
                        f = 1.0f;
                    }
                    return new hz8(2, f);
                case 3:
                case 4:
                case 5:
                    return hz8.d(((dra) fz8Var).c, e);
                case 6:
                    return hz8.c(((e38) fz8Var).b);
            }
        }
        return null;
    }

    public static int e(fz8 fz8Var) {
        if (fz8Var instanceof ud5) {
            return 1;
        }
        if (fz8Var instanceof knb) {
            return 2;
        }
        if (fz8Var instanceof dra) {
            int i = ((dra) fz8Var).b;
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
        } else if (fz8Var instanceof e38) {
            return 6;
        } else {
            return 0;
        }
    }
}
