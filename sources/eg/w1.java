package eg;

import org.telegram.messenger.MessageObject;
import qh.n4;
public final class w1 extends f2.v {
    public final n4 f5525c;

    public w1(n4 n4Var) {
        this.f5525c = n4Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        n4 n4Var = this.f5525c;
        int size = (n4Var.f5554p0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = n4Var.f5555q0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
