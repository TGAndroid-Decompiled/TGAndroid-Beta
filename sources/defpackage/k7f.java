package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
public final class k7f {
    public static final ce6 i = new ce6("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static k7f k;
    public final i8e a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final q79 e = new q79(Looper.getMainLooper(), (byte) 3);
    public final eqd d = new eqd(this, (byte) 2);

    public k7f(SharedPreferences sharedPreferences, i8e i8eVar, String str) {
        this.b = sharedPreferences;
        this.a = i8eVar;
        this.c = str;
    }

    public static void a(m3f m3fVar) {
        k7f k7fVar;
        if (i8e.j && (k7fVar = k) != null) {
            SharedPreferences sharedPreferences = k7fVar.b;
            String num = Integer.toString(m3fVar.a);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String h = b10.h("feature_usage_timestamp_reported_feature_", num);
            if (!sharedPreferences.contains(h)) {
                h = b10.h("feature_usage_timestamp_detected_feature_", num);
            }
            edit.putLong(h, System.currentTimeMillis()).apply();
            k7fVar.f.add(m3fVar);
            k7fVar.e.post(k7fVar.d);
        }
    }

    public static m3f b(String str) {
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    break;
                case 1:
                    return m3f.CAF_CAST_BUTTON;
                case 2:
                    return m3f.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return m3f.CAF_MINI_CONTROLLER;
                case 4:
                    return m3f.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return m3f.CAST_CONTEXT;
                case 6:
                    return m3f.IMAGE_CACHE;
                case 7:
                    return m3f.IMAGE_PICKER;
                case 8:
                    return m3f.AD_BREAK_PARSER;
                case 9:
                    return m3f.UI_STYLE;
                case 10:
                    return m3f.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return m3f.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return m3f.PAUSE_CONTROLLER;
                case 13:
                    return m3f.SEEK_CONTROLLER;
                case 14:
                    return m3f.STREAM_VOLUME;
                case 15:
                    return m3f.UI_MEDIA_CONTROLLER;
                case 16:
                    return m3f.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return m3f.PRECACHE;
                case 18:
                    return m3f.INSTRUCTIONS_VIEW;
                case 19:
                    return m3f.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return m3f.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return m3f.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return m3f.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return m3f.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return m3f.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return m3f.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return m3f.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return m3f.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return m3f.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return m3f.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return m3f.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return m3f.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return m3f.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return m3f.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return m3f.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return m3f.CAST_OUTPUT_SWITCHER_ENABLED;
                case 36:
                    return m3f.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return m3f.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case 38:
                    return m3f.CAST_BUTTON_DELEGATE;
                case 39:
                    return m3f.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return m3f.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return m3f.CAST_TRANSFER_TO_LOCAL_USED;
                case 42:
                    return m3f.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return m3f.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return m3f.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 45:
                    return m3f.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 46:
                    return m3f.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case 47:
                    return m3f.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 48:
                    return m3f.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case 49:
                    return m3f.CAF_NOTIFICATION_SERVICE;
                case 50:
                    return m3f.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return m3f.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return m3f.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return m3f.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return m3f.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return m3f.CAF_MEDIA_NOTIFICATION_PROXY;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
        return m3f.DEVELOPER_FEATURE_FLAG_UNKNOWN;
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
