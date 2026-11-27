package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;
public final class fb8 extends s4b {
    public final gb8 q2;

    public fb8(gb8 gb8Var, Context context, Object obj, TLObject tLObject, vnb vnbVar) {
        super(context, obj, tLObject, vnbVar);
        this.q2 = gb8Var;
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
