package g8;
public abstract class l {
    public static final k6.c[] f10518a = {new k6.c("name_ulr_private", 1), new k6.c("name_sleep_segment_request", 1), new k6.c("get_last_activity_feature_id", 1), new k6.c("support_context_feature_id", 1), new k6.c("get_current_location", 2), new k6.c("get_last_location_with_request", 1), new k6.c("set_mock_mode_with_callback", 1), new k6.c("set_mock_location_with_callback", 1), new k6.c("inject_location_with_callback", 1), new k6.c("location_updates_with_callback", 1), new k6.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i10) {
        if (i10 != 100) {
            if (i10 != 102) {
                if (i10 != 104) {
                    if (i10 == 105) {
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
