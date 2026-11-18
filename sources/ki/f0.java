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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.LaunchActivity;
public final class f0 extends eb {
    public final i6 f18650a;
    public final d0 f18651b;
    public final e0 f18652c;
    public final TextView d;
    public final TextView f18653e;
    public g0 f18654f;
    public int h;

    public f0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.h = 0;
        this.f18650a = i6Var;
        d0 d0Var = new d0(org.telegram.messenger.g0.L(10.0f));
        d0Var.f18622a.setColor(n6.w0(n6.wj, i6Var));
        this.f18651b = d0Var;
        setBackground(d0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e0 e0Var = new e0(context, imageView);
        this.f18652c = e0Var;
        imageView.setImageDrawable(e0Var);
        addView(imageView, ma.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = n6.yj;
        u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f18653e = f10;
        f10.setTextSize(1, 13.0f);
        u6.U(f10, i7, i6Var);
        linearLayout.addView(f10, ma.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h != i7) {
            this.h = i7;
            if (i7 == 0) {
                setButton((db) null);
                return;
            }
            i6 i6Var = this.f18650a;
            if (i7 == 1) {
                ec ecVar = new ec(getContext(), i6Var, true);
                ecVar.e(gd.M0(2131753072, null));
                ecVar.f34666b = new Runnable(this) {
                    public final f0 f18603b;

                    {
                        this.f18603b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                f0 f0Var = this.f18603b;
                                gc bulletin = f0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f35461j = 2750;
                                    bulletin.i(true);
                                }
                                g0 g0Var = f0Var.f18654f;
                                if (g0Var != null) {
                                    g0Var.a();
                                    return;
                                }
                                return;
                            default:
                                f0 f0Var2 = this.f18603b;
                                gc bulletin2 = f0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                g0 g0Var2 = f0Var2.f18654f;
                                if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                    File file2 = g0Var2.d;
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
                ec ecVar2 = new ec(getContext(), i6Var, true);
                ecVar2.e(gd.M0(2131753071, null));
                ecVar2.f34666b = new Runnable(this) {
                    public final f0 f18603b;

                    {
                        this.f18603b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                f0 f0Var = this.f18603b;
                                gc bulletin = f0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f35461j = 2750;
                                    bulletin.i(true);
                                }
                                g0 g0Var = f0Var.f18654f;
                                if (g0Var != null) {
                                    g0Var.a();
                                    return;
                                }
                                return;
                            default:
                                f0 f0Var2 = this.f18603b;
                                gc bulletin2 = f0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                g0 g0Var2 = f0Var2.f18654f;
                                if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                    File file2 = g0Var2.d;
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

    public final boolean c(g0 g0Var) {
        boolean z10;
        g0 g0Var2 = this.f18654f;
        e0 e0Var = this.f18652c;
        if (g0Var2 != g0Var) {
            c6 c6Var = e0Var.f18641k;
            e0Var.h = false;
            c6Var.getClass();
            c6Var.e(true, 0.0f);
            mh0 mh0Var = e0Var.f18642l;
            if (mh0Var != null) {
                mh0Var.C(true);
                e0Var.f18642l = null;
            }
            c6 c6Var2 = e0Var.f18639i;
            e0Var.f18637f = false;
            c6Var2.getClass();
            c6Var2.e(true, 0.0f);
        }
        this.f18654f = g0Var;
        this.d.setText(g0Var.f18684c);
        boolean c10 = g0Var.c();
        TextView textView = this.f18653e;
        if (c10) {
            Pair b10 = g0Var.b();
            e0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e0Var.f18637f = z10;
            if (z10) {
                e0Var.f18638g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            e0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(gd.M0(2131753069, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (g0Var.f18688i) {
            gc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (g0Var.h) {
                textView.setText(gd.M0(2131753070, null));
                setButton(2);
                if (!e0Var.h) {
                    e0Var.h = true;
                    mh0 mh0Var2 = new mh0(2131623990, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    e0Var.f18642l = mh0Var2;
                    mh0Var2.R(e0Var.f18633a);
                    e0Var.f18642l.J(true);
                    e0Var.f18642l.start();
                    e0Var.f18638g = 1.0f;
                }
                gc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f35461j = 5000;
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
        d0 d0Var = this.f18651b;
        d0Var.getClass();
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d0Var.f18625e = z10;
        if (z10) {
            d0Var.f18626f = i7;
        }
        d0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        d0 d0Var = this.f18651b;
        if (d0Var != null) {
            try {
                d0Var.f18622a.setColor(n6.w0(n6.wj, this.f18650a));
                d0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
