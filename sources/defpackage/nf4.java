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
public final class nf4 extends ka {
    public final Context d;
    public final qf4 e;

    public nf4(qf4 qf4Var, Context context) {
        this.e = qf4Var;
        this.d = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        gf4 gf4Var = (gf4) this.e.Q.get(i);
        if (gf4Var == null) {
            return 3;
        }
        return gf4Var.a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        String M0;
        String M02;
        int i2;
        int i3;
        int i4;
        qf4 qf4Var = this.e;
        ArrayList arrayList = qf4Var.Q;
        gf4 gf4Var = (gf4) arrayList.get(i);
        if (gf4Var != null) {
            int i5 = i + 1;
            boolean z2 = false;
            if (i5 < arrayList.size() && (i4 = ((gf4) arrayList.get(i5)).a) != 3 && i4 != 6) {
                z = true;
            } else {
                z = false;
            }
            int i6 = u69Var.f;
            View view = u69Var.a;
            if (i6 != 0) {
                if (i6 != 1) {
                    int i7 = -1;
                    if (i6 != 4) {
                        switch (i6) {
                            case 6:
                                ((njb) view).setText(gf4Var.d);
                                return;
                            case 7:
                                ((kf4) view).e(gf4Var.m, z);
                                return;
                            case 8:
                                ye4 ye4Var = (ye4) view;
                                if (ye4Var.c != z) {
                                    ye4Var.c = z;
                                    ye4Var.setWillNotDraw(!z);
                                    return;
                                }
                                return;
                            case 9:
                                ef4 ef4Var = (ef4) view;
                                qf4Var.J = ef4Var;
                                ef4Var.e(gn.cloneSpans(qf4Var.x, -1, ef4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                                ef4 ef4Var2 = qf4Var.J;
                                if (qf4Var.getUserConfig().p()) {
                                    i7 = qf4Var.F;
                                }
                                ef4Var2.d(i7, false);
                                qf4Var.J.setText(jb6.M0(2131750554, null));
                                return;
                            case 10:
                                z28 z28Var = (z28) view;
                                z28Var.setCloseAsLock(!qf4Var.getUserConfig().p());
                                if (qf4Var.getUserConfig().p()) {
                                    i7 = qf4Var.F;
                                }
                                z28Var.a(i7, false);
                                z28Var.setOnColorClick(new qy1(this, z28Var, (byte) 21));
                                return;
                            case 11:
                                ff4 ff4Var = (ff4) view;
                                qf4Var.K = ff4Var;
                                ff4Var.setText(gf4Var.d);
                                rj rjVar = ff4Var.r;
                                rjVar.setText(gf4Var.e);
                                rjVar.setOnClickListener(gf4Var.c);
                                return;
                            default:
                                return;
                        }
                    }
                    we4 we4Var = (we4) view;
                    boolean z3 = gf4Var.l;
                    ImageView imageView = we4Var.a;
                    TextView textView = we4Var.b;
                    if (z3) {
                        i2 = cmb.p7;
                    } else {
                        i2 = cmb.n6;
                    }
                    anb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
                    if (z3) {
                        i3 = cmb.o7;
                    } else {
                        i3 = cmb.p6;
                    }
                    anb.X(textView, i3, null);
                    int i8 = gf4Var.k;
                    String str = gf4Var.d;
                    ImageView imageView2 = we4Var.a;
                    if (!jb6.a0) {
                        i7 = 1;
                    }
                    if (i8 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i8);
                    }
                    float f = 72.0f;
                    if (jb6.a0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i8 == 0) {
                            f = 24.0f;
                        }
                        marginLayoutParams.rightMargin = gm.L(f);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i8 == 0) {
                            f = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = gm.L(f);
                    }
                    textView.setText(str);
                    if (!z && i8 != 0) {
                        z2 = true;
                    }
                    Boolean bool = we4Var.e;
                    if (bool == null || bool.booleanValue() != z2) {
                        we4Var.e = Boolean.valueOf(z2);
                        float f2 = 0.0f;
                        if (we4Var.c == i8) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z2) {
                                f2 = gm.L(i7 * (-7));
                            }
                            animate.translationX(f2).setDuration(180L).setInterpolator(d53.h).start();
                        } else {
                            if (z2) {
                                f2 = gm.L(i7 * (-7));
                            }
                            textView.setTranslationX(f2);
                        }
                    }
                    we4Var.d = z;
                    we4Var.setWillNotDraw(!z);
                    we4Var.c = i8;
                    return;
                }
                w8c w8cVar = (w8c) view;
                String str2 = gf4Var.i;
                if (str2 != null) {
                    w8cVar.d(str2, gf4Var.d, null, z);
                    return;
                }
                long j = gf4Var.h;
                if (j > 0) {
                    TLRPC.User W1 = qf4Var.getMessagesController().W1(Long.valueOf(j));
                    if (W1 != null) {
                        if (W1.bot) {
                            M02 = jb6.M0(2131753121, null);
                        } else if (W1.contact) {
                            M02 = jb6.M0(2131750729, null);
                        } else {
                            M02 = jb6.M0(2131750656, null);
                        }
                        w8cVar.d(W1, null, M02, z);
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = qf4Var.getMessagesController().L0(Long.valueOf(-j));
                if (L0 != null) {
                    if (sd2.Y(L0)) {
                        M0 = jb6.M0(2131751927, null);
                    } else if (L0.participants_count != 0) {
                        boolean V = sd2.V(L0);
                        int i9 = L0.participants_count;
                        if (V) {
                            M0 = jb6.H(',', "Subscribers", i9);
                        } else {
                            M0 = jb6.H(',', "Members", i9);
                        }
                    } else if (!sd2.t0(L0)) {
                        if (sd2.T(L0) && !L0.megagroup) {
                            M0 = jb6.M0(2131752271, null);
                        } else {
                            M0 = jb6.M0(2131748398, null);
                        }
                    } else if (sd2.T(L0) && !L0.megagroup) {
                        M0 = jb6.M0(2131752260, null);
                    } else {
                        M0 = jb6.M0(2131748395, null);
                    }
                    w8cVar.d(L0, null, M0, z);
                    return;
                }
                return;
            }
            jf5 jf5Var = (jf5) view;
            boolean z4 = gf4Var.f;
            String str3 = gf4Var.d;
            if (z4) {
                jf5Var.setText(qf4.E0(0, str3, false));
            } else {
                jf5Var.setText(str3);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar;
        int i2;
        w8c w8cVar;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        ylb ylbVar2;
        ylb ylbVar3;
        int i7 = 24;
        Context context = this.d;
        qf4 qf4Var = this.e;
        switch (i) {
            case 0:
                w8cVar = new jf5(context, 22);
                break;
            case 1:
                w8c w8cVar2 = new w8c(context, 6, 0, false);
                w8cVar2.setSelfAsSavedMessages(true);
                w8cVar = w8cVar2;
                break;
            case 2:
                String M0 = jb6.M0(2131750669, null);
                ylbVar = ((d) qf4Var).resourceProvider;
                ?? gu3Var = new gu3(this.d, (ela) qf4Var.fragmentView, M0, false, 12, ylbVar);
                qf4Var.L = gu3Var;
                gu3Var.r = false;
                gu3Var.s = true;
                du3 du3Var = gu3Var.b;
                du3Var.getEditText().setEmojiColor(Integer.valueOf(qf4Var.getThemedColor(cmb.Ei)));
                du3Var.setEmojiViewCacheType(25);
                du3Var.setText(qf4Var.x);
                i2 = ((d) qf4Var).currentAccount;
                vm.r(i2, qf4Var.y);
                qu3 editText = du3Var.getEditText();
                editText.addTextChangedListener(new fj());
                editText.addTextChangedListener(new b7(this, (byte) 24));
                editText.setPadding(gm.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                du3Var.getEditText().setImeOptions(268435462);
                w8cVar = gu3Var;
                break;
            case 3:
                w8cVar = new bba(context, (hg9) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i8 = 3;
                if (jb6.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                frameLayout.addView(imageView, qoe.d(24, 24.0f, i3 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                if (jb6.a0) {
                    i4 = 24;
                    i7 = 0;
                } else {
                    i4 = 0;
                }
                textView.setPadding(i4, 0, i7, 0);
                if (jb6.a0) {
                    i8 = 5;
                }
                textView.setGravity(i8);
                boolean z = jb6.a0;
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
                frameLayout.addView(textView, qoe.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
                w8cVar = frameLayout;
                break;
            case 5:
                yd ydVar = new yd(context, (byte) 21);
                ?? imageView2 = new ImageView(context);
                ydVar.b = imageView2;
                imageView2.f(2131624016, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                ydVar.addView((View) imageView2, qoe.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new sf3(ydVar, (byte) 14));
                w8cVar = ydVar;
                break;
            case 6:
            default:
                w8cVar = new njb(context);
                break;
            case 7:
                i5 = ((d) qf4Var).currentAccount;
                w8cVar = new mf4(this, this.d, qf4Var, i5, qf4Var.r.a);
                break;
            case 8:
                w8cVar = new ye4(context);
                break;
            case 9:
                w8cVar = new ef4(qf4Var, context);
                break;
            case 10:
                Activity parentActivity = qf4Var.getParentActivity();
                i6 = ((d) qf4Var).currentAccount;
                ylbVar2 = ((d) qf4Var).resourceProvider;
                w8cVar = new z28(2, i6, ylbVar2, parentActivity);
                break;
            case 11:
                ylbVar3 = ((d) qf4Var).resourceProvider;
                w8cVar = new ff4(context, ylbVar3);
                break;
        }
        return new u69(w8cVar);
    }

    @Override
    public final void y(u69 u69Var) {
        int i = u69Var.f;
        if (i != 2 && i == 9) {
            qf4 qf4Var = this.e;
            ((ef4) u69Var.a).e(gn.cloneSpans(qf4Var.x, -1, qf4Var.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(u69 u69Var) {
        if (u69Var.f == 2) {
            gu3 gu3Var = (gu3) u69Var.a;
            gu3Var.b.k(true);
            gu3Var.b.d();
        }
    }
}
