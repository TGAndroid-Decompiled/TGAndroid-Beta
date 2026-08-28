package f7;

import java.io.IOException;
public abstract class f5 {
    public static void a(com.google.android.exoplayer2.upstream.m mVar) {
        if (mVar != null) {
            try {
                mVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
