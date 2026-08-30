package dg;

import org.telegram.messenger.MessageObject;
import ph.o4;
public final class y1 extends f2.v {
    public final o4 f4858c;

    public y1(o4 o4Var) {
        this.f4858c = o4Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        o4 o4Var = this.f4858c;
        int size = (o4Var.f4352p0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = o4Var.f4353q0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
