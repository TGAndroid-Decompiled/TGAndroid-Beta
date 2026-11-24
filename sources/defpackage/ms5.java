package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ms5 extends ClickableSpan {
    public final my0[] a;
    public final TLRPC.TL_chatInviteImporter b;

    public ms5(my0[] my0VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = my0VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.a[0].dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(ProfileActivity.S2(this.b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
