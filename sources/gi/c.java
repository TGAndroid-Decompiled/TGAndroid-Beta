package gi;

import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import yf.p;
public final class c extends FrameLayout implements x5 {
    public final d6 f10900a;
    public final y9 f10901b;
    public final TextView f10902c;
    public final TextView d;
    public final ImageView f10903e;

    public c(Context context, d6 d6Var) {
        super(context);
        this.f10900a = d6Var;
        y9 y9Var = new y9(context);
        this.f10901b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(y9Var, w7.x5.a(32.0f, 20.0f, 0.0f, 0.0f, 0.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f10902c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, w7.x5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, w7.x5.a(-2.0f, 67.0f, 0.0f, 48.0f, 1.0f, -1, 19));
        ImageView imageView = new ImageView(context);
        this.f10903e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.a(24.0f, 0.0f, 0.0f, 11.0f, 0.0f, 24, 21));
        e();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f20032id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f10901b.e(chat, new j9(chat));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = h6.S0;
        y9 y9Var = this.f10901b;
        p.a(canvas, drawable, (y9Var.getWidth() / 2.0f) + y9Var.getLeft(), (y9Var.getHeight() / 2.0f) + y9Var.getTop(), y9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        int i10 = h6.f21189z6;
        d6 d6Var = this.f10900a;
        this.f10903e.setColorFilter(h6.w0(i10, d6Var));
        this.f10902c.setTextColor(h6.w0(h6.G6, d6Var));
        this.d.setTextColor(h6.w0(i10, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10902c.setText(charSequence);
    }
}
