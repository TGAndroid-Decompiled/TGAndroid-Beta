package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class qs5 extends ClickableSpan {
    public final nx0[] a;
    public final TLRPC.TL_chatInviteImporter b;

    public qs5(nx0[] nx0VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = nx0VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.a[0].dismiss();
        e S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(ProfileActivity.Q2(this.b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
