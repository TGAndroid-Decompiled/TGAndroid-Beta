package j8;
public abstract class h {
    public static final n6.c[] f16595a = {new n6.c("name_ulr_private", 1), new n6.c("name_sleep_segment_request", 1), new n6.c("get_last_activity_feature_id", 1), new n6.c("support_context_feature_id", 1), new n6.c("get_current_location", 2), new n6.c("get_last_location_with_request", 1), new n6.c("set_mock_mode_with_callback", 1), new n6.c("set_mock_location_with_callback", 1), new n6.c("inject_location_with_callback", 1), new n6.c("location_updates_with_callback", 1), new n6.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i7) {
        if (i7 != 100) {
            if (i7 != 102) {
                if (i7 != 104) {
                    if (i7 == 105) {
                        return "PASSIVE";
                    }
                    throw new IllegalArgumentException();
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }
}
