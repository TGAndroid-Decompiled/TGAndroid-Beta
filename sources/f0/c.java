package f0;

import android.content.Context;
import java.util.concurrent.Executor;

public abstract class c {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
