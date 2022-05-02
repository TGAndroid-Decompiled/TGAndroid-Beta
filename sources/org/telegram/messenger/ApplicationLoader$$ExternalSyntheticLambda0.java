package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class ApplicationLoader$$ExternalSyntheticLambda0 implements OnCompleteListener {
    public static final ApplicationLoader$$ExternalSyntheticLambda0 INSTANCE = new ApplicationLoader$$ExternalSyntheticLambda0();

    private ApplicationLoader$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void onComplete(Task task) {
        ApplicationLoader.lambda$initPlayServices$0(task);
    }
}
