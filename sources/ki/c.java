package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import cg.r;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
public final class c extends FrameLayout implements z5 {
    public final e6 f17319a;
    public final k9 f17320b;
    public final TextView f17321c;
    public final TextView d;
    public final ImageView f17322e;

    public c(Context context, e6 e6Var) {
        super(context);
        this.f17319a = e6Var;
        k9 k9Var = new k9(context);
        this.f17320b = k9Var;
        k9Var.setRoundRadius(g0.L(9.0f));
        addView(k9Var, mf.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f17321c = textView;
        textView.setTypeface(g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, mf.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, mf.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f17322e = imageView;
        imageView.setImageResource(2131232189);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i3, TLRPC.Chat chat) {
        int i10;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull N0 = hp.s1(i3).N0(chat.f27001id);
        setTitle(m5.u(chat));
        if (N0 != null) {
            i10 = N0.linked_peers.size();
        } else {
            i10 = 0;
        }
        setSubtitle(bd.G(i10, "CommunityWithChats", new Object[0]));
        this.f17320b.e(chat, new u8(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f28290z6));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = k6.S0;
        k9 k9Var = this.f17320b;
        r.a(canvas, drawable, (k9Var.getWidth() / 2.0f) + k9Var.getLeft(), (k9Var.getHeight() / 2.0f) + k9Var.getTop(), k9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(g0.L(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17321c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i3 = k6.f28290z6;
        e6 e6Var = this.f17319a;
        this.f17322e.setColorFilter(k6.w0(i3, e6Var));
        this.f17321c.setTextColor(k6.w0(k6.G6, e6Var));
        this.d.setTextColor(k6.w0(i3, e6Var));
    }
}
