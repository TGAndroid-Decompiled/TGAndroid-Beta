package a8;
public abstract class q6 {
    public static String a(androidx.datastore.preferences.protobuf.h hVar) {
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i7 = 0; i7 < hVar.size(); i7++) {
            byte f10 = hVar.f(i7);
            if (f10 != 34) {
                if (f10 != 39) {
                    if (f10 != 92) {
                        switch (f10) {
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
                                if (f10 >= 32 && f10 <= 126) {
                                    sb2.append((char) f10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((f10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((f10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((f10 & 7) + 48));
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
