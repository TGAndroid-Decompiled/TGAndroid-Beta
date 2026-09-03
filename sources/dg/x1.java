package dg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import ph.o4;
public final class x1 extends f2.x {
    public final o4 S;

    public x1(o4 o4Var) {
        super(true);
        this.S = o4Var;
    }

    @Override
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        o4 o4Var = this.S;
        ArrayList arrayList = o4Var.f4358p0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = o4Var.f4359q0;
        if (groupedMessages != null && size >= 0 && size < arrayList.size() && (position = groupedMessages.getPosition((MessageObject) arrayList.get(size))) != null && position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
            int size2 = groupedMessages.posArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessages.posArray.get(i11);
                if (groupedMessagePosition != position) {
                    byte b11 = groupedMessagePosition.minY;
                    byte b12 = position.minY;
                    if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
