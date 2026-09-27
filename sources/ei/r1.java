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
import w7.c6;
import w7.y5;
public final class r1 extends FrameLayout {
    public final String f8573a;
    public final RadioButton f8574b;
    public final boolean f8575c;

    public r1(s1 s1Var, boolean z10, Context context) {
        super(context);
        this.f8573a = s1Var.f8589a;
        RadioButton radioButton = new RadioButton(context);
        this.f8574b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(i6.w0(null, i6.D5, false), i6.w0(null, i6.E5, false));
        addView(radioButton, y5.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = c6.b(context, 16.0f, i6.G6, true, null);
        b10.setText(s1Var.f8591c);
        addView(b10, y5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = c6.b(context, 14.0f, i6.f19442y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(s1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(s1Var.d / 1000)))));
        addView(b11, y5.t(-1, -2, 7, 62, 32, 8, 0));
        this.f8575c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f8575c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, i6.f19179k0);
        }
    }
}
