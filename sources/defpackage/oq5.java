package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class oq5 extends ClickableSpan {
    public final fx0[] a;
    public final TLRPC.TL_chatInviteImporter b;

    public oq5(fx0[] fx0VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = fx0VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.a[0].dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(ProfileActivity.P2(this.b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
