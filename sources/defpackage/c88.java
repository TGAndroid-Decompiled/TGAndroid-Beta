package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class c88 extends taa {
    public final FrameLayout U2;
    public final boolean V2;
    public final PhotoViewer W2;

    public c88(PhotoViewer photoViewer, Context context, mu1 mu1Var, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z) {
        super(context, mu1Var, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z;
    }

    @Override
    public final void I() {
        super.I();
        if (this.V2) {
            gl.e3(new oq7(this, (byte) 27), 50L);
        }
        Drawable[] drawableArr = PhotoViewer.f9;
        PhotoViewer photoViewer = this.W2;
        photoViewer.e0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gl.e3(new q76(this, this.U2, vf6Var, i, (byte) 18), 250L);
    }
}
