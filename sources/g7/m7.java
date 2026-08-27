package g7;

public abstract class m7 {
    public static String a(String str) {
        if (d(str)) {
            return null;
        }
        if ("American Express".equalsIgnoreCase(str)) {
            return "American Express";
        }
        if ("MasterCard".equalsIgnoreCase(str)) {
            return "MasterCard";
        }
        if ("Diners Club".equalsIgnoreCase(str)) {
            return "Diners Club";
        }
        if ("Discover".equalsIgnoreCase(str)) {
            return "Discover";
        }
        if ("JCB".equalsIgnoreCase(str)) {
            return "JCB";
        }
        return "Visa".equalsIgnoreCase(str) ? "Visa" : "Unknown";
    }

    public static String b(String str) {
        if (d(str)) {
            return null;
        }
        if ("credit".equalsIgnoreCase(str)) {
            return "credit";
        }
        if ("debit".equalsIgnoreCase(str)) {
            return "debit";
        }
        return "prepaid".equalsIgnoreCase(str) ? "prepaid" : "unknown";
    }

    public static boolean c(String str, String... strArr) {
        if (str != null) {
            for (String str2 : strArr) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String e(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }
}
