package g7;

import java.io.IOException;

public abstract class p8 {
    public static void a(Appendable appendable, char c10) {
        try {
            appendable.append(c10);
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }
}
