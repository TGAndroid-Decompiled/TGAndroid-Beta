package m4;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
public abstract class k {
    public static final int f15994a = 0;

    static {
        int i10 = e9.m0.f9003c;
        Object[] objArr = new Object[32];
        objArr[0] = "android.media.metadata.TITLE";
        objArr[1] = "android.media.metadata.ARTIST";
        objArr[2] = "android.media.metadata.DURATION";
        objArr[3] = "android.media.metadata.ALBUM";
        objArr[4] = "android.media.metadata.AUTHOR";
        objArr[5] = "android.media.metadata.WRITER";
        System.arraycopy(new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"}, 0, objArr, 6, 26);
        e9.m0.u(32, objArr);
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
                throw new IllegalArgumentException(i2.g.i(i10, "Unrecognized FolderType: "));
        }
    }

    public static n4.m b(b2.n0 n0Var, String str, Uri uri, long j3, Bitmap bitmap) {
        Long l4;
        bb.a aVar = new bb.a();
        aVar.e("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = n0Var.f2223a;
        Bundle bundle = n0Var.I;
        Integer num = n0Var.f2236p;
        Uri uri2 = n0Var.f2233m;
        if (charSequence != null) {
            aVar.f(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = n0Var.f2226e;
        if (charSequence2 != null) {
            aVar.f(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = n0Var.f2227f;
        if (charSequence3 != null) {
            aVar.f(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = n0Var.f2228g;
        if (charSequence4 != null) {
            aVar.f(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = n0Var.f2224b;
        if (charSequence5 != null) {
            aVar.f(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = n0Var.f2225c;
        if (charSequence6 != null) {
            aVar.f(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = n0Var.d;
        if (charSequence7 != null) {
            aVar.f(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = n0Var.f2240t;
        if (num2 != null) {
            aVar.c(num2.intValue(), "android.media.metadata.YEAR");
        }
        if (uri != null) {
            aVar.e("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            aVar.e("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            aVar.e("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            aVar.e("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            aVar.b("android.media.metadata.DISPLAY_ICON", bitmap);
            aVar.b("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            aVar.c(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j3 == -9223372036854775807L && (l4 = n0Var.h) != null) {
            j3 = l4.longValue();
        }
        if (j3 == -9223372036854775807L) {
            j3 = -1;
        }
        aVar.c(j3, "android.media.metadata.DURATION");
        n4.i0 d = d(n0Var.f2229i);
        if (d != null) {
            aVar.d("android.media.metadata.USER_RATING", d);
        }
        n4.i0 d10 = d(n0Var.f2230j);
        if (d10 != null) {
            aVar.d("android.media.metadata.RATING", d10);
        }
        Integer num3 = n0Var.H;
        if (num3 != null) {
            aVar.c(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null && !(obj instanceof CharSequence)) {
                    if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                        aVar.c(((Number) obj).longValue(), str2);
                    }
                } else {
                    aVar.f((CharSequence) obj, str2);
                }
            }
        }
        return new n4.m(aVar.f2558a);
    }

    public static b2.c1 c(n4.i0 i0Var) {
        if (i0Var != null) {
            float f7 = i0Var.f16480b;
            int i10 = i0Var.f16479a;
            boolean z10 = true;
            switch (i10) {
                case 1:
                    if (i0Var.b()) {
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        return new b2.u(z10);
                    }
                    return new b2.u();
                case 2:
                    if (i0Var.b()) {
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        return new b2.f1(z10);
                    }
                    return new b2.f1();
                case 3:
                    if (i0Var.b()) {
                        return new b2.d1(3, i0Var.a());
                    }
                    return new b2.d1(3);
                case 4:
                    if (i0Var.b()) {
                        return new b2.d1(4, i0Var.a());
                    }
                    return new b2.d1(4);
                case 5:
                    if (i0Var.b()) {
                        return new b2.d1(5, i0Var.a());
                    }
                    return new b2.d1(5);
                case 6:
                    if (i0Var.b()) {
                        return new b2.t0((i10 == 6 && i0Var.b()) ? -1.0f : -1.0f);
                    }
                    return new b2.t0();
                default:
                    return null;
            }
        }
        return null;
    }

    public static n4.i0 d(b2.c1 c1Var) {
        if (c1Var != null) {
            int f7 = f(c1Var);
            if (!c1Var.b()) {
                switch (f7) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new n4.i0(f7, -1.0f);
                    default:
                        return null;
                }
            }
            float f10 = 0.0f;
            switch (f7) {
                case 1:
                    if (((b2.u) c1Var).f2417c) {
                        f10 = 1.0f;
                    }
                    return new n4.i0(1, f10);
                case 2:
                    if (((b2.f1) c1Var).f2067c) {
                        f10 = 1.0f;
                    }
                    return new n4.i0(2, f10);
                case 3:
                case 4:
                case 5:
                    return n4.i0.d(((b2.d1) c1Var).f2024c, f7);
                case 6:
                    return n4.i0.c(((b2.t0) c1Var).f2413b);
            }
        }
        return null;
    }

    public static int e(b2.e eVar) {
        mg.n nVar;
        if (Build.VERSION.SDK_INT >= 26) {
            nVar = new mg.n(1);
        } else {
            nVar = new mg.n(1);
        }
        AudioAttributes.Builder builder = (AudioAttributes.Builder) nVar.f16319b;
        builder.setContentType(eVar.f2031a);
        builder.setFlags(eVar.f2032b);
        nVar.z(eVar.f2033c);
        AudioAttributes audioAttributes = nVar.d().f16451a;
        audioAttributes.getClass();
        int flags = audioAttributes.getFlags();
        int usage = audioAttributes.getUsage();
        if ((flags & 1) == 1) {
            return 7;
        }
        if ((flags & 4) == 4) {
            return 6;
        }
        switch (usage) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int f(b2.c1 c1Var) {
        if (c1Var instanceof b2.u) {
            return 1;
        }
        if (c1Var instanceof b2.f1) {
            return 2;
        }
        if (c1Var instanceof b2.d1) {
            int i10 = ((b2.d1) c1Var).f2023b;
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
        } else if (c1Var instanceof b2.t0) {
            return 6;
        } else {
            return 0;
        }
    }
}
