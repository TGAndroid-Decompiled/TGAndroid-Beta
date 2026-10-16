package m4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
public abstract class n {
    public static final int f15285a = 0;

    static {
        e9.y0.w("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static long a(int i10) {
        switch (i10) {
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
                throw new IllegalArgumentException(i2.d.j(i10, "Unrecognized FolderType: "));
        }
    }

    public static n4.i b(b2.s0 s0Var, String str, Uri uri, long j10, Bitmap bitmap) {
        Long l4;
        ?? obj = new Object();
        obj.f15753a = new Bundle();
        obj.f("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = s0Var.f2347a;
        Bundle bundle = s0Var.J;
        Integer num = s0Var.f2360q;
        Uri uri2 = s0Var.f2357n;
        if (charSequence != null) {
            obj.g(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = s0Var.e;
        if (charSequence2 != null) {
            obj.g(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = s0Var.f2350f;
        if (charSequence3 != null) {
            obj.g(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = s0Var.f2351g;
        if (charSequence4 != null) {
            obj.g(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = s0Var.f2348b;
        if (charSequence5 != null) {
            obj.g(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = s0Var.f2349c;
        if (charSequence6 != null) {
            obj.g(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = s0Var.d;
        if (charSequence7 != null) {
            obj.g(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = s0Var.f2364u;
        if (num2 != null) {
            obj.d(num2.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = s0Var.A;
        if (charSequence8 != null) {
            obj.g(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = s0Var.B;
        if (charSequence9 != null) {
            obj.g(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            obj.f("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            obj.f("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            obj.f("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            obj.f("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            obj.c("android.media.metadata.DISPLAY_ICON", bitmap);
            obj.c("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            obj.d(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j10 == -9223372036854775807L && (l4 = s0Var.h) != null) {
            j10 = l4.longValue();
        }
        if (j10 == -9223372036854775807L) {
            j10 = -1;
        }
        obj.d(j10, "android.media.metadata.DURATION");
        n4.z d = d(s0Var.f2352i);
        if (d != null) {
            obj.e("android.media.metadata.USER_RATING", d);
        }
        n4.z d10 = d(s0Var.f2353j);
        if (d10 != null) {
            obj.e("android.media.metadata.RATING", d10);
        }
        Integer num3 = s0Var.I;
        if (num3 != null) {
            obj.d(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (obj2 != null && !(obj2 instanceof CharSequence)) {
                    if ((obj2 instanceof Byte) || (obj2 instanceof Short) || (obj2 instanceof Integer) || (obj2 instanceof Long)) {
                        obj.d(((Number) obj2).longValue(), str2);
                    }
                } else {
                    obj.g((CharSequence) obj2, str2);
                }
            }
        }
        return new n4.i((Bundle) obj.f15753a);
    }

    public static b2.h1 c(n4.z zVar) {
        if (zVar != null) {
            float f7 = zVar.f15766b;
            int i10 = zVar.f15765a;
            boolean z10 = true;
            switch (i10) {
                case 1:
                    if (zVar.b()) {
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        return new b2.z(z10);
                    }
                    return new b2.z();
                case 2:
                    if (zVar.b()) {
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        return new b2.k1(z10);
                    }
                    return new b2.k1();
                case 3:
                    if (zVar.b()) {
                        return new b2.i1(3, zVar.a());
                    }
                    return new b2.i1(3);
                case 4:
                    if (zVar.b()) {
                        return new b2.i1(4, zVar.a());
                    }
                    return new b2.i1(4);
                case 5:
                    if (zVar.b()) {
                        return new b2.i1(5, zVar.a());
                    }
                    return new b2.i1(5);
                case 6:
                    if (zVar.b()) {
                        return new b2.y0((i10 == 6 && zVar.b()) ? -1.0f : -1.0f);
                    }
                    return new b2.y0();
                default:
                    return null;
            }
        }
        return null;
    }

    public static n4.z d(b2.h1 h1Var) {
        if (h1Var != null) {
            int e = e(h1Var);
            if (!h1Var.b()) {
                switch (e) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new n4.z(e, -1.0f);
                    default:
                        return null;
                }
            }
            float f7 = 0.0f;
            switch (e) {
                case 1:
                    if (((b2.z) h1Var).f2538c) {
                        f7 = 1.0f;
                    }
                    return new n4.z(1, f7);
                case 2:
                    if (((b2.k1) h1Var).f2198c) {
                        f7 = 1.0f;
                    }
                    return new n4.z(2, f7);
                case 3:
                case 4:
                case 5:
                    return n4.z.d(((b2.i1) h1Var).f2169c, e);
                case 6:
                    return n4.z.c(((b2.y0) h1Var).f2536b);
            }
        }
        return null;
    }

    public static int e(b2.h1 h1Var) {
        if (h1Var instanceof b2.z) {
            return 1;
        }
        if (h1Var instanceof b2.k1) {
            return 2;
        }
        if (h1Var instanceof b2.i1) {
            int i10 = ((b2.i1) h1Var).f2168b;
            int i11 = 3;
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    i11 = 5;
                    if (i10 != 5) {
                        return 0;
                    }
                }
            }
            return i11;
        } else if (h1Var instanceof b2.y0) {
            return 6;
        } else {
            return 0;
        }
    }
}
