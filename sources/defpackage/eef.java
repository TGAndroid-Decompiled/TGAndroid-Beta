package defpackage;

import java.util.HashMap;
public abstract class eef {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i < 10) {
                b.put(strArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
