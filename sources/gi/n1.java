package gi;

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
import w7.d6;
import w7.z5;
public final class n1 extends FrameLayout {
    public final String f11355a;
    public final RadioButton f11356b;
    public final boolean f11357c;

    public n1(o1 o1Var, boolean z10, Context context) {
        super(context);
        this.f11355a = o1Var.f11366a;
        RadioButton radioButton = new RadioButton(context);
        this.f11356b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(h6.x0(null, h6.D5, false), h6.x0(null, h6.E5, false));
        addView(radioButton, z5.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = d6.b(context, 16.0f, h6.G6, true, null);
        b10.setText(o1Var.f11368c);
        addView(b10, z5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = d6.b(context, 14.0f, h6.f21381y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(o1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(o1Var.d / 1000)))));
        addView(b11, z5.t(-1, -2, 7, 62, 32, 8, 0));
        this.f11357c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f11357c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, h6.f21114k0);
        }
    }
}
