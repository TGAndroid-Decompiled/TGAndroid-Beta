package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadioButton;
import w7.d6;
import w7.z5;
public final class q1 extends FrameLayout {
    public final String f9490a;
    public final RadioButton f9491b;
    public final boolean f9492c;

    public q1(r1 r1Var, boolean z10, Context context) {
        super(context);
        this.f9490a = r1Var.f9516a;
        RadioButton radioButton = new RadioButton(context);
        this.f9491b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.x0(null, g6.D5, false), g6.x0(null, g6.E5, false));
        addView(radioButton, z5.a(22.0f, 20.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        TextView b10 = d6.b(context, 16.0f, g6.G6, true, null);
        b10.setText(r1Var.f9518c);
        addView(b10, z5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = d6.b(context, 14.0f, g6.f19988y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(r1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(r1Var.d / 1000)))));
        addView(b11, z5.t(-1, -2, 7, 62, 32, 8, 0));
        this.f9492c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f9492c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, g6.f19722k0);
        }
    }
}
