package c8;

import java.io.IOException;
public abstract class t0 {
    public static void a(j2.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
