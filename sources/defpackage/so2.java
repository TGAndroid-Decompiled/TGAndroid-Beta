package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class so2 extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public so2(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(9.0f));
        addView(bf0Var, qoe.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, qoe.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232195);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i, TLRPC.Chat chat) {
        int i2;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull M0 = oc7.r1(i).M0(chat.id);
        setTitle(pg3.t(chat));
        if (M0 != null) {
            i2 = M0.linked_peers.size();
        } else {
            i2 = 0;
        }
        setSubtitle(jb6.G(i2, "CommunityWithChats", new Object[0]));
        this.b.f(chat, new pc0(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = cmb.R0;
        bf0 bf0Var = this.b;
        ur3.a(canvas, drawable, (bf0Var.getWidth() / 2.0f) + bf0Var.getLeft(), (bf0Var.getHeight() / 2.0f) + bf0Var.getTop(), bf0Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i = cmb.y6;
        ylb ylbVar = this.a;
        this.e.setColorFilter(cmb.v0(i, ylbVar));
        this.c.setTextColor(cmb.v0(cmb.F6, ylbVar));
        this.d.setTextColor(cmb.v0(i, ylbVar));
    }
}
