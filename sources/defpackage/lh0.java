package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.LocaleList;
import android.os.UserManager;
import android.view.PointerIcon;
import android.view.View;
import j$.util.stream.IntStream;
import java.io.File;
import java.util.Locale;
public abstract class lh0 {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static IntStream b(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.chars());
        return convert;
    }

    public static IntStream c(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        return convert;
    }

    public static Context d(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList e(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static String f(long j, Locale locale) {
        boolean z;
        RelativeDateTimeFormatter.RelativeUnit relativeUnit;
        RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(locale);
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        long max = Math.max(1L, Math.round(Math.abs(j) / 1000.0d));
        if (max < 60) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
        } else if (max < 3600) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MINUTES;
            max = Math.round(max / 60.0d);
        } else if (max < 86400) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.HOURS;
            max = Math.round(max / 3600.0d);
        } else if (max < 2592000) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.DAYS;
            max = Math.round(max / 86400.0d);
        } else if (max < 31536000) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
            max = Math.round(max / 2592000.0d);
        } else {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
            max = Math.round(max / 3.1536E7d);
        }
        return relativeDateTimeFormatter.format(max, z ? RelativeDateTimeFormatter.Direction.NEXT : RelativeDateTimeFormatter.Direction.LAST, relativeUnit);
    }

    public static File g(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }

    public static DecimalFormatSymbols h(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList i(Configuration configuration) {
        return configuration.getLocales();
    }

    public static boolean j(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void k(View view, String str) {
        str.getClass();
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1445472863:
                if (str.equals("col-resize")) {
                    c = 0;
                    break;
                }
                break;
            case -1420126065:
                if (str.equals("se-resize")) {
                    c = 1;
                    break;
                }
                break;
            case -1215869197:
                if (str.equals("n-resize")) {
                    c = 2;
                    break;
                }
                break;
            case -1158137564:
                if (str.equals("vertical-text")) {
                    c = 3;
                    break;
                }
                break;
            case -1091752114:
                if (str.equals("s-resize")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -972788342:
                if (str.equals("ne-resize")) {
                    c = 6;
                    break;
                }
                break;
            case -579752401:
                if (str.equals("ew-resize")) {
                    c = 7;
                    break;
                }
                break;
            case -400605635:
                if (str.equals("pointer")) {
                    c = '\b';
                    break;
                }
                break;
            case -114311107:
                if (str.equals("sw-resize")) {
                    c = '\t';
                    break;
                }
                break;
            case -110060193:
                if (str.equals("zoom-in")) {
                    c = '\n';
                    break;
                }
                break;
            case 3049826:
                if (str.equals("cell")) {
                    c = 11;
                    break;
                }
                break;
            case 3059573:
                if (str.equals("copy")) {
                    c = '\f';
                    break;
                }
                break;
            case 3181132:
                if (str.equals("grab")) {
                    c = '\r';
                    break;
                }
                break;
            case 3198785:
                if (str.equals("help")) {
                    c = 14;
                    break;
                }
                break;
            case 3357649:
                if (str.equals("move")) {
                    c = 15;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 16;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 17;
                    break;
                }
                break;
            case 3641717:
                if (str.equals("wait")) {
                    c = 18;
                    break;
                }
                break;
            case 87599244:
                if (str.equals("grabbing")) {
                    c = 19;
                    break;
                }
                break;
            case 92902992:
                if (str.equals("alias")) {
                    c = 20;
                    break;
                }
                break;
            case 101707897:
                if (str.equals("all-scroll")) {
                    c = 21;
                    break;
                }
                break;
            case 278706972:
                if (str.equals("e-resize")) {
                    c = 22;
                    break;
                }
                break;
            case 333026616:
                if (str.equals("nw-resize")) {
                    c = 23;
                    break;
                }
                break;
            case 560073902:
                if (str.equals("not-allowed")) {
                    c = 24;
                    break;
                }
                break;
            case 868416742:
                if (str.equals("nwse-resize")) {
                    c = 25;
                    break;
                }
                break;
            case 883107412:
                if (str.equals("zoom-out")) {
                    c = 26;
                    break;
                }
                break;
            case 1070544573:
                if (str.equals("context-menu")) {
                    c = 27;
                    break;
                }
                break;
            case 1397962786:
                if (str.equals("crosshair")) {
                    c = 28;
                    break;
                }
                break;
            case 1416507494:
                if (str.equals("nesw-resize")) {
                    c = 29;
                    break;
                }
                break;
            case 1584521930:
                if (str.equals("w-resize")) {
                    c = 30;
                    break;
                }
                break;
            case 1892836359:
                if (str.equals("row-resize")) {
                    c = 31;
                    break;
                }
                break;
            case 1951719868:
                if (str.equals("ns-resize")) {
                    c = ' ';
                    break;
                }
                break;
            case 2063643515:
                if (str.equals("no-drop")) {
                    c = '!';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 7:
            case 22:
            case 30:
                i = 1014;
                break;
            case 1:
            case 23:
            case 25:
                i = 1017;
                break;
            case 2:
            case 4:
            case 31:
            case ' ':
                i = 1015;
                break;
            case 3:
                i = 1009;
                break;
            case 5:
            case 18:
                i = 1004;
                break;
            case 6:
            case '\t':
            case 29:
                i = 1016;
                break;
            case '\b':
                i = 1002;
                break;
            case '\n':
                i = 1018;
                break;
            case 11:
                i = 1006;
                break;
            case '\f':
                i = 1011;
                break;
            case '\r':
                i = 1020;
                break;
            case 14:
                i = 1003;
                break;
            case 15:
            case 21:
                i = 1013;
                break;
            case 16:
                break;
            case 17:
                i = 1008;
                break;
            case 19:
                i = 1021;
                break;
            case 20:
                i = 1010;
                break;
            case 24:
            case '!':
                i = 1012;
                break;
            case 26:
                i = 1019;
                break;
            case 27:
                i = 1001;
                break;
            case 28:
                i = 1007;
                break;
            default:
                view.setPointerIcon(null);
                return;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i));
    }

    public static void l(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void m(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
