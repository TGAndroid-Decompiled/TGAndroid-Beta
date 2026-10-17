package ii;

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
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.z5;
import zf.p;
public final class b extends FrameLayout implements y5 {
    public final d6 f13149a;
    public final w9 f13150b;
    public final TextView f13151c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f13149a = d6Var;
        w9 w9Var = new w9(context);
        this.f13150b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(w9Var, z5.a(32.0f, 20.0f, 0.0f, 0.0f, 0.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f13151c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, z5.a(-2.0f, 67.0f, 0.0f, 48.0f, 1.0f, -1, 19));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, z5.a(24.0f, 0.0f, 0.0f, 11.0f, 0.0f, 24, 21));
        d();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f20272id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f13150b.e(chat, new h9(chat));
    }

    @Override
    public final void d() {
        int i10 = h6.f21391z6;
        d6 d6Var = this.f13149a;
        this.e.setColorFilter(h6.w0(i10, d6Var));
        this.f13151c.setTextColor(h6.w0(h6.G6, d6Var));
        this.d.setTextColor(h6.w0(i10, d6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = h6.S0;
        w9 w9Var = this.f13150b;
        p.a(canvas, drawable, (w9Var.getWidth() / 2.0f) + w9Var.getLeft(), (w9Var.getHeight() / 2.0f) + w9Var.getTop(), w9Var.getHeight());
        super.dispatchDraw(canvas);
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
        this.f13151c.setText(charSequence);
    }
}
