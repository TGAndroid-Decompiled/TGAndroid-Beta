package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class kq0 extends p21 {
    public final ylb a;
    public final iq0 b;
    public final jq0 c;
    public final TextView d;
    public final TextView e;
    public lq0 f;
    public int h;

    public kq0(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.h = 0;
        this.a = ylbVar;
        iq0 iq0Var = new iq0(gm.L(10.0f));
        iq0Var.a.setColor(cmb.v0(cmb.vj, ylbVar));
        this.b = iq0Var;
        setBackground(iq0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        jq0 jq0Var = new jq0(context, imageView);
        this.c = jq0Var;
        imageView.setImageDrawable(jq0Var);
        addView(imageView, qoe.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i = cmb.xj;
        anb.X(textView, i, ylbVar);
        textView.setTypeface(gm.o());
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = m;
        m.setTextSize(1, 13.0f);
        anb.X(m, i, ylbVar);
        linearLayout.addView(m, qoe.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i) {
        if (this.h != i) {
            this.h = i;
            if (i == 0) {
                setButton((o21) null);
                return;
            }
            ylb ylbVar = this.a;
            if (i == 1) {
                s31 s31Var = new s31(ylbVar, getContext(), true);
                s31Var.e(jb6.M0(2131753039, null));
                s31Var.b = new Runnable(this) {
                    public final kq0 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        byte b = r2;
                        kq0 kq0Var = this.b;
                        switch (b) {
                            case 0:
                                u31 bulletin = kq0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.j = 2750;
                                    bulletin.i(true);
                                }
                                lq0 lq0Var = kq0Var.f;
                                if (lq0Var != null) {
                                    lq0Var.a();
                                    return;
                                }
                                return;
                            default:
                                u31 bulletin2 = kq0Var.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                lq0 lq0Var2 = kq0Var.f;
                                if (lq0Var2 != null && (file = lq0Var2.d) != null && file.exists()) {
                                    File file2 = lq0Var2.d;
                                    gm.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    s31Var.d = getBulletin();
                }
                setButton(s31Var);
            } else if (i == 2) {
                s31 s31Var2 = new s31(ylbVar, getContext(), true);
                s31Var2.e(jb6.M0(2131753038, null));
                s31Var2.b = new Runnable(this) {
                    public final kq0 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        byte b = r2;
                        kq0 kq0Var = this.b;
                        switch (b) {
                            case 0:
                                u31 bulletin = kq0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.j = 2750;
                                    bulletin.i(true);
                                }
                                lq0 lq0Var = kq0Var.f;
                                if (lq0Var != null) {
                                    lq0Var.a();
                                    return;
                                }
                                return;
                            default:
                                u31 bulletin2 = kq0Var.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                lq0 lq0Var2 = kq0Var.f;
                                if (lq0Var2 != null && (file = lq0Var2.d) != null && file.exists()) {
                                    File file2 = lq0Var2.d;
                                    gm.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    s31Var2.d = getBulletin();
                }
                setButton(s31Var2);
            }
        }
    }

    public final boolean c(lq0 lq0Var) {
        boolean z;
        lq0 lq0Var2 = this.f;
        jq0 jq0Var = this.c;
        if (lq0Var2 != lq0Var) {
            ln lnVar = jq0Var.k;
            jq0Var.h = false;
            lnVar.getClass();
            lnVar.e(true, 0.0f);
            p09 p09Var = jq0Var.l;
            if (p09Var != null) {
                p09Var.x(true);
                jq0Var.l = null;
            }
            ln lnVar2 = jq0Var.i;
            jq0Var.f = false;
            lnVar2.getClass();
            lnVar2.e(true, 0.0f);
        }
        this.f = lq0Var;
        this.d.setText(lq0Var.c);
        boolean c = lq0Var.c();
        TextView textView = this.e;
        if (c) {
            Pair b = lq0Var.b();
            jq0Var.getClass();
            if (((Long) b.second).longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            jq0Var.f = z;
            if (z) {
                jq0Var.g = Utilities.i(((float) ((Long) b.first).longValue()) / ((float) ((Long) b.second).longValue()), 1.0f, 0.0f);
            }
            jq0Var.invalidateSelf();
            if (((Long) b.first).longValue() <= 0) {
                textView.setText(jb6.M0(2131753036, null));
            } else {
                int i = (((Long) b.second).longValue() > 0L ? 1 : (((Long) b.second).longValue() == 0L ? 0 : -1));
                Object obj = b.first;
                if (i <= 0) {
                    textView.setText(gm.i0(((Long) obj).longValue(), false, false));
                } else {
                    textView.setText(gm.i0(((Long) obj).longValue(), false, false) + " / " + gm.i0(((Long) b.second).longValue(), false, false));
                }
            }
            setButton(1);
            return false;
        } else if (lq0Var.i) {
            u31 bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (lq0Var.h) {
                textView.setText(jb6.M0(2131753037, null));
                setButton(2);
                if (!jq0Var.h) {
                    jq0Var.h = true;
                    p09 p09Var2 = new p09(2131623990, gm.L(40.0f), gm.L(40.0f));
                    jq0Var.l = p09Var2;
                    p09Var2.M(jq0Var.a);
                    jq0Var.l.E(true);
                    jq0Var.l.start();
                    jq0Var.g = 1.0f;
                }
                u31 bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(68.0f), 1073741824));
    }

    public void setArrow(int i) {
        boolean z;
        iq0 iq0Var = this.b;
        iq0Var.getClass();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        iq0Var.e = z;
        if (z) {
            iq0Var.f = i;
        }
        iq0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        iq0 iq0Var = this.b;
        if (iq0Var != null) {
            try {
                iq0Var.a.setColor(cmb.v0(cmb.vj, this.a));
                iq0Var.invalidateSelf();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
