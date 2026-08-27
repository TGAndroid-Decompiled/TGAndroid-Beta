package g7;

import java.io.IOException;

public abstract class l0 {
    public static void a(com.google.android.exoplayer2.upstream.m mVar) {
        if (mVar != null) {
            try {
                mVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
