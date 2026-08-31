package eg;

import org.telegram.messenger.MessageObject;
import qh.o4;
public final class w1 extends f2.v {
    public final o4 f5525c;

    public w1(o4 o4Var) {
        this.f5525c = o4Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        o4 o4Var = this.f5525c;
        int size = (o4Var.f5554p0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = o4Var.f5555q0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
