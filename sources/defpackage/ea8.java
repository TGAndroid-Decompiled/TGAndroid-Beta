package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class ea8 extends tca {
    public final FrameLayout U2;
    public final boolean V2;
    public final PhotoViewer W2;

    public ea8(PhotoViewer photoViewer, Context context, yv1 yv1Var, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z) {
        super(context, yv1Var, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z;
    }

    @Override
    public final void H() {
        super.H();
        if (this.V2) {
            gm.d3(new q78(this, (byte) 4), 50L);
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.W2;
        photoViewer.e0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gm.d3(new v36(this, this.U2, vh6Var, i, (byte) 19), 250L);
    }
}
