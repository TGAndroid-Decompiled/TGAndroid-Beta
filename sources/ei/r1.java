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
    public final String f9326a;
    public final RadioButton f9327b;
    public final boolean f9328c;

    public r1(s1 s1Var, boolean z10, Context context) {
        super(context);
        this.f9326a = s1Var.f9343a;
        RadioButton radioButton = new RadioButton(context);
        this.f9327b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(h6.x0(null, h6.D5, false), h6.x0(null, h6.E5, false));
        addView(radioButton, x5.a(22.0f, 20.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        TextView b10 = b6.b(context, 16.0f, h6.G6, true, null);
        b10.setText(s1Var.f9345c);
        addView(b10, x5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = b6.b(context, 14.0f, h6.f21171y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(s1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(s1Var.d / 1000)))));
        addView(b11, x5.t(-1, -2, 7, 62, 32, 8, 0));
        this.f9328c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f9328c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, h6.f20908k0);
        }
    }
}
