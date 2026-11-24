package defpackage;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.MenuItem;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import org.json.JSONObject;
public abstract class i00 {
    public static AudioManager a;

    public static void a(AudioManager audioManager, f00 f00Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = f00Var.f;
            obj.getClass();
            audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
            return;
        }
        audioManager.abandonAudioFocus(f00Var.b);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static DateFormat c(JSONObject jSONObject, String str, Locale locale) {
        boolean z;
        int i;
        boolean z2;
        DateFormat dateFormat;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String optString = jSONObject.optString("dateStyle");
        optString.getClass();
        int i2 = 2;
        boolean z3 = true;
        switch (optString.hashCode()) {
            case -1078030475:
                if (optString.equals("medium")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case 3154575:
                if (optString.equals("full")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 3327612:
                if (optString.equals("long")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 109413500:
                if (optString.equals("short")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        switch (z) {
            case false:
                i = 2;
                break;
            case true:
                i = 0;
                break;
            case true:
                i = 1;
                break;
            case true:
                i = 3;
                break;
            default:
                i = -1;
                break;
        }
        String optString2 = jSONObject.optString("timeStyle");
        optString2.getClass();
        switch (optString2.hashCode()) {
            case -1078030475:
                if (optString2.equals("medium")) {
                    z2 = false;
                    break;
                }
                z2 = true;
                break;
            case 3154575:
                if (optString2.equals("full")) {
                    z2 = true;
                    break;
                }
                z2 = true;
                break;
            case 3327612:
                if (optString2.equals("long")) {
                    z2 = true;
                    break;
                }
                z2 = true;
                break;
            case 109413500:
                if (optString2.equals("short")) {
                    z2 = true;
                    break;
                }
                z2 = true;
                break;
            default:
                z2 = true;
                break;
        }
        switch (z2) {
            case false:
                break;
            case true:
                i2 = 0;
                break;
            case true:
                i2 = 1;
                break;
            case true:
                i2 = 3;
                break;
            default:
                i2 = -1;
                break;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                dateFormat = DateFormat.getDateTimeInstance(i, i2, locale);
            } else {
                dateFormat = DateFormat.getDateInstance(i, locale);
            }
        } else if (i2 >= 0) {
            dateFormat = DateFormat.getTimeInstance(i2, locale);
        } else {
            dateFormat = null;
        }
        if (dateFormat == null) {
            StringBuilder sb = new StringBuilder();
            String optString3 = jSONObject.optString("era");
            if (!optString3.isEmpty()) {
                if (optString3.equals("long")) {
                    str7 = "GGGG";
                } else if (optString3.equals("narrow")) {
                    str7 = "GGGGG";
                } else {
                    str7 = "G";
                }
                sb.append(str7);
            }
            String optString4 = jSONObject.optString("year");
            if (!optString4.isEmpty()) {
                if (optString4.equals("2-digit")) {
                    str6 = "yy";
                } else {
                    str6 = "y";
                }
                sb.append(str6);
            }
            String optString5 = jSONObject.optString("month");
            if (!optString5.isEmpty()) {
                if (optString5.equals("long")) {
                    str5 = "MMMM";
                } else if (optString5.equals("short")) {
                    str5 = "MMM";
                } else if (optString5.equals("narrow")) {
                    str5 = "MMMMM";
                } else if (optString5.equals("2-digit")) {
                    str5 = "MM";
                } else {
                    str5 = "M";
                }
                sb.append(str5);
            }
            String optString6 = jSONObject.optString("weekday");
            if (!optString6.isEmpty()) {
                if (optString6.equals("long")) {
                    str4 = "EEEE";
                } else if (optString6.equals("narrow")) {
                    str4 = "EEEEE";
                } else {
                    str4 = "EEE";
                }
                sb.append(str4);
            }
            String optString7 = jSONObject.optString("day");
            if (!optString7.isEmpty()) {
                if (optString7.equals("2-digit")) {
                    str3 = "dd";
                } else {
                    str3 = "d";
                }
                sb.append(str3);
            }
            String optString8 = jSONObject.optString("hour");
            if (!optString8.isEmpty()) {
                sb.append(f(jSONObject, optString8.equals("2-digit")));
            }
            if (jSONObject.has("minute")) {
                sb.append("mm");
            }
            if (jSONObject.has("second")) {
                sb.append("ss");
            }
            if (sb.length() == 0) {
                boolean equals = str.equals("toLocaleTimeString");
                if (!str.equals("toLocaleTimeString") && !str.equals("toLocaleString")) {
                    z3 = false;
                }
                if (!equals) {
                    sb.append("yMd");
                }
                if (z3) {
                    sb.append(f(jSONObject, false));
                    sb.append("mmss");
                }
            }
            String optString9 = jSONObject.optString("timeZoneName");
            if (!optString9.isEmpty()) {
                if (optString9.equals("long")) {
                    str2 = "zzzz";
                } else {
                    str2 = "z";
                }
                sb.append(str2);
            }
            dateFormat = DateFormat.getInstanceForSkeleton(sb.toString(), locale);
        }
        String optString10 = jSONObject.optString("timeZone");
        if (!optString10.isEmpty()) {
            dateFormat.setTimeZone(TimeZone.getTimeZone(optString10));
        }
        return dateFormat;
    }

    public static java.lang.String d(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i00.d(java.lang.String):java.lang.String");
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (i00.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null && myLooper != Looper.getMainLooper()) {
                vq2 vq2Var = new vq2();
                pd0.a().execute(new ee2(applicationContext, vq2Var, (byte) 28));
                vq2Var.b();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        }
    }

    public static java.lang.String f(org.json.JSONObject r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i00.f(org.json.JSONObject, boolean):java.lang.String");
    }

    public static boolean g(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        if ((i & 4) != 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, rr.l(context), null);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i & 1);
    }

    public static int i(android.media.AudioManager r4, defpackage.f00 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i00.i(android.media.AudioManager, f00):int");
    }

    public static void j(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void k(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void m(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void n(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void o(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
