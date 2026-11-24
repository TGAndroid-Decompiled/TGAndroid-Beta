package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class tw9 extends n39 {
    public final tx9 c;

    public tw9(tx9 tx9Var) {
        this.c = tx9Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i == 2 || i == 1 || i == 3 || i == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.v0;
    }

    @Override
    public final long c(int i) {
        return Math.abs(((Long) this.c.w0.get(i)).longValue());
    }

    @Override
    public final int d(int i) {
        tx9 tx9Var = this.c;
        if (i == tx9Var.a) {
            return 7;
        }
        if (i < tx9Var.b || i >= tx9Var.c) {
            if (i < tx9Var.d || i >= tx9Var.e) {
                if (i >= tx9Var.F && i < tx9Var.G) {
                    return 1;
                }
                if (i < tx9Var.r || i >= tx9Var.s) {
                    if (tx9Var.z0.indexOfKey(i) >= 0) {
                        return 4;
                    }
                    if (tx9Var.A0.indexOfKey(i) >= 0) {
                        return 5;
                    }
                    if (i == tx9Var.w) {
                        return 6;
                    }
                    if (tx9Var.x0.indexOfKey(i) < 0 && i != tx9Var.f && i != tx9Var.E && i != tx9Var.n && i != tx9Var.h && i != tx9Var.y) {
                        if (i == tx9Var.x) {
                            return 8;
                        }
                        return 3;
                    }
                    return 0;
                }
                return 3;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.s49 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw9.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        px8 px8Var;
        int o;
        tx9 tx9Var = this.c;
        int i2 = tx9Var.a0;
        wjb wjbVar = tx9Var.a1;
        boolean z = false;
        if (i == 0) {
            Context context = tx9Var.getContext();
            if (i2 == 6) {
                z = true;
            }
            px8Var = new zw9(tx9Var, context, z);
        } else if (i == 2) {
            px8Var = new ImageView(tx9Var.getContext());
        } else if (i != 3 && i != 1 && i != 8) {
            if (i == 4) {
                Context context2 = tx9Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (tx9Var.h1) {
                    o = bkb.v(tx9Var.g1, bkb.p1(0.4f, bkb.w0(null, bkb.c6, false)));
                } else {
                    o = bm2.o(bkb.w0(null, bkb.Kf, false), 99);
                }
                if (tx9Var.h1) {
                    textView.setBackground(bkb.b0(gl.L(11.0f), o));
                } else {
                    ShapeDrawable b0 = bkb.b0(gl.L(11.0f), o);
                    vkb g = zkb.g(bkb.Kf, 99);
                    textView.setBackground(b0);
                    zkb.j(textView, b0, g, null, null);
                }
                textView.setTypeface(gl.o());
                textView.setPadding(gl.L(4.0f), gl.L(1.66f), gl.L(4.0f), gl.L(2.0f));
                frameLayout.addView(textView, nme.e(-2, -2, 17));
                px8Var = frameLayout;
            } else if (i == 5) {
                ?? frameLayout2 = new FrameLayout(tx9Var.getContext());
                ri riVar = new ri(frameLayout2.getContext(), false, false, false, (byte) 3);
                frameLayout2.b = riVar;
                riVar.b(0.3f, 250L, s33.h);
                riVar.setTextSize(gl.L(14.0f));
                riVar.setTypeface(gl.o());
                zkb.U(riVar, bkb.Ii, wjbVar);
                riVar.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.a = frameLayout3;
                int i3 = bkb.Ei;
                ff0 e = sjb.e(bkb.v0(i3, wjbVar), 8.0f);
                vkb M = zkb.M(i3);
                vkb e2 = zkb.e(i3);
                frameLayout3.setBackground(e);
                zkb.j(frameLayout3, e, M, e2, wjbVar);
                frameLayout3.addView(riVar, nme.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, nme.c(-1.0f, -1));
                ah8 ah8Var = new ah8(wjbVar, frameLayout2.getContext(), false);
                frameLayout2.c = ah8Var;
                ah8Var.setIcon(2131624309);
                frameLayout2.addView(ah8Var, nme.c(-1.0f, -1));
                px8Var = frameLayout2;
            } else if (i == 6) {
                px8 px8Var2 = new px8(tx9Var.getContext(), (byte) 1);
                px8Var2.setTextSize(1, 13.0f);
                if (i2 == 3) {
                    px8Var2.setText(k96.M0(2131745456, null));
                } else if (i2 != 0 && i2 != 12 && i2 != 9 && i2 != 10) {
                    px8Var2.setText(k96.M0(2131746187, null));
                } else {
                    px8Var2.setText(k96.M0(2131751164, null));
                }
                px8Var2.setGravity(17);
                zkb.X(px8Var2, bkb.x6, wjbVar);
                px8Var = px8Var2;
            } else if (i == 7) {
                View wh4Var = new wh4(tx9Var.getContext(), 52, (byte) 0);
                wh4Var.setTag("searchbox");
                px8Var = wh4Var;
            } else {
                px8Var = new dx9(tx9Var, tx9Var.getContext());
            }
        } else {
            dx9 dx9Var = new dx9(tx9Var, tx9Var.getContext());
            if (i == 8) {
                dx9Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(dx9Var);
                dx9Var.h = imageReceiver;
                dx9Var.r = imageReceiver;
                imageReceiver.g0(tx9Var.O);
                tx9Var.P = dx9Var;
                dx9Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            }
            px8Var = dx9Var;
        }
        if (tx9Var.g()) {
            px8Var.setScaleX(0.0f);
            px8Var.setScaleY(0.0f);
        }
        return new s49(px8Var);
    }
}
