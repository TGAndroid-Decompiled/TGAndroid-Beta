package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
public final class z9f {
    public static final he6 i = new he6("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static z9f k;
    public final wae a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final b99 e = new b99(Looper.getMainLooper(), (byte) 3);
    public final dhe d = new dhe(this, (byte) 1);

    public z9f(SharedPreferences sharedPreferences, wae waeVar, String str) {
        this.b = sharedPreferences;
        this.a = waeVar;
        this.c = str;
    }

    public static void a(b6f b6fVar) {
        z9f z9fVar;
        if (wae.j && (z9fVar = k) != null) {
            SharedPreferences sharedPreferences = z9fVar.b;
            String num = Integer.toString(b6fVar.a);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String i2 = c00.i("feature_usage_timestamp_reported_feature_", num);
            if (!sharedPreferences.contains(i2)) {
                i2 = c00.i("feature_usage_timestamp_detected_feature_", num);
            }
            edit.putLong(i2, System.currentTimeMillis()).apply();
            z9fVar.f.add(b6fVar);
            z9fVar.e.post(z9fVar.d);
        }
    }

    public static b6f b(String str) {
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    break;
                case 1:
                    return b6f.CAF_CAST_BUTTON;
                case 2:
                    return b6f.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return b6f.CAF_MINI_CONTROLLER;
                case 4:
                    return b6f.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return b6f.CAST_CONTEXT;
                case 6:
                    return b6f.IMAGE_CACHE;
                case 7:
                    return b6f.IMAGE_PICKER;
                case 8:
                    return b6f.AD_BREAK_PARSER;
                case 9:
                    return b6f.UI_STYLE;
                case 10:
                    return b6f.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return b6f.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return b6f.PAUSE_CONTROLLER;
                case 13:
                    return b6f.SEEK_CONTROLLER;
                case 14:
                    return b6f.STREAM_VOLUME;
                case 15:
                    return b6f.UI_MEDIA_CONTROLLER;
                case 16:
                    return b6f.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return b6f.PRECACHE;
                case 18:
                    return b6f.INSTRUCTIONS_VIEW;
                case 19:
                    return b6f.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return b6f.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return b6f.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return b6f.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return b6f.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return b6f.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return b6f.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return b6f.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return b6f.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return b6f.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return b6f.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return b6f.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return b6f.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return b6f.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return b6f.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return b6f.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return b6f.CAST_OUTPUT_SWITCHER_ENABLED;
                case 36:
                    return b6f.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return b6f.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case 38:
                    return b6f.CAST_BUTTON_DELEGATE;
                case 39:
                    return b6f.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return b6f.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return b6f.CAST_TRANSFER_TO_LOCAL_USED;
                case 42:
                    return b6f.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return b6f.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return b6f.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 45:
                    return b6f.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 46:
                    return b6f.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case 47:
                    return b6f.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 48:
                    return b6f.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case 49:
                    return b6f.CAF_NOTIFICATION_SERVICE;
                case 50:
                    return b6f.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return b6f.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return b6f.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return b6f.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return b6f.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return b6f.CAF_MEDIA_NOTIFICATION_PROXY;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
        return b6f.DEVELOPER_FEATURE_FLAG_UNKNOWN;
    }

    public final void c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
