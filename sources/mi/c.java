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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.p9;
public final class c extends FrameLayout implements c6 {
    public final i6 f21105a;
    public final p9 f21106b;
    public final TextView f21107c;
    public final TextView d;
    public final ImageView f21108e;

    public c(Context context, i6 i6Var) {
        super(context);
        this.f21105a = i6Var;
        p9 p9Var = new p9(context);
        this.f21106b = p9Var;
        p9Var.setRoundRadius(g0.L(9.0f));
        addView(p9Var, na.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f21107c = textView;
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
        this.f21108e = imageView;
        imageView.setImageResource(2131232194);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, na.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i7, TLRPC.Chat chat) {
        int i10;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull P0 = mp.u1(i7).P0(chat.f28492id);
        setTitle(n5.u(chat));
        if (P0 != null) {
            i10 = P0.linked_peers.size();
        } else {
            i10 = 0;
        }
        setSubtitle(gd.G(i10, "CommunityWithChats", new Object[0]));
        this.f21106b.f(chat, new a9(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.f29862z6));
        hashSet.add(Integer.valueOf(n6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = n6.S0;
        p9 p9Var = this.f21106b;
        t.a(canvas, drawable, (p9Var.getWidth() / 2.0f) + p9Var.getLeft(), (p9Var.getHeight() / 2.0f) + p9Var.getTop(), p9Var.getHeight());
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
        this.f21107c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = n6.f29862z6;
        i6 i6Var = this.f21105a;
        this.f21108e.setColorFilter(n6.w0(i7, i6Var));
        this.f21107c.setTextColor(n6.w0(n6.G6, i6Var));
        this.d.setTextColor(n6.w0(i7, i6Var));
    }
}
