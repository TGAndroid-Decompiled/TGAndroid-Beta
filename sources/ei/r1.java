package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.RadioButton;
import w7.b6;
import w7.x5;
public final class r1 extends FrameLayout {
    public final String f8571a;
    public final RadioButton f8572b;
    public final boolean f8573c;

    public r1(s1 s1Var, boolean z10, Context context) {
        super(context);
        this.f8571a = s1Var.f8587a;
        RadioButton radioButton = new RadioButton(context);
        this.f8572b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(h6.w0(null, h6.D5, false), h6.w0(null, h6.E5, false));
        addView(radioButton, x5.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = b6.b(context, 16.0f, h6.G6, true, null);
        b10.setText(s1Var.f8589c);
        addView(b10, x5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = b6.b(context, 14.0f, h6.f19170y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(s1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(s1Var.d / 1000)))));
        addView(b11, x5.t(-1, -2, 7, 62, 32, 8, 0));
        this.f8573c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f8573c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, h6.f18910k0);
        }
    }
}
