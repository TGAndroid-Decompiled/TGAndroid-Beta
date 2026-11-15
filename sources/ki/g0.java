package ki;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
public final class g0 extends va {
    public final e6 f18310a;
    public final e0 f18311b;
    public final f0 f18312c;
    public final TextView d;
    public final TextView f18313e;
    public h0 f18314f;
    public int h;

    public g0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.h = 0;
        this.f18310a = e6Var;
        e0 e0Var = new e0(org.telegram.messenger.g0.L(10.0f));
        e0Var.f18273a.setColor(j6.w0(j6.wj, e6Var));
        this.f18311b = e0Var;
        setBackground(e0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0 f0Var = new f0(context, imageView);
        this.f18312c = f0Var;
        imageView.setImageDrawable(f0Var);
        addView(imageView, ja.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ja.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = j6.yj;
        q6.U(textView, i7, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = i20.f(linearLayout, textView, ja.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f18313e = f10;
        f10.setTextSize(1, 13.0f);
        q6.U(f10, i7, e6Var);
        linearLayout.addView(f10, ja.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h != i7) {
            this.h = i7;
            if (i7 == 0) {
                setButton((ua) null);
                return;
            }
            e6 e6Var = this.f18310a;
            if (i7 == 1) {
                vb vbVar = new vb(getContext(), e6Var, true);
                vbVar.e(hd.M0(2131753074, null));
                vbVar.f40372b = new Runnable(this) {
                    public final g0 f18251b;

                    {
                        this.f18251b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                g0 g0Var = this.f18251b;
                                xb bulletin = g0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f41635j = 2750;
                                    bulletin.i(true);
                                }
                                h0 h0Var = g0Var.f18314f;
                                if (h0Var != null) {
                                    h0Var.a();
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var2 = this.f18251b;
                                xb bulletin2 = g0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                h0 h0Var2 = g0Var2.f18314f;
                                if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                    File file2 = h0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    vbVar.d = getBulletin();
                }
                setButton(vbVar);
            } else if (i7 == 2) {
                vb vbVar2 = new vb(getContext(), e6Var, true);
                vbVar2.e(hd.M0(2131753073, null));
                vbVar2.f40372b = new Runnable(this) {
                    public final g0 f18251b;

                    {
                        this.f18251b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                g0 g0Var = this.f18251b;
                                xb bulletin = g0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f41635j = 2750;
                                    bulletin.i(true);
                                }
                                h0 h0Var = g0Var.f18314f;
                                if (h0Var != null) {
                                    h0Var.a();
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var2 = this.f18251b;
                                xb bulletin2 = g0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                h0 h0Var2 = g0Var2.f18314f;
                                if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                    File file2 = h0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    vbVar2.d = getBulletin();
                }
                setButton(vbVar2);
            }
        }
    }

    public final boolean c(h0 h0Var) {
        boolean z10;
        h0 h0Var2 = this.f18314f;
        f0 f0Var = this.f18312c;
        if (h0Var2 != h0Var) {
            u5 u5Var = f0Var.f18297k;
            f0Var.h = false;
            u5Var.getClass();
            u5Var.e(true, 0.0f);
            ch0 ch0Var = f0Var.f18298l;
            if (ch0Var != null) {
                ch0Var.C(true);
                f0Var.f18298l = null;
            }
            u5 u5Var2 = f0Var.f18295i;
            f0Var.f18293f = false;
            u5Var2.getClass();
            u5Var2.e(true, 0.0f);
        }
        this.f18314f = h0Var;
        this.d.setText(h0Var.f18328c);
        boolean c10 = h0Var.c();
        TextView textView = this.f18313e;
        if (c10) {
            Pair b10 = h0Var.b();
            f0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f0Var.f18293f = z10;
            if (z10) {
                f0Var.f18294g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            f0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(hd.M0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (h0Var.f18332i) {
            xb bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (h0Var.h) {
                textView.setText(hd.M0(2131753072, null));
                setButton(2);
                if (!f0Var.h) {
                    f0Var.h = true;
                    ch0 ch0Var2 = new ch0(2131623990, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    f0Var.f18298l = ch0Var2;
                    ch0Var2.R(f0Var.f18289a);
                    f0Var.f18298l.J(true);
                    f0Var.f18298l.start();
                    f0Var.f18294g = 1.0f;
                }
                xb bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f41635j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), 1073741824));
    }

    public void setArrow(int i7) {
        boolean z10;
        e0 e0Var = this.f18311b;
        e0Var.getClass();
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e0Var.f18276e = z10;
        if (z10) {
            e0Var.f18277f = i7;
        }
        e0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        e0 e0Var = this.f18311b;
        if (e0Var != null) {
            try {
                e0Var.f18273a.setColor(j6.w0(j6.wj, this.f18310a));
                e0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
