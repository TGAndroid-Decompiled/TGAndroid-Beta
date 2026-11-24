package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class d52 extends ob0 {
    public final e52 F;

    public d52(e52 e52Var, Context context) {
        super(context);
        this.F = e52Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.F.w;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, 1073741824), View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, 1073741824));
    }
}
