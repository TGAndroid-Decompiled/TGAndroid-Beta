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
import bg.s;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
public final class c extends FrameLayout implements z5 {
    public final e6 f20651a;
    public final i9 f20652b;
    public final TextView f20653c;
    public final TextView d;
    public final ImageView f20654e;

    public c(Context context, e6 e6Var) {
        super(context);
        this.f20651a = e6Var;
        i9 i9Var = new i9(context);
        this.f20652b = i9Var;
        i9Var.setRoundRadius(g0.L(9.0f));
        addView(i9Var, ja.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f20653c = textView;
        textView.setTypeface(g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ja.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ja.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, ja.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f20654e = imageView;
        imageView.setImageResource(2131232190);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ja.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i7, TLRPC.Chat chat) {
        int i10;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull N0 = np.s1(i7).N0(chat.f28051id);
        setTitle(m5.u(chat));
        if (N0 != null) {
            i10 = N0.linked_peers.size();
        } else {
            i10 = 0;
        }
        setSubtitle(hd.G(i10, "CommunityWithChats", new Object[0]));
        this.f20652b.f(chat, new t8(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.f29260z6));
        hashSet.add(Integer.valueOf(j6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = j6.S0;
        i9 i9Var = this.f20652b;
        s.a(canvas, drawable, (i9Var.getWidth() / 2.0f) + i9Var.getLeft(), (i9Var.getHeight() / 2.0f) + i9Var.getTop(), i9Var.getHeight());
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
        this.f20653c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = j6.f29260z6;
        e6 e6Var = this.f20651a;
        this.f20654e.setColorFilter(j6.w0(i7, e6Var));
        this.f20653c.setTextColor(j6.w0(j6.G6, e6Var));
        this.d.setTextColor(j6.w0(i7, e6Var));
    }
}
