package hi;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
public final class e0 extends za {
    public final f6 f14622a;
    public final c0 f14623b;
    public final d0 f14624c;
    public final TextView d;
    public final TextView f14625e;
    public f0 f14626f;
    public int h;

    public e0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h = 0;
        this.f14622a = f6Var;
        c0 c0Var = new c0(org.telegram.messenger.g0.L(10.0f));
        c0Var.f14576a.setColor(k6.w0(k6.tj, f6Var));
        this.f14623b = c0Var;
        setBackground(c0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d0 d0Var = new d0(context, imageView);
        this.f14624c = d0Var;
        imageView.setImageDrawable(d0Var);
        addView(imageView, ha.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = k6.vj;
        r6.V(textView, i7, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, ha.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f14625e = f10;
        f10.setTextSize(1, 13.0f);
        r6.V(f10, i7, f6Var);
        linearLayout.addView(f10, ha.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h != i7) {
            this.h = i7;
            if (i7 == 0) {
                setButton((ya) null);
                return;
            }
            f6 f6Var = this.f14622a;
            if (i7 == 1) {
                ac acVar = new ac(getContext(), f6Var, true);
                acVar.e(hd.M0(2131753074, null));
                acVar.f31756b = new Runnable(this) {
                    public final e0 f14550b;

                    {
                        this.f14550b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f14550b;
                                cc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f32514j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f14626f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f14550b;
                                cc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f14626f;
                                if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                    File file2 = f0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    acVar.d = getBulletin();
                }
                setButton(acVar);
            } else if (i7 == 2) {
                ac acVar2 = new ac(getContext(), f6Var, true);
                acVar2.e(hd.M0(2131753073, null));
                acVar2.f31756b = new Runnable(this) {
                    public final e0 f14550b;

                    {
                        this.f14550b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f14550b;
                                cc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f32514j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f14626f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f14550b;
                                cc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f14626f;
                                if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                    File file2 = f0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    acVar2.d = getBulletin();
                }
                setButton(acVar2);
            }
        }
    }

    public final boolean c(f0 f0Var) {
        boolean z9;
        f0 f0Var2 = this.f14626f;
        d0 d0Var = this.f14624c;
        if (f0Var2 != f0Var) {
            w5 w5Var = d0Var.f14608k;
            d0Var.h = false;
            w5Var.getClass();
            w5Var.e(true, 0.0f);
            zg0 zg0Var = d0Var.f14609l;
            if (zg0Var != null) {
                zg0Var.C(true);
                d0Var.f14609l = null;
            }
            w5 w5Var2 = d0Var.f14606i;
            d0Var.f14604f = false;
            w5Var2.getClass();
            w5Var2.e(true, 0.0f);
        }
        this.f14626f = f0Var;
        this.d.setText(f0Var.f14640c);
        boolean c10 = f0Var.c();
        TextView textView = this.f14625e;
        if (c10) {
            Pair b10 = f0Var.b();
            d0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            d0Var.f14604f = z9;
            if (z9) {
                d0Var.f14605g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            d0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(hd.M0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (f0Var.f14644i) {
            cc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (f0Var.h) {
                textView.setText(hd.M0(2131753072, null));
                setButton(2);
                if (!d0Var.h) {
                    d0Var.h = true;
                    zg0 zg0Var2 = new zg0(2131623989, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    d0Var.f14609l = zg0Var2;
                    zg0Var2.R(d0Var.f14600a);
                    d0Var.f14609l.J(true);
                    d0Var.f14609l.start();
                    d0Var.f14605g = 1.0f;
                }
                cc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f32514j = 5000;
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
        boolean z9;
        c0 c0Var = this.f14623b;
        c0Var.getClass();
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        c0Var.f14579e = z9;
        if (z9) {
            c0Var.f14580f = i7;
        }
        c0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        c0 c0Var = this.f14623b;
        if (c0Var != null) {
            try {
                c0Var.f14576a.setColor(k6.w0(k6.tj, this.f14622a));
                c0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
