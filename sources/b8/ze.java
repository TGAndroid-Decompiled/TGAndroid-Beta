package b8;
public abstract class ze {
    public static void a(int i3, Object[] objArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 9);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }
}
