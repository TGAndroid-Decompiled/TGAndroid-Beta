package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
public abstract class n26 {
    public static final int a = 0;

    static {
        bp5.s("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
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
                lq5.j(uh9.k(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static pt6 b(nt6 nt6Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        ot6 ot6Var = new ot6();
        ot6Var.k("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = nt6Var.a;
        Bundle bundle = nt6Var.K;
        Integer num = nt6Var.q;
        Uri uri2 = nt6Var.n;
        if (charSequence != null) {
            ot6Var.l(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = nt6Var.e;
        if (charSequence2 != null) {
            ot6Var.l(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = nt6Var.f;
        if (charSequence3 != null) {
            ot6Var.l(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = nt6Var.g;
        if (charSequence4 != null) {
            ot6Var.l(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = nt6Var.b;
        if (charSequence5 != null) {
            ot6Var.l(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = nt6Var.c;
        if (charSequence6 != null) {
            ot6Var.l(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = nt6Var.d;
        if (charSequence7 != null) {
            ot6Var.l(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = nt6Var.u;
        if (num2 != null) {
            ot6Var.i(num2.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = nt6Var.A;
        if (charSequence8 != null) {
            ot6Var.l(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = nt6Var.B;
        if (charSequence9 != null) {
            ot6Var.l(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            ot6Var.k("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            ot6Var.k("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            ot6Var.k("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            ot6Var.k("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            ot6Var.h("android.media.metadata.DISPLAY_ICON", bitmap);
            ot6Var.h("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            ot6Var.i(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j == -9223372036854775807L && (l = nt6Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        ot6Var.i(j, "android.media.metadata.DURATION");
        u29 d = d(nt6Var.i);
        if (d != null) {
            ot6Var.j("android.media.metadata.USER_RATING", d);
        }
        u29 d2 = d(nt6Var.j);
        if (d2 != null) {
            ot6Var.j("android.media.metadata.RATING", d2);
        }
        Integer num3 = nt6Var.J;
        if (num3 != null) {
            ot6Var.i(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null && !(obj instanceof CharSequence)) {
                    if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                        ot6Var.i(((Number) obj).longValue(), str2);
                    }
                } else {
                    ot6Var.l((CharSequence) obj, str2);
                }
            }
        }
        return new pt6(ot6Var.a);
    }

    public static s29 c(u29 u29Var) {
        if (u29Var != null) {
            float f = u29Var.b;
            int i = u29Var.a;
            boolean z = true;
            switch (i) {
                case 1:
                    if (u29Var.b()) {
                        if (i != 1 || f != 1.0f) {
                            z = false;
                        }
                        return new vf5(z);
                    }
                    return new vf5();
                case 2:
                    if (u29Var.b()) {
                        if (i != 2 || f != 1.0f) {
                            z = false;
                        }
                        return new krb(z);
                    }
                    return new krb();
                case 3:
                    if (u29Var.b()) {
                        return new fva(3, u29Var.a());
                    }
                    return new fva(3);
                case 4:
                    if (u29Var.b()) {
                        return new fva(4, u29Var.a());
                    }
                    return new fva(4);
                case 5:
                    if (u29Var.b()) {
                        return new fva(5, u29Var.a());
                    }
                    return new fva(5);
                case 6:
                    if (u29Var.b()) {
                        return new u68((i == 6 && u29Var.b()) ? -1.0f : -1.0f);
                    }
                    return new u68();
                default:
                    return null;
            }
        }
        return null;
    }

    public static u29 d(s29 s29Var) {
        if (s29Var != null) {
            int e = e(s29Var);
            if (!s29Var.b()) {
                switch (e) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new u29(e, -1.0f);
                    default:
                        return null;
                }
            }
            float f = 0.0f;
            switch (e) {
                case 1:
                    if (((vf5) s29Var).c) {
                        f = 1.0f;
                    }
                    return new u29(1, f);
                case 2:
                    if (((krb) s29Var).c) {
                        f = 1.0f;
                    }
                    return new u29(2, f);
                case 3:
                case 4:
                case 5:
                    return u29.d(((fva) s29Var).c, e);
                case 6:
                    return u29.c(((u68) s29Var).b);
            }
        }
        return null;
    }

    public static int e(s29 s29Var) {
        if (s29Var instanceof vf5) {
            return 1;
        }
        if (s29Var instanceof krb) {
            return 2;
        }
        if (s29Var instanceof fva) {
            int i = ((fva) s29Var).b;
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
        } else if (s29Var instanceof u68) {
            return 6;
        } else {
            return 0;
        }
    }
}
