package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import c8.na;
import di.xb;
import hi.l3;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class x1 extends LinearLayout implements b6 {
    public final int f18528a = 0;
    public final h6 f18529b;
    public final TextView f18530c;
    public final View d;
    public final TextView f18531e;

    public x1(Activity activity, int i7, long j3, String str, h6 h6Var) {
        super(activity);
        setOrientation(1);
        this.f18529b = h6Var;
        TextView textView = new TextView(activity);
        this.f18530c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        textView.setGravity(17);
        xb xbVar = new xb(activity, 2);
        this.d = xbVar;
        xbVar.setTextAlignment(4);
        xbVar.setGravity(17);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        xbVar.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        xbVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i7 == 9) {
            imageView.setImageResource(2131231607);
            textView.setText(hd.N0(2131742632, null));
            xbVar.setText(hd.N0(2131742633, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(xbVar.getText(), xbVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231607);
            textView.setText(hd.N0(2131752753, null));
            xbVar.setText(hd.N0(2131752754, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(xbVar.getText(), xbVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231604);
            textView.setText(hd.N0(2131752821, null));
            xbVar.setText(hd.N0(2131752822, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(xbVar.getText(), xbVar.getPaint())));
        } else {
            if (i7 == 5) {
                imageView.setImageResource(2131231615);
                v1 c10 = w1.f(k10.f24932t0).c(j3);
                String str2 = c10 == null ? str : c10.f18506b;
                textView.setText(hd.N0(2131752655, null));
                xbVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                xbVar.setTextAlignment(2);
                xbVar.setGravity(3);
                xbVar.setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752657, str2)));
                xbVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                xb xbVar2 = new xb(activity, 2);
                this.f18531e = xbVar2;
                xbVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                xbVar2.setTextAlignment(2);
                xbVar2.setGravity(3);
                xbVar2.setTextSize(1, 13.0f);
                xbVar2.setText(org.telegram.messenger.g0.W2(hd.N0(2131752656, null)));
                xbVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(imageView, na.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, na.t(-2, -2, 49, 20, 0, 20, 6));
        addView(xbVar, na.t(-2, -2, 49, i11, 0, i11, ((xb) this.f18531e) == null ? 19 : 9));
        View view = (xb) this.f18531e;
        if (view != null) {
            addView(view, na.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f18528a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(m6.G6));
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f18528a) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f18528a) {
            case 0:
                xb xbVar = (xb) this.d;
                TextView textView = this.f18530c;
                if (textView != null && xbVar != null) {
                    int i7 = m6.Zc;
                    h6 h6Var = this.f18529b;
                    textView.setTextColor(m6.w0(i7, h6Var));
                    xbVar.setTextColor(m6.w0(i7, h6Var));
                    xb xbVar2 = (xb) this.f18531e;
                    if (xbVar2 != null) {
                        xbVar2.setTextColor(m6.w0(i7, h6Var));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i10 = m6.G6;
                h6 h6Var2 = this.f18529b;
                ((ImageView) this.d).setColorFilter(new PorterDuffColorFilter(m6.w0(i10, h6Var2), PorterDuff.Mode.SRC_IN));
                this.f18530c.setTextColor(m6.w0(i10, h6Var2));
                this.f18531e.setTextColor(m6.r1(0.75f, m6.w0(i10, h6Var2)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public x1(Context context, oi.j0 j0Var, h6 h6Var) {
        super(context);
        this.f18529b = h6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, na.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f18530c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.f18531e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, na.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), na.p(0, -2, 1.0f, 119));
        addView(textView2, na.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(j0Var.f22141a);
        textView.setText(j0Var.f22142b);
        textView2.setText((CharSequence) j0Var.f22143c.get(0));
        updateColors();
    }
}
