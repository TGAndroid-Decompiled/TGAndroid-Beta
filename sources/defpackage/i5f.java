package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
public final class i5f {
    public static final dc6 i = new dc6("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static i5f k;
    public final h6e a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final o59 e = new o59(Looper.getMainLooper(), (byte) 3);
    public final bod d = new bod(this, (byte) 2);

    public i5f(SharedPreferences sharedPreferences, h6e h6eVar, String str) {
        this.b = sharedPreferences;
        this.a = h6eVar;
        this.c = str;
    }

    public static void a(k1f k1fVar) {
        i5f i5fVar;
        if (h6e.j && (i5fVar = k) != null) {
            SharedPreferences sharedPreferences = i5fVar.b;
            String num = Integer.toString(k1fVar.a);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String h = b00.h("feature_usage_timestamp_reported_feature_", num);
            if (!sharedPreferences.contains(h)) {
                h = b00.h("feature_usage_timestamp_detected_feature_", num);
            }
            edit.putLong(h, System.currentTimeMillis()).apply();
            i5fVar.f.add(k1fVar);
            i5fVar.e.post(i5fVar.d);
        }
    }

    public static k1f b(String str) {
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    break;
                case 1:
                    return k1f.CAF_CAST_BUTTON;
                case 2:
                    return k1f.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return k1f.CAF_MINI_CONTROLLER;
                case 4:
                    return k1f.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return k1f.CAST_CONTEXT;
                case 6:
                    return k1f.IMAGE_CACHE;
                case 7:
                    return k1f.IMAGE_PICKER;
                case 8:
                    return k1f.AD_BREAK_PARSER;
                case 9:
                    return k1f.UI_STYLE;
                case 10:
                    return k1f.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return k1f.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return k1f.PAUSE_CONTROLLER;
                case 13:
                    return k1f.SEEK_CONTROLLER;
                case 14:
                    return k1f.STREAM_VOLUME;
                case 15:
                    return k1f.UI_MEDIA_CONTROLLER;
                case 16:
                    return k1f.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return k1f.PRECACHE;
                case 18:
                    return k1f.INSTRUCTIONS_VIEW;
                case 19:
                    return k1f.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return k1f.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return k1f.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return k1f.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return k1f.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return k1f.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return k1f.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return k1f.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return k1f.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return k1f.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return k1f.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return k1f.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return k1f.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return k1f.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return k1f.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return k1f.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return k1f.CAST_OUTPUT_SWITCHER_ENABLED;
                case 36:
                    return k1f.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return k1f.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case 38:
                    return k1f.CAST_BUTTON_DELEGATE;
                case 39:
                    return k1f.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return k1f.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return k1f.CAST_TRANSFER_TO_LOCAL_USED;
                case 42:
                    return k1f.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return k1f.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return k1f.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 45:
                    return k1f.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 46:
                    return k1f.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case 47:
                    return k1f.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 48:
                    return k1f.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case 49:
                    return k1f.CAF_NOTIFICATION_SERVICE;
                case 50:
                    return k1f.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return k1f.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return k1f.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return k1f.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return k1f.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return k1f.CAF_MEDIA_NOTIFICATION_PROXY;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
        return k1f.DEVELOPER_FEATURE_FLAG_UNKNOWN;
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
