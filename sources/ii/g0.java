package ii;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
public final class g0 extends ya {
    public final e6 f14946a;
    public final e0 f14947b;
    public final f0 f14948c;
    public final TextView d;
    public final TextView f14949e;
    public h0 f14950f;
    public int h;

    public g0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.h = 0;
        this.f14946a = e6Var;
        e0 e0Var = new e0(org.telegram.messenger.g0.L(10.0f));
        e0Var.f14907a.setColor(k6.w0(k6.tj, e6Var));
        this.f14947b = e0Var;
        setBackground(e0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0 f0Var = new f0(context, imageView);
        this.f14948c = f0Var;
        imageView.setImageDrawable(f0Var);
        addView(imageView, mf.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, mf.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i3 = k6.vj;
        r6.V(textView, i3, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f14949e = f10;
        f10.setTextSize(1, 13.0f);
        r6.V(f10, i3, e6Var);
        linearLayout.addView(f10, mf.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i3) {
        if (this.h != i3) {
            this.h = i3;
            if (i3 == 0) {
                setButton((xa) null);
                return;
            }
            e6 e6Var = this.f14946a;
            if (i3 == 1) {
                yb ybVar = new yb(getContext(), e6Var, true);
                ybVar.e(bd.M0(2131753074, null));
                ybVar.f40672b = new Runnable(this) {
                    public final g0 f14888b;

                    {
                        this.f14888b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                g0 g0Var = this.f14888b;
                                ac bulletin = g0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f31792j = 2750;
                                    bulletin.i(true);
                                }
                                h0 h0Var = g0Var.f14950f;
                                if (h0Var != null) {
                                    h0Var.a();
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var2 = this.f14888b;
                                ac bulletin2 = g0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                h0 h0Var2 = g0Var2.f14950f;
                                if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                    File file2 = h0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.K1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ybVar.d = getBulletin();
                }
                setButton(ybVar);
            } else if (i3 == 2) {
                yb ybVar2 = new yb(getContext(), e6Var, true);
                ybVar2.e(bd.M0(2131753073, null));
                ybVar2.f40672b = new Runnable(this) {
                    public final g0 f14888b;

                    {
                        this.f14888b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                g0 g0Var = this.f14888b;
                                ac bulletin = g0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f31792j = 2750;
                                    bulletin.i(true);
                                }
                                h0 h0Var = g0Var.f14950f;
                                if (h0Var != null) {
                                    h0Var.a();
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var2 = this.f14888b;
                                ac bulletin2 = g0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                h0 h0Var2 = g0Var2.f14950f;
                                if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                    File file2 = h0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.K1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ybVar2.d = getBulletin();
                }
                setButton(ybVar2);
            }
        }
    }

    public final boolean c(h0 h0Var) {
        boolean z10;
        h0 h0Var2 = this.f14950f;
        f0 f0Var = this.f14948c;
        if (h0Var2 != h0Var) {
            u5 u5Var = f0Var.f14933k;
            f0Var.h = false;
            u5Var.getClass();
            u5Var.e(true, 0.0f);
            ch0 ch0Var = f0Var.f14934l;
            if (ch0Var != null) {
                ch0Var.C(true);
                f0Var.f14934l = null;
            }
            u5 u5Var2 = f0Var.f14931i;
            f0Var.f14929f = false;
            u5Var2.getClass();
            u5Var2.e(true, 0.0f);
        }
        this.f14950f = h0Var;
        this.d.setText(h0Var.f14976c);
        boolean c2 = h0Var.c();
        TextView textView = this.f14949e;
        if (c2) {
            Pair b10 = h0Var.b();
            f0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f0Var.f14929f = z10;
            if (z10) {
                f0Var.f14930g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            f0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(bd.M0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (h0Var.f14980i) {
            ac bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (h0Var.h) {
                textView.setText(bd.M0(2131753072, null));
                setButton(2);
                if (!f0Var.h) {
                    f0Var.h = true;
                    ch0 ch0Var2 = new ch0(2131623989, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    f0Var.f14934l = ch0Var2;
                    ch0Var2.R(f0Var.f14925a);
                    f0Var.f14934l.J(true);
                    f0Var.f14934l.start();
                    f0Var.f14930g = 1.0f;
                }
                ac bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f31792j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), 1073741824));
    }

    public void setArrow(int i3) {
        boolean z10;
        e0 e0Var = this.f14947b;
        e0Var.getClass();
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e0Var.f14910e = z10;
        if (z10) {
            e0Var.f14911f = i3;
        }
        e0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        e0 e0Var = this.f14947b;
        if (e0Var != null) {
            try {
                e0Var.f14907a.setColor(k6.w0(k6.tj, this.f14946a));
                e0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
