package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class xu1 extends LinearLayout {
    public ImageView a;
    public TextView b;
    public Space c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.c == null) {
            this.c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.a;
    }

    public TextView getTextView() {
        return this.b;
    }

    public void setEditButton(boolean z) {
        this.d = z;
    }

    public void setOnlyIconMode(boolean z) {
        int i;
        TextView textView = this.b;
        int i2 = 0;
        if (textView != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        Space space = this.c;
        if (space != null) {
            if (z) {
                i2 = 8;
            }
            space.setVisibility(i2);
        }
    }
}
