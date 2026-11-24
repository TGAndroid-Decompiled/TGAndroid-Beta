package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;
public final class o78 extends u0b {
    public final p78 q2;

    public o78(p78 p78Var, Context context, Object obj, TLObject tLObject, wjb wjbVar) {
        super(context, obj, tLObject, wjbVar);
        this.q2 = p78Var;
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
