package c8;
public abstract class cb {
    public static void a(int i7, Object[] objArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 9);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }
}
