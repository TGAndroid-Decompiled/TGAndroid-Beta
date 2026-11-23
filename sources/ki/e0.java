package ki;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.LaunchActivity;
public final class e0 extends eb {
    public final h6 f18660a;
    public final c0 f18661b;
    public final d0 f18662c;
    public final TextView d;
    public final TextView f18663e;
    public f0 f18664f;
    public int h;

    public e0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.h = 0;
        this.f18660a = h6Var;
        c0 c0Var = new c0(org.telegram.messenger.g0.L(10.0f));
        c0Var.f18632a.setColor(m6.w0(m6.wj, h6Var));
        this.f18661b = c0Var;
        setBackground(c0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d0 d0Var = new d0(context, imageView);
        this.f18662c = d0Var;
        imageView.setImageDrawable(d0Var);
        addView(imageView, ma.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = m6.yj;
        t6.U(textView, i7, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = o10.f(linearLayout, textView, ma.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f18663e = f10;
        f10.setTextSize(1, 13.0f);
        t6.U(f10, i7, h6Var);
        linearLayout.addView(f10, ma.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h != i7) {
            this.h = i7;
            if (i7 == 0) {
                setButton((db) null);
                return;
            }
            h6 h6Var = this.f18660a;
            if (i7 == 1) {
                ec ecVar = new ec(getContext(), h6Var, true);
                ecVar.e(hd.N0(2131753071, null));
                ecVar.f34725b = new Runnable(this) {
                    public final e0 f18611b;

                    {
                        this.f18611b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f18611b;
                                gc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f35527j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f18664f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f18611b;
                                gc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f18664f;
                                if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                    File file2 = f0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ecVar.d = getBulletin();
                }
                setButton(ecVar);
            } else if (i7 == 2) {
                ec ecVar2 = new ec(getContext(), h6Var, true);
                ecVar2.e(hd.N0(2131753070, null));
                ecVar2.f34725b = new Runnable(this) {
                    public final e0 f18611b;

                    {
                        this.f18611b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f18611b;
                                gc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f35527j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f18664f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f18611b;
                                gc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f18664f;
                                if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                    File file2 = f0Var2.d;
                                    org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ecVar2.d = getBulletin();
                }
                setButton(ecVar2);
            }
        }
    }

    public final boolean c(f0 f0Var) {
        boolean z10;
        f0 f0Var2 = this.f18664f;
        d0 d0Var = this.f18662c;
        if (f0Var2 != f0Var) {
            d6 d6Var = d0Var.f18651k;
            d0Var.h = false;
            d6Var.getClass();
            d6Var.e(true, 0.0f);
            oh0 oh0Var = d0Var.f18652l;
            if (oh0Var != null) {
                oh0Var.C(true);
                d0Var.f18652l = null;
            }
            d6 d6Var2 = d0Var.f18649i;
            d0Var.f18647f = false;
            d6Var2.getClass();
            d6Var2.e(true, 0.0f);
        }
        this.f18664f = f0Var;
        this.d.setText(f0Var.f18694c);
        boolean c10 = f0Var.c();
        TextView textView = this.f18663e;
        if (c10) {
            Pair b10 = f0Var.b();
            d0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var.f18647f = z10;
            if (z10) {
                d0Var.f18648g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            d0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(hd.N0(2131753068, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (f0Var.f18698i) {
            gc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (f0Var.h) {
                textView.setText(hd.N0(2131753069, null));
                setButton(2);
                if (!d0Var.h) {
                    d0Var.h = true;
                    oh0 oh0Var2 = new oh0(2131623990, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    d0Var.f18652l = oh0Var2;
                    oh0Var2.R(d0Var.f18643a);
                    d0Var.f18652l.J(true);
                    d0Var.f18652l.start();
                    d0Var.f18648g = 1.0f;
                }
                gc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f35527j = 5000;
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
        c0 c0Var = this.f18661b;
        c0Var.getClass();
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0Var.f18635e = z10;
        if (z10) {
            c0Var.f18636f = i7;
        }
        c0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        c0 c0Var = this.f18661b;
        if (c0Var != null) {
            try {
                c0Var.f18632a.setColor(m6.w0(m6.wj, this.f18660a));
                c0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
