package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.RadioButton;
import w7.d6;
import w7.z5;
public final class s1 extends FrameLayout {
    public final String f9326a;
    public final RadioButton f9327b;
    public final boolean f9328c;

    public s1(t1 t1Var, boolean z10, Context context) {
        super(context);
        this.f9326a = t1Var.f9343a;
        RadioButton radioButton = new RadioButton(context);
        this.f9327b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(i6.w0(null, i6.D5, false), i6.w0(null, i6.E5, false));
        addView(radioButton, z5.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = d6.b(context, 16.0f, i6.G6, true, null);
        b10.setText(t1Var.f9345c);
        addView(b10, z5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = d6.b(context, 14.0f, i6.f21214y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(t1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(t1Var.d / 1000)))));
        addView(b11, z5.t(-1, -2, 7, 62, 32, 8, 0));
        this.f9328c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f9328c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, i6.f20950k0);
        }
    }
}
