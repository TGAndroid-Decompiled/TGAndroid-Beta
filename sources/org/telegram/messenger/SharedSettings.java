package org.telegram.messenger;

import android.content.SharedPreferences;
public final class SharedSettings {
    public static final BooleanSetting advancedSettingsAllowed = ofBoolean("advanced_settings_allowed", true);
    public static final BooleanSetting roundVideoCamera2Enabled = ofBoolean("round_video_camera2_enabled", true);
    public static final EnumSetting<ki.o0> roundVideoOutputResolution = ofEnum("round_video_output_resolution", ki.o0.P480);
    public static final EnumSetting<ki.j0> roundVideoCameraResolution = ofEnum("round_video_camera_resolution", ki.j0.f13766a);
    public static final EnumSetting<ki.k0> roundVideoFrameRate = ofEnum("round_video_frame_rate", ki.k0.FPS_30);
    public static final IntSetting roundVideoVideoBitrate = ofInt("round_video_video_bitrate", 1000000);
    public static final BooleanSetting roundVideoComposition = ofBoolean("round_video_composition", true);
    public static final EnumSetting<ki.i0> roundVideoLastCamera = ofEnum("round_video_last_camera", ki.i0.f13741a);

    public static final class BooleanSetting {
        private final boolean defaultValue;
        private final String name;

        public boolean get() {
            return SharedSettings.access$600().getBoolean(this.name, this.defaultValue);
        }

        public void set(boolean z10) {
            SharedSettings.access$600().edit().putBoolean(this.name, z10).apply();
        }

        public boolean toggle() {
            boolean z10 = !get();
            set(z10);
            return z10;
        }

        private BooleanSetting(String str, boolean z10) {
            this.name = str;
            this.defaultValue = z10;
        }
    }

    public static final class EnumSetting<T extends Enum<T>> {
        private final T defaultValue;
        private final Class<T> enumClass;
        private final String name;

        public T get() {
            String string = SharedSettings.access$600().getString(this.name, this.defaultValue.name());
            if (string != null) {
                try {
                    return (T) Enum.valueOf(this.enumClass, string);
                } catch (IllegalArgumentException unused) {
                }
            }
            return this.defaultValue;
        }

        public void set(T t10) {
            SharedSettings.access$600().edit().putString(this.name, t10.name()).apply();
        }

        private EnumSetting(String str, T t10) {
            this.name = str;
            this.defaultValue = t10;
            this.enumClass = t10.getDeclaringClass();
        }
    }

    public static final class FloatSetting {
        private final float defaultValue;
        private final String name;

        public float get() {
            return SharedSettings.access$600().getFloat(this.name, this.defaultValue);
        }

        public void set(float f7) {
            SharedSettings.access$600().edit().putFloat(this.name, f7).apply();
        }

        private FloatSetting(String str, float f7) {
            this.name = str;
            this.defaultValue = f7;
        }
    }

    public static final class IntSetting {
        private final int defaultValue;
        private final String name;

        public int get() {
            return SharedSettings.access$600().getInt(this.name, this.defaultValue);
        }

        public void set(int i10) {
            SharedSettings.access$600().edit().putInt(this.name, i10).apply();
        }

        private IntSetting(String str, int i10) {
            this.name = str;
            this.defaultValue = i10;
        }
    }

    public static final class LongSetting {
        private final long defaultValue;
        private final String name;

        public long get() {
            return SharedSettings.access$600().getLong(this.name, this.defaultValue);
        }

        public void set(long j3) {
            SharedSettings.access$600().edit().putLong(this.name, j3).apply();
        }

        private LongSetting(String str, long j3) {
            this.name = str;
            this.defaultValue = j3;
        }
    }

    public static final class StringSetting {
        private final String defaultValue;
        private final String name;

        public String get() {
            return SharedSettings.access$600().getString(this.name, this.defaultValue);
        }

        public void set(String str) {
            SharedSettings.access$600().edit().putString(this.name, str).apply();
        }

        private StringSetting(String str, String str2) {
            this.name = str;
            this.defaultValue = str2;
        }
    }

    private SharedSettings() {
    }

    public static SharedPreferences access$600() {
        return preferences();
    }

    private static BooleanSetting ofBoolean(String str, boolean z10) {
        return new BooleanSetting(str, z10);
    }

    private static <T extends Enum<T>> EnumSetting<T> ofEnum(String str, T t10) {
        return new EnumSetting<>(str, t10);
    }

    private static FloatSetting ofFloat(String str, float f7) {
        return new FloatSetting(str, f7);
    }

    private static IntSetting ofInt(String str, int i10) {
        return new IntSetting(str, i10);
    }

    private static LongSetting ofLong(String str, long j3) {
        return new LongSetting(str, j3);
    }

    private static StringSetting ofString(String str, String str2) {
        return new StringSetting(str, str2);
    }

    private static SharedPreferences preferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
    }
}
