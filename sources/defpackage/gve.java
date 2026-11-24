package defpackage;
public abstract class gve {
    public static String a(f51 f51Var) {
        StringBuilder sb = new StringBuilder(f51Var.size());
        for (int i = 0; i < f51Var.size(); i++) {
            byte h = f51Var.h(i);
            if (h != 34) {
                if (h != 39) {
                    if (h != 92) {
                        switch (h) {
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
                                if (h >= 32 && h <= 126) {
                                    sb.append((char) h);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((h >>> 6) & 3) + 48));
                                    sb.append((char) (((h >>> 3) & 7) + 48));
                                    sb.append((char) ((h & 7) + 48));
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
