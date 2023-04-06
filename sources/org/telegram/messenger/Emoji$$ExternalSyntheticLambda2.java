package org.telegram.messenger;

import java.util.Comparator;
public final class Emoji$$ExternalSyntheticLambda2 implements Comparator {
    public static final Emoji$$ExternalSyntheticLambda2 INSTANCE = new Emoji$$ExternalSyntheticLambda2();

    private Emoji$$ExternalSyntheticLambda2() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$sortEmoji$2;
        lambda$sortEmoji$2 = Emoji.lambda$sortEmoji$2((String) obj, (String) obj2);
        return lambda$sortEmoji$2;
    }
}
