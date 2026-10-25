package a8;
public abstract class na {
    public static String a(com.google.android.gms.internal.cast.u4 u4Var) {
        StringBuilder sb2 = new StringBuilder(u4Var.n());
        for (int i10 = 0; i10 < u4Var.n(); i10++) {
            byte h = u4Var.h(i10);
            if (h != 34) {
                if (h != 39) {
                    if (h != 92) {
                        switch (h) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (h >= 32 && h <= 126) {
                                    sb2.append((char) h);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((h >>> 6) & 3) + 48));
                                    sb2.append((char) (((h >>> 3) & 7) + 48));
                                    sb2.append((char) ((h & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
