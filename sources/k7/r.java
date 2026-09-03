package k7;

import java.io.IOException;
public abstract class r {
    public static void a(Appendable appendable, char c3) {
        try {
            appendable.append(c3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
