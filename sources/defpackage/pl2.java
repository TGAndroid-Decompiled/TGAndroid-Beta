package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class pl2 extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public Drawable h;
    public ShapeDrawable n;
    public int r;

    public pl2(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setWillNotDraw(false);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(8.0f));
        addView(de0Var, tre.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, tre.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(hl.n1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, tre.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, tre.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        updateColors();
    }

    public static String b(TL_wallet.nftItem nftitem, String str) {
        ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_wallet.nftAttribute nftattribute = arrayList.get(i);
            i++;
            TL_wallet.nftAttribute nftattribute2 = nftattribute;
            if (TextUtils.equals(nftattribute2.trait_type, str)) {
                return nftattribute2.value;
            }
        }
        return null;
    }

    public static jn5 c(TL_wallet.nftItem nftitem, boolean z) {
        TLRPC.WebDocument webDocument;
        if ((!z || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return jn5.p(jxc.c(webDocument));
    }

    public void setGrid(boolean z) {
        FrameLayout.LayoutParams d;
        float f;
        int i;
        if (this.f == z) {
            return;
        }
        this.f = z;
        if (z) {
            d = tre.d(-1, -1.0f, 119, 3.33f, 4.0f, 3.33f, 4.0f);
        } else {
            d = tre.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        }
        de0 de0Var = this.b;
        de0Var.setLayoutParams(d);
        if (z) {
            f = 11.0f;
        } else {
            f = 8.0f;
        }
        de0Var.setRoundRadius(hl.L(f));
        View view = (View) this.c.getParent();
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        int v0;
        super.onDraw(canvas);
        if (this.h != null && this.n != null && (v0 = aob.v0(aob.y6, this.a)) != this.r) {
            this.r = v0;
            this.h.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            aob.A1(aob.p1(0.1f, v0), this.n);
            de0 de0Var = this.b;
            if (de0Var != null) {
                de0Var.invalidate();
            }
        }
        if (this.e) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(71.0f);
            }
            float f = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (ob6.a0) {
                i = hl.L(71.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f, height, width - i, getHeight(), aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.f) {
            f = 112.0f;
        } else {
            f = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }

    @Override
    public final void updateColors() {
        setBackgroundColor(0);
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.c.setTextColor(aob.v0(i, vnbVar));
        this.d.setTextColor(aob.v0(aob.z6, vnbVar));
    }
}
