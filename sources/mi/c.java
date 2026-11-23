package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.t;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
public final class c extends FrameLayout implements b6 {
    public final h6 f21009a;
    public final q9 f21010b;
    public final TextView f21011c;
    public final TextView d;
    public final ImageView f21012e;

    public c(Context context, h6 h6Var) {
        super(context);
        this.f21009a = h6Var;
        q9 q9Var = new q9(context);
        this.f21010b = q9Var;
        q9Var.setRoundRadius(g0.L(9.0f));
        addView(q9Var, na.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f21011c = textView;
        textView.setTypeface(g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, na.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, na.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, na.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f21012e = imageView;
        imageView.setImageResource(2131232191);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, na.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i7, TLRPC.Chat chat) {
        int i10;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull P0 = np.u1(i7).P0(chat.f28398id);
        setTitle(n5.u(chat));
        if (P0 != null) {
            i10 = P0.linked_peers.size();
        } else {
            i10 = 0;
        }
        setSubtitle(hd.G(i10, "CommunityWithChats", new Object[0]));
        this.f21010b.f(chat, new b9(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29758z6));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = m6.S0;
        q9 q9Var = this.f21010b;
        t.a(canvas, drawable, (q9Var.getWidth() / 2.0f) + q9Var.getLeft(), (q9Var.getHeight() / 2.0f) + q9Var.getTop(), q9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f21011c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f29758z6;
        h6 h6Var = this.f21009a;
        this.f21012e.setColorFilter(m6.w0(i7, h6Var));
        this.f21011c.setTextColor(m6.w0(m6.G6, h6Var));
        this.d.setTextColor(m6.w0(i7, h6Var));
    }
}
