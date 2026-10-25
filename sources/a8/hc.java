package a8;

import java.io.IOException;
public abstract class hc {
    public static void a(g2.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
