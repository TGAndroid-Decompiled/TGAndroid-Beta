package k7;

import java.io.IOException;
public abstract class s {
    public static void a(Appendable appendable, char c3) {
        try {
            appendable.append(c3);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }
}
