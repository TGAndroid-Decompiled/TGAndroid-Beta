package defpackage;
public abstract class q3f {
    public static String a(efd efdVar) {
        String str;
        StringBuilder sb = new StringBuilder(efdVar.size());
        for (int i = 0; i < efdVar.size(); i++) {
            int j = efdVar.j(i);
            if (j != 34) {
                if (j != 39) {
                    if (j != 92) {
                        switch (j) {
                            case 7:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (j < 32 || j > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((j >>> 6) & 3) + 48));
                                    sb.append((char) (((j >>> 3) & 7) + 48));
                                    j = (j & 7) + 48;
                                }
                                sb.append((char) j);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
