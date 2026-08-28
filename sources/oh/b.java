package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ff.s;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public final class b extends FrameLayout implements w5 {
    public final b6 f19580a;
    public final o9 f19581b;
    public final TextView f19582c;
    public final TextView d;
    public final ImageView f19583e;

    public b(Context context, b6 b6Var) {
        super(context);
        this.f19580a = b6Var;
        o9 o9Var = new o9(context);
        this.f19581b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(o9Var, e6.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f19582c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, e6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, e6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, e6.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f19583e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, e6.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        d();
    }

    public final void a(int i9, TLRPC.Chat chat) {
        int i10;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(chat.f22380id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i10 = chatFull.linked_peers.size();
        } else {
            i10 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i10, new Object[0]));
        this.f19581b.e(chat, new z8(chat));
    }

    @Override
    public final void d() {
        int i9 = f6.f23386z6;
        b6 b6Var = this.f19580a;
        this.f19583e.setColorFilter(f6.v0(i9, b6Var));
        this.f19582c.setTextColor(f6.v0(f6.G6, b6Var));
        this.d.setTextColor(f6.v0(i9, b6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = f6.S0;
        o9 o9Var = this.f19581b;
        s.a(canvas, drawable, (o9Var.getWidth() / 2.0f) + o9Var.getLeft(), (o9Var.getHeight() / 2.0f) + o9Var.getTop(), o9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f19582c.setText(charSequence);
    }
}
