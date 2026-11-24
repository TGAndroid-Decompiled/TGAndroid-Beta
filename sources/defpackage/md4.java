package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class md4 extends ka {
    public final Context d;
    public final pd4 e;

    public md4(pd4 pd4Var, Context context) {
        this.e = pd4Var;
        this.d = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 0 && i != 2 && i != 5 && i != 9 && i != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.Q.size();
    }

    @Override
    public final int d(int i) {
        gd4 gd4Var = (gd4) this.e.Q.get(i);
        if (gd4Var == null) {
            return 3;
        }
        return gd4Var.a;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        String M0;
        String M02;
        int i2;
        int i3;
        int i4;
        pd4 pd4Var = this.e;
        ArrayList arrayList = pd4Var.Q;
        gd4 gd4Var = (gd4) arrayList.get(i);
        if (gd4Var != null) {
            int i5 = i + 1;
            boolean z2 = false;
            if (i5 < arrayList.size() && (i4 = ((gd4) arrayList.get(i5)).a) != 3 && i4 != 6) {
                z = true;
            } else {
                z = false;
            }
            int i6 = s49Var.f;
            View view = s49Var.a;
            if (i6 != 0) {
                if (i6 != 1) {
                    int i7 = -1;
                    if (i6 != 4) {
                        switch (i6) {
                            case 6:
                                ((mhb) view).setText(gd4Var.d);
                                return;
                            case 7:
                                ((jd4) view).e(gd4Var.m, z);
                                return;
                            case 8:
                                yc4 yc4Var = (yc4) view;
                                if (yc4Var.c != z) {
                                    yc4Var.c = z;
                                    yc4Var.setWillNotDraw(!z);
                                    return;
                                }
                                return;
                            case 9:
                                ed4 ed4Var = (ed4) view;
                                pd4Var.J = ed4Var;
                                ed4Var.e(gm.cloneSpans(pd4Var.x, -1, ed4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                                ed4 ed4Var2 = pd4Var.J;
                                if (pd4Var.getUserConfig().p()) {
                                    i7 = pd4Var.F;
                                }
                                ed4Var2.d(i7, false);
                                pd4Var.J.setText(k96.M0(2131750605, null));
                                return;
                            case 10:
                                w08 w08Var = (w08) view;
                                w08Var.setCloseAsLock(!pd4Var.getUserConfig().p());
                                if (pd4Var.getUserConfig().p()) {
                                    i7 = pd4Var.F;
                                }
                                w08Var.a(i7, false);
                                w08Var.setOnColorClick(new pz1(this, w08Var, (byte) 20));
                                return;
                            case 11:
                                fd4 fd4Var = (fd4) view;
                                pd4Var.K = fd4Var;
                                fd4Var.setText(gd4Var.d);
                                ri riVar = fd4Var.r;
                                riVar.setText(gd4Var.e);
                                riVar.setOnClickListener(gd4Var.c);
                                return;
                            default:
                                return;
                        }
                    }
                    wc4 wc4Var = (wc4) view;
                    boolean z3 = gd4Var.l;
                    ImageView imageView = wc4Var.a;
                    TextView textView = wc4Var.b;
                    if (z3) {
                        i2 = bkb.p7;
                    } else {
                        i2 = bkb.n6;
                    }
                    zkb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
                    if (z3) {
                        i3 = bkb.o7;
                    } else {
                        i3 = bkb.p6;
                    }
                    zkb.X(textView, i3, null);
                    int i8 = gd4Var.k;
                    String str = gd4Var.d;
                    ImageView imageView2 = wc4Var.a;
                    if (!k96.a0) {
                        i7 = 1;
                    }
                    if (i8 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i8);
                    }
                    float f = 72.0f;
                    if (k96.a0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i8 == 0) {
                            f = 24.0f;
                        }
                        marginLayoutParams.rightMargin = gl.L(f);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i8 == 0) {
                            f = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = gl.L(f);
                    }
                    textView.setText(str);
                    if (!z && i8 != 0) {
                        z2 = true;
                    }
                    Boolean bool = wc4Var.e;
                    if (bool == null || bool.booleanValue() != z2) {
                        wc4Var.e = Boolean.valueOf(z2);
                        float f2 = 0.0f;
                        if (wc4Var.c == i8) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z2) {
                                f2 = gl.L(i7 * (-7));
                            }
                            animate.translationX(f2).setDuration(180L).setInterpolator(s33.h).start();
                        } else {
                            if (z2) {
                                f2 = gl.L(i7 * (-7));
                            }
                            textView.setTranslationX(f2);
                        }
                    }
                    wc4Var.d = z;
                    wc4Var.setWillNotDraw(!z);
                    wc4Var.c = i8;
                    return;
                }
                v6c v6cVar = (v6c) view;
                String str2 = gd4Var.i;
                if (str2 != null) {
                    v6cVar.d(str2, gd4Var.d, null, z);
                    return;
                }
                long j = gd4Var.h;
                if (j > 0) {
                    TLRPC.User V1 = pd4Var.getMessagesController().V1(Long.valueOf(j));
                    if (V1 != null) {
                        if (V1.bot) {
                            M02 = k96.M0(2131753153, null);
                        } else if (V1.contact) {
                            M02 = k96.M0(2131750780, null);
                        } else {
                            M02 = k96.M0(2131750707, null);
                        }
                        v6cVar.d(V1, null, M02, z);
                        return;
                    }
                    return;
                }
                TLRPC.Chat K0 = pd4Var.getMessagesController().K0(Long.valueOf(-j));
                if (K0 != null) {
                    if (hc2.Y(K0)) {
                        M0 = k96.M0(2131751978, null);
                    } else if (K0.participants_count != 0) {
                        boolean V = hc2.V(K0);
                        int i9 = K0.participants_count;
                        if (V) {
                            M0 = k96.H(',', "Subscribers", i9);
                        } else {
                            M0 = k96.H(',', "Members", i9);
                        }
                    } else if (!hc2.t0(K0)) {
                        if (hc2.T(K0) && !K0.megagroup) {
                            M0 = k96.M0(2131752317, null);
                        } else {
                            M0 = k96.M0(2131748449, null);
                        }
                    } else if (hc2.T(K0) && !K0.megagroup) {
                        M0 = k96.M0(2131752306, null);
                    } else {
                        M0 = k96.M0(2131748446, null);
                    }
                    v6cVar.d(K0, null, M0, z);
                    return;
                }
                return;
            }
            ld5 ld5Var = (ld5) view;
            boolean z4 = gd4Var.f;
            String str3 = gd4Var.d;
            if (z4) {
                ld5Var.setText(pd4.D0(0, str3, false));
            } else {
                ld5Var.setText(str3);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        int i2;
        v6c v6cVar;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        wjb wjbVar2;
        wjb wjbVar3;
        Context context = this.d;
        pd4 pd4Var = this.e;
        switch (i) {
            case 0:
                v6cVar = new ld5(context, 22);
                break;
            case 1:
                v6c v6cVar2 = new v6c(context, 6, 0, false);
                v6cVar2.setSelfAsSavedMessages(true);
                v6cVar = v6cVar2;
                break;
            case 2:
                String M0 = k96.M0(2131750720, null);
                wjbVar = ((d) pd4Var).resourceProvider;
                ?? ws3Var = new ws3(this.d, (cja) pd4Var.fragmentView, M0, false, 12, wjbVar);
                pd4Var.L = ws3Var;
                ws3Var.r = false;
                ws3Var.s = true;
                ts3 ts3Var = ws3Var.b;
                ts3Var.getEditText().setEmojiColor(Integer.valueOf(pd4Var.getThemedColor(bkb.Ei)));
                ts3Var.setEmojiViewCacheType(25);
                ts3Var.setText(pd4Var.x);
                i2 = ((d) pd4Var).currentAccount;
                vl.r(i2, pd4Var.y);
                gt3 editText = ts3Var.getEditText();
                editText.addTextChangedListener(new fi());
                editText.addTextChangedListener(new b7(this, (byte) 23));
                editText.setPadding(gl.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                ts3Var.getEditText().setImeOptions(268435462);
                v6cVar = ws3Var;
                break;
            case 3:
                v6cVar = new b9a(context, (de9) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i7 = 3;
                if (k96.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                frameLayout.addView(imageView, nme.d(24, 24.0f, i3 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                int i8 = 24;
                if (k96.a0) {
                    i4 = 24;
                    i8 = 0;
                } else {
                    i4 = 0;
                }
                textView.setPadding(i4, 0, i8, 0);
                if (k96.a0) {
                    i7 = 5;
                }
                textView.setGravity(i7);
                boolean z = k96.a0;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 72.0f;
                }
                if (z) {
                    f2 = 72.0f;
                } else {
                    f2 = 0.0f;
                }
                frameLayout.addView(textView, nme.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
                v6cVar = frameLayout;
                break;
            case 5:
                yc ycVar = new yc(context, (byte) 21);
                ?? imageView2 = new ImageView(context);
                ycVar.b = imageView2;
                imageView2.f(2131624016, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                ycVar.addView((View) imageView2, nme.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new yj3(ycVar, (byte) 11));
                v6cVar = ycVar;
                break;
            case 6:
            default:
                v6cVar = new mhb(context);
                break;
            case 7:
                i5 = ((d) pd4Var).currentAccount;
                v6cVar = new ld4(this, this.d, pd4Var, i5, pd4Var.r.a);
                break;
            case 8:
                v6cVar = new yc4(context);
                break;
            case 9:
                v6cVar = new ed4(pd4Var, context);
                break;
            case 10:
                Activity parentActivity = pd4Var.getParentActivity();
                i6 = ((d) pd4Var).currentAccount;
                wjbVar2 = ((d) pd4Var).resourceProvider;
                v6cVar = new w08(2, i6, wjbVar2, parentActivity);
                break;
            case 11:
                wjbVar3 = ((d) pd4Var).resourceProvider;
                v6cVar = new fd4(context, wjbVar3);
                break;
        }
        return new s49(v6cVar);
    }

    @Override
    public final void y(s49 s49Var) {
        int i = s49Var.f;
        if (i != 2 && i == 9) {
            pd4 pd4Var = this.e;
            ((ed4) s49Var.a).e(gm.cloneSpans(pd4Var.x, -1, pd4Var.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s49 s49Var) {
        if (s49Var.f == 2) {
            ws3 ws3Var = (ws3) s49Var.a;
            ws3Var.b.k(true);
            ws3Var.b.d();
        }
    }
}
