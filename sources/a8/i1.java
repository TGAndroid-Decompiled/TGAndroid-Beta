package a8;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class i1 {
    public static boolean a(Context context) {
        if (context != null && DictationAsr.F()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = ai.s0.f1519a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ai.s0.b(linkedHashMap, context);
            ArrayList arrayList2 = new ArrayList(linkedHashMap.values());
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                String language = Locale.forLanguageTag((String) obj).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                    arrayList.add(language);
                }
            }
            if (arrayList.size() > 1) {
                arrayList.remove("en");
            }
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (DictationAsr.M((String) obj2) != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
