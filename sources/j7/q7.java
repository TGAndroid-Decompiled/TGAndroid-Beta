package j7;

import java.io.IOException;
public abstract class q7 {
    public static void a(g5.m mVar) {
        if (mVar != null) {
            try {
                mVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
