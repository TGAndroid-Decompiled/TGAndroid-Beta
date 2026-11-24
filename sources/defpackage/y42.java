package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class y42 extends u26 {
    public final ar0 r;

    public y42(ar0 ar0Var, Context context) {
        super(context);
        this.r = ar0Var;
    }

    @Override
    public final int k(int i, View view) {
        int topScrollOffset;
        int k = super.k(i, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
