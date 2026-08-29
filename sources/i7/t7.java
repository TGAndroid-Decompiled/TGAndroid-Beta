package i7;
public abstract class t7 {
    public static Integer a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1118317585:
                    if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                        return 3;
                    }
                    return null;
                case -962896020:
                    if (str.equals("REPEAT_SINGLE")) {
                        return 2;
                    }
                    return null;
                case 1645938909:
                    if (str.equals("REPEAT_ALL")) {
                        return 1;
                    }
                    return null;
                case 1645952171:
                    if (str.equals("REPEAT_OFF")) {
                        return 0;
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    public static String b(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            return null;
                        }
                        return "REPEAT_ALL_AND_SHUFFLE";
                    }
                    return "REPEAT_SINGLE";
                }
                return "REPEAT_ALL";
            }
            return "REPEAT_OFF";
        }
        return null;
    }
}
