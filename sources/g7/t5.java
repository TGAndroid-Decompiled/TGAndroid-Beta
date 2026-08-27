package g7;

public abstract class t5 {
    public static String a(com.google.android.gms.internal.cast.v4 v4Var) {
        StringBuilder sb2 = new StringBuilder(v4Var.o());
        for (int i10 = 0; i10 < v4Var.o(); i10++) {
            byte bI = v4Var.i(i10);
            if (bI == 34) {
                sb2.append("\\\"");
            } else if (bI == 39) {
                sb2.append("\\'");
            } else if (bI != 92) {
                switch (bI) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bI < 32 || bI > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bI >>> 6) & 3) + 48));
                            sb2.append((char) (((bI >>> 3) & 7) + 48));
                            sb2.append((char) ((bI & 7) + 48));
                        } else {
                            sb2.append((char) bI);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
