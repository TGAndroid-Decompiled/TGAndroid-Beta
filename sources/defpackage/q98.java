package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;
public final class q98 extends x2b {
    public final r98 q2;

    public q98(r98 r98Var, Context context, Object obj, TLObject tLObject, ylb ylbVar) {
        super(context, obj, tLObject, ylbVar);
        this.q2 = r98Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.q2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
