package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_forumTopic;

public final class TopicsController$$ExternalSyntheticLambda18 implements Comparator {
    public static final TopicsController$$ExternalSyntheticLambda18 INSTANCE = new TopicsController$$ExternalSyntheticLambda18();

    private TopicsController$$ExternalSyntheticLambda18() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$sortTopics$6;
        lambda$sortTopics$6 = TopicsController.lambda$sortTopics$6((TLRPC$TL_forumTopic) obj, (TLRPC$TL_forumTopic) obj2);
        return lambda$sortTopics$6;
    }
}
