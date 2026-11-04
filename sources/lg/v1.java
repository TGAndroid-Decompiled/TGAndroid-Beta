package lg;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import b8.mf;
import ci.ec;
import gi.l3;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
public final class v1 extends LinearLayout implements z5 {
    public final int f18493a = 0;
    public final e6 f18494b;
    public final TextView f18495c;
    public final View d;
    public final TextView f18496e;

    public v1(Activity activity, int i3, long j10, String str, e6 e6Var) {
        super(activity);
        setOrientation(1);
        this.f18494b = e6Var;
        TextView textView = new TextView(activity);
        this.f18495c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        textView.setGravity(17);
        ec ecVar = new ec(activity, 4);
        this.d = ecVar;
        ecVar.setTextAlignment(4);
        ecVar.setGravity(17);
        ecVar.setTextSize(1, 12.0f);
        ecVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ecVar.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ecVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i3 == 9) {
            imageView.setImageResource(2131231606);
            textView.setText(bd.M0(2131742906, null));
            ecVar.setText(bd.M0(2131742907, null));
            ecVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(ecVar.getText(), ecVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231606);
            textView.setText(bd.M0(2131752765, null));
            ecVar.setText(bd.M0(2131752766, null));
            ecVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(ecVar.getText(), ecVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231603);
            textView.setText(bd.M0(2131752833, null));
            ecVar.setText(bd.M0(2131752834, null));
            ecVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(ecVar.getText(), ecVar.getPaint())));
        } else {
            if (i3 == 5) {
                imageView.setImageResource(2131231614);
                t1 c2 = u1.f(h10.f22829t0).c(j10);
                String str2 = c2 == null ? str : c2.f18474b;
                textView.setText(bd.M0(2131752667, null));
                ecVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                ecVar.setTextAlignment(2);
                ecVar.setGravity(3);
                ecVar.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752669, str2)));
                ecVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                ec ecVar2 = new ec(activity, 4);
                this.f18496e = ecVar2;
                ecVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                ecVar2.setTextAlignment(2);
                ecVar2.setGravity(3);
                ecVar2.setTextSize(1, 13.0f);
                ecVar2.setText(org.telegram.messenger.g0.X2(bd.M0(2131752668, null)));
                ecVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(imageView, mf.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, mf.t(-2, -2, 49, 20, 0, 20, 6));
        addView(ecVar, mf.t(-2, -2, 49, i11, 0, i11, ((ec) this.f18496e) == null ? 19 : 9));
        View view = (ec) this.f18496e;
        if (view != null) {
            addView(view, mf.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f18493a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(k6.G6));
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f18493a) {
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f18493a) {
            case 0:
                ec ecVar = (ec) this.d;
                TextView textView = this.f18495c;
                if (textView != null && ecVar != null) {
                    int i3 = k6.Wc;
                    e6 e6Var = this.f18494b;
                    textView.setTextColor(k6.w0(i3, e6Var));
                    ecVar.setTextColor(k6.w0(i3, e6Var));
                    ec ecVar2 = (ec) this.f18496e;
                    if (ecVar2 != null) {
                        ecVar2.setTextColor(k6.w0(i3, e6Var));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i10 = k6.G6;
                e6 e6Var2 = this.f18494b;
                ((ImageView) this.d).setColorFilter(new PorterDuffColorFilter(k6.w0(i10, e6Var2), PorterDuff.Mode.SRC_IN));
                this.f18495c.setTextColor(k6.w0(i10, e6Var2));
                this.f18496e.setTextColor(k6.r1(0.75f, k6.w0(i10, e6Var2)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public v1(Context context, mi.m0 m0Var, e6 e6Var) {
        super(context);
        this.f18494b = e6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f18495c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.f18496e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, mf.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), mf.p(0, -2, 1.0f, 119));
        addView(textView2, mf.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(m0Var.f19739a);
        textView.setText(m0Var.f19740b);
        textView2.setText((CharSequence) m0Var.f19741c.get(0));
        updateColors();
    }
}
