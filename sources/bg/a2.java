package bg;

import nh.f5;
import org.telegram.messenger.MessageObject;
public final class a2 extends f2.v {
    public final f5 f2081c;

    public a2(f5 f5Var) {
        this.f2081c = f5Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        f5 f5Var = this.f2081c;
        int size = (f5Var.f2149o0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = f5Var.f2150p0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
