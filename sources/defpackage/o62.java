package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class o62 extends oc0 {
    public final p62 F;

    public o62(p62 p62Var, Context context) {
        super(context);
        this.F = p62Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.F.w;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, 1073741824), View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, 1073741824));
    }
}
