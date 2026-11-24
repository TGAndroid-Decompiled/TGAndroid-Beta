package defpackage;

import android.view.View;
import org.telegram.ui.Components.UndoView;
public final class c7c implements View.OnClickListener {
    public final byte a;
    public final UndoView b;

    public c7c(UndoView undoView, byte b) {
        this.a = b;
        this.b = undoView;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        UndoView undoView = this.b;
        switch (b) {
            case 0:
                int i = UndoView.j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i2 = UndoView.j0;
                undoView.d(1, false);
                return;
        }
    }
}
