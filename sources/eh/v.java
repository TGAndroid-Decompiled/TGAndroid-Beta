package eh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i61;
public final class v extends FrameLayout {
    public final f9 f5679a;
    public final TextView f5680b;
    public o f5681c;

    public v(Context context, int i10, g6 g6Var) {
        super(context);
        this.f5679a = new f9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f5680b = textView;
        textView.setTextColor(k6.v0(k6.E8, g6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, c6.g());
    }

    public final i61 a(p2 p2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        o oVar = this.f5681c;
        if (oVar != null) {
            return oVar;
        }
        u uVar = new u(p2Var.getCurrentAccount(), p2Var.getMessagesController().getInputPeer(j10), i10, bArr, new m(this, 0), callback);
        AndroidUtilities.runOnUIThread(new m(uVar, 1), 1000L);
        o oVar2 = new o(p2Var, new n(uVar, 0), i11);
        this.f5681c = oVar2;
        oVar2.V2.f32957r = false;
        oVar2.j(new p(this, uVar));
        return this.f5681c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        f9 f9Var = this.f5679a;
        f9Var.setBounds(width - ((int) f9Var.f26792c.d.f50521f.f50529a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        f9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5679a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5679a.b();
    }

    public void setText(String str) {
        this.f5680b.setText(str);
    }
}
