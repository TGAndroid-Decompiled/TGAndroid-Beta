package eg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import qh.n4;
public final class v1 extends f2.x {
    public final n4 S;

    public v1(n4 n4Var) {
        super(true);
        this.S = n4Var;
    }

    @Override
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        n4 n4Var = this.S;
        ArrayList arrayList = n4Var.f5554p0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = n4Var.f5555q0;
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
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
