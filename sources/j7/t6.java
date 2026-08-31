package j7;
public abstract class t6 {
    public static String a(com.google.android.gms.internal.play_billing.l1 l1Var) {
        StringBuilder sb = new StringBuilder(l1Var.o());
        for (int i10 = 0; i10 < l1Var.o(); i10++) {
            byte i11 = l1Var.i(i10);
            if (i11 != 34) {
                if (i11 != 39) {
                    if (i11 != 92) {
                        switch (i11) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (i11 >= 32 && i11 <= 126) {
                                    sb.append((char) i11);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((i11 >>> 6) & 3) + 48));
                                    sb.append((char) (((i11 >>> 3) & 7) + 48));
                                    sb.append((char) ((i11 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
