package b8;

import java.io.IOException;
public abstract class uc {
    public static void a(i2.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
