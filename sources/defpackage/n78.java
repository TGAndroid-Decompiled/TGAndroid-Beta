package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;
public final class n78 extends u0b {
    public final o78 q2;

    public n78(o78 o78Var, Context context, Object obj, TLObject tLObject, wjb wjbVar) {
        super(context, obj, tLObject, wjbVar);
        this.q2 = o78Var;
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
