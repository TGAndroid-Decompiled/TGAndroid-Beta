package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.AutoDeleteMediaTask;
public final class AutoDeleteMediaTask$$ExternalSyntheticLambda1 implements Comparator {
    public static final AutoDeleteMediaTask$$ExternalSyntheticLambda1 INSTANCE = new AutoDeleteMediaTask$$ExternalSyntheticLambda1();

    private AutoDeleteMediaTask$$ExternalSyntheticLambda1() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$run$0;
        lambda$run$0 = AutoDeleteMediaTask.lambda$run$0((AutoDeleteMediaTask.FileInfoInternal) obj, (AutoDeleteMediaTask.FileInfoInternal) obj2);
        return lambda$run$0;
    }
}
