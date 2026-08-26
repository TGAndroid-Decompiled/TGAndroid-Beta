package org.telegram.PhoneFormat;

import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import java.util.ArrayList;

public final class CallingCodeInfo {
    public String callingCode;
    public ArrayList intlPrefixes;
    public ArrayList ruleSets;
    public ArrayList trunkPrefixes;

    public final String format(String str) {
        String str2;
        String strSubstring;
        String str3;
        String str4 = null;
        if (str.startsWith(this.callingCode)) {
            str3 = this.callingCode;
            strSubstring = str.substring(str3.length());
        } else {
            ArrayList arrayList = this.trunkPrefixes;
            int size = arrayList.size();
            int i = 0;
            do {
                if (i >= size) {
                    str2 = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                str2 = (String) obj;
            } while (!str.startsWith(str2));
            if (str2 != null) {
                strSubstring = str.substring(str2.length());
                str3 = null;
                str4 = str2;
            } else {
                strSubstring = str;
                str3 = null;
            }
        }
        ArrayList arrayList2 = this.ruleSets;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String str5 = ((RuleSet) obj2).format(strSubstring, str3, str4, true);
            if (str5 != null) {
                return str5;
            }
        }
        ArrayList arrayList3 = this.ruleSets;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            String str6 = ((RuleSet) obj3).format(strSubstring, str3, str4, false);
            if (str6 != null) {
                return str6;
            }
        }
        return (str3 == null || strSubstring.length() == 0) ? str : zzkc.m(str3, " ", strSubstring);
    }
}
