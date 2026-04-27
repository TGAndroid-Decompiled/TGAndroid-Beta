package io.noties.markwon.html;

import java.util.List;

public abstract class MarkwonHtmlParser {

    public interface FlushAction {
        void apply(List list);
    }

    public abstract void flushBlockTags(int i, FlushAction flushAction);

    public abstract void flushInlineTags(int i, FlushAction flushAction);

    public abstract void processFragment(Appendable appendable, String str);
}
