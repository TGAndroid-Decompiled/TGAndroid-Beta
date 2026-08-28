package na;
public abstract class h {
    public static final int f18538a;

    static {
        int i9;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i9 = Integer.parseInt(split[0]);
            if (i9 == 1 && split.length > 1) {
                i9 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i9 = -1;
        }
        if (i9 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char charAt = property.charAt(i10);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i9 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i9 = -1;
            }
        }
        if (i9 == -1) {
            i9 = 6;
        }
        f18538a = i9;
    }
}
