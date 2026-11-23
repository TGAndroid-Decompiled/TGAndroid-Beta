package ki;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.LaunchActivity;
public final class e0 extends db {
    public final i6 f18727a;
    public final c0 f18728b;
    public final d0 f18729c;
    public final TextView d;
    public final TextView f18730e;
    public f0 f18731f;
    public int h;

    public e0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.h = 0;
        this.f18727a = i6Var;
        c0 c0Var = new c0(org.telegram.messenger.g0.L(10.0f));
        c0Var.f18689a.setColor(n6.w0(n6.wj, i6Var));
        this.f18728b = c0Var;
        setBackground(c0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d0 d0Var = new d0(context, imageView);
        this.f18729c = d0Var;
        imageView.setImageDrawable(d0Var);
        addView(imageView, na.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, na.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = n6.yj;
        u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = m10.f(linearLayout, textView, na.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f18730e = f10;
        f10.setTextSize(1, 13.0f);
        u6.U(f10, i7, i6Var);
        linearLayout.addView(f10, na.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h != i7) {
            this.h = i7;
            if (i7 == 0) {
                setButton((cb) null);
                return;
            }
            i6 i6Var = this.f18727a;
            if (i7 == 1) {
                dc dcVar = new dc(getContext(), i6Var, true);
                dcVar.e(gd.N0(2131753071, null));
                dcVar.f34267b = new Runnable(this) {
                    public final e0 f18678b;

                    {
                        this.f18678b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f18678b;
                                fc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f35091j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f18731f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f18678b;
                                fc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f18731f;
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
                    dcVar.d = getBulletin();
                }
                setButton(dcVar);
            } else if (i7 == 2) {
                dc dcVar2 = new dc(getContext(), i6Var, true);
                dcVar2.e(gd.N0(2131753070, null));
                dcVar2.f34267b = new Runnable(this) {
                    public final e0 f18678b;

                    {
                        this.f18678b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f18678b;
                                fc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f35091j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f18731f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f18678b;
                                fc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f18731f;
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
                    dcVar2.d = getBulletin();
                }
                setButton(dcVar2);
            }
        }
    }

    public final boolean c(f0 f0Var) {
        boolean z10;
        f0 f0Var2 = this.f18731f;
        d0 d0Var = this.f18729c;
        if (f0Var2 != f0Var) {
            c6 c6Var = d0Var.f18721k;
            d0Var.h = false;
            c6Var.getClass();
            c6Var.e(true, 0.0f);
            nh0 nh0Var = d0Var.f18722l;
            if (nh0Var != null) {
                nh0Var.C(true);
                d0Var.f18722l = null;
            }
            c6 c6Var2 = d0Var.f18719i;
            d0Var.f18717f = false;
            c6Var2.getClass();
            c6Var2.e(true, 0.0f);
        }
        this.f18731f = f0Var;
        this.d.setText(f0Var.f18741c);
        boolean c10 = f0Var.c();
        TextView textView = this.f18730e;
        if (c10) {
            Pair b10 = f0Var.b();
            d0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var.f18717f = z10;
            if (z10) {
                d0Var.f18718g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            d0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(gd.N0(2131753068, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (f0Var.f18745i) {
            fc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (f0Var.h) {
                textView.setText(gd.N0(2131753069, null));
                setButton(2);
                if (!d0Var.h) {
                    d0Var.h = true;
                    nh0 nh0Var2 = new nh0(2131623990, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    d0Var.f18722l = nh0Var2;
                    nh0Var2.R(d0Var.f18713a);
                    d0Var.f18722l.J(true);
                    d0Var.f18722l.start();
                    d0Var.f18718g = 1.0f;
                }
                fc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f35091j = 5000;
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
        c0 c0Var = this.f18728b;
        c0Var.getClass();
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0Var.f18692e = z10;
        if (z10) {
            c0Var.f18693f = i7;
        }
        c0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        c0 c0Var = this.f18728b;
        if (c0Var != null) {
            try {
                c0Var.f18689a.setColor(n6.w0(n6.wj, this.f18727a));
                c0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
