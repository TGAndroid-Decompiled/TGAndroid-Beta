package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class bp4 extends FrameLayout implements snb {
    public final vnb a;
    public final ImageView b;
    public final TextView c;
    public int d;
    public boolean e;

    public bp4(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232062);
        addView(imageView, tre.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(ob6.M0(2131751131, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, tre.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f) {
        return vm2.o(aob.v0(aob.Nl, this.a), (int) (f * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Nl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.c.setTextColor(a(0.6f));
        int a = a(1.0f);
        if (this.e && a == this.d) {
            return;
        }
        this.e = true;
        this.d = a;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            aob.F1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(aob.f0(a(0.1f), 1, -1));
        }
    }
}
