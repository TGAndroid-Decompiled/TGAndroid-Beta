package f7;
public abstract class f6 {
    public static String a(com.google.android.gms.internal.play_billing.l1 l1Var) {
        StringBuilder sb2 = new StringBuilder(l1Var.o());
        for (int i9 = 0; i9 < l1Var.o(); i9++) {
            byte i10 = l1Var.i(i9);
            if (i10 != 34) {
                if (i10 != 39) {
                    if (i10 != 92) {
                        switch (i10) {
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
                                if (i10 >= 32 && i10 <= 126) {
                                    sb2.append((char) i10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((i10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((i10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((i10 & 7) + 48));
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
