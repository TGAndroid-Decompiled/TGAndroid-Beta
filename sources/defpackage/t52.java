package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class t52 extends qb0 {
    public final u52 F;

    public t52(u52 u52Var, Context context) {
        super(context);
        this.F = u52Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.F.w;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, 1073741824), View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, 1073741824));
    }
}
