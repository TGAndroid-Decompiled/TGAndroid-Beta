package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class tb8 extends kea {
    public final FrameLayout U2;
    public final boolean V2;
    public final PhotoViewer W2;

    public tb8(PhotoViewer photoViewer, Context context, zu1 zu1Var, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z) {
        super(context, zu1Var, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z;
    }

    @Override
    public final void H() {
        super.H();
        if (this.V2) {
            hl.d3(new x38(this, (byte) 12), 50L);
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.W2;
        photoViewer.e0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        hl.d3(new y36(this, this.U2, zh6Var, i, (byte) 20), 250L);
    }
}
