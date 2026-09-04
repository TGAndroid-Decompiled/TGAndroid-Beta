package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.x9;
import w7.x5;
import yf.p;
public final class b extends FrameLayout implements z5 {
    public final f6 f11349a;
    public final x9 f11350b;
    public final TextView f11351c;
    public final TextView d;
    public final ImageView f11352e;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f11349a = f6Var;
        x9 x9Var = new x9(context);
        this.f11350b = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(7.3125f));
        addView(x9Var, x5.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f11351c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, x5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, x5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, x5.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f11352e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, x5.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        d();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f19869id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f11350b.e(chat, new i9(chat));
    }

    @Override
    public final void d() {
        int i10 = j6.f21061z6;
        f6 f6Var = this.f11349a;
        this.f11352e.setColorFilter(j6.v0(i10, f6Var));
        this.f11351c.setTextColor(j6.v0(j6.G6, f6Var));
        this.d.setTextColor(j6.v0(i10, f6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = j6.S0;
        x9 x9Var = this.f11350b;
        p.a(canvas, drawable, (x9Var.getWidth() / 2.0f) + x9Var.getLeft(), (x9Var.getHeight() / 2.0f) + x9Var.getTop(), x9Var.getHeight());
        super.dispatchDraw(canvas);
        f6 f6Var = this.f11349a;
        if (f6Var != null) {
            paint = f6Var.G("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = j6.f20785k0;
        }
        canvas.drawLine(AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11351c.setText(charSequence);
    }
}
