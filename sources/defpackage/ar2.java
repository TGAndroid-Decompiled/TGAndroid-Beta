package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
public final class ar2 {
    public final byte a;
    public final hr2 b;

    public ar2(hr2 hr2Var, byte b) {
        this.a = b;
        this.b = hr2Var;
    }

    public final void a() {
        byte b = this.a;
        hr2 hr2Var = this.b;
        switch (b) {
            case 0:
                Bundle c = ((op) hr2Var.e.d).c("android:support:activity-result");
                if (c != null) {
                    br2 br2Var = hr2Var.x;
                    HashMap hashMap = br2Var.b;
                    HashMap hashMap2 = br2Var.a;
                    Bundle bundle = br2Var.g;
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        br2Var.d = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.intValue();
                            String str2 = stringArrayList.get(i);
                            hashMap2.put(num2, str2);
                            br2Var.b.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                fp4 fp4Var = (fp4) ((gp4) hr2Var).K.b;
                fp4Var.d.b(fp4Var, fp4Var, null);
                return;
        }
    }
}
