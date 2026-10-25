package a8;

import java.io.IOException;
public abstract class lb {
    public static void a(Appendable appendable, char c10) {
        try {
            appendable.append(c10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
