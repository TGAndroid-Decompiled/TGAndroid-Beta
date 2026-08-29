package i7;

import java.io.IOException;
public abstract class h {
    public static void a(Appendable appendable, char c3) {
        try {
            appendable.append(c3);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
