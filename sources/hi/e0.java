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
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.zb;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
public final class e0 extends ya {
    public final h6 f14624a;
    public final c0 f14625b;
    public final d0 f14626c;
    public final TextView d;
    public final TextView f14627e;
    public f0 f14628f;
    public int h;

    public e0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.h = 0;
        this.f14624a = h6Var;
        c0 c0Var = new c0(org.telegram.messenger.g0.L(10.0f));
        c0Var.f14578a.setColor(m6.w0(m6.tj, h6Var));
        this.f14625b = c0Var;
        setBackground(c0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d0 d0Var = new d0(context, imageView);
        this.f14626c = d0Var;
        imageView.setImageDrawable(d0Var);
        addView(imageView, ha.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = m6.vj;
        t6.U(textView, i7, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, ha.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f14627e = f10;
        f10.setTextSize(1, 13.0f);
        t6.U(f10, i7, h6Var);
        linearLayout.addView(f10, ha.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h != i7) {
            this.h = i7;
            if (i7 == 0) {
                setButton((xa) null);
                return;
            }
            h6 h6Var = this.f14624a;
            if (i7 == 1) {
                zb zbVar = new zb(getContext(), h6Var, true);
                zbVar.e(id.M0(2131753074, null));
                zbVar.f40908b = new Runnable(this) {
                    public final e0 f14552b;

                    {
                        this.f14552b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f14552b;
                                bc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f32203j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f14628f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f14552b;
                                bc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f14628f;
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
                    zbVar.d = getBulletin();
                }
                setButton(zbVar);
            } else if (i7 == 2) {
                zb zbVar2 = new zb(getContext(), h6Var, true);
                zbVar2.e(id.M0(2131753073, null));
                zbVar2.f40908b = new Runnable(this) {
                    public final e0 f14552b;

                    {
                        this.f14552b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                e0 e0Var = this.f14552b;
                                bc bulletin = e0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f32203j = 2750;
                                    bulletin.i(true);
                                }
                                f0 f0Var = e0Var.f14628f;
                                if (f0Var != null) {
                                    f0Var.a();
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var2 = this.f14552b;
                                bc bulletin2 = e0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                f0 f0Var2 = e0Var2.f14628f;
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
                    zbVar2.d = getBulletin();
                }
                setButton(zbVar2);
            }
        }
    }

    public final boolean c(f0 f0Var) {
        boolean z9;
        f0 f0Var2 = this.f14628f;
        d0 d0Var = this.f14626c;
        if (f0Var2 != f0Var) {
            v5 v5Var = d0Var.f14610k;
            d0Var.h = false;
            v5Var.getClass();
            v5Var.e(true, 0.0f);
            zg0 zg0Var = d0Var.f14611l;
            if (zg0Var != null) {
                zg0Var.C(true);
                d0Var.f14611l = null;
            }
            v5 v5Var2 = d0Var.f14608i;
            d0Var.f14606f = false;
            v5Var2.getClass();
            v5Var2.e(true, 0.0f);
        }
        this.f14628f = f0Var;
        this.d.setText(f0Var.f14642c);
        boolean c10 = f0Var.c();
        TextView textView = this.f14627e;
        if (c10) {
            Pair b10 = f0Var.b();
            d0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            d0Var.f14606f = z9;
            if (z9) {
                d0Var.f14607g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            d0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(id.M0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (f0Var.f14646i) {
            bc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (f0Var.h) {
                textView.setText(id.M0(2131753072, null));
                setButton(2);
                if (!d0Var.h) {
                    d0Var.h = true;
                    zg0 zg0Var2 = new zg0(2131623989, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    d0Var.f14611l = zg0Var2;
                    zg0Var2.R(d0Var.f14602a);
                    d0Var.f14611l.J(true);
                    d0Var.f14611l.start();
                    d0Var.f14607g = 1.0f;
                }
                bc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f32203j = 5000;
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
        c0 c0Var = this.f14625b;
        c0Var.getClass();
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        c0Var.f14581e = z9;
        if (z9) {
            c0Var.f14582f = i7;
        }
        c0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        c0 c0Var = this.f14625b;
        if (c0Var != null) {
            try {
                c0Var.f14578a.setColor(m6.w0(m6.tj, this.f14624a));
                c0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
